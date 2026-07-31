package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdnc implements zzinw {
    private final zziof zza;

    private zzdnc(zzdnb zzdnbVar, zziof zziofVar) {
        this.zza = zziofVar;
    }

    public static zzdnc zza(zzdnb zzdnbVar, zziof zziofVar) {
        return new zzdnc(zzdnbVar, zziofVar);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdlo((zzdce) this.zza.zzb(), zzcgj.zzh));
        zzioe.zzb(singleton);
        return singleton;
    }
}
