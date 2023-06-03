package com.sunmi.upgrade;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class DownloadTask implements Runnable {
    public static final String STATUS_FIAL_CREATE_FILE = "status_fail_create_file";
    public static final String STATUS_FIAL_DOWNLOAD = "status_fial_download";
    public static final String STATUS_FIAL_NOT_ENOUGH_DISK = "status_fial_not_enough_disk";
    public static final String STATUS_FIAL_OTHER = "status_fial_other";
    public static final String TASK_STATUS_BUSYING = "task_status_busying";
    public static final String TASK_STATUS_IDLY = "task_status_idly";
    public static final String TASK_STATUS_PAUSE = "task_status_pause";
    public static final String TASK_STATUS_STOP = "task_status_stop";
    private AppItem mAppItem;
    private IDownloadCallback mCallback;
    private File mFile;
    private long mProgress;
    public final String TAG = "Download";
    private String mStatus = TASK_STATUS_IDLY;
    private InputStream is = null;
    private RandomAccessFile fos = null;

    public IDownloadCallback getCallback() {
        return this.mCallback;
    }

    public AppItem getAppItem() {
        return this.mAppItem;
    }

    public String getStatus() {
        return this.mStatus;
    }

    public DownloadTask(IDownloadCallback iDownloadCallback) {
        this.mCallback = iDownloadCallback;
    }

    public void startTask(AppItem appItem) {
        this.mAppItem = appItem;
        new Thread(this).start();
    }

    public void setStop(String str) {
        this.mStatus = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long contentLength;
        try {
            try {
                try {
                    start();
                    this.mFile = new File(this.mAppItem.targetPath);
                    contentLength = getContentLength(this.mAppItem.downUrl);
                    if (this.mFile.exists() && this.mFile.isFile()) {
                        this.mAppItem.downloadedLength = this.mFile.length();
                        if (this.mAppItem.downloadedLength > contentLength) {
                            InstallUtils.deleteFile(this.mAppItem.targetPath);
                            this.mAppItem.downloadedLength = 0L;
                        }
                    } else {
                        this.mAppItem.downloadedLength = 0L;
                    }
                } catch (Exception unused) {
                    fail(STATUS_FIAL_CREATE_FILE);
                }
            } catch (DownLoadFailException e) {
                String status = e.getStatus();
                if (STATUS_FIAL_CREATE_FILE.equals(status)) {
                    fail(STATUS_FIAL_CREATE_FILE);
                } else if (STATUS_FIAL_NOT_ENOUGH_DISK.equals(status)) {
                    fail(STATUS_FIAL_NOT_ENOUGH_DISK);
                } else if (STATUS_FIAL_DOWNLOAD.equals(status)) {
                    fail(STATUS_FIAL_OTHER);
                }
            }
            if (contentLength == -1) {
                throw new DownLoadFailException("获取文件大小失败 进入下载失败状态", STATUS_FIAL_DOWNLOAD);
            }
            if (!InstallUtils.isDiskSpaceEnough(contentLength - this.mAppItem.downloadedLength)) {
                throw new DownLoadFailException("磁盘空间不足", STATUS_FIAL_NOT_ENOUGH_DISK);
            }
            if (contentLength == this.mAppItem.downloadedLength) {
                success();
            } else {
                this.mAppItem.fileSize = contentLength;
                if (this.mAppItem.downUrl.startsWith("https")) {
                    this.mAppItem.downUrl = this.mAppItem.downUrl.replace("https", "http");
                }
                doDownloadTheFile();
            }
        } finally {
            finished();
            reset();
        }
    }

    private void doDownloadTheFile() throws DownLoadFailException {
        try {
            try {
                try {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.mAppItem.downUrl).openConnection();
                        httpURLConnection.setConnectTimeout(20000);
                        httpURLConnection.setReadTimeout(20000);
                        httpURLConnection.setRequestProperty("RANGE", "bytes=" + this.mAppItem.downloadedLength + "-");
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.connect();
                        this.is = httpURLConnection.getInputStream();
                        if (this.is == null) {
                            throw new DownLoadFailException("文件内容输入流为null", STATUS_FIAL_DOWNLOAD);
                        }
                        this.fos = new RandomAccessFile(new File(this.mAppItem.targetPath), "rw");
                        this.fos.seek(this.mAppItem.downloadedLength);
                        readWrite(this.is, this.fos);
                    } catch (FileNotFoundException unused) {
                        throw new DownLoadFailException("targetPath文件地址错误 找不到文件 进入下载失败状态", STATUS_FIAL_DOWNLOAD);
                    } catch (IOException unused2) {
                        throw new DownLoadFailException("IO流异常 进入下载失败状态", STATUS_FIAL_DOWNLOAD);
                    }
                } catch (DownLoadFailException e) {
                    throw e;
                } catch (Exception unused3) {
                    throw new DownLoadFailException("doDownloadTheFile补偿异常状态 进入下载失败状态", STATUS_FIAL_DOWNLOAD);
                }
            } catch (IllegalArgumentException unused4) {
                throw new DownLoadFailException("RandomAccessFile模式异常 进入下载失败状态", STATUS_FIAL_DOWNLOAD);
            }
        } finally {
            close(this.is, this.fos);
        }
    }

    private void readWrite(InputStream inputStream, RandomAccessFile randomAccessFile) throws DownLoadFailException {
        byte[] bArr = new byte[4096];
        long j = 0;
        do {
            try {
                int read = inputStream.read(bArr);
                if (read < 0) {
                    break;
                }
                if (!TASK_STATUS_STOP.equals(this.mStatus) && !TASK_STATUS_PAUSE.equals(this.mStatus)) {
                    long j2 = read;
                    j += j2;
                    randomAccessFile.write(bArr, 0, read);
                    this.mAppItem.downloadedLength += j2;
                    downloading();
                    if (this.mAppItem.downloadedLength > this.mAppItem.fileSize) {
                        throw new DownLoadFailException("IO文件读写异常 进入下载失败状态 下载的length大于总fileSize" + this.mAppItem.downloadedLength + "/" + this.mAppItem.fileSize, STATUS_FIAL_DOWNLOAD);
                    }
                }
                stop(this.mStatus);
                return;
            } catch (DownLoadFailException e) {
                throw e;
            } catch (IOException e2) {
                throw new DownLoadFailException("IO文件读写异常 进入下载失败状态 e.getMessage = " + e2.getMessage(), STATUS_FIAL_DOWNLOAD);
            } catch (Exception unused) {
                throw new DownLoadFailException("读取文件补充异常", STATUS_FIAL_DOWNLOAD);
            }
        } while (j != this.mAppItem.fileSize);
        if (this.mAppItem.md5 != null) {
            if (this.mAppItem.md5.equals(InstallUtils.md5sum(this.mAppItem.targetPath))) {
                success();
                return;
            } else {
                InstallUtils.deleteFile(this.mAppItem.targetPath);
                throw new DownLoadFailException("md5检验失败 进入下载失败状态", STATUS_FIAL_DOWNLOAD);
            }
        }
        throw new DownLoadFailException("md5字段为null 进入下载失败状态", STATUS_FIAL_DOWNLOAD);
    }

    public long getContentLength(String str) {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
            httpsURLConnection.setRequestMethod("GET");
            httpsURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpsURLConnection.connect();
            int contentLength = httpsURLConnection.getContentLength();
            Log.e("ricardo", httpsURLConnection.getContentType() + "---" + httpsURLConnection.getResponseCode() + "-- " + contentLength + "+++" + httpsURLConnection.getContent().toString());
            httpsURLConnection.disconnect();
            if (contentLength == 0) {
                return -1L;
            }
            return contentLength;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return -1L;
        } catch (IOException e2) {
            e2.printStackTrace();
            return -1L;
        }
    }

    private void close(final InputStream inputStream, final RandomAccessFile randomAccessFile) {
        new Thread(new Runnable() { // from class: com.sunmi.upgrade.DownloadTask.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (randomAccessFile != null) {
                        inputStream.close();
                    }
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void start() {
        this.mStatus = TASK_STATUS_BUSYING;
        IDownloadCallback iDownloadCallback = this.mCallback;
        if (iDownloadCallback != null) {
            iDownloadCallback.start(this.mAppItem);
        }
    }

    private void downloading() {
        long j = (int) ((this.mAppItem.downloadedLength * 100) / this.mAppItem.fileSize);
        if (j > this.mProgress) {
            this.mProgress = j;
            IDownloadCallback iDownloadCallback = this.mCallback;
            if (iDownloadCallback != null) {
                iDownloadCallback.downloading(this.mAppItem);
            }
        }
    }

    private void stop(String str) {
        IDownloadCallback iDownloadCallback = this.mCallback;
        if (iDownloadCallback != null) {
            iDownloadCallback.stop(this.mAppItem, str);
        }
    }

    private void success() throws DownLoadFailException {
        IDownloadCallback iDownloadCallback = this.mCallback;
        if (iDownloadCallback != null) {
            iDownloadCallback.success(this.mAppItem);
        }
    }

    private void fail(String str) {
        IDownloadCallback iDownloadCallback = this.mCallback;
        if (iDownloadCallback != null) {
            iDownloadCallback.fail(this.mAppItem, str);
        }
    }

    private void finished() {
        IDownloadCallback iDownloadCallback = this.mCallback;
        if (iDownloadCallback != null) {
            iDownloadCallback.finished(this.mAppItem);
        }
    }

    public void reset() {
        this.mStatus = TASK_STATUS_IDLY;
        this.mAppItem = null;
        this.mFile = null;
        this.mProgress = 0L;
        IDownloadCallback iDownloadCallback = this.mCallback;
        if (iDownloadCallback != null) {
            iDownloadCallback.reset();
        }
    }

    public int hashCode() {
        AppItem appItem = this.mAppItem;
        return 31 + (appItem == null ? 0 : appItem.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DownloadTask downloadTask = (DownloadTask) obj;
            AppItem appItem = this.mAppItem;
            if (appItem == null) {
                if (downloadTask.mAppItem != null) {
                    return false;
                }
            } else if (!appItem.equals(downloadTask.getAppItem())) {
                return false;
            }
            return true;
        }
        return false;
    }
}
