package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgcr extends zzgfq {
    final /* synthetic */ zzgcs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcr(zzgcs zzgcsVar, Class cls) {
        super(cls);
        this.zza = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgjj zzc = zzgjk.zzc();
        zzc.zza(zzgpw.zzv(zzgox.zza(((zzgjn) zzgsoVar).zza())));
        zzc.zzb(0);
        return (zzgjk) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgjn.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzgcs.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzgcs.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzgcs.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzgcs.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgoz.zza(((zzgjn) zzgsoVar).zza());
    }
}
