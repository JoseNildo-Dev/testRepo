package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class PinPadConfig implements Parcelable {
    public static final Parcelable.Creator<PinPadConfig> CREATOR = new Parcelable.Creator<PinPadConfig>() { // from class: com.sunmi.pay.hardware.aidl.bean.PinPadConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PinPadConfig createFromParcel(Parcel parcel) {
            return new PinPadConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PinPadConfig[] newArray(int i) {
            return new PinPadConfig[i];
        }
    };
    private int MaxInput;
    private int MinInput;
    private byte[] Pan;
    private int PinKeyIndex;
    private int PinPadType;
    private int PinType;
    private int Timeout;
    private boolean isOrderNumKey;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PinPadConfig() {
        this.PinType = 0;
        this.isOrderNumKey = false;
        this.MaxInput = 6;
        this.MinInput = 0;
        this.Timeout = 60000;
    }

    public int getPinPadType() {
        return this.PinPadType;
    }

    public void setPinPadType(int i) {
        this.PinPadType = i;
    }

    public int getPinType() {
        return this.PinType;
    }

    public void setPinType(int i) {
        this.PinType = i;
    }

    public boolean isOrderNumKey() {
        return this.isOrderNumKey;
    }

    public void setOrderNumKey(boolean z) {
        this.isOrderNumKey = z;
    }

    public byte[] getPan() {
        return this.Pan;
    }

    public void setPan(byte[] bArr) {
        this.Pan = bArr;
    }

    public int getPinKeyIndex() {
        return this.PinKeyIndex;
    }

    public void setPinKeyIndex(int i) {
        this.PinKeyIndex = i;
    }

    public int getMaxInput() {
        return this.MaxInput;
    }

    public void setMaxInput(int i) {
        this.MaxInput = i;
    }

    public int getMinInput() {
        return this.MinInput;
    }

    public void setMinInput(int i) {
        this.MinInput = i;
    }

    public int getTimeout() {
        return this.Timeout;
    }

    public void setTimeout(int i) {
        this.Timeout = i;
    }

    protected PinPadConfig(Parcel parcel) {
        this.PinType = 0;
        this.isOrderNumKey = false;
        this.MaxInput = 6;
        this.MinInput = 0;
        this.Timeout = 60000;
        this.PinPadType = parcel.readInt();
        this.PinType = parcel.readInt();
        this.isOrderNumKey = parcel.readByte() != 0;
        this.Pan = parcel.createByteArray();
        this.PinKeyIndex = parcel.readInt();
        this.MaxInput = parcel.readInt();
        this.MinInput = parcel.readInt();
        this.Timeout = parcel.readInt();
    }

    public void readFromParcel(Parcel parcel) {
        this.PinPadType = parcel.readInt();
        this.PinType = parcel.readInt();
        this.isOrderNumKey = parcel.readByte() != 0;
        this.Pan = parcel.createByteArray();
        this.PinKeyIndex = parcel.readInt();
        this.MaxInput = parcel.readInt();
        this.MinInput = parcel.readInt();
        this.Timeout = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.PinPadType);
        parcel.writeInt(this.PinType);
        parcel.writeByte(this.isOrderNumKey ? (byte) 1 : (byte) 0);
        parcel.writeByteArray(this.Pan);
        parcel.writeInt(this.PinKeyIndex);
        parcel.writeInt(this.MaxInput);
        parcel.writeInt(this.MinInput);
        parcel.writeInt(this.Timeout);
    }
}
