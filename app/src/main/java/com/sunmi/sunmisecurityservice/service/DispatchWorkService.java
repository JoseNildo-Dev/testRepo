package com.sunmi.sunmisecurityservice.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.sunmi.sunmisecurityservice.app.BroadcastConstant;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import com.sunmi.sunmisecurityservice.log.EnumTamperLogUploadStatus;
import com.sunmi.sunmisecurityservice.log.SLSHelp;
import com.sunmi.sunmisecurityservice.util.DeviceUtils;
import com.sunmi.sunmisecurityservice.util.DispatchWorkHelper;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class DispatchWorkService extends Service implements MyApplication.OnServiceConnectListener {
    private static final String TAG = "DispatchWorkService";
    private Set<String> actionList = new HashSet();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.e(TAG, "start DispatchWorkService...");
        MyApplication.app.registerServiceConnectListener(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        MyApplication.app.unregisterServiceConnectListener(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        String stringExtra = intent.getStringExtra("extra_action");
        LogUtil.e(TAG, "收到的消息：" + stringExtra);
        this.actionList.add(stringExtra);
        if (MyApplication.app.isConnect) {
            handleDispatchWork();
        }
        return 2;
    }

    @Override // com.sunmi.sunmisecurityservice.app.MyApplication.OnServiceConnectListener
    public void onServiceConnect() {
        handleDispatchWork();
    }

    private void handleDispatchWork() {
        for (String str : this.actionList) {
            LogUtil.e(TAG, "dispatching task：" + str);
            if (!BroadcastConstant.ACTION_BOOT.equals(str)) {
                if (BroadcastConstant.ACTION_SECURE_ATTACKED.equals(str)) {
                    if (DeviceUtils.getTamperLogUploadStatus() == EnumTamperLogUploadStatus.UPLOAD_STATUS_DEFAULT.getValue()) {
                        LogUtil.e("TAG", "开始获取触发日志...");
                        DeviceUtils.setTamperLogUploadStatus(EnumTamperLogUploadStatus.UPLOAD_STATUS_FAIL.getValue());
                        SLSHelp.getInstance().doSLSLog();
                    }
                    DispatchWorkHelper.startDisplayAttackedView(this);
                } else if ("com.sunmi.sunmisecurityservice_v3".equals(str)) {
                    LogUtil.e(TAG, "服务端推送消息(更改模式)...");
                    DispatchWorkHelper.startChangeTradeMode(this);
                } else if (BroadcastConstant.ACTION_PASSWORD.equals(str)) {
                    LogUtil.e(TAG, "开机密码设置广播(首次开机)...");
                    DispatchWorkHelper.showNotification(this);
                } else if (!BroadcastConstant.ACTION_CLOCK.equals(str)) {
                    BroadcastConstant.ACTION_CHANGE_SN.equals(str);
                }
            }
        }
        this.actionList.clear();
    }
}
