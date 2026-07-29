package o;

/* renamed from: o.Tf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501Tf extends AbstractC2225xU implements InterfaceC2114vp {
    public Object h;
    public int i;
    public final /* synthetic */ C0657Zf j;
    public final /* synthetic */ InterfaceC0189He k;
    public final /* synthetic */ AbstractC2225xU l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0501Tf(C0657Zf c0657Zf, InterfaceC0189He interfaceC0189He, InterfaceC2312yp interfaceC2312yp, InterfaceC2235xe interfaceC2235xe) {
        super(1, interfaceC2235xe);
        this.j = c0657Zf;
        this.k = interfaceC0189He;
        this.l = (AbstractC2225xU) interfaceC2312yp;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o.xU, o.yp] */
    @Override // o.Y7
    public final InterfaceC2235xe create(InterfaceC2235xe interfaceC2235xe) {
        return new C0501Tf(this.j, this.k, this.l, interfaceC2235xe);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return ((C0501Tf) create((InterfaceC2235xe) obj)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
    
        if (r9 == r5) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r9 == r5) goto L29;
     */
    /* JADX WARN: Type inference failed for: r6v0, types: [o.xU, o.yp] */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1643of c1643of;
        int i = this.i;
        C0657Zf c0657Zf = this.j;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            this.i = 1;
            obj = C0657Zf.e(c0657Zf, true, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.h;
                    AbstractC1494mO.l(obj);
                    return obj2;
                }
                c1643of = (C1643of) this.h;
                AbstractC1494mO.l(obj);
                Object obj3 = c1643of.b;
                if ((obj3 != null ? obj3.hashCode() : 0) != c1643of.c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!AbstractC0048Bt.h(c1643of.b, obj)) {
                    this.h = obj;
                    this.i = 3;
                    if (c0657Zf.i(obj, true, this) == enumC0448Re) {
                        return enumC0448Re;
                    }
                }
                return obj;
            }
            AbstractC1494mO.l(obj);
        }
        c1643of = (C1643of) obj;
        C0475Sf c0475Sf = new C0475Sf(this.l, c1643of, null);
        this.h = c1643of;
        this.i = 2;
        obj = AbstractC0868ct.b0(this.k, c0475Sf, this);
    }
}
