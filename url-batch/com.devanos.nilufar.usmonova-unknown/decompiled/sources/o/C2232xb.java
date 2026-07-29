package o;

/* renamed from: o.xb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2232xb extends PO {
    public final /* synthetic */ InterfaceC2298yb a;
    public final /* synthetic */ C2096vX b;

    public C2232xb(InterfaceC2298yb interfaceC2298yb, C2096vX c2096vX) {
        this.a = interfaceC2298yb;
        this.b = c2096vX;
    }

    @Override // o.PO
    public final MR p(RW rw, InterfaceC1266iy interfaceC1266iy) {
        AbstractC0048Bt.n(rw, "state");
        AbstractC0048Bt.n(interfaceC1266iy, "type");
        InterfaceC2298yb interfaceC2298yb = this.a;
        JR h0 = interfaceC2298yb.h0(this.b.g(1, interfaceC2298yb.b(interfaceC1266iy)));
        AbstractC0048Bt.k(h0);
        return h0;
    }
}
