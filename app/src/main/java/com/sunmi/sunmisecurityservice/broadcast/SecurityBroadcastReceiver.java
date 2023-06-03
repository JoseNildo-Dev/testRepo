package com.sunmi.sunmisecurityservice.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sunmi.sunmisecurityservice.service.DispatchWorkService;
import com.sunmi.sunmisecurityservice.util.LogUtil;

/* loaded from: classes.dex */
public class SecurityBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "SecurityBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        LogUtil.e(TAG, "receive broadcast:" + intent.getAction() + ",ready to dispatch it...");
        Intent intent2 = new Intent(context, DispatchWorkService.class);
        intent2.putExtra("extra_action", action);
        context.startService(intent2);
    }
}
