package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeiu implements zzfzc {
    final /* synthetic */ zzeiv zza;

    zzeiu(zzeiv zzeivVar) {
        this.zza = zzeivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzcxz zzcxzVar;
        zzddc zzddcVar;
        zzcxzVar = this.zza.zza;
        com.google.android.gms.ads.internal.client.zze zza = zzcxzVar.zzd().zza(th);
        zzddcVar = this.zza.zzd;
        zzddcVar.zza(zza);
        zzfez.zzb(zza.zza, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcxc) obj).zzW();
    }
}
