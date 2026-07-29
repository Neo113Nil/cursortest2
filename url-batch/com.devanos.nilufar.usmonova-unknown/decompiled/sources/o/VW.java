package o;

/* loaded from: classes.dex */
public final class VW extends AbstractC1596ny implements InterfaceC2114vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ XW i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VW(XW xw, int i) {
        super(1);
        this.h = i;
        this.i = xw;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                int intValue = ((Number) obj).intValue();
                C0321Mh c0321Mh = this.i.a;
                InterfaceC0893dE interfaceC0893dE = c0321Mh.b;
                C0296Lh c0296Lh = c0321Mh.a;
                C1639ob x = AbstractC1052fg.x(interfaceC0893dE, intValue);
                return x.c ? c0296Lh.b(x) : AbstractC1052fg.p(c0296Lh.b, x);
            case 1:
                int intValue2 = ((Number) obj).intValue();
                C0321Mh c0321Mh2 = this.i.a;
                C1639ob x2 = AbstractC1052fg.x(c0321Mh2.b, intValue2);
                if (!x2.c) {
                    InterfaceC0761bD interfaceC0761bD = c0321Mh2.a.b;
                    AbstractC0048Bt.n(interfaceC0761bD, "<this>");
                    InterfaceC2364zb p = AbstractC1052fg.p(interfaceC0761bD, x2);
                    if (p instanceof C1316ji) {
                        return (C1316ji) p;
                    }
                }
                return null;
            default:
                MK mk = (MK) obj;
                AbstractC0048Bt.n(mk, "it");
                return AbstractC0946e20.C(mk, this.i.a.d);
        }
    }
}
