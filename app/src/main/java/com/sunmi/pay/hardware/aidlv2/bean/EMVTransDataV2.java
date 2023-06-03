package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class EMVTransDataV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<EMVTransDataV2> CREATOR = new Parcelable.Creator<EMVTransDataV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.EMVTransDataV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EMVTransDataV2 createFromParcel(Parcel parcel) {
            return new EMVTransDataV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EMVTransDataV2[] newArray(int i) {
            return new EMVTransDataV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public String amount;
    public String transType = "00";
    public int flowType = 1;
    public int cardType = 2;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EMVTransDataV2() {
    }

    protected EMVTransDataV2(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.amount = parcel.readString();
        this.transType = parcel.readString();
        this.flowType = parcel.readInt();
        this.cardType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.amount);
        parcel.writeString(this.transType);
        parcel.writeInt(this.flowType);
        parcel.writeInt(this.cardType);
    }

    public String toString() {
        return "EMVTransDataV2{amount='" + this.amount + "', transType='" + this.transType + "', flowType=" + this.flowType + ", cardType=" + this.cardType + '}';
    }
}
