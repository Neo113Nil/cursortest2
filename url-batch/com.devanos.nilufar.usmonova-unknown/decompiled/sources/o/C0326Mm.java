package o;

/* renamed from: o.Mm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326Mm extends AbstractC2225xU implements InterfaceC2378zp {
    public int h;
    public /* synthetic */ InterfaceC2309ym i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C0482Sm k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0326Mm(C0482Sm c0482Sm, InterfaceC2235xe interfaceC2235xe) {
        super(3, interfaceC2235xe);
        this.k = c0482Sm;
    }

    @Override // o.InterfaceC2378zp
    public final Object e(Object obj, Object obj2, Object obj3) {
        C0326Mm c0326Mm = new C0326Mm(this.k, (InterfaceC2235xe) obj3);
        c0326Mm.i = (InterfaceC2309ym) obj;
        c0326Mm.j = obj2;
        return c0326Mm.invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r0.emit(r5, r4) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r3) goto L15;
     */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2309ym interfaceC2309ym;
        int i = this.h;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            interfaceC2309ym = this.i;
            Object obj2 = this.j;
            this.i = interfaceC2309ym;
            this.h = 1;
            obj = this.k.invoke(obj2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1494mO.l(obj);
                return C0782bY.a;
            }
            interfaceC2309ym = this.i;
            AbstractC1494mO.l(obj);
        }
        this.i = null;
        this.h = 2;
    }
}
