package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfzw {
    public static zzfzq zza(ExecutorService executorService) {
        if (executorService instanceof zzfzq) {
            return (zzfzq) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzfzv((ScheduledExecutorService) executorService) : new zzfzs(executorService);
    }

    public static Executor zzb() {
        return zzfyu.INSTANCE;
    }

    static Executor zzc(Executor executor, zzfxx zzfxxVar) {
        Objects.requireNonNull(executor);
        return executor == zzfyu.INSTANCE ? executor : new zzfzr(executor, zzfxxVar);
    }
}
