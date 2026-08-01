package s;

import java.util.ArrayList;
import q.C0319c;
import t.C0331b;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f3600A0;

    /* renamed from: B0, reason: collision with root package name */
    public C0331b f3601B0;

    /* renamed from: C0, reason: collision with root package name */
    public v.f f3602C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f3603D0;
    public int E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f3604F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f3605G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f3606H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f3607I0;
    public float J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f3608K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f3609L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f3610M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f3611N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f3612O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f3613P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f3614Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f3615R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f3616S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f3617T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f3618U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f3619V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f3620W0;

    /* renamed from: X0, reason: collision with root package name */
    public d[] f3621X0;

    /* renamed from: Y0, reason: collision with root package name */
    public d[] f3622Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f3623Z0;

    /* renamed from: a1, reason: collision with root package name */
    public d[] f3624a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f3625b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f3626s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f3627t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f3628u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f3629v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f3630w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f3631x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f3632y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f3633z0;

    @Override // s.i
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            d dVar = this.f3639q0[i];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    public final int T(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f3555p0;
        if (iArr[1] == 3) {
            int i2 = dVar.f3558s;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f3565z * i);
                if (i3 != dVar.k()) {
                    dVar.f3539g = true;
                    V(iArr[0], dVar.q(), 1, i3, dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.k();
            }
            if (i2 == 3) {
                return (int) ((dVar.q() * dVar.f3524W) + 0.5f);
            }
        }
        return dVar.k();
    }

    public final int U(d dVar, int i) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f3555p0;
        if (iArr[0] == 3) {
            int i2 = dVar.f3557r;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (dVar.f3562w * i);
                if (i3 != dVar.q()) {
                    dVar.f3539g = true;
                    V(1, i3, iArr[1], dVar.k(), dVar);
                }
                return i3;
            }
            if (i2 == 1) {
                return dVar.q();
            }
            if (i2 == 3) {
                return (int) ((dVar.k() * dVar.f3524W) + 0.5f);
            }
        }
        return dVar.q();
    }

    public final void V(int i, int i2, int i3, int i4, d dVar) {
        v.f fVar;
        d dVar2;
        while (true) {
            fVar = this.f3602C0;
            if (fVar != null || (dVar2 = this.f3521T) == null) {
                break;
            } else {
                this.f3602C0 = ((e) dVar2).f3579u0;
            }
        }
        C0331b c0331b = this.f3601B0;
        c0331b.f3724a = i;
        c0331b.f3725b = i3;
        c0331b.f3726c = i2;
        c0331b.d = i4;
        fVar.b(dVar, c0331b);
        dVar.O(c0331b.f3727e);
        dVar.L(c0331b.f3728f);
        dVar.f3507E = c0331b.h;
        dVar.I(c0331b.f3729g);
    }

    @Override // s.d
    public final void b(C0319c c0319c, boolean z2) {
        d dVar;
        float f2;
        int i;
        super.b(c0319c, z2);
        d dVar2 = this.f3521T;
        boolean z3 = dVar2 != null && ((e) dVar2).f3580v0;
        int i2 = this.f3617T0;
        ArrayList arrayList = this.f3620W0;
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
            } else if (this.f3623Z0 != null && this.f3622Y0 != null && this.f3621X0 != null) {
                for (int i5 = 0; i5 < this.f3625b1; i5++) {
                    this.f3624a1[i5].D();
                }
                int[] iArr = this.f3623Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f3 = this.J0;
                d dVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z3) {
                        i = (i6 - i8) - 1;
                        f2 = 1.0f - this.J0;
                    } else {
                        f2 = f3;
                        i = i8;
                    }
                    d dVar4 = this.f3622Y0[i];
                    if (dVar4 != null && dVar4.f3540g0 != 8) {
                        c cVar = dVar4.f3510I;
                        if (i8 == 0) {
                            dVar4.f(cVar, this.f3510I, this.f3630w0);
                            dVar4.f3542i0 = this.f3603D0;
                            dVar4.f3534d0 = f2;
                        }
                        if (i8 == i6 - 1) {
                            dVar4.f(dVar4.f3512K, this.f3512K, this.f3631x0);
                        }
                        if (i8 > 0 && dVar3 != null) {
                            int i9 = this.f3613P0;
                            c cVar2 = dVar3.f3512K;
                            dVar4.f(cVar, cVar2, i9);
                            dVar3.f(cVar2, cVar, 0);
                        }
                        dVar3 = dVar4;
                    }
                    i8++;
                    f3 = f2;
                }
                for (int i10 = 0; i10 < i7; i10++) {
                    d dVar5 = this.f3621X0[i10];
                    if (dVar5 != null && dVar5.f3540g0 != 8) {
                        c cVar3 = dVar5.f3511J;
                        if (i10 == 0) {
                            dVar5.f(cVar3, this.f3511J, this.f3626s0);
                            dVar5.f3544j0 = this.E0;
                            dVar5.f3536e0 = this.f3608K0;
                        }
                        if (i10 == i7 - 1) {
                            dVar5.f(dVar5.f3513L, this.f3513L, this.f3627t0);
                        }
                        if (i10 > 0 && dVar3 != null) {
                            int i11 = this.f3614Q0;
                            c cVar4 = dVar3.f3513L;
                            dVar5.f(cVar3, cVar4, i11);
                            dVar3.f(cVar4, cVar3, 0);
                        }
                        dVar3 = dVar5;
                    }
                }
                for (int i12 = 0; i12 < i6; i12++) {
                    for (int i13 = 0; i13 < i7; i13++) {
                        int i14 = (i13 * i6) + i12;
                        if (this.f3619V0 == 1) {
                            i14 = (i12 * i7) + i13;
                        }
                        d[] dVarArr = this.f3624a1;
                        if (i14 < dVarArr.length && (dVar = dVarArr[i14]) != null && dVar.f3540g0 != 8) {
                            d dVar6 = this.f3622Y0[i12];
                            d dVar7 = this.f3621X0[i13];
                            if (dVar != dVar6) {
                                dVar.f(dVar.f3510I, dVar6.f3510I, 0);
                                dVar.f(dVar.f3512K, dVar6.f3512K, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.f3511J, dVar7.f3511J, 0);
                                dVar.f(dVar.f3513L, dVar7.f3513L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z3, true);
        }
        this.f3632y0 = false;
    }
}
