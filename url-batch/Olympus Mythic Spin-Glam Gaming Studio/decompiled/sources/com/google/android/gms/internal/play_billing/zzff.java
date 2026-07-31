package com.google.android.gms.internal.play_billing;

import com.ironsource.X3;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.android.billingclient:billing@@7.1.1 */
/* loaded from: classes5.dex */
final class zzff extends zzee {
    private zzeu zzc;
    private ScheduledFuture zzd;

    private zzff(zzeu zzeuVar) {
        this.zzc = zzeuVar;
    }

    static zzeu zzs(zzeu zzeuVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzff zzffVar = new zzff(zzeuVar);
        zzfc zzfcVar = new zzfc(zzffVar);
        zzffVar.zzd = scheduledExecutorService.schedule(zzfcVar, 28500L, timeUnit);
        zzeuVar.zzb(zzfcVar, zzed.INSTANCE);
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    protected final String zzg() {
        zzeu zzeuVar = this.zzc;
        ScheduledFuture scheduledFuture = this.zzd;
        if (zzeuVar == null) {
            return null;
        }
        String str = "inputFuture=[" + zzeuVar.toString() + X3.j.e;
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.play_billing.zzdy
    protected final void zzm() {
        zzeu zzeuVar = this.zzc;
        if ((zzeuVar != null) & isCancelled()) {
            zzeuVar.cancel(zzq());
        }
        ScheduledFuture scheduledFuture = this.zzd;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzc = null;
        this.zzd = null;
    }
}
