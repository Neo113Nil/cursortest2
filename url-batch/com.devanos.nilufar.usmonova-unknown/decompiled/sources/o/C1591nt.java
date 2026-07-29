package o;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: o.nt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1591nt implements SW {
    public final Set a;
    public final BU b;

    public C1591nt(Set set) {
        OW.i.getClass();
        OW ow = OW.j;
        AbstractC0048Bt.n(ow, "attributes");
        HO.s(C1318jk.h, C0273Kk.a(2, true, "unknown integer literal type"), ow, this, false);
        this.b = EB.D(new C2234xd(this));
        this.a = set;
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
        return (List) this.b.getValue();
    }

    @Override // o.SW
    public final List getParameters() {
        return C1318jk.h;
    }

    @Override // o.SW
    public final AbstractC0545Ux l() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + AbstractC0720ac.t0(this.a, ",", null, null, I2.L, 30) + ']');
        return sb.toString();
    }
}
