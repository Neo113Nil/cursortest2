package o;

/* renamed from: o.Sf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475Sf extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ AbstractC2225xU i;
    public final /* synthetic */ C1643of j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0475Sf(InterfaceC2312yp interfaceC2312yp, C1643of c1643of, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = (AbstractC2225xU) interfaceC2312yp;
        this.j = c1643of;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0475Sf(this.i, this.j, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0475Sf) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return obj;
        }
        AbstractC1494mO.l(obj);
        Object obj2 = this.j.b;
        this.h = 1;
        Object invoke = this.i.invoke(obj2, this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        return invoke == enumC0448Re ? enumC0448Re : invoke;
    }
}
