package com.sunmi.upgrade;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes.dex */
public class AppItem implements Serializable, Parcelable {
    public static final Parcelable.Creator<AppItem> CREATOR = new Parcelable.Creator<AppItem>() { // from class: com.sunmi.upgrade.AppItem.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppItem[] newArray(int i) {
            return new AppItem[i];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AppItem createFromParcel(Parcel parcel) {
            return new AppItem(parcel);
        }
    };
    public static final int DSD_STATE_APK_DISK_NOT_ENOUGH = 4;
    public static final int DSD_STATE_APK_INSTALL_FAIL = 2;
    public static final int DSD_STATE_APK_INSTALL_SUCCESS = 1;
    public static final int DSD_STATE_APK_SIGN_CONFLICT = 3;
    public static final int DSD_STATE_APK_UNINSTALL = 5;
    public static final int DSD_STATE_CMD_FAIL = 6;
    public static final int STATE_DISK_NOT_ENOUGH = 6;
    public static final int STATE_DOWNLOADED = 2;
    public static final int STATE_DOWNLOADING = 4;
    public static final int STATE_DOWNLOAD_DOWNLOADING = 3;
    public static final int STATE_DOWNLOAD_FAIL = 6;
    public static final int STATE_DOWNLOAD_PAUSE = 4;
    public static final int STATE_DOWNLOAD_START = 2;
    public static final int STATE_DOWNLOAD_SUCCESS = 5;
    public static final int STATE_DOWNLOAD_UNLOAD = 0;
    public static final int STATE_DOWNLOAD_UPDATE = 7;
    public static final int STATE_DOWNLOAD_WAIT = 1;
    public static final int STATE_FAIL_DOWNLOADED = 3;
    public static final int STATE_FAIL_INSTALL = 7;
    public static final int STATE_INSTALLED = 1;
    public static final int STATE_INSTALL_FAIL = 24;
    public static final int STATE_INSTALL_INSTALLING = 22;
    public static final int STATE_INSTALL_SS_FAIL = 104;
    public static final int STATE_INSTALL_SS_INSTALLING = 102;
    public static final int STATE_INSTALL_SS_START = 101;
    public static final int STATE_INSTALL_SS_SUCCESS = 103;
    public static final int STATE_INSTALL_SS_UNINSTALL = 105;
    public static final int STATE_INSTALL_SS_UNLOAD = 99;
    public static final int STATE_INSTALL_SS_WAIT = 100;
    public static final int STATE_INSTALL_START = 21;
    public static final int STATE_INSTALL_SUCCESS = 23;
    public static final int STATE_INSTALL_UNINSTALL = 25;
    public static final int STATE_INSTALL_WAIT = 20;
    public static final int STATE_NOT_INSTALLED = 10;
    public static final int STATE_PAUSE = 9;
    public static final int STATE_UPDATE = 8;
    public static final int STATE_WAIT = 5;
    public static final int TYPE_CHANNEL_APP = 1;
    public static final int TYPE_DEFAULT = 0;
    public int aId;
    public String appName;
    public double appPrice;
    public int defaultAppFlag;
    public String dev;
    public int doubleScreen;
    public int downLoadNum;
    public String downUrl;
    public long downloadedLength;
    public String fileName;
    public long fileSize;
    public String folderName;
    public String iconUrl;
    public long lastModify;
    public String md5;
    public String packageName;
    public float score;
    public String summary;
    public String targetPath;
    public String updateInfo;
    public int versionCode;
    public String versionName;
    public int installType = 1;
    public int state = 0;
    public int dsdState = 99;
    public boolean isUpdateState = false;
    public int appType = 0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppItem() {
    }

    public boolean isDoubleScreen() {
        return this.doubleScreen == 1;
    }

    public boolean isChannelApp() {
        return this.appType == 1;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int i) {
        this.state = i;
        if (7 == i) {
            this.isUpdateState = true;
        }
    }

    public int getDSDState() {
        return this.dsdState;
    }

    public void setDSDState(int i) {
        this.dsdState = i;
    }

