package o;

/* renamed from: o.Mf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319Mf extends AbstractC2225xU implements InterfaceC2114vp {
    public Throwable h;
    public int i;
    public final /* synthetic */ C0657Zf j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0319Mf(C0657Zf c0657Zf, InterfaceC2235xe interfaceC2235xe) {
        super(1, interfaceC2235xe);
        this.j = c0657Zf;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(InterfaceC2235xe interfaceC2235xe) {
        return new C0319Mf(this.j, interfaceC2235xe);
    }

    @Override // o.InterfaceC2114vp
    public final Object invoke(Object obj) {
        return ((C0319Mf) create((InterfaceC2235xe) obj)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r6 != r4) goto L22;
     */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        AT at;
        int i = this.i;
        C0657Zf c0657Zf = this.j;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        try {
        } catch (Throwable th2) {
            th = th2;
            SR f = c0657Zf.f();
            this.h = th;
            this.i = 2;
            obj = f.a();
        }
        if (i == 0) {
            AbstractC1494mO.l(obj);
            this.i = 1;
            obj = C0657Zf.e(c0657Zf, true, this);
            if (obj == enumC0448Re) {
                return enumC0448Re;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = this.h;
                AbstractC1494mO.l(obj);
                at = new C2348zL(th, ((Number) obj).intValue());
                return new C1619oH(at, Boolean.TRUE);
            }
            AbstractC1494mO.l(obj);
        }
        at = (AT) obj;
        return new C1619oH(at, Boolean.TRUE);
    }
}
