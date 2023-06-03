package com.sunmi.sunmisecurityservice.wifi;

import android.content.ContentResolver;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import com.sunmi.sunmisecurityservice.util.LogUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public class WifiAdmin {
    private List<ScanResult> scanResultList;
    private List<WifiConfiguration> wifiConfigList;
    private WifiManager wifiManager = (WifiManager) MyApplication.app.getSystemService("wifi");

    /* loaded from: classes.dex */
    public enum WifiCipherType {
        WIFICIPHER_WEP,
        WIFICIPHER_WPA,
        WIFICIPHER_NOPASS,
        WIFICIPHER_INVALID
    }

    public boolean openWifi() {
        if (this.wifiManager.isWifiEnabled()) {
            return true;
        }
        return this.wifiManager.setWifiEnabled(true);
    }

    public void openGPS() {
        if (Build.VERSION.SDK_INT >= 23) {
            ContentResolver contentResolver = MyApplication.app.getContentResolver();
            if (Settings.Secure.getInt(contentResolver, "location_mode", 0) == 0) {
                Settings.Secure.putInt(contentResolver, "location_mode", 1);
            }
        }
    }

    public void startScan() {
        openWifi();
        this.wifiManager.startScan();
        this.scanResultList = this.wifiManager.getScanResults();
        LogUtil.e("WifiAdmin", "scan wifi list,size:" + this.scanResultList.size());
        this.wifiConfigList = this.wifiManager.getConfiguredNetworks();
    }

    public List<ScanResult> getWifiList() {
        return this.scanResultList;
    }

    public List<ScanResult> getUniqueWifiList() {
        ArrayList arrayList = new ArrayList();
        List<ScanResult> list = this.scanResultList;
        if (list != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (ScanResult scanResult : this.scanResultList) {
                if (!TextUtils.isEmpty(scanResult.SSID) && !linkedHashMap.containsKey(scanResult.SSID)) {
                    linkedHashMap.put(scanResult.SSID, scanResult);
                }
            }
            arrayList.addAll(linkedHashMap.values());
        }
        return arrayList;
    }

    public List<WifiConfiguration> getWifiConfigList() {
        return this.wifiConfigList;
    }

    public boolean connect(String str, String str2, WifiCipherType wifiCipherType) {
        WifiConfiguration createWifiConfiguration = createWifiConfiguration(str, str2, wifiCipherType);
        if (createWifiConfiguration == null) {
            return false;
        }
        return executeConnect(str, createWifiConfiguration);
    }

    public boolean connectExistConfiguration(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration == null) {
            return false;
        }
        return executeConnect(wifiConfiguration.SSID, wifiConfiguration);
    }

    private boolean executeConnect(String str, WifiConfiguration wifiConfiguration) {
        if (openWifi()) {
            while (this.wifiManager.getWifiState() == 2) {
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            WifiConfiguration isExist = isExist(str);
            if (isExist != null) {
                this.wifiManager.removeNetwork(isExist.networkId);
            }
            int addNetwork = this.wifiManager.addNetwork(wifiConfiguration);
            this.wifiManager.startScan();
            boolean enableNetwork = this.wifiManager.enableNetwork(addNetwork, true);
            this.wifiManager.saveConfiguration();
            return enableNetwork;
        }
        return false;
    }

    public WifiConfiguration isExist(String str) {
        List<WifiConfiguration> configuredNetworks = this.wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null && !configuredNetworks.isEmpty()) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                String str2 = wifiConfiguration.SSID;
                if (str2.equals("\"" + str + "\"")) {
                    return wifiConfiguration;
                }
            }
        }
        return null;
    }

    private WifiConfiguration createWifiConfiguration(String str, String str2, WifiCipherType wifiCipherType) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.allowedAuthAlgorithms.clear();
        wifiConfiguration.allowedGroupCiphers.clear();
        wifiConfiguration.allowedKeyManagement.clear();
        wifiConfiguration.allowedPairwiseCiphers.clear();
        wifiConfiguration.allowedProtocols.clear();
        wifiConfiguration.SSID = "\"" + str + "\"";
        if (wifiCipherType == WifiCipherType.WIFICIPHER_NOPASS) {
            wifiConfiguration.allowedKeyManagement.set(0);
            return wifiConfiguration;
        } else if (wifiCipherType == WifiCipherType.WIFICIPHER_WEP) {
            String[] strArr = wifiConfiguration.wepKeys;
            strArr[0] = "\"" + str2 + "\"";
            wifiConfiguration.hiddenSSID = true;
            wifiConfiguration.allowedAuthAlgorithms.set(1);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedGroupCiphers.set(0);
            wifiConfiguration.allowedGroupCiphers.set(1);
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.wepTxKeyIndex = 0;
            return wifiConfiguration;
        } else if (wifiCipherType == WifiCipherType.WIFICIPHER_WPA) {
            wifiConfiguration.preSharedKey = "\"" + str2 + "\"";
            wifiConfiguration.hiddenSSID = true;
            wifiConfiguration.allowedAuthAlgorithms.set(0);
            wifiConfiguration.allowedGroupCiphers.set(2);
            wifiConfiguration.allowedGroupCiphers.set(3);
            wifiConfiguration.allowedKeyManagement.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(1);
            wifiConfiguration.allowedPairwiseCiphers.set(2);
            wifiConfiguration.allowedProtocols.set(0);
            wifiConfiguration.allowedProtocols.set(1);
            return wifiConfiguration;
        } else {
            return null;
        }
    }

    public int getWifiState() {
        return this.wifiManager.getWifiState();
    }

    public boolean removeNetworkLink(int i) {
        return this.wifiManager.removeNetwork(i);
    }
}
