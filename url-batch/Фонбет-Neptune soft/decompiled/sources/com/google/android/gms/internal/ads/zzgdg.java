package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgdg extends zzgbz {

    @CheckForNull
    private ListenableFuture zza;

    @CheckForNull
    private ScheduledFuture zzb;

    private zzgdg(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
    }

    static ListenableFuture zzf(ListenableFuture listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgdg zzgdgVar = new zzgdg(listenableFuture);
        zzgdd zzgddVar = new zzgdd(zzgdgVar);
        zzgdgVar.zzb = scheduledExecutorService.schedule(zzgddVar, j, timeUnit);
        listenableFuture.addListener(zzgddVar, zzgbx.INSTANCE);
        return zzgdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @CheckForNull
    protected final String zza() {
        ListenableFuture listenableFuture = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (listenableFuture == null) {
            return null;
        }
        String str = "inputFuture=[" + listenableFuture.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
