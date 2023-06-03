package com.sunmi.sunmisecurityservice.wifi.dialog;

import android.app.Dialog;
import android.content.Context;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice.wifi.WifiAdmin;
import com.sunmi.sunmisecurityservice.wifi.bean.WifiElement;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class WifiCancelDialog extends Dialog {
    private Context context;
    private RelativeLayout mRlCancel;
    private RelativeLayout mRlCancelSave;
    private WifiAdmin mWifiAdmin;
    private WifiElement mWifiElement;
    private TextView mWifiSSIDTitle;

    public WifiCancelDialog(Context context, int i, WifiElement wifiElement) {
        super(context, i);
        this.context = context;
        this.mWifiElement = wifiElement;
        this.mWifiAdmin = new WifiAdmin();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().setType(2038);
        } else {
            getWindow().setType(2010);
        }
        initLayout();
        initView();
        setListener();
    }

    private void initLayout() {
        setContentView(R.layout.dialog_cancel_save);
        setCanceledOnTouchOutside(false);
    }

    private void initView() {
        this.mWifiSSIDTitle = (TextView) findViewById(R.id.tv_wifi_ssid_title);
        this.mRlCancel = (RelativeLayout) findViewById(R.id.rl_cancel);
        this.mRlCancelSave = (RelativeLayout) findViewById(R.id.rl_cancel_save);
        this.mWifiSSIDTitle.setText(this.mWifiElement.getSsid());
    }

    private void setListener() {
        this.mRlCancel.setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.wifi.dialog.WifiCancelDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WifiCancelDialog.this.dismiss();
            }
        });
        this.mRlCancelSave.setOnClickListener(new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.wifi.dialog.WifiCancelDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                WifiManager wifiManager = (WifiManager) WifiCancelDialog.this.context.getSystemService("wifi");
                WifiConfiguration isExist = WifiCancelDialog.this.mWifiAdmin.isExist(WifiCancelDialog.this.mWifiElement.getSsid());
                if (isExist != null) {
                    wifiManager.removeNetwork(isExist.networkId);
                    wifiManager.saveConfiguration();
                }
                WifiCancelDialog.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
    }
}
