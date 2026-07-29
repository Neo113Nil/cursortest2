package o;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o.zt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2382zt implements SW, TW {
    public AbstractC1004ey a;
    public final LinkedHashSet b;
    public final int c;

    public C2382zt(AbstractCollection abstractCollection) {
        AbstractC0048Bt.n(abstractCollection, "typesToIntersect");
        abstractCollection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    @Override // o.SW
    public final boolean a() {
        return false;
    }

    @Override // o.SW
    public final InterfaceC2364zb c() {
        return null;
    }

    @Override // o.SW
    public final Collection d() {
        return this.b;
    }

    public final JR e() {
        OW.i.getClass();
        return HO.t(OW.j, this, C1318jk.h, false, AbstractC1035fP.c("member scope for intersection type", this.b), new C1400l(21, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2382zt)) {
            return false;
        }
        return AbstractC0048Bt.h(this.b, ((C2382zt) obj).b);
    }

    public final String f(InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(interfaceC2114vp, "getProperTypeRelatedToStringify");
        return AbstractC0720ac.t0(AbstractC0720ac.G0(this.b, new C0947e3(2, interfaceC2114vp)), " & ", "{", "}", new C0175Gq(interfaceC2114vp, 1), 24);
    }

    @Override // o.SW
    public final List getParameters() {
        return C1318jk.h;
    }

    public final int hashCode() {
        return this.c;
    }

    @Override // o.SW
    public final AbstractC0545Ux l() {
        AbstractC0545Ux l = ((AbstractC1004ey) this.b.iterator().next()).B0().l();
        AbstractC0048Bt.m(l, "intersectedTypes.iterato…xt().constructor.builtIns");
        return l;
    }

    public final String toString() {
        return f(C2316yt.i);
    }
}
