package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3677a;
    public C0298c d;

    /* renamed from: e, reason: collision with root package name */
    public C0298c f3680e;

    /* renamed from: f, reason: collision with root package name */
    public C0298c f3681f;

    /* renamed from: g, reason: collision with root package name */
    public C0298c f3682g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3683j;

    /* renamed from: k, reason: collision with root package name */
    public int f3684k;

    /* renamed from: q, reason: collision with root package name */
    public int f3690q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3691r;

    /* renamed from: b, reason: collision with root package name */
    public C0299d f3678b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3679c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3685l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3686m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3687n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3688o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3689p = 0;

    public f(g gVar, int i, C0298c c0298c, C0298c c0298c2, C0298c c0298c3, C0298c c0298c4, int i2) {
        this.f3691r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3683j = 0;
        this.f3684k = 0;
        this.f3690q = 0;
        this.f3677a = i;
        this.d = c0298c;
        this.f3680e = c0298c2;
        this.f3681f = c0298c3;
        this.f3682g = c0298c4;
        this.h = gVar.f3722w0;
        this.i = gVar.f3718s0;
        this.f3683j = gVar.x0;
        this.f3684k = gVar.f3719t0;
        this.f3690q = i2;
    }

    public final void a(C0299d c0299d) {
        int i = this.f3677a;
        g gVar = this.f3691r;
        if (i == 0) {
            int U2 = gVar.U(c0299d, this.f3690q);
            if (c0299d.f3646p0[0] == 3) {
                this.f3689p++;
                U2 = 0;
            }
            this.f3685l = U2 + (c0299d.f3631g0 != 8 ? gVar.f3706P0 : 0) + this.f3685l;
            int T2 = gVar.T(c0299d, this.f3690q);
            if (this.f3678b == null || this.f3679c < T2) {
                this.f3678b = c0299d;
                this.f3679c = T2;
                this.f3686m = T2;
            }
        } else {
            int U3 = gVar.U(c0299d, this.f3690q);
            int T3 = gVar.T(c0299d, this.f3690q);
            if (c0299d.f3646p0[1] == 3) {
                this.f3689p++;
                T3 = 0;
            }
            this.f3686m = T3 + (c0299d.f3631g0 != 8 ? gVar.f3707Q0 : 0) + this.f3686m;
            if (this.f3678b == null || this.f3679c < U3) {
                this.f3678b = c0299d;
                this.f3679c = U3;
                this.f3685l = U3;
            }
        }
        this.f3688o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        C0299d c0299d;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3688o;
        int i10 = 0;
        while (true) {
            gVar = this.f3691r;
            if (i10 >= i9 || (i8 = this.f3687n + i10) >= gVar.f3717b1) {
                break;
            }
            C0299d c0299d2 = gVar.f3716a1[i8];
            if (c0299d2 != null) {
                c0299d2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3678b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3687n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3717b1) {
                break;
            }
            C0299d c0299d3 = gVar.f3716a1[i14];
            if (c0299d3 != null && c0299d3.f3631g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3677a != 0) {
            C0299d c0299d4 = this.f3678b;
            c0299d4.f3633i0 = gVar.f3694D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3706P0;
            }
            C0298c c0298c = c0299d4.f3601I;
            C0298c c0298c2 = c0299d4.f3603K;
            if (z2) {
                c0298c2.a(this.f3681f, i15);
                if (z3) {
                    c0298c.a(this.d, this.f3683j);
                }
                if (i > 0) {
                    this.f3681f.d.f3601I.a(c0298c2, 0);
                }
            } else {
                c0298c.a(this.d, i15);
                if (z3) {
                    c0298c2.a(this.f3681f, this.f3683j);
                }
                if (i > 0) {
                    this.d.d.f3603K.a(c0298c, 0);
                }
            }
            C0299d c0299d5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3687n + i16;
                if (i17 >= gVar.f3717b1) {
                    return;
                }
                C0299d c0299d6 = gVar.f3716a1[i17];
                if (c0299d6 != null) {
                    C0298c c0298c3 = c0299d6.f3602J;
                    if (i16 == 0) {
                        c0299d6.f(c0298c3, this.f3680e, this.i);
                        int i18 = gVar.f3695E0;
                        float f5 = gVar.f3701K0;
                        if (this.f3687n == 0) {
                            i4 = gVar.f3697G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3703M0;
                                c0299d6.j0 = i4;
                                c0299d6.f3627e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3699I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3705O0;
                        }
                        c0299d6.j0 = i4;
                        c0299d6.f3627e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        c0299d6.f(c0299d6.f3604L, this.f3682g, this.f3684k);
                    }
                    if (c0299d5 != null) {
                        int i19 = gVar.f3707Q0;
                        C0298c c0298c4 = c0299d5.f3604L;
                        c0298c3.a(c0298c4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (c0298c3.h()) {
                                c0298c3.h = i20;
                            }
                        }
                        c0298c4.a(c0298c3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3684k;
                            if (c0298c4.h()) {
                                c0298c4.h = i21;
                            }
                        }
                    }
                    if (c0299d6 != c0299d4) {
                        C0298c c0298c5 = c0299d6.f3603K;
                        C0298c c0298c6 = c0299d6.f3601I;
                        if (z2) {
                            int i22 = gVar.f3708R0;
                            if (i22 == 0) {
                                c0298c5.a(c0298c2, 0);
                            } else if (i22 == 1) {
                                c0298c6.a(c0298c, 0);
                            } else if (i22 == 2) {
                                c0298c6.a(c0298c, 0);
                                c0298c5.a(c0298c2, 0);
                            }
                        } else {
                            int i23 = gVar.f3708R0;
                            if (i23 == 0) {
                                c0298c6.a(c0298c, 0);
                            } else if (i23 == 1) {
                                c0298c5.a(c0298c2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    c0298c6.a(this.d, this.h);
                                    c0298c5.a(this.f3681f, this.f3683j);
                                } else {
                                    c0298c6.a(c0298c, 0);
                                    c0298c5.a(c0298c2, 0);
                                }
                            }
                            c0299d5 = c0299d6;
                        }
                    }
                    c0299d5 = c0299d6;
                }
            }
            return;
        }
        C0299d c0299d7 = this.f3678b;
        c0299d7.j0 = gVar.f3695E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3707Q0;
        }
        C0298c c0298c7 = this.f3680e;
        C0298c c0298c8 = c0299d7.f3602J;
        c0298c8.a(c0298c7, i24);
        C0298c c0298c9 = c0299d7.f3604L;
        if (z3) {
            c0298c9.a(this.f3682g, this.f3684k);
        }
        if (i > 0) {
            this.f3680e.d.f3604L.a(c0298c8, 0);
        }
        if (gVar.f3709S0 == 3 && !c0299d7.f3598E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3687n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3717b1) {
                    break;
                }
                c0299d = gVar.f3716a1[i26];
                if (c0299d.f3598E) {
                    break;
                }
            }
        }
        c0299d = c0299d7;
        int i27 = 0;
        C0299d c0299d8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3687n + i28;
            if (i29 >= gVar.f3717b1) {
                return;
            }
            C0299d c0299d9 = gVar.f3716a1[i29];
            if (c0299d9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                C0298c c0298c10 = c0299d9.f3601I;
                if (i27 == 0) {
                    c0299d9.f(c0298c10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f3694D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f3700J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f3700J0;
                    }
                    if (this.f3687n == 0) {
                        int i31 = gVar.f3696F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3702L0 : gVar.f3702L0;
                            i7 = i31;
                            c0299d9.f3633i0 = i7;
                            c0299d9.f3625d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3698H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3704N0 : gVar.f3704N0;
                    }
                    c0299d9.f3633i0 = i7;
                    c0299d9.f3625d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    c0299d9.f(c0299d9.f3603K, this.f3681f, this.f3683j);
                } else {
                    i5 = i9;
                }
                if (c0299d8 != null) {
                    int i32 = gVar.f3706P0;
                    C0298c c0298c11 = c0299d8.f3603K;
                    c0298c10.a(c0298c11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (c0298c10.h()) {
                            c0298c10.h = i33;
                        }
                    }
                    c0298c11.a(c0298c10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3683j;
                        if (c0298c11.h()) {
                            c0298c11.h = i34;
                        }
                    }
                }
                if (c0299d9 != c0299d7) {
                    int i35 = gVar.f3709S0;
                    c2 = 3;
                    if (i35 == 3 && c0299d.f3598E && c0299d9 != c0299d && c0299d9.f3598E) {
                        c0299d9.f3605M.a(c0299d.f3605M, 0);
                    } else {
                        C0298c c0298c12 = c0299d9.f3602J;
                        if (i35 != 0) {
                            C0298c c0298c13 = c0299d9.f3604L;
                            if (i35 == 1) {
                                c0298c13.a(c0298c9, 0);
                            } else if (z4) {
                                c0298c12.a(this.f3680e, this.i);
                                c0298c13.a(this.f3682g, this.f3684k);
                            } else {
                                c0298c12.a(c0298c8, 0);
                                c0298c13.a(c0298c9, 0);
                            }
                        } else {
                            c0298c12.a(c0298c8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                c0299d8 = c0299d9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3677a == 1 ? this.f3686m - this.f3691r.f3707Q0 : this.f3686m;
    }

    public final int d() {
        return this.f3677a == 0 ? this.f3685l - this.f3691r.f3706P0 : this.f3685l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3689p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3688o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3691r;
            if (i6 >= i4 || (i2 = this.f3687n + i6) >= gVar.f3717b1) {
                break;
            }
            C0299d c0299d = gVar.f3716a1[i2];
            if (this.f3677a == 0) {
                if (c0299d != null) {
                    int[] iArr = c0299d.f3646p0;
                    if (iArr[0] == 3 && c0299d.f3648r == 0) {
                        gVar.V(1, i5, iArr[1], c0299d.k(), c0299d);
                    }
                }
            } else if (c0299d != null) {
                int[] iArr2 = c0299d.f3646p0;
                if (iArr2[1] == 3 && c0299d.f3649s == 0) {
                    gVar.V(iArr2[0], c0299d.q(), 1, i5, c0299d);
                }
            }
            i6++;
        }
        this.f3685l = 0;
        this.f3686m = 0;
        this.f3678b = null;
        this.f3679c = 0;
        int i7 = this.f3688o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3687n + i8;
            if (i9 >= gVar.f3717b1) {
                return;
            }
            C0299d c0299d2 = gVar.f3716a1[i9];
            if (this.f3677a == 0) {
                int q2 = c0299d2.q();
                int i10 = gVar.f3706P0;
                if (c0299d2.f3631g0 == 8) {
                    i10 = 0;
                }
                this.f3685l = q2 + i10 + this.f3685l;
                int T2 = gVar.T(c0299d2, this.f3690q);
                if (this.f3678b == null || this.f3679c < T2) {
                    this.f3678b = c0299d2;
                    this.f3679c = T2;
                    this.f3686m = T2;
                }
            } else {
                int U2 = gVar.U(c0299d2, this.f3690q);
                int T3 = gVar.T(c0299d2, this.f3690q);
                int i11 = gVar.f3707Q0;
                if (c0299d2.f3631g0 == 8) {
                    i11 = 0;
                }
                this.f3686m = T3 + i11 + this.f3686m;
                if (this.f3678b == null || this.f3679c < U2) {
                    this.f3678b = c0299d2;
                    this.f3679c = U2;
                    this.f3685l = U2;
                }
            }
        }
    }

    public final void f(int i, C0298c c0298c, C0298c c0298c2, C0298c c0298c3, C0298c c0298c4, int i2, int i3, int i4, int i5, int i6) {
        this.f3677a = i;
        this.d = c0298c;
        this.f3680e = c0298c2;
        this.f3681f = c0298c3;
        this.f3682g = c0298c4;
        this.h = i2;
        this.i = i3;
        this.f3683j = i4;
        this.f3684k = i5;
        this.f3690q = i6;
    }
}
