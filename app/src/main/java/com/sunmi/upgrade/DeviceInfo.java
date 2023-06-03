package com.sunmi.upgrade;

import android.os.Build;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeviceInfo implements Serializable {
    private String msn = UpgradeTool.getInstance().sn;
    private String machineModel = Build.MODEL;

    public String getModel() {
        return this.machineModel;
    }

    public void setMachineModel(String str) {
        this.machineModel = str;
    }

    public String getMsn() {
        return this.msn;
    }

    public void setMsn(String str) {
        this.msn = str;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msn", this.msn);
        jSONObject.put("machineModel", this.machineModel);
        return jSONObject;
    }
}
