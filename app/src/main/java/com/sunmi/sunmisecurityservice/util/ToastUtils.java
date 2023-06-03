package com.sunmi.sunmisecurityservice.util;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* loaded from: classes.dex */
public class ToastUtils {
    private static Handler handler = new Handler(Looper.getMainLooper());

    public static void toast(final Context context, final String str) {
        handler.post(new Runnable() { // from class: com.sunmi.sunmisecurityservice.util.ToastUtils.1
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(context, str, 0).show();
            }
        });
    }

    public static void toast(final Context context, final int i) {
        handler.post(new Runnable() { // from class: com.sunmi.sunmisecurityservice.util.ToastUtils.2
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(context, i, 0).show();
            }
        });
    }
}
