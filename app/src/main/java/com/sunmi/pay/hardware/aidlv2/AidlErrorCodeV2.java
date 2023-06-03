package com.sunmi.pay.hardware.aidlv2;

import android.app.Application;
import android.content.Context;
import com.sunmi.pay.hardware.aidl.AidlErrorCode;
import com.sunmi.paylib.R;
import java.lang.reflect.Method;
import sunmi.paylib.SunmiPayKernel;

/* loaded from: classes.dex */
public enum AidlErrorCodeV2 {
    AIDL_ERROR(Integer.MIN_VALUE, getString(R.string.unknown));
    
    private int code;
    private String msg;

    AidlErrorCodeV2(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public static AidlErrorCodeV2 valueOf(int i) {
        AidlErrorCode valueOf = AidlErrorCode.valueOf(i);
        AIDL_ERROR.code = valueOf.getCode();
        AIDL_ERROR.msg = valueOf.getMsg();
        return AIDL_ERROR;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    private static String getString(int i) {
        Context appContext = SunmiPayKernel.getInstance().getAppContext();
        if (appContext != null) {
            return appContext.getString(i);
        }
        Application application = getApplication();
        return application == null ? "unknown error" : application.getString(i);
    }

    private static Application getApplication() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("getApplication", new Class[0]);
            declaredMethod2.setAccessible(true);
            return (Application) declaredMethod2.invoke(invoke, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
