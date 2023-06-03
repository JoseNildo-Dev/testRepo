package com.sunmi.upgrade;

/* loaded from: classes.dex */
public interface IDownloadCallback {
    void downloading(AppItem appItem);

    void fail(AppItem appItem, String str);

    void finished(AppItem appItem);

    void reset();

    void start(AppItem appItem);

    void stop(AppItem appItem, String str);

    void success(AppItem appItem);
}
