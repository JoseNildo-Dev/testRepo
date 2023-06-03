package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AidV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<AidV2> CREATOR = new Parcelable.Creator<AidV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.AidV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AidV2 createFromParcel(Parcel parcel) {
            return new AidV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AidV2[] newArray(int i) {
            return new AidV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public byte[] AcquierId;
    public byte[] TACDefault;
    public byte[] TACDenial;
    public byte[] TACOnline;
    public byte[] aid;
    public byte clsStatusCheck;
    public byte[] cvmLmt;
    public byte[] dDOL;
    public byte[] floorLimit;
    public byte[] kernelID;
    public byte kernelType;
    public byte maxTargetPer;
    public byte[] merchCateCode;
    public byte[] merchId;
    public byte[] merchName;
    public byte paramType;
    public byte rMDLen;
    public byte randTransSel;
    public byte[] referCurrCode;
    public byte[] referCurrCon;
    public byte referCurrExp;
    public byte[] riskManData;
    public byte selFlag;
    public byte[] tDOL;
    public byte targetPer;
    public byte[] termClssLmt;
    public byte[] termClssOfflineFloorLmt;
    public byte[] termId;
    public byte[] termOfflineFloorLmt;
    public byte[] threshold;
    public byte[] ttq;
    public byte velocityCheck;
    public byte[] version;
    public byte zeroCheck;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AidV2() {
        this.cvmLmt = new byte[6];
        this.termClssLmt = new byte[6];
        this.termClssOfflineFloorLmt = new byte[6];
        this.termOfflineFloorLmt = new byte[6];
        this.threshold = new byte[4];
        this.TACDenial = new byte[5];
        this.TACOnline = new byte[5];
        this.TACDefault = new byte[5];
        this.AcquierId = new byte[6];
        this.version = new byte[2];
        this.riskManData = new byte[8];
        this.merchName = new byte[128];
        this.merchCateCode = new byte[2];
        this.merchId = new byte[16];
        this.termId = new byte[8];
        this.referCurrCode = new byte[]{1, 86};
        this.referCurrCon = new byte[4];
        this.ttq = new byte[4];
    }

    protected AidV2(Parcel parcel) {
        this.cvmLmt = new byte[6];
        this.termClssLmt = new byte[6];
        this.termClssOfflineFloorLmt = new byte[6];
        this.termOfflineFloorLmt = new byte[6];
        this.threshold = new byte[4];
        this.TACDenial = new byte[5];
        this.TACOnline = new byte[5];
        this.TACDefault = new byte[5];
        this.AcquierId = new byte[6];
        this.version = new byte[2];
        this.riskManData = new byte[8];
        this.merchName = new byte[128];
        this.merchCateCode = new byte[2];
        this.merchId = new byte[16];
        this.termId = new byte[8];
        this.referCurrCode = new byte[]{1, 86};
        this.referCurrCon = new byte[4];
        this.ttq = new byte[4];
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.aid = parcel.createByteArray();
        this.cvmLmt = parcel.createByteArray();
        this.termClssLmt = parcel.createByteArray();
        this.termClssOfflineFloorLmt = parcel.createByteArray();
        this.termOfflineFloorLmt = parcel.createByteArray();
        this.selFlag = parcel.readByte();
        this.targetPer = parcel.readByte();
        this.maxTargetPer = parcel.readByte();
        this.floorLimit = parcel.createByteArray();
        this.randTransSel = parcel.readByte();
        this.velocityCheck = parcel.readByte();
        this.threshold = parcel.createByteArray();
        this.TACDenial = parcel.createByteArray();
        this.TACOnline = parcel.createByteArray();
        this.TACDefault = parcel.createByteArray();
        this.AcquierId = parcel.createByteArray();
        this.dDOL = parcel.createByteArray();
        this.tDOL = parcel.createByteArray();
        this.version = parcel.createByteArray();
        this.rMDLen = parcel.readByte();
        this.riskManData = parcel.createByteArray();
        this.merchName = parcel.createByteArray();
        this.merchCateCode = parcel.createByteArray();
        this.merchId = parcel.createByteArray();
        this.termId = parcel.createByteArray();
        this.referCurrCode = parcel.createByteArray();
        this.referCurrExp = parcel.readByte();
        this.referCurrCon = parcel.createByteArray();
        this.clsStatusCheck = parcel.readByte();
        this.zeroCheck = parcel.readByte();
        this.kernelType = parcel.readByte();
        this.paramType = parcel.readByte();
        this.ttq = parcel.createByteArray();
        this.kernelID = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.aid);
        parcel.writeByteArray(this.cvmLmt);
        parcel.writeByteArray(this.termClssLmt);
        parcel.writeByteArray(this.termClssOfflineFloorLmt);
        parcel.writeByteArray(this.termOfflineFloorLmt);
        parcel.writeByte(this.selFlag);
        parcel.writeByte(this.targetPer);
        parcel.writeByte(this.maxTargetPer);
        parcel.writeByteArray(this.floorLimit);
        parcel.writeByte(this.randTransSel);
        parcel.writeByte(this.velocityCheck);
        parcel.writeByteArray(this.threshold);
        parcel.writeByteArray(this.TACDenial);
        parcel.writeByteArray(this.TACOnline);
        parcel.writeByteArray(this.TACDefault);
        parcel.writeByteArray(this.AcquierId);
        parcel.writeByteArray(this.dDOL);
        parcel.writeByteArray(this.tDOL);
        parcel.writeByteArray(this.version);
        parcel.writeByte(this.rMDLen);
        parcel.writeByteArray(this.riskManData);
        parcel.writeByteArray(this.merchName);
        parcel.writeByteArray(this.merchCateCode);
        parcel.writeByteArray(this.merchId);
        parcel.writeByteArray(this.termId);
        parcel.writeByteArray(this.referCurrCode);
        parcel.writeByte(this.referCurrExp);
        parcel.writeByteArray(this.referCurrCon);
        parcel.writeByte(this.clsStatusCheck);
        parcel.writeByte(this.zeroCheck);
        parcel.writeByte(this.kernelType);
        parcel.writeByte(this.paramType);
        parcel.writeByteArray(this.ttq);
        parcel.writeByteArray(this.kernelID);
    }

    public String toString() {
        return "AidV2{aid=" + bytes2HexString(this.aid) + ", cvmLmt=" + bytes2HexString(this.cvmLmt) + ", termClssLmt=" + bytes2HexString(this.termClssLmt) + ", termClssOfflineFloorLmt=" + bytes2HexString(this.termClssOfflineFloorLmt) + ", termOfflineFloorLmt=" + bytes2HexString(this.termOfflineFloorLmt) + ", selFlag=" + ((int) this.selFlag) + ", targetPer=" + ((int) this.targetPer) + ", maxTargetPer=" + ((int) this.maxTargetPer) + ", floorLimit=" + bytes2HexString(this.floorLimit) + ", randTransSel=" + ((int) this.randTransSel) + ", velocityCheck=" + ((int) this.velocityCheck) + ", threshold=" + bytes2HexString(this.threshold) + ", TACDenial=" + bytes2HexString(this.TACDenial) + ", TACOnline=" + bytes2HexString(this.TACOnline) + ", TACDefault=" + bytes2HexString(this.TACDefault) + ", AcquierId=" + bytes2HexString(this.AcquierId) + ", dDOL=" + bytes2HexString(this.dDOL) + ", tDOL=" + bytes2HexString(this.tDOL) + ", version=" + bytes2HexString(this.version) + ", rMDLen=" + ((int) this.rMDLen) + ", riskManData=" + bytes2HexString(this.riskManData) + ", merchName=" + bytes2HexString(this.merchName) + ", merchCateCode=" + bytes2HexString(this.merchCateCode) + ", merchId=" + bytes2HexString(this.merchId) + ", termId=" + bytes2HexString(this.termId) + ", referCurrCode=" + bytes2HexString(this.referCurrCode) + ", referCurrExp=" + ((int) this.referCurrExp) + ", referCurrCon=" + bytes2HexString(this.referCurrCon) + ", clsStatusCheck=" + ((int) this.clsStatusCheck) + ", zeroCheck=" + ((int) this.zeroCheck) + ", kernelType=" + ((int) this.kernelType) + ", paramType=" + ((int) this.paramType) + ", ttq=" + bytes2HexString(this.ttq) + ", kernelID=" + bytes2HexString(this.kernelID) + '}';
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
