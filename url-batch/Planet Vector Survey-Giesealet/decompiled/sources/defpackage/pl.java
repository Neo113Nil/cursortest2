package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class pl extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ ql f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl(ql qlVar, int i) {
        super(0);
        this.e = i;
        this.f = qlVar;
    }

    @Override // defpackage.bu
    public final Object a() {
        int i = this.e;
        ql qlVar = this.f;
        switch (i) {
            case 0:
                return d31.f;
            default:
                jl0 jl0Var = (jl0) mz.A(qlVar, nl0.b);
                pl0 pl0Var = qlVar.x;
                if (jl0Var == null) {
                    if (pl0Var != null) {
                        qlVar.k0(pl0Var);
                    }
                } else if (pl0Var == null) {
                    p01 p01Var = new p01(5, qlVar);
                    pl plVar = new pl(qlVar, 0);
                    r60 r60Var = qlVar.t;
                    boolean z = qlVar.u;
                    float f = qlVar.v;
                    ox0 ox0Var = ol0.a;
                    pl0 cfVar = sl0.a ? new cf(r60Var, z, f, p01Var, plVar) : new j5(r60Var, z, f, p01Var, plVar);
                    qlVar.j0(cfVar);
                    qlVar.x = cfVar;
                }
                return ky0.a;
        }
    }
}
