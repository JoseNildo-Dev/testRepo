package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class RevocListV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<RevocListV2> CREATOR = new Parcelable.Creator<RevocListV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.RevocListV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RevocListV2 createFromParcel(Parcel parcel) {
            return new RevocListV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RevocListV2[] newArray(int i) {
            return new RevocListV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public byte index;
    public byte[] reserved;
    public byte[] rid;
    public byte[] sn;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public RevocListV2() {
        this.rid = new byte[5];
        this.sn = new byte[3];
        this.reserved = new byte[3];
    }

    protected RevocListV2(Parcel parcel) {
        this.rid = new byte[5];
        this.sn = new byte[3];
        this.reserved = new byte[3];
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.rid = parcel.createByteArray();
        this.index = parcel.readByte();
        this.sn = parcel.createByteArray();
        this.reserved = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.rid);
        parcel.writeByte(this.index);
        parcel.writeByteArray(this.sn);
        parcel.writeByteArray(this.reserved);
    }

    public String toString() {
        return "RevocListV2{rid=" + bytes2HexString(this.rid) + ", index=" + ((int) this.index) + ", sn=" + bytes2HexString(this.sn) + ", reserved=" + bytes2HexString(this.reserved) + '}';
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

    public String toTlvString() {
        return "9F0605" + bytes2HexString(this.rid) + "8F01" + bytes2HexString(this.index) + "DF810503" + bytes2HexString(this.sn);
    }
}
