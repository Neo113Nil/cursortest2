package io.bidmachine.ads.networks.gam;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.utils.BMError;

/* loaded from: classes13.dex */
abstract class GAMBaseAdListener<GAMAdType extends InternalGAMAd, UnifiedAdCallbackType extends UnifiedAdCallback> implements InternalGAMAdLoadListener<GAMAdType>, InternalGAMAdPresentListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    GAMBaseAdListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    @NonNull
    UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdLoadListener
    public void onAdLoadFailed(@NonNull BMError bMError) {
        this.callback.onAdLoadFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdShown() {
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdShowFailed(@NonNull BMError bMError) {
        this.callback.onAdShowFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdExpired() {
        this.callback.onAdExpired();
    }
}
