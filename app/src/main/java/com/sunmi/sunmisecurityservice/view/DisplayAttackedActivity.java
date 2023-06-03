package com.sunmi.sunmisecurityservice.view;

import android.app.ActivityManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice.base.MVPBaseActivity;
import com.sunmi.sunmisecurityservice.log.EnumTamperLogUploadStatus;
import com.sunmi.sunmisecurityservice.log.SLSHelp;
import com.sunmi.sunmisecurityservice.model.Tuple;
import com.sunmi.sunmisecurityservice.model.entity.AlarmReason;
import com.sunmi.sunmisecurityservice.presenter.impl.AuthCodePresenterImpl;
import com.sunmi.sunmisecurityservice.util.DeviceUtils;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import com.sunmi.sunmisecurityservice.util.NetWorkCenterUtils;
import com.sunmi.sunmisecurityservice.view.WifiConnectView;
import com.sunmi.sunmisecurityservice.view.adapter.CheckAdapter;
import com.sunmi.sunmisecurityservice.view.widget.GridPasswordView;
import com.sunmi.sunmisecurityservice_v3.R;
import java.util.List;

/* loaded from: classes.dex */
public class DisplayAttackedActivity extends MVPBaseActivity<AuthCodeCallback, AuthCodePresenterImpl> implements AuthCodeCallback, WifiConnectView.OnWifiConnectViewWidgetClickListener {
    private static final int MAX_CLICK_INTERVAL = 800;
    private static final String TAG = "DisplayAttackedActivity";
    private static final int TRAPDOOR_THRESHOLD = 7;
    private RelativeLayout attackLayout;
    private ScrollView authCodeLayout;
    private RelativeLayout checkLayout;
    private GridPasswordView gridPasswordView;
    private ImageView imageView;
    private int mClickCount = 0;
    private long mLastClickTime;
    private WindowManager mWindowManager;
    private TextView noticeTextView;
    private TextView typeTextView;
    private WifiConnectView wifiConnectView;
    private WindowManager.LayoutParams wmParams;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sunmi.sunmisecurityservice.base.MVPBaseActivity
    public AuthCodePresenterImpl createPresenter() {
        return new AuthCodePresenterImpl(2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sunmi.sunmisecurityservice.base.MVPBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        initParams();
        initView();
    }

    private void initParams() {
        this.mWindowManager = (WindowManager) getSystemService("window");
        this.wmParams = new WindowManager.LayoutParams();
        if (Build.VERSION.SDK_INT >= 26) {
            this.wmParams.type = 2038;
        } else {
            this.wmParams.type = 2028;
        }
        WindowManager.LayoutParams layoutParams = this.wmParams;
        layoutParams.format = 1;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.flags = 524416;
        if (isLandscape()) {
            this.wmParams.flags |= 131072;
        }
    }

    private boolean isLandscape() {
        return getResources().getConfiguration().orientation == 2;
    }

    private void initView() {
        this.attackLayout = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.activity_display_attacked, (ViewGroup) null);
        this.attackLayout.findViewById(R.id.rl_trapdoor).setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.DisplayAttackedActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DisplayAttackedActivity.this.trapdoorFunction();
            }
        });
        this.mWindowManager.addView(this.attackLayout, this.wmParams);
        this.authCodeLayout = (ScrollView) LayoutInflater.from(this).inflate(R.layout.view_authcode, (ViewGroup) null);
        this.imageView = (ImageView) this.authCodeLayout.findViewById(R.id.img_authcode_type);
        this.typeTextView = (TextView) this.authCodeLayout.findViewById(R.id.tv_authcode_type);
        this.noticeTextView = (TextView) this.authCodeLayout.findViewById(R.id.tv_notice_message);
        this.imageView.setImageResource(R.mipmap.icon);
        this.typeTextView.setText(R.string.input_authcode_hint);
        this.gridPasswordView = (GridPasswordView) this.authCodeLayout.findViewById(R.id.gpv_customUi);
        this.gridPasswordView.setPasswordVisibility(true);
        this.gridPasswordView.setOnPasswordChangedListener(new GridPasswordView.OnPasswordChangedListener() { // from class: com.sunmi.sunmisecurityservice.view.DisplayAttackedActivity.2
            @Override // com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.OnPasswordChangedListener
            public void onTextChanged(String str) {
                if (str.length() < 4) {
                    DisplayAttackedActivity.this.noticeTextView.setText("");
                }
            }

            @Override // com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.OnPasswordChangedListener
            public void onInputFinish(String str) {
                ((AuthCodePresenterImpl) DisplayAttackedActivity.this.mPresenter).checkAuthCodeByCloud(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void trapdoorFunction() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.mLastClickTime;
        LogUtil.e(TAG, "currentClickTime:" + elapsedRealtime + ",mLastClickTime:" + this.mLastClickTime + ",elapsedTime:" + j);
        this.mLastClickTime = elapsedRealtime;
        if (j <= 800) {
            this.mClickCount++;
            LogUtil.e(TAG, "click trapdoor, count:" + this.mClickCount);
            if (this.mClickCount == 7) {
                LogUtil.e(TAG, "detect trapdoor triggered...");
                updateViewToCheck();
                return;
            }
            return;
        }
        this.mClickCount = 1;
        LogUtil.e(TAG, "reset trapdoor, count:" + this.mClickCount);
    }

    private void updateViewToCheck() {
        LogUtil.e(TAG, "updateViewToCheck...");
        this.checkLayout = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.view_attack_check, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) this.checkLayout.findViewById(R.id.rlv_check);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, 1));
        Tuple<List<AlarmReason>, String> alarmReason = ((AuthCodePresenterImpl) this.mPresenter).getAlarmReason();
        ((TextView) this.checkLayout.findViewById(R.id.tv_errorcode)).setText(getString(R.string.status_code) + alarmReason.b);
        ((TextView) this.checkLayout.findViewById(R.id.tv_sn)).setText("SN: " + DeviceUtils.getMSN());
        recyclerView.setAdapter(new CheckAdapter(this, alarmReason.a));
        this.mWindowManager.removeView(this.attackLayout);
        this.mWindowManager.addView(this.checkLayout, this.wmParams);
        ((Button) this.checkLayout.findViewById(R.id.btn_close)).setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.DisplayAttackedActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DisplayAttackedActivity.this.showShutdownDlg();
            }
        });
        ((Button) this.checkLayout.findViewById(R.id.btn_clear)).setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.DisplayAttackedActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DisplayAttackedActivity.this.handleClearBtnClick();
            }
        });
        LogUtil.e(TAG, "updateViewToCheck finished.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleClearBtnClick() {
        if (NetWorkCenterUtils.isNetworkConnected()) {
            this.mWindowManager.removeView(this.checkLayout);
            WindowManager.LayoutParams layoutParams = this.wmParams;
            layoutParams.softInputMode = 5;
            this.mWindowManager.addView(this.authCodeLayout, layoutParams);
            if (DeviceUtils.getTamperLogUploadStatus() != EnumTamperLogUploadStatus.UPLOAD_STATUS_SUCCESS.getValue()) {
                SLSHelp.getInstance().doUploadSLSLog();
                return;
            }
            return;
        }
        this.mWindowManager.removeView(this.checkLayout);
        this.wifiConnectView = new WifiConnectView(this);
        this.wifiConnectView.setWidgetClickListener(this);
        WindowManager.LayoutParams layoutParams2 = this.wmParams;
        layoutParams2.softInputMode = 16;
        this.mWindowManager.addView(this.wifiConnectView, layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showShutdownDlg() {
        AlertDialog create = new AlertDialog.Builder(this).setTitle(R.string.confirm_shutdown).setPositiveButton(R.string.confirm_yes, new DialogInterface.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.DisplayAttackedActivity.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(Build.VERSION.SDK_INT >= 26 ? "com.android.internal.intent.action.REQUEST_SHUTDOWN" : "android.intent.action.ACTION_REQUEST_SHUTDOWN");
                intent.putExtra("android.intent.extra.KEY_CONFIRM", false);
                intent.setFlags(268435456);
                DisplayAttackedActivity.this.startActivity(intent);
                dialogInterface.dismiss();
                DisplayAttackedActivity.this.mWindowManager.removeView(DisplayAttackedActivity.this.checkLayout);
                DisplayAttackedActivity.this.finish();
            }
        }).setNegativeButton(R.string.confirm_cancel, new DialogInterface.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.view.DisplayAttackedActivity.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).create();
        if (Build.VERSION.SDK_INT >= 26) {
            create.getWindow().setType(2038);
        } else {
            create.getWindow().setType(2010);
        }
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sunmi.sunmisecurityservice.base.MVPBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.sunmi.sunmisecurityservice.view.AuthCodeCallback
    public void onCheckAuthCode() {
        this.noticeTextView.setText(R.string.pro_check_code);
    }

    @Override // com.sunmi.sunmisecurityservice.view.AuthCodeCallback
    public void onAuthCodeCheckSuccess() {
        this.mWindowManager.removeView(this.authCodeLayout);
        finishAndRemoveTask();
        DeviceUtils.rebootDevice(this);
    }

    @Override // com.sunmi.sunmisecurityservice.view.AuthCodeCallback
    public void onAuthCodeCheckFail(String str) {
        this.noticeTextView.setText(str);
    }

    @Override // com.sunmi.sunmisecurityservice.view.WifiConnectView.OnWifiConnectViewWidgetClickListener
    public void onBackClick() {
        this.mWindowManager.removeView(this.wifiConnectView);
        this.mWindowManager.addView(this.checkLayout, this.wmParams);
    }

    @Override // com.sunmi.sunmisecurityservice.view.WifiConnectView.OnWifiConnectViewWidgetClickListener
    public void onNextClick() {
        this.mWindowManager.removeView(this.wifiConnectView);
        WindowManager.LayoutParams layoutParams = this.wmParams;
        layoutParams.softInputMode = 5;
        this.mWindowManager.addView(this.authCodeLayout, layoutParams);
        if (DeviceUtils.getTamperLogUploadStatus() != EnumTamperLogUploadStatus.UPLOAD_STATUS_SUCCESS.getValue()) {
            SLSHelp.getInstance().doUploadSLSLog();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.e(TAG, "detected onPause called,force bring task to foreground.");
        ((ActivityManager) getApplicationContext().getSystemService("activity")).moveTaskToFront(getTaskId(), 0);
    }
}
