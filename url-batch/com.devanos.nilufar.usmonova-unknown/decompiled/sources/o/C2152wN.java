package o;

/* renamed from: o.wN, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2152wN extends AbstractC2225xU implements InterfaceC2312yp {
    public C1360kM h;
    public C1360kM i;
    public int j;
    public final /* synthetic */ AbstractC0106Dz k;
    public final /* synthetic */ EnumC0080Cz l;
    public final /* synthetic */ InterfaceC0422Qe m;
    public final /* synthetic */ C0041Bm n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2152wN(AbstractC0106Dz abstractC0106Dz, EnumC0080Cz enumC0080Cz, InterfaceC0422Qe interfaceC0422Qe, C0041Bm c0041Bm, InterfaceC2235xe interfaceC2235xe) {
        super(2, interfaceC2235xe);
        this.k = abstractC0106Dz;
        this.l = enumC0080Cz;
        this.m = interfaceC0422Qe;
        this.n = c0041Bm;
    }

    @Override // o.Y7
    public final InterfaceC2235xe create(Object obj, InterfaceC2235xe interfaceC2235xe) {
        return new C2152wN(this.k, this.l, this.m, this.n, interfaceC2235xe);
    }

    @Override // o.InterfaceC2312yp
    public final Object invoke(Object obj, Object obj2) {
        return ((C2152wN) create((InterfaceC0422Qe) obj, (InterfaceC2235xe) obj2)).invokeSuspend(C0782bY.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090  */
    @Override // o.Y7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1360kM c1360kM;
        Throwable th;
        C1360kM c1360kM2;
        EnumC0054Bz enumC0054Bz;
        EnumC0054Bz enumC0054Bz2;
        Object q;
        EnumC0448Re enumC0448Re;
        InterfaceC0075Cu interfaceC0075Cu;
        InterfaceC0288Kz interfaceC0288Kz;
        int i = this.j;
        C0782bY c0782bY = C0782bY.a;
        AbstractC0106Dz abstractC0106Dz = this.k;
        if (i == 0) {
            AbstractC1494mO.l(obj);
            if (((C0417Pz) abstractC0106Dz).d != EnumC0080Cz.h) {
                C1360kM c1360kM3 = new C1360kM();
                C1360kM c1360kM4 = new C1360kM();
                try {
                    EnumC0080Cz enumC0080Cz = this.l;
                    InterfaceC0422Qe interfaceC0422Qe = this.m;
                    C0041Bm c0041Bm = this.n;
                    this.h = c1360kM3;
                    this.i = c1360kM4;
                    this.j = 1;
                    C0849ca c0849ca = new C0849ca(1, AbstractC1473m3.L(this));
                    c0849ca.r();
                    EnumC0054Bz.Companion.getClass();
                    AbstractC0048Bt.n(enumC0080Cz, "state");
                    int ordinal = enumC0080Cz.ordinal();
                    if (ordinal == 2) {
                        enumC0054Bz = EnumC0054Bz.ON_CREATE;
                    } else if (ordinal == 3) {
                        enumC0054Bz = EnumC0054Bz.ON_START;
                    } else if (ordinal != 4) {
                        enumC0054Bz2 = null;
                        C2086vN c2086vN = new C2086vN(enumC0054Bz2, c1360kM3, interfaceC0422Qe, C2388zz.a(enumC0080Cz), c0849ca, new C0762bE(), c0041Bm);
                        c1360kM4.h = c2086vN;
                        abstractC0106Dz.a(c2086vN);
                        q = c0849ca.q();
                        enumC0448Re = EnumC0448Re.h;
                        if (q != enumC0448Re) {
                            return enumC0448Re;
                        }
                        c1360kM = c1360kM4;
                        c1360kM2 = c1360kM3;
                    } else {
                        enumC0054Bz = EnumC0054Bz.ON_RESUME;
                    }
                    enumC0054Bz2 = enumC0054Bz;
                    C2086vN c2086vN2 = new C2086vN(enumC0054Bz2, c1360kM3, interfaceC0422Qe, C2388zz.a(enumC0080Cz), c0849ca, new C0762bE(), c0041Bm);
                    c1360kM4.h = c2086vN2;
                    abstractC0106Dz.a(c2086vN2);
                    q = c0849ca.q();
                    enumC0448Re = EnumC0448Re.h;
                    if (q != enumC0448Re) {
                    }
                } catch (Throwable th2) {
                    c1360kM = c1360kM4;
                    th = th2;
                    c1360kM2 = c1360kM3;
                    interfaceC0075Cu = (InterfaceC0075Cu) c1360kM2.h;
                    if (interfaceC0075Cu != null) {
                        interfaceC0075Cu.c(null);
                    }
                    interfaceC0288Kz = (InterfaceC0288Kz) c1360kM.h;
                    if (interfaceC0288Kz != null) {
                        throw th;
                    }
                    abstractC0106Dz.b(interfaceC0288Kz);
                    throw th;
                }
            }
            return c0782bY;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c1360kM = this.i;
        c1360kM2 = this.h;
        try {
            AbstractC1494mO.l(obj);
        } catch (Throwable th3) {
            th = th3;
            interfaceC0075Cu = (InterfaceC0075Cu) c1360kM2.h;
            if (interfaceC0075Cu != null) {
            }
            interfaceC0288Kz = (InterfaceC0288Kz) c1360kM.h;
            if (interfaceC0288Kz != null) {
            }
        }
        InterfaceC0075Cu interfaceC0075Cu2 = (InterfaceC0075Cu) c1360kM2.h;
        if (interfaceC0075Cu2 != null) {
            interfaceC0075Cu2.c(null);
        }
        InterfaceC0288Kz interfaceC0288Kz2 = (InterfaceC0288Kz) c1360kM.h;
        if (interfaceC0288Kz2 != null) {
            abstractC0106Dz.b(interfaceC0288Kz2);
        }
        return c0782bY;
    }
}
