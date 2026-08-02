package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdkc implements zzhfc {
    private final zzhfu zza;
    private final zzhfu zzb;
    private final zzhfu zzc;
    private final zzhfu zzd;
    private final zzhfu zze;
    private final zzhfu zzf;
    private final zzhfu zzg;
    private final zzhfu zzh;

    public zzdkc(zzhfu zzhfuVar, zzhfu zzhfuVar2, zzhfu zzhfuVar3, zzhfu zzhfuVar4, zzhfu zzhfuVar5, zzhfu zzhfuVar6, zzhfu zzhfuVar7, zzhfu zzhfuVar8, zzhfu zzhfuVar9) {
        this.zza = zzhfuVar;
        this.zzb = zzhfuVar2;
        this.zzc = zzhfuVar3;
        this.zzd = zzhfuVar4;
        this.zze = zzhfuVar5;
        this.zzf = zzhfuVar6;
        this.zzg = zzhfuVar7;
        this.zzh = zzhfuVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdkb zzb() {
        com.google.android.gms.ads.internal.util.zzg zzb = ((zzcgn) this.zza).zzb();
        zzffg zza = ((zzcwh) this.zzb).zza();
        zzdjg zzdjgVar = (zzdjg) this.zzc.zzb();
        zzdjb zza2 = ((zzdju) this.zzd).zza();
        zzdkn zzdknVar = (zzdkn) this.zze.zzb();
        zzdkv zzdkvVar = (zzdkv) this.zzf.zzb();
        Executor executor = (Executor) this.zzg.zzb();
        zzgcu zzgcuVar = zzbzo.zza;
        zzhfk.zzb(zzgcuVar);
        return new zzdkb(zzb, zza, zzdjgVar, zza2, zzdknVar, zzdkvVar, executor, zzgcuVar, (zzdiy) this.zzh.zzb());
    }
}
