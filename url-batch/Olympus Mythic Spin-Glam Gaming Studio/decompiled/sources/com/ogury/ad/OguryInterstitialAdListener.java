package com.ogury.ad;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/ogury/ad/OguryInterstitialAdListener;", "Lcom/ogury/ad/OguryAdListener;", "Lcom/ogury/ad/OguryInterstitialAd;", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface OguryInterstitialAdListener extends OguryAdListener<OguryInterstitialAd> {
    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdClicked(@NotNull OguryInterstitialAd oguryInterstitialAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdClosed(@NotNull OguryInterstitialAd oguryInterstitialAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdError(@NotNull OguryInterstitialAd oguryInterstitialAd, @NotNull OguryAdError oguryAdError);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdImpression(@NotNull OguryInterstitialAd oguryInterstitialAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdLoaded(@NotNull OguryInterstitialAd oguryInterstitialAd);
}
