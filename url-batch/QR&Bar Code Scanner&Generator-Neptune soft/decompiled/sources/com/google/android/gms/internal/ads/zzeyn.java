package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzeyn implements zzfzc {
    final /* synthetic */ zzeou zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ zzfjj zzc;
    final /* synthetic */ zzeyp zzd;
    final /* synthetic */ zzeyq zze;

    zzeyn(zzeyq zzeyqVar, zzeou zzeouVar, zzfju zzfjuVar, zzfjj zzfjjVar, zzeyp zzeypVar) {
        this.zze = zzeyqVar;
        this.zza = zzeouVar;
        this.zzb = zzfjuVar;
        this.zzc = zzfjjVar;
        this.zzd = zzeypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzfaz zzfazVar;
        zzezg zzezgVar;
        zzdci zzm;
        zzfjw zzfjwVar;
        zzfju zzfjuVar;
        Executor executor;
        zzfazVar = this.zze.zze;
        zzcwk zzcwkVar = (zzcwk) zzfazVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcwkVar == null ? zzffe.zzb(th, null) : zzcwkVar.zzb().zza(th);
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (zzcwkVar != null) {
                zzcwkVar.zzc().zza(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgZ)).booleanValue()) {
                    executor = this.zze.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeym
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzezg zzezgVar2;
                            zzeyn zzeynVar = zzeyn.this;
                            com.google.android.gms.ads.internal.client.zze zzeVar = zzb;
                            zzezgVar2 = zzeynVar.zze.zzd;
                            zzezgVar2.zza(zzeVar);
                        }
                    });
                }
            } else {
                zzezgVar = this.zze.zzd;
                zzezgVar.zza(zzb);
                zzm = this.zze.zzm(this.zzd);
                ((zzcwk) zzm.zzh()).zzb().zzc().zzd();
            }
            zzfez.zzb(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbkl.zzc.zze()).booleanValue() || (zzfjuVar = this.zzb) == null) {
                zzfjwVar = this.zze.zzh;
                zzfjj zzfjjVar = this.zzc;
                zzfjjVar.zza(zzb);
                zzfjjVar.zze(false);
                zzfjwVar.zzb(zzfjjVar.zzj());
            } else {
                zzfjuVar.zzc(zzb);
                zzfjj zzfjjVar2 = this.zzc;
                zzfjjVar2.zze(false);
                zzfjuVar.zza(zzfjjVar2);
                zzfjuVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjw zzfjwVar;
        zzfju zzfjuVar;
        zzezg zzezgVar;
        zzcze zzczeVar = (zzcze) obj;
        synchronized (this.zze) {
            this.zze.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgZ)).booleanValue()) {
                zzdhe zzn = zzczeVar.zzn();
                zzezgVar = this.zze.zzd;
                zzn.zzb(zzezgVar);
            }
            this.zza.zzb(zzczeVar);
            if (!((Boolean) zzbkl.zzc.zze()).booleanValue() || (zzfjuVar = this.zzb) == null) {
                zzfjwVar = this.zze.zzh;
                zzfjj zzfjjVar = this.zzc;
                zzfjjVar.zzb(zzczeVar.zzp().zzb);
                zzfjjVar.zzc(zzczeVar.zzl().zzg());
                zzfjjVar.zze(true);
                zzfjwVar.zzb(zzfjjVar.zzj());
            } else {
                zzfjuVar.zzf(zzczeVar.zzp().zzb);
                zzfjuVar.zze(zzczeVar.zzl().zzg());
                zzfjj zzfjjVar2 = this.zzc;
                zzfjjVar2.zze(true);
                zzfjuVar.zza(zzfjjVar2);
                zzfjuVar.zzg();
            }
        }
    }
}
