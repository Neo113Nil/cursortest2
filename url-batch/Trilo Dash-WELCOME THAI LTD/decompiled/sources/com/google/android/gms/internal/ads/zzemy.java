package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzemy implements zzfuw {
    final /* synthetic */ zzemr zza;
    final /* synthetic */ zzfhq zzb;
    final /* synthetic */ zzfhg zzc;
    final /* synthetic */ zzdlt zzd;
    final /* synthetic */ zzemz zze;

    zzemy(zzemz zzemzVar, zzemr zzemrVar, zzfhq zzfhqVar, zzfhg zzfhgVar, zzdlt zzdltVar) {
        this.zze = zzemzVar;
        this.zza = zzemrVar;
        this.zzb = zzfhqVar;
        this.zzc = zzfhgVar;
        this.zzd = zzdltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final void zza(Throwable th) {
        zzcnf zzcnfVar;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza);
        zzcnfVar = this.zze.zzb;
        zzcnfVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // java.lang.Runnable
            public final void run() {
                zzemp zzempVar;
                zzemy zzemyVar = zzemy.this;
                com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                zzempVar = zzemyVar.zze.zzd;
                zzempVar.zza().zza(zzeVar);
            }
        });
        zzfcs.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhqVar = this.zzb) == null) {
            zzfhsVar = this.zze.zze;
            zzfhg zzfhgVar = this.zzc;
            zzfhgVar.zza(zza);
            zzfhgVar.zze(false);
            zzfhsVar.zzb(zzfhgVar.zzj());
            return;
        }
        zzfhqVar.zzc(zza);
        zzfhg zzfhgVar2 = this.zzc;
        zzfhgVar2.zze(false);
        zzfhqVar.zza(zzfhgVar2);
        zzfhqVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfuw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzemp zzempVar;
        zzcnf zzcnfVar;
        zzfhs zzfhsVar;
        zzfhq zzfhqVar;
        zzcxw zzcxwVar = (zzcxw) obj;
        synchronized (this.zze) {
            zzdfw zzn = zzcxwVar.zzn();
            zzempVar = this.zze.zzd;
            zzn.zza(zzempVar.zzd());
            this.zza.zzb(zzcxwVar);
            zzcnfVar = this.zze.zzb;
            zzcnfVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzemw
                @Override // java.lang.Runnable
                public final void run() {
                    zzemp zzempVar2;
                    zzempVar2 = zzemy.this.zze.zzd;
                    zzempVar2.zzb().zzn();
                }
            });
            if (!((Boolean) zzbjh.zzc.zze()).booleanValue() || (zzfhqVar = this.zzb) == null) {
                zzfhsVar = this.zze.zze;
                zzfhg zzfhgVar = this.zzc;
                zzfhgVar.zzb(zzcxwVar.zzp().zzb);
                zzfhgVar.zzc(zzcxwVar.zzl().zzg());
                zzfhgVar.zze(true);
                zzfhsVar.zzb(zzfhgVar.zzj());
            } else {
                zzfhqVar.zzf(zzcxwVar.zzp().zzb);
                zzfhqVar.zze(zzcxwVar.zzl().zzg());
                zzfhg zzfhgVar2 = this.zzc;
                zzfhgVar2.zze(true);
                zzfhqVar.zza(zzfhgVar2);
                zzfhqVar.zzg();
            }
        }
    }
}
