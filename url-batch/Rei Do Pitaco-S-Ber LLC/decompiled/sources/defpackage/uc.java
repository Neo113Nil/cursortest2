package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class uc extends tc {
    public int A0;
    public k9[] B0;
    public k9[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public WeakReference J0;
    public final HashSet K0;
    public final q7 L0;
    public ArrayList q0 = new ArrayList();
    public final y5 r0;
    public final ye s0;
    public int t0;
    public jc u0;
    public boolean v0;
    public final vp w0;
    public int x0;
    public int y0;
    public int z0;

    public uc() {
        y5 y5Var = new y5();
        y5Var.a = new ArrayList();
        y5Var.b = new q7();
        y5Var.c = this;
        this.r0 = y5Var;
        ye yeVar = new ye();
        yeVar.b = true;
        yeVar.c = true;
        yeVar.e = new ArrayList();
        new ArrayList();
        yeVar.f = null;
        yeVar.g = new q7();
        yeVar.h = new ArrayList();
        yeVar.a = this;
        yeVar.d = this;
        this.s0 = yeVar;
        this.u0 = null;
        this.v0 = false;
        this.w0 = new vp();
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = new k9[4];
        this.C0 = new k9[4];
        this.D0 = 257;
        this.E0 = false;
        this.F0 = false;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.K0 = new HashSet();
        this.L0 = new q7();
    }

    public static void V(tc tcVar, jc jcVar, q7 q7Var) {
        int i;
        int i2;
        if (jcVar == null) {
            return;
        }
        int i3 = tcVar.g0;
        int[] iArr = tcVar.t;
        if (i3 == 8 || (tcVar instanceof gm) || (tcVar instanceof d7)) {
            q7Var.e = 0;
            q7Var.f = 0;
            return;
        }
        int[] iArr2 = tcVar.p0;
        q7Var.a = iArr2[0];
        q7Var.b = iArr2[1];
        q7Var.c = tcVar.q();
        q7Var.d = tcVar.k();
        q7Var.i = false;
        q7Var.j = 0;
        boolean z = q7Var.a == 3;
        boolean z2 = q7Var.b == 3;
        boolean z3 = z && tcVar.W > 0.0f;
        boolean z4 = z2 && tcVar.W > 0.0f;
        if (z && tcVar.t(0) && tcVar.r == 0 && !z3) {
            q7Var.a = 2;
            if (z2 && tcVar.s == 0) {
                q7Var.a = 1;
            }
            z = false;
        }
        if (z2 && tcVar.t(1) && tcVar.s == 0 && !z4) {
            q7Var.b = 2;
            if (z && tcVar.r == 0) {
                q7Var.b = 1;
            }
            z2 = false;
        }
        if (tcVar.A()) {
            q7Var.a = 1;
            z = false;
        }
        if (tcVar.B()) {
            q7Var.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                q7Var.a = 1;
            } else if (!z2) {
                if (q7Var.b == 1) {
                    i2 = q7Var.d;
                } else {
                    q7Var.a = 2;
                    jcVar.b(tcVar, q7Var);
                    i2 = q7Var.f;
                }
                q7Var.a = 1;
                q7Var.c = (int) (tcVar.W * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                q7Var.b = 1;
            } else if (!z) {
                if (q7Var.a == 1) {
                    i = q7Var.c;
                } else {
                    q7Var.b = 2;
                    jcVar.b(tcVar, q7Var);
                    i = q7Var.e;
                }
                q7Var.b = 1;
                int i4 = tcVar.X;
                float f = tcVar.W;
                if (i4 == -1) {
                    q7Var.d = (int) (i / f);
                } else {
                    q7Var.d = (int) (f * i);
                }
            }
        }
        jcVar.b(tcVar, q7Var);
        tcVar.O(q7Var.e);
        tcVar.L(q7Var.f);
        tcVar.E = q7Var.h;
        tcVar.I(q7Var.g);
        q7Var.j = 0;
    }

    @Override // defpackage.tc
    public final void C() {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
    }

    @Override // defpackage.tc
    public final void F(y5 y5Var) {
        super.F(y5Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((tc) this.q0.get(i)).F(y5Var);
        }
    }

    @Override // defpackage.tc
    public final void P(boolean z, boolean z2) {
        super.P(z, z2);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((tc) this.q0.get(i)).P(z, z2);
        }
    }

    public final void R(tc tcVar, int i) {
        if (i == 0) {
            int i2 = this.z0 + 1;
            k9[] k9VarArr = this.C0;
            if (i2 >= k9VarArr.length) {
                this.C0 = (k9[]) Arrays.copyOf(k9VarArr, k9VarArr.length * 2);
            }
            k9[] k9VarArr2 = this.C0;
            int i3 = this.z0;
            k9VarArr2[i3] = new k9(tcVar, 0, this.v0);
            this.z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.A0 + 1;
            k9[] k9VarArr3 = this.B0;
            if (i4 >= k9VarArr3.length) {
                this.B0 = (k9[]) Arrays.copyOf(k9VarArr3, k9VarArr3.length * 2);
            }
            k9[] k9VarArr4 = this.B0;
            int i5 = this.A0;
            k9VarArr4[i5] = new k9(tcVar, 1, this.v0);
            this.A0 = i5 + 1;
        }
    }

    public final void S(vp vpVar) {
        uc ucVar;
        vp vpVar2;
        boolean W = W(64);
        b(vpVar, W);
        int size = this.q0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            tc tcVar = (tc) this.q0.get(i);
            boolean[] zArr = tcVar.S;
            zArr[0] = false;
            zArr[1] = false;
            if (tcVar instanceof d7) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                tc tcVar2 = (tc) this.q0.get(i2);
                if (tcVar2 instanceof d7) {
                    d7 d7Var = (d7) tcVar2;
                    for (int i3 = 0; i3 < d7Var.r0; i3++) {
                        tc tcVar3 = d7Var.q0[i3];
                        if (d7Var.t0 || tcVar3.c()) {
                            int i4 = d7Var.s0;
                            if (i4 == 0 || i4 == 1) {
                                tcVar3.S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                tcVar3.S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            tc tcVar4 = (tc) this.q0.get(i5);
            tcVar4.getClass();
            boolean z2 = tcVar4 instanceof cj;
            if (z2 || (tcVar4 instanceof gm)) {
                if (z2) {
                    hashSet.add(tcVar4);
                } else {
                    tcVar4.b(vpVar, W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cj cjVar = (cj) ((tc) it.next());
                for (int i6 = 0; i6 < cjVar.r0; i6++) {
                    if (hashSet.contains(cjVar.q0[i6])) {
                        cjVar.b(vpVar, W);
                        hashSet.remove(cjVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((tc) it2.next()).b(vpVar, W);
                }
                hashSet.clear();
            }
        }
        if (vp.q) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                tc tcVar5 = (tc) this.q0.get(i7);
                tcVar5.getClass();
                if (!(tcVar5 instanceof cj) && !(tcVar5 instanceof gm)) {
                    hashSet2.add(tcVar5);
                }
            }
            ucVar = this;
            vpVar2 = vpVar;
            ucVar.a(this, vpVar2, hashSet2, this.p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                tc tcVar6 = (tc) it3.next();
                g8.o(ucVar, vpVar2, tcVar6);
                tcVar6.b(vpVar2, W);
            }
        } else {
            ucVar = this;
            vpVar2 = vpVar;
            for (int i8 = 0; i8 < size; i8++) {
                tc tcVar7 = (tc) ucVar.q0.get(i8);
                if (tcVar7 instanceof uc) {
                    int[] iArr = tcVar7.p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        tcVar7.M(1);
                    }
                    if (i10 == 2) {
                        tcVar7.N(1);
                    }
                    tcVar7.b(vpVar2, W);
                    if (i9 == 2) {
                        tcVar7.M(i9);
                    }
                    if (i10 == 2) {
                        tcVar7.N(i10);
                    }
                } else {
                    g8.o(ucVar, vpVar2, tcVar7);
                    if (!(tcVar7 instanceof cj) && !(tcVar7 instanceof gm)) {
                        tcVar7.b(vpVar2, W);
                    }
                }
            }
        }
        if (ucVar.z0 > 0) {
            m60.c(ucVar, vpVar2, null, 0);
        }
        if (ucVar.A0 > 0) {
            m60.c(ucVar, vpVar2, null, 1);
        }
    }

    public final boolean T(int i, boolean z) {
        boolean z2;
        ye yeVar = this.s0;
        ArrayList arrayList = yeVar.e;
        uc ucVar = yeVar.a;
        boolean z3 = false;
        int j = ucVar.j(0);
        int j2 = ucVar.j(1);
        int r = ucVar.r();
        int s = ucVar.s();
        if (z && (j == 2 || j2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                w90 w90Var = (w90) obj;
                if (w90Var.f == i && !w90Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && j == 2) {
                    ucVar.M(1);
                    ucVar.O(yeVar.d(ucVar, 0));
                    ucVar.d.e.d(ucVar.q());
                }
            } else if (z && j2 == 2) {
                ucVar.N(1);
                ucVar.L(yeVar.d(ucVar, 1));
                ucVar.e.e.d(ucVar.k());
            }
        }
        int[] iArr = ucVar.p0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int q = ucVar.q() + r;
                ucVar.d.i.d(q);
                ucVar.d.e.d(q - r);
                z2 = true;
            }
            z2 = false;
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int k = ucVar.k() + s;
                ucVar.e.i.d(k);
                ucVar.e.e.d(k - s);
                z2 = true;
            }
            z2 = false;
        }
        yeVar.g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            w90 w90Var2 = (w90) obj2;
            if (w90Var2.f == i && (w90Var2.b != ucVar || w90Var2.g)) {
                w90Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                z3 = true;
                break;
            }
            Object obj3 = arrayList.get(i6);
            i6++;
            w90 w90Var3 = (w90) obj3;
            if (w90Var3.f == i && (z2 || w90Var3.b != ucVar)) {
                if (!w90Var3.h.j) {
                    break;
                }
                if (!w90Var3.i.j) {
                    break;
                }
                if (!(w90Var3 instanceof l9) && !w90Var3.e.j) {
                    break;
                }
            }
        }
        ucVar.M(j);
        ucVar.N(j2);
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0827 A[LOOP:14: B:278:0x0825->B:279:0x0827, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x060d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0637  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U() {
        boolean[] zArr;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        int i4;
        ec ecVar;
        ec ecVar2;
        boolean z;
        char c;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        ec ecVar3;
        boolean z4;
        boolean z5;
        int max;
        ?? r8;
        boolean z6;
        int max2;
        boolean z7;
        int i7;
        int i8;
        int max3;
        int max4;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        ec ecVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        char c2;
        v90 v90Var;
        v90 v90Var2;
        int i13;
        int i14;
        int b;
        int b2;
        v90 v90Var3;
        v90 v90Var4;
        int i15;
        boolean z8;
        boolean[] zArr2 = g8.d;
        this.Y = 0;
        this.Z = 0;
        this.E0 = false;
        this.F0 = false;
        int size = this.q0.size();
        int max5 = Math.max(0, q());
        int max6 = Math.max(0, k());
        int[] iArr = this.p0;
        int i16 = iArr[1];
        int i17 = iArr[0];
        int i18 = this.t0;
        ec ecVar5 = this.J;
        ec ecVar6 = this.I;
        if (i18 == 0 && g8.v(this.D0, 1)) {
            jc jcVar = this.u0;
            int i19 = iArr[0];
            int i20 = iArr[1];
            E();
            ArrayList arrayList = this.q0;
            int size2 = arrayList.size();
            for (int i21 = 0; i21 < size2; i21++) {
                ((tc) arrayList.get(i21)).E();
            }
            boolean z9 = this.v0;
            zArr = zArr2;
            if (i19 == 1) {
                J(0, q());
            } else {
                ecVar6.l(0);
                this.Y = 0;
            }
            int i22 = 0;
            boolean z10 = false;
            boolean z11 = false;
            while (i22 < size2) {
                int i23 = i22;
                tc tcVar = (tc) arrayList.get(i22);
                int[] iArr2 = iArr;
                if (tcVar instanceof gm) {
                    gm gmVar = (gm) tcVar;
                    z8 = z10;
                    if (gmVar.u0 == 1) {
                        int i24 = gmVar.r0;
                        if (i24 != -1) {
                            gmVar.R(i24);
                        } else if (gmVar.s0 != -1 && A()) {
                            gmVar.R(q() - gmVar.s0);
                        } else if (A()) {
                            gmVar.R((int) ((gmVar.q0 * q()) + 0.5f));
                        }
                        z8 = true;
                    }
                } else {
                    z8 = z10;
                    if ((tcVar instanceof d7) && ((d7) tcVar).U() == 0) {
                        z10 = z8;
                        z11 = true;
                        i22 = i23 + 1;
                        iArr = iArr2;
                    }
                }
                z10 = z8;
                i22 = i23 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z10) {
                for (int i25 = 0; i25 < size2; i25 = i15 + 1) {
                    tc tcVar2 = (tc) arrayList.get(i25);
                    if (tcVar2 instanceof gm) {
                        gm gmVar2 = (gm) tcVar2;
                        i15 = i25;
                        if (gmVar2.u0 == 1) {
                            vv.x(0, jcVar, gmVar2, z9);
                        }
                    } else {
                        i15 = i25;
                    }
                }
            }
            vv.x(0, jcVar, this, z9);
            if (z11) {
                for (int i26 = 0; i26 < size2; i26++) {
                    tc tcVar3 = (tc) arrayList.get(i26);
                    if (tcVar3 instanceof d7) {
                        d7 d7Var = (d7) tcVar3;
                        if (d7Var.U() == 0 && d7Var.T()) {
                            vv.x(1, jcVar, d7Var, z9);
                        }
                    }
                }
            }
            if (i20 == 1) {
                K(0, k());
            } else {
                ecVar5.l(0);
                this.Z = 0;
            }
            int i27 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i27 < size2) {
                tc tcVar4 = (tc) arrayList.get(i27);
                int i28 = i27;
                if (tcVar4 instanceof gm) {
                    gm gmVar3 = (gm) tcVar4;
                    if (gmVar3.u0 == 0) {
                        int i29 = gmVar3.r0;
                        if (i29 != -1) {
                            gmVar3.R(i29);
                        } else if (gmVar3.s0 != -1 && B()) {
                            gmVar3.R(k() - gmVar3.s0);
                        } else if (B()) {
                            gmVar3.R((int) ((gmVar3.q0 * k()) + 0.5f));
                        }
                        z12 = true;
                    }
                } else if ((tcVar4 instanceof d7) && ((d7) tcVar4).U() == 1) {
                    z13 = true;
                }
                i27 = i28 + 1;
            }
            if (z12) {
                for (int i30 = 0; i30 < size2; i30++) {
                    tc tcVar5 = (tc) arrayList.get(i30);
                    if (tcVar5 instanceof gm) {
                        gm gmVar4 = (gm) tcVar5;
                        if (gmVar4.u0 == 0) {
                            vv.a0(1, jcVar, gmVar4);
                        }
                    }
                }
            }
            vv.a0(0, jcVar, this);
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    tc tcVar6 = (tc) arrayList.get(i31);
                    if (tcVar6 instanceof d7) {
                        d7 d7Var2 = (d7) tcVar6;
                        if (d7Var2.U() == 1 && d7Var2.T()) {
                            vv.a0(1, jcVar, d7Var2);
                        }
                    }
                }
            }
            for (int i32 = 0; i32 < size2; i32++) {
                tc tcVar7 = (tc) arrayList.get(i32);
                if (tcVar7.z() && vv.d(tcVar7)) {
                    V(tcVar7, jcVar, vv.b);
                    if (!(tcVar7 instanceof gm)) {
                        vv.x(0, jcVar, tcVar7, z9);
                        vv.a0(0, jcVar, tcVar7);
                    } else if (((gm) tcVar7).u0 == 0) {
                        vv.a0(0, jcVar, tcVar7);
                    } else {
                        vv.x(0, jcVar, tcVar7, z9);
                    }
                }
            }
            for (int i33 = 0; i33 < size; i33++) {
                tc tcVar8 = (tc) this.q0.get(i33);
                if (tcVar8.z() && !(tcVar8 instanceof gm) && !(tcVar8 instanceof d7) && !(tcVar8 instanceof cj) && !tcVar8.F) {
                    int j = tcVar8.j(0);
                    int j2 = tcVar8.j(1);
                    if (j != 3 || tcVar8.r == 1 || j2 != 3 || tcVar8.s == 1) {
                        V(tcVar8, this.u0, new q7());
                    }
                }
            }
        } else {
            zArr = zArr2;
            objArr = iArr;
        }
        vp vpVar = this.w0;
        if (size <= 2 || !((i17 == 2 || i16 == 2) && g8.v(this.D0, 1024))) {
            i = max5;
            i2 = size;
            i3 = i16;
            i4 = i17;
            ecVar = ecVar5;
            ecVar2 = ecVar6;
        } else {
            jc jcVar2 = this.u0;
            ArrayList arrayList2 = this.q0;
            int size3 = arrayList2.size();
            int i34 = 0;
            while (i34 < size3) {
                tc tcVar9 = (tc) arrayList2.get(i34);
                char c3 = objArr[0];
                char c4 = objArr[1];
                int i35 = i34;
                int[] iArr3 = tcVar9.p0;
                ecVar2 = ecVar6;
                if (!g8.l0(c3, c4, iArr3[0], iArr3[1]) || (tcVar9 instanceof cj)) {
                    i9 = max5;
                    i2 = size;
                    i10 = max6;
                    i11 = i16;
                    i12 = i17;
                    ecVar = ecVar5;
                    break;
                }
                i34 = i35 + 1;
                ecVar6 = ecVar2;
            }
            ecVar2 = ecVar6;
            i2 = size;
            ecVar = ecVar5;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = i36;
                tc tcVar10 = (tc) arrayList2.get(i36);
                int i38 = max6;
                char c5 = objArr[0];
                int i39 = i16;
                char c6 = objArr[1];
                int i40 = max5;
                int[] iArr4 = tcVar10.p0;
                int i41 = i17;
                if (!g8.l0(c5, c6, iArr4[0], iArr4[1])) {
                    V(tcVar10, jcVar2, this.L0);
                }
                boolean z14 = tcVar10 instanceof gm;
                if (z14) {
                    gm gmVar5 = (gm) tcVar10;
                    if (gmVar5.u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(gmVar5);
                    }
                    if (gmVar5.u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(gmVar5);
                    }
                }
                if (tcVar10 instanceof pm) {
                    if (tcVar10 instanceof d7) {
                        d7 d7Var3 = (d7) tcVar10;
                        if (d7Var3.U() == 0) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(d7Var3);
                        }
                        if (d7Var3.U() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(d7Var3);
                        }
                    } else {
                        pm pmVar = (pm) tcVar10;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(pmVar);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(pmVar);
                    }
                }
                if (tcVar10.I.f == null && tcVar10.K.f == null && !z14 && !(tcVar10 instanceof d7)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(tcVar10);
                }
                if (tcVar10.J.f == null && tcVar10.L.f == null && tcVar10.M.f == null && !z14 && !(tcVar10 instanceof d7)) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(tcVar10);
                }
                i36 = i37 + 1;
                max6 = i38;
                i16 = i39;
                max5 = i40;
                i17 = i41;
            }
            i9 = max5;
            i10 = max6;
            i11 = i16;
            i12 = i17;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                int size4 = arrayList3.size();
                int i42 = 0;
                while (i42 < size4) {
                    Object obj = arrayList3.get(i42);
                    i42++;
                    g8.x((gm) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i43 = 0;
                while (i43 < size5) {
                    Object obj2 = arrayList5.get(i43);
                    i43++;
                    pm pmVar2 = (pm) obj2;
                    v90 x = g8.x(pmVar2, 0, arrayList9, null);
                    pmVar2.R(0, x, arrayList9);
                    x.a(arrayList9);
                }
            }
            HashSet hashSet = i(2).a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    g8.x(((ec) it.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = i(4).a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    g8.x(((ec) it2.next()).d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = i(7).a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    g8.x(((ec) it3.next()).d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i44 = 0;
                while (i44 < size6) {
                    Object obj3 = arrayList6.get(i44);
                    i44++;
                    g8.x((tc) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i45 = 0;
                while (i45 < size7) {
                    Object obj4 = arrayList7.get(i45);
                    i45++;
                    g8.x((gm) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i46 = 0;
                while (i46 < size8) {
                    Object obj5 = arrayList8.get(i46);
                    i46++;
                    pm pmVar3 = (pm) obj5;
                    v90 x2 = g8.x(pmVar3, 1, arrayList9, null);
                    pmVar3.R(1, x2, arrayList9);
                    x2.a(arrayList9);
                }
            }
            HashSet hashSet4 = i(3).a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    g8.x(((ec) it4.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = i(6).a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    g8.x(((ec) it5.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = i(5).a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    g8.x(((ec) it6.next()).d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = i(7).a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    g8.x(((ec) it7.next()).d, 1, arrayList9, null);
                }
            }
            if (arrayList4 != null) {
                int size9 = arrayList4.size();
                int i47 = 0;
                while (i47 < size9) {
                    Object obj6 = arrayList4.get(i47);
                    i47++;
                    g8.x((tc) obj6, 1, arrayList9, null);
                }
            }
            char c7 = 1;
            int i48 = 0;
            while (i48 < size3) {
                tc tcVar11 = (tc) arrayList2.get(i48);
                int[] iArr5 = tcVar11.p0;
                if (iArr5[0] == 3 && iArr5[c7] == 3) {
                    int i49 = tcVar11.n0;
                    int size10 = arrayList9.size();
                    int i50 = 0;
                    while (true) {
                        if (i50 >= size10) {
                            v90Var3 = null;
                            break;
                        }
                        v90Var3 = (v90) arrayList9.get(i50);
                        if (i49 == v90Var3.b) {
                            break;
                        } else {
                            i50++;
                        }
                    }
                    int i51 = tcVar11.o0;
                    int size11 = arrayList9.size();
                    int i52 = 0;
                    while (true) {
                        if (i52 >= size11) {
                            v90Var4 = null;
                            break;
                        }
                        v90Var4 = (v90) arrayList9.get(i52);
                        if (i51 == v90Var4.b) {
                            break;
                        } else {
                            i52++;
                        }
                    }
                    if (v90Var3 != null && v90Var4 != null) {
                        v90Var3.c(0, v90Var4);
                        v90Var4.c = 2;
                        arrayList9.remove(v90Var3);
                    }
                }
                i48++;
                c7 = 1;
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    int size12 = arrayList9.size();
                    int i53 = 0;
                    int i54 = 0;
                    v90Var = null;
                    while (i54 < size12) {
                        Object obj7 = arrayList9.get(i54);
                        i54++;
                        v90 v90Var5 = (v90) obj7;
                        if (v90Var5.c != 1 && (b2 = v90Var5.b(vpVar, 0)) > i53) {
                            v90Var = v90Var5;
                            i53 = b2;
                        }
                    }
                    c2 = 1;
                    if (v90Var != null) {
                        M(1);
                        O(i53);
                        if (objArr[c2] == 2) {
                            int size13 = arrayList9.size();
                            int i55 = 0;
                            int i56 = 0;
                            v90Var2 = null;
                            while (i56 < size13) {
                                Object obj8 = arrayList9.get(i56);
                                i56++;
                                v90 v90Var6 = (v90) obj8;
                                if (v90Var6.c != 0 && (b = v90Var6.b(vpVar, 1)) > i55) {
                                    v90Var2 = v90Var6;
                                    i55 = b;
                                }
                            }
                            if (v90Var2 != null) {
                                N(1);
                                L(i55);
                                if (v90Var == null || v90Var2 != null) {
                                    i4 = i12;
                                    if (i4 == 2) {
                                        i13 = i9;
                                        if (i13 >= q() || i13 <= 0) {
                                            i14 = q();
                                            i3 = i11;
                                            if (i3 != 2) {
                                                max6 = i10;
                                                if (max6 >= k() || max6 <= 0) {
                                                    max6 = k();
                                                } else {
                                                    L(max6);
                                                    this.F0 = true;
                                                }
                                            } else {
                                                max6 = i10;
                                            }
                                            i = i14;
                                            z = true;
                                            boolean z15 = !W(64) || W(128);
                                            vpVar.getClass();
                                            vpVar.h = false;
                                            if (this.D0 == 0 && z15) {
                                                c = 1;
                                                vpVar.h = true;
                                            } else {
                                                c = 1;
                                            }
                                            ArrayList arrayList10 = this.q0;
                                            boolean z16 = objArr[0] != 2 || objArr[c] == 2;
                                            this.z0 = 0;
                                            this.A0 = 0;
                                            i5 = i2;
                                            for (i6 = 0; i6 < i5; i6++) {
                                                tc tcVar12 = (tc) this.q0.get(i6);
                                                if (tcVar12 instanceof uc) {
                                                    ((uc) tcVar12).U();
                                                }
                                            }
                                            boolean W = W(64);
                                            boolean z17 = z;
                                            int i57 = 0;
                                            z2 = true;
                                            while (z2) {
                                                int i58 = i57 + 1;
                                                try {
                                                    vpVar.t();
                                                    this.z0 = 0;
                                                    this.A0 = 0;
                                                    g(vpVar);
                                                    for (int i59 = 0; i59 < i5; i59++) {
                                                        ((tc) this.q0.get(i59)).g(vpVar);
                                                    }
                                                    S(vpVar);
                                                    try {
                                                        weakReference = this.G0;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        ecVar3 = ecVar;
                                                        z4 = z16;
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    ecVar3 = ecVar;
                                                    z4 = z16;
                                                }
                                                if (weakReference != null) {
                                                    try {
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        ecVar3 = ecVar;
                                                    }
                                                    if (weakReference.get() != null) {
                                                        ecVar3 = ecVar;
                                                        try {
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                        }
                                                        try {
                                                            z4 = z16;
                                                        } catch (Exception e5) {
                                                            e = e5;
                                                            z4 = z16;
                                                            z2 = true;
                                                            e.printStackTrace();
                                                            z5 = z17;
                                                            System.out.println("EXCEPTION : " + e);
                                                            if (z2) {
                                                            }
                                                            if (z4) {
                                                            }
                                                            max = Math.max(this.b0, q());
                                                            if (max > q()) {
                                                            }
                                                            max2 = Math.max(this.c0, k());
                                                            if (max2 > k()) {
                                                            }
                                                            if (!z7) {
                                                            }
                                                            i7 = 8;
                                                            if (i58 <= i7) {
                                                            }
                                                            z17 = z7;
                                                            i57 = i58;
                                                            z16 = z4;
                                                            ecVar = ecVar3;
                                                        }
                                                        try {
                                                            vpVar.f(vpVar.k((ec) this.G0.get()), vpVar.k(ecVar3), 0, 5);
                                                            this.G0 = null;
                                                            weakReference2 = this.I0;
                                                            if (weakReference2 != null && weakReference2.get() != null) {
                                                                vpVar.f(vpVar.k(this.L), vpVar.k((ec) this.I0.get()), 0, 5);
                                                                this.I0 = null;
                                                            }
                                                            weakReference3 = this.H0;
                                                            if (weakReference3 != null && weakReference3.get() != null) {
                                                                ecVar4 = ecVar2;
                                                                try {
                                                                    ecVar2 = ecVar4;
                                                                    vpVar.f(vpVar.k((ec) this.H0.get()), vpVar.k(ecVar4), 0, 5);
                                                                    this.H0 = null;
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                    ecVar2 = ecVar4;
                                                                    z2 = true;
                                                                    e.printStackTrace();
                                                                    z5 = z17;
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    if (z2) {
                                                                    }
                                                                    if (z4) {
                                                                    }
                                                                    max = Math.max(this.b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z7) {
                                                                    }
                                                                    i7 = 8;
                                                                    if (i58 <= i7) {
                                                                    }
                                                                    z17 = z7;
                                                                    i57 = i58;
                                                                    z16 = z4;
                                                                    ecVar = ecVar3;
                                                                }
                                                            }
                                                            weakReference4 = this.J0;
                                                            if (weakReference4 == null && weakReference4.get() != null) {
                                                                try {
                                                                } catch (Exception e7) {
                                                                    e = e7;
                                                                }
                                                                try {
                                                                    vpVar.f(vpVar.k(this.K), vpVar.k((ec) this.J0.get()), 0, 5);
                                                                    try {
                                                                        this.J0 = null;
                                                                    } catch (Exception e8) {
                                                                        e = e8;
                                                                        z2 = true;
                                                                        e.printStackTrace();
                                                                        z5 = z17;
                                                                        System.out.println("EXCEPTION : " + e);
                                                                        if (z2) {
                                                                        }
                                                                        if (z4) {
                                                                        }
                                                                        max = Math.max(this.b0, q());
                                                                        if (max > q()) {
                                                                        }
                                                                        max2 = Math.max(this.c0, k());
                                                                        if (max2 > k()) {
                                                                        }
                                                                        if (!z7) {
                                                                        }
                                                                        i7 = 8;
                                                                        if (i58 <= i7) {
                                                                        }
                                                                        z17 = z7;
                                                                        i57 = i58;
                                                                        z16 = z4;
                                                                        ecVar = ecVar3;
                                                                    }
                                                                } catch (Exception e9) {
                                                                    e = e9;
                                                                    z2 = true;
                                                                    e.printStackTrace();
                                                                    z5 = z17;
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    if (z2) {
                                                                    }
                                                                    if (z4) {
                                                                    }
                                                                    max = Math.max(this.b0, q());
                                                                    if (max > q()) {
                                                                    }
                                                                    max2 = Math.max(this.c0, k());
                                                                    if (max2 > k()) {
                                                                    }
                                                                    if (!z7) {
                                                                    }
                                                                    i7 = 8;
                                                                    if (i58 <= i7) {
                                                                    }
                                                                    z17 = z7;
                                                                    i57 = i58;
                                                                    z16 = z4;
                                                                    ecVar = ecVar3;
                                                                }
                                                            }
                                                            vpVar.p();
                                                            z5 = z17;
                                                            z2 = true;
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            z2 = true;
                                                            e.printStackTrace();
                                                            z5 = z17;
                                                            System.out.println("EXCEPTION : " + e);
                                                            if (z2) {
                                                            }
                                                            if (z4) {
                                                            }
                                                            max = Math.max(this.b0, q());
                                                            if (max > q()) {
                                                            }
                                                            max2 = Math.max(this.c0, k());
                                                            if (max2 > k()) {
                                                            }
                                                            if (!z7) {
                                                            }
                                                            i7 = 8;
                                                            if (i58 <= i7) {
                                                            }
                                                            z17 = z7;
                                                            i57 = i58;
                                                            z16 = z4;
                                                            ecVar = ecVar3;
                                                        }
                                                        if (z2) {
                                                            zArr[2] = false;
                                                            boolean W2 = W(64);
                                                            Q(vpVar, W2);
                                                            int size14 = this.q0.size();
                                                            int i60 = 0;
                                                            z2 = false;
                                                            while (i60 < size14) {
                                                                tc tcVar13 = (tc) this.q0.get(i60);
                                                                tcVar13.Q(vpVar, W2);
                                                                boolean z18 = W2;
                                                                int i61 = size14;
                                                                if (tcVar13.h != -1 || tcVar13.i != -1) {
                                                                    z2 = true;
                                                                }
                                                                i60++;
                                                                W2 = z18;
                                                                size14 = i61;
                                                            }
                                                        } else {
                                                            Q(vpVar, W);
                                                            for (int i62 = 0; i62 < i5; i62++) {
                                                                ((tc) this.q0.get(i62)).Q(vpVar, W);
                                                            }
                                                            z2 = false;
                                                        }
                                                        if (z4 && i58 < 8 && zArr[2]) {
                                                            int i63 = 0;
                                                            int i64 = 0;
                                                            for (i8 = 0; i8 < i5; i8++) {
                                                                tc tcVar14 = (tc) this.q0.get(i8);
                                                                i64 = Math.max(i64, tcVar14.q() + tcVar14.Y);
                                                                i63 = Math.max(i63, tcVar14.k() + tcVar14.Z);
                                                            }
                                                            max3 = Math.max(this.b0, i64);
                                                            max4 = Math.max(this.c0, i63);
                                                            if (i4 == 2 && q() < max3) {
                                                                O(max3);
                                                                objArr[0] = 2;
                                                                z2 = true;
                                                                z5 = true;
                                                            }
                                                            if (i3 == 2 && k() < max4) {
                                                                L(max4);
                                                                objArr[1] = 2;
                                                                z2 = true;
                                                                z5 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.b0, q());
                                                        if (max > q()) {
                                                            O(max);
                                                            r8 = 1;
                                                            objArr[0] = 1;
                                                            z2 = true;
                                                            z6 = true;
                                                        } else {
                                                            r8 = 1;
                                                            z6 = z5;
                                                        }
                                                        max2 = Math.max(this.c0, k());
                                                        if (max2 > k()) {
                                                            L(max2);
                                                            objArr[r8] = r8;
                                                            z7 = r8;
                                                            z2 = z7;
                                                        } else {
                                                            z7 = z6;
                                                        }
                                                        if (!z7) {
                                                            if (objArr[0] == 2 && i > 0 && q() > i) {
                                                                this.E0 = r8;
                                                                objArr[0] = r8;
                                                                O(i);
                                                                z7 = r8;
                                                                z2 = z7;
                                                            }
                                                            if (objArr[r8] == 2 && max6 > 0 && k() > max6) {
                                                                this.F0 = r8;
                                                                objArr[r8] = r8;
                                                                L(max6);
                                                                z7 = true;
                                                                i7 = 8;
                                                                z2 = true;
                                                                if (i58 <= i7) {
                                                                    z2 = false;
                                                                }
                                                                z17 = z7;
                                                                i57 = i58;
                                                                z16 = z4;
                                                                ecVar = ecVar3;
                                                            }
                                                        }
                                                        i7 = 8;
                                                        if (i58 <= i7) {
                                                        }
                                                        z17 = z7;
                                                        i57 = i58;
                                                        z16 = z4;
                                                        ecVar = ecVar3;
                                                    }
                                                }
                                                ecVar3 = ecVar;
                                                z4 = z16;
                                                weakReference2 = this.I0;
                                                if (weakReference2 != null) {
                                                    vpVar.f(vpVar.k(this.L), vpVar.k((ec) this.I0.get()), 0, 5);
                                                    this.I0 = null;
                                                }
                                                weakReference3 = this.H0;
                                                if (weakReference3 != null) {
                                                    ecVar4 = ecVar2;
                                                    ecVar2 = ecVar4;
                                                    vpVar.f(vpVar.k((ec) this.H0.get()), vpVar.k(ecVar4), 0, 5);
                                                    this.H0 = null;
                                                }
                                                weakReference4 = this.J0;
                                                if (weakReference4 == null) {
                                                }
                                                vpVar.p();
                                                z5 = z17;
                                                z2 = true;
                                                if (z2) {
                                                }
                                                if (z4) {
                                                    int i632 = 0;
                                                    int i642 = 0;
                                                    while (i8 < i5) {
                                                    }
                                                    max3 = Math.max(this.b0, i642);
                                                    max4 = Math.max(this.c0, i632);
                                                    if (i4 == 2) {
                                                        O(max3);
                                                        objArr[0] = 2;
                                                        z2 = true;
                                                        z5 = true;
                                                    }
                                                    if (i3 == 2) {
                                                        L(max4);
                                                        objArr[1] = 2;
                                                        z2 = true;
                                                        z5 = true;
                                                    }
                                                }
                                                max = Math.max(this.b0, q());
                                                if (max > q()) {
                                                }
                                                max2 = Math.max(this.c0, k());
                                                if (max2 > k()) {
                                                }
                                                if (!z7) {
                                                }
                                                i7 = 8;
                                                if (i58 <= i7) {
                                                }
                                                z17 = z7;
                                                i57 = i58;
                                                z16 = z4;
                                                ecVar = ecVar3;
                                            }
                                            z3 = z17;
                                            this.q0 = arrayList10;
                                            if (z3) {
                                                objArr[0] = i4;
                                                objArr[1] = i3;
                                            }
                                            F(vpVar.m);
                                        }
                                        O(i13);
                                        this.E0 = true;
                                    } else {
                                        i13 = i9;
                                    }
                                    i14 = i13;
                                    i3 = i11;
                                    if (i3 != 2) {
                                    }
                                    i = i14;
                                    z = true;
                                    if (W(64)) {
                                    }
                                    vpVar.getClass();
                                    vpVar.h = false;
                                    if (this.D0 == 0) {
                                    }
                                    c = 1;
                                    ArrayList arrayList102 = this.q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.z0 = 0;
                                    this.A0 = 0;
                                    i5 = i2;
                                    while (i6 < i5) {
                                    }
                                    boolean W3 = W(64);
                                    boolean z172 = z;
                                    int i572 = 0;
                                    z2 = true;
                                    while (z2) {
                                    }
                                    z3 = z172;
                                    this.q0 = arrayList102;
                                    if (z3) {
                                    }
                                    F(vpVar.m);
                                }
                            }
                        }
                        v90Var2 = null;
                        if (v90Var == null) {
                        }
                        i4 = i12;
                        if (i4 == 2) {
                        }
                        i14 = i13;
                        i3 = i11;
                        if (i3 != 2) {
                        }
                        i = i14;
                        z = true;
                        if (W(64)) {
                        }
                        vpVar.getClass();
                        vpVar.h = false;
                        if (this.D0 == 0) {
                        }
                        c = 1;
                        ArrayList arrayList1022 = this.q0;
                        if (objArr[0] != 2) {
                        }
                        this.z0 = 0;
                        this.A0 = 0;
                        i5 = i2;
                        while (i6 < i5) {
                        }
                        boolean W32 = W(64);
                        boolean z1722 = z;
                        int i5722 = 0;
                        z2 = true;
                        while (z2) {
                        }
                        z3 = z1722;
                        this.q0 = arrayList1022;
                        if (z3) {
                        }
                        F(vpVar.m);
                    }
                } else {
                    c2 = 1;
                }
                v90Var = null;
                if (objArr[c2] == 2) {
                }
                v90Var2 = null;
                if (v90Var == null) {
                }
                i4 = i12;
                if (i4 == 2) {
                }
                i14 = i13;
                i3 = i11;
                if (i3 != 2) {
                }
                i = i14;
                z = true;
                if (W(64)) {
                }
                vpVar.getClass();
                vpVar.h = false;
                if (this.D0 == 0) {
                }
                c = 1;
                ArrayList arrayList10222 = this.q0;
                if (objArr[0] != 2) {
                }
                this.z0 = 0;
                this.A0 = 0;
                i5 = i2;
                while (i6 < i5) {
                }
                boolean W322 = W(64);
                boolean z17222 = z;
                int i57222 = 0;
                z2 = true;
                while (z2) {
                }
                z3 = z17222;
                this.q0 = arrayList10222;
                if (z3) {
                }
                F(vpVar.m);
            }
            max6 = i10;
            i3 = i11;
            i = i9;
            i4 = i12;
        }
        z = false;
        if (W(64)) {
        }
        vpVar.getClass();
        vpVar.h = false;
        if (this.D0 == 0) {
        }
        c = 1;
        ArrayList arrayList102222 = this.q0;
        if (objArr[0] != 2) {
        }
        this.z0 = 0;
        this.A0 = 0;
        i5 = i2;
        while (i6 < i5) {
        }
        boolean W3222 = W(64);
        boolean z172222 = z;
        int i572222 = 0;
        z2 = true;
        while (z2) {
        }
        z3 = z172222;
        this.q0 = arrayList102222;
        if (z3) {
        }
        F(vpVar.m);
    }

    public final boolean W(int i) {
        return (this.D0 & i) == i;
    }

    @Override // defpackage.tc
    public final void n(StringBuilder sb) {
        sb.append(this.j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.V);
        sb.append("\n");
        ArrayList arrayList = this.q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((tc) obj).n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
