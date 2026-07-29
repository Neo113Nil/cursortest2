package o;

/* renamed from: o.kq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1390kq extends AbstractC2225xU implements InterfaceC2312yp {
    public AbstractC2224xT h;
    public long i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ C1456lq l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390kq(C1456lq c1456lq, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.l = c1456lq;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C1390kq c1390kq = new C1390kq(this.l, interfaceC2235xe);
        c1390kq.k = obj;
        return c1390kq;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C1390kq) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r2.c(r14) != r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0051, code lost:
    
        if (r2.a(r14) == r11) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j;
        AbstractC2224xT abstractC2224xT;
        C4 c4;
        AbstractC2224xT abstractC2224xT2;
        Object c1194hq;
        C1456lq c1456lq = this.l;
        ET et = c1456lq.e;
        C0274Kl c0274Kl = c1456lq.d;
        InterfaceC0422Qe interfaceC0422Qe = (InterfaceC0422Qe) this.k;
        int i = this.j;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            AbstractC0896dH.d("Gate", "start");
            this.k = interfaceC0422Qe;
            this.j = 1;
        } else if (i == 1) {
            AbstractC1494mO.l(obj);
        } else {
            if (i == 2) {
                j = this.i;
                AbstractC1494mO.l(obj);
                abstractC2224xT = (AbstractC2224xT) obj;
                if (abstractC2224xT == null) {
                    AbstractC0896dH.f("Gate", "timeout", null);
                    abstractC2224xT = new C1960tT("gate_timeout");
                }
                BU bu = AbstractC0896dH.a;
                AbstractC0896dH.d("Gate", "decision=" + abstractC2224xT + " (" + (System.currentTimeMillis() - j) + "ms)");
                c4 = c1456lq.c;
                this.k = null;
                this.h = abstractC2224xT;
                this.i = j;
                this.j = 3;
                if (c4.c(this) != enumC0448Re) {
                    abstractC2224xT2 = abstractC2224xT;
                    this.k = null;
                    this.h = abstractC2224xT2;
                    this.i = j;
                    this.j = 4;
                }
                return enumC0448Re;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                abstractC2224xT2 = this.h;
                AbstractC1494mO.l(obj);
                if (abstractC2224xT2 instanceof C2158wT) {
                    c1194hq = new C1128gq(((C2158wT) abstractC2224xT2).a);
                } else if (abstractC2224xT2 instanceof C2092vT) {
                    c1194hq = C0930dq.a;
                } else if (abstractC2224xT2 instanceof C2026uT) {
                    c1194hq = C1062fq.a;
                } else {
                    if (!(abstractC2224xT2 instanceof C1960tT)) {
                        throw new C0057Cc();
                    }
                    c1194hq = new C1194hq(((C1960tT) abstractC2224xT2).a);
                }
                et.getClass();
                et.f(null, c1194hq);
                BU bu2 = AbstractC0896dH.a;
                AbstractC0896dH.d("Gate", "uiState=" + et.getValue());
                return C0782bY.a;
            }
            j = this.i;
            abstractC2224xT2 = this.h;
            AbstractC1494mO.l(obj);
            this.k = null;
            this.h = abstractC2224xT2;
            this.i = j;
            this.j = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C1324jq c1324jq = new C1324jq(c1456lq, null);
        this.k = interfaceC0422Qe;
        this.i = currentTimeMillis;
        this.j = 2;
        obj = AbstractC0773bP.m(45000L, c1324jq, this);
        if (obj != enumC0448Re) {
            j = currentTimeMillis;
            abstractC2224xT = (AbstractC2224xT) obj;
            if (abstractC2224xT == null) {
            }
            BU bu3 = AbstractC0896dH.a;
            AbstractC0896dH.d("Gate", "decision=" + abstractC2224xT + " (" + (System.currentTimeMillis() - j) + "ms)");
            c4 = c1456lq.c;
            this.k = null;
            this.h = abstractC2224xT;
            this.i = j;
            this.j = 3;
            if (c4.c(this) != enumC0448Re) {
            }
        }
        return enumC0448Re;
    }
}
