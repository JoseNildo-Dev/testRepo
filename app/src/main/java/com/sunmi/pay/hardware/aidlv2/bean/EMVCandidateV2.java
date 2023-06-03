package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class EMVCandidateV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<EMVCandidateV2> CREATOR = new Parcelable.Creator<EMVCandidateV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.EMVCandidateV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EMVCandidateV2 createFromParcel(Parcel parcel) {
            return new EMVCandidateV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EMVCandidateV2[] newArray(int i) {
            return new EMVCandidateV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public String aid;
    public String appLabel;
    public String appName;
    public String appPreName;
    public short index;
    public String issDiscrData;
    public byte kernelType;
    public byte priority;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EMVCandidateV2() {
    }

    protected EMVCandidateV2(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.index = (short) parcel.readInt();
        this.aid = parcel.readString();
        this.appPreName = parcel.readString();
        this.appLabel = parcel.readString();
        this.issDiscrData = parcel.readString();
        this.priority = parcel.readByte();
        this.appName = parcel.readString();
        this.kernelType = parcel.readByte();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeString(this.aid);
        parcel.writeString(this.appPreName);
        parcel.writeString(this.appLabel);
        parcel.writeString(this.issDiscrData);
        parcel.writeByte(this.priority);
        parcel.writeString(this.appName);
        parcel.writeByte(this.kernelType);
    }

    public String toString() {
        return "EMVCandidateV2{index=" + ((int) this.index) + ", aid='" + this.aid + "', appPreName='" + this.appPreName + "', appLabel='" + this.appLabel + "', issDiscrData='" + this.issDiscrData + "', priority=" + ((int) this.priority) + ", appName='" + this.appName + "', kernelType=" + ((int) this.kernelType) + '}';
    }
}
