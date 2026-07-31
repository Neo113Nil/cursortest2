package io.bidmachine.ads.networks.gam;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.RendererConfiguration;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

/* loaded from: classes13.dex */
class GAMInterstitial extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private InternalGAMInterstitialAd gamInterstitialAd;

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    private Listener listener;

    protected GAMInterstitial(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new GAMParams(unifiedMediationParams).isValid(unifiedFullscreenAdCallback)) {
            Listener listener = new Listener(unifiedFullscreenAdCallback, this);
            this.listener = listener;
            this.gamNetwork.loadInterstitial(networkAdUnit, listener);
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM interstitial object is null"));
            return;
        }
        if (internalGAMInterstitialAd.isExpired()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM interstitial object is expired"));
            return;
        }
        if (!this.gamInterstitialAd.isLoaded()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM interstitial object not loaded"));
            return;
        }
        Listener listener = this.listener;
        if (listener == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM interstitial listener is null"));
        } else {
            this.gamInterstitialAd.show(activity, listener);
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd != null) {
            internalGAMInterstitialAd.onAdShown();
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        InternalGAMInterstitialAd internalGAMInterstitialAd = this.gamInterstitialAd;
        if (internalGAMInterstitialAd != null) {
            internalGAMInterstitialAd.destroy();
            this.gamInterstitialAd = null;
        }
    }

    private static final class Listener extends GAMFullscreenAdListener<InternalGAMInterstitialAd> implements InternalGAMInterstitialAdListener {

        @NonNull
        private final GAMInterstitial gamInterstitial;

        private Listener(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull GAMInterstitial gAMInterstitial) {
            super(unifiedFullscreenAdCallback);
            this.gamInterstitial = gAMInterstitial;
        }

        @Override // io.bidmachine.ads.networks.gam.GAMFullscreenAdListener
        public void onAdLoaded(@NonNull InternalGAMInterstitialAd internalGAMInterstitialAd) {
            this.gamInterstitial.gamInterstitialAd = internalGAMInterstitialAd;
            super.onAdLoaded((Listener) internalGAMInterstitialAd);
        }
    }
}
