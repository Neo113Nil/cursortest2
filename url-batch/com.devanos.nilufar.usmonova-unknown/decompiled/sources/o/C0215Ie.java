package o;

/* renamed from: o.Ie, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0215Ie implements InterfaceC2114vp {
    public final /* synthetic */ int h;

    public /* synthetic */ C0215Ie(int i) {
        this.h = i;
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                InterfaceC0137Fe interfaceC0137Fe = (InterfaceC0137Fe) obj;
                if (interfaceC0137Fe instanceof AbstractC0267Ke) {
                    return (AbstractC0267Ke) interfaceC0137Fe;
                }
                return null;
            case 1:
                NQ nq = (NQ) obj;
                AbstractC0048Bt.n(nq, "it");
                return nq.iterator();
            case 2:
                return obj;
            default:
                return Boolean.valueOf(obj == null);
        }
    }
}
