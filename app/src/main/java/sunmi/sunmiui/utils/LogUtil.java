package sunmi.sunmiui.utils;

import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
public class LogUtil {
    public static final int DEBUG = 2;
    public static final int ERROR = 5;
    public static final int INFO = 3;
    public static int LEVEL = 1;
    public static final int NOTHING = 6;
    public static final int VERBOSE = 1;
    public static final int WARN = 4;

    public static void setLevel(int i) {
        LEVEL = i;
    }

    public static void v(String str, String str2) {
        if (LEVEL > 1 || TextUtils.isEmpty(str2)) {
            return;
        }
        MyLog(1, str, str2);
    }

    public static void d(String str, String str2) {
        if (LEVEL > 2 || TextUtils.isEmpty(str2)) {
            return;
        }
        MyLog(2, str, str2);
    }

    public static void i(String str, String str2) {
        if (LEVEL > 3 || TextUtils.isEmpty(str2)) {
            return;
        }
        MyLog(3, str, str2);
    }

    public static void w(String str, String str2) {
        if (LEVEL > 4 || TextUtils.isEmpty(str2)) {
            return;
        }
        MyLog(4, str, str2);
    }

    public static void e(String str, String str2) {
        if (LEVEL > 5 || TextUtils.isEmpty(str2)) {
            return;
        }
        MyLog(5, str, str2);
    }

    private static void MyLog(int i, String str, String str2) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String fileName = stackTrace[4].getFileName();
        String methodName = stackTrace[4].getMethodName();
        String str3 = "[ (" + fileName + ":" + stackTrace[4].getLineNumber() + ")#" + (methodName.substring(0, 1).toUpperCase() + methodName.substring(1)) + " ] " + str2;
        if (i == 1) {
            Log.v(str, str3);
        } else if (i == 2) {
            Log.d(str, str3);
        } else if (i == 3) {
            Log.i(str, str3);
        } else if (i == 4) {
            Log.w(str, str3);
        } else if (i != 5) {
        } else {
            Log.e(str, str3);
        }
    }
}
