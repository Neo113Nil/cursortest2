package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class f40 extends yf0 implements g60, sl {
    public c40 i;
    public mu j;
    public ag0 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final g40 o = new g40(0, this);
    public km0 p;
    public a70 q;

    public static void e0(ea0 ea0Var) {
        q10 q10Var;
        ea0 ea0Var2 = ea0Var.s;
        p10 p10Var = ea0Var.r;
        if (!nz.l(ea0Var2 != null ? ea0Var2.r : null, p10Var)) {
            p10Var.G.o.z.f();
            return;
        }
        g2 m = p10Var.G.o.m();
        if (m == null || (q10Var = ((f50) m).z) == null) {
            return;
        }
        q10Var.f();
    }

    @Override // defpackage.sl
    public final /* synthetic */ long G(long j) {
        return y6.g(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ float I(long j) {
        return y6.f(j, this);
    }

    @Override // defpackage.sl
    public final long P(float f) {
        return y6.h(f / a(), this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q(p10 p10Var, nw nwVar) {
        char c;
        long j;
        long j2;
        long j3;
        a70 a70Var;
        a70 a70Var2;
        Object g;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        a70 a70Var3 = this.q;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (a70Var3 != null) {
            Object[] objArr = a70Var3.c;
            long[] jArr3 = a70Var3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                b70 b70Var = (b70) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = b70Var.b;
                                long[] jArr4 = b70Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    p10 p10Var2 = (p10) ((w01) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (p10Var2 != null) {
                                                        boolean B = p10Var2.B();
                                                        i4 = i8;
                                                        if (B) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    b70Var.l(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
                a70Var = this.q;
                if (a70Var != null) {
                    long[] jArr5 = a70Var.a;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i15 = 0;
                        while (true) {
                            long j11 = jArr5[i15];
                            if ((((~j11) << c) & j11 & j) != j) {
                                int i16 = 8 - ((~(i15 - length3)) >>> 31);
                                for (int i17 = 0; i17 < i16; i17++) {
                                    if ((j11 & j2) < j3) {
                                        int i18 = (i15 << 3) + i17;
                                        if (((b70) a70Var.c[i18]).g()) {
                                            a70Var.l(i18);
                                        }
                                    }
                                    j11 >>= 8;
                                }
                                if (i16 != 8) {
                                    break;
                                }
                            }
                            if (i15 == length3) {
                                break;
                            } else {
                                i15++;
                            }
                        }
                    }
                }
                a70Var2 = this.q;
                if (a70Var2 == null) {
                    a70Var2 = new a70();
                    this.q = a70Var2;
                }
                g = a70Var2.g(nwVar);
                if (g == null) {
                    g = new b70();
                    a70Var2.m(nwVar, g);
                }
                ((b70) g).j(new w01(p10Var));
            }
        }
        c = 7;
        j = -9187201950435737472L;
        j2 = 255;
        j3 = 128;
        a70Var = this.q;
        if (a70Var != null) {
        }
        a70Var2 = this.q;
        if (a70Var2 == null) {
        }
        g = a70Var2.g(nwVar);
        if (g == null) {
        }
        ((b70) g).j(new w01(p10Var));
    }

    public abstract int R(lw lwVar);

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(ag0 ag0Var, long j, long j2) {
        char c;
        long j3;
        long j4;
        long j5;
        p10 p10Var;
        int i;
        char c2;
        long j6;
        f40 b0;
        fd0 snapshotObserver;
        a70 a70Var = this.q;
        km0 km0Var = this.p;
        if (km0Var == null) {
            km0Var = new km0();
            this.p = km0Var;
        }
        km0 km0Var2 = km0Var;
        dd0 dd0Var = Z().p;
        if (dd0Var != null && (snapshotObserver = ((f3) dd0Var).getSnapshotObserver()) != null) {
            snapshotObserver.a(ag0Var, o1.E, new d40(this, j, j2, ag0Var));
        }
        boolean f0 = f0();
        b70 b70Var = km0Var2.e;
        b70 b70Var2 = km0Var2.f;
        int i2 = km0Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = km0Var2.d[i3];
            if (b == 3) {
                nw nwVar = km0Var2.b[i3];
                nwVar.getClass();
                b70Var2.j(nwVar);
            } else if (b != 0 && a70Var != null) {
                nw nwVar2 = km0Var2.b[i3];
                nwVar2.getClass();
                b70 b70Var3 = (b70) a70Var.k(nwVar2);
                if (b70Var3 != null) {
                    b70Var.i(b70Var3);
                }
            }
        }
        int i4 = km0Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = km0Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                nw[] nwVarArr = km0Var2.b;
                nwVarArr[i6 - i5] = nwVarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = km0Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            km0Var2.b[i8] = null;
        }
        km0Var2.a -= i5;
        f40 b02 = b0();
        Object[] objArr = b70Var2.b;
        long[] jArr = b70Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            nw nwVar3 = (nw) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            f40 f40Var = b02 == null ? this : b02;
                            i = i9;
                            f40 f40Var2 = f40Var;
                            while (true) {
                                km0 km0Var3 = f40Var2.p;
                                if ((km0Var3 == null || p8.b0(km0Var3.b, nwVar3) < 0) && (b0 = f40Var2.b0()) != null) {
                                    f40Var2 = b0;
                                }
                            }
                            a70 a70Var2 = f40Var2.q;
                            b70 b70Var4 = a70Var2 != null ? (b70) a70Var2.k(nwVar3) : null;
                            if (b70Var4 != null) {
                                f40Var.i0(b70Var4);
                            }
                        } else {
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                    }
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                i9 = 8;
            }
        } else {
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        b70Var2.b();
        Object[] objArr2 = b70Var.b;
        long[] jArr2 = b70Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (p10Var = (p10) ((w01) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (f0) {
                                p10Var.J(false);
                            } else {
                                p10Var.L(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        b70Var.b();
    }

    public final void T(e40 e40Var) {
        long j;
        long j2;
        a70 a70Var = this.q;
        if (this.n) {
            return;
        }
        mu c = e40Var.c();
        if (c != null) {
            boolean z = this.j != c;
            if (z || !d0().d) {
                j = 0;
                j2 = 9223372034707292159L;
            } else {
                b10 X = X();
                long c0 = nz.c0(X.b(0L));
                long A = X.A();
                j2 = c0;
                j = A;
                z = (bz.a(c0, d0().e) && iz.a(A, d0().f)) ? false : true;
            }
            if (z) {
                ag0 ag0Var = this.k;
                if (ag0Var != null) {
                    ag0Var.d = e40Var;
                } else {
                    ag0Var = new ag0(e40Var, this);
                    this.k = ag0Var;
                }
                S(ag0Var, j2, j);
                this.j = e40Var.c();
                return;
            }
            return;
        }
        if (a70Var != null) {
            Object[] objArr = a70Var.c;
            long[] jArr = a70Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j3 = jArr[i];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j3) < 128) {
                                i0((b70) objArr[(i << 3) + i3]);
                            }
                            j3 >>= 8;
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
            a70Var.a();
        }
    }

    public final int V(lw lwVar) {
        int R;
        if (Y() && (R = R(lwVar)) != Integer.MIN_VALUE) {
            return R + ((int) (this.h & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract f40 W();

    public abstract b10 X();

    public abstract boolean Y();

    public abstract p10 Z();

    public abstract e40 a0();

    public abstract f40 b0();

    public abstract long c0();

    public final c40 d0() {
        c40 c40Var = this.i;
        if (c40Var != null) {
            return c40Var;
        }
        c40 c40Var2 = new c40(this);
        this.i = c40Var2;
        return c40Var2;
    }

    public boolean f0() {
        return false;
    }

    public final e40 g0(int i, int i2, Map map, y3 y3Var, mu muVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            cy.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new e40(i, i2, map, y3Var, muVar, this);
    }

    public abstract c10 getLayoutDirection();

    public final e40 h0(int i, int i2, Map map, mu muVar) {
        return g0(i, i2, map, null, muVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(b70 b70Var) {
        p10 p10Var;
        Object[] objArr = b70Var.b;
        long[] jArr = b70Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (p10Var = (p10) ((w01) objArr[(i << 3) + i3]).get()) != null) {
                        if (f0()) {
                            p10Var.J(false);
                        } else {
                            p10Var.L(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.g60
    public final void j(boolean z) {
        f40 b0 = b0();
        p10 Z = b0 != null ? b0.Z() : null;
        if (nz.l(Z, Z())) {
            this.l = z;
            return;
        }
        if ((Z != null ? Z.G.c : null) != m10.f) {
            if ((Z != null ? Z.G.c : null) != m10.g) {
                return;
            }
        }
        this.l = z;
    }

    public abstract void j0();

    @Override // defpackage.sl
    public final float o(float f) {
        return a() * f;
    }

    @Override // defpackage.sl
    public final /* synthetic */ float t(long j) {
        return y6.e(j, this);
    }

    @Override // defpackage.sl
    public final /* synthetic */ int y(float f) {
        return y6.c(f, this);
    }
}
