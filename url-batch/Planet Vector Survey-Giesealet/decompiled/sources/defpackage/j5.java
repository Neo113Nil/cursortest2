package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class j5 extends pl0 implements ll0 {
    public kl0 B;
    public ml0 C;

    @Override // defpackage.ll0
    public final void N() {
        this.C = null;
        mz.H(this);
    }

    @Override // defpackage.t50
    public final void b0() {
        kl0 kl0Var = this.B;
        if (kl0Var != null) {
            N();
            j3 j3Var = kl0Var.g;
            ml0 ml0Var = (ml0) ((LinkedHashMap) j3Var.e).get(this);
            if (ml0Var != null) {
                ml0Var.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) j3Var.e;
                ml0 ml0Var2 = (ml0) linkedHashMap.get(this);
                if (ml0Var2 != null) {
                }
                linkedHashMap.remove(this);
                kl0Var.f.add(ml0Var);
            }
        }
    }

    @Override // defpackage.pl0
    public final void j0(qh0 qh0Var, long j, float f) {
        kl0 kl0Var = this.B;
        if (kl0Var == null) {
            kl0Var = sl0.a(sl0.b((View) mz.A(this, AndroidCompositionLocals_androidKt.f)));
            this.B = kl0Var;
        }
        ml0 a = kl0Var.a(this);
        int H = a50.H(f);
        long o = this.u.o();
        this.v.a();
        a.b(qh0Var, this.s, j, H, o, 0.1f, new b(2, this));
        this.C = a;
        mz.H(this);
    }

    @Override // defpackage.pl0
    public final void k0(r10 r10Var) {
        kc p = r10Var.d.e.p();
        ml0 ml0Var = this.C;
        if (ml0Var != null) {
            long j = this.y;
            long o = this.u.o();
            this.v.a();
            ml0Var.e(0.1f, j, o);
            ml0Var.draw(p2.a(p));
        }
    }

    @Override // defpackage.pl0
    public final void m0(qh0 qh0Var) {
        ml0 ml0Var = this.C;
        if (ml0Var != null) {
            ml0Var.d();
        }
    }
}
