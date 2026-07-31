package yads;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;

/* loaded from: classes4.dex */
public final class to1 implements xn1 {
    public final go1 a;

    public to1(go1 go1Var) {
        this.a = go1Var;
    }

    @Override // yads.xn1
    public final tn1 a(Context context) {
        return this.a.a(context, MediatedAppOpenAdAdapter.class);
    }
}
