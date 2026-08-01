package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class q70 extends w90 {
    public ze k;
    public o7 l;

    @Override // defpackage.xe
    public final void a(xe xeVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (n20.h(this.j) == 3) {
            tc tcVar = this.b;
            l(tcVar.J, tcVar.L, 1);
            return;
        }
        mf mfVar = this.e;
        if (mfVar.c && !mfVar.j && this.d == 3) {
            tc tcVar2 = this.b;
            int i2 = tcVar2.s;
            if (i2 == 2) {
                tc tcVar3 = tcVar2.T;
                if (tcVar3 != null) {
                    if (tcVar3.e.e.j) {
                        mfVar.d((int) ((r5.g * tcVar2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                mf mfVar2 = tcVar2.d.e;
                if (mfVar2.j) {
                    int i3 = tcVar2.X;
                    if (i3 == -1) {
                        f = mfVar2.g;
                        f2 = tcVar2.W;
                    } else if (i3 == 0) {
                        f3 = mfVar2.g * tcVar2.W;
                        i = (int) (f3 + 0.5f);
                        mfVar.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        mfVar.d(i);
                    } else {
                        f = mfVar2.g;
                        f2 = tcVar2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    mfVar.d(i);
                }
            }
        }
        ze zeVar = this.h;
        boolean z = zeVar.c;
        ArrayList arrayList = zeVar.l;
        if (z) {
            ze zeVar2 = this.i;
            boolean z2 = zeVar2.c;
            ArrayList arrayList2 = zeVar2.l;
            if (z2) {
                if (zeVar.j && zeVar2.j && mfVar.j) {
                    return;
                }
                if (!mfVar.j && this.d == 3) {
                    tc tcVar4 = this.b;
                    if (tcVar4.r == 0 && !tcVar4.y()) {
                        ze zeVar3 = (ze) arrayList.get(0);
                        ze zeVar4 = (ze) arrayList2.get(0);
                        int i4 = zeVar3.g + zeVar.f;
                        int i5 = zeVar4.g + zeVar2.f;
                        zeVar.d(i4);
                        zeVar2.d(i5);
                        mfVar.d(i5 - i4);
                        return;
                    }
                }
                if (!mfVar.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    ze zeVar5 = (ze) arrayList.get(0);
                    int i6 = (((ze) arrayList2.get(0)).g + zeVar2.f) - (zeVar5.g + zeVar.f);
                    int i7 = mfVar.m;
                    if (i6 < i7) {
                        mfVar.d(i6);
                    } else {
                        mfVar.d(i7);
                    }
                }
                if (mfVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    ze zeVar6 = (ze) arrayList.get(0);
                    ze zeVar7 = (ze) arrayList2.get(0);
                    int i8 = zeVar6.g;
                    int i9 = zeVar.f + i8;
                    int i10 = zeVar7.g;
                    int i11 = zeVar2.f + i10;
                    float f4 = this.b.e0;
                    if (zeVar6 == zeVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    zeVar.d((int) ((((i10 - i8) - mfVar.g) * f4) + i8 + 0.5f));
                    zeVar2.d(zeVar.g + mfVar.g);
                }
            }
        }
    }

    @Override // defpackage.w90
    public final void d() {
        tc tcVar;
        tc tcVar2;
        tc tcVar3;
        tc tcVar4;
        ze zeVar = this.k;
        tc tcVar5 = this.b;
        boolean z = tcVar5.a;
        mf mfVar = this.e;
        if (z) {
            mfVar.d(tcVar5.k());
        }
        boolean z2 = mfVar.j;
        ArrayList arrayList = mfVar.k;
        ArrayList arrayList2 = mfVar.l;
        ze zeVar2 = this.i;
        ze zeVar3 = this.h;
        if (!z2) {
            tc tcVar6 = this.b;
            this.d = tcVar6.p0[1];
            if (tcVar6.E) {
                this.l = new o7(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (tcVar4 = this.b.T) != null && tcVar4.p0[1] == 1) {
                    int k = (tcVar4.k() - this.b.J.e()) - this.b.L.e();
                    w90.b(zeVar3, tcVar4.e.h, this.b.J.e());
                    w90.b(zeVar2, tcVar4.e.i, -this.b.L.e());
                    mfVar.d(k);
                    return;
                }
                if (i == 1) {
                    mfVar.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (tcVar2 = (tcVar = this.b).T) != null && tcVar2.p0[1] == 1) {
            w90.b(zeVar3, tcVar2.e.h, tcVar.J.e());
            w90.b(zeVar2, tcVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = mfVar.j;
        if (z3) {
            tc tcVar7 = this.b;
            if (tcVar7.a) {
                ec[] ecVarArr = tcVar7.Q;
                ec ecVar = ecVarArr[2];
                ec ecVar2 = ecVar.f;
                if (ecVar2 != null && ecVarArr[3].f != null) {
                    boolean y = tcVar7.y();
                    tc tcVar8 = this.b;
                    if (y) {
                        zeVar3.f = tcVar8.Q[2].e();
                        zeVar2.f = -this.b.Q[3].e();
                    } else {
                        ze h = w90.h(tcVar8.Q[2]);
                        if (h != null) {
                            w90.b(zeVar3, h, this.b.Q[2].e());
                        }
                        ze h2 = w90.h(this.b.Q[3]);
                        if (h2 != null) {
                            w90.b(zeVar2, h2, -this.b.Q[3].e());
                        }
                        zeVar3.b = true;
                        zeVar2.b = true;
                    }
                    tc tcVar9 = this.b;
                    if (tcVar9.E) {
                        w90.b(zeVar, zeVar3, tcVar9.a0);
                        return;
                    }
                    return;
                }
                if (ecVar2 != null) {
                    ze h3 = w90.h(ecVar);
                    if (h3 != null) {
                        w90.b(zeVar3, h3, this.b.Q[2].e());
                        w90.b(zeVar2, zeVar3, mfVar.g);
                        tc tcVar10 = this.b;
                        if (tcVar10.E) {
                            w90.b(zeVar, zeVar3, tcVar10.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ec ecVar3 = ecVarArr[3];
                if (ecVar3.f != null) {
                    ze h4 = w90.h(ecVar3);
                    if (h4 != null) {
                        w90.b(zeVar2, h4, -this.b.Q[3].e());
                        w90.b(zeVar3, zeVar2, -mfVar.g);
                    }
                    tc tcVar11 = this.b;
                    if (tcVar11.E) {
                        w90.b(zeVar, zeVar3, tcVar11.a0);
                        return;
                    }
                    return;
                }
                ec ecVar4 = ecVarArr[4];
                if (ecVar4.f != null) {
                    ze h5 = w90.h(ecVar4);
                    if (h5 != null) {
                        w90.b(zeVar, h5, 0);
                        w90.b(zeVar3, zeVar, -this.b.a0);
                        w90.b(zeVar2, zeVar3, mfVar.g);
                        return;
                    }
                    return;
                }
                if ((tcVar7 instanceof pm) || tcVar7.T == null || tcVar7.i(7).f != null) {
                    return;
                }
                tc tcVar12 = this.b;
                w90.b(zeVar3, tcVar12.T.e.h, tcVar12.s());
                w90.b(zeVar2, zeVar3, mfVar.g);
                tc tcVar13 = this.b;
                if (tcVar13.E) {
                    w90.b(zeVar, zeVar3, tcVar13.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            mfVar.b(this);
        } else {
            tc tcVar14 = this.b;
            int i2 = tcVar14.s;
            if (i2 == 2) {
                tc tcVar15 = tcVar14.T;
                if (tcVar15 != null) {
                    mf mfVar2 = tcVar15.e.e;
                    arrayList2.add(mfVar2);
                    mfVar2.k.add(mfVar);
                    mfVar.b = true;
                    arrayList.add(zeVar3);
                    arrayList.add(zeVar2);
                }
            } else if (i2 == 3 && !tcVar14.y()) {
                tc tcVar16 = this.b;
                if (tcVar16.r != 3) {
                    mf mfVar3 = tcVar16.d.e;
                    arrayList2.add(mfVar3);
                    mfVar3.k.add(mfVar);
                    mfVar.b = true;
                    arrayList.add(zeVar3);
                    arrayList.add(zeVar2);
                }
            }
        }
        tc tcVar17 = this.b;
        ec[] ecVarArr2 = tcVar17.Q;
        ec ecVar5 = ecVarArr2[2];
        ec ecVar6 = ecVar5.f;
        if (ecVar6 != null && ecVarArr2[3].f != null) {
            boolean y2 = tcVar17.y();
            tc tcVar18 = this.b;
            if (y2) {
                zeVar3.f = tcVar18.Q[2].e();
                zeVar2.f = -this.b.Q[3].e();
            } else {
                ze h6 = w90.h(tcVar18.Q[2]);
                ze h7 = w90.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(zeVar, zeVar3, 1, this.l);
            }
        } else if (ecVar6 != null) {
            ze h8 = w90.h(ecVar5);
            if (h8 != null) {
                w90.b(zeVar3, h8, this.b.Q[2].e());
                c(zeVar2, zeVar3, 1, mfVar);
                if (this.b.E) {
                    c(zeVar, zeVar3, 1, this.l);
                }
                if (this.d == 3) {
                    tc tcVar19 = this.b;
                    if (tcVar19.W > 0.0f) {
                        tm tmVar = tcVar19.d;
                        if (tmVar.d == 3) {
                            tmVar.e.k.add(mfVar);
                            arrayList2.add(this.b.d.e);
                            mfVar.a = this;
                        }
                    }
                }
            }
        } else {
            ec ecVar7 = ecVarArr2[3];
            if (ecVar7.f != null) {
                ze h9 = w90.h(ecVar7);
                if (h9 != null) {
                    w90.b(zeVar2, h9, -this.b.Q[3].e());
                    c(zeVar3, zeVar2, -1, mfVar);
                    if (this.b.E) {
                        c(zeVar, zeVar3, 1, this.l);
                    }
                }
            } else {
                ec ecVar8 = ecVarArr2[4];
                if (ecVar8.f != null) {
                    ze h10 = w90.h(ecVar8);
                    if (h10 != null) {
                        w90.b(zeVar, h10, 0);
                        c(zeVar3, zeVar, -1, this.l);
                        c(zeVar2, zeVar3, 1, mfVar);
                    }
                } else if (!(tcVar17 instanceof pm) && (tcVar3 = tcVar17.T) != null) {
                    w90.b(zeVar3, tcVar3.e.h, tcVar17.s());
                    c(zeVar2, zeVar3, 1, mfVar);
                    if (this.b.E) {
                        c(zeVar, zeVar3, 1, this.l);
                    }
                    if (this.d == 3) {
                        tc tcVar20 = this.b;
                        if (tcVar20.W > 0.0f) {
                            tm tmVar2 = tcVar20.d;
                            if (tmVar2.d == 3) {
                                tmVar2.e.k.add(mfVar);
                                arrayList2.add(this.b.d.e);
                                mfVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            mfVar.c = true;
        }
    }

    @Override // defpackage.w90
    public final void e() {
        ze zeVar = this.h;
        if (zeVar.j) {
            this.b.Z = zeVar.g;
        }
    }

    @Override // defpackage.w90
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.w90
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        ze zeVar = this.h;
        zeVar.c();
        zeVar.j = false;
        ze zeVar2 = this.i;
        zeVar2.c();
        zeVar2.j = false;
        ze zeVar3 = this.k;
        zeVar3.c();
        zeVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
