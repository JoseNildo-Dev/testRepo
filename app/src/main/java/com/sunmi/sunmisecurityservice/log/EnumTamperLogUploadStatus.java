package com.sunmi.sunmisecurityservice.log;

/* loaded from: classes.dex */
public enum EnumTamperLogUploadStatus {
    UPLOAD_STATUS_DEFAULT(0),
    UPLOAD_STATUS_SUCCESS(1),
    UPLOAD_STATUS_FAIL(2);
    
    private final int value;

    EnumTamperLogUploadStatus(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
