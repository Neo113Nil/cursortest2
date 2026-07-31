package sg.bigo.ads.ae;

import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.o;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;

/* loaded from: classes5.dex */
public final class b extends o implements RewardVideoAd {
    private RewardAdInteractionListener F;

    public b(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.o, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.cl.b<?>> G() {
        return a.class;
    }

    final void J() {
        sg.bigo.ads.da.b.b(this.b.a, this);
        RewardAdInteractionListener rewardAdInteractionListener = this.F;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdRewarded();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.o, sg.bigo.ads.ad.interstitial.k
    public final void b(@NonNull d.a<InterstitialAd> aVar) {
        super.b(aVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.o, sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        this.F = null;
    }

    @Override // sg.bigo.ads.api.RewardVideoAd
    public final void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener) {
        super.setAdInteractionListener((AdInteractionListener) rewardAdInteractionListener);
        this.F = rewardAdInteractionListener;
    }
}
