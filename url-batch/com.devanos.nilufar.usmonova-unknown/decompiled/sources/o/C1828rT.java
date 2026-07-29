package o;

/* renamed from: o.rT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1828rT extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ Object h;

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C1828rT c1828rT = new C1828rT(2, interfaceC2235xe);
        c1828rT.h = obj;
        return c1828rT;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1828rT) create((EnumC1431lR) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        return Boolean.valueOf(((EnumC1431lR) this.h) != EnumC1431lR.h);
    }
}
