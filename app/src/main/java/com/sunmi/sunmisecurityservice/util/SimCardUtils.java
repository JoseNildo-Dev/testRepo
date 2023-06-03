package com.sunmi.sunmisecurityservice.util;

import android.telephony.SignalStrength;

/* loaded from: classes.dex */
public final class SimCardUtils {
    private SimCardUtils() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r11 >= 5) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008c, code lost:
        if (r11 >= (-100)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a3, code lost:
        if (r11 >= (-105)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a5, code lost:
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getSignal(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.util.SimCardUtils.getSignal(android.content.Context, int):int");
    }

    public static int getDbm(SignalStrength signalStrength) {
        try {
            return ((Integer) Class.forName("android.telephony.SignalStrength").getDeclaredMethod("getDbm", new Class[0]).invoke(signalStrength, new Object[0])).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
