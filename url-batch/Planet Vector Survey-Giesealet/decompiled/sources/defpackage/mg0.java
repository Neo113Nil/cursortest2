package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class mg0 implements rx {
    public final boolean a;
    public final float b;
    public final f70 c;

    public mg0(boolean z, float f, f70 f70Var) {
        this.a = z;
        this.b = f;
        this.c = f70Var;
    }

    @Override // defpackage.rx
    public final sx a(r60 r60Var, qh qhVar) {
        long j;
        el0 el0Var;
        qhVar.V(988743187);
        ef efVar = (ef) qhVar.j(rl0.a);
        f70 f70Var = this.c;
        if (((ge) f70Var.getValue()).a != ge.g) {
            qhVar.V(-303571590);
            qhVar.q(false);
            j = ((ge) f70Var.getValue()).a;
        } else {
            qhVar.V(-303521246);
            switch (efVar.a) {
                case 0:
                    qhVar.V(-1844533201);
                    j = ((ge) qhVar.j(aj.a)).a;
                    qhVar.q(false);
                    break;
                default:
                    qhVar.V(2042140174);
                    j = ge.b;
                    d31.F(j);
                    qhVar.q(false);
                    break;
            }
            qhVar.q(false);
        }
        f70 p = ud0.p(new ge(j), qhVar);
        switch (efVar.a) {
            case 0:
                qhVar.V(-290975286);
                el0Var = d31.f;
                qhVar.q(false);
                break;
            default:
                qhVar.V(-1629816343);
                el0Var = ((double) d31.F(ge.b)) > 0.5d ? rl0.b : rl0.c;
                qhVar.q(false);
                break;
        }
        f70 p2 = ud0.p(el0Var, qhVar);
        qhVar.V(331259447);
        ViewGroup b = sl0.b((View) qhVar.j(AndroidCompositionLocals_androidKt.f));
        boolean f = qhVar.f(r60Var) | qhVar.f(this) | qhVar.f(b);
        Object K = qhVar.K();
        Object obj = hh.a;
        if (f || K == obj) {
            Object i5Var = new i5(this.a, this.b, p, p2, b);
            qhVar.e0(i5Var);
            K = i5Var;
        }
        i5 i5Var2 = (i5) K;
        qhVar.q(false);
        boolean f2 = qhVar.f(r60Var) | qhVar.h(i5Var2);
        Object K2 = qhVar.K();
        if (f2 || K2 == obj) {
            K2 = new u6(r60Var, i5Var2, (kj) null, 9);
            qhVar.e0(K2);
        }
        mz.l(i5Var2, r60Var, (qu) K2, qhVar);
        qhVar.q(false);
        return i5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg0)) {
            return false;
        }
        mg0 mg0Var = (mg0) obj;
        return this.a == mg0Var.a && jn.a(this.b, mg0Var.b) && this.c.equals(mg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + y6.t(this.b, (this.a ? 1231 : 1237) * 31, 31);
    }
}
