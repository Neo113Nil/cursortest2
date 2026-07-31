package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhha {
    public static final /* synthetic */ int zza = 0;
    private static final zzhok zzb = zzhok.zzd(zzhgx.zza, zzhgw.class, zzhek.class);
    private static final zzhet zzc = zzhnc.zzf("type.googleapis.com/google.crypto.tink.AesGcmKey", zzhek.class, 3, zzhsk.zze());
    private static final zzhno zzd = zzhgz.zza;
    private static final zzhmt zze = zzhgy.zza;
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzhlx.zza(i)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzhkf.zza;
        zzhkf.zza(zzhnw.zza());
        zzhnt.zza().zzb(zzb);
        zzhns zza2 = zzhns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzhjb.zza);
        zzhhb zzhhbVar = new zzhhb(null);
        zzhhbVar.zzb(12);
        zzhhbVar.zza(16);
        zzhhbVar.zzc(16);
        zzhhc zzhhcVar = zzhhc.zzc;
        zzhhbVar.zzd(zzhhcVar);
        hashMap.put("AES128_GCM_RAW", zzhhbVar.zze());
        hashMap.put("AES256_GCM", zzhjb.zzb);
        zzhhb zzhhbVar2 = new zzhhb(null);
        zzhhbVar2.zzb(12);
        zzhhbVar2.zza(32);
        zzhhbVar2.zzc(16);
        zzhhbVar2.zzd(zzhhcVar);
        hashMap.put("AES256_GCM_RAW", zzhhbVar2.zze());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhnp.zza().zzb(zzd, zzhhd.class);
        zzhnn.zza().zzb(zze, zzhhd.class);
        zzhmu.zza().zzf(zzc, i, true);
    }
}
