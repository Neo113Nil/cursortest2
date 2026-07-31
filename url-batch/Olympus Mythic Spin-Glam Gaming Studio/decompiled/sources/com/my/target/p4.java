package com.my.target;

import android.util.Base64;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Map;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public abstract class p4 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String b(Map map) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
            try {
                boolean z = true;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getValue();
                    if (str != null) {
                        String str2 = (String) entry.getKey();
                        String b = ti.b(str);
                        if (z) {
                            z = false;
                        } else {
                            deflaterOutputStream.write(38);
                        }
                        deflaterOutputStream.write(str2.getBytes());
                        deflaterOutputStream.write(61);
                        deflaterOutputStream.write(b.getBytes());
                    }
                }
                deflaterOutputStream.close();
                String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                deflaterOutputStream.close();
                byteArrayOutputStream.close();
                return byteArrayOutputStream2;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String c(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("md5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
            return sb.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String a(Map map) {
        try {
            return b(map);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(Map map, t tVar) {
        try {
            return b(map);
        } catch (Throwable th) {
            tVar.c(0, 1001, "exception: " + gi.b(th));
            return "";
        }
    }

    public static String b(String str) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(new Base64OutputStream(byteArrayOutputStream, 2));
                try {
                    deflaterOutputStream.write(str.getBytes());
                    deflaterOutputStream.close();
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString();
                    deflaterOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream2;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            mi.a("EncryptionUtils: Cannot obtain bidder token - " + th.getMessage());
            return "";
        }
    }
}
