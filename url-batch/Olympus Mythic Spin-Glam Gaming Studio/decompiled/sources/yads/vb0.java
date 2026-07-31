package yads;

/* loaded from: classes5.dex */
public final class vb0 {
    public final d73 a;
    public l41 b;
    public zm2 c;
    public pm1 d;
    public pm1 e;
    public pm1 f;

    public vb0(d73 d73Var) {
        this.a = d73Var;
        i41 i41Var = l41.c;
        this.b = um2.f;
        this.c = zm2.h;
    }

    public final void a(g73 g73Var) {
        m41 m41Var = new m41(4);
        if (this.b.isEmpty()) {
            a(m41Var, this.e, g73Var);
            if (!x92.a(this.f, this.e)) {
                a(m41Var, this.f, g73Var);
            }
            if (!x92.a(this.d, this.e) && !x92.a(this.d, this.f)) {
                a(m41Var, this.d, g73Var);
            }
        } else {
            for (int i = 0; i < this.b.size(); i++) {
                a(m41Var, (pm1) this.b.get(i), g73Var);
            }
            if (!this.b.contains(this.d)) {
                a(m41Var, this.d, g73Var);
            }
        }
        this.c = zm2.a(m41Var.b, m41Var.a);
    }

    public final void a(m41 m41Var, pm1 pm1Var, g73 g73Var) {
        if (pm1Var == null) {
            return;
        }
        if (g73Var.a(pm1Var.a) != -1) {
            m41Var.a(pm1Var, g73Var);
            return;
        }
        g73 g73Var2 = (g73) this.c.get(pm1Var);
        if (g73Var2 != null) {
            m41Var.a(pm1Var, g73Var2);
        }
    }

    public static pm1 a(xn0 xn0Var, l41 l41Var, pm1 pm1Var, d73 d73Var) {
        int a;
        int i;
        xn0Var.q();
        g73 g73Var = xn0Var.b0.a;
        xn0Var.q();
        if (xn0Var.b0.a.c()) {
            a = 0;
        } else {
            pe2 pe2Var = xn0Var.b0;
            a = pe2Var.a.a(pe2Var.b.a);
        }
        Object a2 = g73Var.c() ? null : g73Var.a(a);
        if (xn0Var.j() || g73Var.c()) {
            i = -1;
        } else {
            d73 a3 = g73Var.a(a, d73Var, false);
            xn0Var.q();
            i = a3.a(sb3.a(sb3.b(xn0Var.a(xn0Var.b0))) - d73Var.f);
        }
        for (int i2 = 0; i2 < l41Var.size(); i2++) {
            pm1 pm1Var2 = (pm1) l41Var.get(i2);
            if (a(pm1Var2, a2, xn0Var.j(), xn0Var.e(), xn0Var.f(), i)) {
                return pm1Var2;
            }
        }
        if (l41Var.isEmpty() && pm1Var != null) {
            if (a(pm1Var, a2, xn0Var.j(), xn0Var.e(), xn0Var.f(), i)) {
                return pm1Var;
            }
        }
        return null;
    }

    public static boolean a(pm1 pm1Var, Object obj, boolean z, int i, int i2, int i3) {
        if (pm1Var.a.equals(obj)) {
            return (z && pm1Var.b == i && pm1Var.c == i2) || (!z && pm1Var.b == -1 && pm1Var.e == i3);
        }
        return false;
    }
}
