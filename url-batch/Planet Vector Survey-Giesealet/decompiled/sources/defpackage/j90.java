package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class j90 {
    public f90 a;
    public boolean b;

    public final void a() {
        f90 f90Var = this.a;
        if (f90Var == null) {
            g8.s("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            f90Var.d(this, null);
        }
        k90 k90Var = f90Var.b;
        bb0 bb0Var = f90Var.a;
        k90Var.getClass();
        if (equals(k90Var.h) && -1 == k90Var.g) {
            h90 h90Var = k90Var.f;
            if (h90Var == null) {
                h90Var = k90Var.c(-1);
            }
            k90Var.f = null;
            k90Var.g = 0;
            k90Var.h = null;
            if (h90Var == null) {
                ((eb0) bb0Var.d).a.run();
            } else {
                h90Var.b();
            }
            et0 et0Var = k90Var.a;
            l90 l90Var = l90.u;
            et0Var.getClass();
            et0Var.k(null, l90Var);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
