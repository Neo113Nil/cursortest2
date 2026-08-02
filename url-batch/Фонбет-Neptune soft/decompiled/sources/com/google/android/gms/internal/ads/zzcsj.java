package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcsj {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcsj(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    static /* bridge */ /* synthetic */ void zzb(final zzcsj zzcsjVar, List list, final zzgcf zzgcfVar) {
        if (list == null || list.isEmpty()) {
            zzcsjVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcse
                @Override // java.lang.Runnable
                public final void run() {
                    zzgcf.this.zza(new zzdwl(3));
                }
            });
            return;
        }
        ListenableFuture zzh = zzgcj.zzh(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzh = zzgcj.zzn(zzgcj.zzf(zzh, Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsf
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final ListenableFuture zza(Object obj) {
                    zzgcf.this.zza((Throwable) obj);
                    return zzgcj.zzh(null);
                }
            }, zzcsjVar.zza), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzcsg
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final ListenableFuture zza(Object obj) {
                    return zzcsj.this.zza(zzgcfVar, listenableFuture, (zzcru) obj);
                }
            }, zzcsjVar.zza);
        }
        zzgcj.zzr(zzh, new zzcsi(zzcsjVar, zzgcfVar), zzcsjVar.zza);
    }

    final /* synthetic */ ListenableFuture zza(zzgcf zzgcfVar, ListenableFuture listenableFuture, zzcru zzcruVar) throws Exception {
        if (zzcruVar != null) {
            zzgcfVar.zzb(zzcruVar);
        }
        return zzgcj.zzo(listenableFuture, ((Long) zzbef.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgcf zzgcfVar) {
        zzgcj.zzr(this.zzc, new zzcsh(this, zzgcfVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
