package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzdif implements zzgoq {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdip zzb;

    zzdif(zzdip zzdipVar, String str, boolean z) {
        Objects.requireNonNull(zzdipVar);
        this.zzb = zzdipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfR)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdip zzdipVar = this.zzb;
        zzdipVar.zzZ().zzo((zzcek) obj);
        String str = this.zza;
        zzbzm zzY = zzdipVar.zzZ().zzY();
        zzedu zzL = zzdipVar.zzL(str, true);
        if (zzL != null && zzY != null) {
            zzY.zzc(zzL);
        } else if (zzY != null) {
            zzY.cancel(false);
        }
    }
}
