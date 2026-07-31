package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzhbt implements zzgqr {
    private zzhbt(zzgqr zzgqrVar, zzhep zzhepVar, byte[] bArr) {
    }

    public static zzgqr zza(zzgxv zzgxvVar) throws GeneralSecurityException {
        byte[] zzc;
        zzgzj zzc2 = zzgxvVar.zzc(zzgqc.zza());
        zzgqr zzgqrVar = (zzgqr) zzgxk.zza().zzc(zzc2.zzg(), zzgqr.class).zza(zzc2.zzb());
        zzhep zzd = zzc2.zzd();
        int ordinal = zzd.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = zzgyp.zza.zzc();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            zzc = zzgyp.zza(zzgxvVar.zzb().intValue()).zzc();
        } else {
            zzc = zzgyp.zzb(zzgxvVar.zzb().intValue()).zzc();
        }
        return new zzhbt(zzgqrVar, zzd, zzc);
    }
}
