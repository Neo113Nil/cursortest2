package o;

/* renamed from: o.ew, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1002ew extends AbstractC0551Vd {
    public C1002ew(C1639ob c1639ob, int i) {
        super(new C0871cw(new C1705pb(c1639ob, i)));
    }

    @Override // o.AbstractC0551Vd
    public final AbstractC1004ey a(InterfaceC0761bD interfaceC0761bD) {
        AbstractC1004ey abstractC1004ey;
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        OW.i.getClass();
        OW ow = OW.j;
        AbstractC0545Ux l = interfaceC0761bD.l();
        l.getClass();
        InterfaceC1245ib i = l.i(AbstractC1433lT.P.g());
        Object obj = this.a;
        AbstractC0936dw abstractC0936dw = (AbstractC0936dw) obj;
        if (abstractC0936dw instanceof C0806bw) {
            abstractC1004ey = ((C0806bw) obj).a;
        } else {
            if (!(abstractC0936dw instanceof C0871cw)) {
                throw new C0057Cc();
            }
            C1705pb c1705pb = ((C0871cw) obj).a;
            C1639ob c1639ob = c1705pb.a;
            int i2 = c1705pb.b;
            InterfaceC1245ib o2 = AbstractC1052fg.o(interfaceC0761bD, c1639ob);
            if (o2 == null) {
                String c1639ob2 = c1639ob.toString();
                AbstractC0048Bt.m(c1639ob2, "classId.toString()");
                abstractC1004ey = C0273Kk.c(EnumC0247Jk.k, c1639ob2, String.valueOf(i2));
            } else {
                JR i3 = o2.i();
                AbstractC0048Bt.m(i3, "descriptor.defaultType");
                AbstractC2097vY w = AbstractC0772bO.w(i3);
                for (int i4 = 0; i4 < i2; i4++) {
                    w = interfaceC0761bD.l().h(w);
                }
                abstractC1004ey = w;
            }
        }
        return HO.q(ow, i, AbstractC0868ct.J(new C1767qX(abstractC1004ey)));
    }
}
