package com.sunmi.sunmisecurityservice.model.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class AuthCodeData implements Parcelable {
    public static final Parcelable.Creator<AuthCodeData> CREATOR = new Parcelable.Creator<AuthCodeData>() { // from class: com.sunmi.sunmisecurityservice.model.entity.AuthCodeData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthCodeData createFromParcel(Parcel parcel) {
            return new AuthCodeData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AuthCodeData[] newArray(int i) {
            return new AuthCodeData[i];
        }
    };
    public String authCode;
    public String randomNum;
    public String targetState;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected AuthCodeData(Parcel parcel) {
        this.authCode = parcel.readString();
        this.randomNum = parcel.readString();
        this.targetState = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.authCode);
        parcel.writeString(this.randomNum);
        parcel.writeString(this.targetState);
    }
}
