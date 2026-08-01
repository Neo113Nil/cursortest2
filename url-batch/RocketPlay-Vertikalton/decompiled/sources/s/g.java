package s;

import java.util.ArrayList;
import q.C0330c;
import t.C0365b;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f4051A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0365b f4052B0;
    public v.f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f4053D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f4054E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f4055F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f4056G0;
    public int H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f4057I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f4058J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f4059K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f4060L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f4061M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f4062N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f4063O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f4064P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f4065Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f4066R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f4067S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f4068T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f4069U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f4070V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f4071W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f4072X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f4073Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f4074Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f4075a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f4076b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f4077s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f4078t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f4079u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f4080v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f4081w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f4082x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f4083y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f4084z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            d dVar = this.f4090q0[i];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f4006p0;
        if (iArr[1] == 3) {
            int i2 = dVar.f4009s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f4016z * i);
                if (i3 != dVar.k()) {
                    dVar.f3990g = true;
                    V(iArr[0], dVar.q(), 1, i3, dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.k();
            }
            if (i2 == 3) {
                return (int) ((dVar.q() * dVar.f3975W) + 0.5f);
            }
        }
        return dVar.k();
    }

    public final int U(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f4006p0;
        if (iArr[0] == 3) {
            int i2 = dVar.f4008r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f4013w * i);
                if (i3 != dVar.q()) {
                    dVar.f3990g = true;
                    V(1, i3, iArr[1], dVar.k(), dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.q();
            }
            if (i2 == 3) {
                return (int) ((dVar.k() * dVar.f3975W) + 0.5f);
            }
        }
        return dVar.q();
    }

    public final void V(int i, int i2, int i3, int i4, d dVar) {
        v.f fVar;
        d dVar2;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (dVar2 = this.f3972T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f4030u0;
            }
        }
        C0365b c0365b = this.f4052B0;
        c0365b.f4119a = i;
        c0365b.f4120b = i3;
        c0365b.f4121c = i2;
        c0365b.d = i4;
        fVar.b(dVar, c0365b);
        dVar.O(c0365b.f4122e);
        dVar.L(c0365b.f4123f);
        dVar.f3958E = c0365b.h;
        dVar.I(c0365b.f4124g);
    }

    @Override // s.d
    public final void b(C0330c c0330c, boolean z2) {
        d dVar;
        float f2;
        int i;
        super.b(c0330c, z2);
        d dVar2 = this.f3972T;
        boolean z3 = dVar2 != null && ((e) dVar2).f4031v0;
        int i2 = this.f4068T0;
        ArrayList arrayList = this.f4071W0;
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
            } else if (this.f4074Z0 != null && this.f4073Y0 != null && this.f4072X0 != null) {
                for (int i5 = 0; i5 < this.f4076b1; i5++) {
                    this.f4075a1[i5].D();
                }
                int[] iArr = this.f4074Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.f4058J0;
                d dVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.f4058J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    d dVar4 = this.f4073Y0[i];
                    if (dVar4 != null && dVar4.f3991g0 != 8) {
                        c cVar = dVar4.f3961I;
                        if (i8 == 0) {
                            dVar4.f(cVar, this.f3961I, this.f4081w0);
                            dVar4.f3993i0 = this.f4053D0;
                            dVar4.f3985d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.f(dVar4.f3963K, this.f3963K, this.f4082x0);
                        }
                        if (i8 > 0 && dVar3 != null) {
                            int i9 = this.f4064P0;
                            c cVar2 = dVar3.f3963K;
                            dVar4.f(cVar, cVar2, i9);
                            dVar3.f(cVar2, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    d dVar5 = this.f4072X0[i10];
                    if (dVar5 != null && dVar5.f3991g0 != 8) {
                        c cVar3 = dVar5.f3962J;
                        if (i10 == 0) {
                            dVar5.f(cVar3, this.f3962J, this.f4077s0);
                            dVar5.f3995j0 = this.f4054E0;
                            dVar5.f3987e0 = this.f4059K0;
                        }
                        if (i10 == i7 - 1) {
                            dVar5.f(dVar5.f3964L, this.f3964L, this.f4078t0);
                        }
                        if (i10 > 0 && dVar3 != null) {
                            int i11 = this.f4065Q0;
                            c cVar4 = dVar3.f3964L;
                            dVar5.f(cVar3, cVar4, i11);
                            dVar3.f(cVar4, cVar3, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f4070V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        d[] dVarArr = this.f4075a1;
                        if (i14 < dVarArr.length && (dVar = dVarArr[i14]) != null && dVar.f3991g0 != 8) {
                            d dVar6 = this.f4073Y0[i12];
                            d dVar7 = this.f4072X0[i13];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f3961I, dVar6.f3961I, 0);
                                dVar.f(dVar.f3963K, dVar6.f3963K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f3962J, dVar7.f3962J, 0);
                                dVar.f(dVar.f3964L, dVar7.f3964L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f4083y0 = false;
    }
}
