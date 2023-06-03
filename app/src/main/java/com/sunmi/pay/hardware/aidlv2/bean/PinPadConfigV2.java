package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class PinPadConfigV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<PinPadConfigV2> CREATOR = new Parcelable.Creator<PinPadConfigV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.PinPadConfigV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PinPadConfigV2 createFromParcel(Parcel parcel) {
            return new PinPadConfigV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PinPadConfigV2[] newArray(int i) {
            return new PinPadConfigV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    private byte[] Pan;
    private int PinKeyIndex;
    private int PinPadType;
    private int PinType = 0;
    private boolean isOrderNumKey = false;
    private int MaxInput = 6;
    private int MinInput = 0;
    private int Timeout = 60000;
    private boolean isSupportbypass = true;
    private int PinblockFormat = 0;
    private int AlgorithmType = 0;
    private int KeySystem = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public boolean isSupportbypass() {
        return this.isSupportbypass;
    }

    public void setSupportbypass(boolean z) {
        this.isSupportbypass = z;
    }

    public int getPinblockFormat() {
        return this.PinblockFormat;
    }

    public void setPinblockFormat(int i) {
        this.PinblockFormat = i;
    }

    public int getAlgorithmType() {
        return this.AlgorithmType;
    }

    public void setAlgorithmType(int i) {
        this.AlgorithmType = i;
    }

    public int getKeySystem() {
        return this.KeySystem;
    }

    public void setKeySystem(int i) {
        this.KeySystem = i;
    }

    public PinPadConfigV2() {
    }

    protected PinPadConfigV2(Parcel parcel) {
        readFromParcel(parcel);
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
        this.isSupportbypass = parcel.readByte() != 0;
        this.PinblockFormat = parcel.readInt();
        this.AlgorithmType = parcel.readInt();
        this.KeySystem = parcel.readInt();
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
        parcel.writeByte(this.isSupportbypass ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.PinblockFormat);
        parcel.writeInt(this.AlgorithmType);
        parcel.writeInt(this.KeySystem);
    }

    public String toString() {
        return "PinPadConfigV2{PinPadType=" + this.PinPadType + ", PinType=" + this.PinType + ", isOrderNumKey=" + this.isOrderNumKey + ", Pan=" + bytes2HexString(this.Pan) + ", PinKeyIndex=" + this.PinKeyIndex + ", MaxInput=" + this.MaxInput + ", MinInput=" + this.MinInput + ", Timeout=" + this.Timeout + ", isSupportbypass=" + this.isSupportbypass + ", PinblockFormat=" + this.PinblockFormat + ", AlgorithmType=" + this.AlgorithmType + ", KeySystem=" + this.KeySystem + '}';
    }

    private String bytes2HexString(byte... bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }
}
