package io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.bidmachine.AdsFormat;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdLoadData;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalLoadListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalRewardedAd;
import io.bidmachine.ads.networks.gam_dynamic.NetworkParams;
import io.bidmachine.ads.networks.gam_dynamic.TaskExecutor;
import io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.d;
import io.bidmachine.protobuf.Waterfall;
import io.bidmachine.utils.BMError;

/* loaded from: classes15.dex */
class d extends InternalRewardedAd {
    private RewardedAd a;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends RewardedAdLoadCallback {
        private final d a;
        private final InternalLoadListener b;

        public b(d dVar, InternalLoadListener internalLoadListener) {
            this.a = dVar;
            this.b = internalLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(RewardedAd rewardedAd) {
            InternalAdLoadData a = e.a(rewardedAd);
            this.a.onAdLoaded(a);
            this.b.onAdLoaded(this.a, a);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError loadAdError) {
            this.a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.d$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.this.a(loadAdError);
                }
            });
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(final RewardedAd rewardedAd) {
            rewardedAd.setOnPaidEventListener(new c());
            this.a.a = rewardedAd;
            this.a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.d$b$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    d.b.this.a(rewardedAd);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(LoadAdError loadAdError) {
            this.b.onAdLoadFailed(this.a, e.a(BMError.NoFill, loadAdError));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c implements OnPaidEventListener {
        private final d a;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AdValue adValue) {
            this.a.onPaidEvent(e.a(adValue));
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.a.onBackground(new Runnable() { // from class: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.d$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    d.c.this.a(adValue);
                }
            });
        }

        private c(@NonNull d dVar) {
            this.a = dVar;
        }
    }

    /* renamed from: io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.d$d, reason: collision with other inner class name */
    private static final class C1719d implements OnUserEarnedRewardListener {
        private C1719d() {
        }

        @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
        public void onUserEarnedReward(RewardItem rewardItem) {
        }
    }

    d(NetworkParams networkParams, TaskExecutor taskExecutor, AdsFormat adsFormat, Waterfall.Configuration.AdUnit adUnit, InternalAdListener internalAdListener) {
        super(networkParams, taskExecutor, adsFormat, adUnit, internalAdListener);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void destroyAd() {
        RewardedAd rewardedAd = this.a;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(null);
            this.a.setOnPaidEventListener(null);
            this.a = null;
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAd
    protected void loadAd(Context context, InternalLoadListener internalLoadListener) {
        RewardedAd.load(context, getAdUnitId(), e.a(getAdUnit()), (RewardedAdLoadCallback) new b(this, internalLoadListener));
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd
    protected void showAd(Activity activity, InternalFullscreenAdPresentListener internalFullscreenAdPresentListener) {
        RewardedAd rewardedAd = this.a;
        if (rewardedAd == null) {
            internalFullscreenAdPresentListener.onAdShowFailed(BMError.internal("Internal GAM rewarded object is null or not loaded"));
        } else {
            rewardedAd.setFullScreenContentCallback(new io.bidmachine.ads.networks.gam_dynamic.versions.v23_0_0.b(internalFullscreenAdPresentListener));
            this.a.show(activity, new C1719d());
        }
    }
}
