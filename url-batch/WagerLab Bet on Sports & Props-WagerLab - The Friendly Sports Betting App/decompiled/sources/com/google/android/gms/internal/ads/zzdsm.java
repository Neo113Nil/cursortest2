package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdsm {
    private final zzdsr zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdsm(zzdsr zzdsrVar, Executor executor) {
        this.zza = zzdsrVar;
        this.zzc = zzdsrVar.zza();
        this.zzb = executor;
    }

    public final zzdsl zza() {
        zzdsl zzdslVar = new zzdsl(this);
        zzdslVar.zzl();
        return zzdslVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmt)).booleanValue()) {
            zzdsl zza = zza();
            zza.zzc("action", "pecr");
            zza.zzd();
        }
    }

    final /* synthetic */ zzdsr zzc() {
        return this.zza;
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
