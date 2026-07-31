package yads;

import com.monetization.ads.mediation.base.MediatedAdRequestError;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;

/* loaded from: classes12.dex */
public final class iq1 implements MediatedInterstitialAdapter.MediatedInterstitialAdapterListener {
    public final /* synthetic */ jq1 a;

    public iq1(jq1 jq1Var) {
        this.a = jq1Var;
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onAdImpression() {
        MediatedRewardedAdapterListener mediatedRewardedAdapterListener = this.a.e;
        if (mediatedRewardedAdapterListener != null) {
            mediatedRewardedAdapterListener.onAdImpression();
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialClicked() {
        MediatedRewardedAdapterListener mediatedRewardedAdapterListener = this.a.e;
        if (mediatedRewardedAdapterListener != null) {
            mediatedRewardedAdapterListener.onRewardedAdClicked();
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialDismissed() {
        this.a.d.removeCallbacksAndMessages(null);
        this.a.a();
        MediatedRewardedAdapterListener mediatedRewardedAdapterListener = this.a.e;
        if (mediatedRewardedAdapterListener != null) {
            mediatedRewardedAdapterListener.onRewardedAdDismissed();
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialFailedToLoad(MediatedAdRequestError mediatedAdRequestError) {
        this.a.d.removeCallbacksAndMessages(null);
        MediatedRewardedAdapterListener mediatedRewardedAdapterListener = this.a.e;
        if (mediatedRewardedAdapterListener != null) {
            mediatedRewardedAdapterListener.onRewardedAdFailedToLoad(mediatedAdRequestError);
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialLoaded() {
        this.a.f.set(false);
        MediatedRewardedAdapterListener mediatedRewardedAdapterListener = this.a.e;
        if (mediatedRewardedAdapterListener != null) {
            mediatedRewardedAdapterListener.onRewardedAdLoaded();
        }
    }

    @Override // com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter.MediatedInterstitialAdapterListener
    public final void onInterstitialShown() {
        MediatedRewardedAdapterListener mediatedRewardedAdapterListener = this.a.e;
        if (mediatedRewardedAdapterListener != null) {
            mediatedRewardedAdapterListener.onRewardedAdShown();
        }
        this.a.b();
    }
}
