package o;

/* loaded from: classes.dex */
public final class YL extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ Object h;

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        YL yl = new YL(2, interfaceC2235xe);
        yl.h = obj;
        return yl;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((YL) create((XL) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        return Boolean.valueOf(((XL) this.h) == XL.h);
    }
}
