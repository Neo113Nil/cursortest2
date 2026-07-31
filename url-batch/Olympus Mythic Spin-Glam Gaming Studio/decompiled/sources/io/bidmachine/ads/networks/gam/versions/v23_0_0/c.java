package io.bidmachine.ads.networks.gam.versions.v23_0_0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam.GAMLoader;
import io.bidmachine.ads.networks.gam.GAMUnitData;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMBannerAd;
import io.bidmachine.ads.networks.gam.InternalLoadListener;
import io.bidmachine.utils.BMError;

/* loaded from: classes5.dex */
class c extends InternalGAMBannerAd {
    private final AdSize a;
    private AdManagerAdView b;

    private static final class b extends AdListener {
        private final InternalGAMAd a;
        private final InternalLoadListener b;

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            InternalGAMAdPresentListener adPresentListener = this.a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdClicked();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            this.b.onAdLoadFailed(this.a, new BMError(BMError.NoFill, loadAdError.getCode(), loadAdError.getMessage()));
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            InternalGAMAdPresentListener adPresentListener = this.a.getAdPresentListener();
            if (adPresentListener != null) {
                adPresentListener.onAdShown();
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.a.onAdLoaded();
            this.b.onAdLoaded(this.a);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
        }

        private b(@NonNull InternalGAMAd internalGAMAd, @NonNull InternalLoadListener internalLoadListener) {
            this.a = internalGAMAd;
            this.b = internalLoadListener;
        }
    }

    c(GAMLoader gAMLoader, AdsFormat adsFormat, GAMUnitData gAMUnitData, AdSize adSize) {
        super(gAMLoader, adsFormat, gAMUnitData);
        this.a = adSize;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    protected void destroyAd() {
        AdManagerAdView adManagerAdView = this.b;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.b = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMBannerAd
    protected View getAdView() {
        return this.b;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAd
    public void loadAd(Context context, InternalLoadListener internalLoadListener) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
        this.b = adManagerAdView;
        adManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.b.setAdUnitId(getAdUnitId());
        this.b.setAdListener(new b(this, internalLoadListener));
        this.b.setAdSize(this.a);
        this.b.loadAd(io.bidmachine.ads.networks.gam.versions.v23_0_0.a.a(getGamLoader(), getGamUnitData()));
    }
}
