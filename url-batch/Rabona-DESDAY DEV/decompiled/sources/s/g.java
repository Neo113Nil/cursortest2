package s;

import java.util.ArrayList;
import q.C0289c;
import t.C0303b;
import v.C0325f;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3714A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0303b f3715B0;
    public C0325f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3716D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f3717E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3718F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3719G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3720H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3721I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f3722J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3723K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3724L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3725M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3726N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3727O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3728P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3729Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3730R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3731S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3732T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3733U0;
    public int V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3734W0;

    /* renamed from: X0, reason: collision with root package name */
    public C0299d[] f3735X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C0299d[] f3736Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3737Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C0299d[] f3738a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3739b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3740s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3741t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3742u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3743v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3744w0;
    public int x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3745y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3746z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.f3754r0; i++) {
            C0299d c0299d = this.f3753q0[i];
            if (c0299d != null) {
                c0299d.F = true;
            }
        }
    }

    public final int T(C0299d c0299d, int i) {
        if (c0299d == null) {
            return 0;
        }
        int[] iArr = c0299d.f3668p0;
        if (iArr[1] == 3) {
            int i2 = c0299d.f3671s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0299d.f3678z * i);
                if (i3 != c0299d.k()) {
                    c0299d.f3652g = true;
                    V(iArr[0], c0299d.q(), 1, i3, c0299d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0299d.k();
            }
            if (i2 == 3) {
                return (int) ((c0299d.q() * c0299d.f3637W) + 0.5f);
            }
        }
        return c0299d.k();
    }

    public final int U(C0299d c0299d, int i) {
        if (c0299d == null) {
            return 0;
        }
        int[] iArr = c0299d.f3668p0;
        if (iArr[0] == 3) {
            int i2 = c0299d.f3670r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0299d.f3675w * i);
                if (i3 != c0299d.q()) {
                    c0299d.f3652g = true;
                    V(1, i3, iArr[1], c0299d.k(), c0299d);
                }
                return i3;
            }
            if (i2 == 1) {
                return c0299d.q();
            }
            if (i2 == 3) {
                return (int) ((c0299d.k() * c0299d.f3637W) + 0.5f);
            }
        }
        return c0299d.q();
    }

    public final void V(int i, int i2, int i3, int i4, C0299d c0299d) {
        C0325f c0325f;
        C0299d c0299d2;
        while (true) {
            c0325f = this.C0;
            if (c0325f != null || (c0299d2 = this.f3634T) == null) {
                break;
            } else {
                this.C0 = ((C0300e) c0299d2).f3694u0;
            }
        }
        C0303b c0303b = this.f3715B0;
        c0303b.f3761a = i;
        c0303b.f3762b = i3;
        c0303b.f3763c = i2;
        c0303b.d = i4;
        c0325f.b(c0299d, c0303b);
        c0299d.O(c0303b.f3764e);
        c0299d.L(c0303b.f3765f);
        c0299d.f3620E = c0303b.h;
        c0299d.I(c0303b.f3766g);
    }

    @Override // s.C0299d
    public final void b(C0289c c0289c, boolean z2) {
        C0299d c0299d;
        float f2;
        int i;
        super.b(c0289c, z2);
        C0299d c0299d2 = this.f3634T;
        boolean z3 = c0299d2 != null && ((C0300e) c0299d2).f3695v0;
        int i2 = this.f3732T0;
        ArrayList arrayList = this.f3734W0;
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
            } else if (this.f3737Z0 != null && this.f3736Y0 != null && this.f3735X0 != null) {
                for (int i5 = 0; i5 < this.f3739b1; i5++) {
                    this.f3738a1[i5].D();
                }
                int[] iArr = this.f3737Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f3722J0;
                C0299d c0299d3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f3722J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    C0299d c0299d4 = this.f3736Y0[i];
                    if (c0299d4 != null && c0299d4.f3653g0 != 8) {
                        C0298c c0298c = c0299d4.f3623I;
                        if (i8 == 0) {
                            c0299d4.f(c0298c, this.f3623I, this.f3744w0);
                            c0299d4.f3655i0 = this.f3716D0;
                            c0299d4.f3647d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            c0299d4.f(c0299d4.f3625K, this.f3625K, this.x0);
                        }
                        if (i8 > 0 && c0299d3 != null) {
                            int i9 = this.f3728P0;
                            C0298c c0298c2 = c0299d3.f3625K;
                            c0299d4.f(c0298c, c0298c2, i9);
                            c0299d3.f(c0298c2, c0298c, 0);
                        }
                        c0299d3 = c0299d4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    C0299d c0299d5 = this.f3735X0[i10];
                    if (c0299d5 != null && c0299d5.f3653g0 != 8) {
                        C0298c c0298c3 = c0299d5.f3624J;
                        if (i10 == 0) {
                            c0299d5.f(c0298c3, this.f3624J, this.f3740s0);
                            c0299d5.j0 = this.f3717E0;
                            c0299d5.f3649e0 = this.f3723K0;
                        }
                        if (i10 == i7 - 1) {
                            c0299d5.f(c0299d5.f3626L, this.f3626L, this.f3741t0);
                        }
                        if (i10 > 0 && c0299d3 != null) {
                            int i11 = this.f3729Q0;
                            C0298c c0298c4 = c0299d3.f3626L;
                            c0299d5.f(c0298c3, c0298c4, i11);
                            c0299d3.f(c0298c4, c0298c3, 0);
                        }
                        c0299d3 = c0299d5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        C0299d[] c0299dArr = this.f3738a1;
                        if (i14 < c0299dArr.length && (c0299d = c0299dArr[i14]) != null && c0299d.f3653g0 != 8) {
                            C0299d c0299d6 = this.f3736Y0[i12];
                            C0299d c0299d7 = this.f3735X0[i13];
                            if (c0299d != c0299d6) {
                                c0299d.f(c0299d.f3623I, c0299d6.f3623I, 0);
                                c0299d.f(c0299d.f3625K, c0299d6.f3625K, 0);
                            }
                            if (c0299d != c0299d7) {
                                c0299d.f(c0299d.f3624J, c0299d7.f3624J, 0);
                                c0299d.f(c0299d.f3626L, c0299d7.f3626L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3745y0 = false;
    }
}
