package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeku implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;
    private final zzgxv zzi;
    private final zzgxv zzj;
    private final zzgxv zzk;

    public zzeku(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5, zzgxv zzgxvVar6, zzgxv zzgxvVar7, zzgxv zzgxvVar8, zzgxv zzgxvVar9, zzgxv zzgxvVar10, zzgxv zzgxvVar11) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
        this.zzf = zzgxvVar6;
        this.zzg = zzgxvVar7;
        this.zzh = zzgxvVar8;
        this.zzi = zzgxvVar9;
        this.zzj = zzgxvVar10;
        this.zzk = zzgxvVar11;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzekt zzb() {
        Context zza = ((zzcos) this.zza).zza();
        zzfih zzfihVar = (zzfih) this.zzb.zzb();
        zzeko zzekoVar = (zzeko) this.zzc.zzb();
        zzddc zzddcVar = (zzddc) this.zzd.zzb();
        zzfki zzfkiVar = (zzfki) this.zze.zzb();
        zzfkm zzfkmVar = (zzfkm) this.zzf.zzb();
        zzczh zzczhVar = (zzczh) this.zzg.zzb();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzekt(zza, zzfihVar, zzekoVar, zzddcVar, zzfkiVar, zzfkmVar, zzczhVar, zzfzqVar, (ScheduledExecutorService) this.zzi.zzb(), (zzehh) this.zzj.zzb(), (zzfju) this.zzk.zzb());
    }
}
