package sg.bigo.ads.ae;

import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.aj.d;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.RewardAdInteractionListener;
import sg.bigo.ads.api.RewardVideoAd;
import sg.bigo.ads.api.core.n;

/* loaded from: classes5.dex */
public final class h extends t implements RewardVideoAd {
    private RewardAdInteractionListener G;

    public h(@NonNull sg.bigo.ads.api.core.g gVar) {
        super(gVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final int D() {
        sg.bigo.ads.cp.a aVar = (sg.bigo.ads.cp.a) this.b.a;
        n bd = aVar.bd();
        long j = bd != null ? bd.c : 0L;
        if (j == 0) {
            j = aVar.bc();
        }
        return (int) (j / 1000);
    }

    @Override // sg.bigo.ads.ad.interstitial.t, sg.bigo.ads.ad.interstitial.k
    public final Class<? extends sg.bigo.ads.cl.b<?>> G() {
        return N() ? d.class : ((t) this).C instanceof sg.bigo.ads.aj.e ? O() ? sg.bigo.ads.af.a.class : sg.bigo.ads.ag.c.class : E() ? M() ? f.class : g.class : e.class;
    }

    @Override // sg.bigo.ads.ad.interstitial.t
    public final boolean N() {
        return (K() instanceof sg.bigo.ads.z.g) || (K() instanceof sg.bigo.ads.z.f);
    }

    public final void P() {
        sg.bigo.ads.da.b.b(this.b.a, this);
        RewardAdInteractionListener rewardAdInteractionListener = this.G;
        if (rewardAdInteractionListener != null) {
            rewardAdInteractionListener.onAdRewarded();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.t, sg.bigo.ads.ad.interstitial.k
    public final void b(@NonNull d.a<InterstitialAd> aVar) {
        super.b(aVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.t, sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.d.d, sg.bigo.ads.d.c
    public final void destroyInMainThread() {
        super.destroyInMainThread();
        this.G = null;
    }

    @Override // sg.bigo.ads.api.RewardVideoAd
    public final void setAdInteractionListener(RewardAdInteractionListener rewardAdInteractionListener) {
        super.setAdInteractionListener((AdInteractionListener) rewardAdInteractionListener);
        this.G = rewardAdInteractionListener;
    }
}
