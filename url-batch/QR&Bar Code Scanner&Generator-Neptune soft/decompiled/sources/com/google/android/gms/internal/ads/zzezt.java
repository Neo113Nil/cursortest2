package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzezt implements zzfzc {
    final /* synthetic */ zzeou zza;
    final /* synthetic */ zzfju zzb;
    final /* synthetic */ zzfjj zzc;
    final /* synthetic */ zzcxz zzd;
    final /* synthetic */ zzezu zze;

    zzezt(zzezu zzezuVar, zzeou zzeouVar, zzfju zzfjuVar, zzfjj zzfjjVar, zzcxz zzcxzVar) {
        this.zze = zzezuVar;
        this.zza = zzeouVar;
        this.zzb = zzfjuVar;
        this.zzc = zzfjjVar;
        this.zzd = zzcxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final void zza(Throwable th) {
        zzdfp zzdfpVar;
        zzdhv zzdhvVar;
        zzfjw zzfjwVar;
        zzfju zzfjuVar;
        Executor executor;
        final com.google.android.gms.ads.internal.client.zze zza = this.zzd.zzd().zza(th);
        synchronized (this.zze) {
            this.zze.zzl = null;
            this.zzd.zzf().zza(zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgY)).booleanValue()) {
                executor = this.zze.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezs
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeof zzeofVar;
                        zzezt zzeztVar = zzezt.this;
                        com.google.android.gms.ads.internal.client.zze zzeVar = zza;
                        zzeofVar = zzeztVar.zze.zzd;
                        zzeofVar.zza(zzeVar);
                    }
                });
            }
            zzezu zzezuVar = this.zze;
            zzdfpVar = zzezuVar.zzh;
            zzdhvVar = zzezuVar.zzj;
            zzdfpVar.zzd(zzdhvVar.zzc());
            zzfez.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            this.zza.zza();
            if (!((Boolean) zzbkl.zzc.zze()).booleanValue() || (zzfjuVar = this.zzb) == null) {
                zzfjwVar = this.zze.zzi;
                zzfjj zzfjjVar = this.zzc;
                zzfjjVar.zza(zza);
                zzfjjVar.zze(false);
                zzfjwVar.zzb(zzfjjVar.zzj());
            } else {
                zzfjuVar.zzc(zza);
                zzfjj zzfjjVar2 = this.zzc;
                zzfjjVar2.zze(false);
                zzfjuVar.zza(zzfjjVar2);
                zzfjuVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        zzdfp zzdfpVar;
        zzfjw zzfjwVar;
        zzfju zzfjuVar;
        Executor executor;
        final zzeof zzeofVar;
        zzeof zzeofVar2;
        zzeoj zzeojVar;
        zzcxc zzcxcVar = (zzcxc) obj;
        synchronized (this.zze) {
            this.zze.zzl = null;
            viewGroup = this.zze.zzf;
            viewGroup.removeAllViews();
            if (zzcxcVar.zzc() != null) {
                ViewParent parent = zzcxcVar.zzc().getParent();
                if (parent instanceof ViewGroup) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Banner view provided from " + (zzcxcVar.zzl() != null ? zzcxcVar.zzl().zzg() : "") + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(zzcxcVar.zzc());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgY)).booleanValue()) {
                zzdhe zzn = zzcxcVar.zzn();
                zzeofVar2 = this.zze.zzd;
                zzn.zza(zzeofVar2);
                zzeojVar = this.zze.zze;
                zzn.zzc(zzeojVar);
            }
            viewGroup2 = this.zze.zzf;
            viewGroup2.addView(zzcxcVar.zzc());
            this.zza.zzb(zzcxcVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzgY)).booleanValue()) {
                zzezu zzezuVar = this.zze;
                executor = zzezuVar.zzb;
                zzeofVar = zzezuVar.zzd;
                zzeofVar.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzeof.this.zzn();
                    }
                });
            }
            zzdfpVar = this.zze.zzh;
            zzdfpVar.zzd(zzcxcVar.zza());
            if (!((Boolean) zzbkl.zzc.zze()).booleanValue() || (zzfjuVar = this.zzb) == null) {
                zzfjwVar = this.zze.zzi;
                zzfjj zzfjjVar = this.zzc;
                zzfjjVar.zzb(zzcxcVar.zzp().zzb);
                zzfjjVar.zzc(zzcxcVar.zzl().zzg());
                zzfjjVar.zze(true);
                zzfjwVar.zzb(zzfjjVar.zzj());
            } else {
                zzfjuVar.zzf(zzcxcVar.zzp().zzb);
                zzfjuVar.zze(zzcxcVar.zzl().zzg());
                zzfjj zzfjjVar2 = this.zzc;
                zzfjjVar2.zze(true);
                zzfjuVar.zza(zzfjjVar2);
                zzfjuVar.zzg();
            }
        }
    }
}
