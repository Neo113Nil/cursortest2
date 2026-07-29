package o;

/* renamed from: o.t6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1937t6 extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ Object h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1937t6(String str, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = str;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C1937t6 c1937t6 = new C1937t6(this.i, interfaceC2235xe);
        c1937t6.h = obj;
        return c1937t6;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C1937t6 c1937t6 = (C1937t6) create((ID) obj, (InterfaceC2235xe) obj2);
        C0782bY c0782bY = C0782bY.a;
        c1937t6.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        ID id = (ID) this.h;
        AbstractC1494mO.l(obj);
        id.getClass();
        YI yi = C2069v6.b;
        AbstractC0048Bt.n(yi, "key");
        id.d(yi, this.i);
        return C0782bY.a;
    }
}
