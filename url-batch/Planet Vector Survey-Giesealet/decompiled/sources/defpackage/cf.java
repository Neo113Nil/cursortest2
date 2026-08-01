package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class cf extends pl0 {
    public final a70 B;

    public cf(r60 r60Var, boolean z, float f, p01 p01Var, pl plVar) {
        super(r60Var, z, f, p01Var, plVar);
        this.B = new a70();
    }

    @Override // defpackage.t50
    public final void b0() {
        this.B.a();
    }

    @Override // defpackage.pl0
    public final void j0(qh0 qh0Var, long j, float f) {
        a70 a70Var = this.B;
        Object[] objArr = a70Var.b;
        Object[] objArr2 = a70Var.c;
        long[] jArr = a70Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j2 = jArr[i];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j2) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            il0 il0Var = (il0) objArr2[i4];
                            il0Var.k.setValue(Boolean.TRUE);
                            il0Var.i.P(ky0.a);
                        }
                        j2 >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        boolean z = this.s;
        il0 il0Var2 = new il0(z ? new ra0(qh0Var.a) : null, f, z);
        a70Var.m(qh0Var, il0Var2);
        d31.E(V(), null, new u6(il0Var2, this, qh0Var, null, 3), 3);
        mz.H(this);
    }

    @Override // defpackage.pl0
    public final void k0(r10 r10Var) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        int i2;
        int i3;
        Object[] objArr3;
        Object[] objArr4;
        cf cfVar = this;
        r10 r10Var2 = r10Var;
        nc ncVar = r10Var2.d;
        cfVar.v.a();
        float f = 0.1f;
        if (0.1f == 0.0f) {
            return;
        }
        a70 a70Var = cfVar.B;
        Object[] objArr5 = a70Var.b;
        Object[] objArr6 = a70Var.c;
        long[] jArr = a70Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                long j2 = j;
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        Object obj = objArr5[i8];
                        il0 il0Var = (il0) objArr6[i8];
                        long b = ge.b(cfVar.u.o(), f);
                        b6 b6Var = il0Var.h;
                        if (il0Var.d == null) {
                            long c = r10Var2.c();
                            il0Var.d = Float.valueOf(Math.max(fr0.e(c), fr0.c(c)) * 0.3f);
                        }
                        if (il0Var.a == null) {
                            il0Var.a = new ra0(ncVar.D());
                        }
                        if (il0Var.e == null) {
                            il0Var.e = new ra0(mz.o(fr0.e(r10Var.c()) / 2.0f, fr0.c(r10Var.c()) / 2.0f));
                        }
                        float floatValue = (!((Boolean) il0Var.k.getValue()).booleanValue() || ((Boolean) il0Var.j.getValue()).booleanValue()) ? ((Number) il0Var.f.c()).floatValue() : 1.0f;
                        Float f2 = il0Var.d;
                        f2.getClass();
                        float floatValue2 = f2.floatValue();
                        float f3 = il0Var.b;
                        float floatValue3 = ((Number) il0Var.g.c()).floatValue();
                        float f4 = (floatValue3 * f3) + ((1.0f - floatValue3) * floatValue2);
                        ra0 ra0Var = il0Var.a;
                        ra0Var.getClass();
                        float f5 = floatValue;
                        float d = ra0.d(ra0Var.a);
                        ra0 ra0Var2 = il0Var.e;
                        ra0Var2.getClass();
                        float d2 = ra0.d(ra0Var2.a);
                        float floatValue4 = ((Number) b6Var.c()).floatValue();
                        float f6 = (floatValue4 * d2) + ((1.0f - floatValue4) * d);
                        ra0 ra0Var3 = il0Var.a;
                        ra0Var3.getClass();
                        i2 = i6;
                        float e = ra0.e(ra0Var3.a);
                        ra0 ra0Var4 = il0Var.e;
                        ra0Var4.getClass();
                        float e2 = ra0.e(ra0Var4.a);
                        float floatValue5 = ((Number) b6Var.c()).floatValue();
                        long o = mz.o(f6, (floatValue5 * e2) + ((1.0f - floatValue5) * e));
                        long b2 = ge.b(b, ge.d(b) * f5);
                        if (il0Var.c) {
                            float e3 = fr0.e(r10Var.c());
                            float c2 = fr0.c(r10Var.c());
                            t7 t7Var = ncVar.e;
                            long r = t7Var.r();
                            t7Var.p().i();
                            ((t7) ((p01) t7Var.e).e).p().d(0.0f, 0.0f, e3, c2, 1);
                            i = i7;
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                            i3 = 8;
                            y6.m(r10Var, b2, f4, o, 120);
                            t7Var.p().g();
                            t7Var.B(r);
                        } else {
                            i = i7;
                            objArr3 = objArr5;
                            objArr4 = objArr6;
                            i3 = 8;
                            y6.m(r10Var, b2, f4, o, 120);
                        }
                    } else {
                        i = i7;
                        i2 = i6;
                        i3 = i5;
                        objArr3 = objArr5;
                        objArr4 = objArr6;
                    }
                    j2 >>= i3;
                    i7 = i + 1;
                    r10Var2 = r10Var;
                    i5 = i3;
                    i6 = i2;
                    objArr5 = objArr3;
                    objArr6 = objArr4;
                    f = 0.1f;
                    cfVar = this;
                }
                objArr = objArr5;
                objArr2 = objArr6;
                if (i6 != i5) {
                    return;
                }
            } else {
                objArr = objArr5;
                objArr2 = objArr6;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            cfVar = this;
            r10Var2 = r10Var;
            objArr5 = objArr;
            objArr6 = objArr2;
            f = 0.1f;
        }
    }

    @Override // defpackage.pl0
    public final void m0(qh0 qh0Var) {
        il0 il0Var = (il0) this.B.g(qh0Var);
        if (il0Var != null) {
            il0Var.k.setValue(Boolean.TRUE);
            il0Var.i.P(ky0.a);
        }
    }
}
