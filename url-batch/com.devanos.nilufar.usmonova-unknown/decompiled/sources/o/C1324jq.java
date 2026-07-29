package o;

/* renamed from: o.jq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1324jq extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ C1456lq i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1324jq(C1456lq c1456lq, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = c1456lq;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C1324jq(this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1324jq) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

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
        C2356zT c2356zT = this.i.b;
        this.h = 1;
        Object a = c2356zT.a(this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        return a == enumC0448Re ? enumC0448Re : a;
    }
}
