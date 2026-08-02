package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdjj implements zzgxi {
    private final zzdim zza;
    private final zzgxv zzb;
    private final zzgxv zzc;
    private final zzgxv zzd;
    private final zzgxv zze;

    public zzdjj(zzdim zzdimVar, zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3, zzgxv zzgxvVar4) {
        this.zza = zzdimVar;
        this.zzb = zzgxvVar;
        this.zzc = zzgxvVar2;
        this.zzd = zzgxvVar3;
        this.zze = zzgxvVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzeko zzb = this.zza.zzb((Clock) this.zzb.zzb(), ((zzekq) this.zzc).zzb(), (zzehh) this.zzd.zzb(), (zzfkm) this.zze.zzb());
        zzgxq.zzb(zzb);
        return zzb;
    }
}
