package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
public final class zzfer implements zzfdi {
    private final zzcfv zza;
    private final ScheduledExecutorService zzb;
    private final zzhdi zzc;

    zzfer(String str, zzbhi zzbhiVar, zzcfv zzcfvVar, ScheduledExecutorService scheduledExecutorService, zzhdi zzhdiVar) {
        this.zza = zzcfvVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzhdiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzdW)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeb)).booleanValue()) {
                ListenableFuture zza = zzgdv.zza(Tasks.forResult(null), null);
                zzhdi zzhdiVar = this.zzc;
                ListenableFuture zzj = zzhcy.zzj(zza, zzfeq.zza, zzhdiVar);
                if (((Boolean) zzbku.zza.zze()).booleanValue()) {
                    zzj = zzhcy.zzi(zzj, ((Long) zzbku.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzhcy.zzg(zzj, Exception.class, new zzgub() { // from class: com.google.android.gms.internal.ads.zzfep
                    @Override // com.google.android.gms.internal.ads.zzgub
                    public final /* synthetic */ Object apply(Object obj) {
                        return zzfer.this.zzc((Exception) obj);
                    }
                }, zzhdiVar);
            }
        }
        return zzhcy.zza(new zzfes(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 43;
    }

    final /* synthetic */ zzfes zzc(Exception exc) {
        this.zza.zzh(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfes(null, -1);
    }
}
