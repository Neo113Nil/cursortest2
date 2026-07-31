package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes14.dex */
public final class zzfua {
    private final zzftp zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private volatile ScheduledFuture zzc;
    private final zzfvd zzd;

    public zzfua(final zzftp zzftpVar, ScheduledExecutorService scheduledExecutorService, long j, final zzfvd zzfvdVar) {
        this.zzd = zzfvdVar;
        this.zza = zzftpVar;
        if (j > 0) {
            this.zzc = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfua.this.zzb(zzftpVar, zzfvdVar);
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    public final void zza() {
        if (this.zzb.compareAndSet(false, true)) {
            if (this.zzc != null) {
                this.zzc.cancel(false);
            }
            this.zza.zzc(this.zzd, false);
        }
    }

    final /* synthetic */ void zzb(zzftp zzftpVar, zzfvd zzfvdVar) {
        if (this.zzb.compareAndSet(false, true)) {
            zzftpVar.zzc(zzfvdVar, true);
        }
    }
}
