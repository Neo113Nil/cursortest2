package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzgac extends zzfyw {

    @CheckForNull
    private zzfzp zza;

    @CheckForNull
    private ScheduledFuture zzb;

    private zzgac(zzfzp zzfzpVar) {
        Objects.requireNonNull(zzfzpVar);
        this.zza = zzfzpVar;
    }

    static zzfzp zzg(zzfzp zzfzpVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgac zzgacVar = new zzgac(zzfzpVar);
        zzgaa zzgaaVar = new zzgaa(zzgacVar);
        zzgacVar.zzb = scheduledExecutorService.schedule(zzgaaVar, j, timeUnit);
        zzfzpVar.zzc(zzgaaVar, zzfyu.INSTANCE);
        return zzgacVar;
    }

    static /* synthetic */ ScheduledFuture zzx(zzgac zzgacVar, ScheduledFuture scheduledFuture) {
        zzgacVar.zzb = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
    @CheckForNull
    protected final String zza() {
        zzfzp zzfzpVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfzpVar == null) {
            return null;
        }
        String str = "inputFuture=[" + zzfzpVar + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzfxx
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
