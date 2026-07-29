package o;

/* loaded from: classes.dex */
public final class P10 extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ S10 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P10(S10 s10, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = s10;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new P10(this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((P10) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        C0782bY c0782bY = C0782bY.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return c0782bY;
        }
        AbstractC1494mO.l(obj);
        S2 s2 = this.i.h;
        this.h = 1;
        Object f = s2.t.f(this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (f != enumC0448Re) {
            f = c0782bY;
        }
        return f == enumC0448Re ? enumC0448Re : c0782bY;
    }
}
