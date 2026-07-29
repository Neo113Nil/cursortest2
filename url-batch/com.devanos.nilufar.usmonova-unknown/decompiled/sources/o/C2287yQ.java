package o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.yQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2287yQ {
    public final TC a;
    public final boolean b;
    public final C0027Ay c;
    public final C2023uQ d;
    public boolean e;
    public C2287yQ f;
    public final int g;

    public C2287yQ(TC tc, boolean z, C0027Ay c0027Ay, C2023uQ c2023uQ) {
        this.a = tc;
        this.b = z;
        this.c = c0027Ay;
        this.d = c2023uQ;
        this.g = c0027Ay.c;
    }

    public final C2287yQ a(EO eo, InterfaceC2114vp interfaceC2114vp) {
        C2023uQ c2023uQ = new C2023uQ();
        c2023uQ.i = false;
        c2023uQ.j = false;
        interfaceC2114vp.invoke(c2023uQ);
        C2287yQ c2287yQ = new C2287yQ(new C2221xQ(interfaceC2114vp), false, new C0027Ay(this.g + 2000000000, true), c2023uQ);
        c2287yQ.e = true;
        c2287yQ.f = this;
        return c2287yQ;
    }

    public final void b(C0027Ay c0027Ay, ArrayList arrayList) {
        YD n = c0027Ay.n();
        int i = n.j;
        if (i > 0) {
            Object[] objArr = n.h;
            int i2 = 0;
            do {
                C0027Ay c0027Ay2 = (C0027Ay) objArr[i2];
                if (c0027Ay2.v() && !c0027Ay2.B) {
                    if (c0027Ay2.u.f(8)) {
                        arrayList.add(AbstractC2219xO.b(c0027Ay2, this.b));
                    } else {
                        b(c0027Ay2, arrayList);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final ME c() {
        if (this.e) {
            C2287yQ j = j();
            if (j != null) {
                return j.c();
            }
            return null;
        }
        InterfaceC0725ah n = AbstractC2219xO.n(this.c);
        if (n == null) {
            n = this.a;
        }
        return AbstractC0946e20.I(n, 8);
    }

    public final void d(ArrayList arrayList) {
        List n = n(false);
        int size = n.size();
        for (int i = 0; i < size; i++) {
            C2287yQ c2287yQ = (C2287yQ) n.get(i);
            if (c2287yQ.l()) {
                arrayList.add(c2287yQ);
            } else if (!c2287yQ.d.j) {
                c2287yQ.d(arrayList);
            }
        }
    }

    public final C1032fM e() {
        ME c = c();
        if (c != null) {
            if (!c.h0().m) {
                c = null;
            }
            if (c != null) {
                return AbstractC1807r8.F(c).d(c, true);
            }
        }
        return C1032fM.e;
    }

    public final C1032fM f() {
        ME c = c();
        if (c != null) {
            if (!c.h0().m) {
                c = null;
            }
            if (c != null) {
                return AbstractC1807r8.k(c);
            }
        }
        return C1032fM.e;
    }

    public final List g(boolean z, boolean z2) {
        if (!z && this.d.j) {
            return C1318jk.h;
        }
        if (!l()) {
            return n(z2);
        }
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        return arrayList;
    }

    public final C2023uQ i() {
        boolean l = l();
        C2023uQ c2023uQ = this.d;
        if (!l) {
            return c2023uQ;
        }
        C2023uQ c2023uQ2 = new C2023uQ();
        c2023uQ2.i = c2023uQ.i;
        c2023uQ2.j = c2023uQ.j;
        c2023uQ2.h.putAll(c2023uQ.h);
        m(c2023uQ2);
        return c2023uQ2;
    }

    public final C2287yQ j() {
        C0027Ay c0027Ay;
        C2287yQ c2287yQ = this.f;
        if (c2287yQ != null) {
            return c2287yQ;
        }
        C0027Ay c0027Ay2 = this.c;
        boolean z = this.b;
        if (z) {
            c0027Ay = c0027Ay2.l();
            while (c0027Ay != null) {
                C2023uQ i = c0027Ay.i();
                if (i != null && i.i) {
                    break;
                }
                c0027Ay = c0027Ay.l();
            }
        }
        c0027Ay = null;
        if (c0027Ay == null) {
            C0027Ay l = c0027Ay2.l();
            while (true) {
                if (l == null) {
                    c0027Ay = null;
                    break;
                }
                if (l.u.f(8)) {
                    c0027Ay = l;
                    break;
                }
                l = l.l();
            }
        }
        if (c0027Ay == null) {
            return null;
        }
        return AbstractC2219xO.b(c0027Ay, z);
    }

    public final C2023uQ k() {
        return this.d;
    }

    public final boolean l() {
        return this.b && this.d.i;
    }

    public final void m(C2023uQ c2023uQ) {
        if (this.d.j) {
            return;
        }
        List n = n(false);
        int size = n.size();
        for (int i = 0; i < size; i++) {
            C2287yQ c2287yQ = (C2287yQ) n.get(i);
            if (!c2287yQ.l()) {
                C2023uQ c2023uQ2 = c2287yQ.d;
                LinkedHashMap linkedHashMap = c2023uQ.h;
                for (Map.Entry entry : c2023uQ2.h.entrySet()) {
                    FQ fq = (FQ) entry.getKey();
                    Object value = entry.getValue();
                    Object obj = linkedHashMap.get(fq);
                    AbstractC0048Bt.l(fq, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                    Object invoke = fq.b.invoke(obj, value);
                    if (invoke != null) {
                        linkedHashMap.put(fq, invoke);
                    }
                }
                c2287yQ.m(c2023uQ);
            }
        }
    }

    public final List n(boolean z) {
        if (this.e) {
            return C1318jk.h;
        }
        ArrayList arrayList = new ArrayList();
        b(this.c, arrayList);
        if (z) {
            C2023uQ c2023uQ = this.d;
            LinkedHashMap linkedHashMap = c2023uQ.h;
            Object obj = linkedHashMap.get(CQ.q);
            if (obj == null) {
                obj = null;
            }
            FQ fq = CQ.a;
            if (linkedHashMap.containsKey(fq) && !arrayList.isEmpty() && c2023uQ.i) {
                Object obj2 = linkedHashMap.get(fq);
                if (obj2 == null) {
                    obj2 = null;
                }
                List list = (List) obj2;
                String str = list != null ? (String) AbstractC0720ac.p0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new RI(str, 21)));
                }
            }
        }
        return arrayList;
    }
}
