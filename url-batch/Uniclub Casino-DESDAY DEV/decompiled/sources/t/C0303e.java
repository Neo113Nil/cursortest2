package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0295c;
import s.C0296d;
import s.C0297e;
import v.C0322f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303e {

    /* renamed from: a, reason: collision with root package name */
    public C0297e f3774a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3775b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3776c;
    public C0297e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3777e;

    /* renamed from: f, reason: collision with root package name */
    public C0322f f3778f;

    /* renamed from: g, reason: collision with root package name */
    public C0300b f3779g;
    public ArrayList h;

    public final void a(C0304f c0304f, int i, ArrayList arrayList, C0310l c0310l) {
        AbstractC0313o abstractC0313o = c0304f.d;
        if (abstractC0313o.f3803c == null) {
            C0297e c0297e = this.f3774a;
            if (abstractC0313o == c0297e.d || abstractC0313o == c0297e.f3653e) {
                return;
            }
            if (c0310l == null) {
                c0310l = new C0310l();
                c0310l.f3792a = null;
                c0310l.f3793b = new ArrayList();
                c0310l.f3792a = abstractC0313o;
                arrayList.add(c0310l);
            }
            abstractC0313o.f3803c = c0310l;
            c0310l.f3793b.add(abstractC0313o);
            C0304f c0304f2 = abstractC0313o.h;
            Iterator it = c0304f2.f3787k.iterator();
            while (it.hasNext()) {
                InterfaceC0302d interfaceC0302d = (InterfaceC0302d) it.next();
                if (interfaceC0302d instanceof C0304f) {
                    a((C0304f) interfaceC0302d, i, arrayList, c0310l);
                }
            }
            C0304f c0304f3 = abstractC0313o.i;
            Iterator it2 = c0304f3.f3787k.iterator();
            while (it2.hasNext()) {
                InterfaceC0302d interfaceC0302d2 = (InterfaceC0302d) it2.next();
                if (interfaceC0302d2 instanceof C0304f) {
                    a((C0304f) interfaceC0302d2, i, arrayList, c0310l);
                }
            }
            if (i == 1 && (abstractC0313o instanceof C0311m)) {
                Iterator it3 = ((C0311m) abstractC0313o).f3794k.f3787k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0302d interfaceC0302d3 = (InterfaceC0302d) it3.next();
                    if (interfaceC0302d3 instanceof C0304f) {
                        a((C0304f) interfaceC0302d3, i, arrayList, c0310l);
                    }
                }
            }
            Iterator it4 = c0304f2.f3788l.iterator();
            while (it4.hasNext()) {
                a((C0304f) it4.next(), i, arrayList, c0310l);
            }
            Iterator it5 = c0304f3.f3788l.iterator();
            while (it5.hasNext()) {
                a((C0304f) it5.next(), i, arrayList, c0310l);
            }
            if (i == 1 && (abstractC0313o instanceof C0311m)) {
                Iterator it6 = ((C0311m) abstractC0313o).f3794k.f3788l.iterator();
                while (it6.hasNext()) {
                    a((C0304f) it6.next(), i, arrayList, c0310l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0297e c0297e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0297e.f3695q0.iterator();
        while (it.hasNext()) {
            C0296d c0296d = (C0296d) it.next();
            int[] iArr = c0296d.f3673p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0296d.f3658g0 == 8) {
                c0296d.f3646a = true;
            } else {
                float f2 = c0296d.f3680w;
                if (f2 < 1.0f && i7 == 3) {
                    c0296d.f3675r = 2;
                }
                float f3 = c0296d.f3683z;
                if (f3 < 1.0f && i8 == 3) {
                    c0296d.f3676s = 2;
                }
                if (c0296d.f3642W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0296d.f3675r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0296d.f3676s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0296d.f3675r == 0) {
                            c0296d.f3675r = 3;
                        }
                        if (c0296d.f3676s == 0) {
                            c0296d.f3676s = 3;
                        }
                    }
                }
                C0295c c0295c = c0296d.f3630K;
                C0295c c0295c2 = c0296d.f3628I;
                if (i7 == 3 && c0296d.f3675r == 1 && (c0295c2.f3619f == null || c0295c.f3619f == null)) {
                    i7 = 2;
                }
                C0295c c0295c3 = c0296d.f3631L;
                C0295c c0295c4 = c0296d.f3629J;
                int i9 = (i8 == 3 && c0296d.f3676s == 1 && (c0295c4.f3619f == null || c0295c3.f3619f == null)) ? 2 : i8;
                C0309k c0309k = c0296d.d;
                c0309k.d = i7;
                int i10 = c0296d.f3675r;
                c0309k.f3801a = i10;
                C0311m c0311m = c0296d.f3653e;
                c0311m.d = i9;
                int i11 = c0296d.f3676s;
                c0311m.f3801a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0296d.q();
                    if (i7 == 4) {
                        i = (c0297e.q() - c0295c2.f3620g) - c0295c.f3620g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0296d.k();
                    if (i9 == 4) {
                        i2 = (c0297e.k() - c0295c4.f3620g) - c0295c3.f3620g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0296d);
                    c0296d.d.f3804e.d(c0296d.q());
                    c0296d.f3653e.f3804e.d(c0296d.k());
                    c0296d.f3646a = true;
                } else {
                    int[] iArr2 = c0297e.f3673p0;
                    C0295c[] c0295cArr = c0296d.f3636Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0296d);
                        }
                        int k3 = c0296d.k();
                        f(1, (int) ((k3 * c0296d.f3642W) + 0.5f), 1, k3, c0296d);
                        c0296d.d.f3804e.d(c0296d.q());
                        c0296d.f3653e.f3804e.d(c0296d.k());
                        c0296d.f3646a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0296d);
                        c0296d.d.f3804e.f3789m = c0296d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0297e.q()) + 0.5f), i9, c0296d.k(), c0296d);
                            c0296d.d.f3804e.d(c0296d.q());
                            c0296d.f3653e.f3804e.d(c0296d.k());
                            c0296d.f3646a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0295cArr[0].f3619f == null || c0295cArr[1].f3619f == null) {
                        f(2, 0, i9, 0, c0296d);
                        c0296d.d.f3804e.d(c0296d.q());
                        c0296d.f3653e.f3804e.d(c0296d.k());
                        c0296d.f3646a = true;
                    } else {
                        i4 = 3;
                    }
                    if (i9 == i4) {
                        if (i7 != 2 && i7 != 1) {
                            i6 = i4;
                            i5 = 1;
                            if (i7 != i6) {
                                if (i10 != i5) {
                                }
                                f(2, 0, 2, 0, c0296d);
                                c0296d.d.f3804e.f3789m = c0296d.q();
                                c0296d.f3653e.f3804e.f3789m = c0296d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0296d);
                            }
                            int q3 = c0296d.q();
                            float f4 = c0296d.f3642W;
                            if (c0296d.f3643X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0296d);
                            c0296d.d.f3804e.d(c0296d.q());
                            c0296d.f3653e.f3804e.d(c0296d.k());
                            c0296d.f3646a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0296d);
                            c0296d.f3653e.f3804e.f3789m = c0296d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0296d.q(), 1, (int) ((f3 * c0297e.k()) + 0.5f), c0296d);
                                    c0296d.d.f3804e.d(c0296d.q());
                                    c0296d.f3653e.f3804e.d(c0296d.k());
                                    c0296d.f3646a = true;
                                }
                            } else if (c0295cArr[2].f3619f == null || c0295cArr[3].f3619f == null) {
                                f(2, 0, i9, 0, c0296d);
                                c0296d.d.f3804e.d(c0296d.q());
                                c0296d.f3653e.f3804e.d(c0296d.k());
                                c0296d.f3646a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0296d);
                                    c0296d.d.f3804e.f3789m = c0296d.q();
                                    c0296d.f3653e.f3804e.f3789m = c0296d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0297e.q()) + 0.5f), 1, (int) ((f3 * c0297e.k()) + 0.5f), c0296d);
                                    c0296d.d.f3804e.d(c0296d.q());
                                    c0296d.f3653e.f3804e.d(c0296d.k());
                                    c0296d.f3646a = true;
                                }
                            }
                        }
                    }
                    i5 = 1;
                    i6 = 3;
                    if (i7 != i6) {
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.f3777e;
        arrayList.clear();
        C0297e c0297e = this.d;
        c0297e.d.f();
        c0297e.f3653e.f();
        arrayList.add(c0297e.d);
        arrayList.add(c0297e.f3653e);
        Iterator it = c0297e.f3695q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0296d c0296d = (C0296d) it.next();
            if (c0296d instanceof s.h) {
                C0307i c0307i = new C0307i(c0296d);
                c0296d.d.f();
                c0296d.f3653e.f();
                c0307i.f3805f = ((s.h) c0296d).f3756u0;
                arrayList.add(c0307i);
            } else {
                if (c0296d.x()) {
                    if (c0296d.f3648b == null) {
                        c0296d.f3648b = new C0301c(c0296d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0296d.f3648b);
                } else {
                    arrayList.add(c0296d.d);
                }
                if (c0296d.y()) {
                    if (c0296d.f3650c == null) {
                        c0296d.f3650c = new C0301c(c0296d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0296d.f3650c);
                } else {
                    arrayList.add(c0296d.f3653e);
                }
                if (c0296d instanceof s.i) {
                    arrayList.add(new C0308j(c0296d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0313o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0313o abstractC0313o = (AbstractC0313o) it3.next();
            if (abstractC0313o.f3802b != c0297e) {
                abstractC0313o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0297e c0297e2 = this.f3774a;
        e(c0297e2.d, 0, arrayList2);
        e(c0297e2.f3653e, 1, arrayList2);
        this.f3775b = false;
    }

    public final int d(C0297e c0297e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0297e c0297e2 = c0297e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0313o abstractC0313o = ((C0310l) arrayList2.get(i4)).f3792a;
            if (!(abstractC0313o instanceof C0301c) ? !(i != 0 ? (abstractC0313o instanceof C0311m) : (abstractC0313o instanceof C0309k)) : ((C0301c) abstractC0313o).f3805f != i) {
                C0304f c0304f = (i == 0 ? c0297e2.d : c0297e2.f3653e).h;
                C0304f c0304f2 = (i == 0 ? c0297e2.d : c0297e2.f3653e).i;
                boolean contains = abstractC0313o.h.f3788l.contains(c0304f);
                C0304f c0304f3 = abstractC0313o.i;
                boolean contains2 = c0304f3.f3788l.contains(c0304f2);
                long j3 = abstractC0313o.j();
                C0304f c0304f4 = abstractC0313o.h;
                if (contains && contains2) {
                    long b2 = C0310l.b(c0304f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0310l.a(c0304f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0304f3.f3784f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0304f4.f3784f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0296d c0296d = abstractC0313o.f3802b;
                    if (i == 0) {
                        f2 = c0296d.f3652d0;
                    } else if (i == 1) {
                        f2 = c0296d.f3654e0;
                    } else {
                        c0296d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0304f4.f3784f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0304f3.f3784f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0310l.b(c0304f4, c0304f4.f3784f), c0304f4.f3784f + j3) : contains2 ? Math.max(-C0310l.a(c0304f3, c0304f3.f3784f), (-c0304f3.f3784f) + j3) : (abstractC0313o.j() + c0304f4.f3784f) - c0304f3.f3784f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0297e2 = c0297e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0313o abstractC0313o, int i, ArrayList arrayList) {
        C0304f c0304f;
        Iterator it = abstractC0313o.h.f3787k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0304f = abstractC0313o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0302d interfaceC0302d = (InterfaceC0302d) it.next();
            if (interfaceC0302d instanceof C0304f) {
                a((C0304f) interfaceC0302d, i, arrayList, null);
            } else if (interfaceC0302d instanceof AbstractC0313o) {
                a(((AbstractC0313o) interfaceC0302d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0304f.f3787k.iterator();
        while (it2.hasNext()) {
            InterfaceC0302d interfaceC0302d2 = (InterfaceC0302d) it2.next();
            if (interfaceC0302d2 instanceof C0304f) {
                a((C0304f) interfaceC0302d2, i, arrayList, null);
            } else if (interfaceC0302d2 instanceof AbstractC0313o) {
                a(((AbstractC0313o) interfaceC0302d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0311m) abstractC0313o).f3794k.f3787k.iterator();
            while (it3.hasNext()) {
                InterfaceC0302d interfaceC0302d3 = (InterfaceC0302d) it3.next();
                if (interfaceC0302d3 instanceof C0304f) {
                    a((C0304f) interfaceC0302d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0296d c0296d) {
        C0300b c0300b = this.f3779g;
        c0300b.f3765a = i;
        c0300b.f3766b = i3;
        c0300b.f3767c = i2;
        c0300b.d = i4;
        this.f3778f.b(c0296d, c0300b);
        c0296d.O(c0300b.f3768e);
        c0296d.L(c0300b.f3769f);
        c0296d.f3625E = c0300b.h;
        c0296d.I(c0300b.f3770g);
    }

    public final void g() {
        C0299a c0299a;
        Iterator it = this.f3774a.f3695q0.iterator();
        while (it.hasNext()) {
            C0296d c0296d = (C0296d) it.next();
            if (!c0296d.f3646a) {
                int[] iArr = c0296d.f3673p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0296d.f3675r;
                int i4 = c0296d.f3676s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0305g c0305g = c0296d.d.f3804e;
                boolean z4 = c0305g.f3786j;
                C0305g c0305g2 = c0296d.f3653e.f3804e;
                boolean z5 = c0305g2.f3786j;
                if (z4 && z5) {
                    f(1, c0305g.f3785g, 1, c0305g2.f3785g, c0296d);
                    c0296d.f3646a = true;
                } else if (z4 && z2) {
                    f(1, c0305g.f3785g, 2, c0305g2.f3785g, c0296d);
                    if (i2 == 3) {
                        c0296d.f3653e.f3804e.f3789m = c0296d.k();
                    } else {
                        c0296d.f3653e.f3804e.d(c0296d.k());
                        c0296d.f3646a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0305g.f3785g, 1, c0305g2.f3785g, c0296d);
                    if (i == 3) {
                        c0296d.d.f3804e.f3789m = c0296d.q();
                    } else {
                        c0296d.d.f3804e.d(c0296d.q());
                        c0296d.f3646a = true;
                    }
                }
                if (c0296d.f3646a && (c0299a = c0296d.f3653e.f3795l) != null) {
                    c0299a.d(c0296d.f3647a0);
                }
            }
        }
    }
}
