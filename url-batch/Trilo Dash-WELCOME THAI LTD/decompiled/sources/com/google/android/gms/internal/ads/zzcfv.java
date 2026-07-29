package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcfv {
    public static final zzfvk zza;
    public static final zzfvk zzb;
    public static final zzfvk zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzfvk zze;
    public static final zzfvk zzf;

    static {
        Executor threadPoolExecutor;
        Executor executor;
        Executor executor2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfnt.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzcfr("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfr("Default"));
        }
        zzcft zzcftVar = null;
        zza = new zzcfu(threadPoolExecutor, zzcftVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor = zzfnt.zza().zzc(5, new zzcfr("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfr("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executor = threadPoolExecutor2;
        }
        zzb = new zzcfu(executor, zzcftVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executor2 = zzfnt.zza().zzb(new zzcfr("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfr("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executor2 = threadPoolExecutor3;
        }
        zzc = new zzcfu(executor2, zzcftVar);
        zzd = new zzcfq(3, new zzcfr("Schedule"));
        zze = new zzcfu(new zzcfs(), zzcftVar);
        zzf = new zzcfu(zzfvq.zzb(), zzcftVar);
    }
}
