package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzges implements zzgar {
    private final zzgew zza;
    private final zzgeu zzb;
    private final zzgeq zzc;
    private final zzgep zzd;

    private zzges(zzgew zzgewVar, zzgeu zzgeuVar, zzgep zzgepVar, zzgeq zzgeqVar, int i, byte[] bArr) {
        this.zza = zzgewVar;
        this.zzb = zzgeuVar;
        this.zzd = zzgepVar;
        this.zzc = zzgeqVar;
    }

    static zzges zza(zzglr zzglrVar) throws GeneralSecurityException {
        zzgew zza;
        if (!zzglrVar.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!zzglrVar.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (zzglrVar.zzg().zzD()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        zzglo zzc = zzglrVar.zzf().zzc();
        zzgeu zzb = zzgex.zzb(zzc);
        zzgep zzc2 = zzgex.zzc(zzc);
        zzgeq zza2 = zzgex.zza(zzc);
        int zzg = zzc.zzg();
        int i = 1;
        if (zzg - 2 != 1) {
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgli.zza(zzg)));
        }
        int zzg2 = zzglrVar.zzf().zzc().zzg() - 2;
        if (zzg2 == 1) {
            zza = zzgfh.zza(zzglrVar.zzg().zzE());
        } else {
            if (zzg2 != 2 && zzg2 != 3 && zzg2 != 4) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            byte[] zzE = zzglrVar.zzg().zzE();
            byte[] zzE2 = zzglrVar.zzf().zzh().zzE();
            int zzg3 = zzglrVar.zzf().zzc().zzg() - 2;
            if (zzg3 != 2) {
                if (zzg3 == 3) {
                    i = 2;
                } else {
                    if (zzg3 != 4) {
                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                    }
                    i = 3;
                }
            }
            zza = zzgff.zza(zzE, zzE2, i);
        }
        return new zzges(zza, zzb, zzc2, zza2, 32, null);
    }
}
