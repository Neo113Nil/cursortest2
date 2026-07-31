package com.monetization.ads.mediation.nativeads;

import com.ironsource.Zf;
import com.monetization.ads.mediation.base.MediatedAdRequestError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/monetization/ads/mediation/nativeads/MediatedNativeAdapterListener;", "", "", Zf.f, "()V", Zf.g, "onAdImpression", Zf.c, "Lcom/monetization/ads/mediation/nativeads/MediatedNativeAd;", "mediatedNativeAd", "onAppInstallAdLoaded", "(Lcom/monetization/ads/mediation/nativeads/MediatedNativeAd;)V", "onContentAdLoaded", "Lcom/monetization/ads/mediation/base/MediatedAdRequestError;", "error", "onAdFailedToLoad", "(Lcom/monetization/ads/mediation/base/MediatedAdRequestError;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MediatedNativeAdapterListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(@NotNull MediatedAdRequestError error);

    void onAdImpression();

    void onAdOpened();

    void onAppInstallAdLoaded(@NotNull MediatedNativeAd mediatedNativeAd);

    void onContentAdLoaded(@NotNull MediatedNativeAd mediatedNativeAd);
}
