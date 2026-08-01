package t;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f4128a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4129b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4130c;
    public s.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4131e;

    /* renamed from: f, reason: collision with root package name */
    public v.f f4132f;

    /* renamed from: g, reason: collision with root package name */
    public C0365b f4133g;
    public ArrayList h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        p pVar = fVar.d;
        if (pVar.f4157c == null) {
            s.e eVar = this.f4128a;
            if (pVar == eVar.d || pVar == eVar.f3986e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f4146a = null;
                lVar.f4147b = new ArrayList();
                lVar.f4146a = pVar;
                arrayList.add(lVar);
            }
            pVar.f4157c = lVar;
            lVar.f4147b.add(pVar);
            f fVar2 = pVar.h;
            Iterator it = fVar2.f4141k.iterator();
            while (it.hasNext()) {
                InterfaceC0367d interfaceC0367d = (InterfaceC0367d) it.next();
                if (interfaceC0367d instanceof f) {
                    a((f) interfaceC0367d, i, arrayList, lVar);
                }
            }
            f fVar3 = pVar.i;
            Iterator it2 = fVar3.f4141k.iterator();
            while (it2.hasNext()) {
                InterfaceC0367d interfaceC0367d2 = (InterfaceC0367d) it2.next();
                if (interfaceC0367d2 instanceof f) {
                    a((f) interfaceC0367d2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (pVar instanceof m)) {
                Iterator it3 = ((m) pVar).f4148k.f4141k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0367d interfaceC0367d3 = (InterfaceC0367d) it3.next();
                    if (interfaceC0367d3 instanceof f) {
                        a((f) interfaceC0367d3, i, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = fVar2.f4142l.iterator();
            while (it4.hasNext()) {
                a((f) it4.next(), i, arrayList, lVar);
            }
            Iterator it5 = fVar3.f4142l.iterator();
            while (it5.hasNext()) {
                a((f) it5.next(), i, arrayList, lVar);
            }
            if (i == 1 && (pVar instanceof m)) {
                Iterator it6 = ((m) pVar).f4148k.f4142l.iterator();
                while (it6.hasNext()) {
                    a((f) it6.next(), i, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0260 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0008 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(s.e eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Iterator it = eVar.f4027q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            int[] iArr = dVar.f4006p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (dVar.f3991g0 == 8) {
                dVar.f3979a = true;
            } else {
                float f2 = dVar.f4013w;
                if (f2 < 1.0f && i7 == 3) {
                    dVar.f4008r = 2;
                }
                float f3 = dVar.f4016z;
                if (f3 < 1.0f && i8 == 3) {
                    dVar.f4009s = 2;
                }
                if (dVar.f3975W > RecyclerView.f1949A0) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        dVar.f4008r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        dVar.f4009s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (dVar.f4008r == 0) {
                            dVar.f4008r = 3;
                        }
                        if (dVar.f4009s == 0) {
                            dVar.f4009s = 3;
                        }
                    }
                }
                s.c cVar = dVar.f3963K;
                s.c cVar2 = dVar.f3961I;
                if (i7 == 3 && dVar.f4008r == 1 && (cVar2.f3952f == null || cVar.f3952f == null)) {
                    i7 = 2;
                }
                s.c cVar3 = dVar.f3964L;
                s.c cVar4 = dVar.f3962J;
                int i9 = (i8 == 3 && dVar.f4009s == 1 && (cVar4.f3952f == null || cVar3.f3952f == null)) ? 2 : i8;
                k kVar = dVar.d;
                kVar.d = i7;
                int i10 = dVar.f4008r;
                kVar.f4155a = i10;
                m mVar = dVar.f3986e;
                mVar.d = i9;
                int i11 = dVar.f4009s;
                mVar.f4155a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = dVar.q();
                    if (i7 == 4) {
                        i = (eVar.q() - cVar2.f3953g) - cVar.f3953g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = dVar.k();
                    if (i9 == 4) {
                        i2 = (eVar.k() - cVar4.f3953g) - cVar3.f3953g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, dVar);
                    dVar.d.f4158e.d(dVar.q());
                    dVar.f3986e.f4158e.d(dVar.k());
                    dVar.f3979a = true;
                } else {
                    int[] iArr2 = eVar.f4006p0;
                    s.c[] cVarArr = dVar.f3969Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k3 = dVar.k();
                        f(1, (int) ((k3 * dVar.f3975W) + 0.5f), 1, k3, dVar);
                        dVar.d.f4158e.d(dVar.q());
                        dVar.f3986e.f4158e.d(dVar.k());
                        dVar.f3979a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f4158e.f4143m = dVar.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * eVar.q()) + 0.5f), i9, dVar.k(), dVar);
                            dVar.d.f4158e.d(dVar.q());
                            dVar.f3986e.f4158e.d(dVar.k());
                            dVar.f3979a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (cVarArr[0].f3952f == null || cVarArr[1].f3952f == null) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f4158e.d(dVar.q());
                        dVar.f3986e.f4158e.d(dVar.k());
                        dVar.f3979a = true;
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
                                f(2, 0, 2, 0, dVar);
                                dVar.d.f4158e.f4143m = dVar.q();
                                dVar.f3986e.f4158e.f4143m = dVar.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q3 = dVar.q();
                            float f4 = dVar.f3975W;
                            if (dVar.f3976X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), dVar);
                            dVar.d.f4158e.d(dVar.q());
                            dVar.f3986e.f4158e.d(dVar.k());
                            dVar.f3979a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, dVar);
                            dVar.f3986e.f4158e.f4143m = dVar.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, dVar.q(), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f4158e.d(dVar.q());
                                    dVar.f3986e.f4158e.d(dVar.k());
                                    dVar.f3979a = true;
                                }
                            } else if (cVarArr[2].f3952f == null || cVarArr[3].f3952f == null) {
                                f(2, 0, i9, 0, dVar);
                                dVar.d.f4158e.d(dVar.q());
                                dVar.f3986e.f4158e.d(dVar.k());
                                dVar.f3979a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.d.f4158e.f4143m = dVar.q();
                                    dVar.f3986e.f4158e.f4143m = dVar.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * eVar.q()) + 0.5f), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f4158e.d(dVar.q());
                                    dVar.f3986e.f4158e.d(dVar.k());
                                    dVar.f3979a = true;
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
        ArrayList arrayList = this.f4131e;
        arrayList.clear();
        s.e eVar = this.d;
        eVar.d.f();
        eVar.f3986e.f();
        arrayList.add(eVar.d);
        arrayList.add(eVar.f3986e);
        Iterator it = eVar.f4027q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (dVar instanceof s.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.f3986e.f();
                iVar.f4159f = ((s.h) dVar).f4088u0;
                arrayList.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3981b == null) {
                        dVar.f3981b = new C0366c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3981b);
                } else {
                    arrayList.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f3983c == null) {
                        dVar.f3983c = new C0366c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3983c);
                } else {
                    arrayList.add(dVar.f3986e);
                }
                if (dVar instanceof s.i) {
                    arrayList.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((p) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            p pVar = (p) it3.next();
            if (pVar.f4156b != eVar) {
                pVar.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        s.e eVar2 = this.f4128a;
        e(eVar2.d, 0, arrayList2);
        e(eVar2.f3986e, 1, arrayList2);
        this.f4129b = false;
    }

    public final int d(s.e eVar, int i) {
        ArrayList arrayList;
        int i2;
        int i3;
        long max;
        float f2;
        s.e eVar2 = eVar;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i4 = 0;
        long j2 = 0;
        while (i4 < size) {
            p pVar = ((l) arrayList2.get(i4)).f4146a;
            if (!(pVar instanceof C0366c) ? !(i != 0 ? (pVar instanceof m) : (pVar instanceof k)) : ((C0366c) pVar).f4159f != i) {
                f fVar = (i == 0 ? eVar2.d : eVar2.f3986e).h;
                f fVar2 = (i == 0 ? eVar2.d : eVar2.f3986e).i;
                boolean contains = pVar.h.f4142l.contains(fVar);
                f fVar3 = pVar.i;
                boolean contains2 = fVar3.f4142l.contains(fVar2);
                long j3 = pVar.j();
                f fVar4 = pVar.h;
                if (contains && contains2) {
                    long b2 = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = l.a(fVar3, 0L);
                    long j4 = b2 - j3;
                    int i5 = fVar3.f4138f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = fVar4.f4138f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    s.d dVar = pVar.f4156b;
                    if (i == 0) {
                        f2 = dVar.f3985d0;
                    } else if (i == 1) {
                        f2 = dVar.f3987e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > RecyclerView.f1949A0 ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (fVar4.f4138f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - fVar3.f4138f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(l.b(fVar4, fVar4.f4138f), fVar4.f4138f + j3) : contains2 ? Math.max(-l.a(fVar3, fVar3.f4138f), (-fVar3.f4138f) + j3) : (pVar.j() + fVar4.f4138f) - fVar3.f4138f;
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                i3 = i4;
                max = 0;
            }
            j2 = Math.max(j2, max);
            i4 = i3 + 1;
            eVar2 = eVar;
            size = i2;
            arrayList2 = arrayList;
        }
        return (int) j2;
    }

    public final void e(p pVar, int i, ArrayList arrayList) {
        f fVar;
        Iterator it = pVar.h.f4141k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            fVar = pVar.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0367d interfaceC0367d = (InterfaceC0367d) it.next();
            if (interfaceC0367d instanceof f) {
                a((f) interfaceC0367d, i, arrayList, null);
            } else if (interfaceC0367d instanceof p) {
                a(((p) interfaceC0367d).h, i, arrayList, null);
            }
        }
        Iterator it2 = fVar.f4141k.iterator();
        while (it2.hasNext()) {
            InterfaceC0367d interfaceC0367d2 = (InterfaceC0367d) it2.next();
            if (interfaceC0367d2 instanceof f) {
                a((f) interfaceC0367d2, i, arrayList, null);
            } else if (interfaceC0367d2 instanceof p) {
                a(((p) interfaceC0367d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((m) pVar).f4148k.f4141k.iterator();
            while (it3.hasNext()) {
                InterfaceC0367d interfaceC0367d3 = (InterfaceC0367d) it3.next();
                if (interfaceC0367d3 instanceof f) {
                    a((f) interfaceC0367d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, s.d dVar) {
        C0365b c0365b = this.f4133g;
        c0365b.f4119a = i;
        c0365b.f4120b = i3;
        c0365b.f4121c = i2;
        c0365b.d = i4;
        this.f4132f.b(dVar, c0365b);
        dVar.O(c0365b.f4122e);
        dVar.L(c0365b.f4123f);
        dVar.f3958E = c0365b.h;
        dVar.I(c0365b.f4124g);
    }

    public final void g() {
        C0364a c0364a;
        Iterator it = this.f4128a.f4027q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (!dVar.f3979a) {
                int[] iArr = dVar.f4006p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = dVar.f4008r;
                int i4 = dVar.f4009s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                g gVar = dVar.d.f4158e;
                boolean z4 = gVar.f4140j;
                g gVar2 = dVar.f3986e.f4158e;
                boolean z5 = gVar2.f4140j;
                if (z4 && z5) {
                    f(1, gVar.f4139g, 1, gVar2.f4139g, dVar);
                    dVar.f3979a = true;
                } else if (z4 && z2) {
                    f(1, gVar.f4139g, 2, gVar2.f4139g, dVar);
                    if (i2 == 3) {
                        dVar.f3986e.f4158e.f4143m = dVar.k();
                    } else {
                        dVar.f3986e.f4158e.d(dVar.k());
                        dVar.f3979a = true;
                    }
                } else if (z5 && z3) {
                    f(2, gVar.f4139g, 1, gVar2.f4139g, dVar);
                    if (i == 3) {
                        dVar.d.f4158e.f4143m = dVar.q();
                    } else {
                        dVar.d.f4158e.d(dVar.q());
                        dVar.f3979a = true;
                    }
                }
                if (dVar.f3979a && (c0364a = dVar.f3986e.f4149l) != null) {
                    c0364a.d(dVar.f3980a0);
                }
            }
        }
    }
}
