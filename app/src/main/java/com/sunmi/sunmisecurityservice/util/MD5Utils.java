package com.sunmi.sunmisecurityservice.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class MD5Utils {
    private MD5Utils() {
        throw new AssertionError("create instance of MD5Utils is prohibited");
    }

    public static String md5(String str) {
        try {
            return bytes2HexStr(MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("Huh, MD5 should be supported?", e2);
        }
    }

    public static String getFileMD5(File file) {
        FileInputStream fileInputStream = null;
        if (file != null && file.exists()) {
            try {
                try {
                    if (file.isFile()) {
                        try {
                            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                            FileInputStream fileInputStream2 = new FileInputStream(file);
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = fileInputStream2.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    messageDigest.update(bArr, 0, read);
                                }
                                String bytes2HexStr = bytes2HexStr(messageDigest.digest());
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                return bytes2HexStr;
                            } catch (FileNotFoundException e2) {
                                e = e2;
                                fileInputStream = fileInputStream2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                    return "";
                                }
                                return "";
                            } catch (IOException e3) {
                                e = e3;
                                fileInputStream = fileInputStream2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                    return "";
                                }
                                return "";
                            } catch (NoSuchAlgorithmException e4) {
                                e = e4;
                                fileInputStream = fileInputStream2;
                                e.printStackTrace();
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                    return "";
                                }
                                return "";
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException e6) {
                            e = e6;
                        } catch (IOException e7) {
                            e = e7;
                        } catch (NoSuchAlgorithmException e8) {
                            e = e8;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e9) {
                e9.printStackTrace();
                return "";
            }
        }
        return null;
    }

    private static String bytes2HexStr(byte[] bArr) {
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
}
