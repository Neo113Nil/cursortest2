package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
final class zzdvm implements zzhcv {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbqh zzb;

    zzdvm(zzdvv zzdvvVar, String str, zzbqh zzbqhVar) {
        this.zza = str;
        this.zzb = zzbqhVar;
        Objects.requireNonNull(zzdvvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzclm) obj).zzac(this.zza, this.zzb);
    }
}
