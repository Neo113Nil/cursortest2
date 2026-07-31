package yads;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;

/* loaded from: classes4.dex */
public final class gq1 implements xn1 {
    public final go1 a;

    public gq1(go1 go1Var) {
        this.a = go1Var;
    }

    @Override // yads.xn1
    public final tn1 a(Context context) {
        return this.a.a(context, MediatedRewardedAdapter.class);
    }
}
