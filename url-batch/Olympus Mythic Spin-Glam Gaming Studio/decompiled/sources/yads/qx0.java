package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes5.dex */
public final class qx0 implements hg0 {
    public final m12 a;
    public final d2 b;
    public final x00 c;
    public final mt1 d;
    public final mi e;
    public final vy1 f;

    public qx0(m12 m12Var, d2 d2Var, x00 x00Var, mt1 mt1Var) {
        mi miVar = new mi(null, 3);
        vy1 vy1Var = new vy1();
        this.a = m12Var;
        this.b = d2Var;
        this.c = x00Var;
        this.d = mt1Var;
        this.e = miVar;
        this.f = vy1Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        xz a = this.a.a(this.e.a((ExtendedNativeAdView) viewGroup, this.f));
        if (a instanceof wz) {
            this.a.a(this.c);
        } else if (a instanceof vz) {
            this.b.e();
            this.d.reportError("Failed to bind DivKit Fullscreen Native Ad", ((vz) a).b);
        }
    }

    @Override // yads.hg0
    public final void c() {
        this.a.a((x00) null);
    }
}
