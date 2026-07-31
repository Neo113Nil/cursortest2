package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzdti implements zzhcv {
    final /* synthetic */ zzdzs zza;
    final /* synthetic */ zzdtl zzb;

    zzdti(zzdtl zzdtlVar, zzdzs zzdzsVar) {
        this.zza = zzdzsVar;
        Objects.requireNonNull(zzdtlVar);
        this.zzb = zzdtlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
        this.zzb.zzd().zzf(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }
}
