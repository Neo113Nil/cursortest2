package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzemc implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzdhd zzd;
    final /* synthetic */ zzemf zze;

    zzemc(zzemf zzemfVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzdhd zzdhdVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzdhdVar;
        Objects.requireNonNull(zzemfVar);
        this.zze = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Native ad failed to load", th);
        }
        zzdhd zzdhdVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdhdVar.zza().zzg(th);
        zzdhdVar.zzb().zzdN(zzg);
        zzemf zzemfVar = this.zze;
        zzemfVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzema
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzemc.this.zze.zzf().zze().zzdN(zzg);
            }
        });
        zzfdz.zza(zzg.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
            zzfie zzg2 = zzemfVar.zzg();
            zzfhr zzfhrVar = this.zzc;
            zzfhrVar.zzh(zzg);
            zzfhrVar.zzj(th);
            zzfhrVar.zzd(false);
            zzg2.zzb(zzfhrVar.zzm());
            return;
        }
        zzfibVar.zzf(zzg);
        zzfhr zzfhrVar2 = this.zzc;
        zzfhrVar2.zzj(th);
        zzfhrVar2.zzd(false);
        zzfibVar.zza(zzfhrVar2);
        zzfibVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfib zzfibVar;
        zzemf zzemfVar = this.zze;
        zzcqs zzcqsVar = (zzcqs) obj;
        synchronized (zzemfVar) {
            if (zzcqsVar != null) {
                zzcqsVar.zzt();
            }
            zzcqsVar.zzq().zza(zzemfVar.zzf().zzc());
            this.zza.zzb(zzcqsVar);
            zzemfVar.zze().zzb().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzemc.this.zze.zzf().zzd().zzg();
                }
            });
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzg = zzemfVar.zzg();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzcqsVar.zzr().zzb);
                zzfhrVar.zzi(zzcqsVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzg.zzb(zzfhrVar.zzm());
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
