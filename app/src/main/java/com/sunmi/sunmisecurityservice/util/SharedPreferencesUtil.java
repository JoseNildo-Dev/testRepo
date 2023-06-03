package com.sunmi.sunmisecurityservice.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.sunmi.sunmisecurityservice.app.MyApplication;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class SharedPreferencesUtil {
    private static final String FILE_NAME = "WIFISTATE";
    public static final String KEY_AUTHCODE_LIMIT_ATTACK = "key_request_authcode_limit_attack";
    public static final String KEY_AUTHCODE_LIMIT_MODE = "key_request_authcode_limit_mode";
    public static final String KEY_HIS_ALARM_REASON = "key_history_alarm_reason_v3";
    public static final String KEY_LAST_LIMIT_TIME_ATTACK = "key_limit_last_time_attack";
    public static final String KEY_LAST_LIMIT_TIME_MODE = "key_limit_last_time_mode";
    public static final String KEY_SLS_LOG_LATITUDE_LONGITUDE = "key_sls_log_latitude_longitude";
    private static final String PREF_NAME = "ras_data";

    private SharedPreferencesUtil() {
        throw new AssertionError("create instance of SharedPreferencesUtil is prohibited");
    }

    public static void saveInt(String str, int i) {
        MyApplication.app.getSharedPreferences(PREF_NAME, 0).edit().putInt(str, i).apply();
    }

    public static int readInt(String str, int i) {
        return MyApplication.app.getSharedPreferences(PREF_NAME, 0).getInt(str, i);
    }

    public static void saveLong(String str, long j) {
        MyApplication.app.getSharedPreferences(PREF_NAME, 0).edit().putLong(str, j).apply();
    }

    public static long readLong(String str, long j) {
        return MyApplication.app.getSharedPreferences(PREF_NAME, 0).getLong(str, j);
    }

    public static void saveString(String str, String str2) {
        MyApplication.app.getSharedPreferences(PREF_NAME, 0).edit().putString(str, str2).apply();
    }

    public static String readString(String str, String str2) {
        return MyApplication.app.getSharedPreferences(PREF_NAME, 0).getString(str, str2);
    }

    public static void saveObj(String str, Serializable serializable) {
        ObjectOutputStream objectOutputStream;
        SharedPreferences sharedPreferences = MyApplication.app.getSharedPreferences(FILE_NAME, 0);
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    String str2 = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0));
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(str, str2);
                    edit.apply();
                    close(objectOutputStream);
                } catch (Exception e) {
                    e = e;
                    objectOutputStream2 = objectOutputStream;
                    e.printStackTrace();
                    close(objectOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    close(objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    public static <T extends Serializable> T readObj(String str) {
        ObjectInputStream objectInputStream;
        String string = MyApplication.app.getSharedPreferences(FILE_NAME, 0).getString(str, "");
        ?? r2 = 0;
        try {
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.decode(string.getBytes(), 0)));
            } catch (IOException e) {
                e = e;
                objectInputStream = null;
            } catch (ClassNotFoundException e2) {
                e = e2;
                objectInputStream = null;
            } catch (Throwable th) {
                th = th;
                close(r2);
                throw th;
            }
            try {
                T t = (T) objectInputStream.readObject();
                close(objectInputStream);
                return t;
            } catch (IOException e3) {
                e = e3;
                e.printStackTrace();
                close(objectInputStream);
                return null;
            } catch (ClassNotFoundException e4) {
                e = e4;
                e.printStackTrace();
                close(objectInputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = string;
        }
    }

    public static void clearByKey(String str) {
        SharedPreferences.Editor edit = MyApplication.app.getSharedPreferences(FILE_NAME, 0).edit();
        edit.putString(str, "");
        edit.apply();
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0050: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:31:0x0050 */
    public static <T extends Serializable> T clone(T t) {
        Closeable closeable;
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Closeable closeable2 = null;
        try {
            if (t == null) {
                return null;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e) {
                e = e;
                objectInputStream = null;
                objectOutputStream = null;
            } catch (ClassNotFoundException e2) {
                e = e2;
                objectInputStream = null;
                objectOutputStream = null;
            } catch (Throwable th) {
                th = th;
                objectOutputStream = null;
            }
            try {
                objectOutputStream.writeObject(t);
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                try {
                    T t2 = (T) objectInputStream.readObject();
                    close(objectOutputStream);
                    close(objectInputStream);
                    return t2;
                } catch (IOException e3) {
                    e = e3;
                    e.printStackTrace();
                    close(objectOutputStream);
                    close(objectInputStream);
                    return null;
                } catch (ClassNotFoundException e4) {
                    e = e4;
                    e.printStackTrace();
                    close(objectOutputStream);
                    close(objectInputStream);
                    return null;
                }
            } catch (IOException e5) {
                e = e5;
                objectInputStream = null;
            } catch (ClassNotFoundException e6) {
                e = e6;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                close(objectOutputStream);
                close(closeable2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    private static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void put(Context context, String str, Object obj) {
        SharedPreferences.Editor edit = context.getSharedPreferences(FILE_NAME, 0).edit();
        if (obj instanceof String) {
            edit.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            edit.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            edit.putLong(str, ((Long) obj).longValue());
        } else {
            edit.putString(str, obj.toString());
        }
        SharedPreferencesCompat.apply(edit);
    }

    /* loaded from: classes.dex */
    private static class SharedPreferencesCompat {
        private static final Method sApplyMethod = findApplyMethod();

        private SharedPreferencesCompat() {
        }

        private static Method findApplyMethod() {
            try {
                return SharedPreferences.Editor.class.getMethod("apply", new Class[0]);
            } catch (NoSuchMethodException unused) {
                return null;
            }
        }

        public static void apply(SharedPreferences.Editor editor) {
            try {
                if (sApplyMethod != null) {
                    sApplyMethod.invoke(editor, new Object[0]);
                    return;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
            editor.commit();
        }
    }

    public static Object get(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(FILE_NAME, 0);
        if (obj instanceof String) {
            return sharedPreferences.getString(str, (String) obj);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
        }
        if (obj instanceof Boolean) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
        }
        if (obj instanceof Float) {
            return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
        }
        if (obj instanceof Long) {
            return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
        }
        return null;
    }
}
