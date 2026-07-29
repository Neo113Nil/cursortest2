package o;

/* loaded from: classes.dex */
public final class QW extends PO {
    public static final QW b = new QW(0);
    public static final QW c = new QW(1);
    public static final QW d = new QW(2);
    public final /* synthetic */ int a;

    public /* synthetic */ QW(int i) {
        this.a = i;
    }

    @Override // o.PO
    public final MR p(RW rw, InterfaceC1266iy interfaceC1266iy) {
        switch (this.a) {
            case 0:
                AbstractC0048Bt.n(rw, "state");
                AbstractC0048Bt.n(interfaceC1266iy, "type");
                return rw.c.b(interfaceC1266iy);
            case 1:
                AbstractC0048Bt.n(rw, "state");
                AbstractC0048Bt.n(interfaceC1266iy, "type");
                throw new UnsupportedOperationException("Should not be called");
            default:
                AbstractC0048Bt.n(rw, "state");
                AbstractC0048Bt.n(interfaceC1266iy, "type");
                return rw.c.j0(interfaceC1266iy);
        }
    }
}
