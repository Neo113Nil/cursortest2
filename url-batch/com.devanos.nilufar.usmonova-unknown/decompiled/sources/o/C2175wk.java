package o;

/* renamed from: o.wk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2175wk extends AbstractC0551Vd {
    public final C1639ob b;
    public final C0827cE c;

    public C2175wk(C1639ob c1639ob, C0827cE c0827cE) {
        super(new C1619oH(c1639ob, c0827cE));
        this.b = c1639ob;
        this.c = c0827cE;
    }

    @Override // o.AbstractC0551Vd
    public final AbstractC1004ey a(InterfaceC0761bD interfaceC0761bD) {
        AbstractC0048Bt.n(interfaceC0761bD, "module");
        C1639ob c1639ob = this.b;
        InterfaceC1245ib o2 = AbstractC1052fg.o(interfaceC0761bD, c1639ob);
        JR jr = null;
        if (o2 != null) {
            if (!AbstractC0114Eh.n(o2, 3)) {
                o2 = null;
            }
            if (o2 != null) {
                jr = o2.i();
            }
        }
        if (jr != null) {
            return jr;
        }
        String c1639ob2 = c1639ob.toString();
        AbstractC0048Bt.m(c1639ob2, "enumClassId.toString()");
        String str = this.c.h;
        AbstractC0048Bt.m(str, "enumEntryName.toString()");
        return C0273Kk.c(EnumC0247Jk.H, c1639ob2, str);
    }

    @Override // o.AbstractC0551Vd
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.i());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
