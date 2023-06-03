package com.sunmi.upgrade;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import sunmi.installer.PM;

/* loaded from: classes.dex */
public class UpgradeTool {
    private static UpgradeTool ourInstance;
    private Application application;
    private PM pm;
    public String sn;

    /* loaded from: classes.dex */
    public interface CheckUpdateCallback {
        void checkResult(App app);
    }

    public static UpgradeTool getInstance(Application application) {
        if (ourInstance == null) {
            synchronized (UpgradeTool.class) {
                if (ourInstance == null) {
                    ourInstance = new UpgradeTool(application);
                }
            }
        }
        return ourInstance;
    }

    public static UpgradeTool getInstance() {
        UpgradeTool upgradeTool = ourInstance;
        if (upgradeTool != null) {
            return upgradeTool;
        }
        return null;
    }

    public static void release() {
        UpgradeTool upgradeTool = ourInstance;
        if (upgradeTool != null) {
            upgradeTool.application = null;
        }
        ourInstance = null;
    }

    public void downloadApk(String str, String str2, IDownloadCallback iDownloadCallback) {
        DownloadTask downloadTask = new DownloadTask(iDownloadCallback);
        AppItem appItem = new AppItem();
        appItem.downUrl = str;
        appItem.md5 = str2;
        Application application = this.application;
        SharedPreferences sharedPreferences = application.getSharedPreferences(application.getPackageName(), 0);
        String string = sharedPreferences.getString(appItem.downUrl, null);
        if (string == null) {
            try {
                appItem.targetPath = File.createTempFile("down", ".apk", this.application.getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS)).getAbsolutePath();
            } catch (IOException e) {
                e.printStackTrace();
            }
            sharedPreferences.edit().putString(appItem.downUrl, appItem.targetPath).commit();
        } else {
            appItem.targetPath = string;
        }
        downloadTask.startTask(appItem);
    }

    private UpgradeTool(Application application) {
        this.application = application;
        this.pm = PM.getInstance(this.application);
        this.pm.connect();
    }

    public void checkUpdate(String str, int i, String str2, CheckUpdateCallback checkUpdateCallback) {
        AppUpdateCheckReq appUpdateCheckReq = new AppUpdateCheckReq();
        this.sn = str2;
        AppReq appReq = new AppReq();
        appReq.setPackageName(str);
        appReq.setVersionCode(i);
        appUpdateCheckReq.setDeviceInfo(new DeviceInfo());
        ArrayList arrayList = new ArrayList();
        arrayList.add(appReq);
        appUpdateCheckReq.setAppList(arrayList);
        checkAppUpdate(new MD5Req(appUpdateCheckReq, this.application.getApplicationContext()), checkUpdateCallback);
    }

    private void checkAppUpdate(MD5Req mD5Req, CheckUpdateCallback checkUpdateCallback) {
        try {
            URL url = new URL(Constant.SERVER_ADDRESS);
            Log.e("ricardo", url.toString());
            byte[] writeBytes = getWriteBytes(mD5Req);
            if (writeBytes != null) {
                if (Constant.SERVER_ADDRESS.toUpperCase().startsWith("HTTPS")) {
                    httpsConnect(url, writeBytes, checkUpdateCallback);
                } else {
                    httpConnect(url, writeBytes, checkUpdateCallback);
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAPK(String str) {
        if (str != null) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    this.pm.installPackage(file);
                } catch (Exception unused) {
                }
            }
        }
    }

    private byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    private byte[] getWriteBytes(MD5Req mD5Req) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("version=" + Constant.versionName);
        stringBuffer.append("&params=" + mD5Req.jsonParams.replaceAll("\\+", "%2B"));
        stringBuffer.append("&isEncrypted=" + mD5Req.isEncrypted);
        stringBuffer.append("&timeStamp=" + mD5Req.timeStamp);
        stringBuffer.append("&randomNum=" + mD5Req.randomNum);
        stringBuffer.append("&sign=" + mD5Req.sign);
        stringBuffer.append("&timeZone=" + mD5Req.timeZone);
        stringBuffer.append("&region=" + mD5Req.region);
        stringBuffer.append("&language=" + mD5Req.language);
        try {
            Log.e("ricardo", stringBuffer.toString());
            return stringBuffer.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.InputStream] */
    private void httpsConnect(URL url, byte[] bArr, CheckUpdateCallback checkUpdateCallback) {
        OutputStream outputStream;
        InputStream inputStream;
        try {
            try {
                try {
                    Log.e("ricardo", url.toString());
                    HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                    httpsURLConnection.setReadTimeout(20000);
                    httpsURLConnection.setConnectTimeout(20000);
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setRequestProperty("userAgent", "sunmi.com");
                    httpsURLConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    outputStream = httpsURLConnection.getOutputStream();
                    try {
                        outputStream.write((byte[]) bArr);
                        outputStream.flush();
                        outputStream.close();
                        if (httpsURLConnection.getResponseCode() == 200) {
                            inputStream = httpsURLConnection.getInputStream();
                            try {
                                byte[] bArr2 = new byte[1024];
                                byte[] bArr3 = new byte[0];
                                for (int read = inputStream.read(bArr2); read > 0; read = inputStream.read(bArr2)) {
                                    bArr3 = concat(bArr3, bArr2);
                                }
                                JSONObject jSONObject = new JSONObject(new String(bArr3));
                                Log.i("ricarod", jSONObject.toString());
                                if (jSONObject.getInt("code") == 1) {
                                    if (jSONObject.getJSONArray("data").length() == 0) {
                                        delAllFile(this.application.getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                                    }
                                    App app = new App();
                                    app.initByJson(jSONObject.getJSONArray("data").getJSONObject(0));
                                    if (checkUpdateCallback != null) {
                                        checkUpdateCallback.checkResult(app);
                                    }
                                } else if (checkUpdateCallback != null) {
                                    checkUpdateCallback.checkResult(null);
                                }
                                inputStream.close();
                            } catch (MalformedURLException e) {
                                e = e;
                                e.printStackTrace();
                                checkUpdateCallback.checkResult(null);
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                    return;
                                }
                                return;
                            } catch (IOException e2) {
                                e = e2;
                                e.printStackTrace();
                                checkUpdateCallback.checkResult(null);
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                    return;
                                }
                                return;
                            } catch (JSONException e3) {
                                e = e3;
                                e.printStackTrace();
                                checkUpdateCallback.checkResult(null);
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                    return;
                                }
                                return;
                            } catch (Exception e4) {
                                e = e4;
                                e.printStackTrace();
                                checkUpdateCallback.checkResult(null);
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                    return;
                                }
                                return;
                            }
                        } else {
                            inputStream = null;
                        }
                        httpsURLConnection.disconnect();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (MalformedURLException e5) {
                        e = e5;
                        inputStream = null;
                    } catch (IOException e6) {
                        e = e6;
                        inputStream = null;
                    } catch (JSONException e7) {
                        e = e7;
                        inputStream = null;
                    } catch (Exception e8) {
                        e = e8;
                        inputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        bArr = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                                throw th;
                            }
                        }
                        if (bArr != 0) {
                            bArr.close();
                        }
                        throw th;
                    }
                } catch (MalformedURLException e10) {
                    e = e10;
                    inputStream = null;
                    outputStream = null;
                } catch (IOException e11) {
                    e = e11;
                    inputStream = null;
                    outputStream = null;
                } catch (JSONException e12) {
                    e = e12;
                    inputStream = null;
                    outputStream = null;
                } catch (Exception e13) {
                    e = e13;
                    inputStream = null;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = 0;
                    outputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e14) {
            e14.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v3 */
    private void httpConnect(URL url, byte[] bArr, CheckUpdateCallback checkUpdateCallback) {
        OutputStream outputStream;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        try {
            try {
                try {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.setConnectTimeout(20000);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("userAgent", "sunmi.com");
                    httpURLConnection.setRequestProperty("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    outputStream = httpURLConnection.getOutputStream();
                } catch (MalformedURLException e) {
                    e = e;
                    inputStream = null;
                    outputStream = null;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = null;
                    outputStream = null;
                } catch (JSONException e3) {
                    e = e3;
                    inputStream = null;
                    outputStream = null;
                } catch (Exception e4) {
                    e = e4;
                    inputStream = null;
                    outputStream = null;
                } catch (Throwable th) {
                    th = th;
                    bArr = 0;
                    outputStream = null;
                }
                try {
                    outputStream.write((byte[]) bArr);
                    outputStream.flush();
                    outputStream.close();
                    if (httpURLConnection.getResponseCode() == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            byte[] bArr3 = new byte[0];
                            for (int read = inputStream.read(bArr2); read > 0; read = inputStream.read(bArr2)) {
                                bArr3 = concat(bArr3, bArr2);
                            }
                            JSONObject jSONObject = new JSONObject(new String(bArr3));
                            Log.e("ricardo", jSONObject.toString());
                            if (jSONObject.getInt("code") == 1) {
                                if (jSONObject.getJSONArray("data").length() == 0) {
                                    delAllFile(this.application.getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                                }
                                App app = new App();
                                app.initByJson(jSONObject.getJSONArray("data").getJSONObject(0));
                                if (checkUpdateCallback != null) {
                                    checkUpdateCallback.checkResult(app);
                                }
                            } else if (checkUpdateCallback != null) {
                                checkUpdateCallback.checkResult(null);
                            }
                            inputStream.close();
                        } catch (MalformedURLException e5) {
                            e = e5;
                            e.printStackTrace();
                            checkUpdateCallback.checkResult(null);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                                return;
                            }
                            return;
                        } catch (IOException e6) {
                            e = e6;
                            e.printStackTrace();
                            checkUpdateCallback.checkResult(null);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                                return;
                            }
                            return;
                        } catch (JSONException e7) {
                            e = e7;
                            e.printStackTrace();
                            checkUpdateCallback.checkResult(null);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                                return;
                            }
                            return;
                        } catch (Exception e8) {
                            e = e8;
                            e.printStackTrace();
                            checkUpdateCallback.checkResult(null);
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                                return;
                            }
                            return;
                        }
                    } else {
                        inputStream = null;
                    }
                    httpURLConnection.disconnect();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (MalformedURLException e9) {
                    e = e9;
                    inputStream = null;
                } catch (IOException e10) {
                    e = e10;
                    inputStream = null;
                } catch (JSONException e11) {
                    e = e11;
                    inputStream = null;
                } catch (Exception e12) {
                    e = e12;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    bArr = 0;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                            throw th;
                        }
                    }
                    if (bArr != 0) {
                        bArr.close();
                    }
                    throw th;
                }
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean delAllFile(String str) {
        File file;
        File file2 = new File(str);
        if (file2.exists() && file2.isDirectory()) {
            String[] list = file2.list();
            boolean z = false;
            for (int i = 0; i < list.length; i++) {
                if (str.endsWith(File.separator)) {
                    file = new File(str + list[i]);
                } else {
                    file = new File(str + File.separator + list[i]);
                }
                if (file.isFile()) {
                    file.delete();
                }
                if (file.isDirectory()) {
                    delAllFile(str + "/" + list[i]);
                    delFolder(str + "/" + list[i]);
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    private void delFolder(String str) {
        try {
            delAllFile(str);
            new File(str.toString()).delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
