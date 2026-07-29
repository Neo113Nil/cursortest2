package o;

/* loaded from: classes.dex */
public final class VI extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC2225xU j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VI(InterfaceC2312yp interfaceC2312yp, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = (AbstractC2225xU) interfaceC2312yp;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        VI vi = new VI(this.j, interfaceC2235xe);
        vi.i = obj;
        return vi;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((VI) create((ID) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            ID id = (ID) this.i;
            this.h = 1;
            obj = this.j.invoke(id, this);
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (obj == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
        }
        ID id2 = (ID) obj;
        AbstractC0048Bt.l(id2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        id2.b.a.set(true);
        return id2;
    }
}
