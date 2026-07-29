package o;

/* renamed from: o.rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1840rf extends AbstractC2225xU implements InterfaceC2114vp {
    public int h;

    @Override // o.Y7
    public final InterfaceC2235xe create(InterfaceC2235xe interfaceC2235xe) {
        return new C1840rf(1, interfaceC2235xe);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        C1840rf c1840rf = (C1840rf) create((InterfaceC2235xe) obj);
        C0782bY c0782bY = C0782bY.a;
        c1840rf.invokeSuspend(c0782bY);
        return c0782bY;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            this.h = 1;
            throw null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC1494mO.l(obj);
        return C0782bY.a;
    }
}
