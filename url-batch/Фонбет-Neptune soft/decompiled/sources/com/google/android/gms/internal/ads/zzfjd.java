package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfjd {
    private static final ListenableFuture zza = zzgcj.zzh(null);
    private final zzgcu zzb;
    private final ScheduledExecutorService zzc;
    private final zzfje zzd;

    public zzfjd(zzgcu zzgcuVar, ScheduledExecutorService scheduledExecutorService, zzfje zzfjeVar) {
        this.zzb = zzgcuVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfjeVar;
    }

    public final zzfit zza(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfit(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    public final zzfjc zzb(Object obj, ListenableFuture listenableFuture) {
        return new zzfjc(this, obj, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture);
    }

    protected abstract String zzf(Object obj);
}
