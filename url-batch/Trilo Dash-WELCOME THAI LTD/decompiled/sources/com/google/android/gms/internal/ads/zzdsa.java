package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdsa implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzclu zzb;
    private final Context zzc;
    private final zzdwg zzd;
    private final zzfgo zze;
    private final zzeen zzf;
    private final Executor zzg;
    private final zzaoc zzh;
    private final zzcfo zzi;
    private final zzfig zzj;

    public zzdsa(Context context, Executor executor, zzaoc zzaocVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.zza zzaVar, zzclu zzcluVar, zzeen zzeenVar, zzfig zzfigVar, zzdwg zzdwgVar, zzfgo zzfgoVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaocVar;
        this.zzi = zzcfoVar;
        this.zza = zzaVar;
        this.zzb = zzcluVar;
        this.zzf = zzeenVar;
        this.zzj = zzfigVar;
        this.zzd = zzdwgVar;
        this.zze = zzfgoVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdsd zzdsdVar = new zzdsd(this);
        zzdsdVar.zzh();
        return zzdsdVar;
    }
}
