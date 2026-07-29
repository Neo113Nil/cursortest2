package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgam {
    private final zzfzz zza;

    zzgam(zzfzz zzfzzVar) {
        this.zza = zzfzzVar;
    }

    final zzgae zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza = zzgil.zza(bArr2, bArr);
        byte[] zzc = zzgil.zzc(bArr2);
        byte[] zzc2 = zzghf.zzc(zzc, bArr);
        byte[] zzd = zzgal.zzd(zzgal.zzb);
        zzfzz zzfzzVar = this.zza;
        return new zzgae(zzfzzVar.zzb(null, zza, "eae_prk", zzc2, "shared_secret", zzd, zzfzzVar.zza()), zzc);
    }
}
