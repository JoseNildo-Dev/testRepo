package com.sunmi.sunmisecurityservice.wifi.bean;

import android.net.wifi.WifiManager;
import java.io.Serializable;

/* loaded from: classes.dex */
public class WifiElement implements Serializable {
    private String bssid;
    private String capabilities;
    private int frequency;
    private int level;
    private String ssid;

    public String getSsid() {
        return this.ssid;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public String getCapabilities() {
        return this.capabilities;
    }

    public void setCapabilities(String str) {
        this.capabilities = str;
    }

    public int getFrequency() {
        return this.frequency;
    }

    public void setFrequency(int i) {
        this.frequency = i;
    }

    public int getLevel() {
        return WifiManager.calculateSignalLevel(this.level, 4);
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public String getBssid() {
        return this.bssid;
    }

    public void setBssid(String str) {
        this.bssid = str;
    }
}
