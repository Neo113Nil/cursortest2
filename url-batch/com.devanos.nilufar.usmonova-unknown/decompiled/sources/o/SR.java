package o;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class SR {
    public final C0762bE a = new C0762bE();
    public final Y1 b = new Y1(9);
    public final C1818rJ c = new C1818rJ(new RR(2, null));

    public SR(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.i).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.c(r0) == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(InterfaceC2114vp interfaceC2114vp, AbstractC2367ze abstractC2367ze) {
        PR pr;
        int i;
        EnumC0448Re enumC0448Re;
        C0762bE c0762bE;
        Throwable th;
        ZD zd;
        Object invoke;
        try {
            if (abstractC2367ze instanceof PR) {
                pr = (PR) abstractC2367ze;
                int i2 = pr.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pr.l = i2 - Integer.MIN_VALUE;
                    Object obj = pr.j;
                    i = pr.l;
                    enumC0448Re = EnumC0448Re.h;
                    if (i != 0) {
                        AbstractC1494mO.l(obj);
                        pr.h = interfaceC2114vp;
                        c0762bE = this.a;
                        pr.i = c0762bE;
                        pr.l = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            zd = (ZD) pr.h;
                            try {
                                AbstractC1494mO.l(obj);
                                ((C0762bE) zd).e(null);
                                return obj;
                            } catch (Throwable th2) {
                                th = th2;
                                ((C0762bE) zd).e(null);
                                throw th;
                            }
                        }
                        C0762bE c0762bE2 = pr.i;
                        InterfaceC2114vp interfaceC2114vp2 = (InterfaceC2114vp) pr.h;
                        AbstractC1494mO.l(obj);
                        c0762bE = c0762bE2;
                        interfaceC2114vp = interfaceC2114vp2;
                    }
                    pr.h = c0762bE;
                    pr.i = null;
                    pr.l = 2;
                    invoke = interfaceC2114vp.invoke(pr);
                    if (invoke != enumC0448Re) {
                        C0762bE c0762bE3 = c0762bE;
                        obj = invoke;
                        zd = c0762bE3;
                        ((C0762bE) zd).e(null);
                        return obj;
                    }
                    return enumC0448Re;
                }
            }
            pr.h = c0762bE;
            pr.i = null;
            pr.l = 2;
            invoke = interfaceC2114vp.invoke(pr);
            if (invoke != enumC0448Re) {
            }
            return enumC0448Re;
        } catch (Throwable th3) {
            C0762bE c0762bE4 = c0762bE;
            th = th3;
            zd = c0762bE4;
            ((C0762bE) zd).e(null);
            throw th;
        }
        pr = new PR(this, abstractC2367ze);
        Object obj2 = pr.j;
        i = pr.l;
        enumC0448Re = EnumC0448Re.h;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(InterfaceC2312yp interfaceC2312yp, AbstractC2367ze abstractC2367ze) {
        QR qr;
        int i;
        C0762bE c0762bE;
        Throwable th;
        boolean z;
        if (abstractC2367ze instanceof QR) {
            qr = (QR) abstractC2367ze;
            int i2 = qr.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qr.l = i2 - Integer.MIN_VALUE;
                Object obj = qr.j;
                i = qr.l;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    C0762bE c0762bE2 = this.a;
                    boolean d = c0762bE2.d();
                    try {
                        Object valueOf = Boolean.valueOf(d);
                        qr.h = c0762bE2;
                        qr.i = d;
                        qr.l = 1;
                        Object invoke = interfaceC2312yp.invoke(valueOf, qr);
                        Object obj2 = EnumC0448Re.h;
                        if (invoke == obj2) {
                            return obj2;
                        }
                        c0762bE = c0762bE2;
                        obj = invoke;
                        z = d;
                    } catch (Throwable th2) {
                        c0762bE = c0762bE2;
                        th = th2;
                        z = d;
                        if (z) {
                            c0762bE.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = qr.i;
                    c0762bE = qr.h;
                    try {
                        AbstractC1494mO.l(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                        }
                        throw th;
                    }
                }
                if (z) {
                    c0762bE.e(null);
                }
                return obj;
            }
        }
        qr = new QR(this, abstractC2367ze);
        Object obj3 = qr.j;
        i = qr.l;
        if (i != 0) {
        }
        if (z) {
        }
        return obj3;
    }
}
