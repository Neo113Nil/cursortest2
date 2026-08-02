package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzern {
    public final zzfzp zza;
    private final long zzb;
    private final Clock zzc;

    public zzern(zzfzp zzfzpVar, long j, Clock clock) {
        this.zza = zzfzpVar;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
