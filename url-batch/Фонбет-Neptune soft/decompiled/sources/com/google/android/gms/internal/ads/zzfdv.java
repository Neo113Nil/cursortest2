package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfdv implements zzgcf {
    final /* synthetic */ zzemz zza;
    final /* synthetic */ zzfkf zzb;
    final /* synthetic */ zzfju zzc;
    final /* synthetic */ zzfdx zzd;
    final /* synthetic */ zzfdy zze;

    zzfdv(zzfdy zzfdyVar, zzemz zzemzVar, zzfkf zzfkfVar, zzfju zzfjuVar, zzfdx zzfdxVar) {
        this.zza = zzemzVar;
        this.zzb = zzfkfVar;
        this.zzc = zzfjuVar;
        this.zzd = zzfdxVar;
        this.zze = zzfdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th) {
        zzfcc zzfccVar;
        zzfdo zzfdoVar;
        zzdot zzk;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        Executor executor;
        zzfccVar = this.zze.zze;
        zzdou zzdouVar = (zzdou) zzfccVar.zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdouVar == null ? zzfgi.zzb(th, null) : zzdouVar.zzb().zza(th);
        synchronized (this.zze) {
            if (zzdouVar != null) {
                zzdouVar.zza().zzdB(zzb);
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdt
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfdo zzfdoVar2;
                        zzfdoVar2 = zzfdv.this.zze.zzd;
                        zzfdoVar2.zzdB(zzb);
                    }
                });
            } else {
                zzfdoVar = this.zze.zzd;
                zzfdoVar.zzdB(zzb);
                zzk = this.zze.zzk(this.zzd);
                zzk.zzh().zzb().zzc().zzh();
            }
            zzfgd.zzb(zzb.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zzg;
                zzfju zzfjuVar = this.zzc;
                zzfjuVar.zza(zzb);
                zzfjuVar.zzh(th);
                zzfjuVar.zzg(false);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzc(zzb);
                zzfju zzfjuVar2 = this.zzc;
                zzfjuVar2.zzh(th);
                zzfjuVar2.zzg(false);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfdo zzfdoVar;
        Executor executor;
        final zzfdo zzfdoVar2;
        zzfdo zzfdoVar3;
        zzfki zzfkiVar;
        zzfkf zzfkfVar;
        zzdop zzdopVar = (zzdop) obj;
        synchronized (this.zze) {
            zzday zzo = zzdopVar.zzo();
            zzfdoVar = this.zze.zzd;
            zzo.zzd(zzfdoVar);
            this.zza.zzb(zzdopVar);
            zzfdy zzfdyVar = this.zze;
            executor = zzfdyVar.zzb;
            zzfdoVar2 = zzfdyVar.zzd;
            Objects.requireNonNull(zzfdoVar2);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfdu
                @Override // java.lang.Runnable
                public final void run() {
                    zzfdo.this.zzs();
                }
            });
            zzfdoVar3 = this.zze.zzd;
            zzfdoVar3.onAdMetadataChanged();
            if (!((Boolean) zzbdl.zzc.zze()).booleanValue() || (zzfkfVar = this.zzb) == null) {
                zzfkiVar = this.zze.zzg;
                zzfju zzfjuVar = this.zzc;
                zzfjuVar.zzb(zzdopVar.zzq().zzb);
                zzfjuVar.zzd(zzdopVar.zzm().zzg());
                zzfjuVar.zzg(true);
                zzfkiVar.zzb(zzfjuVar.zzm());
            } else {
                zzfkfVar.zzg(zzdopVar.zzq().zzb);
                zzfkfVar.zze(zzdopVar.zzm().zzg());
                zzfju zzfjuVar2 = this.zzc;
                zzfjuVar2.zzg(true);
                zzfkfVar.zza(zzfjuVar2);
                zzfkfVar.zzh();
            }
        }
    }
}
