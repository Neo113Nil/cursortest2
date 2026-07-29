package o;

/* renamed from: o.Aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003Aa extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ InterfaceC2309ym j;
    public final /* synthetic */ AbstractC0055Ca k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0003Aa(InterfaceC2309ym interfaceC2309ym, AbstractC0055Ca abstractC0055Ca, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.j = interfaceC2309ym;
        this.k = abstractC0055Ca;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0003Aa c0003Aa = new C0003Aa(this.j, this.k, interfaceC2235xe);
        c0003Aa.i = obj;
        return c0003Aa;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0003Aa) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        C0782bY c0782bY = C0782bY.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return c0782bY;
        }
        AbstractC1494mO.l(obj);
        InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.i;
        AbstractC0055Ca abstractC0055Ca = this.k;
        InterfaceC0189He interfaceC0189He = abstractC0055Ca.h;
        int i2 = abstractC0055Ca.i;
        if (i2 == -3) {
            i2 = -2;
        }
        H8 h8 = abstractC0055Ca.j;
        InterfaceC2312yp c0029Ba = new C0029Ba(abstractC0055Ca, null);
        J8 b = AbstractC1807r8.b(i2, 4, h8);
        InterfaceC0189He t = AbstractC0946e20.t(interfaceC0422Qe.m(), interfaceC0189He, true);
        C0191Hg c0191Hg = AbstractC0115Ei.a;
        if (t != c0191Hg && t.k(C0460Rq.w) == null) {
            t = t.D(c0191Hg);
        }
        C2148wJ c2148wJ = new C2148wJ(t, b);
        c2148wJ.c0(EnumC0500Te.j, c2148wJ, c0029Ba);
        this.h = 1;
        Object D = AbstractC0048Bt.D(this.j, c2148wJ, true, this);
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (D != enumC0448Re) {
            D = c0782bY;
        }
        return D == enumC0448Re ? enumC0448Re : c0782bY;
    }
}
