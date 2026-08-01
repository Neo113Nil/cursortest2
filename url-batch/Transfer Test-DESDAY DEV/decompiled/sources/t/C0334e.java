package t;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334e {

    /* renamed from: a, reason: collision with root package name */
    public s.e f3733a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3734b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3735c;
    public s.e d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f3736e;

    /* renamed from: f, reason: collision with root package name */
    public v.f f3737f;

    /* renamed from: g, reason: collision with root package name */
    public C0331b f3738g;
    public ArrayList h;

    public final void a(C0335f c0335f, int i, ArrayList arrayList, l lVar) {
        o oVar = c0335f.d;
        if (oVar.f3762c == null) {
            s.e eVar = this.f3733a;
            if (oVar == eVar.d || oVar == eVar.f3535e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f3751a = null;
                lVar.f3752b = new ArrayList();
                lVar.f3751a = oVar;
                arrayList.add(lVar);
            }
            oVar.f3762c = lVar;
            lVar.f3752b.add(oVar);
            C0335f c0335f2 = oVar.h;
            Iterator it = c0335f2.f3746k.iterator();
            while (it.hasNext()) {
                InterfaceC0333d interfaceC0333d = (InterfaceC0333d) it.next();
                if (interfaceC0333d instanceof C0335f) {
                    a((C0335f) interfaceC0333d, i, arrayList, lVar);
                }
            }
            C0335f c0335f3 = oVar.i;
            Iterator it2 = c0335f3.f3746k.iterator();
            while (it2.hasNext()) {
                InterfaceC0333d interfaceC0333d2 = (InterfaceC0333d) it2.next();
                if (interfaceC0333d2 instanceof C0335f) {
                    a((C0335f) interfaceC0333d2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it3 = ((m) oVar).f3753k.f3746k.iterator();
                while (it3.hasNext()) {
                    InterfaceC0333d interfaceC0333d3 = (InterfaceC0333d) it3.next();
                    if (interfaceC0333d3 instanceof C0335f) {
                        a((C0335f) interfaceC0333d3, i, arrayList, lVar);
                    }
                }
            }
            Iterator it4 = c0335f2.f3747l.iterator();
            while (it4.hasNext()) {
                a((C0335f) it4.next(), i, arrayList, lVar);
            }
            Iterator it5 = c0335f3.f3747l.iterator();
            while (it5.hasNext()) {
                a((C0335f) it5.next(), i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                Iterator it6 = ((m) oVar).f3753k.f3747l.iterator();
                while (it6.hasNext()) {
                    a((C0335f) it6.next(), i, arrayList, lVar);
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
        Iterator it = eVar.f3576q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            int[] iArr = dVar.f3555p0;
            int i7 = iArr[0];
            int i8 = iArr[1];
            if (dVar.f3540g0 == 8) {
                dVar.f3528a = true;
            } else {
                float f2 = dVar.f3562w;
                if (f2 < 1.0f && i7 == 3) {
                    dVar.f3557r = 2;
                }
                float f3 = dVar.f3565z;
                if (f3 < 1.0f && i8 == 3) {
                    dVar.f3558s = 2;
                }
                if (dVar.f3524W > RecyclerView.f1570A0) {
                    if (i7 == 3 && (i8 == 2 || i8 == 1)) {
                        dVar.f3557r = 3;
                    } else if (i8 == 3 && (i7 == 2 || i7 == 1)) {
                        dVar.f3558s = 3;
                    } else if (i7 == 3 && i8 == 3) {
                        if (dVar.f3557r == 0) {
                            dVar.f3557r = 3;
                        }
                        if (dVar.f3558s == 0) {
                            dVar.f3558s = 3;
                        }
                    }
                }
                s.c cVar = dVar.f3512K;
                s.c cVar2 = dVar.f3510I;
                if (i7 == 3 && dVar.f3557r == 1 && (cVar2.f3501f == null || cVar.f3501f == null)) {
                    i7 = 2;
                }
                s.c cVar3 = dVar.f3513L;
                s.c cVar4 = dVar.f3511J;
                int i9 = (i8 == 3 && dVar.f3558s == 1 && (cVar4.f3501f == null || cVar3.f3501f == null)) ? 2 : i8;
                k kVar = dVar.d;
                kVar.d = i7;
                int i10 = dVar.f3557r;
                kVar.f3760a = i10;
                m mVar = dVar.f3535e;
                mVar.d = i9;
                int i11 = dVar.f3558s;
                mVar.f3760a = i11;
                if ((i7 == 4 || i7 == 1 || i7 == 2) && (i9 == 4 || i9 == 1 || i9 == 2)) {
                    int q2 = dVar.q();
                    if (i7 == 4) {
                        i = (eVar.q() - cVar2.f3502g) - cVar.f3502g;
                        i7 = 1;
                    } else {
                        i = q2;
                    }
                    int k2 = dVar.k();
                    if (i9 == 4) {
                        i2 = (eVar.k() - cVar4.f3502g) - cVar3.f3502g;
                        i3 = 1;
                    } else {
                        i2 = k2;
                        i3 = i9;
                    }
                    f(i7, i, i3, i2, dVar);
                    dVar.d.f3763e.d(dVar.q());
                    dVar.f3535e.f3763e.d(dVar.k());
                    dVar.f3528a = true;
                } else {
                    int[] iArr2 = eVar.f3555p0;
                    s.c[] cVarArr = dVar.f3518Q;
                    if (i7 != 3 || (i9 != 2 && i9 != 1)) {
                        i4 = 3;
                    } else if (i10 == 3) {
                        if (i9 == 2) {
                            f(2, 0, 2, 0, dVar);
                        }
                        int k3 = dVar.k();
                        f(1, (int) ((k3 * dVar.f3524W) + 0.5f), 1, k3, dVar);
                        dVar.d.f3763e.d(dVar.q());
                        dVar.f3535e.f3763e.d(dVar.k());
                        dVar.f3528a = true;
                    } else if (i10 == 1) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f3763e.f3748m = dVar.q();
                    } else if (i10 == 2) {
                        int i12 = iArr2[0];
                        if (i12 == 1 || i12 == 4) {
                            f(1, (int) ((f2 * eVar.q()) + 0.5f), i9, dVar.k(), dVar);
                            dVar.d.f3763e.d(dVar.q());
                            dVar.f3535e.f3763e.d(dVar.k());
                            dVar.f3528a = true;
                        } else {
                            i4 = 3;
                        }
                    } else if (cVarArr[0].f3501f == null || cVarArr[1].f3501f == null) {
                        f(2, 0, i9, 0, dVar);
                        dVar.d.f3763e.d(dVar.q());
                        dVar.f3535e.f3763e.d(dVar.k());
                        dVar.f3528a = true;
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
                                dVar.d.f3763e.f3748m = dVar.q();
                                dVar.f3535e.f3763e.f3748m = dVar.k();
                            }
                        } else if (i11 == i4) {
                            if (i7 == 2) {
                                f(2, 0, 2, 0, dVar);
                            }
                            int q3 = dVar.q();
                            float f4 = dVar.f3524W;
                            if (dVar.f3525X == -1) {
                                f4 = 1.0f / f4;
                            }
                            f(1, q3, 1, (int) ((q3 * f4) + 0.5f), dVar);
                            dVar.d.f3763e.d(dVar.q());
                            dVar.f3535e.f3763e.d(dVar.k());
                            dVar.f3528a = true;
                        } else if (i11 == 1) {
                            f(i7, 0, 2, 0, dVar);
                            dVar.f3535e.f3763e.f3748m = dVar.k();
                        } else {
                            if (i11 == 2) {
                                int i13 = iArr2[1];
                                if (i13 == 1 || i13 == 4) {
                                    f(i7, dVar.q(), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f3763e.d(dVar.q());
                                    dVar.f3535e.f3763e.d(dVar.k());
                                    dVar.f3528a = true;
                                }
                            } else if (cVarArr[2].f3501f == null || cVarArr[3].f3501f == null) {
                                f(2, 0, i9, 0, dVar);
                                dVar.d.f3763e.d(dVar.q());
                                dVar.f3535e.f3763e.d(dVar.k());
                                dVar.f3528a = true;
                            }
                            if (i7 != i6 && i9 == i6) {
                                if (i10 != i5 || i11 == i5) {
                                    f(2, 0, 2, 0, dVar);
                                    dVar.d.f3763e.f3748m = dVar.q();
                                    dVar.f3535e.f3763e.f3748m = dVar.k();
                                } else if (i11 == 2 && i10 == 2 && iArr2[0] == 1 && iArr2[i5] == 1) {
                                    f(1, (int) ((f2 * eVar.q()) + 0.5f), 1, (int) ((f3 * eVar.k()) + 0.5f), dVar);
                                    dVar.d.f3763e.d(dVar.q());
                                    dVar.f3535e.f3763e.d(dVar.k());
                                    dVar.f3528a = true;
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
        ArrayList arrayList = this.f3736e;
        arrayList.clear();
        s.e eVar = this.d;
        eVar.d.f();
        eVar.f3535e.f();
        arrayList.add(eVar.d);
        arrayList.add(eVar.f3535e);
        Iterator it = eVar.f3576q0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (dVar instanceof s.h) {
                i iVar = new i(dVar);
                dVar.d.f();
                dVar.f3535e.f();
                iVar.f3764f = ((s.h) dVar).f3637u0;
                arrayList.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f3530b == null) {
                        dVar.f3530b = new C0332c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3530b);
                } else {
                    arrayList.add(dVar.d);
                }
                if (dVar.y()) {
                    if (dVar.f3532c == null) {
                        dVar.f3532c = new C0332c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f3532c);
                } else {
                    arrayList.add(dVar.f3535e);
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
            ((o) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o oVar = (o) it3.next();
            if (oVar.f3761b != eVar) {
                oVar.d();
            }
        }
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        s.e eVar2 = this.f3733a;
        e(eVar2.d, 0, arrayList2);
        e(eVar2.f3535e, 1, arrayList2);
        this.f3734b = false;
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
            o oVar = ((l) arrayList2.get(i4)).f3751a;
            if (!(oVar instanceof C0332c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((C0332c) oVar).f3764f != i) {
                C0335f c0335f = (i == 0 ? eVar2.d : eVar2.f3535e).h;
                C0335f c0335f2 = (i == 0 ? eVar2.d : eVar2.f3535e).i;
                boolean contains = oVar.h.f3747l.contains(c0335f);
                C0335f c0335f3 = oVar.i;
                boolean contains2 = c0335f3.f3747l.contains(c0335f2);
                long j3 = oVar.j();
                C0335f c0335f4 = oVar.h;
                if (contains && contains2) {
                    long b2 = l.b(c0335f4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long a2 = l.a(c0335f3, 0L);
                    long j4 = b2 - j3;
                    int i5 = c0335f3.f3743f;
                    arrayList = arrayList3;
                    i3 = i4;
                    if (j4 >= (-i5)) {
                        j4 += i5;
                    }
                    long j5 = (-a2) - j3;
                    long j6 = c0335f4.f3743f;
                    long j7 = j5 - j6;
                    if (j7 >= j6) {
                        j7 -= j6;
                    }
                    s.d dVar = oVar.f3761b;
                    if (i == 0) {
                        f2 = dVar.f3534d0;
                    } else if (i == 1) {
                        f2 = dVar.f3536e0;
                    } else {
                        dVar.getClass();
                        f2 = -1.0f;
                    }
                    float f3 = f2 > RecyclerView.f1570A0 ? (long) ((j4 / (1.0f - f2)) + (j7 / f2)) : 0L;
                    max = (c0335f4.f3743f + ((((long) ((f3 * f2) + 0.5f)) + j3) + ((long) (((1.0f - f2) * f3) + 0.5f)))) - c0335f3.f3743f;
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    i3 = i4;
                    max = contains ? Math.max(l.b(c0335f4, c0335f4.f3743f), c0335f4.f3743f + j3) : contains2 ? Math.max(-l.a(c0335f3, c0335f3.f3743f), (-c0335f3.f3743f) + j3) : (oVar.j() + c0335f4.f3743f) - c0335f3.f3743f;
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

    public final void e(o oVar, int i, ArrayList arrayList) {
        C0335f c0335f;
        Iterator it = oVar.h.f3746k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0335f = oVar.i;
            if (!hasNext) {
                break;
            }
            InterfaceC0333d interfaceC0333d = (InterfaceC0333d) it.next();
            if (interfaceC0333d instanceof C0335f) {
                a((C0335f) interfaceC0333d, i, arrayList, null);
            } else if (interfaceC0333d instanceof o) {
                a(((o) interfaceC0333d).h, i, arrayList, null);
            }
        }
        Iterator it2 = c0335f.f3746k.iterator();
        while (it2.hasNext()) {
            InterfaceC0333d interfaceC0333d2 = (InterfaceC0333d) it2.next();
            if (interfaceC0333d2 instanceof C0335f) {
                a((C0335f) interfaceC0333d2, i, arrayList, null);
            } else if (interfaceC0333d2 instanceof o) {
                a(((o) interfaceC0333d2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((m) oVar).f3753k.f3746k.iterator();
            while (it3.hasNext()) {
                InterfaceC0333d interfaceC0333d3 = (InterfaceC0333d) it3.next();
                if (interfaceC0333d3 instanceof C0335f) {
                    a((C0335f) interfaceC0333d3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i2, int i3, int i4, s.d dVar) {
        C0331b c0331b = this.f3738g;
        c0331b.f3724a = i;
        c0331b.f3725b = i3;
        c0331b.f3726c = i2;
        c0331b.d = i4;
        this.f3737f.b(dVar, c0331b);
        dVar.O(c0331b.f3727e);
        dVar.L(c0331b.f3728f);
        dVar.f3507E = c0331b.h;
        dVar.I(c0331b.f3729g);
    }

    public final void g() {
        C0330a c0330a;
        Iterator it = this.f3733a.f3576q0.iterator();
        while (it.hasNext()) {
            s.d dVar = (s.d) it.next();
            if (!dVar.f3528a) {
                int[] iArr = dVar.f3555p0;
                boolean z2 = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = dVar.f3557r;
                int i4 = dVar.f3558s;
                boolean z3 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z2 = true;
                }
                g gVar = dVar.d.f3763e;
                boolean z4 = gVar.f3745j;
                g gVar2 = dVar.f3535e.f3763e;
                boolean z5 = gVar2.f3745j;
                if (z4 && z5) {
                    f(1, gVar.f3744g, 1, gVar2.f3744g, dVar);
                    dVar.f3528a = true;
                } else if (z4 && z2) {
                    f(1, gVar.f3744g, 2, gVar2.f3744g, dVar);
                    if (i2 == 3) {
                        dVar.f3535e.f3763e.f3748m = dVar.k();
                    } else {
                        dVar.f3535e.f3763e.d(dVar.k());
                        dVar.f3528a = true;
                    }
                } else if (z5 && z3) {
                    f(2, gVar.f3744g, 1, gVar2.f3744g, dVar);
                    if (i == 3) {
                        dVar.d.f3763e.f3748m = dVar.q();
                    } else {
                        dVar.d.f3763e.d(dVar.q());
                        dVar.f3528a = true;
                    }
                }
                if (dVar.f3528a && (c0330a = dVar.f3535e.f3754l) != null) {
                    c0330a.d(dVar.f3529a0);
                }
            }
        }
    }
}
