package com.sunmi.sunmisecurityservice.wifi.dialog;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.sunmi.sunmisecurityservice.wifi.bean.APNInfo;

/* loaded from: classes.dex */
public class APNManager {
    public static final Uri APN_URI = Uri.parse("content://telephony/carriers");
    public static final Uri CURRENT_APN_URI = Uri.parse("content://telephony/carriers/preferapn");
    private Context mContext;

    public APNManager(Context context) {
        this.mContext = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int addAPN(com.sunmi.sunmisecurityservice.wifi.bean.APNInfo r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.mContext
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.String r2 = r9.getName()
            java.lang.String r3 = "name"
            r0.put(r3, r2)
            java.lang.String r2 = r9.getApn()
            java.lang.String r3 = "apn"
            r0.put(r3, r2)
            java.lang.String r2 = r9.getUserName()
            java.lang.String r3 = "user"
            r0.put(r3, r2)
            java.lang.String r2 = r9.getPassword()
            java.lang.String r3 = "password"
            r0.put(r3, r2)
            java.lang.String r2 = r9.getMcc()
            java.lang.String r3 = "mcc"
            r0.put(r3, r2)
            java.lang.String r2 = r9.getMnc()
            java.lang.String r3 = "mnc"
            r0.put(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r9.getMcc()
            r2.append(r3)
            java.lang.String r9 = r9.getMnc()
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "numeric"
            r0.put(r2, r9)
            java.lang.String r9 = ""
            java.lang.String r2 = "type"
            r0.put(r2, r9)
            java.lang.String r2 = "mmsproxy"
            r0.put(r2, r9)
            java.lang.String r2 = "mmsport"
            r0.put(r2, r9)
            r9 = -1
            r7 = 0
            android.net.Uri r2 = com.sunmi.sunmisecurityservice.wifi.dialog.APNManager.APN_URI     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            android.net.Uri r2 = r1.insert(r2, r0)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            if (r2 == 0) goto L8d
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            java.lang.String r0 = "_id"
            int r0 = r7.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            r7.moveToFirst()     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
            short r9 = r7.getShort(r0)     // Catch: java.lang.Throwable -> L93 java.lang.Exception -> L95
        L8d:
            if (r7 == 0) goto L9c
        L8f:
            r7.close()
            goto L9c
        L93:
            r9 = move-exception
            goto L9d
        L95:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L93
            if (r7 == 0) goto L9c
            goto L8f
        L9c:
            return r9
        L9d:
            if (r7 == 0) goto La2
            r7.close()
        La2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.wifi.dialog.APNManager.addAPN(com.sunmi.sunmisecurityservice.wifi.bean.APNInfo):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r8 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setPreferAPN(int r10) {
        /*
            r9 = this;
            android.content.Context r0 = r9.mContext
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.String r3 = "apn_id"
            r0.put(r3, r2)
            r7 = 0
            r8 = 0
            android.net.Uri r2 = com.sunmi.sunmisecurityservice.wifi.dialog.APNManager.CURRENT_APN_URI     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r1.update(r2, r0, r8, r8)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            android.net.Uri r2 = com.sunmi.sunmisecurityservice.wifi.dialog.APNManager.CURRENT_APN_URI     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r0 = "name"
            java.lang.String r3 = "apn"
            java.lang.String[] r3 = new java.lang.String[]{r0, r3}     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r0.<init>()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r4 = "_id="
            r0.append(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r0.append(r10)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r8 == 0) goto L4b
            int r10 = r8.getCount()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50
            if (r10 <= 0) goto L45
            r7 = 1
        L45:
            if (r8 == 0) goto L4a
            r8.close()
        L4a:
            return r7
        L4b:
            if (r8 == 0) goto L59
            goto L56
        L4e:
            r10 = move-exception
            goto L5a
        L50:
            r10 = move-exception
            r10.printStackTrace()     // Catch: java.lang.Throwable -> L4e
            if (r8 == 0) goto L59
        L56:
            r8.close()
        L59:
            return r7
        L5a:
            if (r8 == 0) goto L5f
            r8.close()
        L5f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sunmi.sunmisecurityservice.wifi.dialog.APNManager.setPreferAPN(int):boolean");
    }

    public boolean isApnExist(APNInfo aPNInfo) {
        Cursor query = this.mContext.getContentResolver().query(APN_URI, null, null, null, null);
        if (query == null) {
            return false;
        }
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex("name"));
            String string2 = query.getString(query.getColumnIndex("apn"));
            String string3 = query.getString(query.getColumnIndex("mcc"));
            String string4 = query.getString(query.getColumnIndex("mnc"));
            if (TextUtils.equals(string, aPNInfo.getName()) && TextUtils.equals(string2, aPNInfo.getApn()) && TextUtils.equals(string3, aPNInfo.getMcc()) && TextUtils.equals(string4, aPNInfo.getMnc())) {
                return true;
            }
        }
        return false;
    }
}
