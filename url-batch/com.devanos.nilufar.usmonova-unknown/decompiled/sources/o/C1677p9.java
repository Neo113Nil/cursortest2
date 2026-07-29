package o;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;

/* renamed from: o.p9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1677p9 implements InterfaceC1789qt {
    public static final C1677p9 b = new C1677p9(1);
    public final /* synthetic */ int a;

    public /* synthetic */ C1677p9(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c5 A[Catch: IOException -> 0x014a, TryCatch #12 {IOException -> 0x014a, blocks: (B:33:0x0142, B:40:0x014d, B:43:0x0170, B:44:0x018b, B:48:0x01b1, B:50:0x01c5, B:57:0x01de, B:59:0x01e2, B:62:0x01ef, B:64:0x0202, B:65:0x020c, B:66:0x0216, B:69:0x01cf, B:72:0x0219, B:73:0x021c, B:46:0x018f), top: B:32:0x0142, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e2 A[Catch: IOException -> 0x014a, TryCatch #12 {IOException -> 0x014a, blocks: (B:33:0x0142, B:40:0x014d, B:43:0x0170, B:44:0x018b, B:48:0x01b1, B:50:0x01c5, B:57:0x01de, B:59:0x01e2, B:62:0x01ef, B:64:0x0202, B:65:0x020c, B:66:0x0216, B:69:0x01cf, B:72:0x0219, B:73:0x021c, B:46:0x018f), top: B:32:0x0142, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ef A[Catch: IOException -> 0x014a, TryCatch #12 {IOException -> 0x014a, blocks: (B:33:0x0142, B:40:0x014d, B:43:0x0170, B:44:0x018b, B:48:0x01b1, B:50:0x01c5, B:57:0x01de, B:59:0x01e2, B:62:0x01ef, B:64:0x0202, B:65:0x020c, B:66:0x0216, B:69:0x01cf, B:72:0x0219, B:73:0x021c, B:46:0x018f), top: B:32:0x0142, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    @Override // o.InterfaceC1789qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0968eO a(RL rl) {
        int i;
        C0903dO c0903dO;
        IOException iOException;
        int i2;
        C0968eO a;
        AbstractC1166hO abstractC1166hO;
        boolean z = true;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                FN fn = rl.e;
                int i3 = 11;
                C2002u5 c2002u5 = new C2002u5(i3, fn, null, false);
                C1611o9 c1611o9 = fn.f;
                if (c1611o9 == null) {
                    int i4 = C1611o9.n;
                    c1611o9 = PX.C0(fn.c);
                    fn.f = c1611o9;
                }
                if (c1611o9.j) {
                    Object obj = null;
                    c2002u5 = new C2002u5(i3, obj, obj, false);
                }
                FN fn2 = (FN) c2002u5.i;
                C0968eO c0968eO = (C0968eO) c2002u5.j;
                if (fn2 == null && c0968eO == null) {
                    return new C0968eO(fn, EnumC1359kL.j, "Unsatisfiable Request (only-if-cached)", 504, null, new C1852rr((String[]) new ArrayList(20).toArray(new String[0])), HY.c, null, null, null, -1L, System.currentTimeMillis(), null);
                }
                if (fn2 == null) {
                    AbstractC0048Bt.k(c0968eO);
                    C0903dO c = c0968eO.c();
                    C0968eO x = C1097gL.x(c0968eO);
                    C0903dO.b("cacheResponse", x);
                    c.i = x;
                    return c.a();
                }
                C0968eO b2 = rl.b(fn2);
                if (c0968eO != null) {
                    if (b2.k == 304) {
                        C0903dO c2 = c0968eO.c();
                        C1852rr c1852rr = c0968eO.m;
                        C1852rr c1852rr2 = b2.m;
                        ArrayList arrayList = new ArrayList(20);
                        int size = c1852rr.size();
                        int i5 = 0;
                        while (i5 < size) {
                            String k = c1852rr.k(i5);
                            int i6 = size;
                            String m = c1852rr.m(i5);
                            C1852rr c1852rr3 = c1852rr;
                            if ("Warning".equalsIgnoreCase(k)) {
                                i = i5;
                                if (AbstractC0778bU.B(m, "1", false)) {
                                    i5 = i + 1;
                                    size = i6;
                                    c1852rr = c1852rr3;
                                }
                            } else {
                                i = i5;
                            }
                            if ("Content-Length".equalsIgnoreCase(k) || "Content-Encoding".equalsIgnoreCase(k) || "Content-Type".equalsIgnoreCase(k) || !C1097gL.D0(k) || c1852rr2.j(k) == null) {
                                AbstractC0048Bt.n(k, "name");
                                AbstractC0048Bt.n(m, "value");
                                arrayList.add(k);
                                arrayList.add(UT.T(m).toString());
                            }
                            i5 = i + 1;
                            size = i6;
                            c1852rr = c1852rr3;
                        }
                        int size2 = c1852rr2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            String k2 = c1852rr2.k(i7);
                            if (!"Content-Length".equalsIgnoreCase(k2) && !"Content-Encoding".equalsIgnoreCase(k2) && !"Content-Type".equalsIgnoreCase(k2) && C1097gL.D0(k2)) {
                                String m2 = c1852rr2.m(i7);
                                AbstractC0048Bt.n(k2, "name");
                                AbstractC0048Bt.n(m2, "value");
                                arrayList.add(k2);
                                arrayList.add(UT.T(m2).toString());
                            }
                        }
                        c2.f = new C1852rr((String[]) arrayList.toArray(new String[0])).l();
                        c2.k = b2.r;
                        c2.l = b2.s;
                        C0968eO x2 = C1097gL.x(c0968eO);
                        C0903dO.b("cacheResponse", x2);
                        c2.i = x2;
                        C0968eO x3 = C1097gL.x(b2);
                        C0903dO.b("networkResponse", x3);
                        c2.h = x3;
                        c2.a();
                        AbstractC1166hO abstractC1166hO2 = b2.n;
                        AbstractC0048Bt.k(abstractC1166hO2);
                        abstractC1166hO2.close();
                        AbstractC0048Bt.k(null);
                        throw null;
                    }
                    AbstractC1166hO abstractC1166hO3 = c0968eO.n;
                    if (abstractC1166hO3 != null) {
                        HY.c(abstractC1166hO3);
                    }
                }
                C0903dO c3 = b2.c();
                C0968eO x4 = C1097gL.x(c0968eO);
                C0903dO.b("cacheResponse", x4);
                c3.i = x4;
                C0968eO x5 = C1097gL.x(b2);
                C0903dO.b("networkResponse", x5);
                c3.h = x5;
                return c3.a();
            case 1:
                NL nl = rl.a;
                synchronized (nl) {
                    try {
                        if (!nl.t) {
                            throw new IllegalStateException("released");
                        }
                        if (nl.s) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (nl.r) {
                            throw new IllegalStateException("Check failed.");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                C0636Yk c0636Yk = nl.n;
                AbstractC0048Bt.k(c0636Yk);
                EF ef = nl.h;
                AbstractC0048Bt.n(ef, "client");
                try {
                    C0584Wk c0584Wk = new C0584Wk(nl, c0636Yk, c0636Yk.a(rl.f, rl.g, rl.h, ef.m, !AbstractC0048Bt.h(rl.e.b, "GET")).j(ef, rl));
                    nl.q = c0584Wk;
                    nl.v = c0584Wk;
                    synchronized (nl) {
                        nl.r = true;
                        nl.s = true;
                    }
                    if (nl.u) {
                        throw new IOException("Canceled");
                    }
                    return RL.a(rl, 0, c0584Wk, null, 61).b(rl.e);
                } catch (IOException e) {
                    c0636Yk.c(e);
                    throw new SO(e);
                } catch (SO e2) {
                    c0636Yk.c(e2.i);
                    throw e2;
                }
            case 2:
                C0584Wk c0584Wk2 = rl.d;
                AbstractC0048Bt.k(c0584Wk2);
                NL nl2 = (NL) c0584Wk2.c;
                InterfaceC0610Xk interfaceC0610Xk = (InterfaceC0610Xk) c0584Wk2.e;
                PL pl = (PL) c0584Wk2.f;
                FN fn3 = rl.e;
                JN jn = fn3.d;
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        interfaceC0610Xk.f(fn3);
                        try {
                            if (!AbstractC0946e20.D(fn3.b) || jn == null) {
                                nl2.f(c0584Wk2, true, false, null);
                                c0903dO = null;
                            } else {
                                if ("100-continue".equalsIgnoreCase(fn3.c.j("Expect"))) {
                                    try {
                                        interfaceC0610Xk.b();
                                        c0903dO = c0584Wk2.c(true);
                                    } catch (IOException e3) {
                                        c0584Wk2.d(e3);
                                        throw e3;
                                    }
                                } else {
                                    c0903dO = null;
                                }
                                if (c0903dO != null) {
                                    nl2.f(c0584Wk2, true, false, null);
                                    if (pl.g == null) {
                                        z = false;
                                    }
                                    if (!z) {
                                        interfaceC0610Xk.h().k();
                                    }
                                } else if (jn.isDuplex()) {
                                    try {
                                        interfaceC0610Xk.b();
                                        jn.writeTo(AbstractC0946e20.g(c0584Wk2.b(fn3, true)));
                                    } catch (IOException e4) {
                                        c0584Wk2.d(e4);
                                        throw e4;
                                    }
                                } else {
                                    IL g = AbstractC0946e20.g(c0584Wk2.b(fn3, false));
                                    jn.writeTo(g);
                                    g.close();
                                }
                            }
                            if (jn == null || !jn.isDuplex()) {
                                try {
                                    interfaceC0610Xk.a();
                                } catch (IOException e5) {
                                    c0584Wk2.d(e5);
                                    throw e5;
                                }
                            }
                            iOException = null;
                        } catch (IOException e6) {
                            e = e6;
                            if (e instanceof C0188Hd) {
                                throw e;
                            }
                            if (!c0584Wk2.b) {
                                throw e;
                            }
                            iOException = e;
                            if (c0903dO == null) {
                            }
                            c0903dO.a = fn3;
                            c0903dO.e = pl.e;
                            c0903dO.k = currentTimeMillis;
                            c0903dO.l = System.currentTimeMillis();
                            C0968eO a2 = c0903dO.a();
                            i2 = a2.k;
                            if (i2 != 100) {
                            }
                            C0903dO c4 = c0584Wk2.c(false);
                            AbstractC0048Bt.k(c4);
                            c4.a = fn3;
                            c4.e = pl.e;
                            c4.k = currentTimeMillis;
                            c4.l = System.currentTimeMillis();
                            a2 = c4.a();
                            i2 = a2.k;
                            C0903dO c5 = a2.c();
                            String b3 = C0968eO.b("Content-Type", a2);
                            long e7 = interfaceC0610Xk.e(a2);
                            c5.g = new SL(b3, e7, AbstractC0946e20.h(new C0558Vk(c0584Wk2, interfaceC0610Xk.d(a2), e7)), 0);
                            a = c5.a();
                            if (!"close".equalsIgnoreCase(a.h.c.j("Connection"))) {
                            }
                            interfaceC0610Xk.h().k();
                            if (i2 != 204) {
                            }
                            abstractC1166hO = a.n;
                            if ((abstractC1166hO != null ? abstractC1166hO.contentLength() : -1L) > 0) {
                            }
                            return a;
                        }
                    } catch (IOException e8) {
                        c0584Wk2.d(e8);
                        throw e8;
                    }
                } catch (IOException e9) {
                    e = e9;
                    c0903dO = null;
                }
                if (c0903dO == null) {
                    try {
                        c0903dO = c0584Wk2.c(false);
                        AbstractC0048Bt.k(c0903dO);
                    } catch (IOException e10) {
                        if (iOException == null) {
                            throw e10;
                        }
                        AbstractC0946e20.e(iOException, e10);
                        throw iOException;
                    }
                }
                c0903dO.a = fn3;
                c0903dO.e = pl.e;
                c0903dO.k = currentTimeMillis;
                c0903dO.l = System.currentTimeMillis();
                C0968eO a22 = c0903dO.a();
                i2 = a22.k;
                try {
                    if (i2 != 100) {
                        if (102 <= i2 && i2 < 200) {
                        }
                        C0903dO c52 = a22.c();
                        String b32 = C0968eO.b("Content-Type", a22);
                        long e72 = interfaceC0610Xk.e(a22);
                        c52.g = new SL(b32, e72, AbstractC0946e20.h(new C0558Vk(c0584Wk2, interfaceC0610Xk.d(a22), e72)), 0);
                        a = c52.a();
                        if (!"close".equalsIgnoreCase(a.h.c.j("Connection")) || "close".equalsIgnoreCase(C0968eO.b("Connection", a))) {
                            interfaceC0610Xk.h().k();
                        }
                        if (i2 != 204 || i2 == 205) {
                            abstractC1166hO = a.n;
                            if ((abstractC1166hO != null ? abstractC1166hO.contentLength() : -1L) > 0) {
                                StringBuilder sb = new StringBuilder("HTTP ");
                                sb.append(i2);
                                sb.append(" had non-zero Content-Length: ");
                                AbstractC1166hO abstractC1166hO4 = a.n;
                                sb.append(abstractC1166hO4 != null ? Long.valueOf(abstractC1166hO4.contentLength()) : null);
                                throw new ProtocolException(sb.toString());
                            }
                        }
                        return a;
                    }
                    String b322 = C0968eO.b("Content-Type", a22);
                    long e722 = interfaceC0610Xk.e(a22);
                    c52.g = new SL(b322, e722, AbstractC0946e20.h(new C0558Vk(c0584Wk2, interfaceC0610Xk.d(a22), e722)), 0);
                    a = c52.a();
                    if (!"close".equalsIgnoreCase(a.h.c.j("Connection"))) {
                    }
                    interfaceC0610Xk.h().k();
                    if (i2 != 204) {
                    }
                    abstractC1166hO = a.n;
                    if ((abstractC1166hO != null ? abstractC1166hO.contentLength() : -1L) > 0) {
                    }
                    return a;
                } catch (IOException e11) {
                    c0584Wk2.d(e11);
                    throw e11;
                }
                C0903dO c42 = c0584Wk2.c(false);
                AbstractC0048Bt.k(c42);
                c42.a = fn3;
                c42.e = pl.e;
                c42.k = currentTimeMillis;
                c42.l = System.currentTimeMillis();
                a22 = c42.a();
                i2 = a22.k;
                C0903dO c522 = a22.c();
                break;
            default:
                FN fn4 = rl.e;
                long currentTimeMillis2 = System.currentTimeMillis();
                BU bu = AbstractC0896dH.a;
                AbstractC0896dH.d("Net", "--> " + fn4.b + " ep=" + fn4.a.b());
                try {
                    C0968eO b4 = rl.b(fn4);
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    String string = b4.j().string();
                    AbstractC0896dH.d("Net", "<-- " + b4.k + " (" + currentTimeMillis3 + "ms) body=" + string);
                    return b4;
                } catch (Exception e12) {
                    BU bu2 = AbstractC0896dH.a;
                    AbstractC0896dH.b("Net", "failed (" + (System.currentTimeMillis() - currentTimeMillis2) + "ms)", e12);
                    throw e12;
                }
        }
    }
}
