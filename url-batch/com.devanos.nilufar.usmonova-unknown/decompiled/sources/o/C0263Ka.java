package o;

/* renamed from: o.Ka, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0263Ka extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0289La j;
    public final /* synthetic */ InterfaceC2309ym k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0263Ka(C0289La c0289La, InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = c0289La;
        this.k = interfaceC2309ym;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0263Ka c0263Ka = new C0263Ka(this.j, this.k, interfaceC2235xe);
        c0263Ka.i = obj;
        return c0263Ka;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0263Ka) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.i;
            C1360kM c1360kM = new C1360kM();
            C0289La c0289La = this.j;
            InterfaceC2243xm interfaceC2243xm = c0289La.k;
            C0237Ja c0237Ja = new C0237Ja(c1360kM, interfaceC0422Qe, c0289La, this.k);
            this.h = 1;
            Object collect = interfaceC2243xm.collect(c0237Ja, this);
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
