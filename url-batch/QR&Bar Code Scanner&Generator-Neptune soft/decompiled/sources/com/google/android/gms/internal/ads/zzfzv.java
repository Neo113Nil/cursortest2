package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfzv extends zzfzs implements ScheduledExecutorService, zzfzq {
    final ScheduledExecutorService zza;

    zzfzv(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzgaf zzf = zzgaf.zzf(runnable, null);
        return new zzfzt(zzf, this.zza.schedule(zzf, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfzu zzfzuVar = new zzfzu(runnable);
        return new zzfzt(zzfzuVar, this.zza.scheduleAtFixedRate(zzfzuVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfzu zzfzuVar = new zzfzu(runnable);
        return new zzfzt(zzfzuVar, this.zza.scheduleWithFixedDelay(zzfzuVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzgaf zzgafVar = new zzgaf(callable);
        return new zzfzt(zzgafVar, this.zza.schedule(zzgafVar, j, timeUnit));
    }
}
