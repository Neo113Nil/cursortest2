package o;

/* renamed from: o.uN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2020uN extends AbstractC2225xU implements InterfaceC2312yp {
    public ZD h;
    public C0041Bm i;
    public int j;
    public final /* synthetic */ C0762bE k;
    public final /* synthetic */ C0041Bm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2020uN(C0762bE c0762bE, C0041Bm c0041Bm, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = c0762bE;
        this.l = c0041Bm;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C2020uN(this.k, this.l, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C2020uN) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        if (r7.c(r6) == r4) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [o.ZD] */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0762bE c0762bE;
        C0041Bm c0041Bm;
        ZD zd;
        Throwable th;
        int i = this.j;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        try {
            if (i == 0) {
                AbstractC1494mO.l(obj);
                c0762bE = this.k;
                this.h = c0762bE;
                c0041Bm = this.l;
                this.i = c0041Bm;
                this.j = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zd = this.h;
                    try {
                        AbstractC1494mO.l(obj);
                        ((C0762bE) zd).e(null);
                        return C0782bY.a;
                    } catch (Throwable th2) {
                        th = th2;
                        ((C0762bE) zd).e(null);
                        throw th;
                    }
                }
                c0041Bm = this.i;
                ?? r2 = this.h;
                AbstractC1494mO.l(obj);
                c0762bE = r2;
            }
            C1954tN c1954tN = new C1954tN(c0041Bm, null);
            this.h = c0762bE;
            this.i = null;
            this.j = 2;
            if (AbstractC1052fg.j(c1954tN, this) != enumC0448Re) {
                zd = c0762bE;
                ((C0762bE) zd).e(null);
                return C0782bY.a;
            }
            return enumC0448Re;
        } catch (Throwable th3) {
            zd = c0762bE;
            th = th3;
            ((C0762bE) zd).e(null);
            throw th;
        }
    }
}
