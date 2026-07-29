package o;

/* renamed from: o.Tm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508Tm extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ C1894sT i;
    public final /* synthetic */ InterfaceC2243xm j;
    public final /* synthetic */ Z k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0508Tm(C1894sT c1894sT, InterfaceC2243xm interfaceC2243xm, RD rd, Object obj, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = c1894sT;
        this.j = interfaceC2243xm;
        this.k = (Z) rd;
        this.l = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [o.RD, o.Z] */
    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0508Tm(this.i, this.j, this.k, this.l, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0508Tm) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (o.AbstractC0022At.p(r1, r3, r19) == r9) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0, types: [o.RD, o.Z, o.ym] */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        C0782bY c0782bY = C0782bY.a;
        InterfaceC2243xm interfaceC2243xm = this.j;
        ?? r8 = this.k;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            C0140Fh c0140Fh = C1497mR.a;
            C1894sT c1894sT = this.i;
            if (c1894sT == c0140Fh) {
                this.h = 1;
                return interfaceC2243xm.collect(r8, this) == enumC0448Re ? enumC0448Re : c0782bY;
            }
            if (c1894sT == C1497mR.b) {
                C1040fU e = r8.e();
                C0456Rm c0456Rm = new C0456Rm(2, null);
                this.h = 2;
            } else {
                C1040fU e2 = r8.e();
                C1763qT c1763qT = new C1763qT(c1894sT, null);
                int i2 = AbstractC0352Nm.a;
                C1188hk c1188hk = C1188hk.h;
                H8 h8 = H8.h;
                InterfaceC2243xm m = AbstractC0022At.m(AbstractC0022At.m(new C2002u5(22, new C0289La(c1763qT, e2, c1188hk, -2, h8), new C1828rT(2, null), false)));
                C0482Sm c0482Sm = new C0482Sm(interfaceC2243xm, r8, this.l, null);
                this.h = 4;
                Object collect = AbstractC0022At.h(new C0289La(new C0326Mm(c0482Sm, null), m, c1188hk, -2, h8), 0).collect(RE.h, this);
                if (collect != enumC0448Re) {
                    collect = c0782bY;
                }
                if (collect != enumC0448Re) {
                    collect = c0782bY;
                }
                if (collect == enumC0448Re) {
                }
            }
        }
        if (i == 1) {
            AbstractC1494mO.l(obj);
            return c0782bY;
        }
        if (i != 2) {
            if (i == 3) {
                AbstractC1494mO.l(obj);
                return c0782bY;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            return c0782bY;
        }
        AbstractC1494mO.l(obj);
        this.h = 3;
        if (interfaceC2243xm.collect(r8, this) == enumC0448Re) {
        }
    }
}
