package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcta implements zzgcf {
    final /* synthetic */ zzctc zza;

    zzcta(zzctc zzctcVar) {
        this.zza = zzctcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        zzdby zzdbyVar;
        zzdbyVar = this.zza.zzf;
        zzdbyVar.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdby zzdbyVar;
        zzdbyVar = this.zza.zzf;
        zzdbyVar.zzn(true);
    }
}
