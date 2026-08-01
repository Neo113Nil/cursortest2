package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class h90 {
    public nz a;
    public boolean b;
    public f90 c;

    public abstract void a();

    public abstract void b();

    public abstract void c(e90 e90Var);

    public abstract void d(e90 e90Var);

    public final void e() {
        f90 f90Var = this.c;
        if (f90Var == null || !f90Var.c.remove(this)) {
            return;
        }
        k90 k90Var = f90Var.b;
        k90Var.getClass();
        if (equals(k90Var.f)) {
            if (k90Var.g == -1) {
                a();
            }
            k90Var.f = null;
            k90Var.g = 0;
            k90Var.h = null;
        }
        k90Var.d.remove(this);
        k90Var.e.remove(this);
        this.c = null;
        k90Var.b();
    }

    public final void f(boolean z) {
        k90 k90Var;
        if (this.b == z) {
            return;
        }
        this.b = z;
        f90 f90Var = this.c;
        if (f90Var == null || (k90Var = f90Var.b) == null) {
            return;
        }
        k90Var.b();
    }
}
