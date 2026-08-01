package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class db0 implements m20, AutoCloseable {
    public final /* synthetic */ ya0 d;
    public final /* synthetic */ g20 e;

    public db0(ya0 ya0Var, eb0 eb0Var, g20 g20Var) {
        this.d = ya0Var;
        this.e = g20Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e.b(this);
    }

    @Override // defpackage.m20
    public final void g(o20 o20Var, e20 e20Var) {
        e20 e20Var2 = e20.ON_START;
        ya0 ya0Var = this.d;
        if (e20Var == e20Var2) {
            ya0Var.g(true);
        } else if (e20Var == e20.ON_STOP) {
            ya0Var.g(false);
        }
        if (e20Var == e20.ON_DESTROY) {
            ya0Var.e();
            this.e.b(this);
        }
    }
}
