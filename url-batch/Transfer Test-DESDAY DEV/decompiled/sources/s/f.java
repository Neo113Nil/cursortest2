package s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f3585a;
    public c d;

    /* renamed from: e, reason: collision with root package name */
    public c f3588e;

    /* renamed from: f, reason: collision with root package name */
    public c f3589f;

    /* renamed from: g, reason: collision with root package name */
    public c f3590g;
    public int h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f3591j;

    /* renamed from: k, reason: collision with root package name */
    public int f3592k;

    /* renamed from: q, reason: collision with root package name */
    public int f3598q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f3599r;

    /* renamed from: b, reason: collision with root package name */
    public d f3586b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f3587c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f3593l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3594m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f3595n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f3596o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f3597p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i2) {
        this.f3599r = gVar;
        this.h = 0;
        this.i = 0;
        this.f3591j = 0;
        this.f3592k = 0;
        this.f3598q = 0;
        this.f3585a = i;
        this.d = cVar;
        this.f3588e = cVar2;
        this.f3589f = cVar3;
        this.f3590g = cVar4;
        this.h = gVar.f3630w0;
        this.i = gVar.f3626s0;
        this.f3591j = gVar.f3631x0;
        this.f3592k = gVar.f3627t0;
        this.f3598q = i2;
    }

    public final void a(d dVar) {
        int i = this.f3585a;
        g gVar = this.f3599r;
        if (i == 0) {
            int U2 = gVar.U(dVar, this.f3598q);
            if (dVar.f3555p0[0] == 3) {
                this.f3597p++;
                U2 = 0;
            }
            this.f3593l = U2 + (dVar.f3540g0 != 8 ? gVar.f3613P0 : 0) + this.f3593l;
            int T2 = gVar.T(dVar, this.f3598q);
            if (this.f3586b == null || this.f3587c < T2) {
                this.f3586b = dVar;
                this.f3587c = T2;
                this.f3594m = T2;
            }
        } else {
            int U3 = gVar.U(dVar, this.f3598q);
            int T3 = gVar.T(dVar, this.f3598q);
            if (dVar.f3555p0[1] == 3) {
                this.f3597p++;
                T3 = 0;
            }
            this.f3594m = T3 + (dVar.f3540g0 != 8 ? gVar.f3614Q0 : 0) + this.f3594m;
            if (this.f3586b == null || this.f3587c < U3) {
                this.f3586b = dVar;
                this.f3587c = U3;
                this.f3593l = U3;
            }
        }
        this.f3596o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        d dVar;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f3596o;
        int i10 = 0;
        while (true) {
            gVar = this.f3599r;
            if (i10 >= i9 || (i8 = this.f3595n + i10) >= gVar.f3625b1) {
                break;
            }
            d dVar2 = gVar.f3624a1[i8];
            if (dVar2 != null) {
                dVar2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f3586b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f3595n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f3625b1) {
                break;
            }
            d dVar3 = gVar.f3624a1[i14];
            if (dVar3 != null && dVar3.f3540g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f3585a != 0) {
            d dVar4 = this.f3586b;
            dVar4.f3542i0 = gVar.f3603D0;
            int i15 = this.h;
            if (i > 0) {
                i15 += gVar.f3613P0;
            }
            c cVar = dVar4.f3510I;
            c cVar2 = dVar4.f3512K;
            if (z2) {
                cVar2.a(this.f3589f, i15);
                if (z3) {
                    cVar.a(this.d, this.f3591j);
                }
                if (i > 0) {
                    this.f3589f.d.f3510I.a(cVar2, 0);
                }
            } else {
                cVar.a(this.d, i15);
                if (z3) {
                    cVar2.a(this.f3589f, this.f3591j);
                }
                if (i > 0) {
                    this.d.d.f3512K.a(cVar, 0);
                }
            }
            d dVar5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f3595n + i16;
                if (i17 >= gVar.f3625b1) {
                    return;
                }
                d dVar6 = gVar.f3624a1[i17];
                if (dVar6 != null) {
                    c cVar3 = dVar6.f3511J;
                    if (i16 == 0) {
                        dVar6.f(cVar3, this.f3588e, this.i);
                        int i18 = gVar.E0;
                        float f5 = gVar.f3608K0;
                        if (this.f3595n == 0) {
                            i4 = gVar.f3605G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f3610M0;
                                dVar6.f3544j0 = i4;
                                dVar6.f3536e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f3607I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f3612O0;
                        }
                        dVar6.f3544j0 = i4;
                        dVar6.f3536e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        dVar6.f(dVar6.f3513L, this.f3590g, this.f3592k);
                    }
                    if (dVar5 != null) {
                        int i19 = gVar.f3614Q0;
                        c cVar4 = dVar5.f3513L;
                        cVar3.a(cVar4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (cVar3.h()) {
                                cVar3.h = i20;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f3592k;
                            if (cVar4.h()) {
                                cVar4.h = i21;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        c cVar5 = dVar6.f3512K;
                        c cVar6 = dVar6.f3510I;
                        if (z2) {
                            int i22 = gVar.f3615R0;
                            if (i22 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i22 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i22 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                        } else {
                            int i23 = gVar.f3615R0;
                            if (i23 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i23 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    cVar6.a(this.d, this.h);
                                    cVar5.a(this.f3589f, this.f3591j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                            dVar5 = dVar6;
                        }
                    }
                    dVar5 = dVar6;
                }
            }
            return;
        }
        d dVar7 = this.f3586b;
        dVar7.f3544j0 = gVar.E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f3614Q0;
        }
        c cVar7 = this.f3588e;
        c cVar8 = dVar7.f3511J;
        cVar8.a(cVar7, i24);
        c cVar9 = dVar7.f3513L;
        if (z3) {
            cVar9.a(this.f3590g, this.f3592k);
        }
        if (i > 0) {
            this.f3588e.d.f3513L.a(cVar8, 0);
        }
        if (gVar.f3616S0 == 3 && !dVar7.f3507E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f3595n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f3625b1) {
                    break;
                }
                dVar = gVar.f3624a1[i26];
                if (dVar.f3507E) {
                    break;
                }
            }
        }
        dVar = dVar7;
        int i27 = 0;
        d dVar8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f3595n + i28;
            if (i29 >= gVar.f3625b1) {
                return;
            }
            d dVar9 = gVar.f3624a1[i29];
            if (dVar9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                c cVar10 = dVar9.f3510I;
                if (i27 == 0) {
                    dVar9.f(cVar10, this.d, this.h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f3603D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.J0;
                    }
                    if (this.f3595n == 0) {
                        int i31 = gVar.f3604F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f3609L0 : gVar.f3609L0;
                            i7 = i31;
                            dVar9.f3542i0 = i7;
                            dVar9.f3534d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.f3606H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f3611N0 : gVar.f3611N0;
                    }
                    dVar9.f3542i0 = i7;
                    dVar9.f3534d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    dVar9.f(dVar9.f3512K, this.f3589f, this.f3591j);
                } else {
                    i5 = i9;
                }
                if (dVar8 != null) {
                    int i32 = gVar.f3613P0;
                    c cVar11 = dVar8.f3512K;
                    cVar10.a(cVar11, i32);
                    if (i27 == i11) {
                        int i33 = this.h;
                        if (cVar10.h()) {
                            cVar10.h = i33;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.f3591j;
                        if (cVar11.h()) {
                            cVar11.h = i34;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i35 = gVar.f3616S0;
                    c2 = 3;
                    if (i35 == 3 && dVar.f3507E && dVar9 != dVar && dVar9.f3507E) {
                        dVar9.f3514M.a(dVar.f3514M, 0);
                    } else {
                        c cVar12 = dVar9.f3511J;
                        if (i35 != 0) {
                            c cVar13 = dVar9.f3513L;
                            if (i35 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z4) {
                                cVar12.a(this.f3588e, this.i);
                                cVar13.a(this.f3590g, this.f3592k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                dVar8 = dVar9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f3585a == 1 ? this.f3594m - this.f3599r.f3614Q0 : this.f3594m;
    }

    public final int d() {
        return this.f3585a == 0 ? this.f3593l - this.f3599r.f3613P0 : this.f3593l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f3597p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f3596o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f3599r;
            if (i6 >= i4 || (i2 = this.f3595n + i6) >= gVar.f3625b1) {
                break;
            }
            d dVar = gVar.f3624a1[i2];
            if (this.f3585a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f3555p0;
                    if (iArr[0] == 3 && dVar.f3557r == 0) {
                        gVar.V(1, i5, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f3555p0;
                if (iArr2[1] == 3 && dVar.f3558s == 0) {
                    gVar.V(iArr2[0], dVar.q(), 1, i5, dVar);
                }
            }
            i6++;
        }
        this.f3593l = 0;
        this.f3594m = 0;
        this.f3586b = null;
        this.f3587c = 0;
        int i7 = this.f3596o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f3595n + i8;
            if (i9 >= gVar.f3625b1) {
                return;
            }
            d dVar2 = gVar.f3624a1[i9];
            if (this.f3585a == 0) {
                int q2 = dVar2.q();
                int i10 = gVar.f3613P0;
                if (dVar2.f3540g0 == 8) {
                    i10 = 0;
                }
                this.f3593l = q2 + i10 + this.f3593l;
                int T2 = gVar.T(dVar2, this.f3598q);
                if (this.f3586b == null || this.f3587c < T2) {
                    this.f3586b = dVar2;
                    this.f3587c = T2;
                    this.f3594m = T2;
                }
            } else {
                int U2 = gVar.U(dVar2, this.f3598q);
                int T3 = gVar.T(dVar2, this.f3598q);
                int i11 = gVar.f3614Q0;
                if (dVar2.f3540g0 == 8) {
                    i11 = 0;
                }
                this.f3594m = T3 + i11 + this.f3594m;
                if (this.f3586b == null || this.f3587c < U2) {
                    this.f3586b = dVar2;
                    this.f3587c = U2;
                    this.f3593l = U2;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i2, int i3, int i4, int i5, int i6) {
        this.f3585a = i;
        this.d = cVar;
        this.f3588e = cVar2;
        this.f3589f = cVar3;
        this.f3590g = cVar4;
        this.h = i2;
        this.i = i3;
        this.f3591j = i4;
        this.f3592k = i5;
        this.f3598q = i6;
    }
}
