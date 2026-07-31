package yads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.monetization.ads.mediation.rewarded.MediatedReward;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
public final class jq1 extends MediatedRewardedAdapter {
    public final MediatedInterstitialAdapter a;
    public final t8 b;
    public final bs2 c;
    public final Handler d;
    public MediatedRewardedAdapterListener e;
    public final AtomicBoolean f;
    public final iq1 g;

    public jq1(MediatedInterstitialAdapter mediatedInterstitialAdapter, t8 t8Var, bs2 bs2Var) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = mediatedInterstitialAdapter;
        this.b = t8Var;
        this.c = bs2Var;
        this.d = handler;
        this.f = new AtomicBoolean(false);
        this.g = new iq1(this);
    }

    public static final void a(jq1 jq1Var) {
        jq1Var.a();
    }

    public final void b() {
        Handler handler = this.d;
        Runnable runnable = new Runnable() { // from class: yads.jq1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                jq1.a(jq1.this);
            }
        };
        Long l = this.c.b;
        handler.postDelayed(runnable, (l != null ? l.longValue() : 5L) * 1000);
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
    public final boolean isLoaded() {
        return this.a.isLoaded();
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
    public final void loadRewardedAd(Context context, MediatedRewardedAdapterListener mediatedRewardedAdapterListener, Map map, Map map2) {
        this.e = mediatedRewardedAdapterListener;
        this.a.loadInterstitial(context, this.g, map, map2);
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
    public final void onInvalidate() {
        this.d.removeCallbacksAndMessages(null);
        this.a.onInvalidate();
        this.e = null;
    }

    @Override // com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
    public final void showRewardedAd(Activity activity) {
        this.a.showInterstitial(activity);
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            sq2 sq2Var = this.b.r;
            nv nvVar = sq2Var != null ? sq2Var.c : null;
            MediatedReward mediatedReward = nvVar != null ? new MediatedReward(nvVar.b, nvVar.c) : null;
            MediatedRewardedAdapterListener mediatedRewardedAdapterListener = this.e;
            if (mediatedRewardedAdapterListener != null) {
                mediatedRewardedAdapterListener.onRewarded(mediatedReward);
            }
        }
    }
}
