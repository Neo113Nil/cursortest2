package o;

/* renamed from: o.Bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041Bm extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ InterfaceC0189He i;
    public final /* synthetic */ InterfaceC2243xm j;
    public final /* synthetic */ C2082vJ k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0041Bm(InterfaceC0189He interfaceC0189He, InterfaceC2243xm interfaceC2243xm, C2082vJ c2082vJ, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = interfaceC0189He;
        this.j = interfaceC2243xm;
        this.k = c2082vJ;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0041Bm(this.i, this.j, this.k, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0041Bm) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4.collect(r7, r6) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (o.AbstractC0868ct.b0(r0, r7, r6) == r5) goto L17;
     */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            C1188hk c1188hk = C1188hk.h;
            InterfaceC0189He interfaceC0189He = this.i;
            boolean h = AbstractC0048Bt.h(interfaceC0189He, c1188hk);
            C2082vJ c2082vJ = this.k;
            InterfaceC2243xm interfaceC2243xm = this.j;
            EnumC0448Re enumC0448Re = EnumC0448Re.h;
            if (h) {
                C2375zm c2375zm = new C2375zm(c2082vJ, 0);
                this.h = 1;
            } else {
                C0015Am c0015Am = new C0015Am(interfaceC2243xm, c2082vJ, null);
                this.h = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
        }
        return C0782bY.a;
    }
}
