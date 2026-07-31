package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzexp implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzexq zzd;
    final /* synthetic */ zzext zze;

    zzexp(zzext zzextVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzexq zzexqVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzexqVar;
        Objects.requireNonNull(zzextVar);
        this.zze = zzextVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzext zzextVar = this.zze;
        zzcnu zzcnuVar = (zzcnu) zzextVar.zzj().zzd();
        final com.google.android.gms.ads.internal.client.zze zzb = zzcnuVar == null ? zzfee.zzb(th, null) : zzcnuVar.zza().zzg(th);
        synchronized (zzextVar) {
            zzextVar.zzl(null);
            if (zzcnuVar != null) {
                zzcnuVar.zze().zzdN(zzb);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziU)).booleanValue()) {
                    zzextVar.zzh().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexo
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzexp.this.zze.zzi().zzdN(zzb);
                        }
                    });
                }
            } else {
                zzextVar.zzi().zzdN(zzb);
                ((zzcnu) zzextVar.zzg(this.zzd).zzh()).zza().zzd().zzo();
            }
            zzfdz.zza(zzb.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzk = zzextVar.zzk();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzh(zzb);
                zzfhrVar.zzj(th);
                zzfhrVar.zzd(false);
                zzk.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zzf(zzb);
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzj(th);
                zzfhrVar2.zzd(false);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfib zzfibVar;
        zzext zzextVar = this.zze;
        zzcqs zzcqsVar = (zzcqs) obj;
        synchronized (zzextVar) {
            if (zzcqsVar != null) {
                zzcqsVar.zzt();
            }
            zzextVar.zzl(null);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziU)).booleanValue()) {
                zzcqsVar.zzq().zzc(zzextVar.zzi());
            }
            this.zza.zzb(zzcqsVar);
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzk = zzextVar.zzk();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzcqsVar.zzr().zzb);
                zzfhrVar.zzi(zzcqsVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzk.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzcqsVar.zzr().zzb);
                zzfibVar.zzg(zzcqsVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
