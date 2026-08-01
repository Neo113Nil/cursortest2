package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class j20 implements mu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j20(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.d;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                o20 o20Var = (o20) obj4;
                final r20 r20Var = (r20) obj3;
                final mu muVar = (mu) obj2;
                final gj0 gj0Var = new gj0();
                m20 m20Var = new m20() { // from class: k20
                    @Override // defpackage.m20
                    public final void g(o20 o20Var2, e20 e20Var) {
                        int i2 = l20.a[e20Var.ordinal()];
                        gj0 gj0Var2 = gj0Var;
                        if (i2 == 1) {
                            gj0Var2.d = muVar.c(r20.this);
                        } else {
                            if (i2 != 2) {
                                return;
                            }
                            lh0 lh0Var = (lh0) gj0Var2.d;
                            if (lh0Var != null) {
                                lh0Var.a();
                            }
                            gj0Var2.d = null;
                        }
                    }
                };
                o20Var.getLifecycle().a(m20Var);
                return new d6(o20Var, m20Var, gj0Var, 2);
            default:
                wm0 wm0Var = (wm0) obj4;
                an0 an0Var = (an0) obj2;
                a70 a70Var = wm0Var.b;
                if (a70Var.b(obj3)) {
                    g8.o("Key ", obj3, " was used multiple times ");
                    return null;
                }
                wm0Var.a.remove(obj3);
                a70Var.m(obj3, an0Var);
                return new d6(wm0Var, obj3, an0Var, 3);
        }
    }
}
