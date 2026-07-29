package o;

/* renamed from: o.Ea, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107Ea extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC0133Fa j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0107Ea(AbstractC0133Fa abstractC0133Fa, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = abstractC0133Fa;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0107Ea c0107Ea = new C0107Ea(this.j, interfaceC2235xe);
        c0107Ea.i = obj;
        return c0107Ea;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0107Ea) create((InterfaceC2309ym) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC2309ym interfaceC2309ym = (InterfaceC2309ym) this.i;
            this.h = 1;
            Object d = this.j.d(interfaceC2309ym, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (d == enumC0448Re) {
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
