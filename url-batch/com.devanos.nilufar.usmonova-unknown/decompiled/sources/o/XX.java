package o;

/* loaded from: classes.dex */
public final class XX extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ InterfaceC2309ym j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XX(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = interfaceC2309ym;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        XX xx = new XX(this.j, interfaceC2235xe);
        xx.i = obj;
        return xx;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((XX) create(obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            Object obj2 = this.i;
            this.h = 1;
            Object emit = this.j.emit(obj2, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (emit == enumC0448Re) {
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
