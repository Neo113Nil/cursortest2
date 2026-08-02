package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgdv extends zzgfq {
    final /* synthetic */ zzgdw zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgdv(zzgdw zzgdwVar, Class cls) {
        super(cls);
        this.zza = zzgdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgjp zzc = zzgjq.zzc();
        zzc.zza(zzgpw.zzv(zzgox.zza(((zzgjt) zzgsoVar).zza())));
        zzc.zzb(0);
        return (zzgjq) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgjt.zze(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgjs zzc = zzgjt.zzc();
        zzc.zza(64);
        hashMap.put("AES256_SIV", new zzgfp((zzgjt) zzc.zzam(), 1));
        zzgjs zzc2 = zzgjt.zzc();
        zzc2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzgfp((zzgjt) zzc2.zzam(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgjt zzgjtVar = (zzgjt) zzgsoVar;
        if (zzgjtVar.zza() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + zzgjtVar.zza() + ". Valid keys must have 64 bytes.");
    }
}
