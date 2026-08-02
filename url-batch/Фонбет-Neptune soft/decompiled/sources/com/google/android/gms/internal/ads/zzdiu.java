package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdiu implements zzgcf {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdiw zzb;

    zzdiu(zzdiw zzdiwVar, String str, boolean z) {
        this.zzb = zzdiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzeI)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdjb zzdjbVar;
        zzdjb zzdjbVar2;
        zzdjbVar = this.zzb.zzd;
        zzdjbVar.zzT((zzcej) obj);
        zzdiw zzdiwVar = this.zzb;
        zzdjbVar2 = zzdiwVar.zzd;
        zzbzt zzp = zzdjbVar2.zzp();
        zzeeo zzf = zzdiwVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