    public int hashCode() {
        int i = (this.aId + 31) * 31;
        String str = this.packageName;
        return i + (str == null ? 0 : str.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return !TextUtils.isEmpty(this.packageName) && this.packageName.equals(((AppItem) obj).packageName);
        }
        return false;
    }

    public AppItem(Parcel parcel) {
        readFromParcel(parcel);
    }

    public void readFromParcel(Parcel parcel) {
        this.aId = parcel.readInt();
        this.appName = parcel.readString();
        this.downUrl = parcel.readString();
        this.installType = parcel.readInt();
        this.packageName = parcel.readString();
        this.versionCode = parcel.readInt();
        this.fileName = parcel.readString();
        this.folderName = parcel.readString();
        this.targetPath = parcel.readString();
        this.fileSize = parcel.readLong();
        this.downloadedLength = parcel.readLong();
        this.iconUrl = parcel.readString();
        this.versionName = parcel.readString();
        this.dev = parcel.readString();
        this.updateInfo = parcel.readString();
        this.summary = parcel.readString();
        this.downLoadNum = parcel.readInt();
        this.score = parcel.readFloat();
        this.state = parcel.readInt();
        this.lastModify = parcel.readLong();
        this.md5 = parcel.readString();
        this.doubleScreen = parcel.readInt();
        this.dsdState = parcel.readInt();
        this.defaultAppFlag = parcel.readInt();
        this.appPrice = parcel.readDouble();
        this.isUpdateState = parcel.readInt() == 1;
        this.appType = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.aId);
        parcel.writeString(this.appName);
        parcel.writeString(this.downUrl);
        parcel.writeInt(this.installType);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.fileName);
        parcel.writeString(this.folderName);
        parcel.writeString(this.targetPath);
        parcel.writeLong(this.fileSize);
        parcel.writeLong(this.downloadedLength);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.versionName);
        parcel.writeString(this.dev);
        parcel.writeString(this.updateInfo);
        parcel.writeString(this.summary);
        parcel.writeInt(this.downLoadNum);
        parcel.writeFloat(this.score);
        parcel.writeInt(this.state);
        parcel.writeLong(this.lastModify);
        parcel.writeString(this.md5);
        parcel.writeInt(this.doubleScreen);
        parcel.writeInt(this.dsdState);
        parcel.writeInt(this.defaultAppFlag);
        parcel.writeDouble(this.appPrice);
        parcel.writeInt(this.isUpdateState ? 1 : 0);
        parcel.writeInt(this.appType);
    }

    public String toString() {
        return "AppItem{appName='" + this.appName + "', packageName=" + this.packageName + ", downloadedLength=" + this.downloadedLength + ", state=" + this.state + ", doubleScreen=" + this.doubleScreen + ", dsdState=" + this.dsdState + ", isUpdateState=" + this.isUpdateState + '}';
    }

    public void setData(AppItem appItem) {
        this.aId = appItem.aId;
        this.appName = appItem.appName;
        this.downUrl = appItem.downUrl;
        this.installType = appItem.installType;
        this.packageName = appItem.packageName;
        this.versionCode = appItem.versionCode;
        this.fileSize = appItem.fileSize;
        this.iconUrl = appItem.iconUrl;
        this.versionName = appItem.versionName;
        this.dev = appItem.dev;
        this.updateInfo = appItem.updateInfo;
        this.summary = appItem.summary;
        this.downLoadNum = appItem.downLoadNum;
        this.score = appItem.score;
        this.lastModify = appItem.lastModify;
        this.md5 = appItem.md5;
        this.fileName = appItem.fileName;
        this.folderName = appItem.folderName;
        this.targetPath = appItem.targetPath;
        this.downloadedLength = appItem.downloadedLength;
        this.state = appItem.state;
        this.doubleScreen = appItem.doubleScreen;
        this.dsdState = appItem.dsdState;
        this.defaultAppFlag = appItem.defaultAppFlag;
        this.appPrice = appItem.appPrice;
        this.isUpdateState = appItem.isUpdateState;
    }
}
