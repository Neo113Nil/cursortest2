package o;

/* renamed from: o.Rm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456Rm extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ int h;

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0456Rm c0456Rm = new C0456Rm(2, interfaceC2235xe);
        c0456Rm.h = ((Number) obj).intValue();
        return c0456Rm;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0456Rm) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        return Boolean.valueOf(this.h > 0);
    }
}
