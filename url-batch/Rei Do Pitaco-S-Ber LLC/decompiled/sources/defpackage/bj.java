package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class bj {
    public int a;
    public ec d;
    public ec e;
    public ec f;
    public ec g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ cj r;
    public tc b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public bj(cj cjVar, int i, ec ecVar, ec ecVar2, ec ecVar3, ec ecVar4, int i2) {
        this.r = cjVar;
        this.a = i;
        this.d = ecVar;
        this.e = ecVar2;
        this.f = ecVar3;
        this.g = ecVar4;
        this.h = cjVar.w0;
        this.i = cjVar.s0;
        this.j = cjVar.x0;
        this.k = cjVar.t0;
        this.q = i2;
    }

    public final void a(tc tcVar) {
        int i = this.a;
        int i2 = this.q;
        cj cjVar = this.r;
        if (i == 0) {
            int U = cjVar.U(tcVar, i2);
            if (tcVar.p0[0] == 3) {
                this.p++;
                U = 0;
            }
            this.l = U + (tcVar.g0 != 8 ? cjVar.P0 : 0) + this.l;
            int T = cjVar.T(tcVar, this.q);
            if (this.b == null || this.c < T) {
                this.b = tcVar;
                this.c = T;
                this.m = T;
            }
        } else {
            int U2 = cjVar.U(tcVar, i2);
            int T2 = cjVar.T(tcVar, this.q);
            if (tcVar.p0[1] == 3) {
                this.p++;
                T2 = 0;
            }
            this.m = T2 + (tcVar.g0 != 8 ? cjVar.Q0 : 0) + this.m;
            if (this.b == null || this.c < U2) {
                this.b = tcVar;
                this.c = U2;
                this.l = U2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, boolean z2) {
        cj cjVar;
        int i2;
        int i3;
        int i4;
        tc tcVar;
        boolean z3;
        int i5;
        int i6;
        char c;
        float f;
        int i7;
        float f2;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            cjVar = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= cjVar.b1) {
                break;
            }
            tc tcVar2 = cjVar.a1[i8];
            if (tcVar2 != null) {
                tcVar2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= cjVar.b1) {
                break;
            }
            tc tcVar3 = cjVar.a1[i14];
            if (tcVar3 != null && tcVar3.g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.a;
        tc tcVar4 = this.b;
        if (i15 == 0) {
            tcVar4.j0 = cjVar.E0;
            ec ecVar = tcVar4.L;
            ec ecVar2 = tcVar4.J;
            int i16 = this.i;
            if (i > 0) {
                i16 += cjVar.Q0;
            }
            ecVar2.a(this.e, i16);
            if (z2) {
                ecVar.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.L.a(ecVar2, 0);
            }
            if (cjVar.S0 == 3 && !tcVar4.E) {
                for (int i17 = 0; i17 < i9; i17++) {
                    int i18 = this.n + (z ? (i9 - 1) - i17 : i17);
                    if (i18 >= cjVar.b1) {
                        break;
                    }
                    tcVar = cjVar.a1[i18];
                    if (tcVar.E) {
                        break;
                    }
                }
            }
            tcVar = tcVar4;
            int i19 = 0;
            tc tcVar5 = null;
            while (i19 < i9) {
                int i20 = z ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= cjVar.b1) {
                    return;
                }
                tc tcVar6 = cjVar.a1[i21];
                if (tcVar6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    ec ecVar3 = tcVar6.J;
                    ec ecVar4 = tcVar6.L;
                    ec ecVar5 = tcVar6.I;
                    z3 = z4;
                    if (i19 == 0) {
                        i5 = i12;
                        tcVar6.f(ecVar5, this.d, this.h);
                    } else {
                        i5 = i12;
                    }
                    if (i20 == 0) {
                        int i22 = cjVar.D0;
                        float f3 = cjVar.J0;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n == 0) {
                            i7 = cjVar.F0;
                            f = f3;
                            if (i7 != -1) {
                                f2 = cjVar.L0;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i7 = cjVar.H0) == -1) {
                            i7 = i22;
                            f2 = f;
                        } else {
                            f2 = cjVar.N0;
                        }
                        tcVar6.i0 = i7;
                        tcVar6.d0 = f2;
                    }
                    if (i19 == i9 - 1) {
                        i6 = i9;
                        tcVar6.f(tcVar6.K, this.f, this.j);
                    } else {
                        i6 = i9;
                    }
                    if (tcVar5 != null) {
                        ec ecVar6 = tcVar5.K;
                        ecVar5.a(ecVar6, cjVar.P0);
                        if (i19 == i11) {
                            int i23 = this.h;
                            if (ecVar5.h()) {
                                ecVar5.h = i23;
                            }
                        }
                        ecVar6.a(ecVar5, 0);
                        if (i19 == i5 + 1) {
                            int i24 = this.j;
                            if (ecVar6.h()) {
                                ecVar6.h = i24;
                            }
                        }
                    }
                    if (tcVar6 != tcVar4) {
                        int i25 = cjVar.S0;
                        c = 3;
                        if (i25 == 3 && tcVar.E && tcVar6 != tcVar && tcVar6.E) {
                            tcVar6.M.a(tcVar.M, 0);
                        } else if (i25 == 0) {
                            ecVar3.a(ecVar2, 0);
                        } else if (i25 == 1) {
                            ecVar4.a(ecVar, 0);
                        } else if (z3) {
                            ecVar3.a(this.e, this.i);
                            ecVar4.a(this.g, this.k);
                        } else {
                            ecVar3.a(ecVar2, 0);
                            ecVar4.a(ecVar, 0);
                        }
                    } else {
                        c = 3;
                    }
                    tcVar5 = tcVar6;
                }
                i19++;
                z4 = z3;
                i12 = i5;
                i9 = i6;
            }
            return;
        }
        int i26 = i9;
        boolean z5 = z4;
        int i27 = i12;
        tcVar4.i0 = cjVar.D0;
        ec ecVar7 = tcVar4.I;
        ec ecVar8 = tcVar4.K;
        int i28 = this.h;
        if (i > 0) {
            i28 += cjVar.P0;
        }
        if (z) {
            ecVar8.a(this.f, i28);
            if (z2) {
                ecVar7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.I.a(ecVar8, 0);
            }
        } else {
            ecVar7.a(this.d, i28);
            if (z2) {
                ecVar8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.K.a(ecVar7, 0);
            }
        }
        int i29 = 0;
        tc tcVar7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i2 = this.n + i29) >= cjVar.b1) {
                return;
            }
            tc tcVar8 = cjVar.a1[i2];
            if (tcVar8 == null) {
                i26 = i30;
            } else {
                ec ecVar9 = tcVar8.I;
                ec ecVar10 = tcVar8.J;
                ec ecVar11 = tcVar8.K;
                if (i29 == 0) {
                    tcVar8.f(ecVar10, this.e, this.i);
                    int i31 = cjVar.E0;
                    float f4 = cjVar.K0;
                    if (this.n == 0) {
                        i4 = cjVar.G0;
                        i26 = i30;
                        i3 = -1;
                        if (i4 != -1) {
                            f4 = cjVar.M0;
                            i31 = i4;
                            tcVar8.j0 = i31;
                            tcVar8.e0 = f4;
                        }
                    } else {
                        i26 = i30;
                        i3 = -1;
                    }
                    if (z2 && (i4 = cjVar.I0) != i3) {
                        f4 = cjVar.O0;
                        i31 = i4;
                    }
                    tcVar8.j0 = i31;
                    tcVar8.e0 = f4;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    tcVar8.f(tcVar8.L, this.g, this.k);
                }
                if (tcVar7 != null) {
                    ec ecVar12 = tcVar7.L;
                    ecVar10.a(ecVar12, cjVar.Q0);
                    if (i29 == i11) {
                        int i32 = this.i;
                        if (ecVar10.h()) {
                            ecVar10.h = i32;
                        }
                    }
                    ecVar12.a(ecVar10, 0);
                    if (i29 == i27 + 1) {
                        int i33 = this.k;
                        if (ecVar12.h()) {
                            ecVar12.h = i33;
                        }
                    }
                }
                if (tcVar8 != tcVar4) {
                    int i34 = cjVar.R0;
                    if (!z) {
                        if (i34 == 0) {
                            ecVar9.a(ecVar7, 0);
                        } else if (i34 == 1) {
                            ecVar11.a(ecVar8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                ecVar9.a(this.d, this.h);
                                ecVar11.a(this.f, this.j);
                            } else {
                                ecVar9.a(ecVar7, 0);
                                ecVar11.a(ecVar8, 0);
                            }
                        }
                        tcVar7 = tcVar8;
                    } else if (i34 == 0) {
                        ecVar11.a(ecVar8, 0);
                    } else if (i34 == 1) {
                        ecVar9.a(ecVar7, 0);
                    } else if (i34 == 2) {
                        ecVar9.a(ecVar7, 0);
                        ecVar11.a(ecVar8, 0);
                    }
                }
                tcVar7 = tcVar8;
            }
            i29++;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.Q0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.P0 : i2;
    }

    public final void e(int i) {
        cj cjVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            cjVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= cjVar.b1) {
                break;
            }
            tc tcVar = cjVar.a1[i2];
            if (this.a == 0) {
                if (tcVar != null) {
                    int[] iArr = tcVar.p0;
                    if (iArr[0] == 3 && tcVar.r == 0) {
                        cjVar.V(1, i5, iArr[1], tcVar.k(), tcVar);
                    }
                }
            } else if (tcVar != null) {
                int[] iArr2 = tcVar.p0;
                if (iArr2[1] == 3 && tcVar.s == 0) {
                    int i7 = i5;
                    cjVar.V(iArr2[0], tcVar.q(), 1, i7, tcVar);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= cjVar.b1) {
                return;
            }
            tc tcVar2 = cjVar.a1[i10];
            if (this.a == 0) {
                int q = tcVar2.q();
                int i11 = cjVar.P0;
                if (tcVar2.g0 == 8) {
                    i11 = 0;
                }
                this.l = q + i11 + this.l;
                int T = cjVar.T(tcVar2, this.q);
                if (this.b == null || this.c < T) {
                    this.b = tcVar2;
                    this.c = T;
                    this.m = T;
                }
            } else {
                int U = cjVar.U(tcVar2, this.q);
                int T2 = cjVar.T(tcVar2, this.q);
                int i12 = cjVar.Q0;
                if (tcVar2.g0 == 8) {
                    i12 = 0;
                }
                this.m = T2 + i12 + this.m;
                if (this.b == null || this.c < U) {
                    this.b = tcVar2;
                    this.c = U;
                    this.l = U;
                }
            }
        }
    }

    public final void f(int i, ec ecVar, ec ecVar2, ec ecVar3, ec ecVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = ecVar;
        this.e = ecVar2;
        this.f = ecVar3;
        this.g = ecVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
