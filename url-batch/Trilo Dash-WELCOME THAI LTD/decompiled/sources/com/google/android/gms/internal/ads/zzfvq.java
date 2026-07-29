package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfvq {
    public static zzfvk zza(ExecutorService executorService) {
        if (executorService instanceof zzfvk) {
            return (zzfvk) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzfvp((ScheduledExecutorService) executorService) : new zzfvm(executorService);
    }

    public static Executor zzb() {
        return zzfuo.INSTANCE;
    }

    static Executor zzc(Executor executor, zzftr zzftrVar) {
        Objects.requireNonNull(executor);
        return executor == zzfuo.INSTANCE ? executor : new zzfvl(executor, zzftrVar);
    }
}
