package com.sunmi.sunmisecurityservice.wifi;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sunmi.sunmisecurityservice.wifi.bean.ScanResultBean;
import com.sunmi.sunmisecurityservice_v3.R;
import sunmi.sunmiui.utils.Adaptation;

/* loaded from: classes.dex */
public class WifiListItemView extends RelativeLayout {
    private static final String TAG = "WifiListItem";
    private ImageView imgSignal;
    private Context mContext;
    private TextView mTvName;
    private TextView mTvStatus;
    private View view;

    public WifiListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
        initView();
    }

    public WifiListItemView(Context context) {
        super(context);
        this.mContext = context;
        initView();
    }

    public WifiListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        initView();
    }

    private void initView() {
        int i = Adaptation.proportion;
        if (i == 1) {
            this.view = View.inflate(this.mContext, R.layout.v1_adapter_wifi_item, this);
        } else if (i == 2) {
            this.view = View.inflate(this.mContext, R.layout.v1_adapter_wifi_item, this);
        } else if (i == 3) {
            this.view = View.inflate(this.mContext, R.layout.v1_adapter_wifi_item, this);
        }
        this.mTvName = (TextView) this.view.findViewById(R.id.tv_wifi_name);
        this.mTvStatus = (TextView) this.view.findViewById(R.id.tv_wifi_status);
        this.imgSignal = (ImageView) this.view.findViewById(R.id.img_wifi_signal);
    }

    public void loadWifiData(ScanResultBean scanResultBean) {
        this.mTvName.setText(scanResultBean.getWifiElement().getSsid());
        String upperCase = scanResultBean.getWifiElement().getCapabilities().toUpperCase();
        String str = upperCase.contains("WPA-PSK") ? "WPA" : "";
        if (upperCase.contains("WPA2-PSK")) {
            str = "WPA2";
        }
        if (upperCase.contains("WPA-PSK") && upperCase.contains("WPA2-PSK")) {
            str = "WPA/WPA2";
        }
        String str2 = upperCase.contains("WEP") ? "WEP" : str;
        int level = scanResultBean.getWifiElement().getLevel();
        if (level != 0) {
            if (level != 1) {
                if (level != 2) {
                    if (level == 3) {
                        if (TextUtils.isEmpty(str2)) {
                            this.imgSignal.setImageResource(R.drawable.wifi_signal_4);
                        } else {
                            this.imgSignal.setImageResource(R.drawable.wifi_signal_lock_4);
                        }
                    }
                } else if (TextUtils.isEmpty(str2)) {
                    this.imgSignal.setImageResource(R.drawable.wifi_signal_3);
                } else {
                    this.imgSignal.setImageResource(R.drawable.wifi_signal_lock_3);
                }
            } else if (TextUtils.isEmpty(str2)) {
                this.imgSignal.setImageResource(R.drawable.wifi_signal_2);
            } else {
                this.imgSignal.setImageResource(R.drawable.wifi_signal_lock_2);
            }
        } else if (TextUtils.isEmpty(str2)) {
            this.imgSignal.setImageResource(R.drawable.wifi_signal_1);
        } else {
            this.imgSignal.setImageResource(R.drawable.wifi_signal_lock_1);
        }
        int stateCode = scanResultBean.getStateCode();
        if (stateCode == 2) {
            this.mTvStatus.setVisibility(0);
            this.mTvStatus.setText(getResources().getString(R.string.network_wifi_connected));
            this.mTvStatus.setTextColor(Color.parseColor("#FF6900"));
        } else if (stateCode == 1) {
            this.mTvStatus.setVisibility(0);
            this.mTvStatus.setText(getResources().getString(R.string.network_wifi_verify));
            this.mTvStatus.setTextColor(Color.parseColor("#999999"));
        } else {
            this.mTvStatus.setVisibility(8);
            this.mTvName.setTextColor(Color.parseColor("#212121"));
        }
    }
}
