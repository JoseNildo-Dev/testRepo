package com.sunmi.sunmisecurityservice.model.entity;

import com.sunmi.sunmisecurityservice.util.DeviceUtils;
import com.sunmi.sunmisecurityservice.util.Util;
import com.sunmi.sunmisecurityservice_v3.BuildConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class AuthCodeRequestParams implements Serializable {
    private static final long serialVersionUID = -8878503244891931316L;
    public String data;
    public String signData;
    public String msn = DeviceUtils.getMSN();
    public String machineModel = DeviceUtils.getDeviceModel();

    public AuthCodeRequestParams(int i, int i2) {
        byte[] bArr = new byte[512];
        if (DeviceUtils.getAuthReqCode(i, i2, this.msn, bArr) == 0) {
            this.data = Util.bytesToHexStr(Arrays.copyOfRange(bArr, 0, 256));
            this.signData = Util.bytesToHexStr(Arrays.copyOfRange(bArr, 256, bArr.length));
        }
    }

    public Map<String, String> toRequestMap() {
        HashMap hashMap = new HashMap();
        MD5Req mD5Req = new MD5Req(this);
        hashMap.put("version", BuildConfig.VERSION_NAME);
        hashMap.put("params", mD5Req.jsonParams);
        hashMap.put("isEncrypted", mD5Req.isEncrypted);
        hashMap.put("timeStamp", mD5Req.timeStamp);
        hashMap.put("randomNum", mD5Req.randomNum);
        hashMap.put("sign", mD5Req.sign);
        hashMap.put("timeZone", mD5Req.timeZone);
        hashMap.put("language", mD5Req.language);
        return hashMap;
    }
}
