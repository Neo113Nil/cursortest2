package o;

/* renamed from: o.Wf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0579Wf extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0657Zf j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0579Wf(C0657Zf c0657Zf, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = c0657Zf;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0579Wf c0579Wf = new C0579Wf(this.j, interfaceC2235xe);
        c0579Wf.i = obj;
        return c0579Wf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0579Wf) create((BC) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            BC bc = (BC) this.i;
            this.h = 1;
            Object a = C0657Zf.a(this.j, bc, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (a == enumC0448Re) {
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
