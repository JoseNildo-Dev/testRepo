package com.sunmi.sunmisecurityservice.util;

import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class LogFile {
    private static final String TAG = "SecurityService/LogFile";
    private boolean logStarted;
    private WriteLogTask logTask;
    private String logType;

    LogFile() {
    }

    /* loaded from: classes.dex */
    private static class SingletonHolder {
        private static final LogFile INSTANCE = new LogFile();

        private SingletonHolder() {
        }
    }

    public static LogFile getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void startLogger(String str) {
        if (this.logStarted && TextUtils.equals(this.logType, str)) {
            return;
        }
        stopLogger();
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        File file = new File((Environment.getExternalStorageDirectory().getAbsolutePath() + "/SecurityService/Log/") + simpleDateFormat.format(date));
        if (!file.exists() || !file.isDirectory()) {
            file.mkdirs();
        }
        simpleDateFormat.applyPattern("yyyy-MM-dd_HH-mm-ss-SSS");
        String str2 = simpleDateFormat.format(date) + ".txt";
        if (!TextUtils.isEmpty(str)) {
            str2 = str + str2;
        }
        this.logTask = new WriteLogTask(new File(file, str2));
        this.logTask.start();
        this.logType = str;
        this.logStarted = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stopLogger() {
        if (this.logStarted) {
            this.logTask.stop();
            this.logStarted = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(long j, long j2, String str, String str2, StackTraceElement stackTraceElement) {
        if (this.logStarted) {
            this.logTask.addLog(new LogBean(j, j2, "V", str, str2, stackTraceElement));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(long j, long j2, String str, String str2, StackTraceElement stackTraceElement) {
        if (this.logStarted) {
            this.logTask.addLog(new LogBean(j, j2, "I", str, str2, stackTraceElement));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(long j, long j2, String str, String str2, StackTraceElement stackTraceElement) {
        if (this.logStarted) {
            this.logTask.addLog(new LogBean(j, j2, "D", str, str2, stackTraceElement));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(long j, long j2, String str, String str2, StackTraceElement stackTraceElement) {
        if (this.logStarted) {
            this.logTask.addLog(new LogBean(j, j2, "W", str, str2, stackTraceElement));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(long j, long j2, String str, String str2, StackTraceElement stackTraceElement) {
        if (this.logStarted) {
            this.logTask.addLog(new LogBean(j, j2, "E", str, str2, stackTraceElement));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class WriteLogTask implements Runnable {
        private BlockingQueue<LogBean> buffer;
        private ExecutorService executor;
        private SimpleDateFormat sdf;
        private FileWriter writer;

        private WriteLogTask(File file) {
            this.executor = Executors.newSingleThreadExecutor();
            this.buffer = new LinkedBlockingQueue();
            try {
                this.writer = new FileWriter(file);
                this.sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.getDefault());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start() {
            this.executor.execute(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            this.executor.shutdownNow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLog(LogBean logBean) {
            if (this.writer != null) {
                this.buffer.offer(logBean);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    try {
                        if (Thread.interrupted()) {
                            break;
                        }
                        LogBean take = this.buffer.take();
                        printConsoleLog(take);
                        try {
                            this.writer.write(take.getLog(this.sdf));
                            this.writer.write("\n");
                            this.writer.flush();
                        } catch (IOException e) {
                            e.printStackTrace();
                            LogUtil.e(LogFile.TAG, "WriteLogTask error:" + IOUtil.exception2String(e));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        LogUtil.e(LogFile.TAG, "WriteLogTask error:" + IOUtil.exception2String(e2));
                    }
                } finally {
                    IOUtil.close(this.writer);
                    this.writer = null;
                    this.buffer.clear();
                }
            }
        }

        private void printConsoleLog(LogBean logBean) {
            char c;
            String consoleLog = logBean.getConsoleLog();
            String str = logBean.level;
            int hashCode = str.hashCode();
            if (hashCode == 68) {
                if (str.equals("D")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == 69) {
                if (str.equals("E")) {
                    c = 4;
                }
                c = 65535;
            } else if (hashCode == 73) {
                if (str.equals("I")) {
                    c = 1;
                }
                c = 65535;
            } else if (hashCode != 86) {
                if (hashCode == 87 && str.equals("W")) {
                    c = 3;
                }
                c = 65535;
            } else {
                if (str.equals("V")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                Log.v("SecurityService/" + logBean.tag, consoleLog);
            } else if (c == 1) {
                Log.i("SecurityService/" + logBean.tag, consoleLog);
            } else if (c == 2) {
                Log.d("SecurityService/" + logBean.tag, consoleLog);
            } else if (c == 3) {
                Log.w("SecurityService/" + logBean.tag, consoleLog);
            } else if (c != 4) {
            } else {
                Log.e("SecurityService/" + logBean.tag, consoleLog);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class LogBean {
        private String level;
        private long microTime;
        private String msg;
        private StackTraceElement stack;
        private String tag;
        private long tid;

        private LogBean(long j, long j2, String str, String str2, String str3, StackTraceElement stackTraceElement) {
            this.microTime = j;
            this.tid = j2;
            this.level = str;
            this.tag = str2;
            this.msg = str3;
            this.stack = stackTraceElement;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getConsoleLog() {
            return String.format(Locale.getDefault(), "[ (%s:%d)#%s ] %s", this.stack.getFileName(), Integer.valueOf(this.stack.getLineNumber()), this.stack.getMethodName(), this.msg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getLog(SimpleDateFormat simpleDateFormat) {
            return String.format(Locale.getDefault(), "[Pid=%d,Tid=%03d] %s %s %s %s", Integer.valueOf(Process.myPid()), Long.valueOf(this.tid), simpleDateFormat.format(new Date(this.microTime / 1000)), this.level, this.tag, this.msg);
        }
    }
}
