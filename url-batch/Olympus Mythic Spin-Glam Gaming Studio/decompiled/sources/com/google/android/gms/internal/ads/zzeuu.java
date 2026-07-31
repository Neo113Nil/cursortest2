package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzeuu implements zzhcv {
    final /* synthetic */ zzeup zza;
    final /* synthetic */ zzfrg zzb;
    final /* synthetic */ zzfqw zzc;
    final /* synthetic */ zzdpa zzd;
    final /* synthetic */ zzeux zze;

    zzeuu(zzeux zzeuxVar, zzeup zzeupVar, zzfrg zzfrgVar, zzfqw zzfqwVar, zzdpa zzdpaVar) {
        this.zza = zzeupVar;
        this.zzb = zzfrgVar;
        this.zzc = zzfqwVar;
        this.zzd = zzdpaVar;
        Objects.requireNonNull(zzeuxVar);
        this.zze = zzeuxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        zzfrg zzfrgVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzgR)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdpa zzdpaVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdpaVar.zza().zzg(th);
        zzdpaVar.zzb().zzdJ(zzg);
        zzeux zzeuxVar = this.zze;
        zzeuxVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeus
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeuu.this.zze.zzf().zze().zzdJ(zzg);
            }
        });
        zzfmt.zza(zzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zzb) == null) {
            zzfrj zzg2 = zzeuxVar.zzg();
            zzfqw zzfqwVar = this.zzc;
            zzfqwVar.zzh(zzg);
            zzfqwVar.zzj(th);
            zzfqwVar.zzd(false);
            zzg2.zzb(zzfqwVar.zzm());
            return;
        }
        zzfrgVar.zzf(zzg);
        zzfqw zzfqwVar2 = this.zzc;
        zzfqwVar2.zzj(th);
        zzfqwVar2.zzd(false);
        zzfrgVar.zza(zzfqwVar2);
        zzfrgVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfrg zzfrgVar;
        zzeux zzeuxVar = this.zze;
        zzcyl zzcylVar = (zzcyl) obj;
        synchronized (zzeuxVar) {
            if (zzcylVar != null) {
                try {
                    zzcylVar.zzt();
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzcylVar.zzq().zza(zzeuxVar.zzf().zzc());
            this.zza.zzb(zzcylVar);
            zzeuxVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeut
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeuu.this.zze.zzf().zzd().zzg();
                }
            });
            if (!((Boolean) zzbla.zzc.zze()).booleanValue() || (zzfrgVar = this.zzb) == null) {
                zzfrj zzg = zzeuxVar.zzg();
                zzfqw zzfqwVar = this.zzc;
                zzfqwVar.zzg(zzcylVar.zzr().zzb);
                zzfqwVar.zzi(zzcylVar.zzn().zze());
                zzfqwVar.zzd(true);
                zzg.zzb(zzfqwVar.zzm());
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
