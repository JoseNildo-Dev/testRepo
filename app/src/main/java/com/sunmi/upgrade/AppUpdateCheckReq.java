package com.sunmi.upgrade;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppUpdateCheckReq {
    private List<AppReq> appList;
    private DeviceInfo deviceInfo;

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public void setAppList(List<AppReq> list) {
        this.appList = list;
    }

    public String toString() {
        return "AppUpdateCheckReq{appList=" + this.appList + ", deviceInfo=" + this.deviceInfo + '}';
    }

    public String toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deviceInfo", this.deviceInfo.toJson());
            JSONArray jSONArray = new JSONArray();
            for (AppReq appReq : this.appList) {
                jSONArray.put(appReq.toJson());
            }
            jSONObject.put("appList", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
