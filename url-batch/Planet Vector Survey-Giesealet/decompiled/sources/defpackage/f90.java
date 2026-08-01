package defpackage;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class f90 {
    public final bb0 a;
    public final k90 b = new k90();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public f90(bb0 bb0Var) {
        this.a = bb0Var;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public static void a(f90 f90Var, h90 h90Var) {
        f90Var.getClass();
        h90Var.getClass();
        if (f90Var.c.add(h90Var)) {
            k90 k90Var = f90Var.b;
            k90Var.getClass();
            if (h90Var.c != null) {
                g8.o("Handler '", h90Var, "' is already registered with a dispatcher");
                return;
            }
            k90Var.e.addFirst(h90Var);
            h90Var.c = f90Var;
            k90Var.b();
        }
    }

    public final void b(j90 j90Var) {
        if (this.d.add(j90Var)) {
            this.b.a(this, j90Var, -1);
        }
    }

    public final void c(va0 va0Var, int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException(("Unsupported priority value: " + i).toString());
        }
        if (this.d.add(va0Var)) {
            this.b.a(this, va0Var, i);
        }
    }

    public final void d(j90 j90Var, e90 e90Var) {
        k90 k90Var = this.b;
        k90Var.getClass();
        if (k90Var.g != 0) {
            return;
        }
        h90 c = k90Var.c(-1);
        k90Var.f = c;
        k90Var.g = -1;
        k90Var.h = j90Var;
        if (e90Var != null) {
            if (c != null) {
                c.d(e90Var);
            }
            et0 et0Var = k90Var.a;
            m90 m90Var = new m90(e90Var);
            et0Var.getClass();
            et0Var.k(null, m90Var);
        }
    }
}
