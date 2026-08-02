package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzfzg extends zzfzi {
    public static zzfzf zza(Iterable iterable) {
        return new zzfzf(false, zzfvn.zzl(iterable), null);
    }

    @SafeVarargs
    public static zzfzf zzb(zzfzp... zzfzpVarArr) {
        return new zzfzf(false, zzfvn.zzn(zzfzpVarArr), null);
    }

    public static zzfzf zzc(Iterable iterable) {
        return new zzfzf(true, zzfvn.zzl(iterable), null);
    }

    @SafeVarargs
    public static zzfzf zzd(zzfzp... zzfzpVarArr) {
        return new zzfzf(true, zzfvn.zzn(zzfzpVarArr), null);
    }

    public static zzfzp zze(Iterable iterable) {
        return new zzfyo(zzfvn.zzl(iterable), true);
    }

    public static zzfzp zzf(zzfzp zzfzpVar, Class cls, zzfsm zzfsmVar, Executor executor) {
        zzfxv zzfxvVar = new zzfxv(zzfzpVar, cls, zzfsmVar);
        zzfzpVar.zzc(zzfxvVar, zzfzw.zzc(executor, zzfxvVar));
        return zzfxvVar;
    }

    public static zzfzp zzg(zzfzp zzfzpVar, Class cls, zzfyn zzfynVar, Executor executor) {
        zzfxu zzfxuVar = new zzfxu(zzfzpVar, cls, zzfynVar);
        zzfzpVar.zzc(zzfxuVar, zzfzw.zzc(executor, zzfxuVar));
        return zzfxuVar;
    }

    public static zzfzp zzi(Object obj) {
        return obj == null ? zzfzk.zza : new zzfzk(obj);
    }

    public static zzfzp zzj() {
        return zzfzk.zza;
    }

    public static zzfzp zzk(Callable callable, Executor executor) {
        zzgaf zzgafVar = new zzgaf(callable);
        executor.execute(zzgafVar);
        return zzgafVar;
    }

    public static zzfzp zzl(zzfym zzfymVar, Executor executor) {
        zzgaf zzgafVar = new zzgaf(zzfymVar);
        executor.execute(zzgafVar);
        return zzgafVar;
    }

    public static zzfzp zzm(zzfzp zzfzpVar, zzfsm zzfsmVar, Executor executor) {
        int i = zzfyd.zzc;
        Objects.requireNonNull(zzfsmVar);
        zzfyc zzfycVar = new zzfyc(zzfzpVar, zzfsmVar);
        zzfzpVar.zzc(zzfycVar, zzfzw.zzc(executor, zzfycVar));
        return zzfycVar;
    }

    public static zzfzp zzn(zzfzp zzfzpVar, zzfyn zzfynVar, Executor executor) {
        int i = zzfyd.zzc;
        Objects.requireNonNull(executor);
        zzfyb zzfybVar = new zzfyb(zzfzpVar, zzfynVar);
        zzfzpVar.zzc(zzfybVar, zzfzw.zzc(executor, zzfybVar));
        return zzfybVar;
    }

    public static zzfzp zzo(zzfzp zzfzpVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzfzpVar.isDone() ? zzfzpVar : zzgac.zzg(zzfzpVar, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgah.zza(future);
        }
        throw new IllegalStateException(zzftm.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgah.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfyv((Error) cause);
            }
            throw new zzgag(cause);
        }
    }

    public static zzfzp zzh(Throwable th) {
        Objects.requireNonNull(th);
        return new zzfzj(th);
    }

    public static void zzr(zzfzp zzfzpVar, zzfzc zzfzcVar, Executor executor) {
        Objects.requireNonNull(zzfzcVar);
        zzfzpVar.zzc(new zzfze(zzfzpVar, zzfzcVar), executor);
    }
}
