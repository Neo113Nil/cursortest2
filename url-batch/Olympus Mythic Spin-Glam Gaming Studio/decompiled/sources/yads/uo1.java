package yads;

import android.content.Context;
import com.monetization.ads.mediation.banner.MediatedBannerAdapter;

/* loaded from: classes6.dex */
public final class uo1 implements xn1 {
    public final go1 a;

    public uo1(go1 go1Var) {
        this.a = go1Var;
    }

    @Override // yads.xn1
    public final tn1 a(Context context) {
        return this.a.a(context, MediatedBannerAdapter.class);
    }
}
