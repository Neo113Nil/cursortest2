package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.Map;

/* loaded from: classes3.dex */
class GAMBannerAd extends UnifiedBannerAd {

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    @VisibleForTesting
    InternalBannerAd internalBannerAd;

    @Nullable
    @VisibleForTesting
    InternalBannerAdListener listener;

    protected GAMBannerAd(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedBannerAdCallback unifiedBannerAdCallback, @NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        Listener listener = new Listener(unifiedBannerAdCallback, this);
        this.listener = listener;
        this.gamNetwork.loadBanner(networkAdUnit, listener);
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            internalBannerAd.onAdShown();
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            internalBannerAd.destroy();
            this.internalBannerAd = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    @Nullable
    public Map<String, Object> getCustomParams() {
        InternalBannerAd internalBannerAd = this.internalBannerAd;
        if (internalBannerAd != null) {
            return internalBannerAd.getCustomParamsMap();
        }
        return null;
    }

    @VisibleForTesting
    static final class Listener extends GAMBaseAdListener<InternalBannerAd, UnifiedBannerAdCallback> implements InternalBannerAdListener {

        @NonNull
        private final GAMBannerAd gamBannerAd;

        Listener(@NonNull UnifiedBannerAdCallback unifiedBannerAdCallback, @NonNull GAMBannerAd gAMBannerAd) {
            super(unifiedBannerAdCallback);
            this.gamBannerAd = gAMBannerAd;
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
        public void onAdLoaded(@NonNull InternalBannerAd internalBannerAd) {
            this.gamBannerAd.internalBannerAd = internalBannerAd;
            if (internalBannerAd.getAdUnit().getOverrideCallbacks()) {
                getCallback().setVisibilitySource(VisibilitySource.BidMachine);
            }
            getCallback().onAdLoaded(internalBannerAd.getAdView());
        }
    }
}
