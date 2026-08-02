package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfdf implements zzeou {
    final /* synthetic */ zzfdh zza;

    zzfdf(zzfdh zzfdhVar) {
        this.zza = zzfdhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeou
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzduc zzducVar;
        zzfdx zzfdxVar;
        zzduc zzducVar2 = (zzduc) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzducVar2;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzcJ)).booleanValue()) {
                zzfdy zzd = zzducVar2.zzd();
                zzfdxVar = this.zza.zzc;
                zzd.zza = zzfdxVar;
            }
            zzducVar = this.zza.zzd;
            zzducVar.zzW();
        }
    }
}
