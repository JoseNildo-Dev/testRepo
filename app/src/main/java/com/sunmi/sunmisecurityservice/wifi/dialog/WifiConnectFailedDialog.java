package com.sunmi.sunmisecurityservice.wifi.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice.wifi.WifiAdmin;
import com.sunmi.sunmisecurityservice.wifi.WifiFailedHelpActivity;
import com.sunmi.sunmisecurityservice.wifi.bean.WifiElement;
import com.sunmi.sunmisecurityservice.wifi.dialog.WifiConnectDialog;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class WifiConnectFailedDialog extends Dialog implements View.OnClickListener {
    private Context mContext;
    private TextView mTvCancel;
    private TextView mTvConnect;
    private TextView mTvForget;
    private TextView mTvHelp;
    private WifiAdmin mWifiAdmin;
    private WifiConfiguration mWifiConfiguration;
    private WifiElement mWifiElement;
    private WifiConnectDialog.OnConnectOnClick onConnectOnClick;
    private String password;

    public WifiConnectFailedDialog(Context context, String str, WifiElement wifiElement, WifiConfiguration wifiConfiguration, WifiConnectDialog.OnConnectOnClick onConnectOnClick) {
        super(context, R.style.defaultDialogStyle);
        this.mContext = context;
        this.password = str;
        this.onConnectOnClick = onConnectOnClick;
        this.mWifiElement = wifiElement;
        this.mWifiConfiguration = wifiConfiguration;
        this.mWifiAdmin = new WifiAdmin();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_wifi_connect_failed);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().setType(2038);
        } else {
            getWindow().setType(2010);
        }
        initView();
    }

    private void initView() {
        this.mTvConnect = (TextView) findViewById(R.id.tv_connect);
        this.mTvHelp = (TextView) findViewById(R.id.tv_help);
        this.mTvForget = (TextView) findViewById(R.id.tv_forget);
        this.mTvCancel = (TextView) findViewById(R.id.tv_cancel);
        this.mTvConnect.setOnClickListener(this);
        this.mTvHelp.setOnClickListener(this);
        this.mTvForget.setOnClickListener(this);
        this.mTvCancel.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_cancel /* 2131230971 */:
                this.onConnectOnClick.cancel();
                dismiss();
                return;
            case R.id.tv_connect /* 2131230973 */:
                this.onConnectOnClick.connect(this.password, this.mWifiElement.getSsid());
                dismiss();
                return;
            case R.id.tv_forget /* 2131230977 */:
                if (this.mWifiConfiguration != null) {
                    WifiManager wifiManager = (WifiManager) this.mContext.getSystemService("wifi");
                    WifiConfiguration isExist = this.mWifiAdmin.isExist(this.mWifiElement.getSsid());
                    if (isExist != null) {
                        wifiManager.removeNetwork(isExist.networkId);
                        wifiManager.saveConfiguration();
                    }
                }
                dismiss();
                return;
            case R.id.tv_help /* 2131230978 */:
                Context context = this.mContext;
                context.startActivity(new Intent(context, WifiFailedHelpActivity.class));
                return;
            default:
                return;
        }
    }
}
