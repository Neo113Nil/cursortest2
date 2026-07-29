package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzdoh implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;

    public zzdoh(zzgqh zzgqhVar, zzgqh zzgqhVar2, zzgqh zzgqhVar3, zzgqh zzgqhVar4, zzgqh zzgqhVar5, zzgqh zzgqhVar6, zzgqh zzgqhVar7, zzgqh zzgqhVar8, zzgqh zzgqhVar9) {
        this.zza = zzgqhVar;
        this.zzb = zzgqhVar2;
        this.zzc = zzgqhVar3;
        this.zzd = zzgqhVar4;
        this.zze = zzgqhVar5;
        this.zzf = zzgqhVar6;
        this.zzg = zzgqhVar7;
        this.zzh = zzgqhVar8;
        this.zzi = zzgqhVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgqh
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdog zzb() {
        com.google.android.gms.ads.internal.util.zzg zzb = ((zzfdg) this.zza).zzb();
        zzfby zza = ((zzdbj) this.zzb).zza();
        zzdnl zzdnlVar = (zzdnl) this.zzc.zzb();
        zzdng zza2 = ((zzdnz) this.zzd).zza();
        zzdor zzdorVar = (zzdor) this.zze.zzb();
        zzdoz zzdozVar = (zzdoz) this.zzf.zzb();
        Executor executor = (Executor) this.zzg.zzb();
        zzfvk zzfvkVar = zzcfv.zza;
        zzgqc.zzb(zzfvkVar);
        return new zzdog(zzb, zza, zzdnlVar, zza2, zzdorVar, zzdozVar, executor, zzfvkVar, (zzdnd) this.zzi.zzb());
    }
}
