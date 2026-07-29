package o;

/* renamed from: o.tN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954tN extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ InterfaceC2312yp j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1954tN(InterfaceC2312yp interfaceC2312yp, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = interfaceC2312yp;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C1954tN c1954tN = new C1954tN(this.j, interfaceC2235xe);
        c1954tN.i = obj;
        return c1954tN;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1954tN) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.i;
            this.h = 1;
            Object invoke = this.j.invoke(interfaceC0422Qe, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (invoke == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
        }
        return C0782bY.a;
    }
}
