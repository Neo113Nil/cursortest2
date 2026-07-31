package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes15.dex */
final class zzfhm implements zzhcv {
    final /* synthetic */ zzfrg zza;
    final /* synthetic */ zzfqw zzb;
    final /* synthetic */ zzcxi zzc;
    final /* synthetic */ zzfhq zzd;

    zzfhm(zzfhq zzfhqVar, zzfrg zzfrgVar, zzfqw zzfqwVar, zzcxi zzcxiVar) {
        this.zza = zzfrgVar;
        this.zzb = zzfqwVar;
        this.zzc = zzcxiVar;
        Objects.requireNonNull(zzfhqVar);
        this.zzd = zzfhqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfrg zzfrgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzfhq zzfhqVar = this.zzd;
        synchronized (zzfhqVar) {
            try {
                zzcxi zzcxiVar = this.zzc;
                com.google.android.gms.ads.internal.client.zze zzg = zzcxiVar.zzc().zzg(th);
                zzfhqVar.zzs(zzg);
                zzcxiVar.zzb().zzdJ(zzg);
                zzfmt.zza(zzg.zza, th, "BannerAdLoader.onFailure");
                if (zzfhqVar.zzr()) {
                    zzfhqVar.zzn();
                    zzfhqVar.zzo().zzd(zzfhqVar.zzq().zzc());
                }
                if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zza) == null) {
                    zzfrj zzp = zzfhqVar.zzp();
                    zzfqw zzfqwVar = this.zzb;
                    zzfqwVar.zzh(zzg);
                    zzfqwVar.zzj(th);
                    zzfqwVar.zzd(false);
                    zzp.zzb(zzfqwVar.zzm());
                } else {
                    zzfrgVar.zzf(zzg);
                    zzfqw zzfqwVar2 = this.zzb;
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
        zzfhq zzfhqVar = this.zzd;
        zzcwd zzcwdVar = (zzcwd) obj;
        synchronized (zzfhqVar) {
            if (zzcwdVar != null) {
                try {
                    zzcwdVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (zzfhqVar.zzr()) {
                zzfhqVar.zzc();
            }
            if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zza) == null) {
                zzfrj zzp = zzfhqVar.zzp();
                zzfqw zzfqwVar = this.zzb;
                zzfqwVar.zzg(zzcwdVar.zzr().zzb);
                zzfqwVar.zzi(zzcwdVar.zzn().zze());
                zzfqwVar.zzd(true);
                zzp.zzb(zzfqwVar.zzm());
            } else {
                zzfrgVar.zze(zzcwdVar.zzr().zzb);
                zzfrgVar.zzg(zzcwdVar.zzn().zze());
                zzfqw zzfqwVar2 = this.zzb;
                zzfqwVar2.zzd(true);
                zzfrgVar.zza(zzfqwVar2);
                zzfrgVar.zzh();
            }
        }
    }
}
