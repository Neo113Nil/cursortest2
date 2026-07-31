package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes3.dex */
public final class nx0 implements hg0 {
    public final hg0 a;

    public nx0(m12 m12Var, d2 d2Var, x00 x00Var, ku kuVar, mt1 mt1Var) {
        this.a = m12Var instanceof k32 ? new d13((k32) m12Var, d2Var, x00Var, kuVar, mt1Var) : new d02(m12Var, d2Var, x00Var, kuVar, mt1Var);
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        this.a.a((ExtendedNativeAdView) viewGroup);
    }

    @Override // yads.hg0
    public final void c() {
        this.a.c();
    }
}
