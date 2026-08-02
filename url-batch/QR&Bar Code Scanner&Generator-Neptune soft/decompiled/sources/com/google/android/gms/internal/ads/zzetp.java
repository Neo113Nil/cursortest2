package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzetp implements zzeve {
    private final zzeve zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzetp(zzeve zzeveVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeveVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeve
    public final zzfzp zzb() {
        zzfzp zzb = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzb = zzfzg.zzo(zzb, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfzg.zzg(zzb, Throwable.class, new zzfyn() { // from class: com.google.android.gms.internal.ads.zzeto
            @Override // com.google.android.gms.internal.ads.zzfyn
            public final zzfzp zza(Object obj) {
                return zzfzg.zzi(null);
            }
        }, zzchc.zzf);
    }
}
