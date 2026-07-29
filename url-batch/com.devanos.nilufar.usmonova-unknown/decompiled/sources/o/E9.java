package o;

/* loaded from: classes.dex */
public final class E9 extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ InterfaceC2243xm i;
    public final /* synthetic */ InterfaceC0655Zd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E9(InterfaceC2243xm interfaceC2243xm, InterfaceC0655Zd interfaceC0655Zd, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = interfaceC2243xm;
        this.j = interfaceC0655Zd;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new E9(this.i, this.j, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((E9) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            D9 d9 = new D9(0, this.j);
            this.h = 1;
            Object collect = this.i.collect(d9, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (collect == enumC0448Re) {
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
