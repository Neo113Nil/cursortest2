package com.ironsource.adqualitysdk.sdk.i;

import android.util.Base64;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ϯ, reason: contains not printable characters */
/* loaded from: classes8.dex */
public abstract class AbstractC0530 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f589 = StringFog.decrypt("wWyXnQYMIZX5XbKBCxM=\n", "gAjG6GdgSOE=\n");

    static {
        StringFog.decrypt("5N/Rp8xURFPl0d2vwlQKTA==\n", "l7C+yqA1aSc=\n");
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m4037(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        try {
            byte[] decode = Base64.decode(str.getBytes(), 0);
            byte[] copyOfRange = Arrays.copyOfRange(decode, 16, decode.length);
            CipherInputStream cipherInputStream = null;
            try {
                try {
                    int length = str3.length();
                    byte[] bArr = new byte[length / 2];
                    for (int i = 0; i < length; i += 2) {
                        bArr[i / 2] = (byte) (Character.digit(str3.charAt(i + 1), 16) + (Character.digit(str3.charAt(i), 16) << 4));
                    }
                    int length2 = str4.length();
                    byte[] bArr2 = new byte[length2 / 2];
                    for (int i2 = 0; i2 < length2; i2 += 2) {
                        bArr2[i2 / 2] = (byte) (Character.digit(str4.charAt(i2 + 1), 16) + (Character.digit(str4.charAt(i2), 16) << 4));
                    }
                    Cipher cipher = Cipher.getInstance(StringFog.decrypt("2K8MlFV8pVvJoRzoI26HEP2DMdw=\n", "mepfuxY+5nQ=\n"));
                    cipher.init(2, SecretKeyFactory.getInstance(StringFog.decrypt("vxad9RljWB2rYZnsFAUlZq0djOMVZD0TrRf17QByXgO8GA==\n", "71TYolA3EFA=\n"), StringFog.decrypt("YtQ=\n", "IJfmKSR67VA=\n")).generateSecret(new PBEKeySpec(str2.toCharArray(), bArr2, 1, 256)), new IvParameterSpec(bArr, 0, cipher.getBlockSize()));
                    CipherInputStream cipherInputStream2 = new CipherInputStream(new ByteArrayInputStream(copyOfRange), cipher);
                    try {
                        StringFog.decrypt("mcl8nNc=\n", "zJ06se9C3qc=\n");
                        byte[] bArr3 = new byte[8192];
                        for (int read = cipherInputStream2.read(bArr3); read > -1; read = cipherInputStream2.read(bArr3)) {
                            sb.append(new String(bArr3, 0, read, StringFog.decrypt("G/ZCCjc=\n", "TqIEJw+TxpY=\n")));
                        }
                        cipherInputStream2.close();
                    } catch (Throwable th) {
                        th = th;
                        cipherInputStream = cipherInputStream2;
                        try {
                            AbstractC0577.m4068(f589, StringFog.decrypt("/4ZYjHlTsfnZhlOTfxq7+5qHXpFiHbI=\n", "uvQq4wtz1Zw=\n"), th, false);
                            if (cipherInputStream != null) {
                                cipherInputStream.close();
                            }
                            return sb.toString();
                        } catch (Throwable th2) {
                            if (cipherInputStream != null) {
                                try {
                                    cipherInputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            AbstractC0577.m4068(f589, StringFog.decrypt("Jt88oCB+khcGzDqmPDnRAQbOPLYiKtEED8oh\n", "Y61Oz1Je8WU=\n"), th4, false);
        }
        return sb.toString();
    }
}
