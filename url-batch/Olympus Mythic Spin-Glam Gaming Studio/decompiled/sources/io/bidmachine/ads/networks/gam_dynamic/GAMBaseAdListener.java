package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.utils.BMError;

/* loaded from: classes13.dex */
abstract class GAMBaseAdListener<InternalAdType extends InternalAd, UnifiedAdCallbackType extends UnifiedAdCallback> implements InternalAdLoadListener<InternalAdType>, InternalAdPresentListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    GAMBaseAdListener(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    @NonNull
    UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadListener
    public void onAdLoadFailed(@NonNull BMError bMError) {
        this.callback.onAdLoadFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdShown() {
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdShowFailed(@NonNull BMError bMError) {
        this.callback.onAdShowFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdExpired() {
        this.callback.onAdExpired();
    }
}
