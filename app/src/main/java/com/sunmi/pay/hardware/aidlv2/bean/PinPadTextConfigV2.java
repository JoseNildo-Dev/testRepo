package com.sunmi.pay.hardware.aidlv2.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public class PinPadTextConfigV2 implements Parcelable, Serializable {
    public static final Parcelable.Creator<PinPadTextConfigV2> CREATOR = new Parcelable.Creator<PinPadTextConfigV2>() { // from class: com.sunmi.pay.hardware.aidlv2.bean.PinPadTextConfigV2.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PinPadTextConfigV2 createFromParcel(Parcel parcel) {
            return new PinPadTextConfigV2(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PinPadTextConfigV2[] newArray(int i) {
            return new PinPadTextConfigV2[i];
        }
    };
    private static final long serialVersionUID = -1;
    public String confirm;
    public String inputOfflinePin;
    public String inputPin;
    public String reinputOfflinePinFormat;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PinPadTextConfigV2() {
    }

    protected PinPadTextConfigV2(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.confirm = parcel.readString();
        this.inputPin = parcel.readString();
        this.inputOfflinePin = parcel.readString();
        this.reinputOfflinePinFormat = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.confirm);
        parcel.writeString(this.inputPin);
        parcel.writeString(this.inputOfflinePin);
        parcel.writeString(this.reinputOfflinePinFormat);
    }
}
