package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class e60 extends a60 {
    public final /* synthetic */ int a = 1;
    public z50 b;

    public e60(z50 z50Var) {
        this.b = z50Var;
    }

    @Override // defpackage.a60, defpackage.w50
    public void a(z50 z50Var) {
        switch (this.a) {
            case 1:
                v6 v6Var = (v6) this.b;
                if (!v6Var.J) {
                    v6Var.H();
                    v6Var.J = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.w50
    public final void d(z50 z50Var) {
        switch (this.a) {
            case 0:
                this.b.A();
                z50Var.y(this);
                break;
            default:
                v6 v6Var = (v6) this.b;
                int i = v6Var.I - 1;
                v6Var.I = i;
                if (i == 0) {
                    v6Var.J = false;
                    v6Var.m();
                }
                z50Var.y(this);
                break;
        }
    }

    public /* synthetic */ e60() {
    }
}
