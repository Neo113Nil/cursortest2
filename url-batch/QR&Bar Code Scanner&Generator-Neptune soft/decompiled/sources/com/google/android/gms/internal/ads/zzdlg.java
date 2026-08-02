package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzdlg extends zzcze {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdjw zze;
    private final zzdmp zzf;
    private final zzczy zzg;
    private final zzfni zzh;
    private final zzddn zzi;
    private boolean zzj;

    zzdlg(zzczd zzczdVar, Context context, @Nullable zzcmp zzcmpVar, zzdjw zzdjwVar, zzdmp zzdmpVar, zzczy zzczyVar, zzfni zzfniVar, zzddn zzddnVar) {
        super(zzczdVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcmpVar);
        this.zze = zzdjwVar;
        this.zzf = zzdmpVar;
        this.zzg = zzczyVar;
        this.zzh = zzfniVar;
        this.zzi = zzddnVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcmp zzcmpVar = (zzcmp) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzfO)).booleanValue()) {
                if (!this.zzj && zzcmpVar != null) {
                    zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlf
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z, @Nullable Activity activity) {
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaz)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzj) {
            com.google.android.gms.ads.internal.util.zze.zzj("The interstitial ad has been showed.");
            this.zzi.zza(zzffe.zzd(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.zzj) {
            if (activity == null) {
                activity2 = this.zzc;
            }
            try {
                this.zzf.zza(z, activity2, this.zzi);
                this.zze.zza();
                this.zzj = true;
                return true;
            } catch (zzdmo e) {
                this.zzi.zzc(e);
            }
        }
        return false;
    }
}
