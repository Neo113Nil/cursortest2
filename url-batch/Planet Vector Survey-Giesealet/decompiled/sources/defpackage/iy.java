package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class iy extends ea0 {
    public static final y4 S;
    public final su0 Q;
    public hy R;

    static {
        y4 d = a50.d();
        d.e(ge.d);
        d.a.setStrokeWidth(1.0f);
        d.j(1);
        S = d;
    }

    public iy(p10 p10Var) {
        super(p10Var);
        su0 su0Var = new su0();
        su0Var.g = 0;
        this.Q = su0Var;
        su0Var.k = this;
        this.R = p10Var.j != null ? new hy(this) : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [l70] */
    @Override // defpackage.ea0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B0(y7 y7Var, long j, kw kwVar, int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        p10 p10Var;
        long j2 = j;
        kw kwVar2 = kwVar;
        int i3 = y7Var.d;
        p10 p10Var2 = this.r;
        switch (i3) {
            case 26:
                z2 = true;
                break;
            default:
                np0 p = p10Var2.p();
                z2 = !(p != null && p.g);
                break;
        }
        if (z2) {
            if (U0(j2)) {
                i2 = i;
                z3 = z;
                z4 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(n0(j2, u0())) & Integer.MAX_VALUE) < 2139095040) {
                    z4 = true;
                    z3 = false;
                }
            }
            if (z4) {
                return;
            }
            int i4 = kwVar2.f;
            l70 r = p10Var2.r();
            Object[] objArr = r.d;
            int i5 = r.f - 1;
            while (i5 >= 0) {
                p10 p10Var3 = (p10) objArr[i5];
                if (p10Var3.C()) {
                    switch (y7Var.d) {
                        case 26:
                            p10Var3.t(j2, kwVar2, i2, z3);
                            p10Var = p10Var3;
                            break;
                        default:
                            ca0 ca0Var = p10Var3.F;
                            ((ea0) ca0Var.h).A0(ea0.P, ((ea0) ca0Var.h).s0(j2), kwVar2, 1, z3);
                            kwVar2 = kwVar;
                            p10Var = p10Var3;
                            break;
                    }
                    long a = kwVar2.a();
                    if (d31.t(a) < 0.0f && d31.D(a) && !d31.C(a)) {
                        ea0 ea0Var = (ea0) p10Var.F.h;
                        ea0Var.getClass();
                        t50 x0 = ea0Var.x0(fa0.g(16));
                        if (x0 != null && x0.q) {
                            if (!x0.d.q) {
                                cy.b("visitLocalDescendants called on an unattached node");
                            }
                            t50 t50Var = x0.d;
                            if ((t50Var.g & 16) != 0) {
                                while (t50Var != null) {
                                    if ((t50Var.f & 16) != 0) {
                                        ol olVar = t50Var;
                                        ?? r6 = 0;
                                        while (olVar != 0) {
                                            if (olVar instanceof zg0) {
                                                if (((zg0) olVar).E()) {
                                                    kwVar2.f = kwVar2.d.b - 1;
                                                }
                                            } else if ((olVar.f & 16) != 0 && (olVar instanceof ol)) {
                                                t50 t50Var2 = olVar.s;
                                                int i6 = 0;
                                                olVar = olVar;
                                                r6 = r6;
                                                while (t50Var2 != null) {
                                                    if ((t50Var2.f & 16) != 0) {
                                                        i6++;
                                                        r6 = r6;
                                                        if (i6 == 1) {
                                                            olVar = t50Var2;
                                                        } else {
                                                            if (r6 == 0) {
                                                                r6 = new l70(new t50[16]);
                                                            }
                                                            if (olVar != 0) {
                                                                r6.b(olVar);
                                                                olVar = 0;
                                                            }
                                                            r6.b(t50Var2);
                                                        }
                                                    }
                                                    t50Var2 = t50Var2.i;
                                                    olVar = olVar;
                                                    r6 = r6;
                                                }
                                                if (i6 == 1) {
                                                }
                                            }
                                            olVar = nz.j(r6);
                                        }
                                    }
                                    t50Var = t50Var.i;
                                }
                            }
                        }
                        kwVar2.f = i4;
                        return;
                    }
                }
                i5--;
                j2 = j;
                i2 = i;
            }
            kwVar2.f = i4;
            return;
        }
        i2 = i;
        z3 = z;
        z4 = false;
        if (z4) {
        }
    }

    @Override // defpackage.ea0
    public final void L0(kc kcVar, nv nvVar) {
        p10 p10Var = this.r;
        dd0 Q = mz.Q(p10Var);
        l70 r = p10Var.r();
        Object[] objArr = r.d;
        int i = r.f;
        for (int i2 = 0; i2 < i; i2++) {
            p10 p10Var2 = (p10) objArr[i2];
            if (p10Var2.C()) {
                p10Var2.g(kcVar, nvVar);
            }
        }
        if (((f3) Q).getShowLayoutBounds()) {
            long j = this.f;
            kcVar.n(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, S);
        }
    }

    @Override // defpackage.yf0
    public final void M(long j, float f, mu muVar) {
        M0(j, f, muVar);
        if (this.m) {
            return;
        }
        this.r.G.o.T();
    }

    @Override // defpackage.f40
    public final int R(lw lwVar) {
        hy hyVar = this.R;
        if (hyVar != null) {
            return hyVar.R(lwVar);
        }
        f50 f50Var = this.r.G.o;
        m10 m10Var = f50Var.i.c;
        q10 q10Var = f50Var.z;
        if (m10Var == m10.d) {
            q10Var.d = true;
            if (q10Var.b) {
                f50Var.x = true;
                f50Var.y = true;
            }
        } else {
            q10Var.e = true;
        }
        f50Var.l().n = true;
        f50Var.n();
        f50Var.l().n = false;
        Integer num = (Integer) q10Var.g.get(lwVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.b50
    public final yf0 d(long j) {
        List f;
        O(j);
        p10 p10Var = this.r;
        l70 s = p10Var.s();
        Object[] objArr = s.d;
        int i = s.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((p10) objArr[i2]).G.o.o = n10.f;
        }
        g50 g50Var = p10Var.x;
        f50 f50Var = p10Var.G.o;
        l70 l70Var = f50Var.A;
        s10 s10Var = f50Var.i;
        s10Var.a.V();
        if (f50Var.B) {
            p10 p10Var2 = s10Var.a;
            l70 s2 = p10Var2.s();
            Object[] objArr2 = s2.d;
            int i3 = s2.f;
            for (int i4 = 0; i4 < i3; i4++) {
                p10 p10Var3 = (p10) objArr2[i4];
                if (l70Var.f <= i4) {
                    l70Var.b(p10Var3.G.o);
                } else {
                    f50 f50Var2 = p10Var3.G.o;
                    Object[] objArr3 = l70Var.d;
                    Object obj = objArr3[i4];
                    objArr3[i4] = f50Var2;
                }
            }
            l70Var.k(((i70) p10Var2.i()).d.f, l70Var.f);
            f50Var.B = false;
            f = l70Var.f();
        } else {
            f = l70Var.f();
        }
        P0(g50Var.f(this, f, j));
        H0();
        return this;
    }

    @Override // defpackage.ea0
    public final void q0() {
        if (this.R == null) {
            this.R = new hy(this);
        }
    }

    @Override // defpackage.ea0
    public final h40 t0() {
        return this.R;
    }

    @Override // defpackage.ea0
    public final t50 v0() {
        return this.Q;
    }
}
