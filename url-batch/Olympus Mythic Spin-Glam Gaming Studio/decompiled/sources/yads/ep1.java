package yads;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;

/* loaded from: classes.dex */
public final class ep1 implements xn1 {
    public final go1 a;

    public ep1(go1 go1Var) {
        this.a = go1Var;
    }

    @Override // yads.xn1
    public final tn1 a(Context context) {
        return this.a.a(context, MediatedInterstitialAdapter.class);
    }
}
