package com.sunmi.sunmisecurityservice.model;

import com.sunmi.sunmisecurityservice.model.entity.AuthCodeResponseParams;

/* loaded from: classes.dex */
public interface AuthCodeable {
    void checkAuthCodeByCloud(int i, int i2);

    void checkAuthCodeByFirmware(AuthCodeResponseParams authCodeResponseParams);
}
