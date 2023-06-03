package com.sunmi.pay.hardware.aidl.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class EmvTermParam implements Parcelable {
    public static final Parcelable.Creator<EmvTermParam> CREATOR = new Parcelable.Creator<EmvTermParam>() { // from class: com.sunmi.pay.hardware.aidl.bean.EmvTermParam.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EmvTermParam createFromParcel(Parcel parcel) {
            return new EmvTermParam(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EmvTermParam[] newArray(int i) {
            return new EmvTermParam[i];
        }
    };
    public boolean IsReadLogInCard;
    public String TTQ;
    public String accountType;
    public boolean adviceFlag;
    public boolean batchCapture;
    public boolean bypassAllFlg;
    public boolean bypassPin;
    public String currencyCode;
    public String currencyExp;
    public boolean ectSiFlg;
    public boolean ectSiVal;
    public boolean ectTlFlg;
    public String ectTlVal;
    public boolean forceOnline;
    public boolean getDataPIN;
    public boolean isSupportAccountSelect;
    public boolean isSupportExceptFile;
    public boolean isSupportMultiLang;
    public boolean isSupportSM;
    public boolean isSupportTransLog;
    private byte[] reserved;
    public boolean scriptMode;
    public boolean surportPSESel;
    public String tag9F1A;
    public String tag9F1E;
    public String tag9F33;
    public String tag9F35;
    public String tag9F40;
    public boolean termAIP;
    public boolean useTermAIPFlg;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EmvTermParam() {
        this.tag9F1E = "3030303030393035";
        this.tag9F35 = "22";
        this.tag9F1A = "0156";
        this.forceOnline = false;
        this.getDataPIN = true;
        this.surportPSESel = true;
        this.useTermAIPFlg = true;
        this.termAIP = true;
        this.bypassPin = true;
        this.ectSiFlg = true;
        this.ectSiVal = true;
        this.ectTlFlg = true;
        this.ectTlVal = "100000";
        this.tag9F33 = "E0F8C8";
        this.tag9F40 = "0300C00000";
        this.adviceFlag = true;
        this.isSupportSM = true;
        this.isSupportTransLog = true;
        this.isSupportMultiLang = true;
        this.isSupportExceptFile = true;
        this.isSupportAccountSelect = true;
        this.TTQ = "26000080";
        this.reserved = new byte[3];
        this.currencyCode = "0156";
        this.currencyExp = "02";
        this.accountType = "00";
    }

    protected EmvTermParam(Parcel parcel) {
        this.tag9F1E = "3030303030393035";
        this.tag9F35 = "22";
        this.tag9F1A = "0156";
        this.forceOnline = false;
        this.getDataPIN = true;
        this.surportPSESel = true;
        this.useTermAIPFlg = true;
        this.termAIP = true;
        this.bypassPin = true;
        this.ectSiFlg = true;
        this.ectSiVal = true;
        this.ectTlFlg = true;
        this.ectTlVal = "100000";
        this.tag9F33 = "E0F8C8";
        this.tag9F40 = "0300C00000";
        this.adviceFlag = true;
        this.isSupportSM = true;
        this.isSupportTransLog = true;
        this.isSupportMultiLang = true;
        this.isSupportExceptFile = true;
        this.isSupportAccountSelect = true;
        this.TTQ = "26000080";
        this.reserved = new byte[3];
        this.currencyCode = "0156";
        this.currencyExp = "02";
        this.accountType = "00";
        this.tag9F1E = parcel.readString();
        this.tag9F35 = parcel.readString();
        this.tag9F1A = parcel.readString();
        this.forceOnline = parcel.readByte() != 0;
        this.getDataPIN = parcel.readByte() != 0;
        this.surportPSESel = parcel.readByte() != 0;
        this.useTermAIPFlg = parcel.readByte() != 0;
        this.termAIP = parcel.readByte() != 0;
        this.bypassAllFlg = parcel.readByte() != 0;
        this.bypassPin = parcel.readByte() != 0;
        this.batchCapture = parcel.readByte() != 0;
        this.ectSiFlg = parcel.readByte() != 0;
        this.ectSiVal = parcel.readByte() != 0;
        this.ectTlFlg = parcel.readByte() != 0;
        this.ectTlVal = parcel.readString();
        this.tag9F33 = parcel.readString();
        this.tag9F40 = parcel.readString();
        this.scriptMode = parcel.readByte() != 0;
        this.adviceFlag = parcel.readByte() != 0;
        this.isSupportSM = parcel.readByte() != 0;
        this.isSupportTransLog = parcel.readByte() != 0;
        this.isSupportMultiLang = parcel.readByte() != 0;
        this.isSupportExceptFile = parcel.readByte() != 0;
        this.isSupportAccountSelect = parcel.readByte() != 0;
        this.TTQ = parcel.readString();
        this.IsReadLogInCard = parcel.readByte() != 0;
        this.reserved = parcel.createByteArray();
        this.currencyCode = parcel.readString();
        this.currencyExp = parcel.readString();
        this.accountType = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.tag9F1E);
        parcel.writeString(this.tag9F35);
        parcel.writeString(this.tag9F1A);
        parcel.writeByte(this.forceOnline ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.getDataPIN ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.surportPSESel ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useTermAIPFlg ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.termAIP ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.bypassAllFlg ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.bypassPin ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.batchCapture ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.ectSiFlg ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.ectSiVal ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.ectTlFlg ? (byte) 1 : (byte) 0);
        parcel.writeString(this.ectTlVal);
        parcel.writeString(this.tag9F33);
        parcel.writeString(this.tag9F40);
        parcel.writeByte(this.scriptMode ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.adviceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportSM ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportTransLog ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportMultiLang ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportExceptFile ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isSupportAccountSelect ? (byte) 1 : (byte) 0);
        parcel.writeString(this.TTQ);
        parcel.writeByte(this.IsReadLogInCard ? (byte) 1 : (byte) 0);
        parcel.writeByteArray(this.reserved);
        parcel.writeString(this.currencyCode);
        parcel.writeString(this.currencyExp);
        parcel.writeString(this.accountType);
    }

    public String toString() {
        return "EmvTermParam{tag9F1E='" + this.tag9F1E + "', tag9F35='" + this.tag9F35 + "', tag9F1A='" + this.tag9F1A + "', forceOnline=" + this.forceOnline + ", getDataPIN=" + this.getDataPIN + ", surportPSESel=" + this.surportPSESel + ", useTermAIPFlg=" + this.useTermAIPFlg + ", termAIP=" + this.termAIP + ", bypassAllFlg=" + this.bypassAllFlg + ", bypassPin=" + this.bypassPin + ", batchCapture=" + this.batchCapture + ", ectSiFlg=" + this.ectSiFlg + ", ectSiVal=" + this.ectSiVal + ", ectTlFlg=" + this.ectTlFlg + ", ectTlVal='" + this.ectTlVal + "', tag9F33='" + this.tag9F33 + "', tag9F40='" + this.tag9F40 + "', scriptMode=" + this.scriptMode + ", adviceFlag=" + this.adviceFlag + ", isSupportSM=" + this.isSupportSM + ", isSupportTransLog=" + this.isSupportTransLog + ", isSupportMultiLang=" + this.isSupportMultiLang + ", isSupportExceptFile=" + this.isSupportExceptFile + ", isSupportAccountSelect=" + this.isSupportAccountSelect + ", TTQ='" + this.TTQ + "', IsReadLogInCard=" + this.IsReadLogInCard + ", reserved=" + Arrays.toString(this.reserved) + ", currencyCode='" + this.currencyCode + "', currencyExp='" + this.currencyExp + "', accountType='" + this.accountType + "'}";
    }
}
