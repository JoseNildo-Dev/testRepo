package com.sunmi.sunmisecurityservice.wifi.model;

import com.sunmi.sunmisecurityservice.util.SharedPreferencesUtil;
import com.sunmi.sunmisecurityservice.wifi.bean.APNInfo;

/* loaded from: classes.dex */
public final class CacheModel {
    public static final String CACHE_KEY_APN = "key_welcome_apn_info";

    private CacheModel() {
        throw new AssertionError("create instance of CacheModel is prohibited");
    }

    public static void saveApn(APNInfo aPNInfo) {
        SharedPreferencesUtil.saveObj(CACHE_KEY_APN, aPNInfo);
    }

    public static APNInfo getApn() {
        return (APNInfo) SharedPreferencesUtil.readObj(CACHE_KEY_APN);
    }
}
