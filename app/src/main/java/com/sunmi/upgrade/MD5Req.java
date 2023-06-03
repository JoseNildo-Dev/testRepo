package com.sunmi.upgrade;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class MD5Req {
    public String language;
    public AppUpdateCheckReq params;
    public String region;
    public String jsonParams = "";
    public String isEncrypted = Constant.IS_ENCRYPTED;
    public String timeStamp = "";
    public String randomNum = "";
    public String sign = "";
    public String timeZone = getCurrentTimeZone();

    public MD5Req(AppUpdateCheckReq appUpdateCheckReq, Context context) {
        this.region = context.getResources().getConfiguration().locale.getCountry();
        this.language = getCurrentLanguage(context);
        this.params = appUpdateCheckReq;
        md5();
    }

    private void md5() {
        if (TextUtils.isEmpty(this.timeStamp)) {
            this.timeStamp = getGMTime() + "";
        }
        while (this.randomNum.length() < 6) {
            this.randomNum += ((int) (Math.random() * 10.0d));
        }
        this.jsonParams = this.params.toJson();
        if (this.isEncrypted.equals("1")) {
            try {
                this.jsonParams = DesUtils.encode(Constant.DES_KEY, this.jsonParams);
            } catch (Exception e) {
                Log.e("error", "Des encode fail");
                e.printStackTrace();
            }
        }
        this.sign = this.jsonParams + this.isEncrypted + this.timeStamp + this.randomNum + MD5Utils.md5(Constant.DELIVER_KEY);
        this.sign = MD5Utils.md5(this.sign);
    }

    private long getGMTime() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public static String getCurrentTimeZone() {
        return TimeZone.getDefault().getDisplayName(false, 0);
    }

    public static String getCurrentLanguage(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return language + "_" + country;
    }
}
