package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class CardInfo implements Parcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new Parcelable.Creator<CardInfo>() { // from class: com.sunmi.pay.hardware.aidl.bean.CardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CardInfo createFromParcel(Parcel parcel) {
            return new CardInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CardInfo[] newArray(int i) {
            return new CardInfo[i];
        }
    };
    public String atr;
    public String cardNo;
    public String cardSerialNo;
    public int cardType;
    public String countryCode;
    public String expireDate;
    public boolean isCardSerialNo;
    public String serviceCode;
    public String track1;
    public String track2;
    public String track3;
    public String uuid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CardInfo() {
    }

    protected CardInfo(Parcel parcel) {
        this.cardType = parcel.readInt();
        this.cardNo = parcel.readString();
        this.track1 = parcel.readString();
        this.track2 = parcel.readString();
        this.track3 = parcel.readString();
        this.expireDate = parcel.readString();
        this.serviceCode = parcel.readString();
        this.countryCode = parcel.readString();
        this.uuid = parcel.readString();
        this.atr = parcel.readString();
        this.cardSerialNo = parcel.readString();
        this.isCardSerialNo = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.cardType);
        parcel.writeString(this.cardNo);
        parcel.writeString(this.track1);
        parcel.writeString(this.track2);
        parcel.writeString(this.track3);
        parcel.writeString(this.expireDate);
        parcel.writeString(this.serviceCode);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.uuid);
        parcel.writeString(this.atr);
        parcel.writeString(this.cardSerialNo);
        parcel.writeByte(this.isCardSerialNo ? (byte) 1 : (byte) 0);
    }

    public void readFromParcel(Parcel parcel) {
        this.cardType = parcel.readInt();
        this.cardNo = parcel.readString();
        this.track1 = parcel.readString();
        this.track2 = parcel.readString();
        this.track3 = parcel.readString();
        this.expireDate = parcel.readString();
        this.serviceCode = parcel.readString();
        this.countryCode = parcel.readString();
        this.uuid = parcel.readString();
        this.atr = parcel.readString();
        this.cardSerialNo = parcel.readString();
        this.isCardSerialNo = parcel.readByte() != 0;
    }

    public String toString() {
        return "CardInfo{cardType=" + this.cardType + ", cardNo='" + this.cardNo + "', track1='" + this.track1 + "', track2='" + this.track2 + "', track3='" + this.track3 + "', expireDate='" + this.expireDate + "', serviceCode='" + this.serviceCode + "', countryCode='" + this.countryCode + "', isCardSerialNo=" + this.isCardSerialNo + ", cardSerialNo='" + this.cardSerialNo + "', uuid='" + this.uuid + "', atr='" + this.atr + "'}";
    }
}
