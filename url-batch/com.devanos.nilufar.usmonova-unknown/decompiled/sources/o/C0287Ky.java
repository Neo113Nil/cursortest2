package o;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.Ky, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287Ky extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0312Ly i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0287Ky(C0312Ly c0312Ly, int i) {
        super(0);
        this.h = i;
        this.i = c0312Ly;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                C0312Ly c0312Ly = this.i;
                ArrayList b = c0312Ly.b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    InterfaceC0411Pt interfaceC0411Pt = (InterfaceC0411Pt) it.next();
                    C0827cE c0827cE = ((AbstractC1624oM) interfaceC0411Pt).a;
                    if (c0827cE == null) {
                        c0827cE = AbstractC0438Qu.b;
                    }
                    AbstractC0551Vd a = c0312Ly.a(interfaceC0411Pt);
                    C1619oH c1619oH = a != null ? new C1619oH(c0827cE, a) : null;
                    if (c1619oH != null) {
                        arrayList.add(c1619oH);
                    }
                }
                return EB.V(arrayList);
            case 1:
                return AbstractC1492mM.a(AbstractC1473m3.D(AbstractC1473m3.B(this.i.b.a))).b();
            default:
                C0312Ly c0312Ly2 = this.i;
                C2245xo e = c0312Ly2.e();
                C1558nM c1558nM = c0312Ly2.b;
                C1216i8 c1216i8 = c0312Ly2.a;
                if (e == null) {
                    return C0273Kk.c(EnumC0247Jk.L, c1558nM.toString());
                }
                C1198hu c1198hu = (C1198hu) c1216i8.i;
                C1198hu c1198hu2 = (C1198hu) c1216i8.i;
                InterfaceC1245ib o2 = HO.o(e, c1198hu.f177o.l());
                if (o2 == null) {
                    C2217xM c2217xM = new C2217xM(AbstractC1473m3.D(AbstractC1473m3.B(c1558nM.a)));
                    C1818rJ c1818rJ = c1198hu2.k;
                    c1818rJ.getClass();
                    C1590ns c1590ns = (C1590ns) c1818rJ.i;
                    if (c1590ns == null) {
                        AbstractC0048Bt.i0("resolver");
                        throw null;
                    }
                    o2 = c1590ns.q(c2217xM);
                    if (o2 == null) {
                        o2 = AbstractC1052fg.q(c1198hu2.f177o, C1639ob.j(e), c1198hu2.d.c().l);
                    }
                }
                return o2.i();
        }
    }
}
