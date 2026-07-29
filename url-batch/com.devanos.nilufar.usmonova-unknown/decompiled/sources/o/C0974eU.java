package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.eU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974eU extends XB {
    public final InterfaceC0761bD b;
    public final C2245xo c;

    public C0974eU(InterfaceC0761bD interfaceC0761bD, C2245xo c2245xo) {
        AbstractC0048Bt.n(interfaceC0761bD, "moduleDescriptor");
        AbstractC0048Bt.n(c2245xo, "fqName");
        this.b = interfaceC0761bD;
        this.c = c2245xo;
    }

    @Override // o.XB, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        if (c2106vh.a(C2106vh.h)) {
            C2245xo c2245xo = this.c;
            if (!c2245xo.d() || !c2106vh.a.contains(C1908sh.a)) {
                InterfaceC0761bD interfaceC0761bD = this.b;
                Collection f = interfaceC0761bD.f(c2245xo, interfaceC2114vp);
                ArrayList arrayList = new ArrayList(f.size());
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    C0827cE f2 = ((C2245xo) it.next()).f();
                    AbstractC0048Bt.m(f2, "subFqName.shortName()");
                    if (((Boolean) interfaceC2114vp.invoke(f2)).booleanValue()) {
                        C1465lz c1465lz = null;
                        if (!f2.i) {
                            C1465lz c1465lz2 = (C1465lz) interfaceC0761bD.S(c2245xo.c(f2));
                            if (!((Boolean) AbstractC0772bO.o(c1465lz2.m, C1465lz.f196o[1])).booleanValue()) {
                                c1465lz = c1465lz2;
                            }
                        }
                        AbstractC1052fg.e(arrayList, c1465lz);
                    }
                }
                return arrayList;
            }
        }
        return C1318jk.h;
    }

    @Override // o.XB, o.WB
    public final Set f() {
        return C1648ok.h;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
