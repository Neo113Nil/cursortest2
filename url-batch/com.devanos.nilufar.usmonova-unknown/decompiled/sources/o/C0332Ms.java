package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: o.Ms, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332Ms extends XB {
    public final WB b;

    public C0332Ms(WB wb) {
        AbstractC0048Bt.n(wb, "workerScope");
        this.b = wb;
    }

    @Override // o.XB, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        int i = C2106vh.l & c2106vh.b;
        C2106vh c2106vh2 = i == 0 ? null : new C2106vh(i, c2106vh.a);
        if (c2106vh2 == null) {
            return C1318jk.h;
        }
        Collection b = this.b.b(c2106vh2, interfaceC2114vp);
        ArrayList arrayList = new ArrayList();
        for (Object obj : b) {
            if (obj instanceof InterfaceC0004Ab) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // o.XB, o.WB
    public final Set d() {
        return this.b.d();
    }

    @Override // o.XB, o.WB
    public final Set e() {
        return this.b.e();
    }

    @Override // o.XB, o.WB
    public final Set f() {
        return this.b.f();
    }

    @Override // o.XB, o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        InterfaceC2364zb g = this.b.g(c0827cE, de);
        if (g != null) {
            InterfaceC1245ib interfaceC1245ib = g instanceof InterfaceC1245ib ? (InterfaceC1245ib) g : null;
            if (interfaceC1245ib != null) {
                return interfaceC1245ib;
            }
            if (g instanceof C1316ji) {
                return (C1316ji) g;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
