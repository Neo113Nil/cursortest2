package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes12.dex */
public final class zzejh implements zzinw {
    private final zziof zza;
    private final zziof zzb;
    private final zziof zzc;
    private final zziof zzd;
    private final zziof zze;
    private final zziof zzf;

    private zzejh(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9) {
        this.zza = zziofVar;
        this.zzb = zziofVar4;
        this.zzc = zziofVar5;
        this.zzd = zziofVar6;
        this.zze = zziofVar8;
        this.zzf = zziofVar9;
    }

    public static zzejh zza(zziof zziofVar, zziof zziofVar2, zziof zziofVar3, zziof zziofVar4, zziof zziofVar5, zziof zziofVar6, zziof zziofVar7, zziof zziofVar8, zziof zziofVar9) {
        return new zzejh(zziofVar, zziofVar2, zziofVar3, zziofVar4, zziofVar5, zziofVar6, zziofVar7, zziofVar8, zziofVar9);
    }

    @Override // com.google.android.gms.internal.ads.zziol, com.google.android.gms.internal.ads.zziok
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejg(((zzcok) this.zza).zza(), zzfoy.zzc(), zzcpk.zza(), ((zzcow) this.zzb).zzb(), ((zzejp) this.zzc).zzb(), (ArrayDeque) this.zzd.zzb(), zzcph.zza(), (zzfrj) this.zze.zzb(), (zzcny) this.zzf.zzb());
    }
}
