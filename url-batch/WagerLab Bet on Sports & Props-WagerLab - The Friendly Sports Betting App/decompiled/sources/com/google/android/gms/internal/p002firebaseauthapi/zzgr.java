package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzgr {
    private static final ThreadLocal<Cipher> zza = new zzgu();

    public static AlgorithmParameterSpec zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec zza(byte[] bArr, int i, int i2) {
        Integer zzb = zzqn.zzb();
        return (zzb == null || zzb.intValue() > 19) ? new GCMParameterSpec(128, bArr, i, i2) : new IvParameterSpec(bArr, i, i2);
    }

    public static Cipher zza() {
        return zza.get();
    }

    public static SecretKey zzb(byte[] bArr) throws GeneralSecurityException {
        zzaai.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
