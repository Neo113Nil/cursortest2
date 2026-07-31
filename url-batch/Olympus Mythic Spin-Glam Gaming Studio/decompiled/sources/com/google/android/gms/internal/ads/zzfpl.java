package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzfpl {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfpm zzd;

    zzfpl(zzfpm zzfpmVar, Runnable runnable, long j) {
        Objects.requireNonNull(zzfpmVar);
        this.zzd = zzfpmVar;
        this.zza = runnable;
        this.zzb = j;
    }
}
