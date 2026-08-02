package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcde extends zzccr {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcdf zzb;

    public zzcde(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcdf zzcdfVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg() {
        zzcdf zzcdfVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzcdfVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcdfVar);
    }
}
