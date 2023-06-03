package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class PinPadData implements Parcelable {
    public static final Parcelable.Creator<PinPadData> CREATOR = new Parcelable.Creator<PinPadData>() { // from class: com.sunmi.pay.hardware.aidl.bean.PinPadData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PinPadData createFromParcel(Parcel parcel) {
            return new PinPadData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PinPadData[] newArray(int i) {
            return new PinPadData[i];
        }
    };
    public int cancelH;
    public int cancelW;
    public int cancelX;
    public int cancelY;
    public int clos;
    public byte[] keyMap;
    public int lineW;
    public int numH;
    public int numW;
    public int numX;
    public int numY;
    public int rows;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PinPadData() {
        this.keyMap = new byte[64];
    }

    public int getNumX() {
        return this.numX;
    }

    public void setNumX(int i) {
        this.numX = i;
    }

    public int getNumY() {
        return this.numY;
    }

    public void setNumY(int i) {
        this.numY = i;
    }

    public int getNumH() {
        return this.numH;
    }

    public void setNumH(int i) {
        this.numH = i;
    }

    public int getNumW() {
        return this.numW;
    }

    public void setNumW(int i) {
        this.numW = i;
    }

    public int getLineW() {
        return this.lineW;
    }

    public void setLineW(int i) {
        this.lineW = i;
    }

    public int getCancelX() {
        return this.cancelX;
    }

    public void setCancelX(int i) {
        this.cancelX = i;
    }

    public int getCancelY() {
        return this.cancelY;
    }

    public void setCancelY(int i) {
        this.cancelY = i;
    }

    public int getCancelH() {
        return this.cancelH;
    }

    public void setCancelH(int i) {
        this.cancelH = i;
    }

    public int getCancelW() {
        return this.cancelW;
    }

    public void setCancelW(int i) {
        this.cancelW = i;
    }

    public int getRows() {
        return this.rows;
    }

    public void setRows(int i) {
        this.rows = i;
    }

    public int getClos() {
        return this.clos;
    }

    public void setClos(int i) {
        this.clos = i;
    }

    public byte[] getKeyMap() {
        return this.keyMap;
    }

    public void setKeyMap(byte[] bArr) {
        this.keyMap = bArr;
    }

    protected PinPadData(Parcel parcel) {
        this.keyMap = new byte[64];
        this.numX = parcel.readInt();
        this.numY = parcel.readInt();
        this.numH = parcel.readInt();
        this.numW = parcel.readInt();
        this.lineW = parcel.readInt();
        this.cancelX = parcel.readInt();
        this.cancelY = parcel.readInt();
        this.cancelH = parcel.readInt();
        this.cancelW = parcel.readInt();
        this.rows = parcel.readInt();
        this.clos = parcel.readInt();
        this.keyMap = parcel.createByteArray();
    }

    public boolean check() {
        return (this.numH == 0 || this.numW == 0 || this.cancelH == 0 || this.cancelW == 0) ? false : true;
    }

    public String toString() {
        return "numX:" + this.numX + "\nnumW:" + this.numW + "\nnumH:" + this.numH + "\nnumY:" + this.numY + "\ncancelH:" + this.cancelH + "\ncancelW:" + this.cancelW + "\ncancelX:" + this.cancelX + "\ncancelY:" + this.cancelY;
    }

    public void readFromParcel(Parcel parcel) {
        this.numX = parcel.readInt();
        this.numY = parcel.readInt();
        this.numH = parcel.readInt();
        this.numW = parcel.readInt();
        this.lineW = parcel.readInt();
        this.cancelX = parcel.readInt();
        this.cancelY = parcel.readInt();
        this.cancelH = parcel.readInt();
        this.cancelW = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.numX);
        parcel.writeInt(this.numY);
        parcel.writeInt(this.numH);
        parcel.writeInt(this.numW);
        parcel.writeInt(this.lineW);
        parcel.writeInt(this.cancelX);
        parcel.writeInt(this.cancelY);
        parcel.writeInt(this.cancelH);
        parcel.writeInt(this.cancelW);
        parcel.writeInt(this.rows);
        parcel.writeInt(this.clos);
        parcel.writeByteArray(this.keyMap);
    }
}
