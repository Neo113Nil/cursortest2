package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgfg implements zzgeu {
    private final zzgep zza;

    zzgfg(zzgep zzgepVar) {
        this.zza = zzgepVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    public final zzgev zza(byte[] bArr) throws GeneralSecurityException {
        byte[] zzb = zzgpa.zzb();
        byte[] zza = zzgpa.zza(zzb, bArr);
        byte[] zzc = zzgpa.zzc(zzb);
        byte[] zzc2 = zzgnv.zzc(zzc, bArr);
        byte[] zzd = zzgfd.zzd(zzgfd.zzb);
        zzgep zzgepVar = this.zza;
        return new zzgev(zzgepVar.zzb(null, zza, "eae_prk", zzc2, "shared_secret", zzd, zzgepVar.zza()), zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzgfd.zzf)) {
            return zzgfd.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
