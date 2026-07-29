package o;

/* renamed from: o.Rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449Rf extends AbstractC2225xU implements InterfaceC2312yp {
    public int h;
    public final /* synthetic */ C0657Zf i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0449Rf(C0657Zf c0657Zf, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.i = c0657Zf;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C0449Rf(this.i, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0449Rf) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r0.g(r6) == r5) goto L22;
     */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0657Zf c0657Zf = this.i;
        Y1 y1 = c0657Zf.n;
        int i = this.h;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        try {
            if (i == 0) {
                AbstractC1494mO.l(obj);
                if (y1.Y() instanceof C0796bm) {
                    return y1.Y();
                }
                this.h = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1494mO.l(obj);
                    return (AT) obj;
                }
                AbstractC1494mO.l(obj);
            }
            this.h = 2;
            obj = C0657Zf.d(c0657Zf, false, this);
        } catch (Throwable th) {
            return new C2348zL(th, -1);
        }
    }
}
