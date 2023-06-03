package com.sunmi.sunmisecurityservice.log;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.sunmi.baseservice.IBaseServiceCallbackInterface;
import com.sunmi.baseservice.IBaseServiceInterface;
import com.sunmi.logservice.aidl.AidlErrorCode;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import com.sunmi.sunmisecurityservice.util.DeviceUtils;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import com.sunmi.sunmisecurityservice.util.NetWorkCenterUtils;
import com.sunmi.sunmisecurityservice.util.SharedPreferencesUtil;
import com.sunmi.sunmisecurityservice.util.ThreadPoolManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SLSHelp {
    private static final int DELAY_TIME_30_SECONDS = 30000;
    private static final int MAX_RETRY_COUNT_3 = 3;
    private static final String TAG = "SLSHelp";
    private int curRetryCount;

    static /* synthetic */ int access$308(SLSHelp sLSHelp) {
        int i = sLSHelp.curRetryCount;
        sLSHelp.curRetryCount = i + 1;
        return i;
    }

    private SLSHelp() {
    }

    /* loaded from: classes.dex */
    private static class SingletonHolder {
        private static final SLSHelp INSTANCE = new SLSHelp();

        private SingletonHolder() {
        }
    }

    public static SLSHelp getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSLSLog() {
        LogUtil.e("TAG", "doSLSLog --->>");
        ThreadPoolManager.executeInSinglePool(new Runnable() { // from class: com.sunmi.sunmisecurityservice.log.SLSHelp.1
            @Override // java.lang.Runnable
            public void run() {
                if (NetWorkCenterUtils.isNetworkConnected()) {
                    LogUtil.e("TAG", "网络已连接");
                    if (MyApplication.app.getBaseService() != null && MyApplication.app.isBaseServiceConnect) {
                        SLSHelp.this.getLBSData(MyApplication.app.getBaseService());
                        return;
                    }
                    LogUtil.e("TAG", "BaseService未连接");
                    SLSHelp.this.doUploadSLSLog();
                    return;
                }
                LogUtil.e("TAG", "网络未连接");
                DeviceUtils.setTamperLogUploadStatus(EnumTamperLogUploadStatus.UPLOAD_STATUS_DEFAULT.getValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLBSData(IBaseServiceInterface iBaseServiceInterface) {
        if (iBaseServiceInterface != null) {
            try {
                iBaseServiceInterface.request("{\"type\":\"location\"}", new IBaseServiceCallbackInterface.Stub() { // from class: com.sunmi.sunmisecurityservice.log.SLSHelp.2
                    @Override // com.sunmi.baseservice.IBaseServiceCallbackInterface
                    public void response(String str) throws RemoteException {
                        LogUtil.e("TAG", str);
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                JSONObject jSONObject = new JSONObject(str);
                                String string = jSONObject.getString("mLatitude");
                                String string2 = jSONObject.getString("mLongitude");
                                JSONObject jSONObject2 = jSONObject.getJSONObject("mAddr");
                                String string3 = jSONObject2 != null ? jSONObject2.getString("address") : "";
                                if (!TextUtils.isEmpty(string) && !string.equals("4.9E-324") && !TextUtils.isEmpty(string2) && !string2.equals("4.9E-324")) {
                                    LogUtil.e("TAG", "\n" + string + "\n" + string2 + "\n" + string3);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append(",");
                                    sb.append(string2);
                                    SharedPreferencesUtil.saveString(SharedPreferencesUtil.KEY_SLS_LOG_LATITUDE_LONGITUDE, sb.toString());
                                }
                            }
                            SLSHelp.this.doUploadSLSLog();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void doUploadSLSLog() {
        LogUtil.e("TAG", "doUploadSLSLog --->>");
        ThreadPoolManager.executeInCachePool(new Runnable() { // from class: com.sunmi.sunmisecurityservice.log.SLSHelp.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.e("TAG", "doUploadSLSLog --->> curRetryCount = " + SLSHelp.this.curRetryCount);
                while (true) {
                    if (SLSHelp.this.curRetryCount >= 3) {
                        break;
                    }
                    LogUtil.e("TAG", "doUploadSLSLog inner --->> curRetryCount = " + SLSHelp.this.curRetryCount);
                    SLSHelp.access$308(SLSHelp.this);
                    if (SLSHelp.this.uploadSLSLog()) {
                        DeviceUtils.setTamperLogUploadStatus(EnumTamperLogUploadStatus.UPLOAD_STATUS_SUCCESS.getValue());
                        break;
                    }
                    DeviceUtils.setTamperLogUploadStatus(EnumTamperLogUploadStatus.UPLOAD_STATUS_FAIL.getValue());
                    try {
                        Thread.sleep(30000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                SLSHelp.this.curRetryCount = 0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uploadSLSLog() {
        Bundle bundle;
        LogUtil.e("TAG", "uploadSLSLog --->>");
        try {
            bundle = new Bundle();
            bundle.putString("type", "0");
            bundle.putString("sn", DeviceUtils.getMSN());
            bundle.putString("model", DeviceUtils.getDeviceModel());
            bundle.putString("ap_location", SharedPreferencesUtil.readString(SharedPreferencesUtil.KEY_SLS_LOG_LATITUDE_LONGITUDE, ""));
            bundle.putString("ap_time", DeviceUtils.getTime());
            bundle.putString("rom_ver", DeviceUtils.getRomVersion());
            bundle.putString("sp_cfg_ver", DeviceUtils.getCfgFileVersion());
            bundle.putString("sp_secure_status", DeviceUtils.getSecStatus() + "");
            bundle.putString("base_ver", DeviceUtils.getLibBaseVersion());
            bundle.putString("fw_ver", DeviceUtils.getFirmwareVersion());
            bundle.putString("hw_ver", DeviceUtils.getHardwareVersion());
            bundle.putString("tamper_log", DeviceUtils.getTamperLog());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (MyApplication.app.logOptBinder != null && MyApplication.app.isLogServiceConnect) {
            int addLog = MyApplication.app.logOptBinder.addLog(bundle);
            LogUtil.e("TAG", "logOptBinder.addLog --->> ret = " + addLog);
            return addLog == AidlErrorCode.LOG_PRODUCER_OK.getCode() || !(addLog == AidlErrorCode.LOG_PRODUCER_NETWORK_ERROR.getCode() || addLog == AidlErrorCode.LOG_PRODUCER_SERVER_ERROR.getCode() || addLog == AidlErrorCode.LOG_PRODUCER_CONNECT_TIMEOUT_EXCEPTION.getCode() || addLog == AidlErrorCode.LOG_PRODUCER_SOCKET_TIMEOUT_EXCEPTION.getCode());
        }
        LogUtil.e("TAG", "MyApplication.app.logOptBinder = null, log service is disconnected");
        return false;
    }
}
