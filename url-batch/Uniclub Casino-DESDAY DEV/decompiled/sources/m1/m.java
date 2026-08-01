package m1;

import T.u;
import X.V;
import i1.q;
import i1.r;
import i1.s;
import i1.t;
import i1.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
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
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import l.C0238n;
import l.C0252u;
import v1.x;

/* loaded from: classes.dex */
public final class m extends p1.h {

    /* renamed from: b, reason: collision with root package name */
    public final w f3249b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f3250c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public i1.j f3251e;

    /* renamed from: f, reason: collision with root package name */
    public s f3252f;

    /* renamed from: g, reason: collision with root package name */
    public p1.o f3253g;
    public v1.p h;
    public v1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3254j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3255k;

    /* renamed from: l, reason: collision with root package name */
    public int f3256l;

    /* renamed from: m, reason: collision with root package name */
    public int f3257m;

    /* renamed from: n, reason: collision with root package name */
    public int f3258n;

    /* renamed from: o, reason: collision with root package name */
    public int f3259o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f3260p;

    /* renamed from: q, reason: collision with root package name */
    public long f3261q;

    public m(n nVar, w wVar) {
        X0.d.e(nVar, "connectionPool");
        X0.d.e(wVar, "route");
        this.f3249b = wVar;
        this.f3259o = 1;
        this.f3260p = new ArrayList();
        this.f3261q = Long.MAX_VALUE;
    }

    public static void d(q qVar, w wVar, IOException iOException) {
        X0.d.e(wVar, "failedRoute");
        X0.d.e(iOException, "failure");
        if (wVar.f2542b.type() != Proxy.Type.DIRECT) {
            i1.a aVar = wVar.f2541a;
            aVar.f2393g.connectFailed(aVar.h.g(), wVar.f2542b.address(), iOException);
        }
        C0238n c0238n = qVar.f2510z;
        synchronized (c0238n) {
            ((LinkedHashSet) c0238n.f3038a).add(wVar);
        }
    }

    @Override // p1.h
    public final synchronized void a(p1.o oVar, H.j jVar) {
        X0.d.e(oVar, "connection");
        X0.d.e(jVar, "settings");
        this.f3259o = (jVar.f220a & 16) != 0 ? ((int[]) jVar.f221b)[4] : Integer.MAX_VALUE;
    }

