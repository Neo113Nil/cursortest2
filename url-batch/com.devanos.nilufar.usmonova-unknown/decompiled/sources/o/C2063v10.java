package o;

/* renamed from: o.v10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2063v10 extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ CT i;
    public final /* synthetic */ C1023fD j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2063v10(CT ct, C1023fD c1023fD, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = ct;
        this.j = c1023fD;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C2063v10(this.i, this.j, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        ((C2063v10) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
        return EnumC0448Re.h;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            D9 d9 = new D9(4, this.j);
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
        throw new C0057Cc();
    }
}
