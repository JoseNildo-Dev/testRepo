package com.sunmi.sunmisecurityservice.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ThreadPoolManager {
    private static final ExecutorService CACHE_POOL = Executors.newCachedThreadPool();
    private static final ExecutorService SINGLE_POOL = Executors.newSingleThreadExecutor();

    private ThreadPoolManager() {
        throw new AssertionError("create instance of ThreadPoolManager is prohibited");
    }

    public static void executeInCachePool(Runnable runnable) {
        if (runnable != null) {
            CACHE_POOL.execute(runnable);
        }
    }

    public static void executeInSinglePool(Runnable runnable) {
        if (runnable != null) {
            SINGLE_POOL.execute(runnable);
        }
    }
}
