package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzhcy extends zzhda {
    public static ListenableFuture zza(Object obj) {
        return obj == null ? zzhdc.zza : new zzhdc(obj);
    }

    public static ListenableFuture zzb() {
        return zzhdc.zza;
    }

    public static ListenableFuture zzd(Callable callable, Executor executor) {
        zzhdx zzhdxVar = new zzhdx(callable);
        executor.execute(zzhdxVar);
        return zzhdxVar;
    }

    public static ListenableFuture zze(Runnable runnable, Executor executor) {
        zzhdx zze = zzhdx.zze(runnable, null);
        executor.execute(zze);
        return zze;
    }

    public static ListenableFuture zzf(zzhcf zzhcfVar, Executor executor) {
        zzhdx zzhdxVar = new zzhdx(zzhcfVar);
        executor.execute(zzhdxVar);
        return zzhdxVar;
    }

    public static ListenableFuture zzg(ListenableFuture listenableFuture, Class cls, zzgub zzgubVar, Executor executor) {
        int i = zzhbq.zzd;
        zzhbp zzhbpVar = new zzhbp(listenableFuture, cls, zzgubVar);
        listenableFuture.addListener(zzhbpVar, zzhdp.zzd(executor, zzhbpVar));
        return zzhbpVar;
    }

    public static ListenableFuture zzh(ListenableFuture listenableFuture, Class cls, zzhcg zzhcgVar, Executor executor) {
        int i = zzhbq.zzd;
        zzhbo zzhboVar = new zzhbo(listenableFuture, cls, zzhcgVar);
        listenableFuture.addListener(zzhboVar, zzhdp.zzd(executor, zzhboVar));
        return zzhboVar;
    }

    public static ListenableFuture zzi(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : zzhdu.zze(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    public static ListenableFuture zzj(ListenableFuture listenableFuture, zzhcg zzhcgVar, Executor executor) {
        int i = zzhbx.zzc;
        zzhbv zzhbvVar = new zzhbv(listenableFuture, zzhcgVar);
        listenableFuture.addListener(zzhbvVar, zzhdp.zzd(executor, zzhbvVar));
        return zzhbvVar;
    }

    public static ListenableFuture zzk(ListenableFuture listenableFuture, zzgub zzgubVar, Executor executor) {
        int i = zzhbx.zzc;
        zzhbw zzhbwVar = new zzhbw(listenableFuture, zzgubVar);
        listenableFuture.addListener(zzhbwVar, zzhdp.zzd(executor, zzhbwVar));
        return zzhbwVar;
    }

    @SafeVarargs
    public static ListenableFuture zzl(ListenableFuture... listenableFutureArr) {
        return new zzhch(zzgxm.zzr(listenableFutureArr), true);
    }

    public static ListenableFuture zzm(Iterable iterable) {
        return new zzhch(zzgxm.zzp(iterable), true);
    }

    public static zzhcx zzn(Iterable iterable) {
        return new zzhcx(false, zzgxm.zzp(iterable), null);
    }

    @SafeVarargs
    public static zzhcx zzo(ListenableFuture... listenableFutureArr) {
        return new zzhcx(true, zzgxm.zzr(listenableFutureArr), null);
    }

    public static zzhcx zzp(Iterable iterable) {
        return new zzhcx(true, zzgxm.zzp(iterable), null);
    }

    @SafeVarargs
    public static ListenableFuture zzq(ListenableFuture... listenableFutureArr) {
        return new zzhch(zzgxm.zzr(listenableFutureArr), false);
    }

    public static Object zzs(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzhdz.zza(future);
        }
        throw new IllegalStateException(zzgvb.zzd("Future was expected to be done: %s", future));
    }

    public static Object zzt(Future future) {
        try {
            return zzhdz.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzhco((Error) e.getCause());
            }
            throw new zzhdy(e.getCause());
        }
    }

    public static ListenableFuture zzc(Throwable th) {
        th.getClass();
        return new zzhdb(th);
    }

    public static void zzr(ListenableFuture listenableFuture, zzhcv zzhcvVar, Executor executor) {
        zzhcvVar.getClass();
        listenableFuture.addListener(new zzhcw(listenableFuture, zzhcvVar), executor);
    }
}
