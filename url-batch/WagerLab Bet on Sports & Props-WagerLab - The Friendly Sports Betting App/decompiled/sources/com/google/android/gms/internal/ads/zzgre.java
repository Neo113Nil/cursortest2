package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgre {
    public static final /* synthetic */ int zza = 0;
    private static final zzgxj zzb = zzb();

    public static zzgqb zza() throws GeneralSecurityException {
        if (zzgxe.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zzb;
    }

    private static zzgxj zzb() {
        try {
            zzgzd zza2 = zzgzg.zza();
            zzgrk.zzd(zza2);
            zza2.zza(zzgzc.zzd(zzgrc.zza, zzgrm.class, zzgpx.class));
            zza2.zza(zzgzc.zzd(zzgra.zza, zzgse.class, zzgpx.class));
            zza2.zza(zzgzc.zzd(zzgrb.zza, zzgsn.class, zzgpx.class));
            zza2.zza(zzgzc.zzd(zzgqz.zza, zzgrw.class, zzgpx.class));
            zza2.zza(zzgzc.zzd(zzgqy.zza, zzgsv.class, zzgpx.class));
            zza2.zza(zzgzc.zzd(zzgqx.zza, zzguq.class, zzgpx.class));
            zza2.zza(zzgzc.zzd(zzgrd.zza, zzguk.class, zzgpx.class));
            return zzgxj.zzb(zza2.zzc());
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
