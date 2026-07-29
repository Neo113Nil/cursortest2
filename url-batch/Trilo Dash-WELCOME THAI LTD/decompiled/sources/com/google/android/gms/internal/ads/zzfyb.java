package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfyb extends zzgap {
    final /* synthetic */ zzfyc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfyb(zzfyc zzfycVar, Class cls) {
        super(cls);
        this.zza = zzfycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) throws GeneralSecurityException {
        zzgct zzc = zzgcu.zzc();
        zzc.zza(zzgjg.zzv(zzgii.zza(((zzgcx) zzglyVar).zza())));
        zzc.zzb(0);
        return (zzgcu) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgcx.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzfyc.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzfyc.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzfyc.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzfyc.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgik.zza(((zzgcx) zzglyVar).zza());
    }
}
