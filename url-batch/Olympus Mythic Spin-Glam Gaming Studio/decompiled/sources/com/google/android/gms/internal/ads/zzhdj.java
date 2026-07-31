package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public interface zzhdj extends ScheduledExecutorService, zzhdi {
    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    zzhdh schedule(Runnable runnable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    zzhdh schedule(Callable callable, long j, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    zzhdh scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    zzhdh scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit);
}
