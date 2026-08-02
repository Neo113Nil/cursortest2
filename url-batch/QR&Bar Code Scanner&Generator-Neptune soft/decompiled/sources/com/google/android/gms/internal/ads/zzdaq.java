package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdaq implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;
    private final zzgxv zzc;

    public zzdaq(zzgxv zzgxvVar, zzgxv zzgxvVar2, zzgxv zzgxvVar3) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
        this.zzc = zzgxvVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzcpe) this.zzb).zzb().zzb((Clock) this.zza.zzb(), ((zzdcr) this.zzc).zza().zzf);
    }
}
