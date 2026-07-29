package o;

/* renamed from: o.qT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763qT extends AbstractC2225xU implements InterfaceC2378zp {
    public int h;
    public /* synthetic */ InterfaceC2309ym i;
    public /* synthetic */ int j;
    public final /* synthetic */ C1894sT k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1763qT(C1894sT c1894sT, InterfaceC2235xe interfaceC2235xe) {
        super(3, interfaceC2235xe);
        this.k = c1894sT;
    }

    @Override // o.InterfaceC2378zp
    public final Object e(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        C1763qT c1763qT = new C1763qT(this.k, (InterfaceC2235xe) obj3);
        c1763qT.i = (InterfaceC2309ym) obj;
        c1763qT.j = intValue;
        return c1763qT.invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r0.emit(o.EnumC1431lR.j, r12) == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (o.PX.D(r1, r12) == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r0.emit(o.EnumC1431lR.i, r12) == r9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r13.emit(o.EnumC1431lR.h, r12) == r9) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2309ym interfaceC2309ym;
        C1894sT c1894sT = this.k;
        long j = c1894sT.b;
        int i = this.h;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC2309ym interfaceC2309ym2 = this.i;
            if (this.j > 0) {
                this.h = 1;
            } else {
                long j2 = c1894sT.a;
                this.i = interfaceC2309ym2;
                this.h = 2;
                if (PX.D(j2, this) != enumC0448Re) {
                    interfaceC2309ym = interfaceC2309ym2;
                    if (j > 0) {
                    }
                    this.i = null;
                    this.h = 5;
                }
            }
            return enumC0448Re;
        }
        if (i != 1) {
            if (i == 2) {
                interfaceC2309ym = this.i;
                AbstractC1494mO.l(obj);
                if (j > 0) {
                    this.i = interfaceC2309ym;
                    this.h = 3;
                }
                this.i = null;
                this.h = 5;
            } else if (i == 3) {
                interfaceC2309ym = this.i;
                AbstractC1494mO.l(obj);
                this.i = interfaceC2309ym;
                this.h = 4;
            } else if (i == 4) {
                interfaceC2309ym = this.i;
                AbstractC1494mO.l(obj);
                this.i = null;
                this.h = 5;
            } else if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        AbstractC1494mO.l(obj);
        return C0782bY.a;
    }
}
