package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzbwh implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbwj zza;

    zzbwh(zzbwj zzbwjVar) {
        this.zza = zzbwjVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        MediationInterstitialListener mediationInterstitialListener;
        zzcfi.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbwj zzbwjVar = this.zza;
        mediationInterstitialListener = zzbwjVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbwjVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzcfi.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        zzcfi.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbwj zzbwjVar = this.zza;
        mediationInterstitialListener = zzbwjVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbwjVar);
    }
}
