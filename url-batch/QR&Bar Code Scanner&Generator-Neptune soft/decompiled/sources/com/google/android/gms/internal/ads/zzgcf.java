package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgcf extends zzgfq {
    final /* synthetic */ zzgcg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcf(zzgcg zzgcgVar, Class cls) {
        super(cls);
        this.zza = zzgcgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgij zzgijVar = (zzgij) zzgsoVar;
        new zzgcj();
        zzgim zzf = zzgci.zzf(zzgijVar.zze());
        zzgso zza = new zzghd().zza().zza(zzgijVar.zzf());
        zzgif zzc = zzgig.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgla) zza);
        zzc.zzc(0);
        return (zzgig) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgij.zzd(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzgcg.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgcg.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzgcg.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgcg.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgij zzgijVar = (zzgij) zzgsoVar;
        ((zzgci) new zzgcj().zza()).zzd(zzgijVar.zze());
        new zzghd().zza().zzd(zzgijVar.zzf());
        zzgoz.zza(zzgijVar.zze().zza());
    }
}
