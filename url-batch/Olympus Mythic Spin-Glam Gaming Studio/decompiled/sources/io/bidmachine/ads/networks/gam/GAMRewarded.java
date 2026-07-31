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

/* loaded from: classes8.dex */
class GAMRewarded extends UnifiedFullscreenAd {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @NonNull
    private final GAMNetwork gamNetwork;

    @Nullable
    private InternalGAMRewardedAd gamRewardedAd;

    @Nullable
    private Listener listener;

    protected GAMRewarded(@NonNull GAMNetwork gAMNetwork) {
        this.gamNetwork = gAMNetwork;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        if (new GAMParams(unifiedMediationParams).isValid(unifiedFullscreenAdCallback)) {
            Listener listener = new Listener(unifiedFullscreenAdCallback, this);
            this.listener = listener;
            this.gamNetwork.loadRewarded(networkAdUnit, listener);
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @Nullable RendererConfiguration rendererConfiguration) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM rewarded object is null"));
            return;
        }
        if (internalGAMRewardedAd.isExpired()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM rewarded object is expired"));
            return;
        }
        if (!this.gamRewardedAd.isLoaded()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM rewarded object not loaded"));
            return;
        }
        Listener listener = this.listener;
        if (listener == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("InternalGAM rewarded listener is null"));
        } else {
            this.gamRewardedAd.show(activity, listener);
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd != null) {
            internalGAMRewardedAd.onAdShown();
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.listener = null;
        InternalGAMRewardedAd internalGAMRewardedAd = this.gamRewardedAd;
        if (internalGAMRewardedAd != null) {
            internalGAMRewardedAd.destroy();
            this.gamRewardedAd = null;
        }
    }

    private static final class Listener extends GAMFullscreenAdListener<InternalGAMRewardedAd> implements InternalGAMRewardedAdListener {

        @NonNull
        private final GAMRewarded gamRewarded;

        private Listener(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull GAMRewarded gAMRewarded) {
            super(unifiedFullscreenAdCallback);
            this.gamRewarded = gAMRewarded;
        }

        @Override // io.bidmachine.ads.networks.gam.GAMFullscreenAdListener
        public void onAdLoaded(@NonNull InternalGAMRewardedAd internalGAMRewardedAd) {
            this.gamRewarded.gamRewardedAd = internalGAMRewardedAd;
            super.onAdLoaded((Listener) internalGAMRewardedAd);
        }
    }
}
