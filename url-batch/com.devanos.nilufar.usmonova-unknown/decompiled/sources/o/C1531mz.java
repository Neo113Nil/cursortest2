package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* renamed from: o.mz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531mz implements WB {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public C1531mz(WB wb) {
        this.c = wb;
    }

    @Override // o.WB
    public Collection a(C0827cE c0827cE, DE de) {
        switch (this.b) {
            case 1:
                AbstractC0048Bt.n(c0827cE, "name");
                return AbstractC0048Bt.b0(j(c0827cE, de), RP.F);
            default:
                return j(c0827cE, de);
        }
    }

    @Override // o.PN
    public Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        switch (this.b) {
            case 1:
                AbstractC0048Bt.n(c2106vh, "kindFilter");
                Collection i = i(c2106vh, interfaceC2114vp);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : i) {
                    if (((InterfaceC1118gg) obj) instanceof InterfaceC2072v9) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return AbstractC0720ac.A0(AbstractC0048Bt.b0(arrayList, RP.E), arrayList2);
            default:
                return i(c2106vh, interfaceC2114vp);
        }
    }

    @Override // o.WB
    public Collection c(C0827cE c0827cE, DE de) {
        switch (this.b) {
            case 1:
                AbstractC0048Bt.n(c0827cE, "name");
                return AbstractC0048Bt.b0(k(c0827cE, de), RP.G);
            default:
                return k(c0827cE, de);
        }
    }

    @Override // o.WB
    public final Set d() {
        return l().d();
    }

    @Override // o.WB
    public final Set e() {
        return l().e();
    }

    @Override // o.WB
    public final Set f() {
        return l().f();
    }

    @Override // o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        return l().g(c0827cE, de);
    }

    public final WB h() {
        if (!(l() instanceof C1531mz)) {
            return l();
        }
        WB l = l();
        AbstractC0048Bt.l(l, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((C1531mz) l).h();
    }

    public final Collection i(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        return l().b(c2106vh, interfaceC2114vp);
    }

    public final Collection j(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return l().a(c0827cE, de);
    }

    public final Collection k(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        return l().c(c0827cE, de);
    }

    public final WB l() {
        switch (this.b) {
            case 0:
                return (WB) ((SA) this.c).invoke();
            default:
                return (WB) this.c;
        }
    }

    public C1531mz(OT ot, InterfaceC1455lp interfaceC1455lp) {
        AbstractC0048Bt.n(ot, "storageManager");
        this.c = new SA((VA) ot, new C1139h0(27, interfaceC1455lp));
    }
}
