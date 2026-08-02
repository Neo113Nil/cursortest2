package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzero implements zzeve {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzeve zzc;
    private final long zzd;

    public zzero(zzeve zzeveVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzeveVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        zzern zzernVar = (zzern) this.zza.get();
        if (zzernVar == null || zzernVar.zza()) {
            zzernVar = new zzern(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzernVar);
        }
        return zzernVar.zza;
    }
}
