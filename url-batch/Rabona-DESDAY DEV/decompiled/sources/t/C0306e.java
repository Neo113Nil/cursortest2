package t;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import s.C0298c;
import s.C0299d;
import s.C0300e;
import v.C0325f;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0306e {

    /* renamed from: a, reason: collision with root package name */
    public C0300e f3770a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3771b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3772c;
    public C0300e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3773e;

    /* renamed from: f, reason: collision with root package name */
    public C0325f f3774f;

    /* renamed from: g, reason: collision with root package name */
    public C0303b f3775g;
    public ArrayList h;

    public final void a(C0307f c0307f, int i, ArrayList arrayList, C0313l c0313l) {
        AbstractC0316o abstractC0316o = c0307f.d;
        if (abstractC0316o.f3799c == null) {
            C0300e c0300e = this.f3770a;
            if (abstractC0316o == c0300e.d || abstractC0316o == c0300e.f3648e) {
                return;
            }
            if (c0313l == null) {
                c0313l = new C0313l();
                c0313l.f3788a = null;
                c0313l.f3789b = new ArrayList();
                c0313l.f3788a = abstractC0316o;
                arrayList.add(c0313l);
            }
            abstractC0316o.f3799c = c0313l;
            c0313l.f3789b.add(abstractC0316o);
            C0307f c0307f2 = abstractC0316o.h;
            Iterator it = c0307f2.f3783k.iterator();
            while (it.hasNext()) {
                InterfaceC0305d interfaceC0305d = (InterfaceC0305d) it.next();
                if (interfaceC0305d instanceof C0307f) {
                    a((C0307f) interfaceC0305d, i, arrayList, c0313l);
                }
            }
            C0307f c0307f3 = abstractC0316o.i;
            Iterator it2 = c0307f3.f3783k.iterator();
            while (it2.hasNext()) {
                InterfaceC0305d interfaceC0305d2 = (InterfaceC0305d) it2.next();
                if (interfaceC0305d2 instanceof C0307f) {
                    a((C0307f) interfaceC0305d2, i, arrayList, c0313l);
                }
            }
            if (i == 1 && (abstractC0316o instanceof C0314m)) {
                Iterator it3 = ((C0314m) abstractC0316o).f3790k.f3783k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0305d interfaceC0305d3 = (InterfaceC0305d) it3.next();
                    if (interfaceC0305d3 instanceof C0307f) {
                        a((C0307f) interfaceC0305d3, i, arrayList, c0313l);
                    }
                }
            }
            Iterator it4 = c0307f2.f3784l.iterator();
            while (it4.hasNext()) {
                a((C0307f) it4.next(), i, arrayList, c0313l);
            }
            Iterator it5 = c0307f3.f3784l.iterator();
            while (it5.hasNext()) {
                a((C0307f) it5.next(), i, arrayList, c0313l);
            }
            if (i == 1 && (abstractC0316o instanceof C0314m)) {
                Iterator it6 = ((C0314m) abstractC0316o).f3790k.f3784l.iterator();
                while (it6.hasNext()) {
                    a((C0307f) it6.next(), i, arrayList, c0313l);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0300e c0300e) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = c0300e.f3690q0.iterator();
        while (it.hasNext()) {
            C0299d c0299d = (C0299d) it.next();
            int[] iArr = c0299d.f3668p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (c0299d.f3653g0 == 8) {
                c0299d.f3641a = true;
            } else {
                float f2 = c0299d.f3675w;
                if (f2 < 1.0f && i7 == 3) {
                    c0299d.f3670r = 2;
                }
                float f3 = c0299d.f3678z;
                if (f3 < 1.0f && i8 == 3) {
                    c0299d.f3671s = 2;
                }
                if (c0299d.f3637W > 0.0f) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        c0299d.f3670r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        c0299d.f3671s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (c0299d.f3670r == 0) {
                            c0299d.f3670r = 3;
                        }
                        if (c0299d.f3671s == 0) {
                            c0299d.f3671s = 3;
                        }
                    }
                }
                C0298c c0298c = c0299d.f3625K;
                C0298c c0298c2 = c0299d.f3623I;
                if (i7 == 3 && c0299d.f3670r == 1 && (c0298c2.f3614f == null || c0298c.f3614f == null)) {
                    i7 = 2;
                }
                C0298c c0298c3 = c0299d.f3626L;
                C0298c c0298c4 = c0299d.f3624J;
                int i9 = (i8 == 3 && c0299d.f3671s == 1 && (c0298c4.f3614f == null || c0298c3.f3614f == null)) ? 2 : i8;
                C0312k c0312k = c0299d.d;
                c0312k.d = i7;
                int i10 = c0299d.f3670r;
                c0312k.f3797a = i10;
                C0314m c0314m = c0299d.f3648e;
                c0314m.d = i9;
                int i11 = c0299d.f3671s;
                c0314m.f3797a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = c0299d.q();
                    if (i7 == 4) {
                        i = (c0300e.q() - c0298c2.f3615g) - c0298c.f3615g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = c0299d.k();
                    if (i9 == 4) {
                        i2 = (c0300e.k() - c0298c4.f3615g) - c0298c3.f3615g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, c0299d);
                    c0299d.d.f3800e.d(c0299d.q());
                    c0299d.f3648e.f3800e.d(c0299d.k());
                    c0299d.f3641a = true;
                } else {
                    int[] iArr2 = c0300e.f3668p0;
                    C0298c[] c0298cArr = c0299d.f3631Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, c0299d);
                        }
                        int k3 = c0299d.k();
                        f(1, (int) ((k3 * c0299d.f3637W) + 0.5f), 1, k3, c0299d);
                        c0299d.d.f3800e.d(c0299d.q());
                        c0299d.f3648e.f3800e.d(c0299d.k());
                        c0299d.f3641a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, c0299d);
                        c0299d.d.f3800e.f3785m = c0299d.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * c0300e.q()) + 0.5f), i9, c0299d.k(), c0299d);
                            c0299d.d.f3800e.d(c0299d.q());
                            c0299d.f3648e.f3800e.d(c0299d.k());
                            c0299d.f3641a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (c0298cArr[0].f3614f == null || c0298cArr[1].f3614f == null) {
                        f(2, 0, i9, 0, c0299d);
                        c0299d.d.f3800e.d(c0299d.q());
                        c0299d.f3648e.f3800e.d(c0299d.k());
                        c0299d.f3641a = true;
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
                                f(2, 0, 2, 0, c0299d);
                                c0299d.d.f3800e.f3785m = c0299d.q();
                                c0299d.f3648e.f3800e.f3785m = c0299d.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, c0299d);
                            }
                            int q3 = c0299d.q();
                            float f4 = c0299d.f3637W;
                            if (c0299d.f3638X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), c0299d);
                            c0299d.d.f3800e.d(c0299d.q());
                            c0299d.f3648e.f3800e.d(c0299d.k());
                            c0299d.f3641a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, c0299d);
                            c0299d.f3648e.f3800e.f3785m = c0299d.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, c0299d.q(), 1, (int) ((f3 * c0300e.k()) + 0.5f), c0299d);
                                    c0299d.d.f3800e.d(c0299d.q());
                                    c0299d.f3648e.f3800e.d(c0299d.k());
                                    c0299d.f3641a = true;
                                }
                            } else if (c0298cArr[2].f3614f == null || c0298cArr[3].f3614f == null) {
                                f(2, 0, i9, 0, c0299d);
                                c0299d.d.f3800e.d(c0299d.q());
                                c0299d.f3648e.f3800e.d(c0299d.k());
                                c0299d.f3641a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, c0299d);
                                    c0299d.d.f3800e.f3785m = c0299d.q();
                                    c0299d.f3648e.f3800e.f3785m = c0299d.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * c0300e.q()) + 0.5f), 1, (int) ((f3 * c0300e.k()) + 0.5f), c0299d);
                                    c0299d.d.f3800e.d(c0299d.q());
                                    c0299d.f3648e.f3800e.d(c0299d.k());
                                    c0299d.f3641a = true;
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
        ArrayList arrayList = this.f3773e;
        arrayList.clear();
        C0300e c0300e = this.d;
        c0300e.d.f();
        c0300e.f3648e.f();
        arrayList.add(c0300e.d);
        arrayList.add(c0300e.f3648e);
        Iterator it = c0300e.f3690q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0299d c0299d = (C0299d) it.next();
            if (c0299d instanceof s.h) {
                C0310i c0310i = new C0310i(c0299d);
                c0299d.d.f();
                c0299d.f3648e.f();
                c0310i.f3801f = ((s.h) c0299d).f3751u0;
                arrayList.add(c0310i);
            } else {
                if (c0299d.x()) {
                    if (c0299d.f3643b == null) {
                        c0299d.f3643b = new C0304c(c0299d, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0299d.f3643b);
                } else {
                    arrayList.add(c0299d.d);
                }
                if (c0299d.y()) {
                    if (c0299d.f3645c == null) {
                        c0299d.f3645c = new C0304c(c0299d, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0299d.f3645c);
                } else {
                    arrayList.add(c0299d.f3648e);
                }
                if (c0299d instanceof s.i) {
                    arrayList.add(new C0311j(c0299d));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC0316o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC0316o abstractC0316o = (AbstractC0316o) it3.next();
            if (abstractC0316o.f3798b != c0300e) {
                abstractC0316o.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        C0300e c0300e2 = this.f3770a;
        e(c0300e2.d, 0, arrayList2);
        e(c0300e2.f3648e, 1, arrayList2);
        this.f3771b = false;
    }

    public final int d(C0300e c0300e, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        C0300e c0300e2 = c0300e;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            AbstractC0316o abstractC0316o = ((C0313l) arrayList2.get(i4)).f3788a;
            if (!(abstractC0316o instanceof C0304c) ? !(i != 0 ? (abstractC0316o instanceof C0314m) : (abstractC0316o instanceof C0312k)) : ((C0304c) abstractC0316o).f3801f != i) {
                C0307f c0307f = (i == 0 ? c0300e2.d : c0300e2.f3648e).h;
                C0307f c0307f2 = (i == 0 ? c0300e2.d : c0300e2.f3648e).i;
                boolean contains = abstractC0316o.h.f3784l.contains(c0307f);
                C0307f c0307f3 = abstractC0316o.i;
                boolean contains2 = c0307f3.f3784l.contains(c0307f2);
                long j3 = abstractC0316o.j();
                C0307f c0307f4 = abstractC0316o.h;
                if (contains && contains2) {
                    long b2 = C0313l.b(c0307f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = C0313l.a(c0307f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0307f3.f3780f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0307f4.f3780f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    C0299d c0299d = abstractC0316o.f3798b;
                    if (i == 0) {
                        f2 = c0299d.f3647d0;
                    } else if (i == 1) {
                        f2 = c0299d.f3649e0;
                    } else {
                        c0299d.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > 0.0f ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0307f4.f3780f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0307f3.f3780f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(C0313l.b(c0307f4, c0307f4.f3780f), c0307f4.f3780f + j3) : contains2 ? Math.max(-C0313l.a(c0307f3, c0307f3.f3780f), (-c0307f3.f3780f) + j3) : (abstractC0316o.j() + c0307f4.f3780f) - c0307f3.f3780f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            c0300e2 = c0300e;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(AbstractC0316o abstractC0316o, int i, ArrayList arrayList) {
        C0307f c0307f;
        Iterator it = abstractC0316o.h.f3783k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0307f = abstractC0316o.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0305d interfaceC0305d = (InterfaceC0305d) it.next();
            if (interfaceC0305d instanceof C0307f) {
                a((C0307f) interfaceC0305d, i, arrayList, null);
            } else if (interfaceC0305d instanceof AbstractC0316o) {
                a(((AbstractC0316o) interfaceC0305d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0307f.f3783k.iterator();
        while (it2.hasNext()) {
            InterfaceC0305d interfaceC0305d2 = (InterfaceC0305d) it2.next();
            if (interfaceC0305d2 instanceof C0307f) {
                a((C0307f) interfaceC0305d2, i, arrayList, null);
            } else if (interfaceC0305d2 instanceof AbstractC0316o) {
                a(((AbstractC0316o) interfaceC0305d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((C0314m) abstractC0316o).f3790k.f3783k.iterator();
            while (it3.hasNext()) {
                InterfaceC0305d interfaceC0305d3 = (InterfaceC0305d) it3.next();
                if (interfaceC0305d3 instanceof C0307f) {
                    a((C0307f) interfaceC0305d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, C0299d c0299d) {
        C0303b c0303b = this.f3775g;
        c0303b.f3761a = i;
        c0303b.f3762b = i3;
        c0303b.f3763c = i2;
        c0303b.d = i4;
        this.f3774f.b(c0299d, c0303b);
        c0299d.O(c0303b.f3764e);
        c0299d.L(c0303b.f3765f);
        c0299d.f3620E = c0303b.h;
        c0299d.I(c0303b.f3766g);
    }

    public final void g() {
        C0302a c0302a;
        Iterator it = this.f3770a.f3690q0.iterator();
        while (it.hasNext()) {
            C0299d c0299d = (C0299d) it.next();
            if (!c0299d.f3641a) {
                int[] iArr = c0299d.f3668p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0299d.f3670r;
                int i4 = c0299d.f3671s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                C0308g c0308g = c0299d.d.f3800e;
                boolean z4 = c0308g.f3782j;
                C0308g c0308g2 = c0299d.f3648e.f3800e;
                boolean z5 = c0308g2.f3782j;
                if (z4 && z5) {
                    f(1, c0308g.f3781g, 1, c0308g2.f3781g, c0299d);
                    c0299d.f3641a = true;
                } else if (z4 && z2) {
                    f(1, c0308g.f3781g, 2, c0308g2.f3781g, c0299d);
                    if (i2 == 3) {
                        c0299d.f3648e.f3800e.f3785m = c0299d.k();
                    } else {
                        c0299d.f3648e.f3800e.d(c0299d.k());
                        c0299d.f3641a = true;
                    }
                } else if (z5 && z3) {
                    f(2, c0308g.f3781g, 1, c0308g2.f3781g, c0299d);
                    if (i == 3) {
                        c0299d.d.f3800e.f3785m = c0299d.q();
                    } else {
                        c0299d.d.f3800e.d(c0299d.q());
                        c0299d.f3641a = true;
                    }
                }
                if (c0299d.f3641a && (c0302a = c0299d.f3648e.f3791l) != null) {
                    c0302a.d(c0299d.f3642a0);
                }
            }
        }
    }
}
