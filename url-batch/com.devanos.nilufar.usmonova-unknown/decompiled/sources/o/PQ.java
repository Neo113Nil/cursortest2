package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PQ extends QQ {
    public static C0730am A(NQ nq, InterfaceC2114vp interfaceC2114vp) {
        return new C0730am(new C1831rW(nq, interfaceC2114vp), false, new C0215Ie(3));
    }

    public static List B(NQ nq) {
        Iterator it = nq.iterator();
        if (!it.hasNext()) {
            return C1318jk.h;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0868ct.J(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static int t(NQ nq) {
        Iterator it = nq.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i;
    }

    public static NQ u(NQ nq, int i) {
        if (i >= 0) {
            return i == 0 ? nq : nq instanceof InterfaceC1910sj ? ((InterfaceC1910sj) nq).a(i) : new C1844rj(nq, i);
        }
        throw new IllegalArgumentException(AbstractC1888sN.h(i, "Requested element count ", " is less than zero.").toString());
    }

    public static Object v(C0730am c0730am) {
        C0663Zl c0663Zl = new C0663Zl(c0730am);
        if (c0663Zl.hasNext()) {
            return c0663Zl.next();
        }
        return null;
    }

    public static final C1716pm w(NQ nq) {
        C0215Ie c0215Ie = new C0215Ie(1);
        if (!(nq instanceof C1831rW)) {
            return new C1716pm(nq, new C0215Ie(2), c0215Ie);
        }
        C1831rW c1831rW = (C1831rW) nq;
        return new C1716pm(c1831rW.a, c1831rW.b, c0215Ie);
    }

    public static NQ x(Object obj, InterfaceC2114vp interfaceC2114vp) {
        return obj == null ? C1582nk.a : new C0987eh(new R6(2, obj), interfaceC2114vp);
    }

    public static NQ y(InterfaceC1455lp interfaceC1455lp) {
        return new C0577Wd(new C0987eh(interfaceC1455lp, new C1730q(interfaceC1455lp)));
    }

    public static C1831rW z(NQ nq, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(interfaceC2114vp, "transform");
        return new C1831rW(nq, interfaceC2114vp);
    }
}
