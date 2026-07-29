package o;

/* renamed from: o.aJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0701aJ extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ AbstractC2225xU j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0701aJ(InterfaceC2312yp interfaceC2312yp, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = (AbstractC2225xU) interfaceC2312yp;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0701aJ c0701aJ = new C0701aJ(this.j, interfaceC2235xe);
        c0701aJ.i = obj;
        return c0701aJ;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0701aJ) create((ID) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ID id = (ID) this.i;
            AbstractC1494mO.l(obj);
            return id;
        }
        AbstractC1494mO.l(obj);
        ID id2 = new ID(EB.X(((ID) this.i).a()), false);
        this.i = id2;
        this.h = 1;
        Object invoke = this.j.invoke(id2, this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        return invoke == enumC0448Re ? enumC0448Re : id2;
    }
}
