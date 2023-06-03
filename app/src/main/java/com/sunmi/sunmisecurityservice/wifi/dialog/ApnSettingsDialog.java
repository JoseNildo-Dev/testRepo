package com.sunmi.sunmisecurityservice.wifi.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.sunmi.sunmisecurityservice.util.NetWorkCenterUtils;
import com.sunmi.sunmisecurityservice.wifi.bean.APNInfo;
import com.sunmi.sunmisecurityservice.wifi.model.CacheModel;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public class ApnSettingsDialog extends Dialog implements View.OnClickListener {
    private String apn;
    private String apnAuthenticationType;
    private String apnBearer;
    private String apnMMSC;
    private String apnMcc;
    private String apnMmsPort;
    private String apnMmsProxy;
    private String apnMnc;
    private String apnName;
    private String apnPort;
    private String apnProtocol;
    private String apnProxy;
    private String apnPwd;
    private String apnRoamingProtocol;
    private String apnServer;
    private String apnType;
    private String apnUsername;
    private APNInfo mAPNInfo;
    private APNManager mApnManager;
    private Context mContext;
    private EditText mEditApn;
    private EditText mEditApnAuthenticationType;
    private EditText mEditApnBearer;
    private EditText mEditApnMMSC;
    private EditText mEditApnMcc;
    private EditText mEditApnMnc;
    private EditText mEditApnName;
    private EditText mEditApnPort;
    private EditText mEditApnProtocol;
    private EditText mEditApnProxy;
    private EditText mEditApnPwd;
    private EditText mEditApnRoamingProtocol;
    private EditText mEditApnServer;
    private EditText mEditApnType;
    private EditText mEditApnUsername;
    private EditText mEditMmsPort;
    private EditText mEditMmsProxy;
    private TextView mTvCancel;
    private TextView mTvRetry;

    public ApnSettingsDialog(Context context) {
        super(context);
        this.mContext = context;
    }

    public ApnSettingsDialog(Context context, APNInfo aPNInfo) {
        super(context, R.style.defaultDialogStyle);
        this.mContext = context;
        this.mAPNInfo = aPNInfo;
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
        this.mApnManager = new APNManager(this.mContext);
        setContentView(R.layout.v1_dialog_apn);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        initView();
        initData();
    }

    private void initData() {
        APNInfo aPNInfo = this.mAPNInfo;
        if (aPNInfo != null && aPNInfo.getName() != null) {
            this.mEditApnName.setText(this.mAPNInfo.getName());
            this.mEditApn.setText(this.mAPNInfo.getApn());
            this.mEditApnType.setText(this.mAPNInfo.getType());
            this.mEditApnProxy.setText(this.mAPNInfo.getProxy());
            this.mEditApnPort.setText(this.mAPNInfo.getPort());
            this.mEditApnUsername.setText(this.mAPNInfo.getUserName());
            this.mEditApnPwd.setText(this.mAPNInfo.getPassword());
            this.mEditApnServer.setText(this.mAPNInfo.getServer());
            this.mEditApnMMSC.setText(this.mAPNInfo.getMmsc());
            this.mEditMmsProxy.setText(this.mAPNInfo.getMmsProxy());
            this.mEditMmsPort.setText(this.mAPNInfo.getMmsPort());
            this.mEditApnMcc.setText(this.mAPNInfo.getMcc());
            this.mEditApnMnc.setText(this.mAPNInfo.getMnc());
            this.mEditApnAuthenticationType.setText(this.mAPNInfo.getAuthenticationType());
            this.mEditApnProtocol.setText(this.mAPNInfo.getProtocol());
            this.mEditApnRoamingProtocol.setText(this.mAPNInfo.getRoamingProtocol());
            this.mEditApnBearer.setText(this.mAPNInfo.getBearer());
            return;
        }
        this.mEditApnMcc.setText(NetWorkCenterUtils.getMcc(this.mContext));
        this.mEditApnMnc.setText(NetWorkCenterUtils.getMnc(this.mContext));
    }

    private void initView() {
        this.mEditApnName = (EditText) findViewById(R.id.edit_apn_name);
        this.mEditApn = (EditText) findViewById(R.id.edit_apn);
        this.mEditApnType = (EditText) findViewById(R.id.edit_apn_type);
        this.mEditApnProxy = (EditText) findViewById(R.id.edit_apn_proxy);
        this.mEditApnPort = (EditText) findViewById(R.id.edit_apn_port);
        this.mEditApnUsername = (EditText) findViewById(R.id.edit_apn_username);
        this.mEditApnPwd = (EditText) findViewById(R.id.edit_apn_password);
        this.mEditApnServer = (EditText) findViewById(R.id.edit_apn_server);
        this.mEditApnMMSC = (EditText) findViewById(R.id.edit_apn_mmsc);
        this.mEditMmsProxy = (EditText) findViewById(R.id.edit_apn_mms_proxy);
        this.mEditMmsPort = (EditText) findViewById(R.id.edit_apn_mms_port);
        this.mEditApnMcc = (EditText) findViewById(R.id.edit_apn_mcc);
        this.mEditApnMnc = (EditText) findViewById(R.id.edit_apn_mnc);
        this.mEditApnAuthenticationType = (EditText) findViewById(R.id.edit_apn_authentication_type);
        this.mEditApnProtocol = (EditText) findViewById(R.id.edit_apn_protocol);
        this.mEditApnRoamingProtocol = (EditText) findViewById(R.id.edit_apn_roaming_protocol);
        this.mEditApnBearer = (EditText) findViewById(R.id.edit_apn_bearer);
        this.mTvRetry = (TextView) findViewById(R.id.tv_retry);
        this.mTvCancel = (TextView) findViewById(R.id.tv_cancel);
        this.mTvRetry.setOnClickListener(this);
        this.mTvCancel.setOnClickListener(this);
    }

    private void getApnSettingsValue() {
        this.apnName = this.mEditApnName.getText().toString().trim();
        this.apn = this.mEditApn.getText().toString().trim();
        this.apnType = this.mEditApnType.getText().toString().trim();
        this.apnProxy = this.mEditApnProxy.getText().toString().trim();
        this.apnPort = this.mEditApnPort.getText().toString().trim();
        this.apnUsername = this.mEditApnUsername.getText().toString().trim();
        this.apnPwd = this.mEditApnPwd.getText().toString().trim();
        this.apnServer = this.mEditApnServer.getText().toString().trim();
        this.apnMMSC = this.mEditApnMMSC.getText().toString().trim();
        this.apnMmsProxy = this.mEditMmsProxy.getText().toString().trim();
        this.apnMmsPort = this.mEditMmsPort.getText().toString().trim();
        this.apnMcc = this.mEditApnMcc.getText().toString().trim();
        this.apnMnc = this.mEditApnMnc.getText().toString().trim();
        this.apnAuthenticationType = this.mEditApnAuthenticationType.getText().toString().trim();
        this.apnProtocol = this.mEditApnProtocol.getText().toString().trim();
        this.apnRoamingProtocol = this.mEditApnRoamingProtocol.getText().toString().trim();
        this.apnBearer = this.mEditApnBearer.getText().toString().trim();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.tv_cancel) {
            dismiss();
        } else if (id != R.id.tv_retry) {
        } else {
            getApnSettingsValue();
            if (TextUtils.isEmpty(this.apnName)) {
                Toast.makeText(this.mContext, (int) R.string.toast_apn_name, 0).show();
            } else if (TextUtils.isEmpty(this.apn)) {
                Toast.makeText(this.mContext, (int) R.string.toast_apn, 0).show();
            } else {
                APNInfo aPNInfo = new APNInfo(this.apn, this.apnName, this.apnType, this.apnProxy, this.apnPort, this.apnUsername, this.apnPwd, this.apnServer, this.apnMMSC, this.apnMmsProxy, this.apnMmsPort, this.apnMcc, this.apnMnc, this.apnAuthenticationType, this.apnProtocol, this.apnRoamingProtocol, this.apnBearer);
                APNManager aPNManager = this.mApnManager;
                aPNManager.setPreferAPN(aPNManager.addAPN(aPNInfo));
                CacheModel.saveApn(aPNInfo);
                dismiss();
            }
        }
    }
}
