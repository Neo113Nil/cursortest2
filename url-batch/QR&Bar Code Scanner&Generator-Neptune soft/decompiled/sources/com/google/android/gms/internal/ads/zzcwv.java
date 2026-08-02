package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcwv extends zzcze {
    private final zzcmp zzc;
    private final int zzd;
    private final Context zze;
    private final zzcwd zzf;
    private final zzdmp zzg;
    private final zzdjw zzh;
    private final zzddn zzi;
    private final boolean zzj;
    private boolean zzk;

    zzcwv(zzczd zzczdVar, Context context, zzcmp zzcmpVar, int i, zzcwd zzcwdVar, zzdmp zzdmpVar, zzdjw zzdjwVar, zzddn zzddnVar) {
        super(zzczdVar);
        this.zzk = false;
        this.zzc = zzcmpVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcwdVar;
        this.zzg = zzdmpVar;
        this.zzh = zzdjwVar;
        this.zzi = zzddnVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzet)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzcze
    public final void zzV() {
        super.zzV();
        zzcmp zzcmpVar = this.zzc;
        if (zzcmpVar != null) {
            zzcmpVar.destroy();
        }
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzc(zzbdd zzbddVar) {
        zzcmp zzcmpVar = this.zzc;
        if (zzcmpVar != null) {
            zzcmpVar.zzaj(zzbddVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    public final void zzd(Activity activity, zzbdq zzbdqVar, boolean z) throws RemoteException {
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(activity2)) {
                com.google.android.gms.ads.internal.util.zze.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzaz)).booleanValue()) {
                    new zzfni(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (this.zzk) {
            com.google.android.gms.ads.internal.util.zze.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzffe.zzd(10, null, null));
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
        } catch (zzdmo e) {
            this.zzi.zzc(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
