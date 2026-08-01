package s;

import X.V;
import q.C0283b;
import q.C0284c;
import q.C0287f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f3597s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3598t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3599u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f3600v0;

    @Override // s.C0296d
    public final boolean A() {
        return this.f3600v0;
    }

    @Override // s.C0296d
    public final boolean B() {
        return this.f3600v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z2 = true;
        int i4 = 0;
        while (true) {
            i = this.f3759r0;
            if (i4 >= i) {
                break;
            }
            C0296d c0296d = this.f3758q0[i4];
            if ((this.f3598t0 || c0296d.c()) && ((((i2 = this.f3597s0) == 0 || i2 == 1) && !c0296d.A()) || (((i3 = this.f3597s0) == 2 || i3 == 3) && !c0296d.B()))) {
                z2 = false;
            }
            i4++;
        }
        if (!z2 || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f3759r0; i6++) {
            C0296d c0296d2 = this.f3758q0[i6];
            if (this.f3598t0 || c0296d2.c()) {
                if (!z3) {
                    int i7 = this.f3597s0;
                    if (i7 == 0) {
                        i5 = c0296d2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = c0296d2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = c0296d2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = c0296d2.i(5).d();
                    }
                    z3 = true;
                }
                int i8 = this.f3597s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, c0296d2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c0296d2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c0296d2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c0296d2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.f3599u0;
        int i10 = this.f3597s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.f3600v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f3597s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // s.C0296d
    public final void b(C0284c c0284c, boolean z2) {
        boolean z3;
        int i;
        int i2;
        C0295c[] c0295cArr = this.f3636Q;
        C0295c c0295c = this.f3628I;
        c0295cArr[0] = c0295c;
        C0295c c0295c2 = this.f3629J;
        int i3 = 2;
        c0295cArr[2] = c0295c2;
        C0295c c0295c3 = this.f3630K;
        c0295cArr[1] = c0295c3;
        C0295c c0295c4 = this.f3631L;
        c0295cArr[3] = c0295c4;
        for (C0295c c0295c5 : c0295cArr) {
            c0295c5.i = c0284c.k(c0295c5);
        }
        int i4 = this.f3597s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0295c c0295c6 = c0295cArr[i4];
        if (!this.f3600v0) {
            T();
        }
        if (this.f3600v0) {
            this.f3600v0 = false;
            int i5 = this.f3597s0;
            if (i5 == 0 || i5 == 1) {
                c0284c.d(c0295c.i, this.f3644Y);
                c0284c.d(c0295c3.i, this.f3644Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0284c.d(c0295c2.i, this.f3645Z);
                    c0284c.d(c0295c4.i, this.f3645Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.f3759r0; i6++) {
            C0296d c0296d = this.f3758q0[i6];
            if ((this.f3598t0 || c0296d.c()) && ((((i2 = this.f3597s0) == 0 || i2 == 1) && c0296d.f3673p0[0] == 3 && c0296d.f3628I.f3619f != null && c0296d.f3630K.f3619f != null) || ((i2 == 2 || i2 == 3) && c0296d.f3673p0[1] == 3 && c0296d.f3629J.f3619f != null && c0296d.f3631L.f3619f != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z4 = c0295c.g() || c0295c3.g();
        boolean z5 = c0295c2.g() || c0295c4.g();
        int i7 = (z3 || !(((i = this.f3597s0) == 0 && z4) || ((i == 2 && z5) || ((i == 1 && z4) || (i == 3 && z5))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f3759r0) {
            C0296d c0296d2 = this.f3758q0[i8];
            if (this.f3598t0 || c0296d2.c()) {
                C0287f k2 = c0284c.k(c0296d2.f3636Q[this.f3597s0]);
                int i9 = this.f3597s0;
                C0295c c0295c7 = c0296d2.f3636Q[i9];
                c0295c7.i = k2;
                C0295c c0295c8 = c0295c7.f3619f;
                int i10 = (c0295c8 == null || c0295c8.d != this) ? 0 : c0295c7.f3620g;
                if (i9 == 0 || i9 == i3) {
                    C0287f c0287f = c0295c6.i;
                    int i11 = this.f3599u0 - i10;
                    C0283b l2 = c0284c.l();
                    C0287f m2 = c0284c.m();
                    m2.d = 0;
                    l2.c(c0287f, k2, m2, i11);
                    c0284c.c(l2);
                } else {
                    C0287f c0287f2 = c0295c6.i;
                    int i12 = this.f3599u0 + i10;
                    C0283b l3 = c0284c.l();
                    C0287f m3 = c0284c.m();
                    m3.d = 0;
                    l3.b(c0287f2, k2, m3, i12);
                    c0284c.c(l3);
                }
                c0284c.e(c0295c6.i, k2, this.f3599u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f3597s0;
        if (i13 == 0) {
            c0284c.e(c0295c3.i, c0295c.i, 0, 8);
            c0284c.e(c0295c.i, this.f3639T.f3630K.i, 0, 4);
            c0284c.e(c0295c.i, this.f3639T.f3628I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0284c.e(c0295c.i, c0295c3.i, 0, 8);
            c0284c.e(c0295c.i, this.f3639T.f3628I.i, 0, 4);
            c0284c.e(c0295c.i, this.f3639T.f3630K.i, 0, 0);
        } else if (i13 == 2) {
            c0284c.e(c0295c4.i, c0295c2.i, 0, 8);
            c0284c.e(c0295c2.i, this.f3639T.f3631L.i, 0, 4);
            c0284c.e(c0295c2.i, this.f3639T.f3629J.i, 0, 0);
        } else if (i13 == 3) {
            c0284c.e(c0295c2.i, c0295c4.i, 0, 8);
            c0284c.e(c0295c2.i, this.f3639T.f3629J.i, 0, 4);
            c0284c.e(c0295c2.i, this.f3639T.f3631L.i, 0, 0);
        }
    }

    @Override // s.C0296d
    public final boolean c() {
        return true;
    }

    @Override // s.C0296d
    public final String toString() {
        String str = "[Barrier] " + this.f3659h0 + " {";
        for (int i = 0; i < this.f3759r0; i++) {
            C0296d c0296d = this.f3758q0[i];
            if (i > 0) {
                str = V.e(str, ", ");
            }
            str = str + c0296d.f3659h0;
        }
        return V.e(str, "}");
    }
}
