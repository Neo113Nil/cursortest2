package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: o.Sr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487Sr implements InterfaceC0610Xk {
    public static final List g = HY.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = HY.j("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final PL a;
    public final RL b;
    public final C0461Rr c;
    public volatile C0643Yr d;
    public final EnumC1359kL e;
    public volatile boolean f;

    public C0487Sr(EF ef, PL pl, RL rl, C0461Rr c0461Rr) {
        AbstractC0048Bt.n(ef, "client");
        AbstractC0048Bt.n(c0461Rr, "http2Connection");
        this.a = pl;
        this.b = rl;
        this.c = c0461Rr;
        List list = ef.y;
        EnumC1359kL enumC1359kL = EnumC1359kL.m;
        this.e = list.contains(enumC1359kL) ? enumC1359kL : EnumC1359kL.l;
    }

    @Override // o.InterfaceC0610Xk
    public final void a() {
        C0643Yr c0643Yr = this.d;
        AbstractC0048Bt.k(c0643Yr);
        c0643Yr.f().close();
    }

    @Override // o.InterfaceC0610Xk
    public final void b() {
        this.c.flush();
    }

    @Override // o.InterfaceC0610Xk
    public final YR c(FN fn, long j) {
        C0643Yr c0643Yr = this.d;
        AbstractC0048Bt.k(c0643Yr);
        return c0643Yr.f();
    }

    @Override // o.InterfaceC0610Xk
    public final void cancel() {
        this.f = true;
        C0643Yr c0643Yr = this.d;
        if (c0643Yr != null) {
            c0643Yr.e(9);
        }
    }

    @Override // o.InterfaceC0610Xk
    public final HS d(C0968eO c0968eO) {
        C0643Yr c0643Yr = this.d;
        AbstractC0048Bt.k(c0643Yr);
        return c0643Yr.i;
    }

    @Override // o.InterfaceC0610Xk
    public final long e(C0968eO c0968eO) {
        if (AbstractC0736as.a(c0968eO)) {
            return HY.i(c0968eO);
        }
        return 0L;
    }

    @Override // o.InterfaceC0610Xk
    public final void f(FN fn) {
        int i;
        C0643Yr c0643Yr;
        boolean z;
        if (this.d != null) {
            return;
        }
        boolean z2 = fn.d != null;
        C1852rr c1852rr = fn.c;
        ArrayList arrayList = new ArrayList(c1852rr.size() + 4);
        arrayList.add(new C1721pr(C1721pr.f, fn.b));
        C1347k9 c1347k9 = C1721pr.g;
        C0932ds c0932ds = fn.a;
        AbstractC0048Bt.n(c0932ds, "url");
        String b = c0932ds.b();
        String d = c0932ds.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new C1721pr(c1347k9, b));
        String j = fn.c.j("Host");
        if (j != null) {
            arrayList.add(new C1721pr(C1721pr.i, j));
        }
        arrayList.add(new C1721pr(C1721pr.h, c0932ds.a));
        int size = c1852rr.size();
        for (int i2 = 0; i2 < size; i2++) {
            String k = c1852rr.k(i2);
            Locale locale = Locale.US;
            AbstractC0048Bt.m(locale, "US");
            String lowerCase = k.toLowerCase(locale);
            AbstractC0048Bt.m(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && AbstractC0048Bt.h(c1852rr.m(i2), "trailers"))) {
                arrayList.add(new C1721pr(lowerCase, c1852rr.m(i2)));
            }
        }
        C0461Rr c0461Rr = this.c;
        c0461Rr.getClass();
        boolean z3 = !z2;
        synchronized (c0461Rr.D) {
            synchronized (c0461Rr) {
                try {
                    if (c0461Rr.l > 1073741823) {
                        c0461Rr.k(8);
                    }
                    if (c0461Rr.m) {
                        throw new C0188Hd();
                    }
                    i = c0461Rr.l;
                    c0461Rr.l = i + 2;
                    c0643Yr = new C0643Yr(i, c0461Rr, z3, false, null);
                    z = !z2 || c0461Rr.A >= c0461Rr.B || c0643Yr.e >= c0643Yr.f;
                    if (c0643Yr.h()) {
                        c0461Rr.i.put(Integer.valueOf(i), c0643Yr);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c0461Rr.D.m(z3, i, arrayList);
        }
        if (z) {
            c0461Rr.D.flush();
        }
        this.d = c0643Yr;
        if (this.f) {
            C0643Yr c0643Yr2 = this.d;
            AbstractC0048Bt.k(c0643Yr2);
            c0643Yr2.e(9);
            throw new IOException("Canceled");
        }
        C0643Yr c0643Yr3 = this.d;
        AbstractC0048Bt.k(c0643Yr3);
        C0617Xr c0617Xr = c0643Yr3.k;
        long j2 = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c0617Xr.g(j2);
        C0643Yr c0643Yr4 = this.d;
        AbstractC0048Bt.k(c0643Yr4);
        c0643Yr4.l.g(this.b.h);
    }

    @Override // o.InterfaceC0610Xk
    public final C0903dO g(boolean z) {
        C1852rr c1852rr;
        C0643Yr c0643Yr = this.d;
        if (c0643Yr == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (c0643Yr) {
            c0643Yr.k.h();
            while (c0643Yr.g.isEmpty() && c0643Yr.m == 0) {
                try {
                    try {
                        c0643Yr.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c0643Yr.k.k();
                    throw th;
                }
            }
            c0643Yr.k.k();
            if (c0643Yr.g.isEmpty()) {
                IOException iOException = c0643Yr.n;
                if (iOException != null) {
                    throw iOException;
                }
                int i = c0643Yr.m;
                AbstractC1888sN.o(i);
                throw new QT(i);
            }
            Object removeFirst = c0643Yr.g.removeFirst();
            AbstractC0048Bt.m(removeFirst, "headersQueue.removeFirst()");
            c1852rr = (C1852rr) removeFirst;
        }
        EnumC1359kL enumC1359kL = this.e;
        AbstractC0048Bt.n(enumC1359kL, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = c1852rr.size();
        C1739q5 c1739q5 = null;
        for (int i2 = 0; i2 < size; i2++) {
            String k = c1852rr.k(i2);
            String m = c1852rr.m(i2);
            if (AbstractC0048Bt.h(k, ":status")) {
                c1739q5 = ON.n("HTTP/1.1 " + m);
            } else if (!h.contains(k)) {
                AbstractC0048Bt.n(k, "name");
                AbstractC0048Bt.n(m, "value");
                arrayList.add(k);
                arrayList.add(UT.T(m).toString());
            }
        }
        if (c1739q5 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C0903dO c0903dO = new C0903dO();
        c0903dO.b = enumC1359kL;
        c0903dO.c = c1739q5.b;
        c0903dO.d = (String) c1739q5.d;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        C1787qr c1787qr = new C1787qr();
        ArrayList arrayList2 = c1787qr.a;
        AbstractC0048Bt.n(arrayList2, "<this>");
        AbstractC0048Bt.n(strArr, "elements");
        arrayList2.addAll(P6.W(strArr));
        c0903dO.f = c1787qr;
        if (z && c0903dO.c == 100) {
            return null;
        }
        return c0903dO;
    }

    @Override // o.InterfaceC0610Xk
    public final PL h() {
        return this.a;
    }
}
