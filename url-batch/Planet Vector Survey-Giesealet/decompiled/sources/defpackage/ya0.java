package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ya0 extends h90 {
    public final z8 d;
    public boolean e;

    public ya0(z8 z8Var, za0 za0Var) {
        boolean z = z8Var.b;
        this.a = za0Var;
        this.b = z;
        this.d = z8Var;
        this.e = true;
    }

    @Override // defpackage.h90
    public final void a() {
        z8 z8Var = this.d;
        switch (z8Var.d) {
            case 0:
                ((ug) z8Var.e).b();
                break;
        }
    }

    @Override // defpackage.h90
    public final void b() {
        z8 z8Var = this.d;
        switch (z8Var.d) {
            case 0:
                ((ug) z8Var.e).c();
                break;
            case 1:
                ((s80) z8Var.e).l();
                break;
            default:
                ((h4) z8Var.e).c(z8Var);
                break;
        }
    }

    @Override // defpackage.h90
    public final void c(e90 e90Var) {
        x8 x8Var = new x8(e90Var);
        z8 z8Var = this.d;
        switch (z8Var.d) {
            case 0:
                eb ebVar = ((ug) z8Var.e).e;
                if (ebVar != null) {
                    ebVar.r(x8Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h90
    public final void d(e90 e90Var) {
        e90Var.getClass();
        new x8(e90Var);
        z8 z8Var = this.d;
        switch (z8Var.d) {
            case 0:
                ((ug) z8Var.e).d();
                break;
        }
    }

    public final void g(boolean z) {
        this.e = z;
        f(z && this.d.b);
    }
}
