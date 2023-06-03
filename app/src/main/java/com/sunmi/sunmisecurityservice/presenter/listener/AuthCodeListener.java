package com.sunmi.sunmisecurityservice.presenter.listener;

/* loaded from: classes.dex */
public interface AuthCodeListener {
    void onError(String str);

    void onLoadingData();

    void onSuccess();
}
