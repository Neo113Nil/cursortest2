package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevo implements zzfdi {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzevo(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zza;
        zzevn zzevnVar = zzevn.zza;
        Executor executor = this.zzb;
        ListenableFuture zzj = zzhcy.zzj(listenableFuture, zzevnVar, executor);
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoh)).intValue() > 0) {
            zzj = zzhcy.zzi(zzj, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(r1)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzhcy.zzh(zzj, Throwable.class, zzevm.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 6;
    }
}
