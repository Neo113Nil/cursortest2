package o;

/* renamed from: o.Qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0418Qa extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ LQ j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0418Qa(LQ lq, Object obj, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = lq;
        this.k = obj;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0418Qa c0418Qa = new C0418Qa(this.j, this.k, interfaceC2235xe);
        c0418Qa.i = obj;
        return c0418Qa;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0418Qa) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        Object d;
        int i = this.h;
        Object obj2 = C0782bY.a;
        try {
            if (i == 0) {
                AbstractC1494mO.l(obj);
                LQ lq = this.j;
                Object obj3 = this.k;
                this.h = 1;
                Object d2 = lq.d(obj3, this);
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                if (d2 == enumC0448Re) {
                    return enumC0448Re;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1494mO.l(obj);
            }
            d = obj2;
        } catch (Throwable th) {
            d = AbstractC1494mO.d(th);
        }
        if (d instanceof C1362kO) {
            obj2 = new C0314Ma(C1428lO.a(d));
        }
        return new C0366Oa(obj2);
    }
}
