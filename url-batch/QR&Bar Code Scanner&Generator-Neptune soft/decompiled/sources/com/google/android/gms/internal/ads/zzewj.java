package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzewj implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;

    public zzewj(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
    }

    public static zzewh zza(String str, zzbds zzbdsVar, zzcfy zzcfyVar, ScheduledExecutorService scheduledExecutorService, zzfzq zzfzqVar) {
        return new zzewh(str, zzbdsVar, zzcfyVar, scheduledExecutorService, zzfzqVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        String zza = ((zzexj) this.zza).zza();
        zzbds zzbdsVar = new zzbds();
        zzcfy zzcfyVar = (zzcfy) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzewh(zza, zzbdsVar, zzcfyVar, scheduledExecutorService, zzfzqVar, null);
    }
}
