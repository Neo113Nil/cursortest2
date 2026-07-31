package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ṿ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C1056 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2666;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final byte[] f2667;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2668;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2669;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final SecretKeySpec f2670;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public Cipher f2671;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Cipher f2672;

    static {
        StringFog.decrypt("4Y8CKXZZkM/rmE0MYHOz/Ki0PgZgZarf7ogeJERCis8=\n", "iP1tRyU25b0=\n");
        f2669 = StringFog.decrypt("LJm8SUY=\n", "ec36ZH7ilyw=\n");
        StringFog.decrypt("u1pAVlaNcDKjWURPW+sNV6lRUUBaihUiqVsoQ1w=\n", "6xgFAR/ZOGE=\n");
        f2668 = StringFog.decrypt("yGUCajYBvKnZaxIWQBOe4u1JPyI=\n", "iSBRRXVD/4Y=\n");
        f2666 = StringFog.decrypt("Xl2Shf50s8lRU9HJ5HewzVNV0d75crCKfHes5O99qddeU4vE/zbt2A==\n", "PTL/q40b3KQ=\n");
        f2667 = new byte[]{16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
    }

    public C1056(byte[] bArr, String str, String str2, String str3) {
        byte[] digest;
        try {
            digest = SecretKeyFactory.getInstance(StringFog.decrypt("ggYEGZgaS56aBQAAlXw2+5ANFQ+UHS6OkAdsDJI=\n", "0kRBTtFOA80=\n")).generateSecret(new PBEKeySpec((str + str2 + str3).toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            String decrypt = StringFog.decrypt("rxv5KKOd19i3Ed4Yl871/JAxzg==\n", "5F68fuK9lp0=\n");
            String decrypt2 = StringFog.decrypt("jYgi6dCbvoz9myOr2JexmrCKLP/Ym76Q/Z4o/diat9v9rj/y2Je11bmTK+3Ui7ebqdos+8GLvZS+\nkmM=\n", "3fpNi7H50vU=\n");
            String str4 = AbstractC0983.f2353;
            AbstractC0580.m4073(decrypt, decrypt2);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(StringFog.decrypt("y3vS\n", "hj/nmldlyXw=\n"));
                char[] charArray = (str + str2 + str3).toCharArray();
                for (char c : charArray) {
                    messageDigest.update((byte) c);
                }
                digest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(StringFog.decrypt("BhvXpZ/zJG0qG9etgfUuICob1Q==\n", "T3WhxPOaQE0=\n"), e);
            }
        }
        this.f2670 = new SecretKeySpec(digest, StringFog.decrypt("BYze\n", "RMmNFv5g22w=\n"));
        m4330();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m4328(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                try {
                    String str2 = new String(this.f2671.doFinal(AbstractC1048.m4324(str)), f2669);
                    String str3 = f2666;
                    if (str2.indexOf(str3) == 0) {
                        return str2.substring(str3.length(), str2.length());
                    }
                    throw new C1074(StringFog.decrypt("sMB8MqJs0Z6X0T0wqGuflNiNdDixf52ZnIV5N7N/0Z+KhXYzvjfL\n", "+KUdVsce8fA=\n") + str);
                } catch (BadPaddingException e) {
                    m4330();
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.getMessage());
                    throw new C1074(AbstractC0584.m4083("QQ==\n", "exLkHbvaRsM=\n", sb, str));
                }
            } catch (IllegalBlockSizeException e2) {
                m4330();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(e2.getMessage());
                throw new C1074(AbstractC0584.m4083("gg==\n", "uGNUr5aKgmM=\n", sb2, str));
            }
        } catch (C1045 e3) {
            m4330();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e3.getMessage());
            throw new C1074(AbstractC0584.m4083("gg==\n", "uHNJdyD4FxM=\n", sb3, str));
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(StringFog.decrypt("UqxMAcarC7F+rEwJ2K0B/H6sTg==\n", "G8I6YKrCb5E=\n"), e4);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m4330() {
        try {
            String str = f2668;
            Cipher cipher = Cipher.getInstance(str);
            this.f2672 = cipher;
            SecretKeySpec secretKeySpec = this.f2670;
            byte[] bArr = f2667;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(str);
            this.f2671 = cipher2;
            cipher2.init(2, this.f2670, new IvParameterSpec(bArr));
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(StringFog.decrypt("BWmZc8IgMRopaZl73CY7VylpmzKc\n", "TAfvEq5JVTo=\n"), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m4329(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return AbstractC1048.m4323(this.f2672.doFinal((f2666 + str).getBytes(f2669)));
        } catch (UnsupportedEncodingException e) {
            m4330();
            throw new RuntimeException(StringFog.decrypt("gIcm9PtLqOGshyb85U2irKyHJA==\n", "yelQlZcizME=\n"), e);
        } catch (GeneralSecurityException e2) {
            m4330();
            throw new RuntimeException(StringFog.decrypt("tRaudbf/PUiZFq59qfk3BZkWrA==\n", "/HjYFNuWWWg=\n"), e2);
        }
    }
}
