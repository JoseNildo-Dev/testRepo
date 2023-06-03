package com.sunmi.upgrade;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppReq {
    private int aId;
    private String packageName;
    private int versionCode;

    public void setId(int i) {
        this.aId = i;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public String toString() {
        return "AppReq{aId=" + this.aId + ", packageName='" + this.packageName + "', versionCode=" + this.versionCode + '}';
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("packageName", this.packageName);
        jSONObject.put("versionCode", this.versionCode);
        return jSONObject;
    }
}
