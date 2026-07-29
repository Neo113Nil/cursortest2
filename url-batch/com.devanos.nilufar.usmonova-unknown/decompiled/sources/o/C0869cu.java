package o;

import java.util.ArrayList;

/* renamed from: o.cu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0869cu implements InterfaceC2308yl {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (o.WS.j.contains(r1) == false) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC2308yl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(InterfaceC2072v9 interfaceC2072v9, InterfaceC2072v9 interfaceC2072v92, InterfaceC1245ib interfaceC1245ib) {
        AbstractC0048Bt.n(interfaceC2072v9, "superDescriptor");
        AbstractC0048Bt.n(interfaceC2072v92, "subDescriptor");
        if ((interfaceC2072v9 instanceof InterfaceC2204x9) && (interfaceC2072v92 instanceof InterfaceC0381Op) && !AbstractC0545Ux.z(interfaceC2072v92)) {
            int i = C0691a9.l;
            InterfaceC0381Op interfaceC0381Op = (InterfaceC0381Op) interfaceC2072v92;
            AbstractC1184hg abstractC1184hg = (AbstractC1184hg) interfaceC0381Op;
            C0827cE name = abstractC1184hg.getName();
            AbstractC0048Bt.m(name, "subDescriptor.name");
            if (!C0691a9.b(name)) {
                ArrayList arrayList = WS.a;
                C0827cE name2 = abstractC1184hg.getName();
                AbstractC0048Bt.m(name2, "subDescriptor.name");
            }
            InterfaceC2204x9 g = AbstractC1035fP.g((InterfaceC2204x9) interfaceC2072v9);
            boolean z = interfaceC2072v9 instanceof InterfaceC0381Op;
            InterfaceC0381Op interfaceC0381Op2 = z ? (InterfaceC0381Op) interfaceC2072v9 : null;
            if ((interfaceC0381Op2 == null || interfaceC0381Op.b0() != interfaceC0381Op2.b0()) && (g == null || !interfaceC0381Op.b0())) {
                return 3;
            }
            if ((interfaceC1245ib instanceof InterfaceC0593Wt) && interfaceC0381Op.v() == null && g != null && !AbstractC1035fP.h(interfaceC1245ib, g)) {
                if (!(g instanceof InterfaceC0381Op) || !z || C0691a9.a((InterfaceC0381Op) g) == null) {
                    return 3;
                }
                String y = PX.y(interfaceC0381Op, 2);
                InterfaceC0381Op a = ((InterfaceC0381Op) interfaceC2072v9).a();
                AbstractC0048Bt.m(a, "superDescriptor.original");
                if (!y.equals(PX.y(a, 2))) {
                    return 3;
                }
            }
        }
        return EB.n(interfaceC2072v9, interfaceC2072v92) ? 3 : 4;
    }

    @Override // o.InterfaceC2308yl
    public final int b() {
        return 1;
    }
}
