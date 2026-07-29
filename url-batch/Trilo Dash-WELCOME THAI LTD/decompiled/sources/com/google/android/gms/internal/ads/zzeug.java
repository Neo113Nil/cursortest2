package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzeug implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzeug(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
        this.zze = zzgqhVar5;
    }

    public static zzeue zza(String str, zzbco zzbcoVar, zzcer zzcerVar, ScheduledExecutorService scheduledExecutorService, zzfvk zzfvkVar) {
        return new zzeue(str, zzbcoVar, zzcerVar, scheduledExecutorService, zzfvkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    public final /* bridge */ /* synthetic */ Object zzb() {
        String zza = ((zzevg) this.zza).zza();
        zzbco zzbcoVar = new zzbco();
        zzcer zzcerVar = (zzcer) this.zzc.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzd.zzb();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzeue(zza, zzbcoVar, zzcerVar, scheduledExecutorService, zzfvkVar, null);
    }
}
