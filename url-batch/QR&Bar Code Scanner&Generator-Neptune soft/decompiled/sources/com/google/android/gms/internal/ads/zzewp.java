package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzewp implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;

    public zzewp(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5, zzgxv zzgxvVar6, zzgxv zzgxvVar7) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
        this.zzf = zzgxvVar6;
        this.zzg = zzgxvVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcfp zzcfpVar = new zzcfp();
        int intValue = ((zzexk) this.zzb).zzb().intValue();
        Context zza = ((zzcos) this.zzc).zza();
        zzcfy zzcfyVar = (zzcfy) this.zzd.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zze.zzb();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzewn(zzcfpVar, intValue, zza, zzcfyVar, scheduledExecutorService, zzfzqVar, ((zzexj) this.zzg).zza(), null);
    }
}
