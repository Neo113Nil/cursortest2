package o;

/* renamed from: o.Ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237Ja implements InterfaceC2309ym {
    public final /* synthetic */ C1360kM h;
    public final /* synthetic */ InterfaceC0422Qe i;
    public final /* synthetic */ C0289La j;
    public final /* synthetic */ InterfaceC2309ym k;

    public C0237Ja(C1360kM c1360kM, InterfaceC0422Qe interfaceC0422Qe, C0289La c0289La, InterfaceC2309ym interfaceC2309ym) {
        this.h = c1360kM;
        this.i = interfaceC0422Qe;
        this.j = c0289La;
        this.k = interfaceC2309ym;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // o.InterfaceC2309ym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, InterfaceC2235xe interfaceC2235xe) {
        C0211Ia c0211Ia;
        int i;
        C0237Ja c0237Ja;
        if (interfaceC2235xe instanceof C0211Ia) {
            c0211Ia = (C0211Ia) interfaceC2235xe;
            int i2 = c0211Ia.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0211Ia.l = i2 - Integer.MIN_VALUE;
                Object obj2 = c0211Ia.j;
                i = c0211Ia.l;
                if (i != 0) {
                    AbstractC1494mO.l(obj2);
                    InterfaceC0075Cu interfaceC0075Cu = (InterfaceC0075Cu) this.h.h;
                    if (interfaceC0075Cu != null) {
                        interfaceC0075Cu.c(new C0600Xa("Child of the scoped flow was cancelled"));
                        c0211Ia.h = this;
                        c0211Ia.i = obj;
                        c0211Ia.l = 1;
                        Object q = interfaceC0075Cu.q(c0211Ia);
                        EnumC0448Re enumC0448Re = EnumC0448Re.h;
                        if (q == enumC0448Re) {
                            return enumC0448Re;
                        }
                    }
                    c0237Ja = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0211Ia.i;
                    c0237Ja = c0211Ia.h;
                    AbstractC1494mO.l(obj2);
                }
                c0237Ja.h.h = AbstractC0868ct.H(c0237Ja.i, null, EnumC0500Te.k, new C0185Ha(c0237Ja.j, c0237Ja.k, obj, null), 1);
                return C0782bY.a;
            }
        }
        c0211Ia = new C0211Ia(this, interfaceC2235xe);
        Object obj22 = c0211Ia.j;
        i = c0211Ia.l;
        if (i != 0) {
        }
        c0237Ja.h.h = AbstractC0868ct.H(c0237Ja.i, null, EnumC0500Te.k, new C0185Ha(c0237Ja.j, c0237Ja.k, obj, null), 1);
        return C0782bY.a;
    }
}
