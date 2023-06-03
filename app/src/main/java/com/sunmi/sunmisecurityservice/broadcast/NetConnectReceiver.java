package com.sunmi.sunmisecurityservice.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import com.sunmi.sunmisecurityservice.util.DeviceUtils;
import com.sunmi.upgrade.App;
import com.sunmi.upgrade.UpgradeService;
import com.sunmi.upgrade.UpgradeTool;

/* loaded from: classes.dex */
public class NetConnectReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        UpgradeTool.getInstance(MyApplication.app);
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            App app = new App();
            app.setPackageName(packageInfo.packageName);
            app.setVersionCode(packageInfo.versionCode);
            app.setSn(DeviceUtils.getMSN());
            Intent intent2 = new Intent();
            intent2.setClass(context, UpgradeService.class);
            intent2.setAction(UpgradeService.CHECK_UPDATE);
            intent2.putExtra("data", app);
            context.startService(intent2);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
