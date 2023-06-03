package com.sunmi.sunmisecurityservice.model.entity;

/* loaded from: classes.dex */
public class AlarmReason {
    public static final int INVALID_STATUS = -1;
    public int currentStatus;
    public int historyStatus;
    public String type;

    public AlarmReason(String str, int i, int i2) {
        this.type = str;
        this.currentStatus = i;
        this.historyStatus = i2;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public int getCurrentStatus() {
        return this.currentStatus;
    }

    public void setCurrentStatus(int i) {
        this.currentStatus = i;
    }

    public int getHistoryStatus() {
        return this.historyStatus;
    }

    public void setHistoryStatus(int i) {
        this.historyStatus = i;
    }
}
