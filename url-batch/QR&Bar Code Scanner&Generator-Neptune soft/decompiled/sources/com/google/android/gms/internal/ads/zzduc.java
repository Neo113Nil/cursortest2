package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzduc extends zzcze {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdmp zze;
    private final zzdjw zzf;
    private final zzddn zzg;
    private final zzdeu zzh;
    private final zzczy zzi;
    private final zzcci zzj;
    private final zzfni zzk;
    private final zzfdy zzl;
    private boolean zzm;

    zzduc(zzczd zzczdVar, Context context, zzcmp zzcmpVar, zzdmp zzdmpVar, zzdjw zzdjwVar, zzddn zzddnVar, zzdeu zzdeuVar, zzczy zzczyVar, zzfdk zzfdkVar, zzfni zzfniVar, zzfdy zzfdyVar) {
        super(zzczdVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdmpVar;
        this.zzd = new WeakReference(zzcmpVar);
        this.zzf = zzdjwVar;
        this.zzg = zzddnVar;
        this.zzh = zzdeuVar;
        this.zzi = zzczyVar;
        this.zzk = zzfniVar;
        zzcce zzcceVar = zzfdkVar.zzm;
        this.zzj = new zzcdc(zzcceVar != null ? zzcceVar.zza : "", zzcceVar != null ? zzcceVar.zzb : 1);
        this.zzl = zzfdyVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcmp zzcmpVar = (zzcmp) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfO)).booleanValue()) {
                if (!this.zzm && zzcmpVar != null) {
                    zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdub
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcmp.this.destroy();
                        }
                    });
                }
            } else if (zzcmpVar != null) {
                zzcmpVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzcci zzc() {
        return this.zzj;
    }

    public final zzfdy zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcmp zzcmpVar = (zzcmp) this.zzd.get();
        return (zzcmpVar == null || zzcmpVar.zzaD()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaz)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            com.google.android.gms.ads.internal.util.zze.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzffe.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdmo e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}
