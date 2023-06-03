package com.sunmi.sunmisecurityservice.view;

/* loaded from: classes.dex */
public interface AuthCodeCallback {
    void onAuthCodeCheckFail(String str);

    void onAuthCodeCheckSuccess();

    void onCheckAuthCode();
}
