package o;

import java.util.List;

/* loaded from: classes.dex */
public class O6 extends AbstractC0551Vd {
    public final AbstractC1596ny b;

    /* JADX WARN: Multi-variable type inference failed */
    public O6(List list, InterfaceC2114vp interfaceC2114vp) {
        super(list);
        this.b = (AbstractC1596ny) interfaceC2114vp;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.ny, o.vp] */
    @Override // o.AbstractC0551Vd
    public final AbstractC1004ey a(InterfaceC0761bD interfaceC0761bD) {
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        AbstractC1004ey abstractC1004ey = (AbstractC1004ey) this.b.invoke(interfaceC0761bD);
        if (!AbstractC0545Ux.y(abstractC1004ey)) {
            InterfaceC2364zb c = abstractC1004ey.B0().c();
            if (c != null && AbstractC0545Ux.r(c) != null) {
                return abstractC1004ey;
            }
            if (!AbstractC0545Ux.B(abstractC1004ey, AbstractC1433lT.V.i()) && !AbstractC0545Ux.B(abstractC1004ey, AbstractC1433lT.W.i()) && !AbstractC0545Ux.B(abstractC1004ey, AbstractC1433lT.X.i())) {
                AbstractC0545Ux.B(abstractC1004ey, AbstractC1433lT.Y.i());
            }
        }
        return abstractC1004ey;
    }
}
