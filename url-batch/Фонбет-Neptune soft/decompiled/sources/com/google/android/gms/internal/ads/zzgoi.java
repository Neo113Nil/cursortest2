package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgoi {
    private static final zzglz zza = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgof
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            return zzgoi.zzb((zzgon) zzgenVar, num);
        }
    };
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgog
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            return zzgoi.zzc((zzgoe) zzgdyVar);
        }
    }, zzgoe.class, zzgoo.class);
    private static final zzgmx zzc = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgoh
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            return zzgoi.zza((zzgoe) zzgdyVar);
        }
    }, zzgoe.class, zzgem.class);
    private static final zzgdz zzd = zzglh.zzd("type.googleapis.com/google.crypto.tink.AesCmacKey", zzgem.class, zzgsu.SYMMETRIC, zzgql.zzh());

    public static /* synthetic */ zzgem zza(zzgoe zzgoeVar) {
        zze(zzgoeVar.zzb());
        return zzgvo.zza(zzgoeVar);
    }

    public static /* synthetic */ zzgoe zzb(zzgon zzgonVar, Integer num) {
        zze(zzgonVar);
        zzgoc zzgocVar = new zzgoc(null);
        zzgocVar.zzc(zzgonVar);
        zzgocVar.zza(zzgvs.zzc(zzgonVar.zzc()));
        zzgocVar.zzb(num);
        return zzgocVar.zzd();
    }

    public static /* synthetic */ zzgoo zzc(zzgoe zzgoeVar) {
        zze(zzgoeVar.zzb());
        return new zzgqa(zzgoeVar);
    }

    public static void zzd(boolean z) throws GeneralSecurityException {
        if (!zzgkr.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzgpy.zza;
        zzgpy.zze(zzgmk.zzc());
        zzgma.zzb().zzc(zza, zzgon.class);
        zzgmh.zza().zze(zzb);
        zzgmh.zza().zze(zzc);
        zzgmg zzb2 = zzgmg.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("AES_CMAC", zzgpt.zzc);
        hashMap.put("AES256_CMAC", zzgpt.zzc);
        zzgok zzgokVar = new zzgok(null);
        zzgokVar.zza(32);
        zzgokVar.zzb(16);
        zzgokVar.zzc(zzgol.zzd);
        hashMap.put("AES256_CMAC_RAW", zzgokVar.zzd());
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgky.zzc().zzd(zzd, true);
    }

    private static void zze(zzgon zzgonVar) throws GeneralSecurityException {
        if (zzgonVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
