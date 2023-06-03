package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class CapkV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<CapkV2> CREATOR = new Parcelable.Creator<CapkV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.CapkV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CapkV2 createFromParcel(Parcel parcel) {
            return new CapkV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CapkV2[] newArray(int i) {
            return new CapkV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public byte arithInd;
    public byte[] checkSum;
    public byte[] expDate;
    public byte[] exponent;
    public byte hashInd;
    public byte index;
    public byte[] modul;
    public byte[] rid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CapkV2() {
        this.rid = new byte[5];
        this.expDate = new byte[3];
        this.checkSum = new byte[20];
    }

    protected CapkV2(Parcel parcel) {
        this.rid = new byte[5];
        this.expDate = new byte[3];
        this.checkSum = new byte[20];
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.rid = parcel.createByteArray();
        this.index = parcel.readByte();
        this.hashInd = parcel.readByte();
        this.arithInd = parcel.readByte();
        this.modul = parcel.createByteArray();
        this.exponent = parcel.createByteArray();
        this.expDate = parcel.createByteArray();
        this.checkSum = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.rid);
        parcel.writeByte(this.index);
        parcel.writeByte(this.hashInd);
        parcel.writeByte(this.arithInd);
        parcel.writeByteArray(this.modul);
        parcel.writeByteArray(this.exponent);
        parcel.writeByteArray(this.expDate);
        parcel.writeByteArray(this.checkSum);
    }

    public String toString() {
        return "CapkV2{rid=" + bytes2HexString(this.rid) + ", index=" + ((int) this.index) + ", hashInd=" + ((int) this.hashInd) + ", arithInd=" + ((int) this.arithInd) + ", modul=" + bytes2HexString(this.modul) + ", exponent=" + bytes2HexString(this.exponent) + ", expDate=" + bytes2HexString(this.expDate) + ", checkSum=" + bytes2HexString(this.checkSum) + '}';
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
