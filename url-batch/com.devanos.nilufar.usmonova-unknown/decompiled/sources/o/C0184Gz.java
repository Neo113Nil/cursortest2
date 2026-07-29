package o;

/* renamed from: o.Gz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184Gz extends AbstractC2225xU implements InterfaceC2312yp {
    public /* synthetic */ Object h;
    public final /* synthetic */ C0210Hz i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184Gz(C0210Hz c0210Hz, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = c0210Hz;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0184Gz c0184Gz = new C0184Gz(this.i, interfaceC2235xe);
        c0184Gz.h = obj;
        return c0184Gz;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        C0184Gz c0184Gz = (C0184Gz) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2);
        C0782bY c0782bY = C0782bY.a;
        c0184Gz.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        AbstractC1494mO.l(obj);
        InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.h;
        C0210Hz c0210Hz = this.i;
        AbstractC0106Dz abstractC0106Dz = c0210Hz.h;
        if (((C0417Pz) abstractC0106Dz).d.compareTo(EnumC0080Cz.i) >= 0) {
            abstractC0106Dz.a(c0210Hz);
        } else {
            PX.s(interfaceC0422Qe.m(), null);
        }
        return C0782bY.a;
    }
}
