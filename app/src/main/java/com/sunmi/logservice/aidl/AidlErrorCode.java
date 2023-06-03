package com.sunmi.logservice.aidl;

import android.app.Application;
import android.content.Context;
import com.sunmi.loglib.R;
import java.lang.reflect.Method;
import sunmi.loglib.SunmiLogKernel;

/* loaded from: classes.dex */
public enum AidlErrorCode {
    UNKNOWN(Integer.MIN_VALUE, getString(R.string.unknown)),
    LOG_PRODUCER_OK(0, getString(R.string.ls_success)),
    LOG_PRODUCER_INVALID(1, getString(R.string.ls_invalid)),
    LOG_PRODUCER_NETWORK_ERROR(2, getString(R.string.ls_network_error)),
    LOG_PRODUCER_SERVER_ERROR(3, getString(R.string.ls_server_error)),
    LOG_PRODUCER_CONNECT_TIMEOUT_EXCEPTION(4, getString(R.string.ls_connect_timeout_exception)),
    LOG_PRODUCER_SOCKET_TIMEOUT_EXCEPTION(5, getString(R.string.ls_socket_timeout_exception));
    
    private int code;
    private String msg;

    AidlErrorCode(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public static AidlErrorCode valueOf(int i) {
        AidlErrorCode[] values;
        for (AidlErrorCode aidlErrorCode : values()) {
            if (aidlErrorCode.code == i) {
                return aidlErrorCode;
            }
        }
        return UNKNOWN;
    }

    private static String getString(int i) {
        Context appContext = SunmiLogKernel.getInstance().getAppContext();
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
