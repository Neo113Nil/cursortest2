package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ww0 implements bt0 {
    public final ax0 d;
    public mu e;
    public mu f;
    public final /* synthetic */ xw0 g;

    public ww0(xw0 xw0Var, ax0 ax0Var, mu muVar, mu muVar2) {
        this.g = xw0Var;
        this.d = ax0Var;
        this.e = muVar;
        this.f = muVar2;
    }

    public final void a(yw0 yw0Var) {
        ax0 ax0Var = this.d;
        ce0 ce0Var = ax0Var.j;
        ce0 ce0Var2 = ax0Var.e;
        yd0 yd0Var = ax0Var.k;
        Object c = this.f.c(yw0Var.c());
        if (this.g.c.g()) {
            ax0Var.f(this.f.c(yw0Var.b()), c, (er) this.e.c(yw0Var));
            return;
        }
        er erVar = (er) this.e.c(yw0Var);
        if (ax0Var.l) {
            zu0 zu0Var = ax0Var.i;
            if (nz.l(c, zu0Var != null ? zu0Var.c : null)) {
                return;
            }
        }
        if (nz.l(ce0Var2.getValue(), c) && yd0Var.g() == -1.0f) {
            return;
        }
        ce0Var2.setValue(c);
        ax0Var.f.setValue(erVar);
        ax0Var.e(yd0Var.g() == -3.0f ? c : ax0Var.m.getValue(), !((Boolean) ce0Var.getValue()).booleanValue());
        ce0Var.setValue(Boolean.valueOf(yd0Var.g() == -3.0f));
        if (yd0Var.g() >= 0.0f) {
            ax0Var.c(ax0Var.a().b((long) (yd0Var.g() * ax0Var.a().c())));
        } else if (yd0Var.g() == -3.0f) {
            ax0Var.c(c);
        }
        ax0Var.l = false;
        yd0Var.h(-1.0f);
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        a(this.g.c.f());
        return this.d.m.getValue();
    }
}
