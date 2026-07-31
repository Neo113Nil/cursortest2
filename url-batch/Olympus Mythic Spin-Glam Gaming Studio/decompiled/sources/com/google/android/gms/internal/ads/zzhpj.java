package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes6.dex */
public final class zzhpj {
    private static final zzhmt zza = zzhpi.zza;
    private static final zzhok zzb = zzhok.zzd(zzhpg.zza, zzhpf.class, zzhpn.class);
    private static final zzhok zzc = zzhok.zzd(zzhph.zza, zzhpf.class, zzhfi.class);
    private static final zzhet zzd = zzhnc.zzf("type.googleapis.com/google.crypto.tink.AesCmacKey", zzhfi.class, 3, zzhro.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzhqp.zza;
        zzhqp.zza(zzhnw.zza());
        zzhnn.zza().zzb(zza, zzhpm.class);
        zzhnt.zza().zzb(zzb);
        zzhnt.zza().zzb(zzc);
        zzhns zza2 = zzhns.zza();
        HashMap hashMap = new HashMap();
        zzhpm zzhpmVar = zzhqk.zzc;
        hashMap.put("AES_CMAC", zzhpmVar);
        hashMap.put("AES256_CMAC", zzhpmVar);
        zzhpk zzhpkVar = new zzhpk(null);
        zzhpkVar.zza(32);
        zzhpkVar.zzb(16);
        zzhpkVar.zzc(zzhpl.zzd);
        hashMap.put("AES256_CMAC_RAW", zzhpkVar.zzd());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzhmu.zza().zzb(zzd, true);
    }

    static /* synthetic */ zzhpf zzb(zzhpm zzhpmVar, Integer num) {
        zze(zzhpmVar);
        zzhpe zzhpeVar = new zzhpe(null);
        zzhpeVar.zza(zzhpmVar);
        zzhpeVar.zzb(zzicj.zzb(zzhpmVar.zzc()));
        zzhpeVar.zzc(num);
        return zzhpeVar.zzd();
    }

    static /* synthetic */ zzhpn zzc(zzhpf zzhpfVar) {
        zze(zzhpfVar.zzf());
        return zzhqs.zza(zzhpfVar);
    }

    static /* synthetic */ zzhfi zzd(zzhpf zzhpfVar) {
        zze(zzhpfVar.zzf());
        return zzibx.zza(zzhpfVar);
    }

    private static void zze(zzhpm zzhpmVar) throws GeneralSecurityException {
        if (zzhpmVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
