package com.sunmi.sunmisecurityservice.util;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class Util {
    private static int parse(char c) {
        int i;
        char c2 = 'a';
        if (c < 'a') {
            c2 = 'A';
            if (c < 'A') {
                i = c - '0';
                return i & 15;
            }
        }
        i = (c - c2) + 10;
        return i & 15;
    }

    public static int px2sp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int dp2px(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5d);
    }

    public static String bytesToHexStr(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] hexStringToBytes(String str) {
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        int i2 = 0;
        while (i < bArr.length) {
            int i3 = i2 + 1;
            bArr[i] = (byte) ((parse(str.charAt(i2)) << 4) | parse(str.charAt(i3)));
            i++;
            i2 = i3 + 1;
        }
        return bArr;
    }
}
