package o;

/* renamed from: o.Ba, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029Ba extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC0055Ca j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0029Ba(AbstractC0055Ca abstractC0055Ca, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = abstractC0055Ca;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0029Ba c0029Ba = new C0029Ba(this.j, interfaceC2235xe);
        c0029Ba.i = obj;
        return c0029Ba;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0029Ba) create((InterfaceC2214xJ) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC2214xJ interfaceC2214xJ = (InterfaceC2214xJ) this.i;
            this.h = 1;
            Object a = this.j.a(interfaceC2214xJ, this);
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
