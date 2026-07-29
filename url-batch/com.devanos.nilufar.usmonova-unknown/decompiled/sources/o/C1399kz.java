package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.kz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1399kz extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C1465lz i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1399kz(C1465lz c1465lz, int i) {
        super(0);
        this.h = i;
        this.i = c1465lz;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                C1465lz c1465lz = this.i;
                C0826cD c0826cD = c1465lz.j;
                c0826cD.G0();
                return Boolean.valueOf(EB.z((C1707pd) c0826cD.r.getValue(), c1465lz.k));
            case 1:
                C1465lz c1465lz2 = this.i;
                C0826cD c0826cD2 = c1465lz2.j;
                c0826cD2.G0();
                return EB.J((C1707pd) c0826cD2.r.getValue(), c1465lz2.k);
            default:
                C1465lz c1465lz3 = this.i;
                SA sa = c1465lz3.m;
                InterfaceC0937dx[] interfaceC0937dxArr = C1465lz.f196o;
                boolean booleanValue = ((Boolean) AbstractC0772bO.o(sa, interfaceC0937dxArr[1])).booleanValue();
                C2245xo c2245xo = c1465lz3.k;
                C0826cD c0826cD3 = c1465lz3.j;
                if (booleanValue) {
                    return VB.b;
                }
                List list = (List) AbstractC0772bO.o(c1465lz3.l, interfaceC0937dxArr[0]);
                ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((InterfaceC0961eH) it.next()).r0());
                }
                return AbstractC0946e20.o("package view scope for " + c2245xo + " in " + c0826cD3.getName(), AbstractC0720ac.B0(arrayList, new C0974eU(c0826cD3, c2245xo)));
        }
    }
}
