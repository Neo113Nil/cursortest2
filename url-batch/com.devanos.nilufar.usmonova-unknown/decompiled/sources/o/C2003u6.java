package o;

/* renamed from: o.u6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2003u6 extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ Object h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2003u6(String str, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = str;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C2003u6 c2003u6 = new C2003u6(this.i, interfaceC2235xe);
        c2003u6.h = obj;
        return c2003u6;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C2003u6 c2003u6 = (C2003u6) create((ID) obj, (InterfaceC2235xe) obj2);
        C0782bY c0782bY = C0782bY.a;
        c2003u6.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        ID id = (ID) this.h;
        AbstractC1494mO.l(obj);
        YI yi = C2069v6.f;
        String str = this.i;
        if (str == null || UT.J(str)) {
            id.getClass();
            AbstractC0048Bt.n(yi, "key");
            id.b();
            id.a.remove(yi);
        } else {
            id.getClass();
            AbstractC0048Bt.n(yi, "key");
            id.d(yi, str);
        }
        return C0782bY.a;
    }
}
