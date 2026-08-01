package t;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0365b f4144a = new C0365b();

    public static boolean a(s.d dVar) {
        int[] iArr = dVar.f4006p0;
        int i = iArr[0];
        int i2 = iArr[1];
        s.d dVar2 = dVar.f3972T;
        s.e eVar = dVar2 != null ? (s.e) dVar2 : null;
        if (eVar != null) {
            int i3 = eVar.f4006p0[0];
        }
        if (eVar != null) {
            int i4 = eVar.f4006p0[1];
        }
        boolean z2 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f4008r == 0 && dVar.f3975W == RecyclerView.f1949A0 && dVar.t(0)) || (i == 3 && dVar.f4008r == 1 && dVar.u(0, dVar.q()));
        boolean z3 = i2 == 1 || dVar.B() || i2 == 2 || (i2 == 3 && dVar.f4009s == 0 && dVar.f3975W == RecyclerView.f1949A0 && dVar.t(1)) || (i2 == 3 && dVar.f4009s == 1 && dVar.u(1, dVar.k()));
        if (dVar.f3975W <= RecyclerView.f1949A0 || !(z2 || z3)) {
            return z2 && z3;
        }
        return true;
    }

    public static o b(s.d dVar, int i, ArrayList arrayList, o oVar) {
        int i2;
        int i3 = i == 0 ? dVar.n0 : dVar.f4004o0;
        if (i3 != -1 && (oVar == null || i3 != oVar.f4152b)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                o oVar2 = (o) arrayList.get(i4);
                if (oVar2.f4152b == i3) {
                    if (oVar != null) {
                        oVar.c(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (dVar instanceof s.i) {
                s.i iVar = (s.i) dVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.r0) {
                        i2 = -1;
                        break;
                    }
                    s.d dVar2 = iVar.f4090q0[i5];
                    if ((i == 0 && (i2 = dVar2.n0) != -1) || (i == 1 && (i2 = dVar2.f4004o0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = (o) arrayList.get(i6);
                        if (oVar3.f4152b == i2) {
                            oVar = oVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o();
                oVar.f4151a = new ArrayList();
                oVar.d = null;
                oVar.f4154e = -1;
                int i7 = o.f4150f;
                o.f4150f = i7 + 1;
                oVar.f4152b = i7;
                oVar.f4153c = i;
            }
            arrayList.add(oVar);
        }
        ArrayList arrayList2 = oVar.f4151a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof s.h) {
                s.h hVar = (s.h) dVar;
                hVar.f4087t0.c(hVar.f4088u0 == 0 ? 1 : 0, arrayList, oVar);
            }
            int i8 = oVar.f4152b;
            if (i == 0) {
                dVar.n0 = i8;
                dVar.f3961I.c(i, arrayList, oVar);
                dVar.f3963K.c(i, arrayList, oVar);
            } else {
                dVar.f4004o0 = i8;
                dVar.f3962J.c(i, arrayList, oVar);
                dVar.f3965M.c(i, arrayList, oVar);
                dVar.f3964L.c(i, arrayList, oVar);
            }
            dVar.f3968P.c(i, arrayList, oVar);
        }
        return oVar;
    }

    public static void c(int i, s.d dVar, v.f fVar, boolean z2) {
        s.c cVar;
        s.c cVar2;
        s.c cVar3;
        s.c cVar4;
        if (dVar.f4000m) {
            return;
        }
        if (!(dVar instanceof s.e) && dVar.z() && a(dVar)) {
            s.e.V(dVar, fVar, new C0365b());
        }
        s.c i2 = dVar.i(2);
        s.c i3 = dVar.i(4);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3948a;
        char c2 = 0;
        if (hashSet != null && i2.f3950c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                s.c cVar5 = (s.c) it.next();
                s.d dVar2 = cVar5.d;
                int i4 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.z() && a2) {
                    s.e.V(dVar2, fVar, new C0365b());
                }
                s.c cVar6 = dVar2.f3961I;
                s.c cVar7 = dVar2.f3963K;
                char c3 = ((cVar5 == cVar6 && (cVar4 = cVar7.f3952f) != null && cVar4.f3950c) || (cVar5 == cVar7 && (cVar3 = cVar6.f3952f) != null && cVar3.f3950c)) ? (char) 1 : c2;
                int i5 = dVar2.f4006p0[c2];
                if (i5 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f3952f == null) {
                            int e2 = cVar6.e() + d;
                            dVar2.J(e2, dVar2.q() + e2);
                            c(i4, dVar2, fVar, z2);
                        } else if (cVar5 == cVar7 && cVar6.f3952f == null) {
                            int e3 = d - cVar7.e();
                            dVar2.J(e3 - dVar2.q(), e3);
                            c(i4, dVar2, fVar, z2);
                        } else if (c3 != 0 && !dVar2.x()) {
                            d(i4, dVar2, fVar, z2);
                        }
                    }
                } else if (i5 == 3 && dVar2.f4012v >= 0 && dVar2.f4011u >= 0 && ((dVar2.f3991g0 == 8 || (dVar2.f4008r == 0 && dVar2.f3975W == RecyclerView.f1949A0)) && !dVar2.x() && !dVar2.F && c3 != 0 && !dVar2.x())) {
                    e(i4, dVar, fVar, dVar2, z2);
                }
                c2 = 0;
            }
        }
        if (dVar instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3948a;
        if (hashSet2 != null && i3.f3950c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                s.c cVar8 = (s.c) it2.next();
                s.d dVar3 = cVar8.d;
                int i6 = i + 1;
                boolean a3 = a(dVar3);
                if (dVar3.z() && a3) {
                    s.e.V(dVar3, fVar, new C0365b());
                }
                s.c cVar9 = dVar3.f3961I;
                s.c cVar10 = dVar3.f3963K;
                boolean z3 = (cVar8 == cVar9 && (cVar2 = cVar10.f3952f) != null && cVar2.f3950c) || (cVar8 == cVar10 && (cVar = cVar9.f3952f) != null && cVar.f3950c);
                int i7 = dVar3.f4006p0[0];
                if (i7 != 3 || a3) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f3952f == null) {
                            int e4 = cVar9.e() + d2;
                            dVar3.J(e4, dVar3.q() + e4);
                            c(i6, dVar3, fVar, z2);
                        } else if (cVar8 == cVar10 && cVar9.f3952f == null) {
                            int e5 = d2 - cVar10.e();
                            dVar3.J(e5 - dVar3.q(), e5);
                            c(i6, dVar3, fVar, z2);
                        } else if (z3 && !dVar3.x()) {
                            d(i6, dVar3, fVar, z2);
                        }
                    }
                } else if (i7 == 3 && dVar3.f4012v >= 0 && dVar3.f4011u >= 0) {
                    if (dVar3.f3991g0 != 8) {
                        if (dVar3.f4008r == 0) {
                            if (dVar3.f3975W == RecyclerView.f1949A0) {
                            }
                        }
                    }
                    if (!dVar3.x() && !dVar3.F && z3 && !dVar3.x()) {
                        e(i6, dVar, fVar, dVar3, z2);
                    }
                }
            }
        }
        dVar.f4000m = true;
    }

    public static void d(int i, s.d dVar, v.f fVar, boolean z2) {
        float f2 = dVar.f3985d0;
        s.c cVar = dVar.f3961I;
        int d = cVar.f3952f.d();
        s.c cVar2 = dVar.f3963K;
        int d2 = cVar2.f3952f.d();
        int e2 = cVar.e() + d;
        int e3 = d2 - cVar2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int q2 = dVar.q();
        int i2 = (d2 - d) - q2;
        if (d > d2) {
            i2 = (d - d2) - q2;
        }
        int i3 = ((int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2)) + d;
        int i4 = i3 + q2;
        if (d > d2) {
            i4 = i3 - q2;
        }
        dVar.J(i3, i4);
        c(i + 1, dVar, fVar, z2);
    }

    public static void e(int i, s.d dVar, v.f fVar, s.d dVar2, boolean z2) {
        float f2 = dVar2.f3985d0;
        s.c cVar = dVar2.f3961I;
        int e2 = cVar.e() + cVar.f3952f.d();
        s.c cVar2 = dVar2.f3963K;
        int d = cVar2.f3952f.d() - cVar2.e();
        if (d >= e2) {
            int q2 = dVar2.q();
            if (dVar2.f3991g0 != 8) {
                int i2 = dVar2.f4008r;
                if (i2 == 2) {
                    q2 = (int) (dVar2.f3985d0 * 0.5f * (dVar instanceof s.e ? dVar.q() : dVar.f3972T.q()));
                } else if (i2 == 0) {
                    q2 = d - e2;
                }
                q2 = Math.max(dVar2.f4011u, q2);
                int i3 = dVar2.f4012v;
                if (i3 > 0) {
                    q2 = Math.min(i3, q2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - q2)) + 0.5f));
            dVar2.J(i4, q2 + i4);
            c(i + 1, dVar2, fVar, z2);
        }
    }

    public static void f(int i, s.d dVar, v.f fVar) {
        float f2 = dVar.f3987e0;
        s.c cVar = dVar.f3962J;
        int d = cVar.f3952f.d();
        s.c cVar2 = dVar.f3964L;
        int d2 = cVar2.f3952f.d();
        int e2 = cVar.e() + d;
        int e3 = d2 - cVar2.e();
        if (d == d2) {
            f2 = 0.5f;
        } else {
            d = e2;
            d2 = e3;
        }
        int k2 = dVar.k();
        int i2 = (d2 - d) - k2;
        if (d > d2) {
            i2 = (d - d2) - k2;
        }
        int i3 = (int) (i2 > 0 ? (f2 * i2) + 0.5f : f2 * i2);
        int i4 = d + i3;
        int i5 = i4 + k2;
        if (d > d2) {
            i4 = d - i3;
            i5 = i4 - k2;
        }
        dVar.K(i4, i5);
        i(i + 1, dVar, fVar);
    }

    public static void g(int i, s.d dVar, v.f fVar, s.d dVar2) {
        float f2 = dVar2.f3987e0;
        s.c cVar = dVar2.f3962J;
        int e2 = cVar.e() + cVar.f3952f.d();
        s.c cVar2 = dVar2.f3964L;
        int d = cVar2.f3952f.d() - cVar2.e();
        if (d >= e2) {
            int k2 = dVar2.k();
            if (dVar2.f3991g0 != 8) {
                int i2 = dVar2.f4009s;
                if (i2 == 2) {
                    k2 = (int) (f2 * 0.5f * (dVar instanceof s.e ? dVar.k() : dVar.f3972T.k()));
                } else if (i2 == 0) {
                    k2 = d - e2;
                }
                k2 = Math.max(dVar2.f4014x, k2);
                int i3 = dVar2.f4015y;
                if (i3 > 0) {
                    k2 = Math.min(i3, k2);
                }
            }
            int i4 = e2 + ((int) ((f2 * ((d - e2) - k2)) + 0.5f));
            dVar2.K(i4, k2 + i4);
            i(i + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, s.d dVar, v.f fVar) {
        s.c cVar;
        s.c cVar2;
        s.c cVar3;
        s.c cVar4;
        s.c cVar5;
        if (dVar.f4002n) {
            return;
        }
        if (!(dVar instanceof s.e) && dVar.z() && a(dVar)) {
            s.e.V(dVar, fVar, new C0365b());
        }
        s.c i2 = dVar.i(3);
        s.c i3 = dVar.i(5);
        int d = i2.d();
        int d2 = i3.d();
        HashSet hashSet = i2.f3948a;
        if (hashSet != null && i2.f3950c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                s.c cVar6 = (s.c) it.next();
                s.d dVar2 = cVar6.d;
                int i4 = i + 1;
                boolean a2 = a(dVar2);
                if (dVar2.z() && a2) {
                    s.e.V(dVar2, fVar, new C0365b());
                }
                s.c cVar7 = dVar2.f3962J;
                s.c cVar8 = dVar2.f3964L;
                boolean z2 = (cVar6 == cVar7 && (cVar5 = cVar8.f3952f) != null && cVar5.f3950c) || (cVar6 == cVar8 && (cVar4 = cVar7.f3952f) != null && cVar4.f3950c);
                int i5 = dVar2.f4006p0[1];
                if (i5 != 3 || a2) {
                    if (!dVar2.z()) {
                        if (cVar6 == cVar7 && cVar8.f3952f == null) {
                            int e2 = cVar7.e() + d;
                            dVar2.K(e2, dVar2.k() + e2);
                            i(i4, dVar2, fVar);
                        } else if (cVar6 == cVar8 && cVar7.f3952f == null) {
                            int e3 = d - cVar8.e();
                            dVar2.K(e3 - dVar2.k(), e3);
                            i(i4, dVar2, fVar);
                        } else if (z2 && !dVar2.y()) {
                            f(i4, dVar2, fVar);
                        }
                    }
                } else if (i5 == 3 && dVar2.f4015y >= 0 && dVar2.f4014x >= 0 && (dVar2.f3991g0 == 8 || (dVar2.f4009s == 0 && dVar2.f3975W == RecyclerView.f1949A0))) {
                    if (!dVar2.y() && !dVar2.F && z2 && !dVar2.y()) {
                        g(i4, dVar, fVar, dVar2);
                    }
                }
            }
        }
        if (dVar instanceof s.h) {
            return;
        }
        HashSet hashSet2 = i3.f3948a;
        if (hashSet2 != null && i3.f3950c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                s.c cVar9 = (s.c) it2.next();
                s.d dVar3 = cVar9.d;
                int i6 = i + 1;
                boolean a3 = a(dVar3);
                if (dVar3.z() && a3) {
                    s.e.V(dVar3, fVar, new C0365b());
                }
                s.c cVar10 = dVar3.f3962J;
                s.c cVar11 = dVar3.f3964L;
                boolean z3 = (cVar9 == cVar10 && (cVar3 = cVar11.f3952f) != null && cVar3.f3950c) || (cVar9 == cVar11 && (cVar2 = cVar10.f3952f) != null && cVar2.f3950c);
                int i7 = dVar3.f4006p0[1];
                if (i7 != 3 || a3) {
                    if (!dVar3.z()) {
                        if (cVar9 == cVar10 && cVar11.f3952f == null) {
                            int e4 = cVar10.e() + d2;
                            dVar3.K(e4, dVar3.k() + e4);
                            i(i6, dVar3, fVar);
                        } else if (cVar9 == cVar11 && cVar10.f3952f == null) {
                            int e5 = d2 - cVar11.e();
                            dVar3.K(e5 - dVar3.k(), e5);
                            i(i6, dVar3, fVar);
                        } else if (z3 && !dVar3.y()) {
                            f(i6, dVar3, fVar);
                        }
                    }
                } else if (i7 == 3 && dVar3.f4015y >= 0 && dVar3.f4014x >= 0) {
                    if (dVar3.f3991g0 != 8) {
                        if (dVar3.f4009s == 0) {
                            if (dVar3.f3975W == RecyclerView.f1949A0) {
                            }
                        }
                    }
                    if (!dVar3.y() && !dVar3.F && z3 && !dVar3.y()) {
                        g(i6, dVar, fVar, dVar3);
                    }
                }
            }
        }
        s.c i8 = dVar.i(6);
        if (i8.f3948a != null && i8.f3950c) {
            int d3 = i8.d();
            Iterator it3 = i8.f3948a.iterator();
            while (it3.hasNext()) {
                s.c cVar12 = (s.c) it3.next();
                s.d dVar4 = cVar12.d;
                int i9 = i + 1;
                boolean a4 = a(dVar4);
                if (dVar4.z() && a4) {
                    s.e.V(dVar4, fVar, new C0365b());
                }
                if (dVar4.f4006p0[1] != 3 || a4) {
                    if (!dVar4.z() && cVar12 == (cVar = dVar4.f3965M)) {
                        int e6 = cVar12.e() + d3;
                        if (dVar4.f3958E) {
                            int i10 = e6 - dVar4.f3980a0;
                            int i11 = dVar4.f3974V + i10;
                            dVar4.f3978Z = i10;
                            dVar4.f3962J.l(i10);
                            dVar4.f3964L.l(i11);
                            cVar.l(e6);
                            dVar4.f3998l = true;
                        }
                        i(i9, dVar4, fVar);
                    }
                }
            }
        }
        dVar.f4002n = true;
    }
}
