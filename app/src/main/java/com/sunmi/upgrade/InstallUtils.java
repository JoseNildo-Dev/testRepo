package com.sunmi.upgrade;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import sunmi.installer.PM;

/* loaded from: classes.dex */
public class InstallUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void install(Context context, String str) {
        File file = new File(str);
        if (!file.exists() || file.isDirectory()) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    public static void silenceInstall(Application application, String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            PM pm = PM.getInstance(application);
            if (pm.connect()) {
                pm.installPackage(file);
            }
        }
    }

    public static boolean startInstall(Application application, String str) {
        File file = new File(str);
        if (file.exists() && !file.isDirectory()) {
            PM pm = PM.getInstance(application);
            if (pm.connect()) {
                pm.installPackage(file);
                return true;
            }
        }
        return false;
    }

    public static void unInstall(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public static void silenceUnInstall(Application application, String str) {
        PM pm = PM.getInstance(application);
        if (pm.connect()) {
            pm.unInstallPackage(str);
        }
    }

    public static void deleteFile(File file) {
        File file2 = new File(file.getAbsolutePath() + System.currentTimeMillis());
        file.renameTo(file2);
        file2.delete();
    }

    public static void deleteFile(String str) {
        deleteFile(new File(str));
    }

    public static long getFileSize(String str) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            return file.length();
        }
        return 0L;
    }

    public static boolean isDiskSpaceEnough(long j) {
        return getAvailableExternalMemorySize() > j * 10;
    }

    public static long getAvailableExternalMemorySize() {
        try {
            if (isSDCARDMounted()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            }
            return -1L;
        } catch (Exception e) {
            e.printStackTrace();
            return -1L;
        }
    }

    public static boolean isSDCARDMounted() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isNetworkConnected(Context context) {
        if (context == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(HEX_DIGITS[(bArr[i] & 240) >>> 4]);
            sb.append(HEX_DIGITS[bArr[i] & 15]);
        }
        return sb.toString().toLowerCase();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String md5sum(java.lang.String r5) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2e java.lang.Exception -> L31
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L41
        L10:
            int r3 = r2.read(r0)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L41
            if (r3 <= 0) goto L1b
            r4 = 0
            r5.update(r0, r4, r3)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L41
            goto L10
        L1b:
            byte[] r5 = r5.digest()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L41
            java.lang.String r5 = toHexString(r5)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> L41
            r2.close()     // Catch: java.io.IOException -> L27
            goto L2b
        L27:
            r0 = move-exception
            r0.printStackTrace()
        L2b:
            return r5
        L2c:
            r5 = move-exception
            goto L33
        L2e:
            r5 = move-exception
            r2 = r1
            goto L42
        L31:
            r5 = move-exception
            r2 = r1
        L33:
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L40
            r2.close()     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r5 = move-exception
            r5.printStackTrace()
        L40:
            return r1
        L41:
            r5 = move-exception
        L42:
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r0 = move-exception
            r0.printStackTrace()
        L4c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.upgrade.InstallUtils.md5sum(java.lang.String):java.lang.String");
    }

    public static boolean createFolder(String str) {
        for (int i = 0; i < 3; i++) {
            File file = new File(str);
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return true;
                }
                Log.e("ERROR", "app store create file error " + str);
            } else if (file.isDirectory()) {
                return true;
            } else {
                file.delete();
                if (file.mkdirs()) {
                    return true;
                }
                Log.e("ERROR", "app store create file error");
            }
        }
        return false;
    }
}
