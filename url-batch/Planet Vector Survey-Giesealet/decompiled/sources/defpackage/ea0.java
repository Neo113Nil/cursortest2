package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import android.view.ViewParent;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class ea0 extends f40 implements b50, b10, ed0 {
    public static final wk0 M;
    public static final y00 N;
    public static final y7 O;
    public static final y7 P;
    public e40 A;
    public w60 B;
    public float D;
    public z60 E;
    public y00 F;
    public nv G;
    public kc H;
    public w3 I;
    public boolean K;
    public cd0 L;
    public final p10 r;
    public ea0 s;
    public ea0 t;
    public boolean u;
    public boolean v;
    public mu w;
    public sl x;
    public c10 y;
    public float z = 0.8f;
    public long C = 0;
    public final da0 J = new da0(this, 1);

    static {
        wk0 wk0Var = new wk0();
        wk0Var.e = 1.0f;
        wk0Var.f = 1.0f;
        wk0Var.g = 1.0f;
        long j = qv.a;
        wk0Var.i = j;
        wk0Var.j = j;
        wk0Var.k = 8.0f;
        wk0Var.l = uw0.b;
        wk0Var.m = px0.f;
        wk0Var.o = 9205357640488583168L;
        wk0Var.p = new tl(1.0f, 1.0f);
        wk0Var.q = c10.d;
        wk0Var.r = 3;
        M = wk0Var;
        N = new y00();
        O = new y7(26);
        P = new y7(27);
    }

    public ea0(p10 p10Var) {
        this.r = p10Var;
        this.x = p10Var.y;
        this.y = p10Var.z;
    }

    @Override // defpackage.b10
    public final long A() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        if (defpackage.d31.m(r18.a(), defpackage.mz.j(r2, r7, false)) > 0) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(y7 y7Var, long j, kw kwVar, int i, boolean z) {
        boolean z2;
        boolean z3;
        t50 w0 = w0(y7Var.i());
        if (!U0(j)) {
            if (i == 1) {
                float n0 = n0(j, u0());
                if ((Float.floatToRawIntBits(n0) & Integer.MAX_VALUE) < 2139095040) {
                    if (kwVar.f != kwVar.d.b - 1) {
                        if (d31.m(kwVar.a(), mz.j(n0, false, false)) <= 0) {
                            return;
                        }
                    }
                    z0(w0, y7Var, j, kwVar, i, false, n0);
                    return;
                }
                return;
            }
            return;
        }
        if (w0 == null) {
            B0(y7Var, j, kwVar, i, z);
            return;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < H() && intBitsToFloat2 < E()) {
            y0(w0, y7Var, j, kwVar, i, z);
            return;
        }
        float n02 = i == 1 ? n0(j, u0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(n02) & Integer.MAX_VALUE) < 2139095040) {
            if (kwVar.f == kwVar.d.b - 1) {
                z2 = z;
            } else {
                z2 = z;
            }
            z3 = true;
            K0(w0, y7Var, j, kwVar, i, z2, n02, z3);
        }
        z2 = z;
        z3 = false;
        K0(w0, y7Var, j, kwVar, i, z2, n02, z3);
    }

    public void B0(y7 y7Var, long j, kw kwVar, int i, boolean z) {
        ea0 ea0Var = this.s;
        if (ea0Var != null) {
            ea0Var.A0(y7Var, ea0Var.s0(j), kwVar, i, z);
        }
    }

    public final void C0() {
        cd0 cd0Var = this.L;
        if (cd0Var != null) {
            ((pv) cd0Var).c();
            return;
        }
        ea0 ea0Var = this.t;
        if (ea0Var != null) {
            ea0Var.C0();
        }
    }

    public final boolean D0() {
        if (this.L != null && this.z <= 0.0f) {
            return true;
        }
        ea0 ea0Var = this.t;
        if (ea0Var != null) {
            return ea0Var.D0();
        }
        return false;
    }

    public final long E0(b10 b10Var, long j) {
        ea0 ea0Var;
        boolean z = b10Var instanceof i40;
        if (z) {
            i40 i40Var = (i40) b10Var;
            i40Var.d.r.G0();
            return i40Var.c(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        i40 i40Var2 = z ? (i40) b10Var : null;
        if (i40Var2 == null || (ea0Var = i40Var2.d.r) == null) {
            b10Var.getClass();
            ea0Var = (ea0) b10Var;
        }
        ea0Var.G0();
        ea0 r0 = r0(ea0Var);
        while (ea0Var != r0) {
            j = ea0Var.Q0(j);
            ea0Var = ea0Var.t;
            ea0Var.getClass();
        }
        return l0(r0, j);
    }

    public final long F0(long j) {
        if (!v0().q) {
            cy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        G0();
        while (this != null) {
            j = this.Q0(j);
            this = this.t;
        }
        return j;
    }

    public final void G0() {
        this.r.G.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [t50] */
    /* JADX WARN: Type inference failed for: r7v7, types: [t50] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [l70] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void H0() {
        t50 t50Var;
        boolean g = fa0.g(128);
        t50 x0 = x0(g);
        if (x0 == null || (x0.d.g & 128) == 0) {
            return;
        }
        or0 or0Var = (or0) ur0.b.o();
        mu e = or0Var != null ? or0Var.e() : null;
        or0 g2 = yc0.g(or0Var);
        try {
            if (g) {
                t50Var = v0();
            } else {
                t50Var = v0().h;
                if (t50Var == null) {
                }
            }
            for (t50 x02 = x0(g); x02 != null; x02 = x02.i) {
                if ((x02.g & 128) == 0) {
                    break;
                }
                if ((x02.f & 128) != 0) {
                    ol olVar = x02;
                    ?? r8 = 0;
                    while (olVar != 0) {
                        if (olVar instanceof z00) {
                            ((z00) olVar).m(this.f);
                        } else if ((olVar.f & 128) != 0 && (olVar instanceof ol)) {
                            t50 t50Var2 = olVar.s;
                            int i = 0;
                            olVar = olVar;
                            r8 = r8;
                            while (t50Var2 != null) {
                                if ((t50Var2.f & 128) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        olVar = t50Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new l70(new t50[16]);
                                        }
                                        if (olVar != 0) {
                                            r8.b(olVar);
                                            olVar = 0;
                                        }
                                        r8.b(t50Var2);
                                    }
                                }
                                t50Var2 = t50Var2.i;
                                olVar = olVar;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        olVar = nz.j(r8);
                    }
                }
                if (x02 == t50Var) {
                    break;
                }
            }
        } finally {
            yc0.l(or0Var, g2, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void I0() {
        boolean g = fa0.g(128);
        t50 v0 = v0();
        if (!g && (v0 = v0.h) == null) {
            return;
        }
        for (t50 x0 = x0(g); x0 != null && (x0.g & 128) != 0; x0 = x0.i) {
            if ((x0.f & 128) != 0) {
                ol olVar = x0;
                ?? r5 = 0;
                while (olVar != 0) {
                    if (olVar instanceof z00) {
                        ((z00) olVar).i(this);
                    } else if ((olVar.f & 128) != 0 && (olVar instanceof ol)) {
                        t50 t50Var = olVar.s;
                        int i = 0;
                        olVar = olVar;
                        r5 = r5;
                        while (t50Var != null) {
                            if ((t50Var.f & 128) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    olVar = t50Var;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new l70(new t50[16]);
                                    }
                                    if (olVar != 0) {
                                        r5.b(olVar);
                                        olVar = 0;
                                    }
                                    r5.b(t50Var);
                                }
                            }
                            t50Var = t50Var.i;
                            olVar = olVar;
                            r5 = r5;
                        }
                        if (i == 1) {
                        }
                    }
                    olVar = nz.j(r5);
                }
            }
            if (x0 == v0) {
                return;
            }
        }
    }

    public final void J0() {
        this.u = true;
        this.J.a();
        O0();
        if (bz.a(this.C, 0L)) {
            return;
        }
        this.r.F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [t50] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r8v23 */
    public final void K0(t50 t50Var, y7 y7Var, long j, kw kwVar, int i, boolean z, float f, boolean z2) {
        t50 j2;
        boolean z3;
        int i2;
        if (t50Var == null) {
            B0(y7Var, j, kwVar, i, z);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ol olVar = t50Var;
            l70 l70Var = null;
            while (true) {
                if (olVar == 0) {
                    break;
                }
                if (olVar instanceof zg0) {
                    long l = ((zg0) olVar).l();
                    int i4 = (int) (j >> 32);
                    float intBitsToFloat = Float.intBitsToFloat(i4);
                    p10 p10Var = this.r;
                    c10 c10Var = p10Var.z;
                    long j3 = l & Long.MIN_VALUE;
                    c10 c10Var2 = c10.d;
                    if (intBitsToFloat >= (-((j3 == 0 || c10Var == c10Var2) ? pg0.g(l, 0) : pg0.g(l, 2)))) {
                        if (Float.intBitsToFloat(i4) < H() + ((j3 == 0 || p10Var.z == c10Var2) ? pg0.g(l, 2) : pg0.g(l, 0))) {
                            int i5 = (int) (j & 4294967295L);
                            if (Float.intBitsToFloat(i5) >= (-pg0.g(l, 1))) {
                                if (Float.intBitsToFloat(i5) < pg0.g(l, 3) + E()) {
                                    s60 s60Var = kwVar.e;
                                    x60 x60Var = kwVar.d;
                                    int i6 = kwVar.f;
                                    int i7 = x60Var.b;
                                    if (i6 == i7 - 1) {
                                        kwVar.b(i6 + 1, i7);
                                        kwVar.f++;
                                        x60Var.a(t50Var);
                                        s60Var.a(mz.j(0.0f, z, true));
                                        K0(x40.n(t50Var, y7Var.i()), y7Var, j, kwVar, i3, z, f, z2);
                                        kwVar.f = i6;
                                        return;
                                    }
                                    long a = kwVar.a();
                                    int i8 = kwVar.f;
                                    if (!d31.C(a)) {
                                        if (d31.t(a) > 0.0f) {
                                            int i9 = kwVar.f;
                                            kwVar.b(i9 + 1, x60Var.b);
                                            kwVar.f++;
                                            x60Var.a(t50Var);
                                            s60Var.a(mz.j(0.0f, z, true));
                                            K0(x40.n(t50Var, y7Var.i()), y7Var, j, kwVar, i, z, f, z2);
                                            kwVar.f = i9;
                                            return;
                                        }
                                        return;
                                    }
                                    int i10 = x60Var.b;
                                    int i11 = i10 - 1;
                                    kwVar.f = i11;
                                    kwVar.b(i10, x60Var.b);
                                    kwVar.f++;
                                    x60Var.a(t50Var);
                                    s60Var.a(mz.j(0.0f, z, true));
                                    K0(x40.n(t50Var, y7Var.i()), y7Var, j, kwVar, i, z, f, z2);
                                    kwVar.f = i11;
                                    if (d31.t(kwVar.a()) < 0.0f) {
                                        kwVar.b(i8 + 1, kwVar.f + 1);
                                    }
                                    kwVar.f = i8;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    int i12 = 16;
                    if ((olVar.f & 16) != 0 && (olVar instanceof ol)) {
                        t50 t50Var2 = olVar.s;
                        int i13 = 0;
                        j2 = olVar;
                        l70Var = l70Var;
                        while (t50Var2 != null) {
                            if ((t50Var2.f & 16) != 0) {
                                i13++;
                                l70Var = l70Var;
                                if (i13 == 1) {
                                    j2 = t50Var2;
                                } else {
                                    if (l70Var == null) {
                                        l70Var = new l70(new t50[i12]);
                                    }
                                    if (j2 != null) {
                                        l70Var.b(j2);
                                        j2 = null;
                                    }
                                    l70Var.b(t50Var2);
                                }
                            }
                            t50Var2 = t50Var2.i;
                            i12 = 16;
                            j2 = j2;
                            l70Var = l70Var;
                        }
                        if (i13 == 1) {
                            i3 = i;
                            olVar = j2;
                            l70Var = l70Var;
                        }
                    }
                    j2 = nz.j(l70Var);
                    i3 = i;
                    olVar = j2;
                    l70Var = l70Var;
                }
            }
        }
        if (z2) {
            z0(t50Var, y7Var, j, kwVar, i, z, f);
            return;
        }
        switch (y7Var.d) {
            case 26:
                ol olVar2 = t50Var;
                ?? r6 = 0;
                while (olVar2 != 0) {
                    if (olVar2 instanceof zg0) {
                        if (((zg0) olVar2).S()) {
                            z3 = true;
                            break;
                        }
                    } else if ((olVar2.f & 16) != 0 && (olVar2 instanceof ol)) {
                        t50 t50Var3 = olVar2.s;
                        int i14 = 0;
                        olVar2 = olVar2;
                        r6 = r6;
                        while (t50Var3 != null) {
                            if ((t50Var3.f & 16) != 0) {
                                i14++;
                                r6 = r6;
                                if (i14 == 1) {
                                    olVar2 = t50Var3;
                                } else {
                                    if (r6 == 0) {
                                        r6 = new l70(new t50[16]);
                                    }
                                    if (olVar2 != 0) {
                                        r6.b(olVar2);
                                        olVar2 = 0;
                                    }
                                    r6.b(t50Var3);
                                }
                            }
                            t50Var3 = t50Var3.i;
                            olVar2 = olVar2;
                            r6 = r6;
                        }
                        if (i14 == 1) {
                        }
                    }
                    olVar2 = nz.j(r6);
                }
                break;
            default:
                z3 = false;
                break;
        }
        if (!z3) {
            K0(x40.n(t50Var, y7Var.i()), y7Var, j, kwVar, i, z, f, false);
            return;
        }
        s60 s60Var2 = kwVar.e;
        x60 x60Var2 = kwVar.d;
        int i15 = kwVar.f;
        int i16 = x60Var2.b;
        if (i15 != i16 - 1) {
            long a2 = kwVar.a();
            int i17 = kwVar.f;
            int i18 = x60Var2.b;
            int i19 = i18 - 1;
            kwVar.f = i19;
            kwVar.b(i18, x60Var2.b);
            kwVar.f++;
            x60Var2.a(t50Var);
            s60Var2.a(mz.j(f, z, false));
            K0(x40.n(t50Var, y7Var.i()), y7Var, j, kwVar, i, z, f, false);
            kwVar.f = i19;
            long a3 = kwVar.a();
            if (kwVar.f + 1 >= x60Var2.b - 1 || d31.m(a2, a3) <= 0) {
                kwVar.b(kwVar.f + 1, x60Var2.b);
            } else {
                int i20 = i17 + 1;
                boolean C = d31.C(a3);
                int i21 = kwVar.f;
                kwVar.b(i20, C ? i21 + 2 : i21 + 1);
            }
            kwVar.f = i17;
            return;
        }
        int i22 = i15 + 1;
        kwVar.b(i22, i16);
        kwVar.f++;
        x60Var2.a(t50Var);
        s60Var2.a(mz.j(f, z, false));
        K0(x40.n(t50Var, y7Var.i()), y7Var, j, kwVar, i, z, f, false);
        kwVar.f = i15;
        if (i22 == x60Var2.b - 1 || d31.C(kwVar.a())) {
            int i23 = kwVar.f;
            int i24 = i23 + 1;
            x60Var2.j(i24);
            if (i24 < 0 || i24 >= (i2 = s60Var2.b)) {
                g8.m("Index must be between 0 and size");
                return;
            }
            long[] jArr = s60Var2.a;
            long j4 = jArr[i24];
            if (i24 != i2 - 1) {
                p8.S(jArr, jArr, i24, i23 + 2, i2);
            }
            s60Var2.b--;
        }
    }

    public abstract void L0(kc kcVar, nv nvVar);

    public final void M0(long j, float f, mu muVar) {
        S0(muVar, false);
        boolean a = bz.a(this.C, j);
        p10 p10Var = this.r;
        if (!a) {
            ((f3) mz.Q(p10Var)).J(-4.0f);
            this.C = j;
            p10Var.G.o.S();
            cd0 cd0Var = this.L;
            if (cd0Var != null) {
                ((pv) cd0Var).d(j);
            } else {
                ea0 ea0Var = this.t;
                if (ea0Var != null) {
                    ea0Var.C0();
                }
            }
            p10Var.F();
            f40.e0(this);
            dd0 dd0Var = p10Var.p;
            if (dd0Var != null) {
                ((f3) dd0Var).x(p10Var);
            }
        }
        this.D = f;
        if (!this.n) {
            T(a0());
        }
        if (this == ((ea0) p10Var.F.h)) {
            ((f3) mz.Q(p10Var)).getRectManager().g(p10Var, !p10Var.G.o.n);
        }
    }

    public final void N0(z60 z60Var, boolean z, boolean z2) {
        cd0 cd0Var = this.L;
        if (cd0Var != null) {
            if (this.v) {
                if (z2) {
                    long u0 = u0();
                    float intBitsToFloat = Float.intBitsToFloat((int) (u0 >> 32)) / 2.0f;
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (u0 & 4294967295L)) / 2.0f;
                    long j = this.f;
                    z60Var.a(-intBitsToFloat, -intBitsToFloat2, ((int) (j >> 32)) + intBitsToFloat, ((int) (j & 4294967295L)) + intBitsToFloat2);
                } else if (z) {
                    long j2 = this.f;
                    z60Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (z60Var.b()) {
                    return;
                }
            }
            pv pvVar = (pv) cd0Var;
            float[] b = pvVar.b();
            if (!pvVar.v) {
                if (b == null) {
                    z60Var.a = 0.0f;
                    z60Var.b = 0.0f;
                    z60Var.c = 0.0f;
                    z60Var.d = 0.0f;
                } else {
                    mz.J(b, z60Var);
                }
            }
        }
        long j3 = this.C;
        float f = (int) (j3 >> 32);
        z60Var.a += f;
        z60Var.c += f;
        float f2 = (int) (j3 & 4294967295L);
        z60Var.b += f2;
        z60Var.d += f2;
    }

    public final void O0() {
        if (this.L != null) {
            S0(null, false);
            this.r.L(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [t50] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [l70] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [l70] */
    public final void P0(e40 e40Var) {
        ea0 ea0Var;
        e40 e40Var2 = this.A;
        if (e40Var != e40Var2) {
            this.A = e40Var;
            p10 p10Var = this.r;
            int i = 0;
            if (e40Var2 == null || e40Var.d() != e40Var2.d() || e40Var.b() != e40Var2.b()) {
                int d = e40Var.d();
                int b = e40Var.b();
                cd0 cd0Var = this.L;
                if (cd0Var != null) {
                    ((pv) cd0Var).e((d << 32) | (b & 4294967295L));
                } else if (p10Var.C() && (ea0Var = this.t) != null) {
                    ea0Var.C0();
                }
                N((b & 4294967295L) | (d << 32));
                if (this.w != null) {
                    T0(false);
                }
                boolean g = fa0.g(4);
                t50 v0 = v0();
                if (g || (v0 = v0.h) != null) {
                    for (t50 x0 = x0(g); x0 != null && (x0.g & 4) != 0; x0 = x0.i) {
                        if ((x0.f & 4) != 0) {
                            ol olVar = x0;
                            ?? r9 = 0;
                            while (olVar != 0) {
                                if (olVar instanceof no) {
                                    ((no) olVar).R();
                                } else if ((olVar.f & 4) != 0 && (olVar instanceof ol)) {
                                    t50 t50Var = olVar.s;
                                    int i2 = 0;
                                    olVar = olVar;
                                    r9 = r9;
                                    while (t50Var != null) {
                                        if ((t50Var.f & 4) != 0) {
                                            i2++;
                                            r9 = r9;
                                            if (i2 == 1) {
                                                olVar = t50Var;
                                            } else {
                                                if (r9 == 0) {
                                                    r9 = new l70(new t50[16]);
                                                }
                                                if (olVar != 0) {
                                                    r9.b(olVar);
                                                    olVar = 0;
                                                }
                                                r9.b(t50Var);
                                            }
                                        }
                                        t50Var = t50Var.i;
                                        olVar = olVar;
                                        r9 = r9;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                olVar = nz.j(r9);
                            }
                        }
                        if (x0 == v0) {
                            break;
                        }
                    }
                }
                dd0 dd0Var = p10Var.p;
                if (dd0Var != null) {
                    ((f3) dd0Var).x(p10Var);
                }
            }
            w60 w60Var = this.B;
            if ((w60Var == null || w60Var.e == 0) && e40Var.a().isEmpty()) {
                return;
            }
            w60 w60Var2 = this.B;
            Map a = e40Var.a();
            if (w60Var2 != null && w60Var2.e == a.size()) {
                Object[] objArr = w60Var2.b;
                int[] iArr = w60Var2.c;
                long[] jArr = w60Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) a.get((lw) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            p10Var.G.o.z.f();
            w60 w60Var3 = this.B;
            if (w60Var3 == null) {
                w60 w60Var4 = ma0.a;
                w60Var3 = new w60();
                this.B = w60Var3;
            }
            w60Var3.a();
            for (Map.Entry entry : e40Var.a().entrySet()) {
                w60Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final long Q0(long j) {
        cd0 cd0Var = this.L;
        if (cd0Var != null) {
            pv pvVar = (pv) cd0Var;
            float[] b = pvVar.b();
            if (!pvVar.v) {
                j = mz.I(b, j);
            }
        }
        long j2 = this.C;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final zi0 R0() {
        if (v0().q) {
            b10 C = mz.C(this);
            z60 z60Var = this.E;
            if (z60Var == null) {
                z60Var = new z60();
                this.E = z60Var;
            }
            long m0 = m0(u0());
            int i = (int) (m0 >> 32);
            z60Var.a = -Float.intBitsToFloat(i);
            int i2 = (int) (m0 & 4294967295L);
            z60Var.b = -Float.intBitsToFloat(i2);
            z60Var.c = Float.intBitsToFloat(i) + H();
            z60Var.d = Float.intBitsToFloat(i2) + E();
            while (this != C) {
                this.N0(z60Var, false, true);
                if (!z60Var.b()) {
                    this = this.t;
                    this.getClass();
                }
            }
            return new zi0(z60Var.a, z60Var.b, z60Var.c, z60Var.d);
        }
        return zi0.e;
    }

    public final void S0(mu muVar, boolean z) {
        dd0 dd0Var;
        l70 l70Var;
        Reference poll;
        w3 w3Var;
        l70 l70Var2;
        Reference poll2;
        Object obj;
        int i = 0;
        p10 p10Var = this.r;
        boolean z2 = (!z && this.w == muVar && nz.l(this.x, p10Var.y) && this.y == p10Var.z) ? false : true;
        this.x = p10Var.y;
        this.y = p10Var.z;
        boolean B = p10Var.B();
        da0 da0Var = this.J;
        if (!B || muVar == null) {
            this.w = null;
            cd0 cd0Var = this.L;
            if (cd0Var != null) {
                pv pvVar = (pv) cd0Var;
                if (!nz.J(pvVar.b())) {
                    p10Var.F();
                }
                pvVar.g = null;
                pvVar.h = null;
                pvVar.j = true;
                pvVar.f(false);
                mv mvVar = pvVar.e;
                if (mvVar != null) {
                    mvVar.a(pvVar.d);
                    f3 f3Var = pvVar.f;
                    j3 j3Var = f3Var.v0;
                    do {
                        ReferenceQueue referenceQueue = (ReferenceQueue) j3Var.f;
                        l70Var = (l70) j3Var.e;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            l70Var.i(poll);
                        }
                    } while (poll != null);
                    l70Var.b(new WeakReference(pvVar, (ReferenceQueue) j3Var.f));
                    f3Var.A.remove(pvVar);
                }
                p10Var.I = true;
                da0Var.a();
                if (v0().q && p10Var.C() && (dd0Var = p10Var.p) != null) {
                    ((f3) dd0Var).x(p10Var);
                }
            }
            this.L = null;
            this.K = false;
            return;
        }
        this.w = muVar;
        if (this.L != null) {
            if (z2 && T0(true)) {
                p10Var.F();
                ((f3) mz.Q(p10Var)).getRectManager().f(p10Var);
                return;
            }
            return;
        }
        dd0 Q = mz.Q(p10Var);
        w3 w3Var2 = this.I;
        if (w3Var2 == null) {
            w3 w3Var3 = new w3(9, this, new da0(this, i));
            this.I = w3Var3;
            w3Var = w3Var3;
        } else {
            w3Var = w3Var2;
        }
        f3 f3Var2 = (f3) Q;
        j3 j3Var2 = f3Var2.v0;
        do {
            ReferenceQueue referenceQueue2 = (ReferenceQueue) j3Var2.f;
            l70Var2 = (l70) j3Var2.e;
            poll2 = referenceQueue2.poll();
            if (poll2 != null) {
                l70Var2.i(poll2);
            }
        } while (poll2 != null);
        while (true) {
            int i2 = l70Var2.f;
            if (i2 == 0) {
                obj = null;
                break;
            } else {
                obj = ((Reference) l70Var2.j(i2 - 1)).get();
                if (obj != null) {
                    break;
                }
            }
        }
        cd0 cd0Var2 = (cd0) obj;
        if (cd0Var2 != null) {
            pv pvVar2 = (pv) cd0Var2;
            mv mvVar2 = pvVar2.e;
            if (mvVar2 == null) {
                throw y6.u("currently reuse is only supported when we manage the layer lifecycle");
            }
            if (!pvVar2.d.s) {
                cy.a("layer should have been released before reuse");
            }
            pvVar2.d = mvVar2.b();
            pvVar2.j = false;
            pvVar2.g = w3Var;
            pvVar2.h = da0Var;
            pvVar2.t = false;
            pvVar2.u = false;
            pvVar2.v = true;
            mz.R(pvVar2.k);
            float[] fArr = pvVar2.l;
            if (fArr != null) {
                mz.R(fArr);
            }
            pvVar2.r = uw0.b;
            pvVar2.w = false;
            pvVar2.i = 9223372034707292159L;
            pvVar2.s = null;
            pvVar2.q = 0;
        } else {
            cd0Var2 = new pv(f3Var2.getGraphicsContext().b(), f3Var2.getGraphicsContext(), f3Var2, w3Var, da0Var);
        }
        pv pvVar3 = (pv) cd0Var2;
        pvVar3.e(this.f);
        pvVar3.d(this.C);
        this.L = cd0Var2;
        T0(true);
        p10Var.I = true;
        da0Var.a();
    }

    public final boolean T0(boolean z) {
        long j;
        boolean z2;
        dd0 dd0Var;
        bu buVar;
        bu buVar2;
        cd0 cd0Var = this.L;
        mu muVar = this.w;
        if (cd0Var == null) {
            if (muVar == null) {
                return false;
            }
            cy.b("null layer with a non-null layerBlock");
            return false;
        }
        if (muVar == null) {
            throw y6.u("updateLayerParameters requires a non-null layerBlock");
        }
        wk0 wk0Var = M;
        wk0Var.d(1.0f);
        wk0Var.e(1.0f);
        wk0Var.b(1.0f);
        if (wk0Var.h != 0.0f) {
            wk0Var.d |= 32;
            wk0Var.h = 0.0f;
        }
        long j2 = qv.a;
        if (!ge.c(wk0Var.i, j2)) {
            wk0Var.d |= 64;
            wk0Var.i = j2;
        }
        if (!ge.c(wk0Var.j, j2)) {
            wk0Var.d |= 128;
            wk0Var.j = j2;
        }
        if (wk0Var.k != 8.0f) {
            wk0Var.d |= 2048;
            wk0Var.k = 8.0f;
        }
        long j3 = uw0.b;
        wk0Var.f(j3);
        sd sdVar = px0.f;
        if (!nz.l(wk0Var.m, sdVar)) {
            wk0Var.d |= 8192;
            wk0Var.m = sdVar;
        }
        if (wk0Var.n) {
            wk0Var.d |= 16384;
            wk0Var.n = false;
        }
        if (wk0Var.r != 3) {
            wk0Var.d |= 524288;
            wk0Var.r = 3;
        }
        wk0Var.o = 9205357640488583168L;
        wk0Var.s = null;
        wk0Var.d = 0;
        p10 p10Var = this.r;
        wk0Var.p = p10Var.y;
        wk0Var.q = p10Var.z;
        wk0Var.o = px0.W(this.f);
        ((f3) mz.Q(p10Var)).getSnapshotObserver().a(this, j80.l, new b(15, muVar));
        y00 y00Var = this.F;
        if (y00Var == null) {
            y00Var = new y00();
            this.F = y00Var;
        }
        y00 y00Var2 = N;
        y00Var2.getClass();
        y00Var2.a = y00Var.a;
        y00Var2.b = y00Var.b;
        y00Var2.c = y00Var.c;
        y00Var2.d = y00Var.d;
        float f = wk0Var.e;
        y00Var.a = f;
        y00Var.b = wk0Var.f;
        y00Var.c = wk0Var.k;
        long j4 = wk0Var.l;
        y00Var.d = j4;
        pv pvVar = (pv) cd0Var;
        f3 f3Var = pvVar.f;
        int i = wk0Var.d | pvVar.q;
        pvVar.o = wk0Var.q;
        pvVar.n = wk0Var.p;
        int i2 = i & 4096;
        if (i2 != 0) {
            pvVar.r = j4;
        }
        if ((i & 1) != 0) {
            ov ovVar = pvVar.d.a;
            if (ovVar.d() != f) {
                ovVar.m(f);
            }
        }
        if ((i & 2) != 0) {
            nv nvVar = pvVar.d;
            float f2 = wk0Var.f;
            ov ovVar2 = nvVar.a;
            if (ovVar2.I() != f2) {
                ovVar2.B(f2);
            }
        }
        if ((i & 4) != 0) {
            nv nvVar2 = pvVar.d;
            float f3 = wk0Var.g;
            ov ovVar3 = nvVar2.a;
            if (ovVar3.a() != f3) {
                ovVar3.c(f3);
            }
        }
        if ((i & 8) != 0) {
            ov ovVar4 = pvVar.d.a;
            if (ovVar4.q() != 0.0f) {
                ovVar4.r();
            }
        }
        if ((i & 16) != 0) {
            ov ovVar5 = pvVar.d.a;
            if (ovVar5.f() != 0.0f) {
                ovVar5.g();
            }
        }
        if ((i & 32) != 0) {
            nv nvVar3 = pvVar.d;
            float f4 = wk0Var.h;
            ov ovVar6 = nvVar3.a;
            if (ovVar6.G() != f4) {
                ovVar6.e(f4);
                nvVar3.g = true;
                nvVar3.a();
            }
            if (wk0Var.h > 0.0f && !pvVar.w && (buVar2 = pvVar.h) != null) {
                buVar2.a();
            }
        }
        if ((i & 64) != 0) {
            nv nvVar4 = pvVar.d;
            long j5 = wk0Var.i;
            ov ovVar7 = nvVar4.a;
            if (!ge.c(j5, ovVar7.M())) {
                ovVar7.j(j5);
            }
        }
        if ((i & 128) != 0) {
            nv nvVar5 = pvVar.d;
            long j6 = wk0Var.j;
            ov ovVar8 = nvVar5.a;
            if (!ge.c(j6, ovVar8.i())) {
                ovVar8.A(j6);
            }
        }
        if ((i & 1024) != 0) {
            ov ovVar9 = pvVar.d.a;
            if (ovVar9.J() != 0.0f) {
                ovVar9.z();
            }
        }
        if ((i & 256) != 0) {
            ov ovVar10 = pvVar.d.a;
            if (ovVar10.v() != 0.0f) {
                ovVar10.b();
            }
        }
        if ((i & 512) != 0) {
            ov ovVar11 = pvVar.d.a;
            if (ovVar11.E() != 0.0f) {
                ovVar11.h();
            }
        }
        if ((i & 2048) != 0) {
            nv nvVar6 = pvVar.d;
            float f5 = wk0Var.k;
            ov ovVar12 = nvVar6.a;
            if (ovVar12.o() != f5) {
                ovVar12.F(f5);
            }
        }
        if (i2 != 0) {
            boolean a = uw0.a(pvVar.r, j3);
            nv nvVar7 = pvVar.d;
            if (a) {
                j = 4294967295L;
                if (!ra0.b(nvVar7.v, 9205357640488583168L)) {
                    nvVar7.v = 9205357640488583168L;
                    nvVar7.a.L(9205357640488583168L);
                }
            } else {
                j = 4294967295L;
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (pvVar.r >> 32)) * ((int) (pvVar.i >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (pvVar.r & 4294967295L)) * ((int) (pvVar.i & 4294967295L))) & 4294967295L);
                if (!ra0.b(nvVar7.v, floatToRawIntBits)) {
                    nvVar7.v = floatToRawIntBits;
                    nvVar7.a.L(floatToRawIntBits);
                }
            }
        } else {
            j = 4294967295L;
        }
        if ((i & 16384) != 0) {
            nv nvVar8 = pvVar.d;
            boolean z3 = wk0Var.n;
            if (nvVar8.w != z3) {
                nvVar8.w = z3;
                nvVar8.g = true;
                nvVar8.a();
            }
        }
        if ((131072 & i) != 0) {
            ov ovVar13 = pvVar.d.a;
        }
        if ((262144 & i) != 0) {
            ov ovVar14 = pvVar.d.a;
            if (!nz.l(ovVar14.x(), null)) {
                ovVar14.l();
            }
        }
        if ((i & 524288) != 0) {
            nv nvVar9 = pvVar.d;
            int i3 = wk0Var.r;
            ov ovVar15 = nvVar9.a;
            if (ovVar15.K() != i3) {
                ovVar15.n(i3);
            }
        }
        if ((32768 & i) != 0) {
            ov ovVar16 = pvVar.d.a;
            if (ovVar16.u() != 0) {
                ovVar16.y(0);
            }
        }
        if ((i & 7963) != 0) {
            pvVar.t = true;
            pvVar.u = true;
        }
        if (nz.l(pvVar.s, wk0Var.s)) {
            z2 = false;
        } else {
            xc0 xc0Var = wk0Var.s;
            pvVar.s = xc0Var;
            if (xc0Var != null) {
                nv nvVar10 = pvVar.d;
                if (xc0Var instanceof vc0) {
                    zi0 zi0Var = ((vc0) xc0Var).a;
                    float f6 = zi0Var.a;
                    float f7 = zi0Var.b;
                    nvVar10.f(0.0f, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & j), (Float.floatToRawIntBits(zi0Var.c - f6) << 32) | (Float.floatToRawIntBits(zi0Var.d - f7) & j));
                } else if (xc0Var instanceof uc0) {
                    e5 e5Var = ((uc0) xc0Var).a;
                    nvVar10.k = null;
                    nvVar10.i = 9205357640488583168L;
                    nvVar10.h = 0L;
                    nvVar10.j = 0.0f;
                    nvVar10.g = true;
                    nvVar10.n = false;
                    nvVar10.l = e5Var;
                    nvVar10.a();
                } else {
                    if (!(xc0Var instanceof wc0)) {
                        g8.c();
                        return false;
                    }
                    wc0 wc0Var = (wc0) xc0Var;
                    e5 e5Var2 = wc0Var.b;
                    if (e5Var2 != null) {
                        nvVar10.k = null;
                        nvVar10.i = 9205357640488583168L;
                        nvVar10.h = 0L;
                        nvVar10.j = 0.0f;
                        nvVar10.g = true;
                        nvVar10.n = false;
                        nvVar10.l = e5Var2;
                        nvVar10.a();
                    } else {
                        zl0 zl0Var = wc0Var.a;
                        float f8 = zl0Var.b;
                        float f9 = zl0Var.a;
                        nvVar10.f(Float.intBitsToFloat((int) (zl0Var.h >> 32)), (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f8) & j), (Float.floatToRawIntBits(zl0Var.c - f9) << 32) | (Float.floatToRawIntBits(zl0Var.d - f8) & j));
                    }
                }
                if ((xc0Var instanceof uc0) && Build.VERSION.SDK_INT < 33 && (buVar = pvVar.h) != null) {
                    buVar.a();
                }
            }
            z2 = true;
        }
        pvVar.q = wk0Var.d;
        if (i != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                ViewParent parent = f3Var.getParent();
                if (parent != null) {
                    parent.onDescendantInvalidated(f3Var, f3Var);
                }
            } else {
                f3Var.invalidate();
            }
            if (f3Var.i) {
                f3Var.J(0.0f);
            }
        }
        boolean z4 = this.v;
        this.v = wk0Var.n;
        this.z = wk0Var.g;
        boolean z5 = y00Var2.a == y00Var.a && y00Var2.b == y00Var.b && y00Var2.c == y00Var.c && uw0.a(y00Var2.d, y00Var.d);
        boolean z6 = !z5;
        if (z && ((!z5 || z4 != this.v) && (dd0Var = p10Var.p) != null)) {
            ((f3) dd0Var).x(p10Var);
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U0(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        cd0 cd0Var = this.L;
        if (cd0Var == null || !this.v) {
            return true;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        nv nvVar = ((pv) cd0Var).d;
        if (nvVar.w) {
            xc0 d = nvVar.d();
            if (!(d instanceof vc0)) {
                if (d instanceof wc0) {
                    zl0 zl0Var = ((wc0) d).a;
                    float f = zl0Var.c;
                    float f2 = zl0Var.b;
                    float f3 = zl0Var.d;
                    float f4 = zl0Var.a;
                    long j2 = zl0Var.f;
                    long j3 = zl0Var.h;
                    z = false;
                    z2 = true;
                    long j4 = zl0Var.g;
                    long j5 = zl0Var.e;
                    if (intBitsToFloat >= f4 && intBitsToFloat < f && intBitsToFloat2 >= f2 && intBitsToFloat2 < f3) {
                        int i = (int) (j5 >> 32);
                        float intBitsToFloat3 = Float.intBitsToFloat(i);
                        int i2 = (int) (j2 >> 32);
                        if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= f - f4) {
                            int i3 = (int) (j3 >> 32);
                            float intBitsToFloat4 = Float.intBitsToFloat(i3);
                            int i4 = (int) (j4 >> 32);
                            if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= f - f4) {
                                int i5 = (int) (j5 & 4294967295L);
                                int i6 = (int) (j3 & 4294967295L);
                                if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= f3 - f2) {
                                    int i7 = (int) (j2 & 4294967295L);
                                    int i8 = (int) (j4 & 4294967295L);
                                    if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= f3 - f2) {
                                        float intBitsToFloat5 = Float.intBitsToFloat(i) + f4;
                                        float intBitsToFloat6 = Float.intBitsToFloat(i5) + f2;
                                        float intBitsToFloat7 = f - Float.intBitsToFloat(i2);
                                        float intBitsToFloat8 = Float.intBitsToFloat(i7) + f2;
                                        float intBitsToFloat9 = f - Float.intBitsToFloat(i4);
                                        float intBitsToFloat10 = f3 - Float.intBitsToFloat(i8);
                                        float intBitsToFloat11 = f3 - Float.intBitsToFloat(i6);
                                        float intBitsToFloat12 = Float.intBitsToFloat(i3) + f4;
                                        if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                            z3 = ze0.o(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, zl0Var.e);
                                        } else if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                            z3 = ze0.o(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, zl0Var.h);
                                        } else if (intBitsToFloat <= intBitsToFloat7 || intBitsToFloat2 >= intBitsToFloat8) {
                                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                                z3 = ze0.o(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, zl0Var.g);
                                            }
                                            z3 = z2;
                                        } else {
                                            z3 = ze0.o(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, zl0Var.f);
                                        }
                                    }
                                }
                            }
                        }
                        e5 a = g5.a();
                        y6.j(a, zl0Var);
                        z3 = ze0.n(intBitsToFloat, intBitsToFloat2, a);
                    }
                } else {
                    z = false;
                    z2 = true;
                    if (!(d instanceof uc0)) {
                        g8.c();
                        return false;
                    }
                    z3 = ze0.n(intBitsToFloat, intBitsToFloat2, ((uc0) d).a);
                }
                return z3 ? z2 : z;
            }
            zi0 zi0Var = ((vc0) d).a;
            if (zi0Var.a > intBitsToFloat || intBitsToFloat >= zi0Var.c || zi0Var.b > intBitsToFloat2 || intBitsToFloat2 >= zi0Var.d) {
                z = false;
                z2 = true;
            }
            z3 = z;
            if (z3) {
            }
        }
        z = false;
        z2 = true;
        z3 = z2;
        if (z3) {
        }
    }

    @Override // defpackage.f40
    public final f40 W() {
        return this.s;
    }

    @Override // defpackage.f40
    public final boolean Y() {
        return this.A != null;
    }

    @Override // defpackage.f40
    public final p10 Z() {
        return this.r;
    }

    @Override // defpackage.sl
    public final float a() {
        return this.r.y.a();
    }

    @Override // defpackage.f40
    public final e40 a0() {
        e40 e40Var = this.A;
        if (e40Var != null) {
            return e40Var;
        }
        g8.s("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.b10
    public final long b(long j) {
        if (!v0().q) {
            cy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((f3) mz.Q(this.r)).u(F0(j));
    }

    @Override // defpackage.f40
    public final f40 b0() {
        return this.t;
    }

    @Override // defpackage.f40
    public final long c0() {
        return this.C;
    }

    @Override // defpackage.b10
    public final long e(long j) {
        long F0 = F0(j);
        f3 f3Var = (f3) mz.Q(this.r);
        f3Var.B();
        return mz.I(f3Var.T, F0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [t50] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [t50] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.yf0, defpackage.b50
    public final Object f() {
        p10 p10Var = this.r;
        if (!p10Var.F.h(64)) {
            return null;
        }
        v0();
        Object obj = null;
        for (t50 t50Var = (su0) p10Var.F.i; t50Var != null; t50Var = t50Var.h) {
            if ((t50Var.f & 64) != 0) {
                ol olVar = t50Var;
                ?? r4 = 0;
                while (olVar != 0) {
                    if (olVar instanceof de0) {
                        obj = ((de0) olVar).Q(obj);
                    } else if ((olVar.f & 64) != 0 && (olVar instanceof ol)) {
                        t50 t50Var2 = olVar.s;
                        int i = 0;
                        olVar = olVar;
                        r4 = r4;
                        while (t50Var2 != null) {
                            if ((t50Var2.f & 64) != 0) {
                                i++;
                                r4 = r4;
                                if (i == 1) {
                                    olVar = t50Var2;
                                } else {
                                    if (r4 == 0) {
                                        r4 = new l70(new t50[16]);
                                    }
                                    if (olVar != 0) {
                                        r4.b(olVar);
                                        olVar = 0;
                                    }
                                    r4.b(t50Var2);
                                }
                            }
                            t50Var2 = t50Var2.i;
                            olVar = olVar;
                            r4 = r4;
                        }
                        if (i == 1) {
                        }
                    }
                    olVar = nz.j(r4);
                }
            }
        }
        return obj;
    }

    @Override // defpackage.b10
    public final b10 g() {
        if (!v0().q) {
            cy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        G0();
        return ((ea0) this.r.F.h).t;
    }

    @Override // defpackage.f40
    public final c10 getLayoutDirection() {
        return this.r.z;
    }

    @Override // defpackage.sl
    public final float h() {
        return this.r.y.h();
    }

    @Override // defpackage.f40
    public final void j0() {
        M(this.C, this.D, this.w);
    }

    public final void k0(ea0 ea0Var, z60 z60Var, boolean z) {
        if (ea0Var == this) {
            return;
        }
        ea0 ea0Var2 = this.t;
        if (ea0Var2 != null) {
            ea0Var2.k0(ea0Var, z60Var, z);
        }
        long j = this.C;
        float f = (int) (j >> 32);
        z60Var.a -= f;
        z60Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        z60Var.b -= f2;
        z60Var.d -= f2;
        cd0 cd0Var = this.L;
        if (cd0Var != null) {
            pv pvVar = (pv) cd0Var;
            float[] a = pvVar.a();
            if (!pvVar.v) {
                if (a == null) {
                    z60Var.a = 0.0f;
                    z60Var.b = 0.0f;
                    z60Var.c = 0.0f;
                    z60Var.d = 0.0f;
                } else {
                    mz.J(a, z60Var);
                }
            }
            if (this.v && z) {
                long j2 = this.f;
                z60Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long l0(ea0 ea0Var, long j) {
        if (ea0Var == this) {
            return j;
        }
        ea0 ea0Var2 = this.t;
        return (ea0Var2 == null || nz.l(ea0Var, ea0Var2)) ? s0(j) : s0(ea0Var2.l0(ea0Var, j));
    }

    public final long m0(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - H();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - E();
        float max = Math.max(0.0f, intBitsToFloat / 2.0f);
        float max2 = Math.max(0.0f, intBitsToFloat2 / 2.0f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final float n0(long j, long j2) {
        if (H() >= Float.intBitsToFloat((int) (j2 >> 32)) && E() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long m0 = m0(j2);
        float intBitsToFloat = Float.intBitsToFloat((int) (m0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float max = Math.max(0.0f, intBitsToFloat3 < 0.0f ? -intBitsToFloat3 : intBitsToFloat3 - H());
        long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f ? -r9 : r9 - E())) & 4294967295L);
        if (intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) {
            int i = (int) (floatToRawIntBits >> 32);
            if (Float.intBitsToFloat(i) <= intBitsToFloat) {
                int i2 = (int) (floatToRawIntBits & 4294967295L);
                if (Float.intBitsToFloat(i2) <= intBitsToFloat2) {
                    float intBitsToFloat4 = Float.intBitsToFloat(i);
                    float intBitsToFloat5 = Float.intBitsToFloat(i2);
                    return (intBitsToFloat5 * intBitsToFloat5) + (intBitsToFloat4 * intBitsToFloat4);
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void o0(kc kcVar, nv nvVar) {
        boolean z;
        float f;
        cd0 cd0Var = this.L;
        if (cd0Var == null) {
            long j = this.C;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            kcVar.e(f2, f3);
            p0(kcVar, nvVar);
            kcVar.e(-f2, -f3);
            return;
        }
        pv pvVar = (pv) cd0Var;
        nc ncVar = pvVar.p;
        pvVar.g();
        boolean z2 = false;
        pvVar.w = pvVar.d.a.G() > 0.0f;
        t7 t7Var = ncVar.e;
        t7 t7Var2 = ncVar.e;
        t7Var.y(kcVar);
        t7Var.f = nvVar;
        nv nvVar2 = pvVar.d;
        kc p = t7Var2.p();
        nv nvVar3 = (nv) t7Var2.f;
        ov ovVar = nvVar2.a;
        if (nvVar2.s) {
            return;
        }
        nvVar2.a();
        if (!ovVar.H()) {
            try {
                nvVar2.a.w(nvVar2.b, nvVar2.c, nvVar2, nvVar2.e);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = ovVar.G() > 0.0f;
        if (z3) {
            p.p();
        }
        Canvas a = p2.a(p);
        boolean isHardwareAccelerated = a.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j2 = nvVar2.t;
            float f4 = (int) (j2 >> 32);
            float f5 = (int) (j2 & 4294967295L);
            long j3 = nvVar2.u;
            float f6 = ((int) (j3 >> 32)) + f4;
            float f7 = f5 + ((int) (j3 & 4294967295L));
            float a2 = ovVar.a();
            q9 x = ovVar.x();
            int K = ovVar.K();
            if (a2 < 1.0f || K != 3 || x != null || ovVar.u() == 1) {
                y4 y4Var = nvVar2.p;
                if (y4Var == null) {
                    y4Var = a50.d();
                    nvVar2.p = y4Var;
                }
                y4Var.c(a2);
                y4Var.d(K);
                y4Var.f(x);
                f = f4;
                a.saveLayer(f, f5, f6, f7, y4Var.a);
            } else {
                a.save();
                f = f4;
            }
            a.translate(f, f5);
            a.concat(ovVar.C());
        }
        boolean z4 = !isHardwareAccelerated && nvVar2.w;
        if (z4) {
            p.i();
            xc0 d = nvVar2.d();
            if (d instanceof vc0) {
                p.l(((vc0) d).a);
            } else if (d instanceof wc0) {
                e5 e5Var = nvVar2.m;
                if (e5Var != null) {
                    e5Var.a.rewind();
                } else {
                    e5Var = g5.a();
                    nvVar2.m = e5Var;
                }
                y6.j(e5Var, ((wc0) d).a);
                p.q(e5Var);
            } else {
                if (!(d instanceof uc0)) {
                    g8.c();
                    return;
                }
                p.q(((uc0) d).a);
            }
        }
        if (nvVar3 != null) {
            w4 w4Var = nvVar3.r;
            if (!w4Var.a) {
                fy.a("Only add dependencies during a tracking");
            }
            b70 b70Var = (b70) w4Var.d;
            if (b70Var != null) {
                b70Var.a(nvVar2);
            } else if (((nv) w4Var.b) != null) {
                int i = wn0.a;
                b70 b70Var2 = new b70();
                nv nvVar4 = (nv) w4Var.b;
                nvVar4.getClass();
                b70Var2.a(nvVar4);
                b70Var2.a(nvVar2);
                w4Var.d = b70Var2;
                w4Var.b = null;
            } else {
                w4Var.b = nvVar2;
            }
            b70 b70Var3 = (b70) w4Var.e;
            if (b70Var3 != null) {
                z2 = !b70Var3.k(nvVar2);
            } else if (((nv) w4Var.c) != nvVar2) {
                z2 = true;
            } else {
                w4Var.c = null;
            }
            if (z2) {
                nvVar2.q++;
            }
        }
        if (((o2) p).a.isHardwareAccelerated()) {
            z = z4;
            ovVar.s(p);
        } else {
            nc ncVar2 = nvVar2.o;
            if (ncVar2 == null) {
                ncVar2 = new nc();
                nvVar2.o = ncVar2;
            }
            t7 t7Var3 = ncVar2.e;
            sl slVar = nvVar2.b;
            c10 c10Var = nvVar2.c;
            long W = px0.W(nvVar2.u);
            mc mcVar = ((nc) t7Var3.g).d;
            sl slVar2 = mcVar.a;
            c10 c10Var2 = mcVar.b;
            kc p2 = t7Var3.p();
            long r = t7Var3.r();
            z = z4;
            nv nvVar5 = (nv) t7Var3.f;
            t7Var3.z(slVar);
            t7Var3.A(c10Var);
            t7Var3.y(p);
            t7Var3.B(W);
            t7Var3.f = nvVar2;
            p.i();
            try {
                nvVar2.c(ncVar2);
            } finally {
                p.g();
                t7Var3.z(slVar2);
                t7Var3.A(c10Var2);
                t7Var3.y(p2);
                t7Var3.B(r);
                t7Var3.f = nvVar5;
            }
        }
        if (z) {
            p.g();
        }
        if (z3) {
            p.k();
        }
        if (isHardwareAccelerated) {
            return;
        }
        a.restore();
    }

    public final void p0(kc kcVar, nv nvVar) {
        ea0 ea0Var;
        kc kcVar2;
        nv nvVar2;
        t50 w0 = w0(4);
        if (w0 == null) {
            L0(kcVar, nvVar);
            return;
        }
        p10 p10Var = this.r;
        p10Var.getClass();
        r10 sharedDrawScope = ((f3) mz.Q(p10Var)).getSharedDrawScope();
        long W = px0.W(this.f);
        sharedDrawScope.getClass();
        l70 l70Var = null;
        while (w0 != null) {
            if (w0 instanceof no) {
                ea0Var = this;
                kcVar2 = kcVar;
                nvVar2 = nvVar;
                sharedDrawScope.d(kcVar2, W, ea0Var, (no) w0, nvVar2);
            } else {
                ea0Var = this;
                kcVar2 = kcVar;
                nvVar2 = nvVar;
                if ((w0.f & 4) != 0 && (w0 instanceof ol)) {
                    int i = 0;
                    for (t50 t50Var = ((ol) w0).s; t50Var != null; t50Var = t50Var.i) {
                        if ((t50Var.f & 4) != 0) {
                            i++;
                            if (i == 1) {
                                w0 = t50Var;
                            } else {
                                if (l70Var == null) {
                                    l70Var = new l70(new t50[16]);
                                }
                                if (w0 != null) {
                                    l70Var.b(w0);
                                    w0 = null;
                                }
                                l70Var.b(t50Var);
                            }
                        }
                    }
                    if (i == 1) {
                        kcVar = kcVar2;
                        this = ea0Var;
                        nvVar = nvVar2;
                    }
                }
            }
            w0 = nz.j(l70Var);
            kcVar = kcVar2;
            this = ea0Var;
            nvVar = nvVar2;
        }
    }

    @Override // defpackage.ed0
    public final boolean q() {
        return (this.L == null || this.u || !this.r.B()) ? false : true;
    }

    public abstract void q0();

    public final ea0 r0(ea0 ea0Var) {
        p10 p10Var = ea0Var.r;
        p10 p10Var2 = this.r;
        if (p10Var == p10Var2) {
            t50 v0 = ea0Var.v0();
            t50 v02 = v0();
            if (!v02.d.q) {
                cy.b("visitLocalAncestors called on an unattached node");
            }
            for (t50 t50Var = v02.d.h; t50Var != null; t50Var = t50Var.h) {
                if ((t50Var.f & 2) != 0 && t50Var == v0) {
                    return ea0Var;
                }
            }
            return this;
        }
        while (p10Var.q > p10Var2.q) {
            p10Var = p10Var.n();
            p10Var.getClass();
        }
        p10 p10Var3 = p10Var2;
        while (p10Var3.q > p10Var.q) {
            p10Var3 = p10Var3.n();
            p10Var3.getClass();
        }
        while (p10Var != p10Var3) {
            p10Var = p10Var.n();
            p10Var3 = p10Var3.n();
            if (p10Var == null || p10Var3 == null) {
                g8.r("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (p10Var3 != p10Var2) {
            if (p10Var != ea0Var.r) {
                return (iy) p10Var.F.g;
            }
            return ea0Var;
        }
        return this;
    }

    public final long s0(long j) {
        long j2 = this.C;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        cd0 cd0Var = this.L;
        if (cd0Var != null) {
            pv pvVar = (pv) cd0Var;
            float[] a = pvVar.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!pvVar.v) {
                return mz.I(a, floatToRawIntBits);
            }
        }
        return floatToRawIntBits;
    }

    public abstract h40 t0();

    @Override // defpackage.b10
    public final long u(b10 b10Var, long j) {
        return E0(b10Var, j);
    }

    public final long u0() {
        return this.x.G(this.r.A.c());
    }

    @Override // defpackage.b10
    public final boolean v() {
        return v0().q;
    }

    public abstract t50 v0();

    public final t50 w0(int i) {
        boolean g = fa0.g(i);
        t50 v0 = v0();
        if (!g && (v0 = v0.h) == null) {
            return null;
        }
        for (t50 x0 = x0(g); x0 != null && (x0.g & i) != 0; x0 = x0.i) {
            if ((x0.f & i) != 0) {
                return x0;
            }
            if (x0 == v0) {
                return null;
            }
        }
        return null;
    }

    public final t50 x0(boolean z) {
        t50 v0;
        ca0 ca0Var = this.r.F;
        if (((ea0) ca0Var.h) == this) {
            return (t50) ca0Var.j;
        }
        ea0 ea0Var = this.t;
        if (!z) {
            if (ea0Var != null) {
                return ea0Var.v0();
            }
            return null;
        }
        if (ea0Var == null || (v0 = ea0Var.v0()) == null) {
            return null;
        }
        return v0.i;
    }

    public final void y0(t50 t50Var, y7 y7Var, long j, kw kwVar, int i, boolean z) {
        if (t50Var == null) {
            B0(y7Var, j, kwVar, i, z);
            return;
        }
        int i2 = kwVar.f;
        x60 x60Var = kwVar.d;
        kwVar.b(i2 + 1, x60Var.b);
        kwVar.f++;
        x60Var.a(t50Var);
        kwVar.e.a(mz.j(-1.0f, z, false));
        y0(x40.n(t50Var, y7Var.i()), y7Var, j, kwVar, i, z);
        kwVar.f = i2;
    }

    @Override // defpackage.b10
    public final zi0 z(b10 b10Var, boolean z) {
        ea0 ea0Var;
        if (!v0().q) {
            cy.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!b10Var.v()) {
            cy.b("LayoutCoordinates " + b10Var + " is not attached!");
        }
        i40 i40Var = b10Var instanceof i40 ? (i40) b10Var : null;
        if (i40Var == null || (ea0Var = i40Var.d.r) == null) {
            ea0Var = (ea0) b10Var;
        }
        ea0Var.G0();
        ea0 r0 = r0(ea0Var);
        z60 z60Var = this.E;
        if (z60Var == null) {
            z60Var = new z60();
            this.E = z60Var;
        }
        z60Var.a = 0.0f;
        z60Var.b = 0.0f;
        z60Var.c = (int) (b10Var.A() >> 32);
        z60Var.d = (int) (b10Var.A() & 4294967295L);
        while (ea0Var != r0) {
            ea0Var.N0(z60Var, z, false);
            if (z60Var.b()) {
                return zi0.e;
            }
            ea0Var = ea0Var.t;
            ea0Var.getClass();
        }
        k0(r0, z60Var, z);
        return new zi0(z60Var.a, z60Var.b, z60Var.c, z60Var.d);
    }

    public final void z0(t50 t50Var, y7 y7Var, long j, kw kwVar, int i, boolean z, float f) {
        if (t50Var == null) {
            B0(y7Var, j, kwVar, i, z);
            return;
        }
        int i2 = kwVar.f;
        x60 x60Var = kwVar.d;
        kwVar.b(i2 + 1, x60Var.b);
        kwVar.f++;
        x60Var.a(t50Var);
        kwVar.e.a(mz.j(f, z, false));
        K0(x40.n(t50Var, y7Var.i()), y7Var, j, kwVar, i, z, f, true);
        kwVar.f = i2;
    }

    @Override // defpackage.f40
    public final b10 X() {
        return this;
    }
}
