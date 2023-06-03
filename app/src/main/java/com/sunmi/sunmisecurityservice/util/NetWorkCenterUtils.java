package com.sunmi.sunmisecurityservice.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import com.sunmi.sunmisecurityservice_v3.R;

/* loaded from: classes.dex */
public final class NetWorkCenterUtils {
    private NetWorkCenterUtils() {
        throw new AssertionError("create instance of NetWorkCenterUtils is prohibited");
    }

    public static boolean isNetworkConnected() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) MyApplication.app.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
    }

    public static boolean isWifi() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) MyApplication.app.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 1) ? false : true;
    }

    public static boolean is3G() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) MyApplication.app.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || activeNetworkInfo.getType() != 0) ? false : true;
    }

    public static String getConnectWifiName(Context context) {
        return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getSSID();
    }

    public static String getMcc(Context context) {
        String networkOperator = getNetworkOperator(context);
        return (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 3) ? "" : networkOperator.substring(0, 3);
    }

    public static String getMnc(Context context) {
        String networkOperator = getNetworkOperator(context);
        return (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) ? "" : networkOperator.substring(3);
    }

    public static String getNetworkOperator(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
    }

    public static int readSIMCard() {
        StringBuffer stringBuffer = new StringBuffer();
        int simState = ((TelephonyManager) MyApplication.app.getSystemService("phone")).getSimState();
        if (simState == 0) {
            stringBuffer.append(MyApplication.app.getString(R.string.unknown_state));
            return 2;
        } else if (simState == 1) {
            stringBuffer.append(MyApplication.app.getString(R.string.no_card));
            return 1;
        } else if (simState == 2) {
            stringBuffer.append(MyApplication.app.getString(R.string.need_pin_unlock));
            return 4;
        } else if (simState == 3) {
            stringBuffer.append(MyApplication.app.getString(R.string.need_puk_unlock));
            return 5;
        } else if (simState == 4) {
            stringBuffer.append(MyApplication.app.getString(R.string.need_network_pin_unlock));
            return 3;
        } else if (simState != 5) {
            return 7;
        } else {
            stringBuffer.append(MyApplication.app.getString(R.string.good));
            return 6;
        }
    }
}
