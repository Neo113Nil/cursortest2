package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzdag implements zzfzc {
    final /* synthetic */ zzdah zza;

    zzdag(zzdah zzdahVar) {
        this.zza = zzdahVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzdie zzdieVar;
        zzdieVar = this.zza.zzf;
        zzdieVar.zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdie zzdieVar;
        zzdieVar = this.zza.zzf;
        zzdieVar.zzh(true);
    }
}
