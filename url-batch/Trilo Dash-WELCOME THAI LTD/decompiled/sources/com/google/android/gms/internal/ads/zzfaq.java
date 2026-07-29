package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzfaq implements zzfuw {
    final /* synthetic */ zzemr zza;
    final /* synthetic */ zzfhq zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzfas zzd;
    final /* synthetic */ zzfat zze;

    zzfaq(zzfat zzfatVar, zzemr zzemrVar, zzfhq zzfhqVar, zzfhg zzfhgVar, zzfas zzfasVar) {
        this.zze = zzfatVar;
        this.zza = zzemrVar;
        this.zzb = zzfhqVar;
        this.zzc = zzfhgVar;
        this.zzd = zzfasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzeyv zzeyvVar;
        zzfaj zzfajVar;
        zzdsw zzk;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        Executor executor;
        zzeyvVar = this.zze.zze;
        zzdsx zzdsxVar = (zzdsx) zzeyvVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdsxVar == null ? zzfcx.zzb(th, null) : zzdsxVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzdsxVar != null) {
                zzdsxVar.zza().zza(zzb);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfap
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfaj zzfajVar2;
                        zzfaq zzfaqVar = zzfaq.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zzb;
                        zzfajVar2 = zzfaqVar.zze.zzd;
                        zzfajVar2.zza(zzeVar);
                    }
                });
            } else {
                zzfajVar = this.zze.zzd;
                zzfajVar.zza(zzb);
                zzk = this.zze.zzk(this.zzd);
                zzk.zzh().zzb().zzc().zzd();
            }
            zzfcs.zzb(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhqVar = this.zzb) == null) {
                zzfhsVar = this.zze.zzg;
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
        zzfaj zzfajVar;
        Executor executor;
        final zzfaj zzfajVar2;
        zzfaj zzfajVar3;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        zzdss zzdssVar = (zzdss) obj;
        synchronized (this.zze) {
            zzdfw zzn = zzdssVar.zzn();
            zzfajVar = this.zze.zzd;
            zzn.zzd(zzfajVar);
            this.zza.zzb(zzdssVar);
            zzfat zzfatVar = this.zze;
            executor = zzfatVar.zzb;
            zzfajVar2 = zzfatVar.zzd;
            zzfajVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfao
                @Override // java.lang.Runnable
                public final void run() {
                    zzfaj.this.zzn();
                }
            });
            zzfajVar3 = this.zze.zzd;
            zzfajVar3.zzv();
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhqVar = this.zzb) == null) {
                zzfhsVar = this.zze.zzg;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzdssVar.zzp().zzb);
                zzfhgVar.zzc(zzdssVar.zzl().zzg());
                zzfhgVar.zze(true);
                zzfhsVar.zzb(zzfhgVar.zzj());
            } else {
                zzfhqVar.zzf(zzdssVar.zzp().zzb);
                zzfhqVar.zze(zzdssVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zze(true);
                zzfhqVar.zza(zzfhgVar2);
                zzfhqVar.zzg();
            }
        }
    }
}
