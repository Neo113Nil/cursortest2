package com.smaato.sdk.ng.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.smaato.sdk.ng.NextGen;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class NGSDKCrypto {
    private static final byte[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length + bArr2.length;
        byte[] bArr3 = new byte[length];
        int i = 0;
        while (i < length) {
            bArr3[i] = i < bArr.length ? bArr[i] : bArr2[i - bArr.length];
            i++;
        }
        return bArr3;
    }

    public static String decryptString(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 2);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 0, 16);
            byte[] copyOfRange2 = Arrays.copyOfRange(decode, 16, decode.length);
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(2, new SecretKeySpec(str2.getBytes(charset), "AES"), new IvParameterSpec(copyOfRange));
            return new String(cipher.doFinal(copyOfRange2), charset);
        } catch (Exception e) {
            NextGen.reportException(e);
            e.printStackTrace();
            return null;
        }
    }

    public static String encryptString(String str, String str2) {
        try {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
            Charset charset = StandardCharsets.UTF_8;
            cipher.init(1, new SecretKeySpec(str2.getBytes(charset), "AES"), new IvParameterSpec(bArr));
            return Base64.encodeToString(a(bArr, cipher.doFinal(str.getBytes(charset))), 2);
        } catch (Exception e) {
            NextGen.reportException(e);
            e.printStackTrace();
            return null;
        }
    }

    public static String sha1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            byte[] bytes = str.getBytes("UTF-8");
            messageDigest.update(bytes, 0, bytes.length);
            for (byte b : messageDigest.digest()) {
                sb.append(String.format("%02X", Byte.valueOf(b)));
            }
            return sb.toString().toLowerCase(Locale.US);
        } catch (Exception e) {
            NextGen.reportException(e);
            e.printStackTrace();
            return "";
        }
    }

    public static String md5(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                StringBuilder sb2 = new StringBuilder(Integer.toHexString(b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
                while (sb2.length() < 2) {
                    sb2.insert(0, "0");
                }
                sb.append((CharSequence) sb2);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            NextGen.reportException((Exception) e);
            e.printStackTrace();
            return "";
        }
    }
}
