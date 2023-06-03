package com.sunmi.sunmisecurityservice.wifi;

import android.os.AsyncTask;

/* loaded from: classes.dex */
public class PortalWifiTask extends AsyncTask<Integer, Integer, Boolean> {
    private ICheckWifiCallBack mCallBack;

    /* loaded from: classes.dex */
    public interface ICheckWifiCallBack {
        void portalNetWork(boolean z);
    }

    public PortalWifiTask(ICheckWifiCallBack iCheckWifiCallBack) {
        this.mCallBack = iCheckWifiCallBack;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Boolean doInBackground(Integer... numArr) {
        return Boolean.valueOf(isWifiSetPortal());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        ICheckWifiCallBack iCheckWifiCallBack = this.mCallBack;
        if (iCheckWifiCallBack != null) {
            iCheckWifiCallBack.portalNetWork(bool.booleanValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.net.HttpURLConnection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean isWifiSetPortal() {
        /*
            r5 = this;
            java.lang.String r0 = "http://g.cn/generate_204"
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            java.net.URLConnection r0 = r3.openConnection()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            r0.setInstanceFollowRedirects(r1)     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L41
            r2 = 10000(0x2710, float:1.4013E-41)
            r0.setConnectTimeout(r2)     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L41
            r0.setReadTimeout(r2)     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L41
            r0.setUseCaches(r1)     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L41
            r0.getInputStream()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L41
            int r2 = r0.getResponseCode()     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L41
            r3 = 204(0xcc, float:2.86E-43)
            if (r2 == r3) goto L29
            r1 = 1
        L29:
            if (r0 == 0) goto L2e
            r0.disconnect()
        L2e:
            return r1
        L2f:
            r2 = move-exception
            goto L38
        L31:
            r1 = move-exception
            r0 = r2
            goto L42
        L34:
            r0 = move-exception
            r4 = r2
            r2 = r0
            r0 = r4
        L38:
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L40
            r0.disconnect()
        L40:
            return r1
        L41:
            r1 = move-exception
        L42:
            if (r0 == 0) goto L47
            r0.disconnect()
        L47:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.wifi.PortalWifiTask.isWifiSetPortal():boolean");
    }

    public static void checkWifi(ICheckWifiCallBack iCheckWifiCallBack) {
        new PortalWifiTask(iCheckWifiCallBack).execute(new Integer[0]);
    }
}
