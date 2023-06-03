package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ApduRecvV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ApduRecvV2> CREATOR = new Parcelable.Creator<ApduRecvV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.ApduRecvV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApduRecvV2 createFromParcel(Parcel parcel) {
            return new ApduRecvV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApduRecvV2[] newArray(int i) {
            return new ApduRecvV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public byte[] outData;
    public short outlen;
    public byte swa;
    public byte swb;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ApduRecvV2() {
    }

    protected ApduRecvV2(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.outlen = (short) parcel.readInt();
        this.outData = parcel.createByteArray();
        this.swa = parcel.readByte();
        this.swb = parcel.readByte();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.outlen);
        parcel.writeByteArray(this.outData);
        parcel.writeByte(this.swa);
        parcel.writeByte(this.swb);
    }

    public String toString() {
        return "ApduRecvV2{outlen=" + ((int) this.outlen) + ", outData=" + bytes2HexString(this.outData) + ", swa=" + ((int) this.swa) + ", swb=" + ((int) this.swb) + '}';
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
