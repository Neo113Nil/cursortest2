package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class EE extends C1590ns {
    public final TC j;
    public final C1143h2 k;
    public final C1219iB l;
    public ME m;
    public EI n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f36o;
    public boolean p;
    public boolean q;

    public EE(TC tc) {
        super(17, (byte) 0);
        this.j = tc;
        C1143h2 c1143h2 = new C1143h2();
        c1143h2.i = new long[2];
        this.k = c1143h2;
        this.l = new C1219iB(2);
        this.p = true;
        this.q = true;
    }

    public final boolean A(C2002u5 c2002u5, boolean z) {
        YD yd;
        int i;
        int i2 = 0;
        if (this.l.e() == 0) {
            return false;
        }
        TC tc = this.j;
        if (!tc.m) {
            return false;
        }
        AbstractC0048Bt.k(this.n);
        AbstractC0048Bt.k(this.m);
        for (TC tc2 = tc; tc2 != null; tc2 = null) {
            if (tc2 instanceof X7) {
                AbstractC0048Bt.l(((X7) tc2).n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                throw new ClassCastException();
            }
        }
        if (tc.m && (i = (yd = (YD) this.i).j) > 0) {
            Object[] objArr = yd.h;
            do {
                EE ee = (EE) objArr[i2];
                AbstractC0048Bt.k(this.m);
                ee.A(c2002u5, z);
                i2++;
            } while (i2 < i);
        }
        if (tc.m) {
            while (tc != null) {
                if (tc instanceof X7) {
                    AbstractC0048Bt.l(((X7) tc).n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                    throw new ClassCastException();
                }
                tc = null;
            }
        }
        return true;
    }

    public final void B(long j, HD hd) {
        C1143h2 c1143h2 = this.k;
        int i = 0;
        if (c1143h2.e(j)) {
            Object[] objArr = hd.a;
            int i2 = hd.b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    i3 = -1;
                    break;
                } else if (equals(objArr[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            if (!(i3 >= 0)) {
                int i4 = c1143h2.h;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    if (j == ((long[]) c1143h2.i)[i5]) {
                        c1143h2.h(i5);
                        break;
                    }
                    i5++;
                }
                this.l.d(j);
            }
        }
        YD yd = (YD) this.i;
        int i6 = yd.j;
        if (i6 > 0) {
            Object[] objArr2 = yd.h;
            do {
                ((EE) objArr2[i]).B(j, hd);
                i++;
            } while (i < i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    @Override // o.C1590ns
    public final boolean h(C1219iB c1219iB, InterfaceC1991ty interfaceC1991ty, C2002u5 c2002u5, boolean z) {
        C1219iB c1219iB2;
        C1143h2 c1143h2;
        Object obj;
        boolean z2;
        boolean z3;
        EI ei;
        int i;
        boolean z4;
        int i2;
        boolean z5;
        int i3;
        int i4;
        HI hi;
        ArrayList arrayList;
        InterfaceC1991ty interfaceC1991ty2 = interfaceC1991ty;
        boolean h = super.h(c1219iB, interfaceC1991ty, c2002u5, z);
        TC tc = this.j;
        boolean z6 = true;
        if (!tc.m) {
            return true;
        }
        while (tc != null) {
            if (tc instanceof X7) {
                this.m = AbstractC0946e20.I((X7) tc, 16);
            }
            tc = null;
        }
        int e = c1219iB.e();
        int i5 = 0;
        while (true) {
            c1219iB2 = this.l;
            c1143h2 = this.k;
            if (i5 >= e) {
                break;
            }
            long b = c1219iB.b(i5);
            HI hi2 = (HI) c1219iB.f(i5);
            if (c1143h2.e(b)) {
                boolean z7 = z6;
                long j = hi2.g;
                i3 = i5;
                long j2 = hi2.c;
                if (BF.d(j) && BF.d(j2)) {
                    z5 = z7;
                    ArrayList arrayList2 = new ArrayList(hi2.k.size());
                    ArrayList arrayList3 = hi2.k;
                    z4 = h;
                    int size = arrayList3.size();
                    i2 = e;
                    int i6 = 0;
                    while (i6 < size) {
                        int i7 = size;
                        C1984tr c1984tr = (C1984tr) arrayList3.get(i6);
                        long j3 = b;
                        long j4 = c1984tr.b;
                        if (BF.d(j4)) {
                            hi = hi2;
                            arrayList = arrayList3;
                            long j5 = c1984tr.a;
                            i4 = i6;
                            ME me = this.m;
                            AbstractC0048Bt.k(me);
                            arrayList2.add(new C1984tr(j5, me.p0(interfaceC1991ty2, j4), c1984tr.c));
                        } else {
                            i4 = i6;
                            hi = hi2;
                            arrayList = arrayList3;
                        }
                        i6 = i4 + 1;
                        arrayList3 = arrayList;
                        size = i7;
                        b = j3;
                        hi2 = hi;
                    }
                    ME me2 = this.m;
                    AbstractC0048Bt.k(me2);
                    long p0 = me2.p0(interfaceC1991ty2, j);
                    ME me3 = this.m;
                    AbstractC0048Bt.k(me3);
                    HI hi3 = new HI(hi2.a, hi2.b, me3.p0(interfaceC1991ty2, j2), hi2.d, hi2.e, hi2.f, p0, hi2.h, hi2.i, arrayList2, hi2.j, hi2.l);
                    hi3.m = hi2.m;
                    c1219iB2.c(b, hi3);
                } else {
                    z4 = h;
                    i2 = e;
                    z5 = z7;
                }
            } else {
                z4 = h;
                i2 = e;
                z5 = z6;
                i3 = i5;
            }
            i5 = i3 + 1;
            interfaceC1991ty2 = interfaceC1991ty;
            z6 = z5;
            h = z4;
            e = i2;
        }
        boolean z8 = h;
        boolean z9 = z6;
        if (c1219iB2.e() == 0) {
            c1143h2.h = 0;
            ((YD) this.i).h();
            return z9;
        }
        int i8 = c1143h2.h;
        while (true) {
            i8--;
            if (-1 >= i8) {
                break;
            }
            long j6 = ((long[]) c1143h2.i)[i8];
            if (c1219iB.h) {
                int i9 = c1219iB.k;
                long[] jArr = c1219iB.i;
                Object[] objArr = c1219iB.j;
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    Object obj2 = objArr[i11];
                    if (obj2 != AbstractC0946e20.e) {
                        if (i11 != i10) {
                            jArr[i10] = jArr[i11];
                            objArr[i10] = obj2;
                            objArr[i11] = null;
                        }
                        i10++;
                    }
                }
                c1219iB.h = false;
                c1219iB.k = i10;
            }
            if (AbstractC1473m3.i(c1219iB.i, c1219iB.k, j6) < 0) {
                c1143h2.h(i8);
            }
        }
        ArrayList arrayList4 = new ArrayList(c1219iB2.e());
        int e2 = c1219iB2.e();
        for (int i12 = 0; i12 < e2; i12++) {
            arrayList4.add(c1219iB2.f(i12));
        }
        EI ei2 = new EI(arrayList4, c2002u5);
        int size2 = arrayList4.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                obj = null;
                break;
            }
            obj = arrayList4.get(i13);
            if (c2002u5.y(((HI) obj).a)) {
                break;
            }
            i13++;
        }
        HI hi4 = (HI) obj;
        if (hi4 != null) {
            boolean z10 = hi4.d;
            if (z) {
                z2 = false;
                if (!this.p && (z10 || hi4.h)) {
                    ME me4 = this.m;
                    AbstractC0048Bt.k(me4);
                    long j7 = me4.d;
                    long j8 = hi4.c;
                    float b2 = BF.b(j8);
                    float c = BF.c(j8);
                    this.p = !((b2 < 0.0f || b2 > ((float) ((int) (j7 >> 32))) || c < 0.0f || c > ((float) ((int) (j7 & 4294967295L)))) ? z9 : false);
                }
            } else {
                z2 = false;
                this.p = false;
            }
            boolean z11 = this.p;
            boolean z12 = this.f36o;
            if (z11 == z12 || !((i = ei2.b) == 3 || i == 4 || i == 5)) {
                int i14 = ei2.b;
                if (i14 == 4 && z12 && !this.q) {
                    ei2.b = 3;
                } else if (i14 == 5 && z11 && z10) {
                    ei2.b = 3;
                }
            } else {
                ei2.b = z11 ? 4 : 5;
            }
        } else {
            z2 = false;
        }
        if (!z8 && ei2.b == 3 && (ei = this.n) != null) {
            ?? r1 = ei.a;
            int size3 = r1.size();
            ?? r4 = ei2.a;
            if (size3 == r4.size()) {
                int size4 = r4.size();
                for (?? r5 = z2; r5 < size4; r5++) {
                    if (BF.a(((HI) r1.get(r5)).c, ((HI) r4.get(r5)).c)) {
                    }
                }
                z3 = z2;
                this.n = ei2;
                return z3;
            }
        }
        z3 = z9;
        this.n = ei2;
        return z3;
    }

    @Override // o.C1590ns
    public final void i(C2002u5 c2002u5) {
        super.i(c2002u5);
        EI ei = this.n;
        if (ei == null) {
            return;
        }
        this.f36o = this.p;
        ArrayList arrayList = ei.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            HI hi = (HI) arrayList.get(i);
            boolean z = hi.d;
            long j = hi.a;
            boolean y = c2002u5.y(j);
            boolean z2 = this.p;
            if ((!z && !y) || (!z && !z2)) {
                C1143h2 c1143h2 = this.k;
                int i2 = c1143h2.h;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    if (j == ((long[]) c1143h2.i)[i3]) {
                        c1143h2.h(i3);
                        break;
                    }
                    i3++;
                }
            }
        }
        this.p = false;
        this.q = ei.b == 5;
    }

    @Override // o.C1590ns
    public final String toString() {
        return "Node(pointerInputFilter=" + this.j + ", children=" + ((YD) this.i) + ", pointerIds=" + this.k + ')';
    }

    public final void y() {
        YD yd = (YD) this.i;
        int i = yd.j;
        if (i > 0) {
            Object[] objArr = yd.h;
            int i2 = 0;
            do {
                ((EE) objArr[i2]).y();
                i2++;
            } while (i2 < i);
        }
        for (TC tc = this.j; tc != null; tc = null) {
            if (tc instanceof X7) {
                AbstractC0048Bt.l(((X7) tc).n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                throw new ClassCastException();
            }
        }
    }

    public final boolean z(C2002u5 c2002u5) {
        YD yd;
        int i;
        C1219iB c1219iB = this.l;
        boolean z = false;
        int i2 = 0;
        z = false;
        if (c1219iB.e() != 0) {
            TC tc = this.j;
            if (tc.m) {
                AbstractC0048Bt.k(this.n);
                AbstractC0048Bt.k(this.m);
                for (TC tc2 = tc; tc2 != null; tc2 = null) {
                    if (tc2 instanceof X7) {
                        AbstractC0048Bt.l(((X7) tc2).n, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
                        throw new ClassCastException();
                    }
                }
                if (tc.m && (i = (yd = (YD) this.i).j) > 0) {
                    Object[] objArr = yd.h;
                    do {
                        ((EE) objArr[i2]).z(c2002u5);
                        i2++;
                    } while (i2 < i);
                }
                z = true;
            }
        }
        i(c2002u5);
        c1219iB.a();
        this.m = null;
        return z;
    }
}
