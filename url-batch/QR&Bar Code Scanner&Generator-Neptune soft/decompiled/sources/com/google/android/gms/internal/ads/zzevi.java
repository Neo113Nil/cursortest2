package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzevi implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;

    public zzevi(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4, zzgxv zzgxvVar5) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
        this.zzd = zzgxvVar4;
        this.zze = zzgxvVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevh zzb() {
        Context zza = ((zzcos) this.zza).zza();
        zzfzq zzfzqVar = zzchc.zza;
        zzgxq.zzb(zzfzqVar);
        return new zzevh(zza, zzfzqVar, ((zzgxt) this.zzc).zzb(), (zzfju) this.zzd.zzb(), (zzdxq) this.zze.zzb());
    }
}
