package com.sunmi.upgrade;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class App implements Parcelable {
    public static final Parcelable.Creator<App> CREATOR = new Parcelable.Creator<App>() { // from class: com.sunmi.upgrade.App.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public App createFromParcel(Parcel parcel) {
            return new App(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public App[] newArray(int i) {
            return new App[i];
        }
    };
    private int aId;
    private String appName;
    private double appPrice;
    private int defaultAppFlag;
    private String dev;
    private int doubleScreen;
    private int downLoadNum;
    private String downUrl;
    private long fileSize;
    private String iconUrl;
    private int installType;
    private long lastModify;
    private String md5;
    private String packageName;
    private int score;
    private String sn;
    private String summary;
    private String updateInfo;
    private int versionCode;
    private String versionName;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public App() {
    }

    protected App(Parcel parcel) {
        this.aId = parcel.readInt();
        this.appName = parcel.readString();
        this.installType = parcel.readInt();
        this.downUrl = parcel.readString();
        this.packageName = parcel.readString();
        this.versionCode = parcel.readInt();
        this.versionName = parcel.readString();
        this.fileSize = parcel.readLong();
        this.downLoadNum = parcel.readInt();
        this.lastModify = parcel.readLong();
        this.iconUrl = parcel.readString();
        this.summary = parcel.readString();
        this.dev = parcel.readString();
        this.score = parcel.readInt();
        this.updateInfo = parcel.readString();
        this.md5 = parcel.readString();
        this.doubleScreen = parcel.readInt();
        this.defaultAppFlag = parcel.readInt();
        this.appPrice = parcel.readDouble();
        this.sn = parcel.readString();
    }

    public int getId() {
        return this.aId;
    }

    public void setId(int i) {
        this.aId = i;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public int getInstallType() {
        return this.installType;
    }

    public void setInstallType(int i) {
        this.installType = i;
    }

    public String getDownUrl() {
        String str = this.downUrl;
        if (str == null || str.length() < 8) {
            return this.downUrl;
        }
        if (TextUtils.equals("https://", this.downUrl.substring(0, 8))) {
            return this.downUrl;
        }
        this.downUrl = this.downUrl.replace("http://", "https://");
        return this.downUrl;
    }

    public void setDownUrl(String str) {
        this.downUrl = str;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public long getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(long j) {
        this.fileSize = j;
    }

    public int getDownLoadNum() {
        return this.downLoadNum;
    }

    public void setDownLoadNum(int i) {
        this.downLoadNum = i;
    }

    public long getLastModify() {
        return this.lastModify;
    }

    public void setLastModify(long j) {
        this.lastModify = j;
    }

    public String getIconUrl() {
        String str = this.iconUrl;
        if (str == null || str.length() < 8) {
            return this.iconUrl;
        }
        if (Constant.MSN.contains("P1")) {
            if (TextUtils.equals("https://", this.iconUrl.substring(0, 8))) {
                return this.iconUrl;
            }
            this.iconUrl = this.iconUrl.replace("http://", "https://");
            return this.iconUrl;
        }
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public String getDev() {
        return this.dev;
    }

    public void setDev(String str) {
        this.dev = str;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int i) {
        this.score = i;
    }

    public String getUpdateInfo() {
        return this.updateInfo;
    }

    public void setUpdateInfo(String str) {
        this.updateInfo = str;
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public int getDoubleScreen() {
        return this.doubleScreen;
    }

    public void setDoubleScreen(int i) {
        this.doubleScreen = i;
    }

    public void setDefaultAppFlag(int i) {
        this.defaultAppFlag = i;
    }

    public int getDefaultAppFlag() {
        return this.defaultAppFlag;
    }

    public double getAppPrice() {
        return this.appPrice;
    }

    public void setAppPrice(double d) {
        this.appPrice = d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.aId);
        parcel.writeString(this.appName);
        parcel.writeInt(this.installType);
        parcel.writeString(this.downUrl);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.versionCode);
        parcel.writeString(this.versionName);
        parcel.writeLong(this.fileSize);
        parcel.writeInt(this.downLoadNum);
        parcel.writeLong(this.lastModify);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.summary);
        parcel.writeString(this.dev);
        parcel.writeInt(this.score);
        parcel.writeString(this.updateInfo);
        parcel.writeString(this.md5);
        parcel.writeInt(this.doubleScreen);
        parcel.writeInt(this.defaultAppFlag);
        parcel.writeDouble(this.appPrice);
        parcel.writeString(this.sn);
    }

    public void initByJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.aId = jSONObject.getInt("aId");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            try {
                this.appName = jSONObject.getString("appName");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            try {
                this.installType = jSONObject.getInt("installType");
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            try {
                this.downUrl = jSONObject.getString("downUrl");
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
            try {
                this.packageName = jSONObject.getString("packageName");
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
            try {
                this.versionCode = jSONObject.getInt("versionCode");
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            try {
                this.versionName = jSONObject.getString("versionName");
            } catch (JSONException e7) {
                e7.printStackTrace();
            }
            try {
                this.fileSize = jSONObject.getLong("fileSize");
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            try {
                this.downLoadNum = jSONObject.getInt("downLoadNum");
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            try {
                this.lastModify = jSONObject.getLong("lastModify");
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            try {
                this.iconUrl = jSONObject.getString("iconUrl");
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
            try {
                this.summary = jSONObject.getString("summary");
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
            try {
                this.dev = jSONObject.getString("dev");
            } catch (JSONException e13) {
                e13.printStackTrace();
            }
            try {
                this.score = jSONObject.getInt("score");
            } catch (JSONException e14) {
                e14.printStackTrace();
            }
            try {
                this.updateInfo = jSONObject.getString("updateInfo");
            } catch (JSONException e15) {
                e15.printStackTrace();
            }
            try {
                this.md5 = jSONObject.getString("md5");
            } catch (JSONException e16) {
                e16.printStackTrace();
            }
        }
    }

    public String getSn() {
        return this.sn;
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public String toString() {
        return "App{aId=" + this.aId + ", appName='" + this.appName + "', installType=" + this.installType + ", downUrl='" + this.downUrl + "', packageName='" + this.packageName + "', versionCode=" + this.versionCode + ", versionName='" + this.versionName + "', fileSize=" + this.fileSize + ", downLoadNum=" + this.downLoadNum + ", lastModify=" + this.lastModify + ", iconUrl='" + this.iconUrl + "', summary='" + this.summary + "', dev='" + this.dev + "', score=" + this.score + ", updateInfo='" + this.updateInfo + "', md5='" + this.md5 + "', doubleScreen=" + this.doubleScreen + ", defaultAppFlag=" + this.defaultAppFlag + ", appPrice=" + this.appPrice + '}';
    }
}
