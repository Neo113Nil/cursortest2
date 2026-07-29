package o;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class XB implements WB {
    @Override // o.WB
    public Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return C1318jk.h;
    }

    @Override // o.PN
    public Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return C1318jk.h;
    }

    @Override // o.WB
    public Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return C1318jk.h;
    }

    @Override // o.WB
    public Set d() {
        Collection b = b(C2106vh.p, I2.I);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : b) {
            if (obj instanceof HR) {
                C0827cE name = ((HR) obj).getName();
                AbstractC0048Bt.m(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // o.WB
    public Set e() {
        Collection b = b(C2106vh.q, I2.I);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : b) {
            if (obj instanceof HR) {
                C0827cE name = ((HR) obj).getName();
                AbstractC0048Bt.m(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // o.WB
    public Set f() {
        return null;
    }

    @Override // o.PN
    public InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        return null;
    }
}
