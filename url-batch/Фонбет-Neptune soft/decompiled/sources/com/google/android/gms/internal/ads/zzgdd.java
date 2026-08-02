package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgdd implements Runnable {

    @CheckForNull
    zzgdg zza;

    zzgdd(zzgdg zzgdgVar) {
        this.zza = zzgdgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r2 = r1.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ListenableFuture listenableFuture;
        ScheduledFuture scheduledFuture;
        zzgdg zzgdgVar = this.zza;
        if (zzgdgVar == null || listenableFuture == null) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isDone()) {
            zzgdgVar.zzs(listenableFuture);
            return;
        }
        try {
            scheduledFuture = zzgdgVar.zzb;
            zzgdgVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgdgVar.zzd(new zzgdf(str, null));
                    throw th;
                }
            }
            zzgdgVar.zzd(new zzgdf(str + ": " + listenableFuture.toString(), null));
        } finally {
            listenableFuture.cancel(true);
        }
    }
}
