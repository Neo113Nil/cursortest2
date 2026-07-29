package o;

/* renamed from: o.Am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015Am extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ InterfaceC2243xm i;
    public final /* synthetic */ C2082vJ j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0015Am(InterfaceC2243xm interfaceC2243xm, C2082vJ c2082vJ, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = interfaceC2243xm;
        this.j = c2082vJ;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0015Am(this.i, this.j, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0015Am) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            C2375zm c2375zm = new C2375zm(this.j, 1);
            this.h = 1;
            Object collect = this.i.collect(c2375zm, this);
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
