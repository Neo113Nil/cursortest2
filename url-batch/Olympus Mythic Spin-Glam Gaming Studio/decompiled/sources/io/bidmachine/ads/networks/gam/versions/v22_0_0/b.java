package io.bidmachine.ads.networks.gam.versions.v22_0_0;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.utils.BMError;

/* loaded from: classes11.dex */
class b extends FullScreenContentCallback {
    private final InternalGAMFullscreenAdPresentListener a;

    b(InternalGAMFullscreenAdPresentListener internalGAMFullscreenAdPresentListener) {
        this.a = internalGAMFullscreenAdPresentListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.a.onAdClicked();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.a.onAdComplete();
        this.a.onAdClosed();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        this.a.onAdShowFailed(new BMError(BMError.InternalUnknownError, adError.getCode(), adError.getMessage()));
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.a.onAdShown();
    }
}
