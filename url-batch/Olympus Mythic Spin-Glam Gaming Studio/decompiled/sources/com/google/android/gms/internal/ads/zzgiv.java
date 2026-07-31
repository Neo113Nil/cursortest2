package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzgiv {
    public static final Charset zza = StandardCharsets.UTF_8;
    private static Cipher zzb = null;
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();

    private static final Cipher zzc() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (zzd) {
            try {
                if (zzb == null) {
                    zzb = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                }
                cipher = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }

    public final byte[] zza(byte[] bArr, String str) throws zzgiu {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] zzb2 = zzgfd.zzb(str, false);
            int length2 = zzb2.length;
            if (length2 <= 16) {
                throw new zzgiu();
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(zzb2);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (zzc) {
                zzc().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = zzc().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e) {
            e = e;
            throw new zzgiu(e);
        } catch (InvalidAlgorithmParameterException e2) {
            e = e2;
            throw new zzgiu(e);
        } catch (InvalidKeyException e3) {
            e = e3;
            throw new zzgiu(e);
        } catch (NoSuchAlgorithmException e4) {
            e = e4;
            throw new zzgiu(e);
        } catch (BadPaddingException e5) {
            e = e5;
            throw new zzgiu(e);
        } catch (IllegalBlockSizeException e6) {
            e = e6;
            throw new zzgiu(e);
        } catch (NoSuchPaddingException e7) {
            e = e7;
            throw new zzgiu(e);
        }
    }

    public final String zzb(byte[] bArr, String str) throws zzgiu {
        return new String(zza(bArr, str), zza);
    }
}
