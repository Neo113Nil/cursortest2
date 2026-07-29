package o;

/* renamed from: o.Sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0482Sm extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ InterfaceC2243xm j;
    public final /* synthetic */ Z k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0482Sm(InterfaceC2243xm interfaceC2243xm, RD rd, Object obj, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = interfaceC2243xm;
        this.k = (Z) rd;
        this.l = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [o.RD, o.Z] */
    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0482Sm c0482Sm = new C0482Sm(this.j, this.k, this.l, interfaceC2235xe);
        c0482Sm.i = obj;
        return c0482Sm;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0482Sm) create((EnumC1431lR) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.RD, o.Z, o.ym] */
    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            int ordinal = ((EnumC1431lR) this.i).ordinal();
            ?? r0 = this.k;
            if (ordinal == 0) {
                this.h = 1;
                Object collect = this.j.collect(r0, this);
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                if (collect == enumC0448Re) {
                    return enumC0448Re;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    throw new C0057Cc();
                }
                C0457Rn c0457Rn = AbstractC0868ct.j;
                Object obj2 = this.l;
                if (obj2 == c0457Rn) {
                    r0.m();
                } else {
                    r0.n(obj2);
                }
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
