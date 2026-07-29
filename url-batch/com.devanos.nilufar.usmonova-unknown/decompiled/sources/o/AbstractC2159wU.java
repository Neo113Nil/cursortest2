package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: o.wU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2159wU {
    public static final C2076vD a;

    static {
        C0273Kk c0273Kk = C0273Kk.a;
        C1450lk c1450lk = new C1450lk(C0273Kk.b, AbstractC1499mT.e, 0);
        C0827cE f = AbstractC1499mT.f.f();
        MA ma = VA.e;
        C2076vD c2076vD = new C2076vD(c1450lk, f, ma);
        c2076vD.f232o = 4;
        C0244Jh c0244Jh = AbstractC0270Kh.e;
        if (c0244Jh == null) {
            C2076vD.F(9);
            throw null;
        }
        c2076vD.p = c0244Jh;
        List J = AbstractC0868ct.J(C1503mX.K0(c2076vD, 2, C0827cE.e("T"), 0, ma));
        if (c2076vD.r != null) {
            throw new IllegalStateException("Type parameters are already set for " + c2076vD.getName());
        }
        ArrayList arrayList = new ArrayList(J);
        c2076vD.r = arrayList;
        c2076vD.q = new C1968tb(c2076vD, arrayList, c2076vD.s, c2076vD.t);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            C2076vD.F(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C0981eb) ((InterfaceC0381Op) it.next())).n = c2076vD.i();
        }
        a = c2076vD;
    }
}
