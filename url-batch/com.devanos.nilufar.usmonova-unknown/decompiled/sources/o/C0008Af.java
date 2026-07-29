package o;

/* renamed from: o.Af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0008Af extends AbstractC2225xU implements InterfaceC2378zp {
    public final /* synthetic */ C0908dT h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0008Af(C0908dT c0908dT, InterfaceC2235xe interfaceC2235xe) {
        super(3, interfaceC2235xe);
        this.h = c0908dT;
    }

    @Override // o.InterfaceC2378zp
    public final Object e(Object obj, Object obj2, Object obj3) {
        C0008Af c0008Af = new C0008Af(this.h, (InterfaceC2235xe) obj3);
        C0782bY c0782bY = C0782bY.a;
        c0008Af.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        this.h.c(null);
        return C0782bY.a;
    }
}
