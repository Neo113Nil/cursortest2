package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdrr implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;
    private final zziof zzg;
    private final zziof zzh;

    private zzdrr(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9) {
        this.zza = zziofVar;
        this.zzb = zziofVar2;
        this.zzc = zziofVar3;
        this.zzd = zziofVar4;
        this.zze = zziofVar5;
        this.zzf = zziofVar6;
        this.zzg = zziofVar7;
        this.zzh = zziofVar9;
    }

    public static zzdrr zzc(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9) {
        return new zzdrr(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8, zziofVar9);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdrq zzb() {
        return new zzdrq(((zzcoe) this.zza).zzb(), ((zzddg) this.zzb).zza(), (zzdqw) this.zzc.zzb(), ((zzdrj) this.zzd).zza(), (zzdse) this.zze.zzb(), (zzdsm) this.zzf.zzb(), (Executor) this.zzg.zzb(), zzfoy.zzc(), (zzdqo) this.zzh.zzb());
    }
}
