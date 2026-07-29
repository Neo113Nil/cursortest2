package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.sq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1917sq extends AbstractC2115vq {
    public final C0377Ol h;

    public AbstractC1917sq() {
        this.h = new C0377Ol();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i() {
        C1038fS c1038fS = this.h.a;
        int i = 0;
        while (true) {
            if (i >= c1038fS.i.size()) {
                Iterator it = c1038fS.c().iterator();
                while (it.hasNext()) {
                    if (!C0377Ol.e((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!C0377Ol.e((Map.Entry) c1038fS.i.get(i))) {
                break;
            }
            i++;
        }
    }

    public final int j() {
        C1038fS c1038fS = this.h.a;
        int i = 0;
        for (int i2 = 0; i2 < c1038fS.i.size(); i2++) {
            Map.Entry entry = (Map.Entry) c1038fS.i.get(i2);
            i += C0377Ol.d((C1983tq) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : c1038fS.c()) {
            i += C0377Ol.d((C1983tq) entry2.getKey(), entry2.getValue());
        }
        return i;
    }

    public final Object k(C2049uq c2049uq) {
        o(c2049uq);
        C1983tq c1983tq = c2049uq.d;
        Object obj = this.h.a.get(c1983tq);
        if (obj == null) {
            return c2049uq.b;
        }
        if (!c1983tq.j) {
            return c2049uq.a(obj);
        }
        if (c1983tq.i.h != K10.p) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c2049uq.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(C2049uq c2049uq) {
        o(c2049uq);
        C1983tq c1983tq = c2049uq.d;
        C0377Ol c0377Ol = this.h;
        c0377Ol.getClass();
        if (c1983tq.j) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c0377Ol.a.get(c1983tq) != null;
    }

    public final void m() {
        this.h.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(C0523Ub c0523Ub, M5 m5, C1649ol c1649ol, int i) {
        boolean z;
        boolean z2;
        Object c;
        E e;
        int i2 = i & 7;
        C2049uq c2049uq = (C2049uq) c1649ol.a.get(new C1583nl(i >>> 3, a()));
        if (c2049uq != null) {
            C1983tq c1983tq = c2049uq.d;
            I10 i10 = c1983tq.i;
            C0377Ol c0377Ol = C0377Ol.c;
            if (i2 == i10.i) {
                z2 = false;
                z = false;
            } else if (c1983tq.j && i10.a() && i2 == 2) {
                z = true;
                z2 = false;
            }
            if (!z2) {
                return c0523Ub.q(i, m5);
            }
            AbstractC1654oq abstractC1654oq = null;
            C0377Ol c0377Ol2 = this.h;
            if (z) {
                int d = c0523Ub.d(c0523Ub.k());
                C1983tq c1983tq2 = c2049uq.d;
                if (c1983tq2.i != I10.n) {
                    while (c0523Ub.b() > 0) {
                        c0377Ol2.a(c1983tq2, C0377Ol.h(c0523Ub, c1983tq2.i));
                    }
                } else if (c0523Ub.b() > 0) {
                    c0523Ub.k();
                    throw null;
                }
                c0523Ub.c(d);
                return true;
            }
            C1983tq c1983tq3 = c2049uq.d;
            I10 i102 = c1983tq3.i;
            boolean z3 = c1983tq3.j;
            int ordinal = i102.h.ordinal();
            if (ordinal == 7) {
                c0523Ub.k();
                throw null;
            }
            if (ordinal != 8) {
                c = C0377Ol.h(c0523Ub, i102);
            } else {
                if (!z3 && (e = (E) c0377Ol2.a.get(c1983tq3)) != null) {
                    abstractC1654oq = e.e();
                }
                if (abstractC1654oq == null) {
                    abstractC1654oq = c2049uq.c.d();
                }
                if (i102 == I10.l) {
                    int i3 = c1983tq3.h;
                    int i4 = c0523Ub.i;
                    if (i4 >= 64) {
                        throw new C0204Ht("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    c0523Ub.i = i4 + 1;
                    abstractC1654oq.d(c0523Ub, c1649ol);
                    c0523Ub.a((i3 << 3) | 4);
                    c0523Ub.i--;
                } else {
                    int k = c0523Ub.k();
                    if (c0523Ub.i >= 64) {
                        throw new C0204Ht("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    int d2 = c0523Ub.d(k);
                    c0523Ub.i++;
                    abstractC1654oq.d(c0523Ub, c1649ol);
                    c0523Ub.a(0);
                    c0523Ub.i--;
                    c0523Ub.c(d2);
                }
                c = abstractC1654oq.c();
            }
            if (z3) {
                c0377Ol2.a(c1983tq3, c2049uq.b(c));
                return true;
            }
            c0377Ol2.i(c1983tq3, c2049uq.b(c));
            return true;
        }
        z2 = true;
        z = false;
        if (!z2) {
        }
    }

    public final void o(C2049uq c2049uq) {
        if (c2049uq.a != a()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC1917sq(AbstractC1851rq abstractC1851rq) {
        abstractC1851rq.i.f();
        abstractC1851rq.j = false;
        this.h = abstractC1851rq.i;
    }
}
