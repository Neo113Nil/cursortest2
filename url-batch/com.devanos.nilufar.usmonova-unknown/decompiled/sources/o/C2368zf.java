package o;

/* renamed from: o.zf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2368zf extends AbstractC2225xU implements InterfaceC2312yp {
    public final /* synthetic */ C0908dT h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2368zf(C0908dT c0908dT, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.h = c0908dT;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C2368zf(this.h, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C2368zf c2368zf = (C2368zf) create((InterfaceC2309ym) obj, (InterfaceC2235xe) obj2);
        C0782bY c0782bY = C0782bY.a;
        c2368zf.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        this.h.start();
        return C0782bY.a;
    }
}
