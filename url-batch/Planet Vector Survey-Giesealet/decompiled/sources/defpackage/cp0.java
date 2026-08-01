package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cp0 extends v00 implements mu {
    public final /* synthetic */ int e;
    public final /* synthetic */ jp0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cp0(jp0 jp0Var, int i) {
        super(1);
        this.e = i;
        this.f = jp0Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        int i = this.e;
        ky0 ky0Var = ky0.a;
        jp0 jp0Var = this.f;
        switch (i) {
            case 0:
                long longValue = ((Number) obj).longValue();
                long j = longValue - jp0Var.l;
                jp0Var.l = longValue;
                long J = a50.J(j / jp0Var.p);
                x60 x60Var = jp0Var.m;
                if (x60Var.h()) {
                    Object[] objArr = x60Var.a;
                    int i2 = x60Var.b;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        bp0 bp0Var = (bp0) objArr[i4];
                        jp0.i(jp0Var, bp0Var, J);
                        bp0Var.c = true;
                    }
                    cx0 cx0Var = jp0Var.e;
                    if (cx0Var != null) {
                        cx0Var.p();
                    }
                    int i5 = x60Var.b;
                    Object[] objArr2 = x60Var.a;
                    ez v = rg0.v(0, i5);
                    int i6 = v.d;
                    int i7 = v.e;
                    if (i6 <= i7) {
                        while (true) {
                            objArr2[i6 - i3] = objArr2[i6];
                            if (((bp0) objArr2[i6]).c) {
                                i3++;
                            }
                            if (i6 != i7) {
                                i6++;
                            }
                        }
                    }
                    p8.X(objArr2, i5 - i3, i5);
                    x60Var.b -= i3;
                }
                bp0 bp0Var2 = jp0Var.n;
                if (bp0Var2 != null) {
                    bp0Var2.g = jp0Var.f;
                    jp0.i(jp0Var, bp0Var2, J);
                    jp0Var.q(bp0Var2.d);
                    if (bp0Var2.d == 1.0f) {
                        jp0Var.n = null;
                    }
                    jp0Var.p();
                    break;
                }
                break;
            default:
                jp0Var.l = ((Number) obj).longValue();
                break;
        }
        return ky0Var;
    }
}
