package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcxg implements zzgxi {
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

    public zzcxg(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5, zzgxv zzgxvVar6, zzgxv zzgxvVar7, zzgxv zzgxvVar8, zzgxv zzgxvVar9, zzgxv zzgxvVar10) {
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

    public static zzcxf zzc(zzczd zzczdVar, Context context, zzfdl zzfdlVar, View view, zzcmp zzcmpVar, zzczc zzczcVar, zzdpb zzdpbVar, zzdkp zzdkpVar, zzgxc zzgxcVar, Executor executor) {
        return new zzcxf(zzczdVar, context, zzfdlVar, view, zzcmpVar, zzczcVar, zzdpbVar, zzdkpVar, zzgxcVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcxf zzb() {
        return new zzcxf(((zzdaz) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcxm) this.zzc).zza(), ((zzcxl) this.zzd).zza(), ((zzcxx) this.zze).zza(), ((zzcxn) this.zzf).zza(), ((zzdnb) this.zzg).zza(), (zzdkp) this.zzh.zzb(), zzgxh.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
