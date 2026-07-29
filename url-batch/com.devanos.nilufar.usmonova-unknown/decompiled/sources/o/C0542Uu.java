package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.Uu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542Uu extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0826cD i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0542Uu(C0826cD c0826cD, int i) {
        super(0);
        this.h = i;
        this.i = c0826cD;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                return new C0516Tu(this.i);
            case 1:
                C0826cD c0826cD = this.i;
                C0695aD c0695aD = c0826cD.n;
                if (c0695aD == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = c0826cD.getName().h;
                    AbstractC0048Bt.m(str, "name.toString()");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                List list = c0695aD.a;
                c0826cD.G0();
                list.contains(c0826cD);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C0826cD) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC1159hH interfaceC1159hH = ((C0826cD) it2.next()).f145o;
                    AbstractC0048Bt.k(interfaceC1159hH);
                    arrayList.add(interfaceC1159hH);
                }
                return new C1707pd("CompositeProvider@ModuleDescriptor for " + c0826cD.getName(), arrayList);
            default:
                return ((C1465lz) this.i.S(AbstractC1499mT.h)).n;
        }
    }
}
