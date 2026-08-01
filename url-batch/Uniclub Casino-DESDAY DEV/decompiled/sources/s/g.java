package s;

import java.util.ArrayList;
import q.C0284c;
import t.C0300b;
import v.C0322f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3719A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0300b f3720B0;

    /* renamed from: C0, reason: collision with root package name */
    public C0322f f3721C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3722D0;
    public int E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3723F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3724G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3725H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3726I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3727J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3728K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3729L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3730M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3731N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3732O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3733P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3734Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3735R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3736S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3737T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3738U0;
    public int V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3739W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0296d[] f3740X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0296d[] f3741Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3742Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0296d[] f3743a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3744b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3745s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3746t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3747u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3748v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3749w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3750x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3751y0;
    public int z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f3759r0; i++) {
            C0296d c0296d = this.f3758q0[i];
            if (c0296d != null) {
                c0296d.F = true;
            }
        }
    }

    public final int T(C0296d c0296d, int i) {
        if (c0296d == null) {
            return 0;
        }
        int[] iArr = c0296d.f3673p0;
        if (iArr[1] == 3) {
            int i2 = c0296d.f3676s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0296d.f3683z * i);
                if (i3 != c0296d.k()) {
                    c0296d.f3657g = true;
                    V(iArr[0], c0296d.q(), 1, i3, c0296d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0296d.k();
            }
            if (i2 == 3) {
                return (int) ((c0296d.q() * c0296d.f3642W) + 0.5f);
            }
        }
        return c0296d.k();
    }

    public final int U(C0296d c0296d, int i) {
        if (c0296d == null) {
            return 0;
        }
        int[] iArr = c0296d.f3673p0;
        if (iArr[0] == 3) {
            int i2 = c0296d.f3675r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0296d.f3680w * i);
                if (i3 != c0296d.q()) {
                    c0296d.f3657g = true;
                    V(1, i3, iArr[1], c0296d.k(), c0296d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0296d.q();
            }
            if (i2 == 3) {
                return (int) ((c0296d.k() * c0296d.f3642W) + 0.5f);
            }
        }
        return c0296d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0296d c0296d) {
        C0322f c0322f;
        C0296d c0296d2;
        while (true) {
            c0322f = this.f3721C0;
            if (c0322f != null || (c0296d2 = this.f3639T) == null) {
                break;
            } else {
                this.f3721C0 = ((C0297e) c0296d2).f3699u0;
            }
        }
        C0300b c0300b = this.f3720B0;
        c0300b.f3765a = i;
        c0300b.f3766b = i3;
        c0300b.f3767c = i2;
        c0300b.d = i4;
        c0322f.b(c0296d, c0300b);
        c0296d.O(c0300b.f3768e);
        c0296d.L(c0300b.f3769f);
        c0296d.f3625E = c0300b.h;
        c0296d.I(c0300b.f3770g);
    }

    @Override // s.C0296d
    public final void b(C0284c c0284c, boolean z2) {
        C0296d c0296d;
        float f2;
        int i;
        super.b(c0284c, z2);
        C0296d c0296d2 = this.f3639T;
        boolean z3 = c0296d2 != null && ((C0297e) c0296d2).f3700v0;
        int i2 = this.f3737T0;
        ArrayList arrayList = this.f3739W0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((f) arrayList.get(i3)).b(i3, z3, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((f) arrayList.get(i4)).b(i4, z3, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.f3742Z0 != null && this.f3741Y0 != null && this.f3740X0 != null) {
                for (int i5 = 0; i5 < this.f3744b1; i5++) {
                    this.f3743a1[i5].D();
                }
                int[] iArr = this.f3742Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3727J0;
                C0296d c0296d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3727J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0296d c0296d4 = this.f3741Y0[i];
                    if (c0296d4 != null && c0296d4.f3658g0 != 8) {
                        C0295c c0295c = c0296d4.f3628I;
                        if (i8 == 0) {
                            c0296d4.f(c0295c, this.f3628I, this.f3749w0);
                            c0296d4.f3660i0 = this.f3722D0;
                            c0296d4.f3652d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0296d4.f(c0296d4.f3630K, this.f3630K, this.f3750x0);
                        }
                        if (i8 > 0 && c0296d3 != null) {
                            int i9 = this.f3733P0;
                            C0295c c0295c2 = c0296d3.f3630K;
                            c0296d4.f(c0295c, c0295c2, i9);
                            c0296d3.f(c0295c2, c0295c, 0);
                        }
                        c0296d3 = c0296d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0296d c0296d5 = this.f3740X0[i10];
                    if (c0296d5 != null && c0296d5.f3658g0 != 8) {
                        C0295c c0295c3 = c0296d5.f3629J;
                        if (i10 == 0) {
                            c0296d5.f(c0295c3, this.f3629J, this.f3745s0);
                            c0296d5.j0 = this.E0;
                            c0296d5.f3654e0 = this.f3728K0;
                        }
                        if (i10 == i7 - 1) {
                            c0296d5.f(c0296d5.f3631L, this.f3631L, this.f3746t0);
                        }
                        if (i10 > 0 && c0296d3 != null) {
                            int i11 = this.f3734Q0;
                            C0295c c0295c4 = c0296d3.f3631L;
                            c0296d5.f(c0295c3, c0295c4, i11);
                            c0296d3.f(c0295c4, c0295c3, 0);
                        }
                        c0296d3 = c0296d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0296d[] c0296dArr = this.f3743a1;
                        if (i14 < c0296dArr.length && (c0296d = c0296dArr[i14]) != null && c0296d.f3658g0 != 8) {
                            C0296d c0296d6 = this.f3741Y0[i12];
                            C0296d c0296d7 = this.f3740X0[i13];
                            if (c0296d != c0296d6) {
                                c0296d.f(c0296d.f3628I, c0296d6.f3628I, 0);
                                c0296d.f(c0296d.f3630K, c0296d6.f3630K, 0);
                            }
                            if (c0296d != c0296d7) {
                                c0296d.f(c0296d.f3629J, c0296d7.f3629J, 0);
                                c0296d.f(c0296d.f3631L, c0296d7.f3631L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3751y0 = false;
    }
}
