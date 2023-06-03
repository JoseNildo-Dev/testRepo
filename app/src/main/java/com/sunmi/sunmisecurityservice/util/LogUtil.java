package com.sunmi.sunmisecurityservice.util;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class LogUtil {
    public static final boolean DEBUG = false;
    private static volatile List<byte[]> transferQueue;

    public static void setTransferQueue(List<byte[]> list) {
        transferQueue = list;
    }

    public static void addTransferLog(byte[] bArr, int i, int i2) {
        if (transferQueue != null) {
            synchronized (transferQueue) {
                transferQueue.add(Arrays.copyOfRange(bArr, i, i2 + i));
                while (transferQueue.size() > 2048) {
                    transferQueue.remove(0);
                }
            }
        }
    }

    public static void v(String str, String str2) {
        if (DEBUG) {
            Thread currentThread = Thread.currentThread();
            LogFile.getInstance().v(getMicroTime(), currentThread.getId(), str, str2, currentThread.getStackTrace()[3]);
        }
    }

    public static void i(String str, String str2) {
        if (DEBUG) {
            Thread currentThread = Thread.currentThread();
            LogFile.getInstance().i(getMicroTime(), currentThread.getId(), str, str2, currentThread.getStackTrace()[3]);
        }
    }

    public static void d(String str, String str2) {
        if (DEBUG) {
            Thread currentThread = Thread.currentThread();
            LogFile.getInstance().d(getMicroTime(), currentThread.getId(), str, str2, currentThread.getStackTrace()[3]);
        }
    }

    public static void w(String str, String str2) {
        if (DEBUG) {
            Thread currentThread = Thread.currentThread();
            LogFile.getInstance().w(getMicroTime(), currentThread.getId(), str, str2, currentThread.getStackTrace()[3]);
        }
    }

    public static void e(String str, String str2) {
        if (DEBUG) {
            Thread currentThread = Thread.currentThread();
            LogFile.getInstance().e(getMicroTime(), currentThread.getId(), str, str2, currentThread.getStackTrace()[3]);
        }
    }

    public static synchronized void startLogger(String str) {
        synchronized (LogUtil.class) {
            if (DEBUG) {
                LogFile.getInstance().startLogger(str);
                e("LogUtil", "**********Start Logger**********");
            }
        }
    }

    public static synchronized void stopLogger() {
        synchronized (LogUtil.class) {
            if (DEBUG) {
                e("LogUtil", "**********Stop Logger**********");
                LogFile.getInstance().stopLogger();
            }
        }
    }

    private static long getMicroTime() {
        return (System.currentTimeMillis() * 1000) + ((SystemClock.elapsedRealtimeNanos() / 1000) % 1000);
    }
}
