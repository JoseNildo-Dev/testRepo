package com.sunmi.sunmisecurityservice.app;

import android.os.Environment;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.PrintWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
class CrashHandler implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    private static final String TAG = CrashHandler.class.getSimpleName();
    private static final String CRASH_LOG_FILE_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/SecurityService/log/";

    private CrashHandler() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void configUncaughtExceptionHandler() {
        Thread.setDefaultUncaughtExceptionHandler(new CrashHandler());
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Log.e(TAG, "detect uncaught exception:", th);
        saveUncaughtExceptionLog(th);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mDefaultHandler;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        if (Constant.DEBUG) {
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    private void saveUncaughtExceptionLog(Throwable th) {
        try {
            PrintWriter printWriter = new PrintWriter(createLogFile());
            th.printStackTrace(printWriter);
            printWriter.append("\n");
            printWriter.flush();
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "create exception log file failed");
        }
    }

    private File createLogFile() {
        File file = new File(CRASH_LOG_FILE_PATH);
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.getDefault());
        return new File(file, simpleDateFormat.format(new Date()) + ".txt");
    }
}
