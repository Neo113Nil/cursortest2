package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcva implements zzgxi {
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
    private final zzgxv zzl;
    private final zzgxv zzm;
    private final zzgxv zzn;

    public zzcva(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5, zzgxv zzgxvVar6, zzgxv zzgxvVar7, zzgxv zzgxvVar8, zzgxv zzgxvVar9, zzgxv zzgxvVar10, zzgxv zzgxvVar11, zzgxv zzgxvVar12, zzgxv zzgxvVar13, zzgxv zzgxvVar14) {
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
        this.zzl = zzgxvVar12;
        this.zzm = zzgxvVar13;
        this.zzn = zzgxvVar14;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzcos) this.zza).zza();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzcuz(zza, zzfzqVar, (Executor) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), ((zzczx) this.zze).zza(), ((zzczu) this.zzf).zza(), (zzfki) this.zzg.zzb(), (zzfeo) this.zzh.zzb(), (View) this.zzi.zzb(), (zzcmp) this.zzj.zzb(), (zzape) this.zzk.zzb(), (zzbkb) this.zzl.zzb(), new zzbkd(), (zzfju) this.zzn.zzb(), null);
    }
}
