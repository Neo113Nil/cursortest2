package o;

/* renamed from: o.pe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1708pe extends L implements UL {
    public final /* synthetic */ int i = 0;
    public final C0827cE j;
    public final Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708pe(InterfaceC2072v9 interfaceC2072v9, AbstractC1004ey abstractC1004ey, C0827cE c0827cE) {
        super(abstractC1004ey);
        AbstractC0048Bt.n(interfaceC2072v9, "declarationDescriptor");
        AbstractC0048Bt.n(abstractC1004ey, "receiverType");
        this.k = interfaceC2072v9;
        this.j = c0827cE;
    }

    public final C0827cE F0() {
        switch (this.i) {
        }
        return this.j;
    }

    public final String toString() {
        switch (this.i) {
            case 0:
                return c() + ": Ctx { " + ((InterfaceC1245ib) this.k) + " }";
            default:
                return "Cxt { " + ((InterfaceC2072v9) this.k) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1708pe(InterfaceC1245ib interfaceC1245ib, AbstractC1004ey abstractC1004ey, C0827cE c0827cE) {
        super(abstractC1004ey);
        AbstractC0048Bt.n(abstractC1004ey, "receiverType");
        this.k = interfaceC1245ib;
        this.j = c0827cE;
    }
}
