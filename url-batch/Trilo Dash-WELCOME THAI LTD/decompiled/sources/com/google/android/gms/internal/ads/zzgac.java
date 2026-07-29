package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgac implements zzfwk {
    private final zzgfb zza;
    private final zzgaa zzb;
    private final zzgam zzc;
    private final zzfzz zzd;

    private zzgac(zzgfb zzgfbVar, zzgam zzgamVar, zzfzz zzfzzVar, zzgaa zzgaaVar, int i, byte[] bArr) {
        this.zza = zzgfbVar;
        this.zzc = zzgamVar;
        this.zzd = zzfzzVar;
        this.zzb = zzgaaVar;
    }

    static zzgac zza(zzgfb zzgfbVar) throws GeneralSecurityException {
        if (!zzgfbVar.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzgfbVar.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzgfbVar.zzg().zzD()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzgey zzc = zzgfbVar.zzf().zzc();
        zzgam zzc2 = zzgaf.zzc(zzc);
        zzfzz zzb = zzgaf.zzb(zzc);
        zzgaa zza = zzgaf.zza(zzc);
        int zzg = zzc.zzg();
        if (zzg - 2 == 1) {
            return new zzgac(zzgfbVar, zzc2, zzb, zza, 32, null);
        }
        throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzges.zza(zzg)));
    }
}
