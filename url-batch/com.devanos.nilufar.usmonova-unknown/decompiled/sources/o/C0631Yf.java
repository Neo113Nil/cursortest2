package o;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.Yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0631Yf extends AbstractC2225xU implements InterfaceC2312yp {
    public C1230iM h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C1230iM k;
    public final /* synthetic */ C0657Zf l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0631Yf(C1230iM c1230iM, C0657Zf c0657Zf, Object obj, boolean z, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = c1230iM;
        this.l = c0657Zf;
        this.m = obj;
        this.n = z;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0631Yf c0631Yf = new C0631Yf(this.k, this.l, this.m, this.n, interfaceC2235xe);
        c0631Yf.j = obj;
        return c0631Yf;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0631Yf) create((NF) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.b(r1, r7) == r6) goto L16;
     */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NF nf;
        C1230iM c1230iM;
        int i = this.i;
        Object obj2 = this.m;
        C0657Zf c0657Zf = this.l;
        C1230iM c1230iM2 = this.k;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            NF nf2 = (NF) this.j;
            SR f = c0657Zf.f();
            this.j = nf2;
            this.h = c1230iM2;
            this.i = 1;
            Integer num = new Integer(((AtomicInteger) f.b.i).incrementAndGet());
            if (num != enumC0448Re) {
                nf = nf2;
                obj = num;
                c1230iM = c1230iM2;
            }
            return enumC0448Re;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1494mO.l(obj);
            if (this.n) {
                c0657Zf.n.d0(new C1643of(obj2 != null ? obj2.hashCode() : 0, c1230iM2.h, obj2));
            }
            return C0782bY.a;
        }
        c1230iM = this.h;
        nf = (NF) this.j;
        AbstractC1494mO.l(obj);
        c1230iM.h = ((Number) obj).intValue();
        this.j = null;
        this.h = null;
        this.i = 2;
    }
}
