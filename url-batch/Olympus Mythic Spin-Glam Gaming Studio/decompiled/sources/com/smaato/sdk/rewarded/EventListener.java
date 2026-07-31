package com.smaato.sdk.rewarded;

/* loaded from: classes4.dex */
public interface EventListener {
    void onAdClicked(RewardedInterstitialAd rewardedInterstitialAd);

    void onAdClosed(RewardedInterstitialAd rewardedInterstitialAd);

    void onAdError(RewardedInterstitialAd rewardedInterstitialAd, RewardedError rewardedError);

    void onAdFailedToLoad(RewardedRequestError rewardedRequestError);

    void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd);

    void onAdReward(RewardedInterstitialAd rewardedInterstitialAd);

    void onAdStarted(RewardedInterstitialAd rewardedInterstitialAd);

    void onAdTTLExpired(RewardedInterstitialAd rewardedInterstitialAd);

    default void onCompanionAdClicked(RewardedInterstitialAd rewardedInterstitialAd) {
    }

    default void onCompanionAdImpressed(RewardedInterstitialAd rewardedInterstitialAd) {
    }
}
