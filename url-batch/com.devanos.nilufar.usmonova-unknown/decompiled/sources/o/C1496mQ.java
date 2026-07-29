package o;

/* renamed from: o.mQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496mQ extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ InterfaceC2114vp i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1496mQ(InterfaceC2114vp interfaceC2114vp, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = interfaceC2114vp;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C1496mQ(this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1496mQ) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            this.h = 1;
            Object D = PX.D(16L, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (D == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
        }
        return this.i.invoke(new Long(System.nanoTime()));
    }
}
