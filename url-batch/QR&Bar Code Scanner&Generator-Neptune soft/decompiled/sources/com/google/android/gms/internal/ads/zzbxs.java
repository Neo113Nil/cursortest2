package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzbxs implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbxu zza;

    zzbxs(zzbxu zzbxuVar) {
        this.zza = zzbxuVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        MediationInterstitialListener mediationInterstitialListener;
        zzcgp.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbxu zzbxuVar = this.zza;
        mediationInterstitialListener = zzbxuVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbxuVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzcgp.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        zzcgp.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        zzcgp.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        zzcgp.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbxu zzbxuVar = this.zza;
        mediationInterstitialListener = zzbxuVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbxuVar);
    }
}
