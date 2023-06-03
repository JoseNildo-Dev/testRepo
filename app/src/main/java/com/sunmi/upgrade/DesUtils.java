package com.sunmi.upgrade;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
public class DesUtils {
    public static final String ALGORITHM_DES = "DES/CBC/PKCS5Padding";

    public static String encode(String str, String str2) throws Exception {
        return encode(str, str2.getBytes());
    }

    private static String encode(String str, byte[] bArr) throws Exception {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes()));
            Cipher cipher = Cipher.getInstance(ALGORITHM_DES);
            cipher.init(1, generateSecret, new IvParameterSpec(Constant.DES_VI.getBytes()));
            return Base64.encodeToString(cipher.doFinal(bArr), 2);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private static byte[] decode(String str, byte[] bArr) throws Exception {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(str.getBytes()));
            Cipher cipher = Cipher.getInstance(ALGORITHM_DES);
            cipher.init(2, generateSecret, new IvParameterSpec(Constant.DES_VI.getBytes()));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static String decode(String str, String str2) {
        byte[] decode;
        try {
            if (System.getProperty("os.name") != null && (System.getProperty("os.name").equalsIgnoreCase("sunos") || System.getProperty("os.name").equalsIgnoreCase("linux"))) {
                decode = decode(str, Base64.decode(str2, 0));
            } else {
                decode = decode(str, Base64.decode(str2, 0));
            }
            return new String(decode);
        } catch (Exception unused) {
            return "";
        }
    }
}
