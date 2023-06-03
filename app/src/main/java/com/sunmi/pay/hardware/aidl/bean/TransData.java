package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class TransData implements Parcelable {
    public static final Parcelable.Creator<TransData> CREATOR = new Parcelable.Creator<TransData>() { // from class: com.sunmi.pay.hardware.aidl.bean.TransData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransData createFromParcel(Parcel parcel) {
            return new TransData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TransData[] newArray(int i) {
            return new TransData[i];
        }
    };
    public String amount;
    public int isForceOnline;
    public String transType;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected TransData(Parcel parcel) {
        this.transType = "00";
        this.amount = parcel.readString();
        this.transType = parcel.readString();
        this.isForceOnline = parcel.readInt();
    }

    public TransData() {
        this.transType = "00";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.amount);
        parcel.writeString(this.transType);
        parcel.writeInt(this.isForceOnline);
    }
}
