package yads;

import android.content.Context;

/* loaded from: classes13.dex */
public final class vo1 implements nl {
    public final t8 a;
    public final vq1 b;

    public vo1(t8 t8Var, vq1 vq1Var) {
        this.a = t8Var;
        this.b = vq1Var;
    }

    @Override // yads.nl
    public final ml a(Context context, fl flVar, km kmVar) {
        return new com.monetization.ads.mediation.banner.c(context, flVar, kmVar, this.a, this.b);
    }
}
