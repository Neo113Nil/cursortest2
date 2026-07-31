package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzfrd implements zzhcv {
    final /* synthetic */ zzfrg zza;
    final /* synthetic */ zzfqw zzb;

    zzfrd(zzfrg zzfrgVar, zzfqw zzfqwVar) {
        this.zza = zzfrgVar;
        this.zzb = zzfqwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfqw zzfqwVar = this.zzb;
        zzfqwVar.zzj(th);
        zzfqwVar.zzd(false);
        this.zza.zza(zzfqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zzb(Object obj) {
    }
}
