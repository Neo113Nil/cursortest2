package o;

/* renamed from: o.Df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086Df extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C0657Zf j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0086Df(C0657Zf c0657Zf, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = c0657Zf;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0086Df c0086Df = new C0086Df(this.j, interfaceC2235xe);
        c0086Df.i = obj;
        return c0086Df;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0086Df) create((InterfaceC2214xJ) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC2214xJ interfaceC2214xJ = (InterfaceC2214xJ) this.i;
            C0657Zf c0657Zf = this.j;
            C0908dT H = AbstractC0868ct.H(interfaceC2214xJ, null, EnumC0500Te.i, new C0060Cf(c0657Zf, null), 1);
            int i2 = 21;
            C0171Gm c0171Gm = new C0171Gm(new C2002u5(i2, new C2368zf(H, null), c0657Zf.l, false), new C0008Af(H, null));
            D9 d9 = new D9(1, interfaceC2214xJ);
            this.h = 1;
            Object collect = c0171Gm.collect(d9, this);
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
        return C0782bY.a;
    }
}
