package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdzt implements zzgxi {
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

    public zzdzt(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5, zzgxv zzgxvVar6, zzgxv zzgxvVar7, zzgxv zzgxvVar8, zzgxv zzgxvVar9, zzgxv zzgxvVar10) {
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
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = (Executor) this.zza.zzb();
        Context zza = ((zzcos) this.zzb).zza();
        WeakReference zza2 = ((zzcot) this.zzc).zza();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzdzs(executor, zza, zza2, zzfzqVar, (zzdvl) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdxz) this.zzg.zzb(), ((zzcpc) this.zzh).zza(), ((zzdjs) this.zzi).zzb(), (zzfjw) this.zzj.zzb());
    }
}
