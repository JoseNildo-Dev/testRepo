package com.sunmi.upgrade;

/* loaded from: classes.dex */
public class DownLoadFailException extends Exception {
    private String mStatus;

    public DownLoadFailException() {
        this.mStatus = DownloadTask.STATUS_FIAL_DOWNLOAD;
    }

    public DownLoadFailException(String str, String str2) {
        super(str);
        this.mStatus = DownloadTask.STATUS_FIAL_DOWNLOAD;
        this.mStatus = str2;
    }

    public String getStatus() {
        return this.mStatus;
    }
}
