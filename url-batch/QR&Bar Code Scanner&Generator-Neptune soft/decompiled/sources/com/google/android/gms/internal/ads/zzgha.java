package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgha {
    private static final zzgpc zza;
    private static final zzgge zzb;
    private static final zzggb zzc;
    private static final zzgfo zzd;
    private static final zzgfl zze;

    static {
        zzgpc zza2 = zzgpc.zza("type.googleapis.com/google.crypto.tink.AesCmacKey".getBytes(StandardCharsets.US_ASCII));
        zza = zza2;
        zzb = zzgge.zzc(zzggw.zza, zzggv.class, zzggi.class);
        zzc = zzggb.zzc(zzggx.zza, zza2, zzggi.class);
        zzd = zzgfo.zzc(zzggy.zza, zzggr.class, zzggh.class);
        zze = zzgfl.zzc(zzggz.zza, zza2, zzggh.class);
    }

    public static void zza() throws GeneralSecurityException {
        zzgfy zza2 = zzgfy.zza();
        zza2.zze(zzb);
        zza2.zzd(zzc);
        zza2.zzc(zzd);
        zza2.zzb(zze);
    }
}
