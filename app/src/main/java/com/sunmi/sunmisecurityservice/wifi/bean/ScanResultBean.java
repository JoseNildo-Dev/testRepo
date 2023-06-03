package com.sunmi.sunmisecurityservice.wifi.bean;

import java.io.Serializable;

/* loaded from: classes.dex */
public class ScanResultBean implements Serializable {
    private int stateCode;
    private WifiElement wifiElement;

    public ScanResultBean() {
    }

    public ScanResultBean(int i, WifiElement wifiElement) {
        this.stateCode = i;
        this.wifiElement = wifiElement;
    }

    public int getStateCode() {
        return this.stateCode;
    }

    public void setStateCode(int i) {
        this.stateCode = i;
    }

    public WifiElement getWifiElement() {
        return this.wifiElement;
    }

    public void setWifiElement(WifiElement wifiElement) {
        this.wifiElement = wifiElement;
    }

    public String toString() {
        return "ScanResultBean{stateCode=" + this.stateCode + ", wifiElement=" + this.wifiElement + '}';
    }
}
