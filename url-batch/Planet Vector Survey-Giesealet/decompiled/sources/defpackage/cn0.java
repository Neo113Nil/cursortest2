package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cn0 implements m20, AutoCloseable {
    public final String d;
    public final bn0 e;
    public boolean f;

    public cn0(String str, bn0 bn0Var) {
        this.d = str;
        this.e = bn0Var;
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        if (e20Var == e20.ON_DESTROY) {
            this.f = false;
            o20Var.getLifecycle().b(this);
        }
    }

    public final void h(g20 g20Var, in0 in0Var) {
        in0Var.getClass();
        g20Var.getClass();
        if (this.f) {
            g8.s("Already attached to lifecycleOwner");
            return;
        }
        this.f = true;
        g20Var.a(this);
        in0Var.c(this.d, (qf) this.e.b.e);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
