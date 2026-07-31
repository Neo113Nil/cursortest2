package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzetb implements zzeup {
    private final zzeup zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzetb(zzeup zzeupVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeupVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        ListenableFuture zza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcC)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            zza = zzgot.zzi(zza, j, timeUnit, this.zzc);
        }
        return zzgot.zzh(zza, Throwable.class, new zzgob() { // from class: com.google.android.gms.internal.ads.zzeta
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzetb.this.zzc((Throwable) obj);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return this.zza.zzb();
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcA)).booleanValue()) {
            zzeup zzeupVar = this.zza;
            zzbyv zzh = com.google.android.gms.ads.internal.zzt.zzh();
            int zzb = zzeupVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(zzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(zzb);
            zzh.zzg(th, sb.toString());
        }
        return zzgot.zza(null);
    }
}
