package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* loaded from: classes.dex */
class GAMBanner extends UnifiedBannerAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private InternalGAMBannerAd gamBannerAd;

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    private InternalGAMBannerAdListener listener;

    protected GAMBanner(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedBannerAdCallback unifiedBannerAdCallback, @NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new GAMParams(unifiedMediationParams).isValid(unifiedBannerAdCallback)) {
            if (!this.gamNetwork.isOverrideCallbacks()) {
                unifiedBannerAdCallback.setVisibilitySource(VisibilitySource.BidMachine);
            }
            Listener listener = new Listener(unifiedBannerAdCallback);
            this.listener = listener;
            this.gamNetwork.loadBanner(networkAdUnit, listener);
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalGAMBannerAd internalGAMBannerAd = this.gamBannerAd;
        if (internalGAMBannerAd != null) {
            internalGAMBannerAd.onAdShown();
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        InternalGAMBannerAd internalGAMBannerAd = this.gamBannerAd;
        if (internalGAMBannerAd != null) {
            internalGAMBannerAd.destroy();
            this.gamBannerAd = null;
        }
    }

    private static final class Listener extends GAMBaseAdListener<InternalGAMBannerAd, UnifiedBannerAdCallback> implements InternalGAMBannerAdListener {

        @NonNull
        private final GAMBanner gamBanner;

        private Listener(@NonNull GAMBanner gAMBanner, @NonNull UnifiedBannerAdCallback unifiedBannerAdCallback) {
            super(unifiedBannerAdCallback);
            this.gamBanner = gAMBanner;
        }

        @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
        public void onAdLoaded(@NonNull InternalGAMBannerAd internalGAMBannerAd) {
            this.gamBanner.gamBannerAd = internalGAMBannerAd;
            getCallback().onAdLoaded(internalGAMBannerAd.getAdView());
        }
    }
}
