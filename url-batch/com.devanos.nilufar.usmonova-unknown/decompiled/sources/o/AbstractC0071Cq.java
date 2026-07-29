package o;

import java.util.Collection;
import java.util.List;

/* renamed from: o.Cq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0071Cq extends XB {
    public static final /* synthetic */ InterfaceC0937dx[] d;
    public final AbstractC1598o b;
    public final SA c;

    static {
        VM vm = UM.a;
        d = new InterfaceC0937dx[]{vm.g(new UJ(vm.b(AbstractC0071Cq.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public AbstractC0071Cq(VA va, AbstractC1598o abstractC1598o) {
        this.b = abstractC1598o;
        this.c = new SA(va, new C1139h0(10, this));
    }

    @Override // o.XB, o.WB
    public final Collection a(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        List list = (List) AbstractC0772bO.o(this.c, d[0]);
        C1564nS c1564nS = new C1564nS();
        for (Object obj : list) {
            if ((obj instanceof HR) && AbstractC0048Bt.h(((HR) obj).getName(), c0827cE)) {
                c1564nS.add(obj);
            }
        }
        return c1564nS;
    }

    @Override // o.XB, o.PN
    public final Collection b(C2106vh c2106vh, InterfaceC2114vp interfaceC2114vp) {
        AbstractC0048Bt.n(c2106vh, "kindFilter");
        if (!c2106vh.a(C2106vh.n.b)) {
            return C1318jk.h;
        }
        return (List) AbstractC0772bO.o(this.c, d[0]);
    }

    @Override // o.XB, o.WB
    public final Collection c(C0827cE c0827cE, DE de) {
        AbstractC0048Bt.n(c0827cE, "name");
        List list = (List) AbstractC0772bO.o(this.c, d[0]);
        C1564nS c1564nS = new C1564nS();
        for (Object obj : list) {
            if ((obj instanceof PJ) && AbstractC0048Bt.h(((PJ) obj).getName(), c0827cE)) {
                c1564nS.add(obj);
            }
        }
        return c1564nS;
    }

    public abstract List h();
}
