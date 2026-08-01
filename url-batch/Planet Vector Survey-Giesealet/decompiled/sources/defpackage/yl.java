package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class yl extends it0 implements bt0 {
    public final bu e;
    public xl f = new xl(ur0.k().g());

    public yl(bu buVar) {
        this.e = buVar;
    }

    @Override // defpackage.ht0
    public final jt0 a() {
        return this.f;
    }

    @Override // defpackage.ht0
    public final void c(jt0 jt0Var) {
        jt0Var.getClass();
        this.f = (xl) jt0Var;
    }

    public final xl g(xl xlVar, or0 or0Var, boolean z, bu buVar) {
        l70 h;
        xl xlVar2;
        int i;
        if (!xlVar.c(this, or0Var)) {
            final w60 w60Var = new w60();
            t7 t7Var = as0.a;
            final gz gzVar = (gz) t7Var.o();
            if (gzVar == null) {
                gzVar = new gz();
                t7Var.x(gzVar);
            }
            final int i2 = gzVar.a;
            h = ud0.h();
            Object[] objArr = h.d;
            int i3 = h.f;
            for (int i4 = 0; i4 < i3; i4++) {
                ((oh) objArr[i4]).b();
            }
            try {
                gzVar.a = i2 + 1;
                Object h2 = yc0.h(new mu() { // from class: wl
                    @Override // defpackage.mu
                    public final Object c(Object obj) {
                        if (obj == yl.this) {
                            g8.s("A derived state calculation cannot read itself");
                            return null;
                        }
                        if (obj instanceof ht0) {
                            int i5 = gzVar.a - i2;
                            w60 w60Var2 = w60Var;
                            int d = w60Var2.d(obj);
                            w60Var2.h(Math.min(i5, d >= 0 ? w60Var2.c[d] : Integer.MAX_VALUE), obj);
                        }
                        return ky0.a;
                    }
                }, buVar);
                gzVar.a = i2;
                Object[] objArr2 = h.d;
                int i5 = h.f;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((oh) objArr2[i6]).a();
                }
                Object obj = ur0.c;
                synchronized (obj) {
                    or0 k = ur0.k();
                    xlVar2 = (xl) ur0.n(this.f, this, k);
                    xlVar2.e = w60Var;
                    xlVar2.g = xlVar2.d(this, k);
                    xlVar2.f = h2;
                }
                gz gzVar2 = (gz) as0.a.o();
                if (gzVar2 == null || gzVar2.a != 0) {
                    return xlVar2;
                }
                ur0.k().m();
                synchronized (obj) {
                    or0 k2 = ur0.k();
                    xlVar2.c = k2.g();
                    xlVar2.d = k2.h();
                }
                return xlVar2;
            } finally {
                Object[] objArr3 = h.d;
                int i7 = h.f;
                for (int i8 = 0; i8 < i7; i8++) {
                    ((oh) objArr3[i8]).a();
                }
            }
        }
        if (z) {
            h = ud0.h();
            Object[] objArr4 = h.d;
            int i9 = h.f;
            for (int i10 = 0; i10 < i9; i10++) {
                ((oh) objArr4[i10]).b();
            }
            try {
                w60 w60Var2 = xlVar.e;
                t7 t7Var2 = as0.a;
                gz gzVar3 = (gz) t7Var2.o();
                if (gzVar3 == null) {
                    gzVar3 = new gz();
                    t7Var2.x(gzVar3);
                }
                int i11 = gzVar3.a;
                Object[] objArr5 = w60Var2.b;
                int[] iArr = w60Var2.c;
                long[] jArr = w60Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    while (true) {
                        long j = jArr[i12];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8;
                            int i14 = 8 - ((~(i12 - length)) >>> 31);
                            int i15 = 0;
                            while (i15 < i14) {
                                if ((j & 255) < 128) {
                                    int i16 = (i12 << 3) + i15;
                                    ht0 ht0Var = (ht0) objArr5[i16];
                                    i = i13;
                                    gzVar3.a = i11 + iArr[i16];
                                    mu e = or0Var.e();
                                    if (e != null) {
                                        e.c(ht0Var);
                                    }
                                } else {
                                    i = i13;
                                }
                                j >>= i;
                                i15++;
                                i13 = i;
                            }
                            if (i14 != i13) {
                                break;
                            }
                        }
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                    }
                }
                gzVar3.a = i11;
                Object[] objArr6 = h.d;
                int i17 = h.f;
                for (int i18 = 0; i18 < i17; i18++) {
                    ((oh) objArr6[i18]).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return xlVar;
    }

    @Override // defpackage.bt0
    public final Object getValue() {
        mu e = ur0.k().e();
        if (e != null) {
            e.c(this);
        }
        or0 k = ur0.k();
        return g((xl) ur0.j(this.f, k), k, true, this.e).f;
    }

    public final xl h() {
        or0 k = ur0.k();
        return g((xl) ur0.j(this.f, k), k, false, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        xl xlVar = (xl) ur0.i(this.f);
        sb.append(xlVar.c(this, ur0.k()) ? String.valueOf(xlVar.f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
