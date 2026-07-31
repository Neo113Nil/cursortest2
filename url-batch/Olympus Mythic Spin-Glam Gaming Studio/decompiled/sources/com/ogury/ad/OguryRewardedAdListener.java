package com.ogury.ad;

import com.ironsource.Zf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ogury/ad/OguryRewardedAdListener;", "Lcom/ogury/ad/OguryAdListener;", "Lcom/ogury/ad/OguryRewardedAd;", Zf.i, "", "ad", "reward", "Lcom/ogury/ad/OguryReward;", "sdk-ads_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OguryRewardedAdListener extends OguryAdListener<OguryRewardedAd> {
    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdClicked(@NotNull OguryRewardedAd oguryRewardedAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdClosed(@NotNull OguryRewardedAd oguryRewardedAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdError(@NotNull OguryRewardedAd oguryRewardedAd, @NotNull OguryAdError oguryAdError);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdImpression(@NotNull OguryRewardedAd oguryRewardedAd);

    @Override // com.ogury.ad.OguryAdListener
    /* synthetic */ void onAdLoaded(@NotNull OguryRewardedAd oguryRewardedAd);

    void onAdRewarded(@NotNull OguryRewardedAd ad, @NotNull OguryReward reward);
}
