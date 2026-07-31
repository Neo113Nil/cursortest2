package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdx;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.firebase:firebase-auth@@24.0.1 */
/* loaded from: classes5.dex */
final class zzlp implements zzlr {
    private final int zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlr
    public final int zza() {
        return this.zza;
    }

    public zzlp(zzdx zzdxVar) throws GeneralSecurityException {
        if (zzdxVar.zzb() != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (zzdxVar.zzd() != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (zzdxVar.zzf() != zzdx.zza.zzc) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.zza = zzdxVar.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlr
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        if (bArr2.length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.zza) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey zzb = zzgr.zzb(bArr);
        int i2 = i + 12;
        if (bArr2.length < i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec zza = zzgr.zza(bArr2, i, 12);
        Cipher zza2 = zzgr.zza();
        zza2.init(2, zzb, zza);
        return zza2.doFinal(bArr2, i2, (bArr2.length - i) - 12);
    }
}
