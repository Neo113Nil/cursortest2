package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzewj implements zzfuw {
    final /* synthetic */ zzemr zza;
    final /* synthetic */ zzfhq zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzewl zzd;
    final /* synthetic */ zzewm zze;

    zzewj(zzewm zzewmVar, zzemr zzemrVar, zzfhq zzfhqVar, zzfhg zzfhgVar, zzewl zzewlVar) {
        this.zze = zzewmVar;
        this.zza = zzemrVar;
        this.zzb = zzfhqVar;
        this.zzc = zzfhgVar;
        this.zzd = zzewlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzeyv zzeyvVar;
        zzexc zzexcVar;
        zzdba zzm;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        Executor executor;
        zzeyvVar = this.zze.zze;
        zzcvc zzcvcVar = (zzcvc) zzeyvVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcvcVar == null ? zzfcx.zzb(th, null) : zzcvcVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcvcVar != null) {
                zzcvcVar.zzc().zza(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzexc zzexcVar2;
                            zzewj zzewjVar = zzewj.this;
                            com.google.android.gms.ads.internal.client.zze zzeVar = zzb;
                            zzexcVar2 = zzewjVar.zze.zzd;
                            zzexcVar2.zza(zzeVar);
                        }
                    });
                }
            } else {
                zzexcVar = this.zze.zzd;
                zzexcVar.zza(zzb);
                zzm = this.zze.zzm(this.zzd);
                ((zzcvc) zzm.zzh()).zzb().zzc().zzd();
            }
            zzfcs.zzb(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhqVar = this.zzb) == null) {
                zzfhsVar = this.zze.zzh;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zza(zzb);
                zzfhgVar.zze(false);
                zzfhsVar.zzb(zzfhgVar.zzj());
            } else {
                zzfhqVar.zzc(zzb);
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zze(false);
                zzfhqVar.zza(zzfhgVar2);
                zzfhqVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        zzexc zzexcVar;
        zzcxw zzcxwVar = (zzcxw) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzgM)).booleanValue()) {
                zzdfw zzn = zzcxwVar.zzn();
                zzexcVar = this.zze.zzd;
                zzn.zzb(zzexcVar);
            }
            this.zza.zzb(zzcxwVar);
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhqVar = this.zzb) == null) {
                zzfhsVar = this.zze.zzh;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzcxwVar.zzp().zzb);
                zzfhgVar.zzc(zzcxwVar.zzl().zzg());
                zzfhgVar.zze(true);
                zzfhsVar.zzb(zzfhgVar.zzj());
            } else {
                zzfhqVar.zzf(zzcxwVar.zzp().zzb);
                zzfhqVar.zze(zzcxwVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zze(true);
                zzfhqVar.zza(zzfhgVar2);
                zzfhqVar.zzg();
            }
        }
    }
}
