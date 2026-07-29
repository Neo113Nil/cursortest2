package o;

/* renamed from: o.Ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185Ha extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ C0289La i;
    public final /* synthetic */ InterfaceC2309ym j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0185Ha(C0289La c0289La, InterfaceC2309ym interfaceC2309ym, Object obj, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = c0289La;
        this.j = interfaceC2309ym;
        this.k = obj;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0185Ha(this.i, this.j, this.k, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0185Ha) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [o.xU, o.zp] */
    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            ?? r3 = this.i.l;
            this.h = 1;
            Object e = r3.e(this.j, this.k, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (e == enumC0448Re) {
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
