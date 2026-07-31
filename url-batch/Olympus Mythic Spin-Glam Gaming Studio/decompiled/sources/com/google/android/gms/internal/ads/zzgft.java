package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzgft implements zzgfo {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    zzgft() {
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final void zza(Runnable runnable, long j) {
        this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgfo
    public final void zzb() {
    }
}
