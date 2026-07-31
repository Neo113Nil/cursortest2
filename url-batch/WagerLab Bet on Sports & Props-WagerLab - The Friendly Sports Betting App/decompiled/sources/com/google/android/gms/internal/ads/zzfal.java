package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
final class zzfal implements zzgoq {
    final /* synthetic */ zzelx zza;
    final /* synthetic */ zzfib zzb;
    final /* synthetic */ zzfhr zzc;
    final /* synthetic */ zzdgh zzd;
    final /* synthetic */ zzfan zze;

    zzfal(zzfan zzfanVar, zzelx zzelxVar, zzfib zzfibVar, zzfhr zzfhrVar, zzdgh zzdghVar) {
        this.zza = zzelxVar;
        this.zzb = zzfibVar;
        this.zzc = zzfhrVar;
        this.zzd = zzdghVar;
        Objects.requireNonNull(zzfanVar);
        this.zze = zzfanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        zzfib zzfibVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzgk)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Interstitial ad failed to load", th);
        }
        zzdgh zzdghVar = this.zzd;
        final com.google.android.gms.ads.internal.client.zze zzg = zzdghVar.zzb().zzg(th);
        zzfan zzfanVar = this.zze;
        synchronized (zzfanVar) {
            zzfanVar.zzi(null);
            zzdghVar.zza().zzdN(zzg);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziV)).booleanValue()) {
                zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfai
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfal.this.zze.zzf().zzdN(zzg);
                    }
                });
                zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfaj
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfal.this.zze.zzg().zzdN(zzg);
                    }
                });
            }
            zzfdz.zza(zzg.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzh = zzfanVar.zzh();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzh(zzg);
                zzfhrVar.zzj(th);
                zzfhrVar.zzd(false);
                zzh.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zzf(zzg);
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
        zzfan zzfanVar = this.zze;
        zzdfa zzdfaVar = (zzdfa) obj;
        synchronized (zzfanVar) {
            if (zzdfaVar != null) {
                zzdfaVar.zzt();
            }
            zzfanVar.zzi(null);
            zzbbz zzbbzVar = zzbci.zziV;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                zzczi zzq = zzdfaVar.zzq();
                zzq.zza(zzfanVar.zzf());
                zzq.zzd(zzfanVar.zzg());
            }
            this.zza.zzb(zzdfaVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
                zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfak
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfal.this.zze.zzf().zzg();
                    }
                });
                zzfanVar.zze().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfah
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfal.this.zze.zzg().zzg();
                    }
                });
            }
            if (!((Boolean) zzbeb.zzc.zze()).booleanValue() || (zzfibVar = this.zzb) == null) {
                zzfie zzh = zzfanVar.zzh();
                zzfhr zzfhrVar = this.zzc;
                zzfhrVar.zzg(zzdfaVar.zzr().zzb);
                zzfhrVar.zzi(zzdfaVar.zzn().zze());
                zzfhrVar.zzd(true);
                zzh.zzb(zzfhrVar.zzm());
            } else {
                zzfibVar.zze(zzdfaVar.zzr().zzb);
                zzfibVar.zzg(zzdfaVar.zzn().zze());
                zzfhr zzfhrVar2 = this.zzc;
                zzfhrVar2.zzd(true);
                zzfibVar.zza(zzfhrVar2);
                zzfibVar.zzh();
            }
        }
    }
}
