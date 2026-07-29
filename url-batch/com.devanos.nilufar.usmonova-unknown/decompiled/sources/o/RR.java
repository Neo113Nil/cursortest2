package o;

/* loaded from: classes.dex */
public final class RR extends AbstractC2225xU implements InterfaceC2312yp {
    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new RR(2, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        RR rr = (RR) create((InterfaceC2309ym) obj, (InterfaceC2235xe) obj2);
        C0782bY c0782bY = C0782bY.a;
        rr.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        return C0782bY.a;
    }
}
