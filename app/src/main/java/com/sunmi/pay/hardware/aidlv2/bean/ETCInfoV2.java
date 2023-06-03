package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ETCInfoV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<ETCInfoV2> CREATOR = new Parcelable.Creator<ETCInfoV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.ETCInfoV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ETCInfoV2 createFromParcel(Parcel parcel) {
            return new ETCInfoV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ETCInfoV2[] newArray(int i) {
            return new ETCInfoV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public int amount;
    public String cardType;
    public String deviceNo;
    public String deviceStatus;
    public String licensePlateColor;
    public String licensePlateNo;
    public int signal;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ETCInfoV2() {
    }

    protected ETCInfoV2(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.deviceNo = parcel.readString();
        this.deviceStatus = parcel.readString();
        this.cardType = parcel.readString();
        this.amount = parcel.readInt();
        this.licensePlateColor = parcel.readString();
        this.licensePlateNo = parcel.readString();
        this.signal = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.deviceNo);
        parcel.writeString(this.deviceStatus);
        parcel.writeString(this.cardType);
        parcel.writeInt(this.amount);
        parcel.writeString(this.licensePlateColor);
        parcel.writeString(this.licensePlateNo);
        parcel.writeInt(this.signal);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ETCInfoV2) {
            return TextUtils.equals(this.deviceNo, ((ETCInfoV2) obj).deviceNo);
        }
        return false;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(this.deviceNo)) {
            return 0;
        }
        return this.deviceNo.hashCode();
    }

    public String toString() {
        return "ETCInfoV2{deviceNo='" + this.deviceNo + "', deviceStatus='" + this.deviceStatus + "', cardType='" + this.cardType + "', amount=" + this.amount + ", licensePlateColor='" + this.licensePlateColor + "', licensePlateNo='" + this.licensePlateNo + "', signal=" + this.signal + '}';
    }
}
