package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzgah extends zzgap {
    final /* synthetic */ zzgai zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgah(zzgai zzgaiVar, Class cls) {
        super(cls);
        this.zza = zzgaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) throws GeneralSecurityException {
        byte[] zzb = zzgil.zzb();
        byte[] zzc = zzgil.zzc(zzb);
        zzgfd zzd = zzgfe.zzd();
        zzd.zzc(0);
        zzd.zza(((zzgev) zzglyVar).zze());
        zzd.zzb(zzgjg.zzv(zzc));
        zzgfe zzgfeVar = (zzgfe) zzd.zzaj();
        zzgfa zzc2 = zzgfb.zzc();
        zzc2.zzc(0);
        zzc2.zzb(zzgfeVar);
        zzc2.zza(zzgjg.zzv(zzb));
        return (zzgfb) zzc2.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgev.zzd(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgai.zzg(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgai.zzg(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgai.zzg(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgai.zzg(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzgai.zzg(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzgai.zzg(3, 3, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgal.zza(((zzgev) zzglyVar).zze());
    }
}
