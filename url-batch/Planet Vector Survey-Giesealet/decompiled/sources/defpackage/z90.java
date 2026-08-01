package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z90 extends ha0 {
    public final t50 c;
    public final a7 d;
    public final b40 e;
    public ea0 f;
    public qg0 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public z90(t50 t50Var) {
        this.c = t50Var;
        a7 a7Var = new a7(3);
        a7Var.c = new long[2];
        this.d = a7Var;
        this.e = new b40(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44, types: [t50] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [l70] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [l70] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    @Override // defpackage.ha0
    public final boolean a(b40 b40Var, b10 b10Var, j3 j3Var, boolean z) {
        a7 a7Var;
        b40 b40Var2;
        Object obj;
        boolean z2;
        boolean z3;
        qg0 qg0Var;
        int i;
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        wg0 wg0Var;
        boolean a = super.a(b40Var, b10Var, j3Var, z);
        ol olVar = this.c;
        boolean z6 = true;
        if (olVar.q) {
            ?? r8 = 0;
            while (olVar != 0) {
                if (olVar instanceof zg0) {
                    this.f = nz.Y((zg0) olVar, 16);
                } else if ((olVar.f & 16) != 0 && (olVar instanceof ol)) {
                    t50 t50Var = olVar.s;
                    int i6 = 0;
                    olVar = olVar;
                    r8 = r8;
                    while (t50Var != null) {
                        if ((t50Var.f & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                olVar = t50Var;
                            } else {
                                if (r8 == 0) {
                                    r8 = new l70(new t50[16]);
                                }
                                if (olVar != 0) {
                                    r8.b(olVar);
                                    olVar = 0;
                                }
                                r8.b(t50Var);
                            }
                        }
                        t50Var = t50Var.i;
                        olVar = olVar;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                olVar = nz.j(r8);
            }
            if (this.f != null) {
                int c = b40Var.c();
                int i7 = 0;
                while (true) {
                    a7Var = this.d;
                    b40Var2 = this.e;
                    if (i7 >= c) {
                        break;
                    }
                    long a2 = b40Var.a(i7);
                    wg0 wg0Var2 = (wg0) b40Var.d(i7);
                    if (a7Var.b(a2)) {
                        boolean z7 = z6;
                        long j = wg0Var2.g;
                        List list = wg0Var2.k;
                        long j2 = wg0Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z5 = z7;
                            List list2 = wp.d;
                            z4 = a;
                            ArrayList arrayList = new ArrayList((list == null ? list2 : list).size());
                            List list3 = list == null ? list2 : list;
                            i3 = c;
                            int size = list3.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list4 = list3;
                                gw gwVar = (gw) list3.get(i8);
                                b40 b40Var3 = b40Var2;
                                long j3 = a2;
                                long j4 = gwVar.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    wg0Var = wg0Var2;
                                    long j5 = gwVar.a;
                                    i5 = size;
                                    ea0 ea0Var = this.f;
                                    ea0Var.getClass();
                                    arrayList.add(new gw(j5, ea0Var.E0(b10Var, j4), gwVar.c));
                                } else {
                                    i5 = size;
                                    wg0Var = wg0Var2;
                                }
                                i8++;
                                size = i5;
                                list3 = list4;
                                b40Var2 = b40Var3;
                                a2 = j3;
                                wg0Var2 = wg0Var;
                            }
                            b40 b40Var4 = b40Var2;
                            long j6 = a2;
                            ea0 ea0Var2 = this.f;
                            ea0Var2.getClass();
                            long E0 = ea0Var2.E0(b10Var, j);
                            ea0 ea0Var3 = this.f;
                            ea0Var3.getClass();
                            wg0 wg0Var3 = new wg0(wg0Var2.a, wg0Var2.b, ea0Var3.E0(b10Var, j2), wg0Var2.d, wg0Var2.e, wg0Var2.f, E0, wg0Var2.h, wg0Var2.i, arrayList, wg0Var2.j, wg0Var2.l);
                            wg0 wg0Var4 = wg0Var2.o;
                            if (wg0Var4 == null) {
                                wg0Var4 = wg0Var2;
                            }
                            wg0Var3.o = wg0Var4;
                            wg0 wg0Var5 = wg0Var2.o;
                            if (wg0Var5 != null) {
                                wg0Var2 = wg0Var5;
                            }
                            wg0Var3.o = wg0Var2;
                            b40Var4.b(j6, wg0Var3);
                        } else {
                            z4 = a;
                            i3 = c;
                            i4 = i7;
                            z5 = z7;
                        }
                    } else {
                        z4 = a;
                        i3 = c;
                        z5 = z6;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    c = i3;
                    z6 = z5;
                    a = z4;
                }
                boolean z8 = a;
                boolean z9 = z6;
                if (b40Var2.c() == 0) {
                    a7Var.b = 0;
                    this.a.g();
                    return z9;
                }
                int i9 = a7Var.b;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = ((long[]) a7Var.c)[i9];
                    if (b40Var.d) {
                        int i10 = b40Var.g;
                        long[] jArr = b40Var.e;
                        Object[] objArr = b40Var.f;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != nz.i) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        b40Var.d = false;
                        b40Var.g = i11;
                    }
                    if (nz.p(b40Var.e, b40Var.g, j7) < 0 && i9 < (i2 = a7Var.b)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = (long[]) a7Var.c;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        a7Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(b40Var2.c());
                int c2 = b40Var2.c();
                for (int i16 = 0; i16 < c2; i16++) {
                    arrayList2.add(b40Var2.d(i16));
                }
                qg0 qg0Var2 = new qg0(arrayList2, j3Var);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i17);
                    if (j3Var.e(((wg0) obj).a)) {
                        break;
                    }
                    i17++;
                }
                wg0 wg0Var6 = (wg0) obj;
                if (wg0Var6 != null) {
                    boolean z10 = wg0Var6.d;
                    if (z) {
                        z2 = false;
                        if (!this.i && (z10 || wg0Var6.h)) {
                            ea0 ea0Var4 = this.f;
                            ea0Var4.getClass();
                            long j8 = ea0Var4.f;
                            long j9 = wg0Var6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            this.i = !((intBitsToFloat2 > ((float) ((int) (j8 & 4294967295L))) ? z9 : false) | (intBitsToFloat2 < 0.0f ? z9 : false) | (intBitsToFloat > ((float) i18) ? z9 : false) | (intBitsToFloat < 0.0f ? z9 : false));
                        }
                    } else {
                        z2 = false;
                        this.i = false;
                    }
                    boolean z11 = this.i;
                    boolean z12 = this.h;
                    if (z11 == z12 || !((i = qg0Var2.b) == 3 || i == 4 || i == 5)) {
                        int i19 = qg0Var2.b;
                        if (i19 == 4 && z12 && !this.j) {
                            qg0Var2.b = 3;
                        } else if (i19 == 5 && z11 && z10) {
                            qg0Var2.b = 3;
                        }
                    } else {
                        qg0Var2.b = z11 ? 4 : 5;
                    }
                } else {
                    z2 = false;
                }
                if (!z8 && qg0Var2.b == 3 && (qg0Var = this.g) != null) {
                    ?? r1 = qg0Var.a;
                    int size3 = r1.size();
                    ?? r4 = qg0Var2.a;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r5 = z2; r5 < size4; r5++) {
                            if (ra0.b(((wg0) r1.get(r5)).c, ((wg0) r4.get(r5)).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = qg0Var2;
                        return z3;
                    }
                }
                z3 = z9;
                this.g = qg0Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.ha0
    public final void b(j3 j3Var) {
        super.b(j3Var);
        qg0 qg0Var = this.g;
        if (qg0Var == null) {
            return;
        }
        this.h = this.i;
        List list = qg0Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wg0 wg0Var = (wg0) list.get(i);
            boolean z = wg0Var.d;
            long j = wg0Var.a;
            boolean e = j3Var.e(j);
            boolean z2 = this.i;
            if ((!z && !e) || (!z && !z2)) {
                this.d.d(j);
            }
        }
        this.i = false;
        this.j = qg0Var.b == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [l70] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [l70] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [t50] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [t50] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        l70 l70Var = this.a;
        Object[] objArr = l70Var.d;
        int i = l70Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((z90) objArr[i2]).c();
        }
        ol olVar = this.c;
        ?? r1 = 0;
        while (olVar != 0) {
            if (olVar instanceof zg0) {
                ((zg0) olVar).L();
            } else if ((olVar.f & 16) != 0 && (olVar instanceof ol)) {
                t50 t50Var = olVar.s;
                int i3 = 0;
                r1 = r1;
                olVar = olVar;
                while (t50Var != null) {
                    if ((t50Var.f & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            olVar = t50Var;
                        } else {
                            if (r1 == 0) {
                                r1 = new l70(new t50[16]);
                            }
                            if (olVar != 0) {
                                r1.b(olVar);
                                olVar = 0;
                            }
                            r1.b(t50Var);
                        }
                    }
                    t50Var = t50Var.i;
                    r1 = r1;
                    olVar = olVar;
                }
                if (i3 == 1) {
                }
            }
            olVar = nz.j(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008d A[LOOP:0: B:5:0x008b->B:6:0x008d, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [t50] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [l70] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [l70] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(j3 j3Var) {
        boolean z;
        int i;
        int i2;
        b40 b40Var = this.e;
        if (b40Var.c() != 0) {
            t50 t50Var = this.c;
            if (t50Var.q) {
                qg0 qg0Var = this.g;
                qg0Var.getClass();
                ea0 ea0Var = this.f;
                ea0Var.getClass();
                long j = ea0Var.f;
                ol olVar = t50Var;
                ?? r8 = 0;
                while (true) {
                    z = true;
                    if (olVar == 0) {
                        break;
                    }
                    if (olVar instanceof zg0) {
                        ((zg0) olVar).s(qg0Var, sg0.f, j);
                    } else if ((olVar.f & 16) != 0 && (olVar instanceof ol)) {
                        t50 t50Var2 = olVar.s;
                        int i3 = 0;
                        olVar = olVar;
                        r8 = r8;
                        while (t50Var2 != null) {
                            if ((t50Var2.f & 16) != 0) {
                                i3++;
                                r8 = r8;
                                if (i3 == 1) {
                                    olVar = t50Var2;
                                } else {
                                    if (r8 == 0) {
                                        r8 = new l70(new t50[16]);
                                    }
                                    if (olVar != 0) {
                                        r8.b(olVar);
                                        olVar = 0;
                                    }
                                    r8.b(t50Var2);
                                }
                            }
                            t50Var2 = t50Var2.i;
                            olVar = olVar;
                            r8 = r8;
                        }
                        if (i3 == 1) {
                        }
                    }
                    olVar = nz.j(r8);
                }
                if (t50Var.q) {
                    l70 l70Var = this.a;
                    Object[] objArr = l70Var.d;
                    int i4 = l70Var.f;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((z90) objArr[i5]).d(j3Var);
                    }
                }
                b(j3Var);
                i = b40Var.g;
                Object[] objArr2 = b40Var.f;
                for (i2 = 0; i2 < i; i2++) {
                    objArr2[i2] = null;
                }
                b40Var.g = 0;
                b40Var.d = false;
                this.f = null;
                return z;
            }
        }
        z = false;
        b(j3Var);
        i = b40Var.g;
        Object[] objArr22 = b40Var.f;
        while (i2 < i) {
        }
        b40Var.g = 0;
        b40Var.d = false;
        this.f = null;
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [t50] */
    /* JADX WARN: Type inference failed for: r0v3, types: [t50] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [t50] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [l70] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [l70] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v10, types: [t50] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [l70] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [l70] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(j3 j3Var, boolean z) {
        if (this.e.c() == 0) {
            return false;
        }
        ol olVar = this.c;
        if (!olVar.q) {
            return false;
        }
        qg0 qg0Var = this.g;
        qg0Var.getClass();
        ea0 ea0Var = this.f;
        ea0Var.getClass();
        long j = ea0Var.f;
        ol olVar2 = olVar;
        ?? r7 = 0;
        while (olVar2 != 0) {
            if (olVar2 instanceof zg0) {
                ((zg0) olVar2).s(qg0Var, sg0.d, j);
            } else if ((olVar2.f & 16) != 0 && (olVar2 instanceof ol)) {
                t50 t50Var = olVar2.s;
                int i = 0;
                olVar2 = olVar2;
                r7 = r7;
                while (t50Var != null) {
                    if ((t50Var.f & 16) != 0) {
                        i++;
                        r7 = r7;
                        if (i == 1) {
                            olVar2 = t50Var;
                        } else {
                            if (r7 == 0) {
                                r7 = new l70(new t50[16]);
                            }
                            if (olVar2 != 0) {
                                r7.b(olVar2);
                                olVar2 = 0;
                            }
                            r7.b(t50Var);
                        }
                    }
                    t50Var = t50Var.i;
                    olVar2 = olVar2;
                    r7 = r7;
                }
                if (i == 1) {
                }
            }
            olVar2 = nz.j(r7);
        }
        if (olVar.q) {
            l70 l70Var = this.a;
            Object[] objArr = l70Var.d;
            int i2 = l70Var.f;
            for (int i3 = 0; i3 < i2; i3++) {
                z90 z90Var = (z90) objArr[i3];
                this.f.getClass();
                z90Var.e(j3Var, z);
            }
        }
        if (olVar.q) {
            ?? r13 = 0;
            while (olVar != 0) {
                if (olVar instanceof zg0) {
                    ((zg0) olVar).s(qg0Var, sg0.e, j);
                } else if ((olVar.f & 16) != 0 && (olVar instanceof ol)) {
                    t50 t50Var2 = olVar.s;
                    int i4 = 0;
                    olVar = olVar;
                    r13 = r13;
                    while (t50Var2 != null) {
                        if ((t50Var2.f & 16) != 0) {
                            i4++;
                            r13 = r13;
                            if (i4 == 1) {
                                olVar = t50Var2;
                            } else {
                                if (r13 == 0) {
                                    r13 = new l70(new t50[16]);
                                }
                                if (olVar != 0) {
                                    r13.b(olVar);
                                    olVar = 0;
                                }
                                r13.b(t50Var2);
                            }
                        }
                        t50Var2 = t50Var2.i;
                        olVar = olVar;
                        r13 = r13;
                    }
                    if (i4 == 1) {
                    }
                }
                olVar = nz.j(r13);
            }
        }
        return true;
    }

    public final void f(long j, x60 x60Var) {
        a7 a7Var = this.d;
        if (a7Var.b(j) && x60Var.f(this) < 0) {
            a7Var.d(j);
            b40 b40Var = this.e;
            int p = nz.p(b40Var.e, b40Var.g, j);
            if (p >= 0) {
                Object[] objArr = b40Var.f;
                Object obj = objArr[p];
                Object obj2 = nz.i;
                if (obj != obj2) {
                    objArr[p] = obj2;
                    b40Var.d = true;
                }
            }
        }
        l70 l70Var = this.a;
        Object[] objArr2 = l70Var.d;
        int i = l70Var.f;
        for (int i2 = 0; i2 < i; i2++) {
            ((z90) objArr2[i2]).f(j, x60Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ')';
    }
}
