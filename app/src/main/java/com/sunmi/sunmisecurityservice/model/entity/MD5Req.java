package com.sunmi.sunmisecurityservice.model.entity;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.sunmi.sunmisecurityservice.app.Constant;
import com.sunmi.sunmisecurityservice.util.DateUtils;
import com.sunmi.sunmisecurityservice.util.I18NUtils;
import com.sunmi.sunmisecurityservice.util.MD5Utils;
import com.sunmi.upgrade.DesUtils;

/* loaded from: classes.dex */
public class MD5Req<T> {
    public String isEncrypted;
    public String jsonParams;
    public String language;
    public T params;
    public String randomNum;
    public String sign;
    public String timeStamp;
    public String timeZone;

    public MD5Req(T t) {
        this.jsonParams = "";
        this.isEncrypted = "0";
        this.timeStamp = "";
        this.randomNum = "";
        this.sign = "";
        this.params = t;
        md5();
    }

    public MD5Req(T t, String str) {
        this.jsonParams = "";
        this.isEncrypted = "0";
        this.timeStamp = "";
        this.randomNum = "";
        this.sign = "";
        this.params = t;
        this.isEncrypted = str;
        md5();
    }

    private void md5() {
        if (TextUtils.isEmpty(this.timeStamp)) {
            this.timeStamp = DateUtils._getGMTime() + "";
        }
        if (TextUtils.equals(Constant.IS_ENCRYPTED, "1")) {
            this.isEncrypted = "1";
        } else {
            this.isEncrypted = "0";
        }
        while (this.randomNum.length() < 6) {
            this.randomNum += ((int) (Math.random() * 10.0d));
        }
        this.jsonParams = new Gson().toJson(this.params);
        this.jsonParams = this.jsonParams.replace(" ", "");
        if (this.isEncrypted.equals("1")) {
            try {
                this.jsonParams = DesUtils.encode(Constant.DES_KEY, this.jsonParams);
                System.out.println("jsonParams:" + this.jsonParams);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.sign = this.jsonParams + this.isEncrypted + this.timeStamp + this.randomNum + MD5Utils.md5(Constant.IDELIVER_KEY);
        this.sign = MD5Utils.md5(this.sign);
        this.timeZone = I18NUtils.getCurrentTimeZone();
        this.language = Constant.LANGUAGE;
    }
}
