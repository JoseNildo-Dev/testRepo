package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ApduSendV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ApduSendV2> CREATOR = new Parcelable.Creator<ApduSendV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.ApduSendV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApduSendV2 createFromParcel(Parcel parcel) {
            return new ApduSendV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApduSendV2[] newArray(int i) {
            return new ApduSendV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public byte[] command;
    public byte[] dataIn;
    public short lc;
    public short le;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ApduSendV2() {
    }

    protected ApduSendV2(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.command = parcel.createByteArray();
        this.lc = (short) parcel.readInt();
        this.dataIn = parcel.createByteArray();
        this.le = (short) parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.command);
        parcel.writeInt(this.lc);
        parcel.writeByteArray(this.dataIn);
        parcel.writeInt(this.le);
    }

    public String toString() {
        return "ApduSendV2{command=" + bytes2HexString(this.command) + ", lc=" + ((int) this.lc) + ", dataIn=" + bytes2HexString(this.dataIn) + ", le=" + ((int) this.le) + '}';
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
