package o;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: o.hU, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1172hU implements WB {
    public final WB b;
    public final C2096vX c;
    public HashMap d;
    public final BU e;

    public C1172hU(WB wb, C2096vX c2096vX) {
        AbstractC0048Bt.n(wb, "workerScope");
        AbstractC0048Bt.n(c2096vX, "givenSubstitutor");
        this.b = wb;
        EB.D(new LE(12, c2096vX));
        AbstractC1964tX f = c2096vX.f();
        AbstractC0048Bt.m(f, "givenSubstitutor.substitution");
        this.c = new C2096vX(EB.Z(f));
        this.e = EB.D(new LE(11, this));
    }

    @Override // o.WB
    public final Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return h(this.b.a(c0827cE, de));
    }

    @Override // o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return (Collection) this.e.getValue();
    }

    @Override // o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return h(this.b.c(c0827cE, de));
    }

    @Override // o.WB
    public final Set d() {
        return this.b.d();
    }

    @Override // o.WB
    public final Set e() {
        return this.b.e();
    }

    @Override // o.WB
    public final Set f() {
        return this.b.f();
    }

    @Override // o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        InterfaceC2364zb g = this.b.g(c0827cE, de);
        if (g != null) {
            return (InterfaceC2364zb) i(g);
        }
        return null;
    }

    public final Collection h(Collection collection) {
        if (this.c.a.e()) {
            return collection;
        }
        if (collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((InterfaceC1118gg) it.next()));
        }
        return linkedHashSet;
    }

    public final InterfaceC1118gg i(InterfaceC1118gg interfaceC1118gg) {
        C2096vX c2096vX = this.c;
        if (c2096vX.a.e()) {
            return interfaceC1118gg;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        HashMap hashMap = this.d;
        AbstractC0048Bt.k(hashMap);
        Object obj = hashMap.get(interfaceC1118gg);
        if (obj == null) {
            if (!(interfaceC1118gg instanceof InterfaceC1106gU)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC1118gg).toString());
            }
            obj = ((InterfaceC1106gU) interfaceC1118gg).e(c2096vX);
            if (obj == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC1118gg + " substitution fails");
            }
            hashMap.put(interfaceC1118gg, obj);
        }
        return (InterfaceC1118gg) obj;
    }
}
