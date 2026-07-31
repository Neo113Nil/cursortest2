package yads;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;

/* loaded from: classes4.dex */
public final class kq1 implements xo1 {
    public final lo1 a;
    public final t8 b;

    public kq1(lo1 lo1Var, t8 t8Var) {
        this.a = lo1Var;
        this.b = t8Var;
    }

    @Override // yads.xo1
    public final boolean a(er1 er1Var, Class cls) {
        ds2 ds2Var = er1Var.i;
        return ds2Var != null && ds2Var.b == rq1.d && MediatedRewardedAdapter.class.isAssignableFrom(cls);
    }

    @Override // yads.xo1
    public final com.monetization.ads.mediation.base.a a(Context context, er1 er1Var) {
        bs2 bs2Var;
        MediatedInterstitialAdapter mediatedInterstitialAdapter;
        t8 t8Var = this.b;
        ds2 ds2Var = er1Var.i;
        if (ds2Var == null || (bs2Var = ds2Var.c) == null || (mediatedInterstitialAdapter = (MediatedInterstitialAdapter) this.a.a(context, er1Var, MediatedInterstitialAdapter.class)) == null) {
            return null;
        }
        return new jq1(mediatedInterstitialAdapter, t8Var, bs2Var);
    }
}
