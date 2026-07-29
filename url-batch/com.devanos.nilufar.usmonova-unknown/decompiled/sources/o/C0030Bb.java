package o;

import java.util.ArrayList;

/* renamed from: o.Bb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0030Bb implements InterfaceC0056Cb {
    public static final C0030Bb b = new C0030Bb(0);
    public static final C0030Bb c = new C0030Bb(1);
    public static final C0030Bb d = new C0030Bb(2);
    public final /* synthetic */ int a;

    public /* synthetic */ C0030Bb(int i) {
        this.a = i;
    }

    public static String b(InterfaceC2364zb interfaceC2364zb) {
        String str;
        C0827cE name = interfaceC2364zb.getName();
        AbstractC0048Bt.m(name, "descriptor.name");
        String l = DY.l(name);
        if (!(interfaceC2364zb instanceof InterfaceC1437lX)) {
            InterfaceC1118gg n = interfaceC2364zb.n();
            AbstractC0048Bt.m(n, "descriptor.containingDeclaration");
            if (n instanceof InterfaceC1245ib) {
                str = b((InterfaceC2364zb) n);
            } else if (n instanceof InterfaceC0961eH) {
                C2377zo i = ((AbstractC1027fH) ((InterfaceC0961eH) n)).l.i();
                AbstractC0048Bt.m(i, "descriptor.fqName.toUnsafe()");
                str = DY.m(i.e());
            } else {
                str = null;
            }
            if (str != null && !str.equals("")) {
                return str + '.' + l;
            }
        }
        return l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o.gg, o.zb] */
    /* JADX WARN: Type inference failed for: r2v8, types: [o.gg] */
    /* JADX WARN: Type inference failed for: r2v9, types: [o.gg] */
    @Override // o.InterfaceC0056Cb
    public final String a(InterfaceC2364zb interfaceC2364zb, C2304yh c2304yh) {
        switch (this.a) {
            case 0:
                if (interfaceC2364zb instanceof InterfaceC1437lX) {
                    C0827cE name = ((InterfaceC1437lX) interfaceC2364zb).getName();
                    AbstractC0048Bt.m(name, "classifier.name");
                    return c2304yh.O(name, false);
                }
                C2377zo g = AbstractC0114Eh.g(interfaceC2364zb);
                AbstractC0048Bt.m(g, "getFqName(classifier)");
                return c2304yh.o(DY.m(g.e()));
            case 1:
                if (interfaceC2364zb instanceof InterfaceC1437lX) {
                    C0827cE name2 = ((InterfaceC1437lX) interfaceC2364zb).getName();
                    AbstractC0048Bt.m(name2, "classifier.name");
                    return c2304yh.O(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC2364zb.getName());
                    interfaceC2364zb = interfaceC2364zb.n();
                } while (interfaceC2364zb instanceof InterfaceC1245ib);
                return DY.m(new C1955tO(arrayList));
            default:
                return b(interfaceC2364zb);
        }
    }
}
