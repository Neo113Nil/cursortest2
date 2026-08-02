package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbto implements zzchl {
    final /* synthetic */ zzbtq zza;

    zzbto(zzbtq zzbtqVar) {
        this.zza = zzbtqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbtv zzbtvVar;
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        zzbtvVar = this.zza.zzb;
        zzbtvVar.zzd();
    }
}
