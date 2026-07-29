package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class PL extends AbstractC0280Kr {
    public final RO b;
    public Socket c;
    public Socket d;
    public C1457lr e;
    public EnumC1359kL f;
    public C0461Rr g;
    public JL h;
    public IL i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f82o;
    public final ArrayList p;
    public long q;

    public PL(QL ql, RO ro) {
        AbstractC0048Bt.n(ql, "connectionPool");
        AbstractC0048Bt.n(ro, "route");
        this.b = ro;
        this.f82o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(EF ef, RO ro, IOException iOException) {
        AbstractC0048Bt.n(ef, "client");
        AbstractC0048Bt.n(ro, "failedRoute");
        AbstractC0048Bt.n(iOException, "failure");
        if (ro.b.type() != Proxy.Type.DIRECT) {
            C0683a2 c0683a2 = ro.a;
            c0683a2.g.connectFailed(c0683a2.h.h(), ro.b.address(), iOException);
        }
        C1818rJ c1818rJ = ef.F;
        synchronized (c1818rJ) {
            ((LinkedHashSet) c1818rJ.i).add(ro);
        }
    }

    @Override // o.AbstractC0280Kr
    public final synchronized void a(C0461Rr c0461Rr, XQ xq) {
        AbstractC0048Bt.n(xq, "settings");
        this.f82o = (xq.a & 16) != 0 ? xq.b[4] : Integer.MAX_VALUE;
    }

    @Override // o.AbstractC0280Kr
    public final void b(C0643Yr c0643Yr) {
        c0643Yr.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, InterfaceC2006u9 interfaceC2006u9) {
        RO ro;
        if (this.f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.b.a.j;
        C0266Kd c0266Kd = new C0266Kd(list);
        C0683a2 c0683a2 = this.b.a;
        if (c0683a2.c == null) {
            if (!list.contains(C0240Jd.f)) {
                throw new SO(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            C0897dI c0897dI = C0897dI.a;
            if (!C0897dI.a.h(str)) {
                throw new SO(new UnknownServiceException(AbstractC1888sN.k("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (c0683a2.i.contains(EnumC1359kL.m)) {
            throw new SO(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        SO so = null;
        do {
            try {
                RO ro2 = this.b;
                if (ro2.a.c != null && ro2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, interfaceC2006u9);
                    if (this.c == null) {
                        ro = this.b;
                        if (ro.a.c == null && ro.b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new SO(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, interfaceC2006u9);
                }
                g(c0266Kd, interfaceC2006u9);
                AbstractC0048Bt.n(this.b.c, "inetSocketAddress");
                ro = this.b;
                if (ro.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    HY.d(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    HY.d(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.f82o = 1;
                AbstractC0048Bt.n(this.b.c, "inetSocketAddress");
                if (so == null) {
                    so = new SO(e);
                } else {
                    AbstractC0946e20.e(so.h, e);
                    so.i = e;
                }
                if (!z) {
                    throw so;
                }
                c0266Kd.d = true;
                if (!c0266Kd.c) {
                    throw so;
                }
                if (e instanceof ProtocolException) {
                    throw so;
                }
                if (e instanceof InterruptedIOException) {
                    throw so;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw so;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw so;
                }
            }
        } while (e instanceof SSLException);
        throw so;
    }

    public final void e(int i, int i2, InterfaceC2006u9 interfaceC2006u9) {
        Socket createSocket;
        RO ro = this.b;
        Proxy proxy = ro.b;
        C0683a2 c0683a2 = ro.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : OL.a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = c0683a2.b.createSocket();
            AbstractC0048Bt.k(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        AbstractC0048Bt.n(this.b.c, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            C0897dI c0897dI = C0897dI.a;
            C0897dI.a.e(createSocket, this.b.c, i);
            try {
                this.h = AbstractC0946e20.h(AbstractC0946e20.Q(createSocket));
                this.i = AbstractC0946e20.g(AbstractC0946e20.P(createSocket));
            } catch (NullPointerException e) {
                if (AbstractC0048Bt.h(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, InterfaceC2006u9 interfaceC2006u9) {
        EN en = new EN();
        RO ro = this.b;
        C0932ds c0932ds = ro.a.h;
        AbstractC0048Bt.n(c0932ds, "url");
        en.a = c0932ds;
        en.c("CONNECT", null);
        C0683a2 c0683a2 = ro.a;
        en.b("Host", HY.u(c0683a2.h, true));
        en.b("Proxy-Connection", "Keep-Alive");
        en.b("User-Agent", "okhttp/4.12.0");
        FN a = en.a();
        C1787qr c1787qr = new C1787qr();
        AbstractC0048Bt.j("Proxy-Authenticate");
        AbstractC0048Bt.o("OkHttp-Preemptive", "Proxy-Authenticate");
        c1787qr.e("Proxy-Authenticate");
        c1787qr.b("Proxy-Authenticate", "OkHttp-Preemptive");
        c1787qr.d();
        c0683a2.f.getClass();
        C0932ds c0932ds2 = a.a;
        e(i, i2, interfaceC2006u9);
        String str = "CONNECT " + HY.u(c0932ds2, true) + " HTTP/1.1";
        JL jl = this.h;
        AbstractC0048Bt.k(jl);
        IL il = this.i;
        AbstractC0048Bt.k(il);
        C0202Hr c0202Hr = new C0202Hr(null, this, jl, il);
        NV timeout = jl.h.timeout();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(j);
        il.h.timeout().g(i3);
        c0202Hr.j(a.c, str);
        c0202Hr.a();
        C0903dO g = c0202Hr.g(false);
        AbstractC0048Bt.k(g);
        g.a = a;
        C0968eO a2 = g.a();
        int i4 = a2.k;
        long i5 = HY.i(a2);
        if (i5 != -1) {
            C0124Er i6 = c0202Hr.i(i5);
            HY.s(i6, Integer.MAX_VALUE);
            i6.close();
        }
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(AbstractC2188wx.g(i4, "Unexpected response code for CONNECT: "));
            }
            c0683a2.f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!jl.i.m() || !il.i.m()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(C0266Kd c0266Kd, InterfaceC2006u9 interfaceC2006u9) {
        EnumC1359kL enumC1359kL = EnumC1359kL.j;
        C0683a2 c0683a2 = this.b.a;
        SSLSocketFactory sSLSocketFactory = c0683a2.c;
        if (sSLSocketFactory == null) {
            List list = c0683a2.i;
            EnumC1359kL enumC1359kL2 = EnumC1359kL.m;
            if (!list.contains(enumC1359kL2)) {
                this.d = this.c;
                this.f = enumC1359kL;
                return;
            } else {
                this.d = this.c;
                this.f = enumC1359kL2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            AbstractC0048Bt.k(sSLSocketFactory);
            Socket socket = this.c;
            C0932ds c0932ds = c0683a2.h;
            Socket createSocket = sSLSocketFactory.createSocket(socket, c0932ds.d, c0932ds.e, true);
            AbstractC0048Bt.l(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C0240Jd a = c0266Kd.a(sSLSocket2);
                if (a.b) {
                    C0897dI c0897dI = C0897dI.a;
                    C0897dI.a.d(sSLSocket2, c0683a2.h.d, c0683a2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                AbstractC0048Bt.m(session, "sslSocketSession");
                C1457lr r = AbstractC0022At.r(session);
                HostnameVerifier hostnameVerifier = c0683a2.d;
                AbstractC0048Bt.k(hostnameVerifier);
                boolean verify = hostnameVerifier.verify(c0683a2.h.d, session);
                int i = 7;
                if (verify) {
                    C2099va c2099va = c0683a2.e;
                    AbstractC0048Bt.k(c2099va);
                    this.e = new C1457lr(r.a, r.b, r.c, new V7(c2099va, r, c0683a2, i));
                    c2099va.a(c0683a2.h.d, new LE(4, this));
                    if (a.b) {
                        C0897dI c0897dI2 = C0897dI.a;
                        str = C0897dI.a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = AbstractC0946e20.h(AbstractC0946e20.Q(sSLSocket2));
                    this.i = AbstractC0946e20.g(AbstractC0946e20.P(sSLSocket2));
                    if (str != null) {
                        enumC1359kL = AbstractC1473m3.A(str);
                    }
                    this.f = enumC1359kL;
                    C0897dI c0897dI3 = C0897dI.a;
                    C0897dI.a.a(sSLSocket2);
                    if (this.f == EnumC1359kL.l) {
                        l();
                        return;
                    }
                    return;
                }
                List a2 = r.a();
                if (a2.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + c0683a2.h.d + " not verified (no certificates)");
                }
                Object obj = a2.get(0);
                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(c0683a2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                C2099va c2099va2 = C2099va.c;
                sb.append(PX.D0(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                sb.append(AbstractC0720ac.A0(CF.a(x509Certificate, 7), CF.a(x509Certificate, 2)));
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(VT.u(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C0897dI c0897dI4 = C0897dI.a;
                    C0897dI.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    HY.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ab, code lost:
    
        if (o.CF.c(r5, (java.security.cert.X509Certificate) r11) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(C0683a2 c0683a2, List list) {
        C1457lr c1457lr;
        C0932ds c0932ds = c0683a2.h;
        byte[] bArr = HY.a;
        if (this.p.size() < this.f82o && !this.j) {
            RO ro = this.b;
            C0683a2 c0683a22 = ro.a;
            C0683a2 c0683a23 = ro.a;
            if (c0683a22.a(c0683a2)) {
                String str = c0932ds.d;
                String str2 = c0932ds.d;
                int i = 1;
                if (AbstractC0048Bt.h(str, c0683a23.h.d)) {
                    return true;
                }
                if (this.g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        RO ro2 = (RO) it.next();
                        Proxy.Type type = ro2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && ro.b.type() == type2 && AbstractC0048Bt.h(ro.c, ro2.c)) {
                            if (c0683a2.d == CF.a) {
                                byte[] bArr2 = HY.a;
                                C0932ds c0932ds2 = c0683a23.h;
                                if (c0932ds.e == c0932ds2.e) {
                                    if (!AbstractC0048Bt.h(str2, c0932ds2.d)) {
                                        if (!this.k && (c1457lr = this.e) != null) {
                                            List a = c1457lr.a();
                                            if (!a.isEmpty()) {
                                                Object obj = a.get(0);
                                                AbstractC0048Bt.l(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                            }
                                        }
                                    }
                                    try {
                                        C2099va c2099va = c0683a2.e;
                                        AbstractC0048Bt.k(c2099va);
                                        C1457lr c1457lr2 = this.e;
                                        AbstractC0048Bt.k(c1457lr2);
                                        List a2 = c1457lr2.a();
                                        AbstractC0048Bt.n(str2, "hostname");
                                        AbstractC0048Bt.n(a2, "peerCertificates");
                                        c2099va.a(str2, new V7(c2099va, a2, str2, i));
                                        return true;
                                    } catch (SSLPeerUnverifiedException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z) {
        long j;
        byte[] bArr = HY.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        AbstractC0048Bt.k(socket);
        Socket socket2 = this.d;
        AbstractC0048Bt.k(socket2);
        AbstractC0048Bt.k(this.h);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C0461Rr c0461Rr = this.g;
        if (c0461Rr != null) {
            synchronized (c0461Rr) {
                if (c0461Rr.m) {
                    return false;
                }
                if (c0461Rr.u < c0461Rr.t) {
                    if (nanoTime >= c0461Rr.v) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !r4.b();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final InterfaceC0610Xk j(EF ef, RL rl) {
        AbstractC0048Bt.n(ef, "client");
        int i = rl.g;
        Socket socket = this.d;
        AbstractC0048Bt.k(socket);
        JL jl = this.h;
        AbstractC0048Bt.k(jl);
        IL il = this.i;
        AbstractC0048Bt.k(il);
        C0461Rr c0461Rr = this.g;
        if (c0461Rr != null) {
            return new C0487Sr(ef, this, rl, c0461Rr);
        }
        socket.setSoTimeout(i);
        NV timeout = jl.h.timeout();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(j);
        il.h.timeout().g(rl.h);
        return new C0202Hr(ef, this, jl, il);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.d;
        AbstractC0048Bt.k(socket);
        JL jl = this.h;
        AbstractC0048Bt.k(jl);
        IL il = this.i;
        AbstractC0048Bt.k(il);
        socket.setSoTimeout(0);
        RU ru = RU.i;
        AbstractC0048Bt.n(ru, "taskRunner");
        C1343k5 c1343k5 = new C1343k5();
        c1343k5.h = ru;
        c1343k5.m = AbstractC0280Kr.a;
        String str = this.b.a.h.d;
        AbstractC0048Bt.n(str, "peerName");
        c1343k5.i = socket;
        String str2 = HY.g + ' ' + str;
        AbstractC0048Bt.n(str2, "<set-?>");
        c1343k5.j = str2;
        c1343k5.k = jl;
        c1343k5.l = il;
        c1343k5.m = this;
        C0461Rr c0461Rr = new C0461Rr(c1343k5);
        this.g = c0461Rr;
        XQ xq = C0461Rr.G;
        this.f82o = (xq.a & 16) != 0 ? xq.b[4] : Integer.MAX_VALUE;
        C0669Zr c0669Zr = c0461Rr.D;
        synchronized (c0669Zr) {
            try {
                if (c0669Zr.k) {
                    throw new IOException("closed");
                }
                Logger logger = C0669Zr.m;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(HY.g(">> CONNECTION " + AbstractC0228Ir.a.c(), new Object[0]));
                }
                c0669Zr.h.r(AbstractC0228Ir.a);
                c0669Zr.h.flush();
            } finally {
            }
        }
        C0669Zr c0669Zr2 = c0461Rr.D;
        XQ xq2 = c0461Rr.w;
        synchronized (c0669Zr2) {
            try {
                AbstractC0048Bt.n(xq2, "settings");
                if (c0669Zr2.k) {
                    throw new IOException("closed");
                }
                c0669Zr2.j(0, Integer.bitCount(xq2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & xq2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        c0669Zr2.h.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        c0669Zr2.h.writeInt(xq2.b[i]);
                    }
                    i++;
                }
                c0669Zr2.h.flush();
            } finally {
            }
        }
        if (c0461Rr.w.a() != 65535) {
            c0461Rr.D.v(r1 - 65535, 0);
        }
        ru.e().c(new C0409Pr(2, c0461Rr.E, c0461Rr.j), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        RO ro = this.b;
        sb.append(ro.a.h.d);
        sb.append(':');
        sb.append(ro.a.h.e);
        sb.append(", proxy=");
        sb.append(ro.b);
        sb.append(" hostAddress=");
        sb.append(ro.c);
        sb.append(" cipherSuite=");
        C1457lr c1457lr = this.e;
        if (c1457lr == null || (obj = c1457lr.b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
