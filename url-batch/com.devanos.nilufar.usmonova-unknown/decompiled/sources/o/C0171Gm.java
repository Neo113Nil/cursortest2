package o;

/* renamed from: o.Gm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171Gm implements InterfaceC2243xm {
    public final /* synthetic */ C2002u5 h;
    public final /* synthetic */ C0008Af i;

    public C0171Gm(C2002u5 c2002u5, C0008Af c0008Af) {
        this.h = c2002u5;
        this.i = c0008Af;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // o.InterfaceC2243xm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(InterfaceC2309ym interfaceC2309ym, InterfaceC2235xe interfaceC2235xe) {
        C0145Fm c0145Fm;
        int i;
        C0782bY c0782bY;
        EnumC0448Re enumC0448Re;
        C0171Gm c0171Gm;
        JV jv;
        C0008Af c0008Af;
        C1561nP c1561nP;
        Throwable th;
        C1561nP c1561nP2;
        try {
            if (interfaceC2235xe instanceof C0145Fm) {
                c0145Fm = (C0145Fm) interfaceC2235xe;
                int i2 = c0145Fm.i;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0145Fm.i = i2 - Integer.MIN_VALUE;
                    Object obj = c0145Fm.h;
                    i = c0145Fm.i;
                    c0782bY = C0782bY.a;
                    enumC0448Re = EnumC0448Re.h;
                    if (i != 0) {
                        AbstractC1494mO.l(obj);
                        try {
                            C2002u5 c2002u5 = this.h;
                            c0145Fm.k = this;
                            c0145Fm.l = interfaceC2309ym;
                            c0145Fm.i = 1;
                            if (c2002u5.collect(interfaceC2309ym, c0145Fm) != enumC0448Re) {
                                c0171Gm = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c0171Gm = this;
                            jv = new JV(th);
                            c0008Af = c0171Gm.i;
                            c0145Fm.k = th;
                            c0145Fm.l = null;
                            c0145Fm.i = 2;
                            if (EB.c(jv, c0008Af, th, c0145Fm) != enumC0448Re) {
                            }
                        }
                        return enumC0448Re;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            Throwable th3 = (Throwable) c0145Fm.k;
                            AbstractC1494mO.l(obj);
                            throw th3;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1561nP2 = (C1561nP) c0145Fm.k;
                        try {
                            AbstractC1494mO.l(obj);
                            c1561nP2.releaseIntercepted();
                            return c0782bY;
                        } catch (Throwable th4) {
                            th = th4;
                            c1561nP2.releaseIntercepted();
                            throw th;
                        }
                    }
                    interfaceC2309ym = c0145Fm.l;
                    c0171Gm = (C0171Gm) c0145Fm.k;
                    try {
                        AbstractC1494mO.l(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        jv = new JV(th);
                        c0008Af = c0171Gm.i;
                        c0145Fm.k = th;
                        c0145Fm.l = null;
                        c0145Fm.i = 2;
                        if (EB.c(jv, c0008Af, th, c0145Fm) != enumC0448Re) {
                            return enumC0448Re;
                        }
                        throw th;
                    }
                    c1561nP = new C1561nP(interfaceC2309ym, c0145Fm.getContext());
                    C0008Af c0008Af2 = c0171Gm.i;
                    c0145Fm.k = c1561nP;
                    c0145Fm.l = null;
                    c0145Fm.i = 3;
                    c0008Af2.e(c1561nP, null, c0145Fm);
                    if (c0782bY != enumC0448Re) {
                        c1561nP2 = c1561nP;
                        c1561nP2.releaseIntercepted();
                        return c0782bY;
                    }
                    return enumC0448Re;
                }
            }
            C0008Af c0008Af22 = c0171Gm.i;
            c0145Fm.k = c1561nP;
            c0145Fm.l = null;
            c0145Fm.i = 3;
            c0008Af22.e(c1561nP, null, c0145Fm);
            if (c0782bY != enumC0448Re) {
            }
            return enumC0448Re;
        } catch (Throwable th6) {
            th = th6;
            c1561nP2 = c1561nP;
            c1561nP2.releaseIntercepted();
            throw th;
        }
        c0145Fm = new C0145Fm(this, interfaceC2235xe);
        Object obj2 = c0145Fm.h;
        i = c0145Fm.i;
        c0782bY = C0782bY.a;
        enumC0448Re = EnumC0448Re.h;
        if (i != 0) {
        }
        c1561nP = new C1561nP(interfaceC2309ym, c0145Fm.getContext());
    }
}
