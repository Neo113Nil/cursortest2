package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzepn implements zzgxi {
    private final zzgxv zza;
    private final zzgxv zzb;

    public zzepn(zzgxv zzgxvVar, zzgxv zzgxvVar2) {
        this.zza = zzgxvVar;
        this.zzb = zzgxvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxv
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepl((Clock) this.zza.zzb(), ((zzdcr) this.zzb).zza());
    }
}
