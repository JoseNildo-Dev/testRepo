package com.sunmi.sunmisecurityservice.wifi;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import android.util.Log;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import com.sunmi.sunmisecurityservice.wifi.bean.ScanResultBean;
import com.sunmi.sunmisecurityservice.wifi.bean.WifiElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class WifiSearcher {
    private static final String TAG = "WifiSearcher";
    private SearchWifiListener mSearchWifiListener;
    private WifiAdmin mWifiAdmin = new WifiAdmin();

    /* loaded from: classes.dex */
    public enum ErrorType {
        NO_WIFI_FOUND
    }

    /* loaded from: classes.dex */
    public interface SearchWifiListener {
        void onSearchWifiFailed(ErrorType errorType);

        void onSearchWifiSuccess(List<ScanResultBean> list);
    }

    public WifiSearcher(SearchWifiListener searchWifiListener) {
        this.mSearchWifiListener = searchWifiListener;
    }

    public void getAllNetWorkList() {
        this.mWifiAdmin.startScan();
        List<ScanResult> uniqueWifiList = this.mWifiAdmin.getUniqueWifiList();
        ArrayList arrayList = new ArrayList();
        if (uniqueWifiList != null && uniqueWifiList.size() > 0) {
            for (int i = 0; i < uniqueWifiList.size(); i++) {
                ScanResult scanResult = uniqueWifiList.get(i);
                WifiElement wifiElement = new WifiElement();
                wifiElement.setSsid(scanResult.SSID);
                wifiElement.setBssid(scanResult.BSSID);
                wifiElement.setCapabilities(scanResult.capabilities);
                wifiElement.setFrequency(scanResult.frequency);
                wifiElement.setLevel(scanResult.level);
                arrayList.add(wifiElement);
            }
        }
        List<ScanResultBean> wrapWifiElement = wrapWifiElement(arrayList);
        if (wrapWifiElement.size() <= 0) {
            this.mSearchWifiListener.onSearchWifiFailed(ErrorType.NO_WIFI_FOUND);
        } else {
            this.mSearchWifiListener.onSearchWifiSuccess(wrapWifiElement);
        }
    }

    private List<ScanResultBean> wrapWifiElement(List<WifiElement> list) {
        ArrayList arrayList = new ArrayList();
        String ssid = ((WifiManager) MyApplication.app.getSystemService("wifi")).getConnectionInfo().getSSID();
        NetworkInfo.State state = ((ConnectivityManager) MyApplication.app.getSystemService("connectivity")).getNetworkInfo(1).getState();
        int i = -1;
        for (int i2 = 0; i2 < list.size(); i2++) {
            WifiElement wifiElement = list.get(i2);
            if (TextUtils.equals("\"" + wifiElement.getSsid() + "\"", ssid)) {
                i = i2;
            }
            arrayList.add(new ScanResultBean(0, wifiElement));
        }
        if (i != -1) {
            ((ScanResultBean) arrayList.get(i)).setStateCode(state == NetworkInfo.State.CONNECTED ? 2 : 1);
            Log.e(TAG, "wrapWifiElement 正在连接的Wifi名字 " + ssid + " ==== " + state);
        }
        Collections.sort(arrayList, new Comparator<ScanResultBean>() { // from class: com.sunmi.sunmisecurityservice.wifi.WifiSearcher.1
            @Override // java.util.Comparator
            public int compare(ScanResultBean scanResultBean, ScanResultBean scanResultBean2) {
                return scanResultBean2.getStateCode() - scanResultBean.getStateCode();
            }
        });
        return arrayList;
    }
}
