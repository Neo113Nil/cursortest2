package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzgsi {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgsf.zza, zzgse.class, zzgpx.class);
    private static final zzgqe zzc = zzgxs.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgpx.class, zzhds.SYMMETRIC, zzhcz.zze());
    private static final zzgyg zzd = zzgsh.zza;
    private static final zzgyd zze = zzgsg.zza;
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgxd.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgvn.zza;
        zzgvn.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyk zza2 = zzgyk.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzguj.zza);
        zzgsj zzgsjVar = new zzgsj(null);
        zzgsjVar.zzb(12);
        zzgsjVar.zza(16);
        zzgsjVar.zzc(16);
        zzgsk zzgskVar = zzgsk.zzc;
        zzgsjVar.zzd(zzgskVar);
        hashMap.put("AES128_GCM_RAW", zzgsjVar.zze());
        hashMap.put("AES256_GCM", zzguj.zzb);
        zzgsj zzgsjVar2 = new zzgsj(null);
        zzgsjVar2.zzb(12);
        zzgsjVar2.zza(32);
        zzgsjVar2.zzc(16);
        zzgsjVar2.zzd(zzgskVar);
        hashMap.put("AES256_GCM_RAW", zzgsjVar2.zze());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzgyh.zza().zzb(zzd, zzgsl.class);
        zzgyf.zza().zzb(zze, zzgsl.class);
        zzgxk.zza().zzf(zzc, i, true);
    }
}
