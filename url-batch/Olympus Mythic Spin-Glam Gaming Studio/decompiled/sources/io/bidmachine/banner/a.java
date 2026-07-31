package io.bidmachine.banner;

import android.content.Context;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.BannerAdSize;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedBannerAd;

/* loaded from: classes12.dex */
final class a extends ViewAd {
    a(Context context) {
        super(context, AdsType.Banner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BannerAdSize a() {
        ViewAdObject viewAdObject = (ViewAdObject) getLoadedAdObject();
        if (viewAdObject == null) {
            return null;
        }
        int width = viewAdObject.getWidth();
        int height = viewAdObject.getHeight();
        return ((BannerRequest) viewAdObject.getAdRequest()).getBannerAdSize().getIsAdaptive() ? BannerAdSize.adaptive(width, height) : BannerAdSize.firstFixedOrNull(width, height);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    public ViewAdObject createAdObject(ContextProvider contextProvider, BannerRequest bannerRequest, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback) {
        UnifiedBannerAd createBanner = networkAdapter.createBanner();
        if (createBanner == null) {
            return null;
        }
        ViewAdObject viewAdObject = new ViewAdObject(contextProvider, adProcessCallback, bannerRequest, adObjectParams, createBanner);
        BannerAdSize bannerAdSize = bannerRequest.getBannerAdSize();
        if (bannerAdSize.getIsAdaptive()) {
            viewAdObject.setWidthMeasureMode(ViewAdObject.MeasureMode.Match);
            viewAdObject.setWidth(adObjectParams.getWidth());
            viewAdObject.setHeight(adObjectParams.getHeight());
        } else {
            viewAdObject.setWidth(bannerAdSize.getWidth());
            viewAdObject.setHeight(bannerAdSize.getHeight());
        }
        return viewAdObject;
    }
}
