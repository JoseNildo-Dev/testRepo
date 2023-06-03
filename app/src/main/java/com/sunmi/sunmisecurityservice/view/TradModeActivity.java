package com.sunmi.sunmisecurityservice.view;

import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.sunmi.pay.hardware.aidl.AidlConstants;
import com.sunmi.sunmisecurityservice.base.MVPBaseActivity;
import com.sunmi.sunmisecurityservice.presenter.impl.AuthCodePresenterImpl;
import com.sunmi.sunmisecurityservice.util.DeviceUtils;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import com.sunmi.sunmisecurityservice.view.widget.GridPasswordView;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class TradModeActivity extends MVPBaseActivity<AuthCodeCallback, AuthCodePresenterImpl> implements AuthCodeCallback {
    private static final String TAG = "TradModeActivity";
    private GridPasswordView gridPasswordView;
    private ImageView imageView;
    private String isDebugMode;
    private TextView noticeTextView;
    private String termStatus;
    private TextView typeTextView;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sunmi.sunmisecurityservice.base.MVPBaseActivity
    public AuthCodePresenterImpl createPresenter() {
        return new AuthCodePresenterImpl(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.sunmi.sunmisecurityservice.base.MVPBaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.view_authcode);
        this.isDebugMode = DeviceUtils.getDebugMode();
        this.termStatus = DeviceUtils.getTermStatus();
        initView();
        initListener();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.gridPasswordView.forceInputViewGetFocus();
        ((InputMethodManager) getSystemService("input_method")).showSoftInputFromInputMethod(this.gridPasswordView.mInputView.getWindowToken(), 2);
    }

    private void initView() {
        getWindow().addFlags(1024);
        this.gridPasswordView = (GridPasswordView) findViewById(R.id.gpv_customUi);
        this.gridPasswordView.setPasswordVisibility(true);
        this.noticeTextView = (TextView) findViewById(R.id.tv_notice_message);
        this.typeTextView = (TextView) findViewById(R.id.tv_authcode_type);
        this.imageView = (ImageView) findViewById(R.id.img_authcode_type);
        this.typeTextView.setText(getString(R.string.conversion_system_mode));
        this.imageView.setImageResource(R.mipmap.tradmode);
    }

    private void initListener() {
        this.gridPasswordView.setOnPasswordChangedListener(new GridPasswordView.OnPasswordChangedListener() { // from class: com.sunmi.sunmisecurityservice.view.TradModeActivity.1
            @Override // com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.OnPasswordChangedListener
            public void onTextChanged(String str) {
                if (str.length() < 4) {
                    TradModeActivity.this.noticeTextView.setText("");
                }
            }

            @Override // com.sunmi.sunmisecurityservice.view.widget.GridPasswordView.OnPasswordChangedListener
            public void onInputFinish(String str) {
                if (TradModeActivity.this.isDebugMode == null || TradModeActivity.this.termStatus == null) {
                    TradModeActivity.this.noticeTextView.setText(R.string.error_sp_hint);
                    TradModeActivity.this.isDebugMode = DeviceUtils.getDebugMode();
                    TradModeActivity.this.termStatus = DeviceUtils.getTermStatus();
                } else if ("Factory".equals(TradModeActivity.this.termStatus)) {
                    TradModeActivity.this.showToast((int) R.string.factory_forbid_swicth_debug);
                } else if (AidlConstants.Security.DEBUGMODE_YES.equals(TradModeActivity.this.isDebugMode)) {
                    LogUtil.e(TradModeActivity.TAG, "调试设备不允许切换为交易模式!");
                    TradModeActivity.this.showToast((int) R.string.toast_debug_mode);
                } else {
                    LogUtil.e(TradModeActivity.TAG, "授权码输入完毕，开始请求服务器校验:" + str);
                    ((AuthCodePresenterImpl) TradModeActivity.this.mPresenter).checkAuthCodeByCloud(str);
                }
            }
        });
    }

    @Override // com.sunmi.sunmisecurityservice.view.AuthCodeCallback
    public void onCheckAuthCode() {
        showProgress(getString(R.string.pro_check_code));
    }

    @Override // com.sunmi.sunmisecurityservice.view.AuthCodeCallback
    public void onAuthCodeCheckSuccess() {
        dismissProgress();
        this.noticeTextView.setText(R.string.preparing_mode_trsation);
        finishAndRemoveTask();
        DeviceUtils.resetDevice(this);
    }

    @Override // com.sunmi.sunmisecurityservice.view.AuthCodeCallback
    public void onAuthCodeCheckFail(String str) {
        dismissProgress();
        this.noticeTextView.setText(str);
    }
}
