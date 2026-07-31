package yads;

import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KProperty;

/* loaded from: classes5.dex */
public final class z03 implements hg0, a2 {
    public final i6 a;
    public final z1 b;
    public final rz1 c;
    public final p03 d;
    public bf0 e;

    public z03(i6 i6Var, z1 z1Var, rz1 rz1Var) {
        p03 ze0Var;
        j6 j6Var;
        a13 a13Var = (i6Var == null || (j6Var = i6Var.b) == null) ? null : j6Var.b;
        int i = a13Var == null ? -1 : q03.a[a13Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                ze0Var = new wl3();
                this.a = i6Var;
                this.b = z1Var;
                this.c = rz1Var;
                this.d = ze0Var;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        ze0Var = new ze0();
        this.a = i6Var;
        this.b = z1Var;
        this.c = rz1Var;
        this.d = ze0Var;
    }

    @Override // yads.hg0
    public final void a(ViewGroup viewGroup) {
        j6 j6Var;
        this.c.getClass();
        View findViewWithTag = viewGroup.findViewWithTag("skip_button");
        if (findViewWithTag != null) {
            this.b.b.add(this);
            p03 p03Var = this.d;
            i6 i6Var = this.a;
            Long valueOf = (i6Var == null || (j6Var = i6Var.b) == null) ? null : Long.valueOf(j6Var.c);
            bf0 bf0Var = new bf0(findViewWithTag, p03Var, valueOf != null ? valueOf.longValue() : 0L);
            this.e = bf0Var;
            qm2 qm2Var = bf0Var.d;
            KProperty kProperty = bf0.e[0];
            View view = (View) qm2Var.a.get();
            if (view != null) {
                af0 af0Var = new af0(view, bf0Var.a);
                long j = bf0Var.b;
                if (j == 0) {
                    bf0Var.a.b(view);
                } else {
                    bf0Var.c.a(j, af0Var);
                }
            }
            if (findViewWithTag.getTag() == null) {
                findViewWithTag.setTag("skip_button");
            }
        }
    }

    @Override // yads.a2
    public final void b() {
        bf0 bf0Var = this.e;
        if (bf0Var != null) {
            bf0Var.c.b();
        }
    }

    @Override // yads.hg0
    public final void c() {
        this.b.b.remove(this);
        bf0 bf0Var = this.e;
        if (bf0Var != null) {
            bf0Var.c.a();
        }
    }

    @Override // yads.a2
    public final void a() {
        bf0 bf0Var = this.e;
        if (bf0Var != null) {
            bf0Var.c.d();
        }
    }
}
