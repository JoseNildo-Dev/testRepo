package com.sunmi.sunmisecurityservice.util;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.os.RemoteException;
import com.sunmi.pay.hardware.aidl.AidlConstants;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class DeviceUtils {
    private static final String TAG = "DeviceUtils";

    private DeviceUtils() {
        throw new AssertionError("create instance of DeviceUtils is prohibited");
    }

    public static void rebootDevice(Context context) {
        ((PowerManager) context.getSystemService("power")).reboot(null);
    }

    public static void resetDevice(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent = new Intent("android.intent.action.FACTORY_RESET");
            intent.setPackage("android");
            context.sendBroadcast(intent);
            return;
        }
        context.sendBroadcast(new Intent("android.intent.action.MASTER_CLEAR"));
    }

    public static String getDeviceModel() {
        String str = "";
        try {
            str = MyApplication.app.basicOptBinder.getSysParam(AidlConstants.SysParam.DEVICE_MODEL);
            LogUtil.e(TAG, "终端DeviceModel:" + str);
            return str;
        } catch (RemoteException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String getMSN() {
        String str = "";
        try {
            str = MyApplication.app.basicOptBinder.getSysParam(AidlConstants.SysParam.SN);
            LogUtil.e(TAG, "终端的SN值:" + str);
            return str;
        } catch (RemoteException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static int getSecStatus() {
        int i = -1;
        try {
            i = MyApplication.app.securityOpt.getSecStatus();
            LogUtil.e(TAG, "终端的安全系统状态值:" + i);
            return i;
        } catch (RemoteException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static String getDebugMode() {
        String str = "";
        try {
            str = MyApplication.app.securityOpt.getAuthStatus(1);
            LogUtil.e(TAG, "终端模式是否为调试模式:" + str);
            return str;
        } catch (RemoteException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static String getTermStatus() {
        String str = "";
        try {
            str = MyApplication.app.securityOpt.getTermStatus();
            LogUtil.e(TAG, "终端状态:" + str);
            return str;
        } catch (RemoteException e) {
            e.printStackTrace();
            return str;
        }
    }

    public static int setAuthResCode(byte[] bArr) {
        int i = -111;
        try {
            i = MyApplication.app.securityOpt.sysConfirmAuth(bArr);
            LogUtil.e(TAG, "获取授权结果，结果码：" + i);
            return i;
        } catch (RemoteException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static int getAuthReqCode(int i, int i2, String str, byte[] bArr) {
        int i3 = -1;
        try {
            i3 = MyApplication.app.securityOpt.sysRequestAuth((byte) i, i2, str, bArr);
            LogUtil.e(TAG, "获取授权密文,结果码:" + i3);
            return i3;
        } catch (RemoteException e) {
            e.printStackTrace();
            return i3;
        }
    }

    public static void setScreenMonopoly() {
        try {
            int screenMode = MyApplication.app.basicOptBinder.setScreenMode(1);
            LogUtil.e(TAG, "设置屏幕独占,code:" + screenMode);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void cancelScreenMonopoly() {
        try {
            int screenMode = MyApplication.app.basicOptBinder.setScreenMode(-1);
            LogUtil.e(TAG, "取消屏幕独占,code:" + screenMode);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getFirmwareVersion() {
        /*
            java.lang.String r0 = ""
            com.sunmi.sunmisecurityservice.app.MyApplication r1 = com.sunmi.sunmisecurityservice.app.MyApplication.app     // Catch: android.os.RemoteException -> L25
            com.sunmi.pay.hardware.aidl.system.BasicOpt r1 = r1.basicOptBinder     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "FirmwareVersion"
            java.lang.String r1 = r1.getSysParam(r2)     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "DeviceUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L23
            r3.<init>()     // Catch: android.os.RemoteException -> L23
            java.lang.String r4 = "终端FirmwareVersion:"
            r3.append(r4)     // Catch: android.os.RemoteException -> L23
            r3.append(r1)     // Catch: android.os.RemoteException -> L23
            java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> L23
            com.sunmi.sunmisecurityservice.util.LogUtil.e(r2, r3)     // Catch: android.os.RemoteException -> L23
            goto L2a
        L23:
            r2 = move-exception
            goto L27
        L25:
            r2 = move-exception
            r1 = r0
        L27:
            r2.printStackTrace()
        L2a:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.util.DeviceUtils.getFirmwareVersion():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getHardwareVersion() {
        /*
            java.lang.String r0 = ""
            com.sunmi.sunmisecurityservice.app.MyApplication r1 = com.sunmi.sunmisecurityservice.app.MyApplication.app     // Catch: android.os.RemoteException -> L25
            com.sunmi.pay.hardware.aidl.system.BasicOpt r1 = r1.basicOptBinder     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "HardwareVersion"
            java.lang.String r1 = r1.getSysParam(r2)     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "DeviceUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L23
            r3.<init>()     // Catch: android.os.RemoteException -> L23
            java.lang.String r4 = "终端HardwareVersion:"
            r3.append(r4)     // Catch: android.os.RemoteException -> L23
            r3.append(r1)     // Catch: android.os.RemoteException -> L23
            java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> L23
            com.sunmi.sunmisecurityservice.util.LogUtil.e(r2, r3)     // Catch: android.os.RemoteException -> L23
            goto L2a
        L23:
            r2 = move-exception
            goto L27
        L25:
            r2 = move-exception
            r1 = r0
        L27:
            r2.printStackTrace()
        L2a:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.util.DeviceUtils.getHardwareVersion():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getLibBaseVersion() {
        /*
            java.lang.String r0 = ""
            com.sunmi.sunmisecurityservice.app.MyApplication r1 = com.sunmi.sunmisecurityservice.app.MyApplication.app     // Catch: android.os.RemoteException -> L25
            com.sunmi.pay.hardware.aidl.system.BasicOpt r1 = r1.basicOptBinder     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "BASE_VER"
            java.lang.String r1 = r1.getSysParam(r2)     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "DeviceUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L23
            r3.<init>()     // Catch: android.os.RemoteException -> L23
            java.lang.String r4 = "终端LibBaseVersion:"
            r3.append(r4)     // Catch: android.os.RemoteException -> L23
            r3.append(r1)     // Catch: android.os.RemoteException -> L23
            java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> L23
            com.sunmi.sunmisecurityservice.util.LogUtil.e(r2, r3)     // Catch: android.os.RemoteException -> L23
            goto L2a
        L23:
            r2 = move-exception
            goto L27
        L25:
            r2 = move-exception
            r1 = r0
        L27:
            r2.printStackTrace()
        L2a:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.util.DeviceUtils.getLibBaseVersion():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getCfgFileVersion() {
        /*
            java.lang.String r0 = ""
            com.sunmi.sunmisecurityservice.app.MyApplication r1 = com.sunmi.sunmisecurityservice.app.MyApplication.app     // Catch: android.os.RemoteException -> L25
            com.sunmi.pay.hardware.aidl.system.BasicOpt r1 = r1.basicOptBinder     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "CfgFileVersion"
            java.lang.String r1 = r1.getSysParam(r2)     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "DeviceUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L23
            r3.<init>()     // Catch: android.os.RemoteException -> L23
            java.lang.String r4 = "终端CfgFileVersion:"
            r3.append(r4)     // Catch: android.os.RemoteException -> L23
            r3.append(r1)     // Catch: android.os.RemoteException -> L23
            java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> L23
            com.sunmi.sunmisecurityservice.util.LogUtil.e(r2, r3)     // Catch: android.os.RemoteException -> L23
            goto L2a
        L23:
            r2 = move-exception
            goto L27
        L25:
            r2 = move-exception
            r1 = r0
        L27:
            r2.printStackTrace()
        L2a:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.util.DeviceUtils.getCfgFileVersion():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getTamperLog() {
        /*
            java.lang.String r0 = ""
            com.sunmi.sunmisecurityservice.app.MyApplication r1 = com.sunmi.sunmisecurityservice.app.MyApplication.app     // Catch: android.os.RemoteException -> L25
            com.sunmi.pay.hardware.aidl.system.BasicOpt r1 = r1.basicOptBinder     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "TamperLog"
            java.lang.String r1 = r1.getSysParam(r2)     // Catch: android.os.RemoteException -> L25
            java.lang.String r2 = "DeviceUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L23
            r3.<init>()     // Catch: android.os.RemoteException -> L23
            java.lang.String r4 = "终端TamperLog:"
            r3.append(r4)     // Catch: android.os.RemoteException -> L23
            r3.append(r1)     // Catch: android.os.RemoteException -> L23
            java.lang.String r3 = r3.toString()     // Catch: android.os.RemoteException -> L23
            com.sunmi.sunmisecurityservice.util.LogUtil.e(r2, r3)     // Catch: android.os.RemoteException -> L23
            goto L2a
        L23:
            r2 = move-exception
            goto L27
        L25:
            r2 = move-exception
            r1 = r0
        L27:
            r2.printStackTrace()
        L2a:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.util.DeviceUtils.getTamperLog():java.lang.String");
    }

    public static String getRomVersion() {
        try {
            String lowerCase = "ro.version.SunMi_VersionName".toLowerCase();
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, lowerCase);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
    }

    public static int getTamperLogUploadStatus() {
        return MyApplication.tamperLogUploadStatus;
    }

    public static void setTamperLogUploadStatus(int i) {
        MyApplication.tamperLogUploadStatus = i;
    }
}
