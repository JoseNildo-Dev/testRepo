package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class DrlV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<DrlV2> CREATOR = new Parcelable.Creator<DrlV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.DrlV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DrlV2 createFromParcel(Parcel parcel) {
            return new DrlV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DrlV2[] newArray(int i) {
            return new DrlV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public byte[] cvmLmt;
    public boolean cvmLmtActivate;
    public boolean isDefaultLmt;
    public byte[] programID;
    public boolean statusCheck;
    public byte[] termClssFloorLmt;
    public byte termClssFloorLmtActivate;
    public byte[] termClssLmt;
    public boolean termClssLmtActivate;
    public byte[] termFloorLmt;
    public byte zeroCheck;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DrlV2() {
        this.isDefaultLmt = false;
        this.statusCheck = false;
        this.zeroCheck = (byte) 1;
        this.cvmLmt = new byte[6];
        this.termClssLmt = new byte[6];
        this.termClssFloorLmt = new byte[6];
        this.termFloorLmt = new byte[6];
        this.cvmLmtActivate = true;
        this.termClssLmtActivate = false;
        this.termClssFloorLmtActivate = (byte) 1;
    }

    protected DrlV2(Parcel parcel) {
        this.isDefaultLmt = false;
        this.statusCheck = false;
        this.zeroCheck = (byte) 1;
        this.cvmLmt = new byte[6];
        this.termClssLmt = new byte[6];
        this.termClssFloorLmt = new byte[6];
        this.termFloorLmt = new byte[6];
        this.cvmLmtActivate = true;
        this.termClssLmtActivate = false;
        this.termClssFloorLmtActivate = (byte) 1;
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.isDefaultLmt = parcel.readByte() != 0;
        this.statusCheck = parcel.readByte() != 0;
        this.zeroCheck = parcel.readByte();
        this.programID = parcel.createByteArray();
        this.cvmLmt = parcel.createByteArray();
        this.termClssLmt = parcel.createByteArray();
        this.termClssFloorLmt = parcel.createByteArray();
        this.termFloorLmt = parcel.createByteArray();
        this.cvmLmtActivate = parcel.readByte() != 0;
        this.termClssLmtActivate = parcel.readByte() != 0;
        this.termClssFloorLmtActivate = parcel.readByte();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isDefaultLmt ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.statusCheck ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zeroCheck);
        parcel.writeByteArray(this.programID);
        parcel.writeByteArray(this.cvmLmt);
        parcel.writeByteArray(this.termClssLmt);
        parcel.writeByteArray(this.termClssFloorLmt);
        parcel.writeByteArray(this.termFloorLmt);
        parcel.writeByte(this.cvmLmtActivate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.termClssLmtActivate ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.termClssFloorLmtActivate);
    }

    public String toString() {
        return "DrlV2{isDefaultLmt=" + this.isDefaultLmt + ", statusCheck=" + this.statusCheck + ", zeroCheck=" + ((int) this.zeroCheck) + ", programID=" + bytes2HexString(this.programID) + ", cvmLmt=" + bytes2HexString(this.cvmLmt) + ", termClssLmt=" + bytes2HexString(this.termClssLmt) + ", termClssOfflineFloorLmt=" + bytes2HexString(this.termClssFloorLmt) + ", termOfflineFloorLmt=" + bytes2HexString(this.termFloorLmt) + ", cvmLmtStatus=" + this.cvmLmtActivate + ", termClssLmtStatus=" + this.termClssLmtActivate + ", termClssOfflineFloorLmtStatus=" + ((int) this.termClssFloorLmtActivate) + '}';
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
