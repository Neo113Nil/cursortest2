package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class g40 extends xf0 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ g40(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.sl
    public final float a() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((f40) obj).a();
            default:
                return ((f3) obj).getDensity().a();
        }
    }

    @Override // defpackage.xf0
    public float d(nw nwVar) {
        float intBitsToFloat;
        int b0;
        switch (this.e) {
            case 0:
                qu quVar = nwVar.a;
                if (quVar != null) {
                    return ((Number) quVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                f40 f40Var = (f40) this.f;
                if (f40Var.n) {
                    return Float.NaN;
                }
                f40 f40Var2 = f40Var;
                while (true) {
                    km0 km0Var = f40Var2.p;
                    if (!Float.isNaN((km0Var == null || (b0 = p8.b0(km0Var.b, nwVar)) < 0) ? Float.NaN : km0Var.c[b0])) {
                        f40Var2.Q(f40Var.Z(), nwVar);
                        b10 X = f40Var2.X();
                        b10 X2 = f40Var.X();
                        switch (nwVar.b) {
                            case 0:
                                intBitsToFloat = Float.intBitsToFloat((int) (X2.u(X, (Float.floatToRawIntBits(r2) & 4294967295L) | (Float.floatToRawIntBits(((int) (X.A() >> 32)) / 2.0f) << 32)) & 4294967295L));
                                break;
                            default:
                                intBitsToFloat = Float.intBitsToFloat((int) (X2.u(X, (Float.floatToRawIntBits(r2) << 32) | (4294967295L & Float.floatToRawIntBits(((int) (X.A() & 4294967295L)) / 2.0f))) >> 32));
                                break;
                        }
                        return intBitsToFloat;
                    }
                    f40 b02 = f40Var2.b0();
                    if (b02 == null) {
                        f40Var2.Q(f40Var.Z(), nwVar);
                        return Float.NaN;
                    }
                    f40Var2 = b02;
                }
                break;
            default:
                return super.d(nwVar);
        }
    }

    @Override // defpackage.xf0
    public final c10 e() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((f40) obj).getLayoutDirection();
            default:
                return ((f3) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.xf0
    public final int f() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((f40) obj).H();
            default:
                return ((f3) obj).getRoot().G.o.d;
        }
    }

    @Override // defpackage.sl
    public final float h() {
        int i = this.e;
        Object obj = this.f;
        switch (i) {
            case 0:
                return ((f40) obj).h();
            default:
                return ((f3) obj).getDensity().h();
        }
    }
}
