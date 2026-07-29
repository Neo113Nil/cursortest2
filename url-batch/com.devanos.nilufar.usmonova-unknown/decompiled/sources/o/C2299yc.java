package o;

/* renamed from: o.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2299yc extends C0283Ku implements InterfaceC2233xc {
    public final Object a0(AbstractC2225xU abstractC2225xU) {
        Object obj;
        do {
            obj = C0283Ku.h.get(this);
            if (!(obj instanceof InterfaceC2249xs)) {
                if (obj instanceof C0031Bc) {
                    throw ((C0031Bc) obj).a;
                }
                return EB.Y(obj);
            }
        } while (W(obj) < 0);
        C0205Hu c0205Hu = new C0205Hu(AbstractC1473m3.L(abstractC2225xU), this);
        c0205Hu.r();
        c0205Hu.u(new Y9(2, PX.b0(this, true, new C0374Oi(2, c0205Hu))));
        return c0205Hu.q();
    }
}
