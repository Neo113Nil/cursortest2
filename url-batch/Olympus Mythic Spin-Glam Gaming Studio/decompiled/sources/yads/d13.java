package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class d13 implements hg0 {
    public final k32 a;
    public final fz b;
    public final x00 c;
    public final ku d;
    public final mt1 e;
    public final wy1 f;
    public final mi g;

    public d13(k32 k32Var, fz fzVar, x00 x00Var, ku kuVar, mt1 mt1Var) {
        wy1 wy1Var = new wy1();
        mi miVar = new mi(n12.a(k32Var, ii0.b), 2);
        this.a = k32Var;
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
            f22 a = this.g.a((ExtendedNativeAdView) viewGroup, this.f);
            k32 k32Var = this.a;
            ku kuVar = this.d;
            k32Var.getClass();
            k32Var.a(a.c, k32Var.R, new o22(a), kuVar);
            z43 z43Var = new z43(this.c);
            Iterator it = this.a.k().iterator();
            while (it.hasNext()) {
                ((m12) it.next()).a(z43Var);
            }
            this.a.b(this.c);
        } catch (v02 e) {
            this.b.e();
            this.e.reportError("Failed to bind DivKit Slider Ad", e);
        }
    }

    @Override // yads.hg0
    public final void c() {
        this.a.b((x00) null);
        Iterator it = this.a.k().iterator();
        while (it.hasNext()) {
            ((m12) it.next()).a((x00) null);
        }
    }
}
