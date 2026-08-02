package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzchc {
    public static final zzfzq zza;
    public static final zzfzq zzb;
    public static final zzfzq zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfzq zze;
    public static final zzfzq zzf;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfpy.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcgy("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcgy("Default"));
        }
        zzcha zzchaVar = null;
        zza = new zzchb(threadPoolExecutor, zzchaVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor = zzfpy.zza().zzc(5, new zzcgy("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcgy("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor2;
        }
        zzb = new zzchb(executor, zzchaVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = zzfpy.zza().zzb(new zzcgy("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcgy("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor3;
        }
        zzc = new zzchb(executor2, zzchaVar);
        zzd = new zzcgx(3, new zzcgy("Schedule"));
        zze = new zzchb(new zzcgz(), zzchaVar);
        zzf = new zzchb(zzfzw.zzb(), zzchaVar);
    }
}
