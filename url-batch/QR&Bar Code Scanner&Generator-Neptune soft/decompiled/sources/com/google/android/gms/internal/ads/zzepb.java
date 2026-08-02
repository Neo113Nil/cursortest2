package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzepb implements zzfzc {
    final /* synthetic */ zzeou zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ zzfjj zzc;
    final /* synthetic */ zzdnd zzd;
    final /* synthetic */ zzepc zze;

    zzepb(zzepc zzepcVar, zzeou zzeouVar, zzfju zzfjuVar, zzfjj zzfjjVar, zzdnd zzdndVar) {
        this.zze = zzepcVar;
        this.zza = zzeouVar;
        this.zzb = zzfjuVar;
        this.zzc = zzfjjVar;
        this.zzd = zzdndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzcom zzcomVar;
        zzfjw zzfjwVar;
        zzfju zzfjuVar;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza);
        zzcomVar = this.zze.zzb;
        zzcomVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepa
            @Override // java.lang.Runnable
            public final void run() {
                zzeos zzeosVar;
                zzepb zzepbVar = zzepb.this;
                com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                zzeosVar = zzepbVar.zze.zzd;
                zzeosVar.zza().zza(zzeVar);
            }
        });
        zzfez.zzb(zza.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbkl.zzc.zze()).booleanValue() || (zzfjuVar = this.zzb) == null) {
            zzfjwVar = this.zze.zze;
            zzfjj zzfjjVar = this.zzc;
            zzfjjVar.zza(zza);
            zzfjjVar.zze(false);
            zzfjwVar.zzb(zzfjjVar.zzj());
            return;
        }
        zzfjuVar.zzc(zza);
        zzfjj zzfjjVar2 = this.zzc;
        zzfjjVar2.zze(false);
        zzfjuVar.zza(zzfjjVar2);
        zzfjuVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeos zzeosVar;
        zzcom zzcomVar;
        zzfjw zzfjwVar;
        zzfju zzfjuVar;
        zzcze zzczeVar = (zzcze) obj;
        synchronized (this.zze) {
            zzdhe zzn = zzczeVar.zzn();
            zzeosVar = this.zze.zzd;
            zzn.zza(zzeosVar.zzd());
            this.zza.zzb(zzczeVar);
            zzcomVar = this.zze.zzb;
            zzcomVar.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeoz
                @Override // java.lang.Runnable
                public final void run() {
                    zzeos zzeosVar2;
                    zzeosVar2 = zzepb.this.zze.zzd;
                    zzeosVar2.zzb().zzn();
                }
            });
            if (!((Boolean) zzbkl.zzc.zze()).booleanValue() || (zzfjuVar = this.zzb) == null) {
                zzfjwVar = this.zze.zze;
                zzfjj zzfjjVar = this.zzc;
                zzfjjVar.zzb(zzczeVar.zzp().zzb);
                zzfjjVar.zzc(zzczeVar.zzl().zzg());
                zzfjjVar.zze(true);
                zzfjwVar.zzb(zzfjjVar.zzj());
            } else {
                zzfjuVar.zzf(zzczeVar.zzp().zzb);
                zzfjuVar.zze(zzczeVar.zzl().zzg());
                zzfjj zzfjjVar2 = this.zzc;
                zzfjjVar2.zze(true);
                zzfjuVar.zza(zzfjjVar2);
                zzfjuVar.zzg();
            }
        }
    }
}
