package o;

/* renamed from: o.Gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164Gf extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ Object h;

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0164Gf c0164Gf = new C0164Gf(2, interfaceC2235xe);
        c0164Gf.h = obj;
        return c0164Gf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0164Gf) create((AT) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        return Boolean.valueOf(!(((AT) this.h) instanceof C0796bm));
    }
}
