package com.ogury.ad;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/ogury/ad/OguryThumbnailAdListener;", "Lcom/ogury/ad/OguryAdListener;", "Lcom/ogury/ad/OguryThumbnailAd;", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface OguryThumbnailAdListener extends OguryAdListener<OguryThumbnailAd> {
    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdClicked(@NotNull OguryThumbnailAd oguryThumbnailAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdClosed(@NotNull OguryThumbnailAd oguryThumbnailAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdError(@NotNull OguryThumbnailAd oguryThumbnailAd, @NotNull OguryAdError oguryAdError);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdImpression(@NotNull OguryThumbnailAd oguryThumbnailAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdLoaded(@NotNull OguryThumbnailAd oguryThumbnailAd);
}
