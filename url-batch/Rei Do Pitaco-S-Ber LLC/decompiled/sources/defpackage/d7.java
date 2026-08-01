package defpackage;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class d7 extends pm {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.tc
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.tc
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            tc tcVar = this.q0[i4];
            if ((this.t0 || tcVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !tcVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !tcVar.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            tc tcVar2 = this.q0[i6];
            if (this.t0 || tcVar2.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = tcVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = tcVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = tcVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = tcVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, tcVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, tcVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, tcVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, tcVar2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.tc
    public final void b(vp vpVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        ec[] ecVarArr = this.Q;
        ec ecVar = this.I;
        ecVarArr[0] = ecVar;
        int i3 = 2;
        ec ecVar2 = this.J;
        ecVarArr[2] = ecVar2;
        ec ecVar3 = this.K;
        ecVarArr[1] = ecVar3;
        ec ecVar4 = this.L;
        ecVarArr[3] = ecVar4;
        for (ec ecVar5 : ecVarArr) {
            ecVar5.i = vpVar.k(ecVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ec ecVar6 = ecVarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                vpVar.d(ecVar.i, this.Y);
                vpVar.d(ecVar3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    vpVar.d(ecVar2.i, this.Z);
                    vpVar.d(ecVar4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            tc tcVar = this.q0[i6];
            if ((this.t0 || tcVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && tcVar.p0[0] == 3 && tcVar.I.f != null && tcVar.K.f != null) || ((i2 == 2 || i2 == 3) && tcVar.p0[1] == 3 && tcVar.J.f != null && tcVar.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = ecVar.g() || ecVar3.g();
        boolean z4 = ecVar2.g() || ecVar4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            tc tcVar2 = this.q0[i8];
            if (this.t0 || tcVar2.c()) {
                o20 k = vpVar.k(tcVar2.Q[this.s0]);
                ec[] ecVarArr2 = tcVar2.Q;
                int i9 = this.s0;
                ec ecVar7 = ecVarArr2[i9];
                ecVar7.i = k;
                ec ecVar8 = ecVar7.f;
                int i10 = (ecVar8 == null || ecVar8.d != this) ? 0 : ecVar7.g;
                if (i9 == 0 || i9 == i3) {
                    o20 o20Var = ecVar6.i;
                    int i11 = this.u0 - i10;
                    m6 l = vpVar.l();
                    o20 m = vpVar.m();
                    m.i = 0;
                    l.c(o20Var, k, m, i11);
                    vpVar.c(l);
                } else {
                    o20 o20Var2 = ecVar6.i;
                    int i12 = this.u0 + i10;
                    m6 l2 = vpVar.l();
                    o20 m2 = vpVar.m();
                    m2.i = 0;
                    l2.b(o20Var2, k, m2, i12);
                    vpVar.c(l2);
                }
                vpVar.e(ecVar6.i, k, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            vpVar.e(ecVar3.i, ecVar.i, 0, 8);
            vpVar.e(ecVar.i, this.T.K.i, 0, 4);
            vpVar.e(ecVar.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            vpVar.e(ecVar.i, ecVar3.i, 0, 8);
            vpVar.e(ecVar.i, this.T.I.i, 0, 4);
            vpVar.e(ecVar.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            vpVar.e(ecVar4.i, ecVar2.i, 0, 8);
            vpVar.e(ecVar2.i, this.T.L.i, 0, 4);
            vpVar.e(ecVar2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            vpVar.e(ecVar2.i, ecVar4.i, 0, 8);
            vpVar.e(ecVar2.i, this.T.J.i, 0, 4);
            vpVar.e(ecVar2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.tc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.tc
    public final String toString() {
        String str = "[Barrier] " + this.h0 + " {";
        for (int i = 0; i < this.r0; i++) {
            tc tcVar = this.q0[i];
            if (i > 0) {
                str = str.concat(", ");
            }
            str = str + tcVar.h0;
        }
        return str.concat("}");
    }
}
