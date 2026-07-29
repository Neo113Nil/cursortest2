package o;

/* renamed from: o.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1740q6 extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ Object h;

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C1740q6 c1740q6 = new C1740q6(2, interfaceC2235xe);
        c1740q6.h = obj;
        return c1740q6;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C1740q6 c1740q6 = (C1740q6) create((ID) obj, (InterfaceC2235xe) obj2);
        C0782bY c0782bY = C0782bY.a;
        c1740q6.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        ID id = (ID) this.h;
        AbstractC1494mO.l(obj);
        Boolean bool = Boolean.TRUE;
        id.getClass();
        YI yi = C2069v6.d;
        AbstractC0048Bt.n(yi, "key");
        id.d(yi, bool);
        return C0782bY.a;
    }
}
