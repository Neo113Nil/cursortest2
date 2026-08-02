package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfco implements zzena {
    private final Context zza;
    private final Executor zzb;
    private final zzcgj zzc;
    private final zzemk zzd;
    private final zzfdo zze;
    private zzbcr zzf;
    private final zzfki zzg;
    private final zzffe zzh;
    private ListenableFuture zzi;

    public zzfco(Context context, Executor executor, zzcgj zzcgjVar, zzemk zzemkVar, zzfdo zzfdoVar, zzffe zzffeVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgjVar;
        this.zzd = zzemkVar;
        this.zzh = zzffeVar;
        this.zze = zzfdoVar;
        this.zzg = zzcgjVar.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzi;
        return (listenableFuture == null || listenableFuture.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzena
    public final boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemy zzemyVar, zzemz zzemzVar) {
        zzdgp zzh;
        zzfkf zzfkfVar;
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfci
                @Override // java.lang.Runnable
                public final void run() {
                    zzfco.this.zzh();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzia)).booleanValue() && zzlVar.zzf) {
            this.zzc.zzl().zzo(true);
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar = ((zzfch) zzemyVar).zza;
        Bundle zza = zzdrv.zza(new Pair(zzdrt.PUBLIC_API_CALL.zza(), Long.valueOf(zzlVar.zzz)), new Pair(zzdrt.DYNAMITE_ENTER.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis())));
        zzffe zzffeVar = this.zzh;
        zzffeVar.zzt(str);
        zzffeVar.zzs(zzqVar);
        zzffeVar.zzH(zzlVar);
        zzffeVar.zzA(zza);
        Context context = this.zza;
        zzffg zzJ = zzffeVar.zzJ();
        zzfju zzb = zzfjt.zzb(context, zzfke.zzf(zzJ), 4, zzlVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzhr)).booleanValue()) {
            zzdgo zzg = this.zzc.zzg();
            zzcvy zzcvyVar = new zzcvy();
            zzcvyVar.zze(this.zza);
            zzcvyVar.zzi(zzJ);
            zzg.zze(zzcvyVar.zzj());
            zzdci zzdciVar = new zzdci();
            zzdciVar.zzj(this.zzd, this.zzb);
            zzdciVar.zzk(this.zzd, this.zzb);
            zzg.zzd(zzdciVar.zzn());
            zzg.zzc(new zzekt(this.zzf));
            zzh = zzg.zzh();
        } else {
            zzdci zzdciVar2 = new zzdci();
            zzfdo zzfdoVar = this.zze;
            if (zzfdoVar != null) {
                zzdciVar2.zze(zzfdoVar, this.zzb);
                zzdciVar2.zzf(this.zze, this.zzb);
                zzdciVar2.zzb(this.zze, this.zzb);
            }
            zzdgo zzg2 = this.zzc.zzg();
            zzcvy zzcvyVar2 = new zzcvy();
            zzcvyVar2.zze(this.zza);
            zzcvyVar2.zzi(zzJ);
            zzg2.zze(zzcvyVar2.zzj());
            zzdciVar2.zzj(this.zzd, this.zzb);
            zzdciVar2.zze(this.zzd, this.zzb);
            zzdciVar2.zzf(this.zzd, this.zzb);
            zzdciVar2.zzb(this.zzd, this.zzb);
            zzdciVar2.zza(this.zzd, this.zzb);
            zzdciVar2.zzl(this.zzd, this.zzb);
            zzdciVar2.zzk(this.zzd, this.zzb);
            zzdciVar2.zzi(this.zzd, this.zzb);
            zzdciVar2.zzc(this.zzd, this.zzb);
            zzg2.zzd(zzdciVar2.zzn());
            zzg2.zzc(new zzekt(this.zzf));
            zzh = zzg2.zzh();
        }
        zzdgp zzdgpVar = zzh;
        if (((Boolean) zzbdl.zzc.zze()).booleanValue()) {
            zzfkf zzf = zzdgpVar.zzf();
            zzf.zzi(4);
            zzf.zzb(zzlVar.zzp);
            zzf.zzf(zzlVar.zzm);
            zzfkfVar = zzf;
        } else {
            zzfkfVar = null;
        }
        zzctc zza2 = zzdgpVar.zza();
        ListenableFuture zzi = zza2.zzi(zza2.zzj());
        this.zzi = zzi;
        zzgcj.zzr(zzi, new zzfcn(this, zzemzVar, zzfkfVar, zzb, zzdgpVar), this.zzb);
        return true;
    }

    final /* synthetic */ void zzh() {
        this.zzd.zzdB(zzfgi.zzd(6, null, null));
    }

    public final void zzi(zzbcr zzbcrVar) {
        this.zzf = zzbcrVar;
    }
}
