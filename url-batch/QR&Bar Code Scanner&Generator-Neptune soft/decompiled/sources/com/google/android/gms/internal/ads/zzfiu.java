package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfiu implements zzfir {
    private final zzfir zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhv)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfiu(zzfir zzfirVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfirVar;
        long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzhu)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfit
            @Override // java.lang.Runnable
            public final void run() {
                zzfiu.zzc(zzfiu.this);
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfiu zzfiuVar) {
        while (!zzfiuVar.zzb.isEmpty()) {
            zzfiuVar.zza.zzb((zzfiq) zzfiuVar.zzb.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final String zza(zzfiq zzfiqVar) {
        return this.zza.zza(zzfiqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final void zzb(zzfiq zzfiqVar) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfiqVar);
            return;
        }
        if (this.zzd.getAndSet(true)) {
            return;
        }
        Queue queue = this.zzb;
        zzfiq zzb = zzfiq.zzb("dropped_event");
        Map zzj = zzfiqVar.zzj();
        if (zzj.containsKey("action")) {
            zzb.zza("dropped_action", (String) zzj.get("action"));
        }
        queue.offer(zzb);
    }
}
