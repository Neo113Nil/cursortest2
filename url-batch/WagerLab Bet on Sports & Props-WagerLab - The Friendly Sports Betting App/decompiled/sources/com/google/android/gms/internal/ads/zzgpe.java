package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public interface zzgpe extends ScheduledExecutorService, zzgpd {
    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    zzgpc schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    zzgpc schedule(Callable callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    zzgpc scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    zzgpc scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
