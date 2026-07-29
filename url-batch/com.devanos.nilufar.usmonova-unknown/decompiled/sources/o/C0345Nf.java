package o;

/* renamed from: o.Nf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345Nf extends AbstractC2225xU implements InterfaceC2312yp {
    public Throwable h;
    public int i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ C0657Zf k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0345Nf(C0657Zf c0657Zf, int i, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = c0657Zf;
        this.l = i;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0345Nf c0345Nf = new C0345Nf(this.k, this.l, interfaceC2235xe);
        c0345Nf.j = ((Boolean) obj).booleanValue();
        return c0345Nf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0345Nf) create(bool, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i;
        AT at;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = this.i;
        C0657Zf c0657Zf = this.k;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        try {
        } catch (Throwable th2) {
            if (z4 != 0) {
                SR f = c0657Zf.f();
                this.h = th2;
                this.j = z4;
                this.i = 2;
                Integer a = f.a();
                if (a != enumC0448Re) {
                    th = th2;
                    obj = a;
                    z3 = z4;
                }
            } else {
                th = th2;
                i = this.l;
                z2 = z4;
            }
        }
        if (z4 == 0) {
            AbstractC1494mO.l(obj);
            boolean z5 = this.j;
            this.j = z5;
            this.i = 1;
            obj = C0657Zf.e(c0657Zf, z5, this);
            z4 = z5;
            if (obj == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (z4 != 1) {
                if (z4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z6 = this.j;
                th = this.h;
                AbstractC1494mO.l(obj);
                z3 = z6;
                i = ((Number) obj).intValue();
                z2 = z3;
                at = new C2348zL(th, i);
                z = z2;
                return new C1619oH(at, Boolean.valueOf(z));
            }
            boolean z7 = this.j;
            AbstractC1494mO.l(obj);
            z4 = z7;
        }
        at = (AT) obj;
        z = z4;
        return new C1619oH(at, Boolean.valueOf(z));
    }
}