    @Override // p1.h
    public final void b(p1.w wVar) {
        wVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        w wVar;
        X0.d.e(jVar, "call");
        if (this.f3252f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f3249b.f2541a.f2394j;
        b bVar = new b(list);
        i1.a aVar = this.f3249b.f2541a;
        if (aVar.f2390c == null) {
            if (!list.contains(i1.h.f2433f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f3249b.f2541a.h.d;
            q1.n nVar = q1.n.f3579a;
            if (!q1.n.f3579a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(s.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                w wVar2 = this.f3249b;
                if (wVar2.f2541a.f2390c != null && wVar2.f2542b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f3250c == null) {
                        wVar = this.f3249b;
                        if (wVar.f2541a.f2390c == null && wVar.f2542b.type() == Proxy.Type.HTTP && this.f3250c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f3261q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                X0.d.e(this.f3249b.f2543c, "inetSocketAddress");
                wVar = this.f3249b;
                if (wVar.f2541a.f2390c == null) {
                }
                this.f3261q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    j1.b.c(socket);
                }
                Socket socket2 = this.f3250c;
                if (socket2 != null) {
                    j1.b.c(socket2);
                }
                this.d = null;
                this.f3250c = null;
                this.h = null;
                this.i = null;
                this.f3251e = null;
                this.f3252f = null;
                this.f3253g = null;
                this.f3259o = 1;
                X0.d.e(this.f3249b.f2543c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    q1.d.a(oVar.f3265a, e2);
                    oVar.f3266b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f3207c) {
                    throw oVar;
                }
                if (e2 instanceof ProtocolException) {
                    throw oVar;
                }
                if (e2 instanceof InterruptedIOException) {
                    throw oVar;
                }
                if ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) {
                    throw oVar;
                }
                if (e2 instanceof SSLPeerUnverifiedException) {
                    throw oVar;
                }
            }
        } while (e2 instanceof SSLException);
        throw oVar;
    }

    public final void e(int i, int i2, j jVar) {
        Socket createSocket;
        w wVar = this.f3249b;
        Proxy proxy = wVar.f2542b;
        i1.a aVar = wVar.f2541a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f3246a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f2389b.createSocket();
            X0.d.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f3250c = createSocket;
        InetSocketAddress inetSocketAddress = this.f3249b.f2543c;
        X0.d.e(jVar, "call");
        X0.d.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            q1.n nVar = q1.n.f3579a;
            q1.n.f3579a.e(createSocket, this.f3249b.f2543c, i);
            try {
                this.h = new v1.p(i1.k.x(createSocket));
                this.i = new v1.o(i1.k.w(createSocket));
            } catch (NullPointerException e2) {
                if (X0.d.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f3249b.f2543c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        u uVar = new u(4);
        w wVar = this.f3249b;
        i1.n nVar = wVar.f2541a.h;
        X0.d.e(nVar, "url");
        uVar.f750a = nVar;
        uVar.o("CONNECT", null);
        i1.a aVar = wVar.f2541a;
        uVar.l("Host", j1.b.t(aVar.h, true));
        uVar.l("Proxy-Connection", "Keep-Alive");
        uVar.l("User-Agent", "okhttp/4.12.0");
        H.e b2 = uVar.b();
        C.g gVar = new C.g(26);
        i1.k.f("Proxy-Authenticate");
        i1.k.h("OkHttp-Preemptive", "Proxy-Authenticate");
        gVar.A("Proxy-Authenticate");
        gVar.s("Proxy-Authenticate", "OkHttp-Preemptive");
        gVar.t();
        aVar.f2392f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + j1.b.t((i1.n) b2.f206c, true) + " HTTP/1.1";
        v1.p pVar = this.h;
        X0.d.b(pVar);
        v1.o oVar = this.i;
        X0.d.b(oVar);
        p pVar2 = new p(null, this, pVar, oVar);
        x a2 = pVar.f4069a.a();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.g(j2, timeUnit);
        oVar.f4066a.a().g(i3, timeUnit);
        pVar2.k((i1.l) b2.d, str);
        pVar2.a();
        t e2 = pVar2.e(false);
        X0.d.b(e2);
        e2.f2518a = b2;
        i1.u a3 = e2.a();
        long i4 = j1.b.i(a3);
        if (i4 != -1) {
            o1.d j3 = pVar2.j(i4);
            j1.b.r(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a3.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(V.d("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f2392f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f4070b.e() || !oVar.f4067b.e()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        i1.a aVar = this.f3249b.f2541a;
        SSLSocketFactory sSLSocketFactory = aVar.f2390c;
        s sVar = s.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            s sVar2 = s.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(sVar2)) {
                this.d = this.f3250c;
                this.f3252f = sVar;
                return;
            } else {
                this.d = this.f3250c;
                this.f3252f = sVar2;
                l();
                return;
            }
        }
        X0.d.e(jVar, "call");
        i1.a aVar2 = this.f3249b.f2541a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f2390c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            X0.d.b(sSLSocketFactory2);
            Socket socket = this.f3250c;
            i1.n nVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, nVar.d, nVar.f2465e, true);
            X0.d.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                i1.h a2 = bVar.a(sSLSocket2);
                if (a2.f2435b) {
                    q1.n nVar2 = q1.n.f3579a;
                    q1.n.f3579a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                X0.d.d(session, "sslSocketSession");
                i1.j C2 = q1.l.C(session);
                u1.c cVar = aVar2.d;
                X0.d.b(cVar);
                if (cVar.verify(aVar2.h.d, session)) {
                    i1.d dVar = aVar2.f2391e;
                    X0.d.b(dVar);
                    this.f3251e = new i1.j(C2.f2447a, C2.f2448b, C2.f2449c, new l(dVar, C2, aVar2));
                    X0.d.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f2410a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f2435b) {
                        q1.n nVar3 = q1.n.f3579a;
                        str = q1.n.f3579a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new v1.p(i1.k.x(sSLSocket2));
                    this.i = new v1.o(i1.k.w(sSLSocket2));
                    if (str != null) {
                        sVar = r.f(str);
                    }
                    this.f3252f = sVar;
                    q1.n nVar4 = q1.n.f3579a;
                    q1.n.f3579a.a(sSLSocket2);
                    if (this.f3252f == s.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = C2.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                X0.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                i1.d dVar2 = i1.d.f2409c;
                sb.append(q1.l.i0(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = u1.c.a(x509Certificate, 7);
                List a5 = u1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(e1.e.b0(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    q1.n nVar5 = q1.n.f3579a;
                    q1.n.f3579a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    j1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (u1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(i1.a aVar, ArrayList arrayList) {
        i1.j jVar;
        byte[] bArr = j1.b.f2609a;
        if (this.f3260p.size() < this.f3259o && !this.f3254j) {
            w wVar = this.f3249b;
            if (!wVar.f2541a.a(aVar)) {
                return false;
            }
            i1.n nVar = aVar.h;
            String str = nVar.d;
            i1.a aVar2 = wVar.f2541a;
            if (X0.d.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f3253g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w wVar2 = (w) it.next();
                    Proxy.Type type = wVar2.f2542b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && wVar.f2542b.type() == type2) {
                        if (X0.d.a(wVar.f2543c, wVar2.f2543c)) {
                            if (aVar.d != u1.c.f3816a) {
                                return false;
                            }
                            byte[] bArr2 = j1.b.f2609a;
                            i1.n nVar2 = aVar2.h;
                            if (nVar.f2465e == nVar2.f2465e) {
                                String str2 = nVar2.d;
                                String str3 = nVar.d;
                                if (!X0.d.a(str3, str2)) {
                                    if (!this.f3255k && (jVar = this.f3251e) != null) {
                                        List a2 = jVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            X0.d.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    i1.d dVar = aVar.f2391e;
                                    X0.d.b(dVar);
                                    i1.j jVar2 = this.f3251e;
                                    X0.d.b(jVar2);
                                    List a3 = jVar2.a();
                                    X0.d.e(str3, "hostname");
                                    X0.d.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f2410a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    it2.next().getClass();
                                    throw new ClassCastException();
                                } catch (SSLPeerUnverifiedException unused) {
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z2) {
        long j2;
        byte[] bArr = j1.b.f2609a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f3250c;
        X0.d.b(socket);
        Socket socket2 = this.d;
        X0.d.b(socket2);
        v1.p pVar = this.h;
        X0.d.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p1.o oVar = this.f3253g;
        if (oVar != null) {
            synchronized (oVar) {
                if (oVar.f3450f) {
                    return false;
                }
                if (oVar.f3456n < oVar.f3455m) {
                    if (nanoTime >= oVar.f3457o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f3261q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !pVar.e();
                socket2.setSoTimeout(soTimeout);
                return z3;
            } catch (Throwable th) {
                socket2.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final n1.d j(q qVar, n1.f fVar) {
        Socket socket = this.d;
        X0.d.b(socket);
        v1.p pVar = this.h;
        X0.d.b(pVar);
        v1.o oVar = this.i;
        X0.d.b(oVar);
        p1.o oVar2 = this.f3253g;
        if (oVar2 != null) {
            return new p1.p(qVar, this, fVar, oVar2);
        }
        int i = fVar.f3298g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f4069a.a().g(i, timeUnit);
        oVar.f4066a.a().g(fVar.h, timeUnit);
        return new p(qVar, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.f3254j = true;
    }

    public final void l() {
        Socket socket = this.d;
        X0.d.b(socket);
        v1.p pVar = this.h;
        X0.d.b(pVar);
        v1.o oVar = this.i;
        X0.d.b(oVar);
        socket.setSoTimeout(0);
        l1.d dVar = l1.d.h;
        C0252u c0252u = new C0252u(dVar);
        String str = this.f3249b.f2541a.h.d;
        X0.d.e(str, "peerName");
        c0252u.f3074b = socket;
        String str2 = j1.b.f2613f + ' ' + str;
        X0.d.e(str2, "<set-?>");
        c0252u.f3075c = str2;
        c0252u.d = pVar;
        c0252u.f3076e = oVar;
        c0252u.f3077f = this;
        p1.o oVar2 = new p1.o(c0252u);
        this.f3253g = oVar2;
        H.j jVar = p1.o.f3445z;
        int i = 4;
        this.f3259o = (jVar.f220a & 16) != 0 ? ((int[]) jVar.f221b)[4] : Integer.MAX_VALUE;
        p1.x xVar = oVar2.f3465w;
        synchronized (xVar) {
            try {
                if (xVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = p1.x.f3502f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(j1.b.g(">> CONNECTION " + p1.f.f3424a.b(), new Object[0]));
                }
                v1.o oVar3 = xVar.f3503a;
                v1.i iVar = p1.f.f3424a;
                oVar3.getClass();
                X0.d.e(iVar, "byteString");
                if (oVar3.f4068c) {
                    throw new IllegalStateException("closed");
                }
                oVar3.f4067b.q(iVar);
                oVar3.e();
                xVar.f3503a.flush();
            } finally {
            }
        }
        p1.x xVar2 = oVar2.f3465w;
        H.j jVar2 = oVar2.f3458p;
        synchronized (xVar2) {
            try {
                X0.d.e(jVar2, "settings");
                if (xVar2.d) {
                    throw new IOException("closed");
                }
                xVar2.g(0, Integer.bitCount(jVar2.f220a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & jVar2.f220a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        v1.o oVar4 = xVar2.f3503a;
                        if (oVar4.f4068c) {
                            throw new IllegalStateException("closed");
                        }
                        v1.f fVar = oVar4.f4067b;
                        v1.q o2 = fVar.o(2);
                        int i4 = o2.f4074c;
                        byte[] bArr = o2.f4072a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        o2.f4074c = i4 + 2;
                        fVar.f4052b += 2;
                        oVar4.e();
                        xVar2.f3503a.g(((int[]) jVar2.f221b)[i2]);
                    }
                    i2++;
                    i = 4;
                }
                xVar2.f3503a.flush();
            } finally {
            }
        }
        if (oVar2.f3458p.c() != 65535) {
            oVar2.f3465w.l(0, r2 - 65535);
        }
        dVar.e().c(new l1.b(oVar2.f3448c, oVar2.f3466x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        w wVar = this.f3249b;
        sb.append(wVar.f2541a.h.d);
        sb.append(':');
        sb.append(wVar.f2541a.h.f2465e);
        sb.append(", proxy=");
        sb.append(wVar.f2542b);
        sb.append(" hostAddress=");
        sb.append(wVar.f2543c);
        sb.append(" cipherSuite=");
        i1.j jVar = this.f3251e;
        if (jVar == null || (obj = jVar.f2448b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f3252f);
        sb.append('}');
        return sb.toString();
    }
}
