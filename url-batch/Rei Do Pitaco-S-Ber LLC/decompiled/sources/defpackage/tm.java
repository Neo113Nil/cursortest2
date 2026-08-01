package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class tm extends w90 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // defpackage.xe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xe xeVar) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        int i;
        if (n20.h(this.j) == 3) {
            tc tcVar = this.b;
            l(tcVar.I, tcVar.K, 0);
            return;
        }
        mf mfVar = this.e;
        boolean z2 = mfVar.j;
        ze zeVar = this.h;
        ze zeVar2 = this.i;
        if (!z2 && this.d == 3) {
            tc tcVar2 = this.b;
            int i2 = tcVar2.r;
            if (i2 == 2) {
                f = 0.5f;
                tc tcVar3 = tcVar2.T;
                if (tcVar3 != null) {
                    if (tcVar3.d.e.j) {
                        mfVar.d((int) ((r5.g * tcVar2.w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = tcVar2.s;
                if (i3 == 0 || i3 == 3) {
                    q70 q70Var = tcVar2.e;
                    ze zeVar3 = q70Var.h;
                    ze zeVar4 = q70Var.i;
                    boolean z3 = tcVar2.I.f != null;
                    boolean z4 = tcVar2.J.f != null;
                    boolean z5 = tcVar2.K.f != null;
                    boolean z6 = tcVar2.L.f != null;
                    f = 0.5f;
                    int i4 = tcVar2.X;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = tcVar2.W;
                        boolean z7 = zeVar3.j;
                        ArrayList arrayList = zeVar3.l;
                        int[] iArr = k;
                        if (z7 && zeVar4.j) {
                            if (zeVar.c && zeVar2.c) {
                                m(iArr, ((ze) zeVar.l.get(0)).g + zeVar.f, ((ze) zeVar2.l.get(0)).g - zeVar2.f, zeVar3.g + zeVar3.f, zeVar4.g - zeVar4.f, f5, i4);
                                mfVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (zeVar.j && zeVar2.j) {
                            if (!zeVar3.c || !zeVar4.c) {
                                return;
                            }
                            m(iArr, zeVar.g + zeVar.f, zeVar2.g - zeVar2.f, ((ze) arrayList.get(0)).g + zeVar3.f, ((ze) zeVar4.l.get(0)).g - zeVar4.f, f5, i4);
                            mfVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!zeVar.c || !zeVar2.c || !zeVar3.c || !zeVar4.c) {
                            return;
                        }
                        m(iArr, ((ze) zeVar.l.get(0)).g + zeVar.f, ((ze) zeVar2.l.get(0)).g - zeVar2.f, ((ze) arrayList.get(0)).g + zeVar3.f, ((ze) zeVar4.l.get(0)).g - zeVar4.f, f5, i4);
                        mfVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!zeVar.c || !zeVar2.c) {
                            return;
                        }
                        float f6 = tcVar2.W;
                        int i5 = ((ze) zeVar.l.get(0)).g + zeVar.f;
                        int i6 = ((ze) zeVar2.l.get(0)).g - zeVar2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f6) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f6) + 0.5f);
                            }
                            mfVar.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f6) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f6) + 0.5f);
                            }
                            mfVar.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z4 && z6) {
                        if (!zeVar3.c || !zeVar4.c) {
                            return;
                        }
                        float f7 = tcVar2.W;
                        int i9 = ((ze) zeVar3.l.get(0)).g + zeVar3.f;
                        int i10 = ((ze) zeVar4.l.get(0)).g - zeVar4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f7) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f7) + 0.5f);
                                }
                                mfVar.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f7) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f7) + 0.5f);
                        }
                        mfVar.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = tcVar2.X;
                    if (i13 == -1) {
                        f2 = tcVar2.e.e.g;
                        f3 = tcVar2.W;
                    } else if (i13 == 0) {
                        f4 = tcVar2.e.e.g / tcVar2.W;
                        i = (int) (f4 + 0.5f);
                        mfVar.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        mfVar.d(i);
                    } else {
                        f2 = tcVar2.e.e.g;
                        f3 = tcVar2.W;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    mfVar.d(i);
                }
            }
            z = zeVar.c;
            ArrayList arrayList2 = zeVar.l;
            if (z) {
                return;
            }
            boolean z8 = zeVar2.c;
            ArrayList arrayList3 = zeVar2.l;
            if (z8) {
                if (zeVar.j && zeVar2.j && mfVar.j) {
                    return;
                }
                if (!mfVar.j && this.d == 3) {
                    tc tcVar4 = this.b;
                    if (tcVar4.r == 0 && !tcVar4.x()) {
                        ze zeVar5 = (ze) arrayList2.get(0);
                        ze zeVar6 = (ze) arrayList3.get(0);
                        int i14 = zeVar5.g + zeVar.f;
                        int i15 = zeVar6.g + zeVar2.f;
                        zeVar.d(i14);
                        zeVar2.d(i15);
                        mfVar.d(i15 - i14);
                        return;
                    }
                }
                if (!mfVar.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((ze) arrayList3.get(0)).g + zeVar2.f) - (((ze) arrayList2.get(0)).g + zeVar.f), mfVar.m);
                    tc tcVar5 = this.b;
                    int i16 = tcVar5.v;
                    int max = Math.max(tcVar5.u, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    mfVar.d(max);
                }
                if (mfVar.j) {
                    ze zeVar7 = (ze) arrayList2.get(0);
                    ze zeVar8 = (ze) arrayList3.get(0);
                    int i17 = zeVar7.g;
                    int i18 = zeVar.f + i17;
                    int i19 = zeVar8.g;
                    int i20 = zeVar2.f + i19;
                    float f8 = this.b.d0;
                    if (zeVar7 == zeVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    zeVar.d((int) ((((i19 - i17) - mfVar.g) * f8) + i17 + f));
                    zeVar2.d(zeVar.g + mfVar.g);
                    return;
                }
                return;
            }
            return;
        }
        f = 0.5f;
        z = zeVar.c;
        ArrayList arrayList22 = zeVar.l;
        if (z) {
        }
    }

    @Override // defpackage.w90
    public final void d() {
        tc tcVar;
        tc tcVar2;
        int i;
        tc tcVar3;
        tc tcVar4;
        int i2;
        tc tcVar5 = this.b;
        boolean z = tcVar5.a;
        mf mfVar = this.e;
        if (z) {
            mfVar.d(tcVar5.q());
        }
        boolean z2 = mfVar.j;
        ArrayList arrayList = mfVar.k;
        ArrayList arrayList2 = mfVar.l;
        ze zeVar = this.i;
        ze zeVar2 = this.h;
        if (!z2) {
            tc tcVar6 = this.b;
            int i3 = tcVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (tcVar4 = tcVar6.T) != null && ((i2 = tcVar4.p0[0]) == 1 || i2 == 4)) {
                    int q = (tcVar4.q() - this.b.I.e()) - this.b.K.e();
                    w90.b(zeVar2, tcVar4.d.h, this.b.I.e());
                    w90.b(zeVar, tcVar4.d.i, -this.b.K.e());
                    mfVar.d(q);
                    return;
                }
                if (i3 == 1) {
                    mfVar.d(tcVar6.q());
                }
            }
        } else if (this.d == 4 && (tcVar2 = (tcVar = this.b).T) != null && ((i = tcVar2.p0[0]) == 1 || i == 4)) {
            w90.b(zeVar2, tcVar2.d.h, tcVar.I.e());
            w90.b(zeVar, tcVar2.d.i, -this.b.K.e());
            return;
        }
        if (mfVar.j) {
            tc tcVar7 = this.b;
            if (tcVar7.a) {
                ec[] ecVarArr = tcVar7.Q;
                ec ecVar = ecVarArr[0];
                ec ecVar2 = ecVar.f;
                if (ecVar2 != null && ecVarArr[1].f != null) {
                    boolean x = tcVar7.x();
                    tc tcVar8 = this.b;
                    if (x) {
                        zeVar2.f = tcVar8.Q[0].e();
                        zeVar.f = -this.b.Q[1].e();
                        return;
                    }
                    ze h = w90.h(tcVar8.Q[0]);
                    if (h != null) {
                        w90.b(zeVar2, h, this.b.Q[0].e());
                    }
                    ze h2 = w90.h(this.b.Q[1]);
                    if (h2 != null) {
                        w90.b(zeVar, h2, -this.b.Q[1].e());
                    }
                    zeVar2.b = true;
                    zeVar.b = true;
                    return;
                }
                if (ecVar2 != null) {
                    ze h3 = w90.h(ecVar);
                    if (h3 != null) {
                        w90.b(zeVar2, h3, this.b.Q[0].e());
                        w90.b(zeVar, zeVar2, mfVar.g);
                        return;
                    }
                    return;
                }
                ec ecVar3 = ecVarArr[1];
                if (ecVar3.f != null) {
                    ze h4 = w90.h(ecVar3);
                    if (h4 != null) {
                        w90.b(zeVar, h4, -this.b.Q[1].e());
                        w90.b(zeVar2, zeVar, -mfVar.g);
                        return;
                    }
                    return;
                }
                if ((tcVar7 instanceof pm) || tcVar7.T == null || tcVar7.i(7).f != null) {
                    return;
                }
                tc tcVar9 = this.b;
                w90.b(zeVar2, tcVar9.T.d.h, tcVar9.r());
                w90.b(zeVar, zeVar2, mfVar.g);
                return;
            }
        }
        if (this.d == 3) {
            tc tcVar10 = this.b;
            int i4 = tcVar10.r;
            if (i4 == 2) {
                tc tcVar11 = tcVar10.T;
                if (tcVar11 != null) {
                    mf mfVar2 = tcVar11.e.e;
                    arrayList2.add(mfVar2);
                    mfVar2.k.add(mfVar);
                    mfVar.b = true;
                    arrayList.add(zeVar2);
                    arrayList.add(zeVar);
                }
            } else if (i4 == 3) {
                if (tcVar10.s == 3) {
                    zeVar2.a = this;
                    zeVar.a = this;
                    q70 q70Var = tcVar10.e;
                    q70Var.h.a = this;
                    q70Var.i.a = this;
                    mfVar.a = this;
                    if (tcVar10.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(mfVar);
                        q70 q70Var2 = this.b.e;
                        q70Var2.e.a = this;
                        arrayList2.add(q70Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(mfVar);
                        this.b.e.i.k.add(mfVar);
                    } else {
                        boolean x2 = this.b.x();
                        tc tcVar12 = this.b;
                        if (x2) {
                            tcVar12.e.e.l.add(mfVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            tcVar12.e.e.l.add(mfVar);
                        }
                    }
                } else {
                    mf mfVar3 = tcVar10.e.e;
                    arrayList2.add(mfVar3);
                    mfVar3.k.add(mfVar);
                    this.b.e.h.k.add(mfVar);
                    this.b.e.i.k.add(mfVar);
                    mfVar.b = true;
                    arrayList.add(zeVar2);
                    arrayList.add(zeVar);
                    zeVar2.l.add(mfVar);
                    zeVar.l.add(mfVar);
                }
            }
        }
        tc tcVar13 = this.b;
        ec[] ecVarArr2 = tcVar13.Q;
        ec ecVar4 = ecVarArr2[0];
        ec ecVar5 = ecVar4.f;
        if (ecVar5 != null && ecVarArr2[1].f != null) {
            boolean x3 = tcVar13.x();
            tc tcVar14 = this.b;
            if (x3) {
                zeVar2.f = tcVar14.Q[0].e();
                zeVar.f = -this.b.Q[1].e();
                return;
            }
            ze h5 = w90.h(tcVar14.Q[0]);
            ze h6 = w90.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (ecVar5 != null) {
            ze h7 = w90.h(ecVar4);
            if (h7 != null) {
                w90.b(zeVar2, h7, this.b.Q[0].e());
                c(zeVar, zeVar2, 1, mfVar);
                return;
            }
            return;
        }
        ec ecVar6 = ecVarArr2[1];
        if (ecVar6.f != null) {
            ze h8 = w90.h(ecVar6);
            if (h8 != null) {
                w90.b(zeVar, h8, -this.b.Q[1].e());
                c(zeVar2, zeVar, -1, mfVar);
                return;
            }
            return;
        }
        if ((tcVar13 instanceof pm) || (tcVar3 = tcVar13.T) == null) {
            return;
        }
        w90.b(zeVar2, tcVar3.d.h, tcVar13.r());
        c(zeVar, zeVar2, 1, mfVar);
    }

    @Override // defpackage.w90
    public final void e() {
        ze zeVar = this.h;
        if (zeVar.j) {
            this.b.Y = zeVar.g;
        }
    }

    @Override // defpackage.w90
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.w90
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        ze zeVar = this.h;
        zeVar.c();
        zeVar.j = false;
        ze zeVar2 = this.i;
        zeVar2.c();
        zeVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
