package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzfcu implements zzfzc {
    final /* synthetic */ zzeou zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ zzfjj zzc;
    final /* synthetic */ zzfcw zzd;
    final /* synthetic */ zzfcx zze;

    zzfcu(zzfcx zzfcxVar, zzeou zzeouVar, zzfju zzfjuVar, zzfjj zzfjjVar, zzfcw zzfcwVar) {
        this.zze = zzfcxVar;
        this.zza = zzeouVar;
        this.zzb = zzfjuVar;
        this.zzc = zzfjjVar;
        this.zzd = zzfcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzfaz zzfazVar;
        zzfcn zzfcnVar;
        zzdug zzk;
        zzfjw zzfjwVar;
        zzfju zzfjuVar;
        Executor executor;
        zzfazVar = this.zze.zze;
        zzduh zzduhVar = (zzduh) zzfazVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzduhVar == null ? zzffe.zzb(th, null) : zzduhVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzduhVar != null) {
                zzduhVar.zza().zza(zzb);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfct
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfcn zzfcnVar2;
                        zzfcu zzfcuVar = zzfcu.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zzb;
                        zzfcnVar2 = zzfcuVar.zze.zzd;
                        zzfcnVar2.zza(zzeVar);
                    }
                });
            } else {
                zzfcnVar = this.zze.zzd;
                zzfcnVar.zza(zzb);
                zzk = this.zze.zzk(this.zzd);
                zzk.zzh().zzb().zzc().zzd();
            }
            zzfez.zzb(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbkl.zzc.zze()).booleanValue() || (zzfjuVar = this.zzb) == null) {
                zzfjwVar = this.zze.zzg;
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
        zzfcn zzfcnVar;
        Executor executor;
        final zzfcn zzfcnVar2;
        zzfcn zzfcnVar3;
        zzfjw zzfjwVar;
        zzfju zzfjuVar;
        zzduc zzducVar = (zzduc) obj;
        synchronized (this.zze) {
            zzdhe zzn = zzducVar.zzn();
            zzfcnVar = this.zze.zzd;
            zzn.zzd(zzfcnVar);
            this.zza.zzb(zzducVar);
            zzfcx zzfcxVar = this.zze;
            executor = zzfcxVar.zzb;
            zzfcnVar2 = zzfcxVar.zzd;
            zzfcnVar2.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcs
                @Override // java.lang.Runnable
                public final void run() {
                    zzfcn.this.zzn();
                }
            });
            zzfcnVar3 = this.zze.zzd;
            zzfcnVar3.zzv();
            if (!((Boolean) zzbkl.zzc.zze()).booleanValue() || (zzfjuVar = this.zzb) == null) {
                zzfjwVar = this.zze.zzg;
                zzfjj zzfjjVar = this.zzc;
                zzfjjVar.zzb(zzducVar.zzp().zzb);
                zzfjjVar.zzc(zzducVar.zzl().zzg());
                zzfjjVar.zze(true);
                zzfjwVar.zzb(zzfjjVar.zzj());
            } else {
                zzfjuVar.zzf(zzducVar.zzp().zzb);
                zzfjuVar.zze(zzducVar.zzl().zzg());
                zzfjj zzfjjVar2 = this.zzc;
                zzfjjVar2.zze(true);
                zzfjuVar.zza(zzfjjVar2);
                zzfjuVar.zzg();
            }
        }
    }
}
