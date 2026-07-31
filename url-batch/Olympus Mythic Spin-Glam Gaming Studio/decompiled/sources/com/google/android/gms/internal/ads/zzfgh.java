package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzfgh implements zzhcv {
    final /* synthetic */ zzeup zza;
    final /* synthetic */ zzfrg zzb;
    final /* synthetic */ zzfqw zzc;
    final /* synthetic */ zzfgi zzd;
    final /* synthetic */ zzfgl zze;

    zzfgh(zzfgl zzfglVar, zzeup zzeupVar, zzfrg zzfrgVar, zzfqw zzfqwVar, zzfgi zzfgiVar) {
        this.zza = zzeupVar;
        this.zzb = zzfrgVar;
        this.zzc = zzfqwVar;
        this.zzd = zzfgiVar;
        Objects.requireNonNull(zzfglVar);
        this.zze = zzfglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfrg zzfrgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzfgl zzfglVar = this.zze;
        zzcvn zzcvnVar = (zzcvn) zzfglVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcvnVar == null ? zzfmy.zzb(th, null) : zzcvnVar.zza().zzg(th);
        synchronized (zzfglVar) {
            try {
                zzfglVar.zzl(null);
                if (zzcvnVar != null) {
                    zzcvnVar.zze().zzdJ(zzb);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjB)).booleanValue()) {
                        zzfglVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgg
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzfgh.this.zze.zzi().zzdJ(zzb);
                            }
                        });
                    }
                } else {
                    zzfglVar.zzi().zzdJ(zzb);
                    ((zzcvn) zzfglVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
                }
                zzfmt.zza(zzb.zza, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zzb) == null) {
                    zzfrj zzk = zzfglVar.zzk();
                    zzfqw zzfqwVar = this.zzc;
                    zzfqwVar.zzh(zzb);
                    zzfqwVar.zzj(th);
                    zzfqwVar.zzd(false);
                    zzk.zzb(zzfqwVar.zzm());
                } else {
                    zzfrgVar.zzf(zzb);
                    zzfqw zzfqwVar2 = this.zzc;
                    zzfqwVar2.zzj(th);
                    zzfqwVar2.zzd(false);
                    zzfrgVar.zza(zzfqwVar2);
                    zzfrgVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfrg zzfrgVar;
        zzfgl zzfglVar = this.zze;
        zzcyl zzcylVar = (zzcyl) obj;
        synchronized (zzfglVar) {
            if (zzcylVar != null) {
                try {
                    zzcylVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzfglVar.zzl(null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzjB)).booleanValue()) {
                zzcylVar.zzq().zzc(zzfglVar.zzi());
            }
            this.zza.zzb(zzcylVar);
            if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zzb) == null) {
                zzfrj zzk = zzfglVar.zzk();
                zzfqw zzfqwVar = this.zzc;
                zzfqwVar.zzg(zzcylVar.zzr().zzb);
                zzfqwVar.zzi(zzcylVar.zzn().zze());
                zzfqwVar.zzd(true);
                zzk.zzb(zzfqwVar.zzm());
            } else {
                zzfrgVar.zze(zzcylVar.zzr().zzb);
                zzfrgVar.zzg(zzcylVar.zzn().zze());
                zzfqw zzfqwVar2 = this.zzc;
                zzfqwVar2.zzd(true);
                zzfrgVar.zza(zzfqwVar2);
                zzfrgVar.zzh();
            }
        }
    }
}
