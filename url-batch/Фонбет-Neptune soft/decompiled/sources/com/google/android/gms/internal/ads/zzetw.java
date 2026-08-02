package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzetw implements zzevo {
    private final zzevo zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzetw(zzevo zzevoVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzevoVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final ListenableFuture zzb() {
        ListenableFuture zzb = this.zza.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbX)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zzb = zzgcj.zzo(zzb, j, timeUnit, this.zzc);
        }
        return zzgcj.zzf(zzb, Throwable.class, new zzgbq() { // from class: com.google.android.gms.internal.ads.zzetv
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final ListenableFuture zza(Object obj) {
                return zzetw.this.zzc((Throwable) obj);
            }
        }, zzbzo.zzf);
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) throws Exception {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzbW)).booleanValue()) {
            zzevo zzevoVar = this.zza;
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "OptionalSignalTimeout:" + zzevoVar.zza());
        }
        return zzgcj.zzh(null);
    }
}
