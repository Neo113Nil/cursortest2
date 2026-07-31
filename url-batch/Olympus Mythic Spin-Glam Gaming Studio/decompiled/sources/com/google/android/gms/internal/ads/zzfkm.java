package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
final class zzfkm implements zzhcv {
    final /* synthetic */ zzeup zza;
    final /* synthetic */ zzfrg zzb;
    final /* synthetic */ zzfqw zzc;
    final /* synthetic */ zzfkp zzd;
    final /* synthetic */ zzfkq zze;

    zzfkm(zzfkq zzfkqVar, zzeup zzeupVar, zzfrg zzfrgVar, zzfqw zzfqwVar, zzfkp zzfkpVar) {
        this.zza = zzeupVar;
        this.zzb = zzfrgVar;
        this.zzc = zzfqwVar;
        this.zzd = zzfkpVar;
        Objects.requireNonNull(zzfkqVar);
        this.zze = zzfkqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfrg zzfrgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfkq zzfkqVar = this.zze;
        zzdwp zzdwpVar = (zzdwp) zzfkqVar.zzh().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzdwpVar == null ? zzfmy.zzb(th, null) : zzdwpVar.zza().zzg(th);
        synchronized (zzfkqVar) {
            try {
                if (zzdwpVar != null) {
                    zzdwpVar.zze().zzdJ(zzb);
                    zzfkqVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkl
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzfkm.this.zze.zzg().zzdJ(zzb);
                        }
                    });
                } else {
                    zzfkqVar.zzg().zzdJ(zzb);
                    zzfkqVar.zze(this.zzd).zzh().zza().zzd().zzo();
                }
                zzfmt.zza(zzb.zza, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zzb) == null) {
                    zzfrj zzi = zzfkqVar.zzi();
                    zzfqw zzfqwVar = this.zzc;
                    zzfqwVar.zzh(zzb);
                    zzfqwVar.zzj(th);
                    zzfqwVar.zzd(false);
                    zzi.zzb(zzfqwVar.zzm());
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
        zzfkq zzfkqVar = this.zze;
        zzdwk zzdwkVar = (zzdwk) obj;
        synchronized (zzfkqVar) {
            if (zzdwkVar != null) {
                try {
                    zzdwkVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzdwkVar.zzq().zzd(zzfkqVar.zzg());
            this.zza.zzb(zzdwkVar);
            Executor zzf = zzfkqVar.zzf();
            final zzfkh zzg = zzfkqVar.zzg();
            Objects.requireNonNull(zzg);
            zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfkk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfkh.this.zzg();
                }
            });
            zzfkqVar.zzg().onAdMetadataChanged();
            if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zzb) == null) {
                zzfrj zzi = zzfkqVar.zzi();
                zzfqw zzfqwVar = this.zzc;
                zzfqwVar.zzg(zzdwkVar.zzr().zzb);
                zzfqwVar.zzi(zzdwkVar.zzn().zze());
                zzfqwVar.zzd(true);
                zzi.zzb(zzfqwVar.zzm());
            } else {
                zzfrgVar.zze(zzdwkVar.zzr().zzb);
                zzfrgVar.zzg(zzdwkVar.zzn().zze());
                zzfqw zzfqwVar2 = this.zzc;
                zzfqwVar2.zzd(true);
                zzfrgVar.zza(zzfqwVar2);
                zzfrgVar.zzh();
            }
        }
    }
}
