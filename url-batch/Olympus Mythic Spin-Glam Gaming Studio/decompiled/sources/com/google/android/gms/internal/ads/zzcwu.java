package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzcwu implements zzinw {
    private final zzcwk zza;
    private final zziof zzb;

    private zzcwu(zzcwk zzcwkVar, zziof zziofVar) {
        this.zza = zzcwkVar;
        this.zzb = zziofVar;
    }

    public static zzcwu zza(zzcwk zzcwkVar, zziof zziofVar) {
        return new zzcwu(zzcwkVar, zziofVar);
    }

    public static Set zzc(zzcwk zzcwkVar, zzcya zzcyaVar) {
        Set singleton = Collections.singleton(new zzdlo(zzcyaVar, zzcgj.zzh));
        zzioe.zzb(singleton);
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (zzcya) this.zzb.zzb());
    }
}
