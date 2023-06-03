package com.sunmi.sunmisecurityservice.util;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.PowerManager;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.RemoteViews;
import com.sunmi.sunmisecurityservice.app.BroadcastConstant;
import com.sunmi.sunmisecurityservice.broadcast.SecurityBroadcastReceiver;
import com.sunmi.sunmisecurityservice.view.DisplayAttackedActivity;
import com.sunmi.sunmisecurityservice.view.TradModeActivity;
import com.sunmi.sunmisecurityservice_v3.R;
import java.util.Calendar;
import sunmi.sunmiui.dialog.DialogCreater;
import sunmi.sunmiui.dialog.HintDialog;

/* loaded from: classes.dex */
public final class DispatchWorkHelper {
    private static final String TAG = "DispatchWorkHelper";
    private static HintDialog hintDialog;

    private DispatchWorkHelper() {
        throw new AssertionError("create instance of DispatchWorkHelper is forbidden");
    }

    public static void startScheduleAlarm(Context context) {
        Intent intent = new Intent(context, SecurityBroadcastReceiver.class);
        intent.setAction(BroadcastConstant.ACTION_CLOCK);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 0);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 3);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long currentTimeMillis = System.currentTimeMillis();
        if (timeInMillis < currentTimeMillis) {
            calendar.add(5, 1);
            timeInMillis = calendar.getTimeInMillis();
        }
        ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).setExactAndAllowWhileIdle(0, timeInMillis, broadcast);
        LogUtil.e(TAG, "schedule an alarm, delay time=" + (timeInMillis - currentTimeMillis) + ",selectTime=" + timeInMillis + ",currentTime=" + currentTimeMillis);
    }

    public static void startDisplayAttackedView(Context context) {
        Intent intent = new Intent(context, DisplayAttackedActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(536870912);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    public static void startChangeTradeMode(Context context) {
        Intent intent = new Intent(context, TradModeActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        context.startActivity(intent);
    }

    public static void showNotification(Context context) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        Resources resources = context.getResources();
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.notifycation_layout);
        remoteViews.setImageViewResource(R.id.image, R.drawable.notify_waring);
        remoteViews.setTextViewText(R.id.title, resources.getString(R.string.security1));
        remoteViews.setTextViewText(R.id.text, resources.getString(R.string.security2));
        remoteViews.setImageViewResource(R.id.small_icon, R.drawable.notify_enter);
        builder.setContent(remoteViews).setAutoCancel(true).setContentIntent(getDefaultIntent(context, 16)).setPriority(2).setOngoing(false).setDefaults(1).setSmallIcon(R.drawable.notify_waring);
        ((NotificationManager) context.getSystemService("notification")).notify(9527, builder.build());
    }

    private static PendingIntent getDefaultIntent(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.ChooseLockGeneric"));
        intent.setAction("android.intent.action.VIEW");
        return PendingIntent.getActivity(context, 1, intent, i);
    }

    public static void startScheduleReboot(Context context) {
        final PowerManager powerManager = (PowerManager) context.getSystemService("power");
        final PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(268435462, "bright");
        newWakeLock.setReferenceCounted(false);
        newWakeLock.acquire();
        hintDialog = DialogCreater.createHintDialog(context, R.drawable.prompt, context.getString(R.string.ok), null, context.getString(R.string.reboot_message), new View.OnClickListener() { // from class: com.sunmi.sunmisecurityservice.util.DispatchWorkHelper.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DispatchWorkHelper.hintDialog.dismiss();
                HintDialog unused = DispatchWorkHelper.hintDialog = null;
            }
        }, null, true);
        hintDialog.show();
        ThreadPoolManager.executeInCachePool(new Runnable() { // from class: com.sunmi.sunmisecurityservice.util.DispatchWorkHelper.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Thread.sleep(30000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                newWakeLock.release();
                powerManager.reboot(null);
            }
        });
    }
}
