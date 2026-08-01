package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class is {
    public final ks a;
    public final f3 b;
    public final b70 c;
    public final b70 d;
    public boolean e;

    public is(ks ksVar, f3 f3Var) {
        this.a = ksVar;
        this.b = f3Var;
        int i = wn0.a;
        this.c = new b70();
        this.d = new b70();
    }

    public final void a() {
        if (this.e) {
            return;
        }
        z2 z2Var = new z2(0, this, is.class, "invalidateNodes", "invalidateNodes()V", 0, 0, 1);
        x60 x60Var = this.b.w0;
        if (x60Var.f(z2Var) < 0) {
            x60Var.a(z2Var);
        }
        this.e = true;
    }
}
