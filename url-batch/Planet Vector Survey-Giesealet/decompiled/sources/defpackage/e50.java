package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class e50 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ f50 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e50(f50 f50Var, int i) {
        super(0);
        this.e = i;
        this.f = f50Var;
    }

    @Override // defpackage.bu
    public final Object a() {
        xf0 placementScope;
        int i = this.e;
        ky0 ky0Var = ky0.a;
        f50 f50Var = this.f;
        switch (i) {
            case 0:
                s10 s10Var = f50Var.i;
                s10Var.h = 0;
                l70 s = s10Var.a.s();
                Object[] objArr = s.d;
                int i2 = s.f;
                for (int i3 = 0; i3 < i2; i3++) {
                    f50 f50Var2 = ((p10) objArr[i3]).G.o;
                    f50Var2.k = f50Var2.l;
                    f50Var2.l = Integer.MAX_VALUE;
                    f50Var2.v = false;
                    if (f50Var2.o == n10.e) {
                        f50Var2.o = n10.f;
                    }
                }
                p10 p10Var = s10Var.a;
                p10 p10Var2 = s10Var.a;
                l70 s2 = p10Var.s();
                Object[] objArr2 = s2.d;
                int i4 = s2.f;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((p10) objArr2[i5]).G.o.z.getClass();
                }
                f50Var.l().a0().e();
                l70 s3 = p10Var2.s();
                Object[] objArr3 = s3.d;
                int i6 = s3.f;
                for (int i7 = 0; i7 < i6; i7++) {
                    p10 p10Var3 = (p10) objArr3[i7];
                    s10 s10Var2 = p10Var3.G;
                    if (s10Var2.o.k != p10Var3.o()) {
                        p10Var2.H();
                        p10Var2.v();
                        if (p10Var3.o() == Integer.MAX_VALUE) {
                            if (s10Var2.b) {
                                m40 m40Var = s10Var2.p;
                                m40Var.getClass();
                                m40Var.Q(false);
                            }
                            s10Var2.o.R();
                        }
                    }
                }
                l70 s4 = p10Var2.s();
                Object[] objArr4 = s4.d;
                int i8 = s4.f;
                for (int i9 = 0; i9 < i8; i9++) {
                    q10 q10Var = ((p10) objArr4[i9]).G.o.z;
                    q10Var.getClass();
                    q10Var.c = false;
                }
                break;
            case 1:
                f50Var.i.a().d(f50Var.D);
                break;
            default:
                s10 s10Var3 = f50Var.i;
                ea0 ea0Var = s10Var3.a().t;
                if (ea0Var == null || (placementScope = ea0Var.o) == null) {
                    placementScope = ((f3) mz.Q(s10Var3.a)).getPlacementScope();
                }
                mu muVar = f50Var.I;
                if (muVar == null) {
                    ea0 a = s10Var3.a();
                    long j = f50Var.J;
                    float f = f50Var.K;
                    placementScope.getClass();
                    xf0.b(placementScope, a);
                    a.M(bz.c(j, a.h), f, null);
                    break;
                } else {
                    ea0 a2 = s10Var3.a();
                    long j2 = f50Var.J;
                    float f2 = f50Var.K;
                    placementScope.getClass();
                    xf0.b(placementScope, a2);
                    a2.M(bz.c(j2, a2.h), f2, muVar);
                    break;
                }
                break;
        }
        return ky0Var;
    }
}
