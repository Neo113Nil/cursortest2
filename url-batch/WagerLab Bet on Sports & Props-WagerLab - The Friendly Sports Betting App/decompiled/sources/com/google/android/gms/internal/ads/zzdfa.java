package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzdfa extends zzcqs {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzddd zze;
    private final zzdgp zzf;
    private final zzcrn zzg;
    private final zzfor zzh;
    private final zzcwf zzi;
    private final zzbyz zzj;
    private final zzdsm zzk;
    private boolean zzl;

    zzdfa(zzcqr zzcqrVar, Context context, @Nullable zzcek zzcekVar, zzddd zzdddVar, zzdgp zzdgpVar, zzcrn zzcrnVar, zzfor zzforVar, zzcwf zzcwfVar, zzbyz zzbyzVar, zzdsm zzdsmVar) {
        super(zzcqrVar);
        this.zzl = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcekVar);
        this.zze = zzdddVar;
        this.zzf = zzdgpVar;
        this.zzg = zzcrnVar;
        this.zzh = zzforVar;
        this.zzi = zzcwfVar;
        this.zzj = zzbyzVar;
        this.zzk = zzdsmVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcek zzcekVar = (zzcek) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhe)).booleanValue()) {
                if (!this.zzl && zzcekVar != null) {
                    zzgpd zzgpdVar = zzbzh.zzf;
                    Objects.requireNonNull(zzcekVar);
                    zzgpdVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdez
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzcek.this.destroy();
                        }
                    });
                }
            } else if (zzcekVar != null) {
                zzcekVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.content.Context] */
    public final boolean zza(boolean z, @Nullable Activity activity) {
        zzfcj zzC;
        zzddd zzdddVar = this.zze;
        zzdddVar.zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        zzdgp zzdgpVar = this.zzf;
        if (!com.google.android.gms.ads.internal.util.zzs.zzS(zzdgpVar.zzb())) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzom)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzR(this.zzc, this.zzb, this.zzk);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaR)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zzc)) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzaS)).booleanValue()) {
                        this.zzh.zza(this.zza.zzb.zzb.zzb);
                    }
                    return false;
                }
            }
        }
        zzcek zzcekVar = (zzcek) this.zzd.get();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmI)).booleanValue() || zzcekVar == null || (zzC = zzcekVar.zzC()) == null || !zzC.zzar || zzC.zzas == this.zzj.zzj()) {
            if (this.zzl) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial ad has been shown.");
                this.zzi.zzc(zzfee.zzd(10, null, null));
            }
            Activity activity2 = activity;
            if (!this.zzl) {
                if (activity == null) {
                    activity2 = this.zzc;
                }
                try {
                    zzdgpVar.zza(z, activity2, this.zzi);
                    zzdddVar.zzb();
                    this.zzl = true;
                    return true;
                } catch (zzdgo e) {
                    this.zzi.zzd(e);
                }
            }
        } else {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The interstitial consent form has been shown.");
            this.zzi.zzc(zzfee.zzd(12, "The consent form has already been shown.", null));
        }
        return false;
    }

    public final boolean zzb() {
        return this.zzg.zzl();
    }
}
