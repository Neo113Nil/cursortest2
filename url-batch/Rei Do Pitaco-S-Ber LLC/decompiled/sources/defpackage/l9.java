package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class l9 extends w90 {
    public final ArrayList k;
    public int l;

    public l9(tc tcVar, int i) {
        super(tcVar);
        tc tcVar2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        tc tcVar3 = this.b;
        tc m = tcVar3.m(i);
        while (true) {
            tcVar2 = tcVar3;
            tcVar3 = m;
            if (tcVar3 == null) {
                break;
            } else {
                m = tcVar3.m(this.f);
            }
        }
        this.b = tcVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? tcVar2.d : i2 == 1 ? tcVar2.e : null);
        tc l = tcVar2.l(this.f);
        while (l != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? l.d : i3 == 1 ? l.e : null);
            l = l.l(this.f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            w90 w90Var = (w90) obj;
            int i5 = this.f;
            if (i5 == 0) {
                w90Var.b.b = this;
            } else if (i5 == 1) {
                w90Var.b.c = this;
            }
        }
        if (this.f == 0 && ((uc) this.b.T).v0 && arrayList.size() > 1) {
            this.b = ((w90) arrayList.get(arrayList.size() - 1)).b;
        }
        int i6 = this.f;
        tc tcVar4 = this.b;
        this.l = i6 == 0 ? tcVar4.i0 : tcVar4.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0390, code lost:
    
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // defpackage.xe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(xe xeVar) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        int i13;
        ze zeVar = this.h;
        if (zeVar.j) {
            ze zeVar2 = this.i;
            if (zeVar2.j) {
                tc tcVar = this.b.T;
                boolean z3 = tcVar instanceof uc ? ((uc) tcVar).v0 : false;
                int i14 = zeVar2.g - zeVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((w90) arrayList.get(i15)).b.g0 != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                int i17 = i16;
                while (true) {
                    if (i17 < 0) {
                        break;
                    }
                    if (((w90) arrayList.get(i17)).b.g0 != 8) {
                        i = i17;
                        break;
                    }
                    i17--;
                }
                int i18 = 0;
                while (i18 < 2) {
                    f = 0.0f;
                    int i19 = 0;
                    i5 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    while (i19 < size) {
                        w90 w90Var = (w90) arrayList.get(i19);
                        tc tcVar2 = w90Var.b;
                        boolean z4 = z3;
                        if (tcVar2.g0 == i2) {
                            i12 = i18;
                        } else {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += w90Var.h.f;
                            }
                            mf mfVar = w90Var.e;
                            int i22 = mfVar.g;
                            i12 = i18;
                            boolean z5 = w90Var.d != 3;
                            if (z5) {
                                int i23 = this.f;
                                if (i23 == 0 && !tcVar2.d.e.j) {
                                    return;
                                }
                                if (i23 == 1 && !tcVar2.e.e.j) {
                                    return;
                                } else {
                                    z2 = z5;
                                }
                            } else {
                                z2 = z5;
                                if (w90Var.a == 1 && i12 == 0) {
                                    i13 = mfVar.m;
                                    i20++;
                                } else if (mfVar.j) {
                                    i13 = i22;
                                }
                                z2 = true;
                                if (z2) {
                                    i20++;
                                    float f3 = tcVar2.k0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 < i16 && i19 < i) {
                                    i5 += -w90Var.i.f;
                                }
                            }
                            i13 = i22;
                            if (z2) {
                            }
                            if (i19 < i16) {
                                i5 += -w90Var.i.f;
                            }
                        }
                        i19++;
                        z3 = z4;
                        i18 = i12;
                        i2 = 8;
                    }
                    z = z3;
                    int i24 = i18;
                    if (i5 < i14 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                        break;
                    } else {
                        i18 = i24 + 1;
                        z3 = z;
                        i2 = 8;
                    }
                }
                z = z3;
                f = 0.0f;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                int i25 = zeVar.g;
                if (z) {
                    i25 = zeVar2.g;
                }
                float f4 = 0.5f;
                if (i5 > i14) {
                    i25 = z ? i25 + ((int) (((i5 - i14) / 2.0f) + 0.5f)) : i25 - ((int) (((i5 - i14) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i14 - i5;
                    int i26 = (int) ((f5 / i3) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        float f6 = f4;
                        w90 w90Var2 = (w90) arrayList.get(i27);
                        int i29 = i25;
                        tc tcVar3 = w90Var2.b;
                        int i30 = i3;
                        mf mfVar2 = w90Var2.e;
                        float f7 = f5;
                        int i31 = i26;
                        if (tcVar3.g0 == 8 || w90Var2.d != 3 || mfVar2.j) {
                            i11 = i27;
                        } else {
                            int i32 = f > 0.0f ? (int) (((tcVar3.k0[this.f] * f7) / f) + f6) : i31;
                            if (this.f == 0) {
                                i9 = tcVar3.v;
                                i10 = tcVar3.u;
                            } else {
                                i9 = tcVar3.y;
                                i10 = tcVar3.x;
                            }
                            i11 = i27;
                            int max = Math.max(i10, w90Var2.a == 1 ? Math.min(i32, mfVar2.m) : i32);
                            if (i9 > 0) {
                                max = Math.min(i9, max);
                            }
                            if (max != i32) {
                                i28++;
                                i32 = max;
                            }
                            mfVar2.d(i32);
                        }
                        i27 = i11 + 1;
                        i25 = i29;
                        f4 = f6;
                        i3 = i30;
                        f5 = f7;
                        i26 = i31;
                    }
                    i6 = i25;
                    f2 = f4;
                    int i33 = i3;
                    if (i28 > 0) {
                        i3 = i33 - i28;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            w90 w90Var3 = (w90) arrayList.get(i34);
                            if (w90Var3.b.g0 != 8) {
                                if (i34 > 0 && i34 >= i15) {
                                    i5 += w90Var3.h.f;
                                }
                                i5 += w90Var3.e.g;
                                if (i34 < i16 && i34 < i) {
                                    i5 += -w90Var3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.l == 2 && i28 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i25;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i14) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.l = i8;
                }
                int i35 = this.l;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        w90 w90Var4 = (w90) arrayList.get(z ? size - (i38 + 1) : i38);
                        tc tcVar4 = w90Var4.b;
                        ze zeVar3 = w90Var4.i;
                        ze zeVar4 = w90Var4.h;
                        if (tcVar4.g0 == 8) {
                            zeVar4.d(i37);
                            zeVar3.d(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i15) {
                                i37 = z ? i37 - zeVar4.f : i37 + zeVar4.f;
                            }
                            if (z) {
                                zeVar3.d(i37);
                            } else {
                                zeVar4.d(i37);
                            }
                            mf mfVar3 = w90Var4.e;
                            int i39 = mfVar3.g;
                            if (w90Var4.d == 3 && w90Var4.a == 1) {
                                i39 = mfVar3.m;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                zeVar4.d(i37);
                            } else {
                                zeVar3.d(i37);
                            }
                            w90Var4.g = true;
                            if (i38 < i16 && i38 < i) {
                                i37 = z ? i37 - (-zeVar3.f) : i37 + (-zeVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        w90 w90Var5 = (w90) arrayList.get(z ? size - (i42 + 1) : i42);
                        tc tcVar5 = w90Var5.b;
                        ze zeVar5 = w90Var5.i;
                        ze zeVar6 = w90Var5.h;
                        if (tcVar5.g0 == 8) {
                            zeVar6.d(i41);
                            zeVar5.d(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i15) {
                                i43 = z ? i43 - zeVar6.f : i43 + zeVar6.f;
                            }
                            if (z) {
                                zeVar5.d(i43);
                            } else {
                                zeVar6.d(i43);
                            }
                            mf mfVar4 = w90Var5.e;
                            int i44 = mfVar4.g;
                            if (w90Var5.d == 3 && w90Var5.a == 1) {
                                i44 = Math.min(i44, mfVar4.m);
                            }
                            i41 = z ? i43 - i44 : i43 + i44;
                            if (z) {
                                zeVar6.d(i41);
                            } else {
                                zeVar5.d(i41);
                            }
                            if (i42 < i16 && i42 < i) {
                                i41 = z ? i41 - (-zeVar5.f) : i41 + (-zeVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    int i45 = this.f;
                    tc tcVar6 = this.b;
                    float f8 = i45 == 0 ? tcVar6.d0 : tcVar6.e0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i46 = (int) (((i14 - i5) * f8) + f2);
                    if (i46 < 0 || i3 > 0) {
                        i46 = i7;
                    }
                    int i47 = z ? i6 - i46 : i6 + i46;
                    for (int i48 = i7; i48 < size; i48++) {
                        w90 w90Var6 = (w90) arrayList.get(z ? size - (i48 + 1) : i48);
                        tc tcVar7 = w90Var6.b;
                        ze zeVar7 = w90Var6.i;
                        ze zeVar8 = w90Var6.h;
                        if (tcVar7.g0 == 8) {
                            zeVar8.d(i47);
                            zeVar7.d(i47);
                        } else {
                            if (i48 > 0 && i48 >= i15) {
                                i47 = z ? i47 - zeVar8.f : i47 + zeVar8.f;
                            }
                            if (z) {
                                zeVar7.d(i47);
                            } else {
                                zeVar8.d(i47);
                            }
                            mf mfVar5 = w90Var6.e;
                            int i49 = mfVar5.g;
                            if (w90Var6.d == 3 && w90Var6.a == 1) {
                                i49 = mfVar5.m;
                            }
                            i47 += i49;
                            if (z) {
                                zeVar8.d(i47);
                            } else {
                                zeVar7.d(i47);
                            }
                            if (i48 < i16 && i48 < i) {
                                i47 = z ? i47 - (-zeVar7.f) : i47 + (-zeVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.w90
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((w90) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        tc tcVar = ((w90) arrayList.get(0)).b;
        tc tcVar2 = ((w90) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        ze zeVar = this.i;
        ze zeVar2 = this.h;
        if (i2 == 0) {
            ec ecVar = tcVar.I;
            ec ecVar2 = tcVar2.K;
            ze i3 = w90.i(ecVar, 0);
            int e = ecVar.e();
            tc m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                w90.b(zeVar2, i3, e);
            }
            ze i4 = w90.i(ecVar2, 0);
            int e2 = ecVar2.e();
            tc n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                w90.b(zeVar, i4, -e2);
            }
        } else {
            ec ecVar3 = tcVar.J;
            ec ecVar4 = tcVar2.L;
            ze i5 = w90.i(ecVar3, 1);
            int e3 = ecVar3.e();
            tc m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                w90.b(zeVar2, i5, e3);
            }
            ze i6 = w90.i(ecVar4, 1);
            int e4 = ecVar4.e();
            tc n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                w90.b(zeVar, i6, -e4);
            }
        }
        zeVar2.a = this;
        zeVar.a = this;
    }

    @Override // defpackage.w90
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((w90) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // defpackage.w90
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((w90) obj).f();
        }
    }

    @Override // defpackage.w90
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r4.i.f + ((w90) arrayList.get(i)).j() + j + r4.h.f;
        }
        return j;
    }

    @Override // defpackage.w90
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((w90) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final tc m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            tc tcVar = ((w90) arrayList.get(i)).b;
            if (tcVar.g0 != 8) {
                return tcVar;
            }
            i++;
        }
    }

    public final tc n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            tc tcVar = ((w90) arrayList.get(size)).b;
            if (tcVar.g0 != 8) {
                return tcVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((w90) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
