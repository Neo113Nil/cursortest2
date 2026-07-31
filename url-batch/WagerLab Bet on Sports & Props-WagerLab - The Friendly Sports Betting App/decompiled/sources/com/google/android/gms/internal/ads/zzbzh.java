package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzbzh {
    public static final zzgpd zza;
    public static final zzgpd zzb;
    public static final zzgpd zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgpe zze;
    public static final zzgpd zzf;
    public static final zzgpd zzg;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfrn.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbze(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbci.zzmc) != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbci.zzmc)).booleanValue()) {
                    if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbci.zzmd) != null) {
                        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbci.zzme) != null) {
                            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbci.zzmd)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbci.zzmd)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbze(Profile.DEFAULT_PROFILE_NAME));
                            threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zze(zzbci.zzme)).booleanValue());
                            threadPoolExecutor = threadPoolExecutor2;
                        }
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbze(Profile.DEFAULT_PROFILE_NAME));
        }
        zza = new zzbzg(threadPoolExecutor, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorService = zzfrn.zza().zza(5, new zzbze("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbze("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor3;
        }
        zzb = new zzbzg(executorService, null);
        if (ClientLibraryUtils.isPackageSide()) {
            executorService2 = zzfrn.zza().zzc(new zzbze("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbze("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorService2 = threadPoolExecutor4;
        }
        zzc = new zzbzg(executorService2, null);
        zzbzd zzbzdVar = new zzbzd(3, new zzbze(AppEventsConstants.EVENT_NAME_SCHEDULE));
        zzd = zzbzdVar;
        zze = zzgpk.zzc(zzbzdVar);
        zzf = new zzbzg(new zzbzf(), null);
        zzg = new zzbzg(zzgpk.zza(), null);
    }
}
