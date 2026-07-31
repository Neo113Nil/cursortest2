package com.unity3d.ads;

import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BannerAd.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/BannerShowListenerWithOnFailedToShow;", "", "onBannerFailedToShow", "", "bannerAdView", "Lcom/unity3d/services/banners/BannerView;", "errorInfo", "Lcom/unity3d/services/banners/BannerErrorInfo;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BannerShowListenerWithOnFailedToShow {
    void onBannerFailedToShow(@NotNull BannerView bannerAdView, @NotNull BannerErrorInfo errorInfo);
}
