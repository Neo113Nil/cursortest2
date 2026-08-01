package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class l40 extends v00 implements bu {
    public final /* synthetic */ m40 e;
    public final /* synthetic */ dd0 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(m40 m40Var, dd0 dd0Var, long j) {
        super(0);
        this.e = m40Var;
        this.f = dd0Var;
        this.g = j;
    }

    @Override // defpackage.bu
    public final Object a() {
        h40 t0;
        s10 s10Var = this.e.i;
        xf0 xf0Var = null;
        if (px0.G(s10Var.a) || s10Var.b) {
            ea0 ea0Var = s10Var.a().t;
            if (ea0Var != null) {
                xf0Var = ea0Var.o;
            }
        } else {
            ea0 ea0Var2 = s10Var.a().t;
            if (ea0Var2 != null && (t0 = ea0Var2.t0()) != null) {
                xf0Var = t0.o;
            }
        }
        if (xf0Var == null) {
            xf0Var = ((f3) this.f).getPlacementScope();
        }
        h40 t02 = s10Var.a().t0();
        t02.getClass();
        xf0.i(xf0Var, t02, this.g);
        return ky0.a;
    }
}
