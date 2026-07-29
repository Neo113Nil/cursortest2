package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzcvn extends zzcxw {
    private final zzcli zzc;
    private final int zzd;
    private final Context zze;
    private final zzcuv zzf;
    private final zzdlf zzg;
    private final zzdio zzh;
    private final zzdcf zzi;
    private final boolean zzj;
    private boolean zzk;

    zzcvn(zzcxv zzcxvVar, Context context, zzcli zzcliVar, int i, zzcuv zzcuvVar, zzdlf zzdlfVar, zzdio zzdioVar, zzdcf zzdcfVar) {
        super(zzcxvVar);
        this.zzk = false;
        this.zzc = zzcliVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcuvVar;
        this.zzg = zzdlfVar;
        this.zzh = zzdioVar;
        this.zzi = zzdcfVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzem)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzV() {
        super.zzV();
        zzcli zzcliVar = this.zzc;
        if (zzcliVar != null) {
            zzcliVar.destroy();
        }
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzc(zzbbz zzbbzVar) {
        zzcli zzcliVar = this.zzc;
        if (zzcliVar != null) {
            zzcliVar.zzaj(zzbbzVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    public final void zzd(Activity activity, zzbcm zzbcmVar, boolean z) throws RemoteException {
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(activity2)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhy.zzaz)).booleanValue()) {
                    new zzfld(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (this.zzk) {
            com.google.android.gms.ads.internal.util.zze.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzfcx.zzd(10, null, null));
        }
        if (this.zzk) {
            return;
        }
        try {
            this.zzg.zza(z, activity2, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzk = true;
        } catch (zzdle e) {
            this.zzi.zze(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
