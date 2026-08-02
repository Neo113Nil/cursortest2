package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgcl extends zzgfq {
    final /* synthetic */ zzgcm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcl(zzgcm zzgcmVar, Class cls) {
        super(cls);
        this.zza = zzgcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgiy zzgiyVar = (zzgiy) zzgsoVar;
        zzgiu zzc = zzgiv.zzc();
        zzc.zza(zzgpw.zzv(zzgox.zza(zzgiyVar.zza())));
        zzc.zzb(zzgiyVar.zzf());
        zzc.zzc(0);
        return (zzgiv) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgiy.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzgcm.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzgcm.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzgcm.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzgcm.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgiy zzgiyVar = (zzgiy) zzgsoVar;
        zzgoz.zza(zzgiyVar.zza());
        if (zzgiyVar.zzf().zza() != 12 && zzgiyVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
