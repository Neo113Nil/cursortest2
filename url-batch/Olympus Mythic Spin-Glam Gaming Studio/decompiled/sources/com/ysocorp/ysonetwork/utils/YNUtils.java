package com.ysocorp.ysonetwork.utils;

import android.util.Base64;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes14.dex */
public class YNUtils {
    @Nullable
    public static String encryptString(String str, String str2) {
        if (str2 == null) {
            str2 = "pass";
        }
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset charset = StandardCharsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(bytesToHex(messageDigest.digest(str2.getBytes(charset))).substring(0, 32).getBytes(charset), "AES");
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
            return bytesToHex(bArr) + ":" + bytesToHex(cipher.doFinal(str.getBytes(charset)));
        } catch (InvalidAlgorithmParameterException unused) {
            YNLog.Error("cipher.init::InvalidAlgorithmParameterException::AES");
            return null;
        } catch (InvalidKeyException unused2) {
            YNLog.Error("cipher.init::InvalidKeyException");
            return null;
        } catch (NoSuchAlgorithmException unused3) {
            YNLog.Error("MessageDigest.getInstance::NoSuchAlgorithmException::SHA-256");
            return null;
        } catch (BadPaddingException unused4) {
            YNLog.Error("cipher.doFinal::BadPaddingException");
            return null;
        } catch (IllegalBlockSizeException unused5) {
            YNLog.Error("cipher.doFinal::IllegalBlockSizeException");
            return null;
        } catch (NoSuchPaddingException unused6) {
            YNLog.Error("Cipher.getInstance::NoSuchPaddingException::" + AESEncrypter.DEFAULT_ALGORITHM);
            return null;
        }
    }

    public static String decryptString(String str, String str2) throws Exception {
        if (str2 == null) {
            str2 = "pass";
        }
        String[] split = str.split(":");
        byte[] hexToBytes = hexToBytes(split[0]);
        byte[] hexToBytes2 = hexToBytes(split[1]);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = StandardCharsets.UTF_8;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytesToHex(messageDigest.digest(str2.getBytes(charset))).substring(0, 32).getBytes(charset), "AES");
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(2, secretKeySpec, new IvParameterSpec(hexToBytes));
        return new String(cipher.doFinal(hexToBytes2), charset);
    }

    private static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    private static byte[] hexToBytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static String ungzipString(String str) {
        byte[] ungzipData = ungzipData(Base64.decode(str, 0));
        if (ungzipData == null) {
            YNLog.Info("[YNUtils] :: Decompression failed.");
            return null;
        }
        return new String(ungzipData);
    }

    private static byte[] ungzipData(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int read = gZIPInputStream.read(bArr2);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                gZIPInputStream.close();
                                byteArrayInputStream.close();
                                return byteArray;
                            }
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            YNLog.Error("[YNUtils] :: ungzipData : error : " + e.getMessage());
            return null;
        }
    }

    public static String replaceGzipYsoCharsIfNeeded(String str) {
        return (str.length() < 4 || !str.startsWith("Y4so")) ? str : str.replaceFirst("Y4so", "H4sI");
    }

    public static double round(double d, int i) {
        return Math.round(d * r0) / Math.pow(10.0d, i);
    }

    public static double round(double d) {
        return round(d, 2);
    }

    public static double valueToUnit(long j, int i, String str) {
        double d;
        double d2;
        long j2 = i;
        long j3 = j2 * j2;
        long j4 = j3 * j2;
        long j5 = j4 * j2;
        long j6 = j5 * j2;
        long j7 = j6 * j2;
        if (str == null) {
            return j;
        }
        if (str.equals("K")) {
            d = j;
            d2 = j2;
        } else if (str.equals("M")) {
            d = j;
            d2 = j3;
        } else if (str.equals("G")) {
            d = j;
            d2 = j4;
        } else if (str.equals("T")) {
            d = j;
            d2 = j5;
        } else if (str.equals("P")) {
            d = j;
            d2 = j6;
        } else {
            if (!str.equals("E")) {
                return j;
            }
            d = j;
            d2 = j7;
        }
        return d / d2;
    }

    public static int readIntegerFile(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)), 1024);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            return Integer.parseInt(readLine);
        } catch (FileNotFoundException unused) {
            YNLog.Error("Cannot read file " + str + " file not found.");
            return 0;
        } catch (IOException unused2) {
            YNLog.Error("Cannot read file " + str + " IO exception.");
            return 0;
        } catch (NumberFormatException unused3) {
            YNLog.Error("Cannot read integer in file " + str + " NumberFormat exception.");
            return 0;
        }
    }

    public static String generateRandomString(int i) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(random.nextInt(62)));
        }
        return sb.toString();
    }
}
