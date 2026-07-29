package o;

/* loaded from: classes.dex */
public final class ZL extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0835cM j;
    public final /* synthetic */ InterfaceC0957eD k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZL(C0835cM c0835cM, InterfaceC0957eD interfaceC0957eD, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = c0835cM;
        this.k = interfaceC0957eD;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        ZL zl = new ZL(this.j, this.k, interfaceC2235xe);
        zl.i = obj;
        return zl;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((ZL) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return C0782bY.a;
        }
        AbstractC1494mO.l(obj);
        InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.i;
        this.h = 1;
        this.j.e(interfaceC0422Qe, this.k, this);
        return EnumC0448Re.h;
    }
}
