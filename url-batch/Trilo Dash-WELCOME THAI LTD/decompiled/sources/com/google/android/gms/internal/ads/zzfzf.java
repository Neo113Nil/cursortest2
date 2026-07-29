package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfzf extends zzgap {
    final /* synthetic */ zzfzg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzf(zzfzg zzfzgVar, Class cls) {
        super(cls);
        this.zza = zzfzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzglyVar) throws GeneralSecurityException {
        zzgcz zzc = zzgda.zzc();
        zzc.zza(zzgjg.zzv(zzgii.zza(((zzgdd) zzglyVar).zza())));
        zzc.zzb(0);
        return (zzgda) zzc.zzaj();
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* synthetic */ zzgly zzb(zzgjg zzgjgVar) throws zzgla {
        return zzgdd.zze(zzgjgVar, zzgka.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgdc zzc = zzgdd.zzc();
        zzc.zza(64);
        hashMap.put("AES256_SIV", new zzgao((zzgdd) zzc.zzaj(), 1));
        zzgdc zzc2 = zzgdd.zzc();
        zzc2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzgao((zzgdd) zzc2.zzaj(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgap
    public final /* bridge */ /* synthetic */ void zzd(zzgly zzglyVar) throws GeneralSecurityException {
        zzgdd zzgddVar = (zzgdd) zzglyVar;
        if (zzgddVar.zza() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + zzgddVar.zza() + ". Valid keys must have 64 bytes.");
    }
}
