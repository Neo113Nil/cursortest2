package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class a3 extends v00 implements bu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a3(int i, Object obj, Object obj2) {
        super(0);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.bu
    public final Object a() {
        boolean dispatchKeyEvent;
        rp0 rp0Var;
        p10 p10Var;
        int i = this.e;
        ky0 ky0Var = ky0.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                break;
            case 1:
                n3 n3Var = (n3) obj;
                co0 co0Var = (co0) obj2;
                zn0 zn0Var = co0Var.h;
                zn0 zn0Var2 = co0Var.i;
                Float f = co0Var.f;
                Float f2 = co0Var.g;
                float floatValue = (zn0Var == null || f == null) ? 0.0f : ((Number) zn0Var.a.a()).floatValue() - f.floatValue();
                float floatValue2 = (zn0Var2 == null || f2 == null) ? 0.0f : ((Number) zn0Var2.a.a()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int s = n3Var.s(co0Var.d);
                    tp0 tp0Var = (tp0) n3Var.l().b(n3Var.n);
                    if (tp0Var != null) {
                        try {
                            c1 c1Var = n3Var.p;
                            if (c1Var != null) {
                                c1Var.a.setBoundsInScreen(n3Var.c(tp0Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    tp0 tp0Var2 = (tp0) n3Var.l().b(n3Var.o);
                    if (tp0Var2 != null) {
                        try {
                            c1 c1Var2 = n3Var.q;
                            if (c1Var2 != null) {
                                c1Var2.a.setBoundsInScreen(n3Var.c(tp0Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    n3Var.d.invalidate();
                    tp0 tp0Var3 = (tp0) n3Var.l().b(s);
                    if (tp0Var3 != null && (rp0Var = tp0Var3.a) != null && (p10Var = rp0Var.c) != null) {
                        if (zn0Var != null) {
                            n3Var.s.h(s, zn0Var);
                        }
                        if (zn0Var2 != null) {
                            n3Var.t.h(s, zn0Var2);
                        }
                        n3Var.o(p10Var);
                    }
                }
                if (zn0Var != null) {
                    co0Var.f = (Float) zn0Var.a.a();
                }
                if (zn0Var2 != null) {
                    co0Var.g = (Float) zn0Var2.a.a();
                    break;
                }
                break;
            case 2:
                ((qb) obj2).t.c((rb) obj);
                break;
            case 3:
                ((lm) obj2).e((y70) obj, false);
                break;
            case 4:
                ((gj0) obj2).d = ((ts) obj).k0();
                break;
            case 5:
                ((gj0) obj2).d = mz.A((ys) obj, wf0.a);
                break;
            case 6:
                ((hw) obj2).d((t50) obj);
                break;
            case 7:
                ca0 ca0Var = ((p10) obj2).F;
                gj0 gj0Var = (gj0) obj;
                if ((((t50) ca0Var.j).g & 8) != 0) {
                    for (t50 t50Var = (su0) ca0Var.i; t50Var != null; t50Var = t50Var.h) {
                        if ((t50Var.f & 8) != 0) {
                            ol olVar = t50Var;
                            ?? r6 = 0;
                            while (olVar != 0) {
                                if (olVar instanceof pp0) {
                                    pp0 pp0Var = (pp0) olVar;
                                    if (pp0Var.M()) {
                                        np0 np0Var = new np0();
                                        gj0Var.d = np0Var;
                                        np0Var.g = true;
                                    }
                                    if (pp0Var.O()) {
                                        ((np0) gj0Var.d).f = true;
                                    }
                                    pp0Var.v((np0) gj0Var.d);
                                } else if ((olVar.f & 8) != 0 && (olVar instanceof ol)) {
                                    t50 t50Var2 = olVar.s;
                                    int i2 = 0;
                                    olVar = olVar;
                                    r6 = r6;
                                    while (t50Var2 != null) {
                                        if ((t50Var2.f & 8) != 0) {
                                            i2++;
                                            r6 = r6;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
                                    }
                                }
                                olVar = nz.j(r6);
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                m40 m40Var = (m40) obj2;
                s10 s10Var = m40Var.i;
                s10Var.g = 0;
                l70 s2 = s10Var.a.s();
                Object[] objArr = s2.d;
                int i3 = s2.f;
                for (int i4 = 0; i4 < i3; i4++) {
                    m40 m40Var2 = ((p10) objArr[i4]).G.p;
                    m40Var2.getClass();
                    m40Var2.k = m40Var2.l;
                    m40Var2.l = Integer.MAX_VALUE;
                    if (m40Var2.m == n10.e) {
                        m40Var2.m = n10.f;
                    }
                }
                p10 p10Var2 = s10Var.a;
                p10 p10Var3 = s10Var.a;
                l70 s3 = p10Var2.s();
                Object[] objArr2 = s3.d;
                int i5 = s3.f;
                for (int i6 = 0; i6 < i5; i6++) {
                    m40 m40Var3 = ((p10) objArr2[i6]).G.p;
                    m40Var3.getClass();
                    m40Var3.t.getClass();
                }
                hy hyVar = m40Var.l().R;
                if (hyVar != null) {
                    boolean z = hyVar.n;
                    i70 i70Var = (i70) p10Var3.i();
                    int i7 = i70Var.d.f;
                    for (int i8 = 0; i8 < i7; i8++) {
                        h40 t0 = ((ea0) ((p10) i70Var.get(i8)).F.h).t0();
                        if (t0 != null) {
                            t0.n = z;
                        }
                    }
                }
                ((h40) obj).a0().e();
                if (m40Var.l().R != null) {
                    i70 i70Var2 = (i70) p10Var3.i();
                    int i9 = i70Var2.d.f;
                    for (int i10 = 0; i10 < i9; i10++) {
                        h40 t02 = ((ea0) ((p10) i70Var2.get(i10)).F.h).t0();
                        if (t02 != null) {
                            t02.n = false;
                        }
                    }
                }
                l70 s4 = p10Var3.s();
                Object[] objArr3 = s4.d;
                int i11 = s4.f;
                for (int i12 = 0; i12 < i11; i12++) {
                    m40 m40Var4 = ((p10) objArr3[i12]).G.p;
                    m40Var4.getClass();
                    int i13 = m40Var4.k;
                    int i14 = m40Var4.l;
                    if (i13 != i14 && i14 == Integer.MAX_VALUE) {
                        m40Var4.Q(true);
                    }
                }
                l70 s5 = p10Var3.s();
                Object[] objArr4 = s5.d;
                int i15 = s5.f;
                for (int i16 = 0; i16 < i15; i16++) {
                    m40 m40Var5 = ((p10) objArr4[i16]).G.p;
                    m40Var5.getClass();
                    q10 q10Var = m40Var5.t;
                    q10Var.getClass();
                    q10Var.c = false;
                }
                break;
        }
        return ky0Var;
    }
}
