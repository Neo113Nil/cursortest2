package o;

/* renamed from: o.Es, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125Es extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ float h;

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0125Es c0125Es = new C0125Es(2, interfaceC2235xe);
        c0125Es.h = ((Number) obj).floatValue();
        return c0125Es;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0125Es) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        return Boolean.valueOf(this.h > 0.0f);
    }
}
