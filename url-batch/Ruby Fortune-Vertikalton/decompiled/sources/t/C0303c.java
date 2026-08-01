package t;

import java.util.ArrayList;
import java.util.Iterator;
import s.C0297c;
import s.C0298d;
import s.C0299e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303c extends AbstractC0315o {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f3762k;

    /* renamed from: l, reason: collision with root package name */
    public int f3763l;

    public C0303c(C0298d c0298d, int i) {
        super(c0298d);
        C0298d c0298d2;
        this.f3762k = new ArrayList();
        this.f3795f = i;
        C0298d c0298d3 = this.f3792b;
        C0298d m2 = c0298d3.m(i);
        while (true) {
            C0298d c0298d4 = m2;
            c0298d2 = c0298d3;
            c0298d3 = c0298d4;
            if (c0298d3 == null) {
                break;
            } else {
                m2 = c0298d3.m(this.f3795f);
            }
        }
        this.f3792b = c0298d2;
        int i2 = this.f3795f;
        AbstractC0315o abstractC0315o = i2 == 0 ? c0298d2.d : i2 == 1 ? c0298d2.f3642e : null;
        ArrayList arrayList = this.f3762k;
        arrayList.add(abstractC0315o);
        C0298d l2 = c0298d2.l(this.f3795f);
        while (l2 != null) {
            int i3 = this.f3795f;
            arrayList.add(i3 == 0 ? l2.d : i3 == 1 ? l2.f3642e : null);
            l2 = l2.l(this.f3795f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0315o abstractC0315o2 = (AbstractC0315o) it.next();
            int i4 = this.f3795f;
            if (i4 == 0) {
                abstractC0315o2.f3792b.f3637b = this;
            } else if (i4 == 1) {
                abstractC0315o2.f3792b.f3639c = this;
            }
        }
        if (this.f3795f == 0 && ((C0299e) this.f3792b.f3628T).f3689v0 && arrayList.size() > 1) {
            this.f3792b = ((AbstractC0315o) arrayList.get(arrayList.size() - 1)).f3792b;
        }
        this.f3763l = this.f3795f == 0 ? this.f3792b.f3649i0 : this.f3792b.j0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x03aa, code lost:
    
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // t.InterfaceC0304d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC0304d interfaceC0304d) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        boolean z2;
        ArrayList arrayList2;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        float f3;
        int i15;
        boolean z4;
        int i16;
        C0306f c0306f = this.h;
        if (c0306f.f3776j) {
            C0306f c0306f2 = this.i;
            if (c0306f2.f3776j) {
                C0298d c0298d = this.f3792b.f3628T;
                boolean z5 = c0298d instanceof C0299e ? ((C0299e) c0298d).f3689v0 : false;
                int i17 = c0306f2.f3775g - c0306f.f3775g;
                ArrayList arrayList3 = this.f3762k;
                int size = arrayList3.size();
                int i18 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i18 >= size) {
                        i18 = -1;
                        break;
                    } else if (((AbstractC0315o) arrayList3.get(i18)).f3792b.f3647g0 != 8) {
                        break;
                    } else {
                        i18++;
                    }
                }
                int i19 = size - 1;
                int i20 = i19;
                while (true) {
                    if (i20 < 0) {
                        break;
                    }
                    if (((AbstractC0315o) arrayList3.get(i20)).f3792b.f3647g0 != 8) {
                        i = i20;
                        break;
                    }
                    i20--;
                }
                int i21 = 0;
                while (i21 < 2) {
                    int i22 = 0;
                    i6 = 0;
                    int i23 = 0;
                    int i24 = 0;
                    f2 = 0.0f;
                    while (i22 < size) {
                        AbstractC0315o abstractC0315o = (AbstractC0315o) arrayList3.get(i22);
                        C0298d c0298d2 = abstractC0315o.f3792b;
                        ArrayList arrayList4 = arrayList3;
                        if (c0298d2.f3647g0 == i2) {
                            i15 = i18;
                        } else {
                            i24++;
                            if (i22 > 0 && i22 >= i18) {
                                i6 += abstractC0315o.h.f3774f;
                            }
                            C0307g c0307g = abstractC0315o.f3794e;
                            int i25 = c0307g.f3775g;
                            i15 = i18;
                            boolean z6 = abstractC0315o.d != 3;
                            if (z6) {
                                int i26 = this.f3795f;
                                if (i26 == 0 && !c0298d2.d.f3794e.f3776j) {
                                    return;
                                }
                                if (i26 == 1 && !c0298d2.f3642e.f3794e.f3776j) {
                                    return;
                                } else {
                                    z4 = z6;
                                }
                            } else {
                                z4 = z6;
                                if (abstractC0315o.f3791a == 1 && i21 == 0) {
                                    i16 = c0307g.f3779m;
                                    i23++;
                                } else if (c0307g.f3776j) {
                                    i16 = i25;
                                }
                                z4 = true;
                                if (z4) {
                                    i23++;
                                    float f4 = c0298d2.f3652k0[this.f3795f];
                                    if (f4 >= 0.0f) {
                                        f2 += f4;
                                    }
                                } else {
                                    i6 += i16;
                                }
                                if (i22 < i19 && i22 < i) {
                                    i6 += -abstractC0315o.i.f3774f;
                                }
                            }
                            i16 = i25;
                            if (z4) {
                            }
                            if (i22 < i19) {
                                i6 += -abstractC0315o.i.f3774f;
                            }
                        }
                        i22++;
                        arrayList3 = arrayList4;
                        i18 = i15;
                        i2 = 8;
                    }
                    arrayList = arrayList3;
                    i3 = i18;
                    if (i6 < i17 || i23 == 0) {
                        i4 = i23;
                        i5 = i24;
                        break;
                    } else {
                        i21++;
                        arrayList3 = arrayList;
                        i18 = i3;
                        i2 = 8;
                    }
                }
                arrayList = arrayList3;
                i3 = i18;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                f2 = 0.0f;
                int i27 = c0306f.f3775g;
                if (z5) {
                    i27 = c0306f2.f3775g;
                }
                if (i6 > i17) {
                    i27 = z5 ? i27 + ((int) (((i6 - i17) / 2.0f) + 0.5f)) : i27 - ((int) (((i6 - i17) / 2.0f) + 0.5f));
                }
                if (i4 > 0) {
                    float f5 = i17 - i6;
                    int i28 = (int) ((f5 / i4) + 0.5f);
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < size) {
                        ArrayList arrayList5 = arrayList;
                        AbstractC0315o abstractC0315o2 = (AbstractC0315o) arrayList5.get(i29);
                        int i31 = i28;
                        C0298d c0298d3 = abstractC0315o2.f3792b;
                        int i32 = i6;
                        int i33 = i27;
                        if (c0298d3.f3647g0 != 8 && abstractC0315o2.d == 3) {
                            C0307g c0307g2 = abstractC0315o2.f3794e;
                            if (!c0307g2.f3776j) {
                                if (f2 > 0.0f) {
                                    z3 = z5;
                                    i12 = (int) (((c0298d3.f3652k0[this.f3795f] * f5) / f2) + 0.5f);
                                } else {
                                    z3 = z5;
                                    i12 = i31;
                                }
                                if (this.f3795f == 0) {
                                    i13 = c0298d3.f3668v;
                                    i14 = c0298d3.f3667u;
                                } else {
                                    i13 = c0298d3.f3671y;
                                    i14 = c0298d3.f3670x;
                                }
                                f3 = f5;
                                int max = Math.max(i14, abstractC0315o2.f3791a == 1 ? Math.min(i12, c0307g2.f3779m) : i12);
                                if (i13 > 0) {
                                    max = Math.min(i13, max);
                                }
                                if (max != i12) {
                                    i30++;
                                    i12 = max;
                                }
                                c0307g2.d(i12);
                                i29++;
                                i28 = i31;
                                i6 = i32;
                                i27 = i33;
                                z5 = z3;
                                f5 = f3;
                                arrayList = arrayList5;
                            }
                        }
                        z3 = z5;
                        f3 = f5;
                        i29++;
                        i28 = i31;
                        i6 = i32;
                        i27 = i33;
                        z5 = z3;
                        f5 = f3;
                        arrayList = arrayList5;
                    }
                    i7 = i27;
                    z2 = z5;
                    arrayList2 = arrayList;
                    int i34 = i6;
                    if (i30 > 0) {
                        i4 -= i30;
                        int i35 = 0;
                        i6 = 0;
                        while (i35 < size) {
                            AbstractC0315o abstractC0315o3 = (AbstractC0315o) arrayList2.get(i35);
                            if (abstractC0315o3.f3792b.f3647g0 == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i6 += abstractC0315o3.h.f3774f;
                                }
                                i6 += abstractC0315o3.f3794e.f3775g;
                                if (i35 < i19 && i35 < i) {
                                    i6 += -abstractC0315o3.i.f3774f;
                                }
                            }
                            i35++;
                            i3 = i11;
                        }
                        i8 = i3;
                    } else {
                        i8 = i3;
                        i6 = i34;
                    }
                    i10 = 2;
                    if (this.f3763l == 2 && i30 == 0) {
                        i9 = 0;
                        this.f3763l = 0;
                    } else {
                        i9 = 0;
                    }
                } else {
                    i7 = i27;
                    z2 = z5;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 0;
                    i10 = 2;
                }
                if (i6 > i17) {
                    this.f3763l = i10;
                }
                if (i5 > 0 && i4 == 0 && i8 == i) {
                    this.f3763l = i10;
                }
                int i36 = this.f3763l;
                if (i36 == 1) {
                    int i37 = i5 > 1 ? (i17 - i6) / (i5 - 1) : i5 == 1 ? (i17 - i6) / 2 : i9;
                    if (i4 > 0) {
                        i37 = i9;
                    }
                    int i38 = i7;
                    for (int i39 = i9; i39 < size; i39++) {
                        AbstractC0315o abstractC0315o4 = (AbstractC0315o) arrayList2.get(z2 ? size - (i39 + 1) : i39);
                        int i40 = abstractC0315o4.f3792b.f3647g0;
                        C0306f c0306f3 = abstractC0315o4.i;
                        C0306f c0306f4 = abstractC0315o4.h;
                        if (i40 == 8) {
                            c0306f4.d(i38);
                            c0306f3.d(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z2 ? i38 - i37 : i38 + i37;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                i38 = z2 ? i38 - c0306f4.f3774f : i38 + c0306f4.f3774f;
                            }
                            if (z2) {
                                c0306f3.d(i38);
                            } else {
                                c0306f4.d(i38);
                            }
                            C0307g c0307g3 = abstractC0315o4.f3794e;
                            int i41 = c0307g3.f3775g;
                            if (abstractC0315o4.d == 3 && abstractC0315o4.f3791a == 1) {
                                i41 = c0307g3.f3779m;
                            }
                            i38 = z2 ? i38 - i41 : i38 + i41;
                            if (z2) {
                                c0306f4.d(i38);
                            } else {
                                c0306f3.d(i38);
                            }
                            abstractC0315o4.f3796g = true;
                            if (i39 < i19 && i39 < i) {
                                i38 = z2 ? i38 - (-c0306f3.f3774f) : i38 + (-c0306f3.f3774f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 0) {
                    int i42 = (i17 - i6) / (i5 + 1);
                    if (i4 > 0) {
                        i42 = i9;
                    }
                    int i43 = i7;
                    for (int i44 = i9; i44 < size; i44++) {
                        AbstractC0315o abstractC0315o5 = (AbstractC0315o) arrayList2.get(z2 ? size - (i44 + 1) : i44);
                        int i45 = abstractC0315o5.f3792b.f3647g0;
                        C0306f c0306f5 = abstractC0315o5.i;
                        C0306f c0306f6 = abstractC0315o5.h;
                        if (i45 == 8) {
                            c0306f6.d(i43);
                            c0306f5.d(i43);
                        } else {
                            int i46 = z2 ? i43 - i42 : i43 + i42;
                            if (i44 > 0 && i44 >= i8) {
                                i46 = z2 ? i46 - c0306f6.f3774f : i46 + c0306f6.f3774f;
                            }
                            if (z2) {
                                c0306f5.d(i46);
                            } else {
                                c0306f6.d(i46);
                            }
                            C0307g c0307g4 = abstractC0315o5.f3794e;
                            int i47 = c0307g4.f3775g;
                            if (abstractC0315o5.d == 3 && abstractC0315o5.f3791a == 1) {
                                i47 = Math.min(i47, c0307g4.f3779m);
                            }
                            i43 = z2 ? i46 - i47 : i46 + i47;
                            if (z2) {
                                c0306f6.d(i43);
                            } else {
                                c0306f5.d(i43);
                            }
                            if (i44 < i19 && i44 < i) {
                                i43 = z2 ? i43 - (-c0306f5.f3774f) : i43 + (-c0306f5.f3774f);
                            }
                        }
                    }
                    return;
                }
                if (i36 == 2) {
                    float f6 = this.f3795f == 0 ? this.f3792b.f3641d0 : this.f3792b.f3643e0;
                    if (z2) {
                        f6 = 1.0f - f6;
                    }
                    int i48 = (int) (((i17 - i6) * f6) + 0.5f);
                    if (i48 < 0 || i4 > 0) {
                        i48 = i9;
                    }
                    int i49 = z2 ? i7 - i48 : i7 + i48;
                    for (int i50 = i9; i50 < size; i50++) {
                        AbstractC0315o abstractC0315o6 = (AbstractC0315o) arrayList2.get(z2 ? size - (i50 + 1) : i50);
                        int i51 = abstractC0315o6.f3792b.f3647g0;
                        C0306f c0306f7 = abstractC0315o6.i;
                        C0306f c0306f8 = abstractC0315o6.h;
                        if (i51 == 8) {
                            c0306f8.d(i49);
                            c0306f7.d(i49);
                        } else {
                            if (i50 > 0 && i50 >= i8) {
                                i49 = z2 ? i49 - c0306f8.f3774f : i49 + c0306f8.f3774f;
                            }
                            if (z2) {
                                c0306f7.d(i49);
                            } else {
                                c0306f8.d(i49);
                            }
                            C0307g c0307g5 = abstractC0315o6.f3794e;
                            int i52 = c0307g5.f3775g;
                            if (abstractC0315o6.d == 3 && abstractC0315o6.f3791a == 1) {
                                i52 = c0307g5.f3779m;
                            }
                            i49 += i52;
                            if (z2) {
                                c0306f8.d(i49);
                            } else {
                                c0306f7.d(i49);
                            }
                            if (i50 < i19 && i50 < i) {
                                i49 = z2 ? i49 - (-c0306f7.f3774f) : i49 + (-c0306f7.f3774f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // t.AbstractC0315o
    public final void d() {
        ArrayList arrayList = this.f3762k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC0315o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0298d c0298d = ((AbstractC0315o) arrayList.get(0)).f3792b;
        C0298d c0298d2 = ((AbstractC0315o) arrayList.get(size - 1)).f3792b;
        int i = this.f3795f;
        C0306f c0306f = this.i;
        C0306f c0306f2 = this.h;
        if (i == 0) {
            C0297c c0297c = c0298d.f3617I;
            C0297c c0297c2 = c0298d2.f3619K;
            C0306f i2 = AbstractC0315o.i(c0297c, 0);
            int e2 = c0297c.e();
            C0298d m2 = m();
            if (m2 != null) {
                e2 = m2.f3617I.e();
            }
            if (i2 != null) {
                AbstractC0315o.b(c0306f2, i2, e2);
            }
            C0306f i3 = AbstractC0315o.i(c0297c2, 0);
            int e3 = c0297c2.e();
            C0298d n2 = n();
            if (n2 != null) {
                e3 = n2.f3619K.e();
            }
            if (i3 != null) {
                AbstractC0315o.b(c0306f, i3, -e3);
            }
        } else {
            C0297c c0297c3 = c0298d.f3618J;
            C0297c c0297c4 = c0298d2.f3620L;
            C0306f i4 = AbstractC0315o.i(c0297c3, 1);
            int e4 = c0297c3.e();
            C0298d m3 = m();
            if (m3 != null) {
                e4 = m3.f3618J.e();
            }
            if (i4 != null) {
                AbstractC0315o.b(c0306f2, i4, e4);
            }
            C0306f i5 = AbstractC0315o.i(c0297c4, 1);
            int e5 = c0297c4.e();
            C0298d n3 = n();
            if (n3 != null) {
                e5 = n3.f3620L.e();
            }
            if (i5 != null) {
                AbstractC0315o.b(c0306f, i5, -e5);
            }
        }
        c0306f2.f3770a = this;
        c0306f.f3770a = this;
    }

    @Override // t.AbstractC0315o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3762k;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC0315o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // t.AbstractC0315o
    public final void f() {
        this.f3793c = null;
        Iterator it = this.f3762k.iterator();
        while (it.hasNext()) {
            ((AbstractC0315o) it.next()).f();
        }
    }

    @Override // t.AbstractC0315o
    public final long j() {
        ArrayList arrayList = this.f3762k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i = 0; i < size; i++) {
            j2 = r5.i.f3774f + ((AbstractC0315o) arrayList.get(i)).j() + j2 + r5.h.f3774f;
        }
        return j2;
    }

    @Override // t.AbstractC0315o
    public final boolean k() {
        ArrayList arrayList = this.f3762k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC0315o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C0298d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3762k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0298d c0298d = ((AbstractC0315o) arrayList.get(i)).f3792b;
            if (c0298d.f3647g0 != 8) {
                return c0298d;
            }
            i++;
        }
    }

    public final C0298d n() {
        ArrayList arrayList = this.f3762k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0298d c0298d = ((AbstractC0315o) arrayList.get(size)).f3792b;
            if (c0298d.f3647g0 != 8) {
                return c0298d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3795f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f3762k.iterator();
        while (it.hasNext()) {
            AbstractC0315o abstractC0315o = (AbstractC0315o) it.next();
            sb.append("<");
            sb.append(abstractC0315o);
            sb.append("> ");
        }
        return sb.toString();
    }
}
