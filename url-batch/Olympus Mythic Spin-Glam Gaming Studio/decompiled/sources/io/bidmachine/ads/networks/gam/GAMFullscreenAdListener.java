package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;

/* loaded from: classes4.dex */
class GAMFullscreenAdListener<GAMAdType extends InternalGAMFullscreenAd> extends GAMBaseAdListener<GAMAdType, UnifiedFullscreenAdCallback> implements InternalGAMAdLoadListener<GAMAdType>, InternalGAMFullscreenAdPresentListener {
    GAMFullscreenAdListener(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        super(unifiedFullscreenAdCallback);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
    public void onAdLoaded(@NonNull GAMAdType gamadtype) {
        getCallback().onAdLoaded();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    public void onAdComplete() {
        getCallback().onAdFinished();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    public void onAdClosed() {
        getCallback().onAdClosed();
    }
}
