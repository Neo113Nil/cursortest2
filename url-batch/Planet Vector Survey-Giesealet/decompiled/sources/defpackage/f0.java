package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class f0 {
    public g0[] d;
    public int e;
    public int f;
    public wt0 g;

    public final g0 c() {
        g0 g0Var;
        wt0 wt0Var;
        synchronized (this) {
            try {
                g0[] g0VarArr = this.d;
                if (g0VarArr == null) {
                    g0VarArr = f();
                    this.d = g0VarArr;
                } else if (this.e >= g0VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(g0VarArr, g0VarArr.length * 2);
                    this.d = (g0[]) copyOf;
                    g0VarArr = (g0[]) copyOf;
                }
                int i = this.f;
                do {
                    g0Var = g0VarArr[i];
                    if (g0Var == null) {
                        g0Var = d();
                        g0VarArr[i] = g0Var;
                    }
                    i++;
                    if (i >= g0VarArr.length) {
                        i = 0;
                    }
                } while (!g0Var.a(this));
                this.f = i;
                this.e++;
                wt0Var = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wt0Var != null) {
            wt0Var.v(1);
        }
        return g0Var;
    }

    public abstract g0 d();

    public abstract g0[] f();

    public final void g(g0 g0Var) {
        wt0 wt0Var;
        int i;
        kj[] b;
        synchronized (this) {
            try {
                int i2 = this.e - 1;
                this.e = i2;
                wt0Var = this.g;
                if (i2 == 0) {
                    this.f = 0;
                }
                g0Var.getClass();
                b = g0Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kj kjVar : b) {
            if (kjVar != null) {
                kjVar.resumeWith(ky0.a);
            }
        }
        if (wt0Var != null) {
            wt0Var.v(-1);
        }
    }

    public final wt0 h() {
        wt0 wt0Var;
        synchronized (this) {
            wt0Var = this.g;
            if (wt0Var == null) {
                int i = this.e;
                wt0Var = new wt0(1, Integer.MAX_VALUE);
                wt0Var.p(Integer.valueOf(i));
                this.g = wt0Var;
            }
        }
        return wt0Var;
    }
}
