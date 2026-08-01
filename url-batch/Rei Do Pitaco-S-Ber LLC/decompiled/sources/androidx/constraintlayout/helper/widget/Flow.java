package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import defpackage.bj;
import defpackage.cj;
import defpackage.ec;
import defpackage.ex;
import defpackage.gm;
import defpackage.jc;
import defpackage.q7;
import defpackage.q90;
import defpackage.tc;
import defpackage.uc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class Flow extends q90 {
    public final cj o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[32];
        this.l = new HashMap();
        this.h = context;
        super.g(attributeSet);
        cj cjVar = new cj();
        cjVar.s0 = 0;
        cjVar.t0 = 0;
        cjVar.u0 = 0;
        cjVar.v0 = 0;
        cjVar.w0 = 0;
        cjVar.x0 = 0;
        cjVar.y0 = false;
        cjVar.z0 = 0;
        cjVar.A0 = 0;
        cjVar.B0 = new q7();
        cjVar.C0 = null;
        cjVar.D0 = -1;
        cjVar.E0 = -1;
        cjVar.F0 = -1;
        cjVar.G0 = -1;
        cjVar.H0 = -1;
        cjVar.I0 = -1;
        cjVar.J0 = 0.5f;
        cjVar.K0 = 0.5f;
        cjVar.L0 = 0.5f;
        cjVar.M0 = 0.5f;
        cjVar.N0 = 0.5f;
        cjVar.O0 = 0.5f;
        cjVar.P0 = 0;
        cjVar.Q0 = 0;
        cjVar.R0 = 2;
        cjVar.S0 = 2;
        cjVar.T0 = 0;
        cjVar.U0 = -1;
        cjVar.V0 = 0;
        cjVar.W0 = new ArrayList();
        cjVar.X0 = null;
        cjVar.Y0 = null;
        cjVar.Z0 = null;
        cjVar.b1 = 0;
        this.o = cjVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ex.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.o.V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    cj cjVar2 = this.o;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    cjVar2.s0 = dimensionPixelSize;
                    cjVar2.t0 = dimensionPixelSize;
                    cjVar2.u0 = dimensionPixelSize;
                    cjVar2.v0 = dimensionPixelSize;
                } else if (index == 18) {
                    cj cjVar3 = this.o;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    cjVar3.u0 = dimensionPixelSize2;
                    cjVar3.w0 = dimensionPixelSize2;
                    cjVar3.x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.o.v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.o.w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.o.s0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.o.x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.o.t0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.o.T0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.o.D0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.o.E0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.o.F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.o.H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.o.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.o.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.o.J0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.o.L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.o.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.o.M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.o.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.o.K0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.o.R0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.o.S0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.o.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.o.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.o.U0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.i = this.o;
        i();
    }

    @Override // defpackage.gc
    public final void h(tc tcVar, boolean z) {
        cj cjVar = this.o;
        int i = cjVar.u0;
        if (i > 0 || cjVar.v0 > 0) {
            if (z) {
                cjVar.w0 = cjVar.v0;
                cjVar.x0 = i;
            } else {
                cjVar.w0 = i;
                cjVar.x0 = cjVar.v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0732  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // defpackage.q90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(cj cjVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        tc[] tcVarArr;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        int i10;
        bj bjVar;
        char c;
        ?? r12;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj;
        tc tcVar;
        boolean z2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ec ecVar;
        ec ecVar2;
        ec ecVar3;
        ArrayList arrayList;
        int i20;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (cjVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = cjVar.p0;
        ec ecVar4 = cjVar.J;
        ec ecVar5 = cjVar.I;
        ec ecVar6 = cjVar.K;
        ec ecVar7 = cjVar.L;
        ArrayList arrayList2 = cjVar.W0;
        if (cjVar.r0 > 0) {
            q7 q7Var = cjVar.B0;
            tc tcVar2 = cjVar.T;
            jc jcVar = tcVar2 != null ? ((uc) tcVar2).u0 : null;
            if (jcVar == null) {
                cjVar.z0 = 0;
                cjVar.A0 = 0;
                cjVar.y0 = false;
                setMeasuredDimension(cjVar.z0, cjVar.A0);
            }
            int i21 = 0;
            while (i21 < cjVar.r0) {
                tc tcVar3 = cjVar.q0[i21];
                if (tcVar3 == null) {
                    ecVar = ecVar5;
                } else {
                    ecVar = ecVar5;
                    if (!(tcVar3 instanceof gm)) {
                        ecVar2 = ecVar6;
                        int j = tcVar3.j(0);
                        ecVar3 = ecVar7;
                        int j2 = tcVar3.j(1);
                        arrayList = arrayList2;
                        if (j == 3) {
                            i20 = i21;
                            if (tcVar3.r != 1 && j2 == 3 && tcVar3.s != 1) {
                                i21 = i20 + 1;
                                ecVar5 = ecVar;
                                ecVar6 = ecVar2;
                                ecVar7 = ecVar3;
                                arrayList2 = arrayList;
                            }
                        } else {
                            i20 = i21;
                        }
                        if (j == 3) {
                            j = 2;
                        }
                        if (j2 == 3) {
                            j2 = 2;
                        }
                        q7Var.a = j;
                        q7Var.b = j2;
                        q7Var.c = tcVar3.q();
                        q7Var.d = tcVar3.k();
                        jcVar.b(tcVar3, q7Var);
                        tcVar3.O(q7Var.e);
                        tcVar3.L(q7Var.f);
                        tcVar3.I(q7Var.g);
                        i21 = i20 + 1;
                        ecVar5 = ecVar;
                        ecVar6 = ecVar2;
                        ecVar7 = ecVar3;
                        arrayList2 = arrayList;
                    }
                }
                ecVar2 = ecVar6;
                ecVar3 = ecVar7;
                arrayList = arrayList2;
                i20 = i21;
                i21 = i20 + 1;
                ecVar5 = ecVar;
                ecVar6 = ecVar2;
                ecVar7 = ecVar3;
                arrayList2 = arrayList;
            }
        }
        ec ecVar8 = ecVar5;
        ec ecVar9 = ecVar6;
        ec ecVar10 = ecVar7;
        ArrayList arrayList3 = arrayList2;
        int i22 = cjVar.w0;
        int i23 = cjVar.x0;
        int i24 = cjVar.s0;
        int i25 = cjVar.t0;
        int[] iArr3 = new int[2];
        int i26 = (size - i22) - i23;
        int i27 = cjVar.V0;
        if (i27 == 1) {
            i26 = (size2 - i24) - i25;
        }
        int i28 = i26;
        int i29 = cjVar.D0;
        if (i27 == 0) {
            if (i29 == -1) {
                cjVar.D0 = 0;
            }
            if (cjVar.E0 == -1) {
                cjVar.E0 = 0;
            }
        } else {
            if (i29 == -1) {
                cjVar.D0 = 0;
            }
            if (cjVar.E0 == -1) {
                cjVar.E0 = 0;
            }
        }
        tc[] tcVarArr2 = cjVar.q0;
        int i30 = 0;
        int i31 = 0;
        while (true) {
            i3 = cjVar.r0;
            i4 = i24;
            if (i30 >= i3) {
                break;
            }
            if (cjVar.q0[i30].g0 == 8) {
                i31++;
            }
            i30++;
            i24 = i4;
        }
        if (i31 > 0) {
            tcVarArr = new tc[i3 - i31];
            int i32 = 0;
            int i33 = 0;
            while (i32 < cjVar.r0) {
                tc tcVar4 = cjVar.q0[i32];
                tc[] tcVarArr3 = tcVarArr;
                if (tcVar4.g0 != 8) {
                    tcVarArr3[i33] = tcVar4;
                    i33++;
                }
                i32++;
                tcVarArr = tcVarArr3;
            }
            i5 = i33;
        } else {
            i5 = i3;
            tcVarArr = tcVarArr2;
        }
        cjVar.a1 = tcVarArr;
        cjVar.b1 = i5;
        int i34 = cjVar.T0;
        if (i34 == 0) {
            tc[] tcVarArr4 = tcVarArr;
            int i35 = i5;
            i6 = i25;
            iArr = iArr3;
            i7 = size2;
            i8 = i22;
            i9 = i23;
            i10 = i4;
            int i36 = cjVar.V0;
            if (i35 != 0) {
                if (arrayList3.size() == 0) {
                    bjVar = new bj(cjVar, i36, cjVar.I, cjVar.J, cjVar.K, cjVar.L, i28);
                    arrayList3.add(bjVar);
                } else {
                    bj bjVar2 = (bj) arrayList3.get(0);
                    bjVar2.c = 0;
                    bjVar2.b = null;
                    bjVar2.l = 0;
                    bjVar2.m = 0;
                    bjVar2.n = 0;
                    bjVar2.o = 0;
                    bjVar2.p = 0;
                    bjVar2.f(i36, cjVar.I, cjVar.J, cjVar.K, cjVar.L, cjVar.w0, cjVar.s0, cjVar.x0, cjVar.t0, i28);
                    bjVar = bjVar2;
                }
                for (int i37 = 0; i37 < i35; i37++) {
                    bjVar.a(tcVarArr4[i37]);
                }
                c = 0;
                iArr[0] = bjVar.d();
                r12 = 1;
                iArr[1] = bjVar.c();
                int i38 = iArr[c] + i8 + i9;
                int i39 = iArr[r12] + i10 + i6;
                if (mode != 1073741824) {
                }
                if (mode2 == 1073741824) {
                }
                cjVar.z0 = size;
                cjVar.A0 = r0;
                cjVar.O(size);
                cjVar.L(r0);
                cjVar.y0 = cjVar.r0 > 0 ? r12 : false;
                setMeasuredDimension(cjVar.z0, cjVar.A0);
            }
        } else {
            if (i34 != 1) {
                if (i34 == 2) {
                    tc[] tcVarArr5 = tcVarArr;
                    int i40 = i5;
                    i6 = i25;
                    iArr = iArr3;
                    i7 = size2;
                    i8 = i22;
                    i9 = i23;
                    i10 = i4;
                    int i41 = cjVar.V0;
                    int i42 = cjVar.U0;
                    if (i41 == 0) {
                        if (i42 <= 0) {
                            int i43 = 0;
                            i14 = 0;
                            for (int i44 = 0; i44 < i40; i44++) {
                                if (i44 > 0) {
                                    i43 += cjVar.P0;
                                }
                                tc tcVar5 = tcVarArr5[i44];
                                if (tcVar5 != null) {
                                    int U = cjVar.U(tcVar5, i28) + i43;
                                    if (U > i28) {
                                        break;
                                    }
                                    i14++;
                                    i43 = U;
                                }
                            }
                        } else {
                            i14 = i42;
                        }
                        i42 = 0;
                    } else {
                        if (i42 <= 0) {
                            int i45 = 0;
                            int i46 = 0;
                            for (int i47 = 0; i47 < i40; i47++) {
                                if (i47 > 0) {
                                    i45 += cjVar.Q0;
                                }
                                tc tcVar6 = tcVarArr5[i47];
                                if (tcVar6 != null) {
                                    int T = cjVar.T(tcVar6, i28) + i45;
                                    if (T > i28) {
                                        break;
                                    }
                                    i46++;
                                    i45 = T;
                                }
                            }
                            i42 = i46;
                        }
                        i14 = 0;
                    }
                    if (cjVar.Z0 == null) {
                        cjVar.Z0 = new int[2];
                    }
                    boolean z3 = (i42 == 0 && i41 == 1) || (i14 == 0 && i41 == 0);
                    while (!z3) {
                        if (i41 == 0) {
                            i42 = (int) Math.ceil(i40 / i14);
                        } else {
                            i14 = (int) Math.ceil(i40 / i42);
                        }
                        tc[] tcVarArr6 = cjVar.Y0;
                        if (tcVarArr6 == null || tcVarArr6.length < i14) {
                            obj = null;
                            cjVar.Y0 = new tc[i14];
                        } else {
                            obj = null;
                            Arrays.fill(tcVarArr6, (Object) null);
                        }
                        tc[] tcVarArr7 = cjVar.X0;
                        if (tcVarArr7 == null || tcVarArr7.length < i42) {
                            cjVar.X0 = new tc[i42];
                        } else {
                            Arrays.fill(tcVarArr7, obj);
                        }
                        for (int i48 = 0; i48 < i14; i48++) {
                            for (int i49 = 0; i49 < i42; i49++) {
                                int i50 = (i49 * i14) + i48;
                                if (i41 == 1) {
                                    i50 = (i48 * i42) + i49;
                                }
                                if (i50 < tcVarArr5.length && (tcVar = tcVarArr5[i50]) != null) {
                                    int U2 = cjVar.U(tcVar, i28);
                                    tc tcVar7 = cjVar.Y0[i48];
                                    if (tcVar7 == null || tcVar7.q() < U2) {
                                        cjVar.Y0[i48] = tcVar;
                                    }
                                    int T2 = cjVar.T(tcVar, i28);
                                    tc tcVar8 = cjVar.X0[i49];
                                    if (tcVar8 == null || tcVar8.k() < T2) {
                                        cjVar.X0[i49] = tcVar;
                                    }
                                }
                            }
                        }
                        int i51 = 0;
                        for (int i52 = 0; i52 < i14; i52++) {
                            tc tcVar9 = cjVar.Y0[i52];
                            if (tcVar9 != null) {
                                if (i52 > 0) {
                                    i51 += cjVar.P0;
                                }
                                i51 = cjVar.U(tcVar9, i28) + i51;
                            }
                        }
                        int i53 = 0;
                        for (int i54 = 0; i54 < i42; i54++) {
                            tc tcVar10 = cjVar.X0[i54];
                            if (tcVar10 != null) {
                                if (i54 > 0) {
                                    i53 += cjVar.Q0;
                                }
                                i53 = cjVar.T(tcVar10, i28) + i53;
                            }
                        }
                        iArr[0] = i51;
                        iArr[1] = i53;
                        if (i41 == 0) {
                            if (i51 > i28 && i14 > 1) {
                                i14--;
                            }
                            z3 = true;
                        } else {
                            if (i53 > i28 && i42 > 1) {
                                i42--;
                            }
                            z3 = true;
                        }
                    }
                    z = true;
                    int[] iArr4 = cjVar.Z0;
                    iArr4[0] = i14;
                    iArr4[1] = i42;
                } else if (i34 != 3) {
                    i6 = i25;
                    iArr = iArr3;
                    i7 = size2;
                    i8 = i22;
                    i9 = i23;
                    i10 = i4;
                } else {
                    int i55 = i5;
                    int i56 = cjVar.V0;
                    if (i55 == 0) {
                        i6 = i25;
                        iArr = iArr3;
                        i7 = size2;
                        i8 = i22;
                        i9 = i23;
                        i10 = i4;
                        z2 = true;
                    } else {
                        arrayList3.clear();
                        tc[] tcVarArr8 = tcVarArr;
                        i8 = i22;
                        i6 = i25;
                        i9 = i23;
                        i10 = i4;
                        iArr = iArr3;
                        z2 = true;
                        bj bjVar3 = new bj(cjVar, i56, cjVar.I, cjVar.J, cjVar.K, cjVar.L, i28);
                        arrayList3.add(bjVar3);
                        if (i56 == 0) {
                            int i57 = 0;
                            int i58 = 0;
                            i15 = 0;
                            int i59 = 0;
                            while (i57 < i55) {
                                i58++;
                                tc tcVar11 = tcVarArr8[i57];
                                int U3 = cjVar.U(tcVar11, i28);
                                int i60 = i56;
                                int i61 = i57;
                                if (tcVar11.p0[0] == 3) {
                                    i15++;
                                }
                                int i62 = i15;
                                boolean z4 = (i59 == i28 || (cjVar.P0 + i59) + U3 > i28) && bjVar3.b != null;
                                if (!z4 && i61 > 0 && (i19 = cjVar.U0) > 0 && i58 > i19) {
                                    z4 = true;
                                }
                                if (z4) {
                                    i17 = size2;
                                    i56 = i60;
                                    i18 = i61;
                                    bjVar3 = new bj(cjVar, i56, cjVar.I, cjVar.J, cjVar.K, cjVar.L, i28);
                                    bjVar3.n = i18;
                                    arrayList3.add(bjVar3);
                                    i58 = 1;
                                } else {
                                    i17 = size2;
                                    i56 = i60;
                                    i18 = i61;
                                    if (i18 > 0) {
                                        i59 = cjVar.P0 + U3 + i59;
                                        bjVar3.a(tcVar11);
                                        i57 = i18 + 1;
                                        i15 = i62;
                                        size2 = i17;
                                    }
                                }
                                i59 = U3;
                                bjVar3.a(tcVar11);
                                i57 = i18 + 1;
                                i15 = i62;
                                size2 = i17;
                            }
                            i7 = size2;
                        } else {
                            i7 = size2;
                            int i63 = 0;
                            int i64 = 0;
                            int i65 = 0;
                            int i66 = 0;
                            while (i63 < i55) {
                                i64++;
                                tc tcVar12 = tcVarArr8[i63];
                                int T3 = cjVar.T(tcVar12, i28);
                                int i67 = i56;
                                if (tcVar12.p0[1] == 3) {
                                    i65++;
                                }
                                int i68 = i65;
                                boolean z5 = (i66 == i28 || (cjVar.Q0 + i66) + T3 > i28) && bjVar3.b != null;
                                if (!z5 && i63 > 0 && (i16 = cjVar.U0) > 0 && i64 > i16) {
                                    z5 = true;
                                }
                                if (z5) {
                                    i56 = i67;
                                    bjVar3 = new bj(cjVar, i56, cjVar.I, cjVar.J, cjVar.K, cjVar.L, i28);
                                    bjVar3.n = i63;
                                    arrayList3.add(bjVar3);
                                    i64 = 1;
                                } else {
                                    i56 = i67;
                                    if (i63 > 0) {
                                        i66 = cjVar.Q0 + T3 + i66;
                                        bjVar3.a(tcVar12);
                                        i63++;
                                        i65 = i68;
                                    }
                                }
                                i66 = T3;
                                bjVar3.a(tcVar12);
                                i63++;
                                i65 = i68;
                            }
                            i15 = i65;
                        }
                        int size3 = arrayList3.size();
                        int i69 = cjVar.w0;
                        int i70 = cjVar.s0;
                        int i71 = cjVar.x0;
                        int i72 = cjVar.t0;
                        boolean z6 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i15 > 0 && z6) {
                            for (int i73 = 0; i73 < size3; i73++) {
                                bj bjVar4 = (bj) arrayList3.get(i73);
                                if (i56 == 0) {
                                    bjVar4.e(i28 - bjVar4.d());
                                } else {
                                    bjVar4.e(i28 - bjVar4.c());
                                }
                            }
                        }
                        int i74 = i69;
                        int i75 = i70;
                        int i76 = i71;
                        int i77 = i72;
                        ec ecVar11 = ecVar8;
                        ec ecVar12 = ecVar9;
                        ec ecVar13 = ecVar10;
                        ec ecVar14 = ecVar4;
                        int i78 = 0;
                        int i79 = 0;
                        for (int i80 = 0; i80 < size3; i80++) {
                            bj bjVar5 = (bj) arrayList3.get(i80);
                            if (i56 == 0) {
                                if (i80 < size3 - 1) {
                                    ecVar13 = ((bj) arrayList3.get(i80 + 1)).b.J;
                                    i77 = 0;
                                } else {
                                    i77 = cjVar.t0;
                                    ecVar13 = ecVar10;
                                }
                                ec ecVar15 = bjVar5.b.L;
                                bjVar5.f(i56, ecVar11, ecVar14, ecVar12, ecVar13, i74, i75, i76, i77, i28);
                                i78 = Math.max(i78, bjVar5.d());
                                int c2 = bjVar5.c() + i79;
                                if (i80 > 0) {
                                    c2 += cjVar.Q0;
                                }
                                i79 = c2;
                                ecVar14 = ecVar15;
                                i75 = 0;
                            } else {
                                if (i80 < size3 - 1) {
                                    ecVar12 = ((bj) arrayList3.get(i80 + 1)).b.I;
                                    i76 = 0;
                                } else {
                                    i76 = cjVar.x0;
                                    ecVar12 = ecVar9;
                                }
                                ec ecVar16 = bjVar5.b.K;
                                bjVar5.f(i56, ecVar11, ecVar14, ecVar12, ecVar13, i74, i75, i76, i77, i28);
                                int d = bjVar5.d() + i78;
                                int max = Math.max(i79, bjVar5.c());
                                if (i80 > 0) {
                                    d += cjVar.P0;
                                }
                                i79 = max;
                                i78 = d;
                                ecVar11 = ecVar16;
                                i74 = 0;
                            }
                        }
                        iArr[0] = i78;
                        iArr[1] = i79;
                    }
                    z = z2;
                }
                c = 0;
                r12 = z;
                int i382 = iArr[c] + i8 + i9;
                int i392 = iArr[r12] + i10 + i6;
                if (mode != 1073741824) {
                    size = mode == Integer.MIN_VALUE ? Math.min(i382, size) : mode == 0 ? i382 : 0;
                }
                int min = mode2 == 1073741824 ? i7 : mode2 == Integer.MIN_VALUE ? Math.min(i392, i7) : mode2 == 0 ? i392 : 0;
                cjVar.z0 = size;
                cjVar.A0 = min;
                cjVar.O(size);
                cjVar.L(min);
                cjVar.y0 = cjVar.r0 > 0 ? r12 : false;
                setMeasuredDimension(cjVar.z0, cjVar.A0);
            }
            i6 = i25;
            iArr = iArr3;
            i7 = size2;
            i8 = i22;
            i9 = i23;
            i10 = i4;
            int i81 = i5;
            tc[] tcVarArr9 = tcVarArr;
            int i82 = cjVar.V0;
            if (i81 != 0) {
                arrayList3.clear();
                bj bjVar6 = new bj(cjVar, i82, cjVar.I, cjVar.J, cjVar.K, cjVar.L, i28);
                arrayList3.add(bjVar6);
                if (i82 == 0) {
                    int i83 = 0;
                    i11 = 0;
                    int i84 = 0;
                    while (i83 < i81) {
                        tc tcVar13 = tcVarArr9[i83];
                        int U4 = cjVar.U(tcVar13, i28);
                        if (tcVar13.p0[0] == 3) {
                            i11++;
                        }
                        int i85 = i11;
                        boolean z7 = (i84 == i28 || (cjVar.P0 + i84) + U4 > i28) && bjVar6.b != null;
                        if (!z7 && i83 > 0 && (i13 = cjVar.U0) > 0 && i83 % i13 == 0) {
                            z7 = true;
                        }
                        if (z7) {
                            bjVar6 = new bj(cjVar, i82, cjVar.I, cjVar.J, cjVar.K, cjVar.L, i28);
                            bjVar6.n = i83;
                            arrayList3.add(bjVar6);
                        } else if (i83 > 0) {
                            i84 = cjVar.P0 + U4 + i84;
                            bjVar6.a(tcVar13);
                            i83++;
                            i11 = i85;
                        }
                        i84 = U4;
                        bjVar6.a(tcVar13);
                        i83++;
                        i11 = i85;
                    }
                } else {
                    int i86 = 0;
                    i11 = 0;
                    int i87 = 0;
                    while (i86 < i81) {
                        tc tcVar14 = tcVarArr9[i86];
                        int T4 = cjVar.T(tcVar14, i28);
                        if (tcVar14.p0[1] == 3) {
                            i11++;
                        }
                        int i88 = i11;
                        boolean z8 = (i87 == i28 || (cjVar.Q0 + i87) + T4 > i28) && bjVar6.b != null;
                        if (!z8 && i86 > 0 && (i12 = cjVar.U0) > 0 && i86 % i12 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            bjVar6 = new bj(cjVar, i82, cjVar.I, cjVar.J, cjVar.K, cjVar.L, i28);
                            bjVar6.n = i86;
                            arrayList3.add(bjVar6);
                        } else if (i86 > 0) {
                            i87 = cjVar.Q0 + T4 + i87;
                            bjVar6.a(tcVar14);
                            i86++;
                            i11 = i88;
                        }
                        i87 = T4;
                        bjVar6.a(tcVar14);
                        i86++;
                        i11 = i88;
                    }
                }
                int size4 = arrayList3.size();
                int i89 = cjVar.w0;
                int i90 = cjVar.s0;
                int i91 = cjVar.x0;
                int i92 = cjVar.t0;
                boolean z9 = iArr2[0] == 2 || iArr2[1] == 2;
                if (i11 > 0 && z9) {
                    for (int i93 = 0; i93 < size4; i93++) {
                        bj bjVar7 = (bj) arrayList3.get(i93);
                        if (i82 == 0) {
                            bjVar7.e(i28 - bjVar7.d());
                        } else {
                            bjVar7.e(i28 - bjVar7.c());
                        }
                    }
                }
                int i94 = i89;
                int i95 = i90;
                int i96 = i91;
                int i97 = i92;
                ec ecVar17 = ecVar8;
                ec ecVar18 = ecVar9;
                ec ecVar19 = ecVar10;
                ec ecVar20 = ecVar4;
                int i98 = 0;
                int i99 = 0;
                for (int i100 = 0; i100 < size4; i100++) {
                    bj bjVar8 = (bj) arrayList3.get(i100);
                    if (i82 == 0) {
                        if (i100 < size4 - 1) {
                            ecVar19 = ((bj) arrayList3.get(i100 + 1)).b.J;
                            i97 = 0;
                        } else {
                            i97 = cjVar.t0;
                            ecVar19 = ecVar10;
                        }
                        ec ecVar21 = bjVar8.b.L;
                        bjVar8.f(i82, ecVar17, ecVar20, ecVar18, ecVar19, i94, i95, i96, i97, i28);
                        i98 = Math.max(i98, bjVar8.d());
                        int c3 = bjVar8.c() + i99;
                        if (i100 > 0) {
                            c3 += cjVar.Q0;
                        }
                        i99 = c3;
                        ecVar20 = ecVar21;
                        i95 = 0;
                    } else {
                        if (i100 < size4 - 1) {
                            ecVar18 = ((bj) arrayList3.get(i100 + 1)).b.I;
                            i96 = 0;
                        } else {
                            i96 = cjVar.x0;
                            ecVar18 = ecVar9;
                        }
                        ec ecVar22 = bjVar8.b.K;
                        bjVar8.f(i82, ecVar17, ecVar20, ecVar18, ecVar19, i94, i95, i96, i97, i28);
                        int d2 = bjVar8.d() + i98;
                        int max2 = Math.max(i99, bjVar8.c());
                        if (i100 > 0) {
                            d2 += cjVar.P0;
                        }
                        i99 = max2;
                        i98 = d2;
                        ecVar17 = ecVar22;
                        i94 = 0;
                    }
                }
                iArr[0] = i98;
                iArr[1] = i99;
            }
        }
        z = true;
        c = 0;
        r12 = z;
        int i3822 = iArr[c] + i8 + i9;
        int i3922 = iArr[r12] + i10 + i6;
        if (mode != 1073741824) {
        }
        if (mode2 == 1073741824) {
        }
        cjVar.z0 = size;
        cjVar.A0 = min;
        cjVar.O(size);
        cjVar.L(min);
        cjVar.y0 = cjVar.r0 > 0 ? r12 : false;
        setMeasuredDimension(cjVar.z0, cjVar.A0);
    }

    @Override // defpackage.gc, android.view.View
    public final void onMeasure(int i, int i2) {
        j(this.o, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.o.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.o.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.o.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.o.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.o.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.o.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.o.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.o.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.o.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.o.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.o.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.o.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.o.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.o.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        cj cjVar = this.o;
        cjVar.s0 = i;
        cjVar.t0 = i;
        cjVar.u0 = i;
        cjVar.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.o.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.o.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.o.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.o.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.o.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.o.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.o.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.o.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.o.T0 = i;
        requestLayout();
    }
}
