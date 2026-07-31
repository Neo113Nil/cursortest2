package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* loaded from: classes13.dex */
class GAMInterstitialAd extends GAMFullscreenAd {

    @Nullable
    @VisibleForTesting
    InternalInterstitialAdListener listener;

    protected GAMInterstitialAd(@NonNull GAMNetwork gAMNetwork) {
        super(gAMNetwork);
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        Listener listener = new Listener(unifiedFullscreenAdCallback, this);
        this.listener = listener;
        this.gamNetwork.loadInterstitial(networkAdUnit, listener);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMFullscreenAd, io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        super.onDestroy();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMFullscreenAd
    @Nullable
    protected InternalFullscreenAdPresentListener getPresentListener() {
        return this.listener;
    }

    @VisibleForTesting
    static final class Listener extends GAMFullscreenAdListener<InternalInterstitialAd> implements InternalInterstitialAdListener {
        Listener(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull GAMFullscreenAd gAMFullscreenAd) {
            super(unifiedFullscreenAdCallback, gAMFullscreenAd);
        }
    }
}
