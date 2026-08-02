package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdtk implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzcnb zzb;
    private final Context zzc;
    private final zzdxq zzd;
    private final zzfir zze;
    private final zzego zzf;
    private final Executor zzg;
    private final zzape zzh;
    private final zzcgv zzi;
    private final zzfkm zzj;

    public zzdtk(Context context, Executor executor, zzape zzapeVar, zzcgv zzcgvVar, com.google.android.gms.ads.internal.zza zzaVar, zzcnb zzcnbVar, zzego zzegoVar, zzfkm zzfkmVar, zzdxq zzdxqVar, zzfir zzfirVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzapeVar;
        this.zzi = zzcgvVar;
        this.zza = zzaVar;
        this.zzb = zzcnbVar;
        this.zzf = zzegoVar;
        this.zzj = zzfkmVar;
        this.zzd = zzdxqVar;
        this.zze = zzfirVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdtn zzdtnVar = new zzdtn(this);
        zzdtnVar.zzh();
        return zzdtnVar;
    }
}
