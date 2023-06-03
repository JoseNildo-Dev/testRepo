package com.sunmi.sunmisecurityservice.wifi.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class WifiConnectDialog extends Dialog implements View.OnClickListener, TextWatcher {
    private static final String PASSWORD_REGEX = "[A-Z0-9a-z!@#$%^&*.~/\\{\\}|()'\"?><,.`\\+-=_\\[\\]:;]+";
    private String SSID;
    private boolean isShowPassword;
    private boolean isVisiblePwdError;
    private Context mContext;
    private EditText mEditText;
    private ImageView mIvPasswordVisible;
    private RelativeLayout mRelShow;
    private TextView mTvCancel;
    private TextView mTvConnect;
    private TextView mWifiSsid;
    private OnConnectOnClick onConnectOnClick;

    /* loaded from: classes.dex */
    public interface OnConnectOnClick {
        void cancel();

        void connect(String str, String str2);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public WifiConnectDialog(Context context, String str, OnConnectOnClick onConnectOnClick, boolean z) {
        super(context, R.style.defaultDialogStyle);
        this.mContext = context;
        this.SSID = str;
        this.onConnectOnClick = onConnectOnClick;
        this.isVisiblePwdError = z;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(18);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().setType(2038);
        } else {
            getWindow().setType(2010);
        }
        setContentView(R.layout.dialog_connect_wifi);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        initView();
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.sunmi.sunmisecurityservice.wifi.dialog.WifiConnectDialog.1
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) WifiConnectDialog.this.mEditText.getContext().getSystemService("input_method")).showSoftInput(WifiConnectDialog.this.mEditText, 0);
            }
        }, 0L);
    }

    private void initView() {
        this.mWifiSsid = (TextView) findViewById(R.id.wifi_ssid);
        this.mEditText = (EditText) findViewById(R.id.wifi_pwd_et);
        this.mIvPasswordVisible = (ImageView) findViewById(R.id.iv_password_visible);
        this.mTvConnect = (TextView) findViewById(R.id.tv_connect);
        this.mTvCancel = (TextView) findViewById(R.id.tv_cancel);
        this.mRelShow = (RelativeLayout) findViewById(R.id.rel_show);
        this.mEditText.requestFocus();
        this.mEditText.setFocusable(true);
        this.mWifiSsid.setText(this.SSID);
        if (this.isVisiblePwdError) {
            this.mEditText.setHint(this.mContext.getText(R.string.dialog_password_error));
        } else {
            this.mEditText.setHint(this.mContext.getText(R.string.dialog_password_input));
        }
        this.mTvCancel.setOnClickListener(this);
        this.mEditText.addTextChangedListener(this);
        this.mRelShow.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.rel_show) {
            showPassword();
        } else if (id == R.id.tv_cancel) {
            dismiss();
            this.onConnectOnClick.cancel();
        } else if (id != R.id.tv_connect) {
        } else {
            dismiss();
            this.onConnectOnClick.connect(this.mEditText.getText().toString(), this.SSID);
        }
    }

    private void showPassword() {
        if (this.isShowPassword) {
            this.mEditText.setInputType(129);
            this.mIvPasswordVisible.setImageResource(R.drawable.ic_eye_close);
        } else {
            this.mEditText.setInputType(144);
            this.mIvPasswordVisible.setImageResource(R.drawable.ic_eye_open);
        }
        this.isShowPassword = !this.isShowPassword;
        Editable text = this.mEditText.getText();
        Selection.setSelection(text, text.length());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (editable.toString().length() < 8) {
            this.mTvConnect.setTextColor(Color.parseColor("#cccccc"));
            this.mTvConnect.setOnClickListener(null);
            return;
        }
        this.mTvConnect.setTextColor(Color.parseColor("#222222"));
        this.mTvConnect.setOnClickListener(this);
    }

    /* loaded from: classes.dex */
    public static class XEditUtils {
        public void set(final EditText editText) {
            editText.addTextChangedListener(new TextWatcher() { // from class: com.sunmi.sunmisecurityservice.wifi.dialog.WifiConnectDialog.XEditUtils.1
                String before = "";

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    this.before = charSequence.toString();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    if (editable.toString().matches(WifiConnectDialog.PASSWORD_REGEX) || "".equals(editable.toString())) {
                        return;
                    }
                    editText.setText(this.before);
                    EditText editText2 = editText;
                    editText2.setSelection(editText2.getText().toString().length());
                }
            });
        }
    }
}
