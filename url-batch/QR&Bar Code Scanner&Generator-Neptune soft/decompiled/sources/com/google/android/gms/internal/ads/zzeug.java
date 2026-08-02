package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzeug implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;
    private final zzgxv zzf;
    private final zzgxv zzg;
    private final zzgxv zzh;

    public zzeug(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5, zzgxv zzgxvVar6, zzgxv zzgxvVar7, zzgxv zzgxvVar8) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
        this.zzf = zzgxvVar6;
        this.zzg = zzgxvVar7;
        this.zzh = zzgxvVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzeue(zzfzqVar, (ScheduledExecutorService) this.zzb.zzb(), (String) this.zzc.zzb(), (zzenc) this.zzd.zzb(), (Context) this.zze.zzb(), ((zzdcr) this.zzf).zza(), (zzemy) this.zzg.zzb(), (zzdvl) this.zzh.zzb());
    }
}
