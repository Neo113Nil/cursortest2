package o;

import java.util.List;

/* renamed from: o.aM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704aM extends AbstractC2225xU implements InterfaceC2312yp {
    public C1932t2 h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C0901dM k;
    public final /* synthetic */ C0835cM l;
    public final /* synthetic */ InterfaceC0957eD m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0704aM(C0901dM c0901dM, C0835cM c0835cM, InterfaceC0957eD interfaceC0957eD, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = c0901dM;
        this.l = c0835cM;
        this.m = interfaceC0957eD;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0704aM c0704aM = new C0704aM(this.k, this.l, this.m, interfaceC2235xe);
        c0704aM.j = obj;
        return c0704aM;
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C0704aM) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0075Cu interfaceC0075Cu;
        ET et;
        Object obj2;
        WH wh;
        C1932t2 c1932t2;
        List h;
        C0901dM c0901dM;
        EnumC0448Re enumC0448Re = EnumC0448Re.h;
        int i = this.i;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            InterfaceC0189He m = ((InterfaceC0422Qe) this.j).m();
            interfaceC0075Cu = (InterfaceC0075Cu) m.k(C0460Rq.K);
            if (interfaceC0075Cu == null) {
                throw new IllegalStateException(("Current context doesn't contain Job in it: " + m).toString());
            }
            C0901dM c0901dM2 = this.k;
            synchronized (c0901dM2.b) {
                Throwable th = c0901dM2.d;
                if (th != null) {
                    throw th;
                }
                if (((XL) c0901dM2.r.getValue()).compareTo(XL.i) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (c0901dM2.c != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                c0901dM2.c = interfaceC0075Cu;
                c0901dM2.e();
            }
            C1861s c1861s = new C1861s(4, this.k);
            C0950e6 c0950e6 = AbstractC2025uS.a;
            AbstractC2025uS.f(RP.w);
            synchronized (AbstractC2025uS.b) {
                AbstractC2025uS.g = AbstractC0720ac.B0(AbstractC2025uS.g, c1861s);
            }
            C1932t2 c1932t22 = new C1932t2(6, c1861s);
            ET et2 = C0901dM.v;
            C0218Ih c0218Ih = this.k.u;
            try {
                do {
                    et = C0901dM.v;
                    obj2 = (XH) et.getValue();
                    wh = (WH) obj2;
                    C0460Rq c0460Rq = C0460Rq.D;
                    NH nh = wh.j;
                    if (!nh.containsKey(c0218Ih)) {
                        if (wh.isEmpty()) {
                            wh = new WH(c0218Ih, c0218Ih, nh.a(c0218Ih, new C0758bA(c0460Rq, c0460Rq)));
                        } else {
                            Object obj3 = wh.i;
                            Object obj4 = nh.get(obj3);
                            AbstractC0048Bt.k(obj4);
                            wh = new WH(wh.h, c0218Ih, nh.a(obj3, new C0758bA(((C0758bA) obj4).a, c0218Ih)).a(c0218Ih, new C0758bA(obj3, c0460Rq)));
                        }
                    }
                    if (obj2 != wh) {
                        Object obj5 = AbstractC1052fg.e;
                        if (obj2 == null) {
                            obj2 = obj5;
                        }
                    }
                    break;
                } while (!et.f(obj2, wh));
                break;
                C0901dM c0901dM3 = this.k;
                synchronized (c0901dM3.b) {
                    h = c0901dM3.h();
                }
                int size = h.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C2036ud) h.get(i2)).n();
                }
                ZL zl = new ZL(this.l, this.m, null);
                this.j = interfaceC0075Cu;
                this.h = c1932t22;
                this.i = 1;
                if (AbstractC1052fg.j(zl, this) == enumC0448Re) {
                    return enumC0448Re;
                }
                c1932t2 = c1932t22;
            } catch (Throwable th2) {
                th = th2;
                c1932t2 = c1932t22;
                c1932t2.b();
                c0901dM = this.k;
                synchronized (c0901dM.b) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1932t2 = this.h;
            interfaceC0075Cu = (InterfaceC0075Cu) this.j;
            try {
                AbstractC1494mO.l(obj);
            } catch (Throwable th3) {
                th = th3;
                c1932t2.b();
                c0901dM = this.k;
                synchronized (c0901dM.b) {
                    try {
                        if (c0901dM.c == interfaceC0075Cu) {
                            c0901dM.c = null;
                        }
                        c0901dM.e();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                ET et3 = C0901dM.v;
                C0140Fh.r(this.k.u);
                throw th;
            }
        }
        c1932t2.b();
        C0901dM c0901dM4 = this.k;
        synchronized (c0901dM4.b) {
            try {
                if (c0901dM4.c == interfaceC0075Cu) {
                    c0901dM4.c = null;
                }
                c0901dM4.e();
            } catch (Throwable th5) {
                throw th5;
            }
        }
        ET et4 = C0901dM.v;
        C0140Fh.r(this.k.u);
        return C0782bY.a;
    }
}
