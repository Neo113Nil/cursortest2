package o;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class KT extends XB {
    public static final /* synthetic */ InterfaceC0937dx[] e;
    public final C0581Wh b;
    public final SA c;
    public final SA d;

    static {
        VM vm = UM.a;
        e = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(KT.class), "functions", "getFunctions()Ljava/util/List;")), vm.g(new UJ(vm.b(KT.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public KT(VA va, C0581Wh c0581Wh) {
        AbstractC0048Bt.n(va, "storageManager");
        this.b = c0581Wh;
        this.c = new SA(va, new JT(this, 0));
        this.d = new SA(va, new JT(this, 1));
    }

    @Override // o.XB, o.WB
    public final Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        List list = (List) AbstractC0772bO.o(this.c, e[0]);
        C1564nS c1564nS = new C1564nS();
        for (Object obj : list) {
            if (AbstractC0048Bt.h(((HR) obj).getName(), c0827cE)) {
                c1564nS.add(obj);
            }
        }
        return c1564nS;
    }

    @Override // o.XB, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        InterfaceC0937dx[] interfaceC0937dxArr = e;
        return AbstractC0720ac.A0((List) AbstractC0772bO.o(this.c, interfaceC0937dxArr[0]), (List) AbstractC0772bO.o(this.d, interfaceC0937dxArr[1]));
    }

    @Override // o.XB, o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        List list = (List) AbstractC0772bO.o(this.d, e[1]);
        C1564nS c1564nS = new C1564nS();
        for (Object obj : list) {
            if (AbstractC0048Bt.h(((PJ) obj).getName(), c0827cE)) {
                c1564nS.add(obj);
            }
        }
        return c1564nS;
    }

    @Override // o.XB, o.PN
    public final InterfaceC2364zb g(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        AbstractC0048Bt.n(de, "location");
        return null;
    }
}
