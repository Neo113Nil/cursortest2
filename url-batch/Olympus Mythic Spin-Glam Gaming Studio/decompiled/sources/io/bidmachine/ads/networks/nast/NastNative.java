package io.bidmachine.ads.networks.nast;

import io.bidmachine.ContextProvider;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.nativead.NativeNetworkAdapter;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedNativeAdCallback;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lio/bidmachine/ads/networks/nast/NastNative;", "Lio/bidmachine/unified/UnifiedNativeAd;", "()V", "load", "", "contextProvider", "Lio/bidmachine/ContextProvider;", "callback", "Lio/bidmachine/unified/UnifiedNativeAdCallback;", "adRequestParams", "Lio/bidmachine/unified/UnifiedNativeAdRequestParams;", "unifiedMediationParams", "Lio/bidmachine/unified/UnifiedMediationParams;", "networkAdUnit", "Lio/bidmachine/NetworkAdUnit;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class NastNative extends UnifiedNativeAd {
    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NotNull ContextProvider contextProvider, @NotNull UnifiedNativeAdCallback callback, @NotNull UnifiedNativeAdRequestParams adRequestParams, @NotNull UnifiedMediationParams unifiedMediationParams, @NotNull NetworkAdUnit networkAdUnit) throws Throwable {
        String videoUrl;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(adRequestParams, "adRequestParams");
        Intrinsics.checkNotNullParameter(unifiedMediationParams, "unifiedMediationParams");
        Intrinsics.checkNotNullParameter(networkAdUnit, "networkAdUnit");
        NastParams nastParams = new NastParams(unifiedMediationParams);
        if (nastParams.isValid(adRequestParams, callback)) {
            callback.setVisibilitySource(VisibilitySource.BidMachine);
            NativeNetworkAdapter videoAdm = new NativeNetworkAdapter().setTitle(nastParams.getTitle()).setDescription(nastParams.getDescription()).setCallToAction(nastParams.getCallToAction()).setIcon(new ImageDataImpl(nastParams.getIconUrl())).setMainImage(new ImageDataImpl(nastParams.getImageUrl())).setVideoUrl(nastParams.getVideoUrl()).setVideoAdm(nastParams.getVideoAdm());
            String videoAdm2 = nastParams.getVideoAdm();
            callback.onAdLoaded(videoAdm.setHasVideo(((videoAdm2 == null || videoAdm2.length() == 0) && ((videoUrl = nastParams.getVideoUrl()) == null || videoUrl.length() == 0)) ? false : true).setRating(nastParams.getRating()).setClickUrl(nastParams.getClickUrl()).setNetworkControlLoadingAssets(false).setAdLabelData(nastParams.getAdLabelData()).setPrivacySheetData(nastParams.getPrivacySheetData()).setDisclaimerData(nastParams.getDisclaimerData()));
        }
    }
}
