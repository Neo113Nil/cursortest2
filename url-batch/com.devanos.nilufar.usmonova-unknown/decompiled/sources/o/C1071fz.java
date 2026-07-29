package o;

import java.util.Collection;
import java.util.Set;

/* renamed from: o.fz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071fz extends AbstractC0868ct {
    public final /* synthetic */ InterfaceC1245ib s;
    public final /* synthetic */ Set t;
    public final /* synthetic */ AbstractC1596ny u;

    /* JADX WARN: Multi-variable type inference failed */
    public C1071fz(InterfaceC1245ib interfaceC1245ib, Set set, InterfaceC2114vp interfaceC2114vp) {
        this.s = interfaceC1245ib;
        this.t = set;
        this.u = (AbstractC1596ny) interfaceC2114vp;
    }

    @Override // o.AbstractC0868ct
    public final /* bridge */ /* synthetic */ Object R() {
        return C0782bY.a;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o.ny, o.vp] */
    @Override // o.AbstractC0868ct
    public final boolean h(Object obj) {
        InterfaceC1245ib interfaceC1245ib = (InterfaceC1245ib) obj;
        AbstractC0048Bt.n(interfaceC1245ib, "current");
        if (interfaceC1245ib == this.s) {
            return true;
        }
        WB j0 = interfaceC1245ib.j0();
        AbstractC0048Bt.m(j0, "current.staticScope");
        if (!(j0 instanceof AbstractC1203hz)) {
            return true;
        }
        this.t.addAll((Collection) this.u.invoke(j0));
        return false;
    }
}
