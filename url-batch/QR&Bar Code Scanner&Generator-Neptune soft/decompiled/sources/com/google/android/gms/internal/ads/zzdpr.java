package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdpr implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;
    private final zzgxv zzi;

    public zzdpr(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5, zzgxv zzgxvVar6, zzgxv zzgxvVar7, zzgxv zzgxvVar8, zzgxv zzgxvVar9) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
        this.zzf = zzgxvVar6;
        this.zzg = zzgxvVar7;
        this.zzh = zzgxvVar8;
        this.zzi = zzgxvVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdpq zzb() {
        com.google.android.gms.ads.internal.util.zzg zzb = ((zzcoq) this.zza).zzb();
        zzfef zza = ((zzdcr) this.zzb).zza();
        zzdov zzdovVar = (zzdov) this.zzc.zzb();
        zzdoq zza2 = ((zzdpj) this.zzd).zza();
        zzdqb zzdqbVar = (zzdqb) this.zze.zzb();
        zzdqj zzdqjVar = (zzdqj) this.zzf.zzb();
        Executor executor = (Executor) this.zzg.zzb();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzdpq(zzb, zza, zzdovVar, zza2, zzdqbVar, zzdqjVar, executor, zzfzqVar, (zzdon) this.zzi.zzb());
    }
}
