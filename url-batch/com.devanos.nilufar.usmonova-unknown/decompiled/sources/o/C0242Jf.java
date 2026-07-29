package o;

/* renamed from: o.Jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242Jf extends AbstractC2225xU implements InterfaceC2312yp {
    public C1643of h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C0657Zf k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0242Jf(C0657Zf c0657Zf, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = c0657Zf;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0242Jf c0242Jf = new C0242Jf(this.k, interfaceC2235xe);
        c0242Jf.j = obj;
        return c0242Jf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0242Jf) create((InterfaceC2309ym) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r3.emit(r11, r10) == r7) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0079, code lost:
    
        if ((r0 instanceof o.C0796bm) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2  */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2309ym interfaceC2309ym;
        AT at;
        int i = this.i;
        C0657Zf c0657Zf = this.k;
        C0782bY c0782bY = C0782bY.a;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC2309ym interfaceC2309ym2 = (InterfaceC2309ym) this.j;
            this.j = interfaceC2309ym2;
            this.i = 1;
            Object b0 = AbstractC0868ct.b0(c0657Zf.j.m(), new C0449Rf(c0657Zf, null), this);
            if (b0 != enumC0448Re) {
                interfaceC2309ym = interfaceC2309ym2;
                obj = b0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1494mO.l(obj);
                return c0782bY;
            }
            at = this.h;
            interfaceC2309ym = (InterfaceC2309ym) this.j;
            AbstractC1494mO.l(obj);
            C2002u5 c2002u5 = new C2002u5(23, (ET) c0657Zf.n.i, new C0164Gf(2, null), false);
            C0190Hf c0190Hf = new C0190Hf(at, null);
            this.j = null;
            this.h = null;
            this.i = 3;
            if (!(interfaceC2309ym instanceof JV)) {
                throw ((JV) interfaceC2309ym).h;
            }
            Object collect = c2002u5.collect(new C0249Jm(new C1098gM(), new C1344k6(interfaceC2309ym, 5), c0190Hf), this);
            if (collect != enumC0448Re) {
                collect = c0782bY;
            }
            if (collect != enumC0448Re) {
                collect = c0782bY;
            }
            if (collect != enumC0448Re) {
                collect = c0782bY;
            }
            return collect == enumC0448Re ? enumC0448Re : c0782bY;
        }
        InterfaceC2309ym interfaceC2309ym3 = (InterfaceC2309ym) this.j;
        AbstractC1494mO.l(obj);
        interfaceC2309ym = interfaceC2309ym3;
        at = (AT) obj;
        if (at instanceof C1643of) {
            Object obj2 = ((C1643of) at).b;
            this.j = interfaceC2309ym;
            this.h = (C1643of) at;
            this.i = 2;
        } else {
            if (at instanceof VX) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (at instanceof C2348zL) {
                throw ((C2348zL) at).b;
            }
        }
        C2002u5 c2002u52 = new C2002u5(23, (ET) c0657Zf.n.i, new C0164Gf(2, null), false);
        C0190Hf c0190Hf2 = new C0190Hf(at, null);
        this.j = null;
        this.h = null;
        this.i = 3;
        if (!(interfaceC2309ym instanceof JV)) {
        }
    }
}
