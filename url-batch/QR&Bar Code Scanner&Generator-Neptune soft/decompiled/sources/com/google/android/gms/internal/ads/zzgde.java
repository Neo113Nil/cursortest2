package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgde extends zzgfq {
    final /* synthetic */ zzgdf zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgde(zzgdf zzgdfVar, Class cls) {
        super(cls);
        this.zza = zzgdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ zzgso zza(zzgso zzgsoVar) throws GeneralSecurityException {
        zzgni zzc = zzgnj.zzc();
        zzc.zzb(0);
        zzc.zza(zzgpw.zzv(zzgox.zza(32)));
        return (zzgnj) zzc.zzam();
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* synthetic */ zzgso zzb(zzgpw zzgpwVar) throws zzgrq {
        return zzgnm.zzd(zzgpwVar, zzgqq.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgfp(zzgnm.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgfp(zzgnm.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzgfq
    public final /* bridge */ /* synthetic */ void zzd(zzgso zzgsoVar) throws GeneralSecurityException {
    }
}
