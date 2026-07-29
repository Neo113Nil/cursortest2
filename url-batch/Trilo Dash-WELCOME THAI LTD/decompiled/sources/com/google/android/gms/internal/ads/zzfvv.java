package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
final class zzfvv extends zzfuq {

    @CheckForNull
    private zzfvj zza;

    @CheckForNull
    private ScheduledFuture zzb;

    private zzfvv(zzfvj zzfvjVar) {
        Objects.requireNonNull(zzfvjVar);
        this.zza = zzfvjVar;
    }

    static zzfvj zzg(zzfvj zzfvjVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvv zzfvvVar = new zzfvv(zzfvjVar);
        zzfvt zzfvtVar = new zzfvt(zzfvvVar);
        zzfvvVar.zzb = scheduledExecutorService.schedule(zzfvtVar, j, timeUnit);
        zzfvjVar.zzc(zzfvtVar, zzfuo.INSTANCE);
        return zzfvvVar;
    }

    static /* synthetic */ ScheduledFuture zzx(zzfvv zzfvvVar, ScheduledFuture scheduledFuture) {
        zzfvvVar.zzb = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    @CheckForNull
    protected final String zza() {
        zzfvj zzfvjVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfvjVar == null) {
            return null;
        }
        String obj = zzfvjVar.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 43);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzftr
    protected final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
