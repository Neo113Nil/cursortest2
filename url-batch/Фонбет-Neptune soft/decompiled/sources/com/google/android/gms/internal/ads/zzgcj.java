package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgcj extends zzgcl {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzgci zza(Iterable iterable) {
        return new zzgci(false, zzfxr.zzk(iterable), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgci zzb(Iterable iterable) {
        int i = zzfxr.zzd;
        iterable.getClass();
        return new zzgci(true, zzfxr.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgci zzc(ListenableFuture... listenableFutureArr) {
        return new zzgci(true, zzfxr.zzl(listenableFutureArr), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ListenableFuture zzd(Iterable iterable) {
        return new zzgbr(zzfxr.zzk(iterable), true);
    }

    public static ListenableFuture zze(ListenableFuture listenableFuture, Class cls, zzful zzfulVar, Executor executor) {
        zzgau zzgauVar = new zzgau(listenableFuture, cls, zzfulVar);
        listenableFuture.addListener(zzgauVar, zzgda.zzc(executor, zzgauVar));
        return zzgauVar;
    }

    public static ListenableFuture zzf(ListenableFuture listenableFuture, Class cls, zzgbq zzgbqVar, Executor executor) {
        zzgat zzgatVar = new zzgat(listenableFuture, cls, zzgbqVar);
        listenableFuture.addListener(zzgatVar, zzgda.zzc(executor, zzgatVar));
        return zzgatVar;
    }

    public static ListenableFuture zzh(Object obj) {
        return obj == null ? zzgcn.zza : new zzgcn(obj);
    }

    public static ListenableFuture zzi() {
        return zzgcn.zza;
    }

    public static ListenableFuture zzj(Callable callable, Executor executor) {
        zzgdj zzgdjVar = new zzgdj(callable);
        executor.execute(zzgdjVar);
        return zzgdjVar;
    }

    public static ListenableFuture zzk(zzgbp zzgbpVar, Executor executor) {
        zzgdj zzgdjVar = new zzgdj(zzgbpVar);
        executor.execute(zzgdjVar);
        return zzgdjVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzgbr(zzfxr.zzl(listenableFutureArr), false);
    }

    public static ListenableFuture zzm(ListenableFuture listenableFuture, zzful zzfulVar, Executor executor) {
        zzgbe zzgbeVar = new zzgbe(listenableFuture, zzfulVar);
        listenableFuture.addListener(zzgbeVar, zzgda.zzc(executor, zzgbeVar));
        return zzgbeVar;
    }

    public static ListenableFuture zzn(ListenableFuture listenableFuture, zzgbq zzgbqVar, Executor executor) {
        int i = zzgbf.zzc;
        executor.getClass();
        zzgbd zzgbdVar = new zzgbd(listenableFuture, zzgbqVar);
        listenableFuture.addListener(zzgbdVar, zzgda.zzc(executor, zzgbdVar));
        return zzgbdVar;
    }

    public static ListenableFuture zzo(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzgdg.zzf(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgdl.zza(future);
        }
        throw new IllegalStateException(zzfvj.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgdl.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzgby((Error) cause);
            }
            throw new zzgdk(cause);
        }
    }

    public static ListenableFuture zzg(Throwable th) {
        th.getClass();
        return new zzgcm(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzgcf zzgcfVar, Executor executor) {
        zzgcfVar.getClass();
        listenableFuture.addListener(new zzgcg(listenableFuture, zzgcfVar), executor);
    }
}
