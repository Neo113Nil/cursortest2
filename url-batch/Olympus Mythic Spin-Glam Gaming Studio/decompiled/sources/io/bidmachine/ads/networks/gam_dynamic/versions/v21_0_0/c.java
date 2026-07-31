package io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalInterstitialAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.c;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;

/* loaded from: classes15.dex */
class c extends InternalInterstitialAd {
    private AdManagerInterstitialAd a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends AdManagerInterstitialAdLoadCallback {
        private final c a;
        private final InternalLoadListener b;

        public b(c cVar, InternalLoadListener internalLoadListener) {
            this.a = cVar;
            this.b = internalLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdManagerInterstitialAd adManagerInterstitialAd) {
            InternalAdLoadData a = e.a(adManagerInterstitialAd);
            this.a.onAdLoaded(a);
            this.b.onAdLoaded(this.a, a);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.c$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    c.b.this.a(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final AdManagerInterstitialAd adManagerInterstitialAd) {
            adManagerInterstitialAd.setOnPaidEventListener(new C1712c());
            this.a.a = adManagerInterstitialAd;
            this.a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.c$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.b.this.a(adManagerInterstitialAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.b.onAdLoadFailed(this.a, e.a(BMError.NoFill, loadAdError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.c$c, reason: collision with other inner class name */
    static final class C1712c implements OnPaidEventListener {
        private final c a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.a.onPaidEvent(e.a(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.c$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    c.C1712c.this.a(adValue);
                }
            });
        }

        private C1712c(@NonNull c cVar) {
            this.a = cVar;
        }
    }

    c(NetworkParams networkParams, TaskExecutor taskExecutor, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void destroyAd() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.a;
        if (adManagerInterstitialAd != null) {
            adManagerInterstitialAd.setFullScreenContentCallback(null);
            this.a.setOnPaidEventListener(null);
            this.a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void loadAd(Context context, InternalLoadListener internalLoadListener) {
        AdManagerInterstitialAd.load(context, getAdUnitId(), e.a(getAdUnit()), new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd
    protected void showAd(Activity activity, InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.a;
        if (adManagerInterstitialAd == null) {
            internalFullscreenAdPresentListener.onAdShowFailed(BMError.internal("Internal GAM interstitial object is null or not loaded"));
        } else {
            adManagerInterstitialAd.setFullScreenContentCallback(new io.bidmachine.ads.networks.gam_dynamic.versions.v21_0_0.b(internalFullscreenAdPresentListener));
            this.a.show(activity);
        }
    }
}
