package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes5.dex */
public final class d02 implements hg0 {
    public final m12 a;
    public final fz b;
    public final x00 c;
    public final ku d;
    public final mt1 e;
    public final wy1 f;
    public final mi g;

    public d02(m12 m12Var, fz fzVar, x00 x00Var, ku kuVar, mt1 mt1Var) {
        wy1 wy1Var = new wy1();
        mi miVar = new mi(n12.a(m12Var, null), 2);
        this.a = m12Var;
        this.b = fzVar;
        this.c = x00Var;
        this.d = kuVar;
        this.e = mt1Var;
        this.f = wy1Var;
        this.g = miVar;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        try {
            this.a.a(this.g.a((ExtendedNativeAdView) viewGroup, this.f), this.d);
            this.a.a(this.c);
        } catch (v02 e) {
            this.b.e();
            this.e.reportError("Failed to bind DivKit Native Ad", e);
        }
    }

    @Override // yads.hg0
    public final void c() {
        this.a.a((x00) null);
    }
}
