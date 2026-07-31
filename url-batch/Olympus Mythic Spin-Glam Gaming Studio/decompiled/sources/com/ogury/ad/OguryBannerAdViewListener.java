package com.ogury.ad;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/ogury/ad/OguryBannerAdViewListener;", "Lcom/ogury/ad/OguryAdListener;", "Lcom/ogury/ad/OguryBannerAdView;", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OguryBannerAdViewListener extends OguryAdListener<OguryBannerAdView> {
    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdClicked(@NotNull OguryBannerAdView oguryBannerAdView);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdClosed(@NotNull OguryBannerAdView oguryBannerAdView);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdError(@NotNull OguryBannerAdView oguryBannerAdView, @NotNull OguryAdError oguryAdError);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdImpression(@NotNull OguryBannerAdView oguryBannerAdView);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdLoaded(@NotNull OguryBannerAdView oguryBannerAdView);
}
