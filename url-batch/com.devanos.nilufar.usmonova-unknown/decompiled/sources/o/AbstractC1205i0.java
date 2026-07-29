package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1205i0 implements SW {
    public int a;
    public final OA b;

    public AbstractC1205i0(OT ot) {
        AbstractC0048Bt.n(ot, "storageManager");
        this.b = new OA((VA) ot, new C1139h0(0, this), new C1400l(4, this));
    }

    public abstract Collection e();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SW) && obj.hashCode() == hashCode()) {
            SW sw = (SW) obj;
            if (sw.getParameters().size() == getParameters().size()) {
                InterfaceC2364zb c = c();
                InterfaceC2364zb c2 = sw.c();
                if (c2 == null || C0273Kk.f(c) || AbstractC0114Eh.o(c) || C0273Kk.f(c2) || AbstractC0114Eh.o(c2)) {
                    return false;
                }
                return i(c2);
            }
        }
        return false;
    }

    public abstract AbstractC1004ey f();

    public abstract C1097gL g();

    @Override // o.SW
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final List d() {
        return ((C1073g0) this.b.invoke()).b;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        InterfaceC2364zb c = c();
        int identityHashCode = (C0273Kk.f(c) || AbstractC0114Eh.o(c)) ? System.identityHashCode(this) : AbstractC0114Eh.g(c).a.hashCode();
        this.a = identityHashCode;
        return identityHashCode;
    }

    public abstract boolean i(InterfaceC2364zb interfaceC2364zb);

    public List j(List list) {
        return list;
    }
}
