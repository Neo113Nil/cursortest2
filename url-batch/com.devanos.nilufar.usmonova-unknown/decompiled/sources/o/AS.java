package o;

/* loaded from: classes.dex */
public final class AS extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ InterfaceC2312yp j;
    public final /* synthetic */ TD k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AS(InterfaceC2312yp interfaceC2312yp, TD td, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = interfaceC2312yp;
        this.k = td;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        AS as = new AS(this.j, this.k, interfaceC2235xe);
        as.i = obj;
        return as;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((AS) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            C2082vJ c2082vJ = new C2082vJ(this.k, ((InterfaceC0422Qe) this.i).m());
            this.h = 1;
            Object invoke = this.j.invoke(c2082vJ, this);
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
