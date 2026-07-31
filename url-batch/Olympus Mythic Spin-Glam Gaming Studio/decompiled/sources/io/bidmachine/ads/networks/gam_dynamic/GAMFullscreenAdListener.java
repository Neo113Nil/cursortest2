package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;

/* loaded from: classes6.dex */
class GAMFullscreenAdListener<InternalAdType extends InternalFullscreenAd> extends GAMBaseAdListener<InternalAdType, UnifiedFullscreenAdCallback> implements InternalAdLoadListener<InternalAdType>, InternalFullscreenAdPresentListener {

    @NonNull
    private final GAMFullscreenAd gamFullscreenAd;

    GAMFullscreenAdListener(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull GAMFullscreenAd gAMFullscreenAd) {
        super(unifiedFullscreenAdCallback);
        this.gamFullscreenAd = gAMFullscreenAd;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    public void onAdLoaded(@NonNull InternalAdType internaladtype) {
        this.gamFullscreenAd.internalFullscreenAd = internaladtype;
        getCallback().onAdLoaded();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    public void onAdComplete() {
        getCallback().onAdFinished();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    public void onAdClosed() {
        getCallback().onAdClosed();
    }
}
