package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
public final class zzhs {
    private static final zziv.zza zza = zziv.zza.zzb;
    private final SecretKey zzb;

    public zzhs(byte[] bArr) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = zzgr.zzb(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length < i + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec zza2 = zzgr.zza(bArr);
        Cipher zza3 = zzgr.zza();
        zza3.init(2, this.zzb, zza2);
        if (bArr3 != null && bArr3.length != 0) {
            zza3.updateAAD(bArr3);
        }
        return zza3.doFinal(bArr2, i, bArr2.length - i);
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        AlgorithmParameterSpec zza2 = zzgr.zza(bArr);
        Cipher zza3 = zzgr.zza();
        zza3.init(1, this.zzb, zza2);
        if (bArr3 != null && bArr3.length != 0) {
            zza3.updateAAD(bArr3);
        }
        int outputSize = zza3.getOutputSize(bArr2.length);
        if (outputSize > Integer.MAX_VALUE - i) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr4 = new byte[i + outputSize];
        if (zza3.doFinal(bArr2, 0, bArr2.length, bArr4, i) == outputSize) {
            return bArr4;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
