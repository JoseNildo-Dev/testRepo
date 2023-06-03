package com.sunmi.sunmisecurityservice.wifi.bean;

import java.io.Serializable;

/* loaded from: classes.dex */
public class APNInfo implements Serializable {
    private String apn;
    private String authenticationType;
    private String bearer;
    private String mcc;
    private String mmsPort;
    private String mmsProxy;
    private String mmsc;
    private String mnc;
    private String name;
    private String password;
    private String port;
    private String protocol;
    private String proxy;
    private String roamingProtocol;
    private String server;
    private String type;
    private String userName;

    public APNInfo() {
    }

    public APNInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.apn = str;
        this.name = str2;
        this.type = str3;
        this.proxy = str4;
        this.port = str5;
        this.userName = str6;
        this.password = str7;
        this.server = str8;
        this.mmsc = str9;
        this.mmsProxy = str10;
        this.mmsPort = str11;
        this.mcc = str12;
        this.mnc = str13;
        this.authenticationType = str14;
        this.protocol = str15;
        this.roamingProtocol = str16;
        this.bearer = str17;
    }

    public String getApn() {
        return this.apn;
    }

    public void setApn(String str) {
        this.apn = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getProxy() {
        return this.proxy;
    }

    public void setProxy(String str) {
        this.proxy = str;
    }

    public String getPort() {
        return this.port;
    }

    public void setPort(String str) {
        this.port = str;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public String getServer() {
        return this.server;
    }

    public void setServer(String str) {
        this.server = str;
    }

    public String getMmsc() {
        return this.mmsc;
    }

    public void setMmsc(String str) {
        this.mmsc = str;
    }

    public String getMmsProxy() {
        return this.mmsProxy;
    }

    public void setMmsProxy(String str) {
        this.mmsProxy = str;
    }

    public String getMmsPort() {
        return this.mmsPort;
    }

    public void setMmsPort(String str) {
        this.mmsPort = str;
    }

    public String getMcc() {
        return this.mcc;
    }

    public void setMcc(String str) {
        this.mcc = str;
    }

    public String getMnc() {
        return this.mnc;
    }

    public void setMnc(String str) {
        this.mnc = str;
    }

    public String getAuthenticationType() {
        return this.authenticationType;
    }

    public void setAuthenticationType(String str) {
        this.authenticationType = str;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocoll(String str) {
        this.protocol = str;
    }

    public String getRoamingProtocol() {
        return this.roamingProtocol;
    }

    public void setRoamingProtocol(String str) {
        this.roamingProtocol = str;
    }

    public String getBearer() {
        return this.bearer;
    }

    public void setBearer(String str) {
        this.bearer = str;
    }

    public String toString() {
        return "APNInfo{apn='" + this.apn + "', name='" + this.name + "', type='" + this.type + "', proxy='" + this.proxy + "', port='" + this.port + "', userName='" + this.userName + "', password='" + this.password + "', server='" + this.server + "', mmsc='" + this.mmsc + "', mmsProxy='" + this.mmsProxy + "', mmsPort='" + this.mmsPort + "', mcc='" + this.mcc + "', mnc='" + this.mnc + "', authenticationType='" + this.authenticationType + "', protocol='" + this.protocol + "', roamingProtocol='" + this.roamingProtocol + "', bearer='" + this.bearer + "'}";
    }
}
