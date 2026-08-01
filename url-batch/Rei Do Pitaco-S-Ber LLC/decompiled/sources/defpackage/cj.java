package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cj extends pm {
    public int A0;
    public q7 B0;
    public jc C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public tc[] X0;
    public tc[] Y0;
    public int[] Z0;
    public tc[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.pm
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            tc tcVar = this.q0[i];
            if (tcVar != null) {
                tcVar.F = true;
            }
        }
    }

    public final int T(tc tcVar, int i) {
        tc tcVar2;
        if (tcVar != null) {
            int[] iArr = tcVar.p0;
            if (iArr[1] == 3) {
                int i2 = tcVar.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (tcVar.z * i);
                        if (i3 != tcVar.k()) {
                            tcVar.g = true;
                            V(iArr[0], tcVar.q(), 1, i3, tcVar);
                        }
                        return i3;
                    }
                    tcVar2 = tcVar;
                    if (i2 == 1) {
                        return tcVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((tcVar2.q() * tcVar2.W) + 0.5f);
                    }
                }
            } else {
                tcVar2 = tcVar;
            }
            return tcVar2.k();
        }
        return 0;
    }

    public final int U(tc tcVar, int i) {
        tc tcVar2;
        if (tcVar != null) {
            int[] iArr = tcVar.p0;
            if (iArr[0] == 3) {
                int i2 = tcVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (tcVar.w * i);
                        if (i3 != tcVar.q()) {
                            tcVar.g = true;
                            V(1, i3, iArr[1], tcVar.k(), tcVar);
                        }
                        return i3;
                    }
                    tcVar2 = tcVar;
                    if (i2 == 1) {
                        return tcVar2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((tcVar2.k() * tcVar2.W) + 0.5f);
                    }
                }
            } else {
                tcVar2 = tcVar;
            }
            return tcVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, tc tcVar) {
        jc jcVar;
        tc tcVar2;
        q7 q7Var = this.B0;
        while (true) {
            jcVar = this.C0;
            if (jcVar != null || (tcVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((uc) tcVar2).u0;
            }
        }
        q7Var.a = i;
        q7Var.b = i3;
        q7Var.c = i2;
        q7Var.d = i4;
        jcVar.b(tcVar, q7Var);
        tcVar.O(q7Var.e);
        tcVar.L(q7Var.f);
        tcVar.E = q7Var.h;
        tcVar.I(q7Var.g);
    }

    @Override // defpackage.tc
    public final void b(vp vpVar, boolean z) {
        tc tcVar;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(vpVar, z);
        tc tcVar2 = this.T;
        boolean z2 = tcVar2 != null && ((uc) tcVar2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((bj) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((bj) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                tc tcVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    tc tcVar4 = this.Y0[i];
                    if (tcVar4 != null) {
                        ec ecVar = tcVar4.I;
                        if (tcVar4.g0 != 8) {
                            if (i8 == 0) {
                                tcVar4.f(ecVar, this.I, this.w0);
                                tcVar4.i0 = this.D0;
                                tcVar4.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                tcVar4.f(tcVar4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && tcVar3 != null) {
                                ec ecVar2 = tcVar3.K;
                                tcVar4.f(ecVar, ecVar2, this.P0);
                                tcVar3.f(ecVar2, ecVar, 0);
                            }
                            tcVar3 = tcVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    tc tcVar5 = this.X0[i9];
                    if (tcVar5 != null) {
                        ec ecVar3 = tcVar5.J;
                        if (tcVar5.g0 != 8) {
                            if (i9 == 0) {
                                tcVar5.f(ecVar3, this.J, this.s0);
                                tcVar5.j0 = this.E0;
                                tcVar5.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                tcVar5.f(tcVar5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && tcVar3 != null) {
                                ec ecVar4 = tcVar3.L;
                                tcVar5.f(ecVar3, ecVar4, this.Q0);
                                tcVar3.f(ecVar4, ecVar3, 0);
                            }
                            tcVar3 = tcVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        tc[] tcVarArr = this.a1;
                        if (i12 < tcVarArr.length && (tcVar = tcVarArr[i12]) != null && tcVar.g0 != 8) {
                            tc tcVar6 = this.Y0[i10];
                            tc tcVar7 = this.X0[i11];
                            if (tcVar != tcVar6) {
                                tcVar.f(tcVar.I, tcVar6.I, 0);
                                tcVar.f(tcVar.K, tcVar6.K, 0);
                            }
                            if (tcVar != tcVar7) {
                                tcVar.f(tcVar.J, tcVar7.J, 0);
                                tcVar.f(tcVar.L, tcVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((bj) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
