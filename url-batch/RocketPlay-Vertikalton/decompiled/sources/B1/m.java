package B1;

import E1.AbstractC0001b;
import E1.D;
import E1.y;
import E1.z;
import K1.x;
import U.v;
import a1.AbstractC0067d;
import c1.AbstractC0104b;
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
import l.C0265n;
import x1.r;
import x1.s;
import x1.t;

/* loaded from: classes.dex */
public final class m extends E1.j {

    /* renamed from: b, reason: collision with root package name */
    public final t f204b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f205c;
    public Socket d;

    /* renamed from: e, reason: collision with root package name */
    public x1.i f206e;

    /* renamed from: f, reason: collision with root package name */
    public x1.q f207f;

    /* renamed from: g, reason: collision with root package name */
    public E1.q f208g;
    public K1.p h;
    public K1.o i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f209j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f210k;

    /* renamed from: l, reason: collision with root package name */
    public int f211l;

    /* renamed from: m, reason: collision with root package name */
    public int f212m;

    /* renamed from: n, reason: collision with root package name */
    public int f213n;

    /* renamed from: o, reason: collision with root package name */
    public int f214o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f215p;

    /* renamed from: q, reason: collision with root package name */
    public long f216q;

    public m(n nVar, t tVar) {
        i1.f.e(nVar, "connectionPool");
        i1.f.e(tVar, "route");
        this.f204b = tVar;
        this.f214o = 1;
        this.f215p = new ArrayList();
        this.f216q = Long.MAX_VALUE;
    }

    public static void d(x1.p pVar, t tVar, IOException iOException) {
        i1.f.e(tVar, "failedRoute");
        i1.f.e(iOException, "failure");
        if (tVar.f4611b.type() != Proxy.Type.DIRECT) {
            x1.a aVar = tVar.f4610a;
            aVar.f4472g.connectFailed(aVar.h.g(), tVar.f4611b.address(), iOException);
        }
        A1.d dVar = pVar.f4583y;
        synchronized (dVar) {
            ((LinkedHashSet) dVar.f38b).add(tVar);
        }
    }

    @Override // E1.j
    public final synchronized void a(E1.q qVar, D d) {
        i1.f.e(qVar, "connection");
        i1.f.e(d, "settings");
        this.f214o = (d.f288a & 16) != 0 ? d.f289b[4] : Integer.MAX_VALUE;
    }

    @Override // E1.j
    public final void b(y yVar) {
        yVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z2, j jVar) {
        t tVar;
        i1.f.e(jVar, "call");
        if (this.f207f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f204b.f4610a.f4473j;
        b bVar = new b(list);
        x1.a aVar = this.f204b.f4610a;
        if (aVar.f4469c == null) {
            if (!list.contains(x1.g.f4509f)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f204b.f4610a.h.d;
            F1.n nVar = F1.n.f424a;
            if (!F1.n.f424a.h(str)) {
                throw new o(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (aVar.i.contains(x1.q.H2_PRIOR_KNOWLEDGE)) {
            throw new o(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        o oVar = null;
        do {
            try {
                t tVar2 = this.f204b;
                if (tVar2.f4610a.f4469c != null && tVar2.f4611b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, jVar);
                    if (this.f205c == null) {
                        tVar = this.f204b;
                        if (tVar.f4610a.f4469c == null && tVar.f4611b.type() == Proxy.Type.HTTP && this.f205c == null) {
                            throw new o(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.f216q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, jVar);
                }
                g(bVar, jVar);
                i1.f.e(this.f204b.f4612c, "inetSocketAddress");
                tVar = this.f204b;
                if (tVar.f4610a.f4469c == null) {
                }
                this.f216q = System.nanoTime();
                return;
            } catch (IOException e2) {
                Socket socket = this.d;
                if (socket != null) {
                    y1.b.c(socket);
                }
                Socket socket2 = this.f205c;
                if (socket2 != null) {
                    y1.b.c(socket2);
                }
                this.d = null;
                this.f205c = null;
                this.h = null;
                this.i = null;
                this.f206e = null;
                this.f207f = null;
                this.f208g = null;
                this.f214o = 1;
                i1.f.e(this.f204b.f4612c, "inetSocketAddress");
                if (oVar == null) {
                    oVar = new o(e2);
                } else {
                    F1.d.k(oVar.f220a, e2);
                    oVar.f221b = e2;
                }
                if (!z2) {
                    throw oVar;
                }
                bVar.d = true;
                if (!bVar.f162c) {
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
        t tVar = this.f204b;
        Proxy proxy = tVar.f4611b;
        x1.a aVar = tVar.f4610a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : k.f201a[type.ordinal()];
        if (i3 == 1 || i3 == 2) {
            createSocket = aVar.f4468b.createSocket();
            i1.f.b(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f205c = createSocket;
        InetSocketAddress inetSocketAddress = this.f204b.f4612c;
        i1.f.e(jVar, "call");
        i1.f.e(inetSocketAddress, "inetSocketAddress");
        createSocket.setSoTimeout(i2);
        try {
            F1.n nVar = F1.n.f424a;
            F1.n.f424a.e(createSocket, this.f204b.f4612c, i);
            try {
                this.h = new K1.p(F1.d.p0(createSocket));
                this.i = new K1.o(F1.d.o0(createSocket));
            } catch (NullPointerException e2) {
                if (i1.f.a(e2.getMessage(), "throw with null exception")) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f204b.f4612c);
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, j jVar) {
        v vVar = new v(7);
        t tVar = this.f204b;
        x1.l lVar = tVar.f4610a.h;
        i1.f.e(lVar, "url");
        vVar.f1207a = lVar;
        vVar.o("CONNECT", null);
        x1.a aVar = tVar.f4610a;
        vVar.l("Host", y1.b.u(aVar.h, true));
        vVar.l("Proxy-Connection", "Keep-Alive");
        vVar.l("User-Agent", "okhttp/4.12.0");
        H.e b2 = vVar.b();
        C0265n c0265n = new C0265n(5);
        AbstractC0104b.e("Proxy-Authenticate");
        AbstractC0104b.f("OkHttp-Preemptive", "Proxy-Authenticate");
        c0265n.j("Proxy-Authenticate");
        c0265n.h("Proxy-Authenticate", "OkHttp-Preemptive");
        c0265n.i();
        aVar.f4471f.getClass();
        e(i, i2, jVar);
        String str = "CONNECT " + y1.b.u((x1.l) b2.f547c, true) + " HTTP/1.1";
        K1.p pVar = this.h;
        i1.f.b(pVar);
        K1.o oVar = this.i;
        i1.f.b(oVar);
        q qVar = new q(null, this, pVar, oVar);
        x b3 = pVar.f764a.b();
        long j2 = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b3.g(j2, timeUnit);
        oVar.f761a.b().g(i3, timeUnit);
        qVar.k((x1.j) b2.d, str);
        qVar.a();
        r f2 = qVar.f(false);
        i1.f.b(f2);
        f2.f4590a = b2;
        s a2 = f2.a();
        long i4 = y1.b.i(a2);
        if (i4 != -1) {
            D1.e j3 = qVar.j(i4);
            y1.b.s(j3, Integer.MAX_VALUE, timeUnit);
            j3.close();
        }
        int i5 = a2.d;
        if (i5 != 200) {
            if (i5 != 407) {
                throw new IOException(AbstractC0001b.f("Unexpected response code for CONNECT: ", i5));
            }
            aVar.f4471f.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!pVar.f765b.a() || !oVar.f762b.a()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final void g(b bVar, j jVar) {
        x1.a aVar = this.f204b.f4610a;
        SSLSocketFactory sSLSocketFactory = aVar.f4469c;
        x1.q qVar = x1.q.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = aVar.i;
            x1.q qVar2 = x1.q.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(qVar2)) {
                this.d = this.f205c;
                this.f207f = qVar;
                return;
            } else {
                this.d = this.f205c;
                this.f207f = qVar2;
                l();
                return;
            }
        }
        i1.f.e(jVar, "call");
        x1.a aVar2 = this.f204b.f4610a;
        SSLSocketFactory sSLSocketFactory2 = aVar2.f4469c;
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            i1.f.b(sSLSocketFactory2);
            Socket socket = this.f205c;
            x1.l lVar = aVar2.h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, lVar.d, lVar.f4537e, true);
            i1.f.c(createSocket, "null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                x1.g a2 = bVar.a(sSLSocket2);
                if (a2.f4511b) {
                    F1.n nVar = F1.n.f424a;
                    F1.n.f424a.d(sSLSocket2, aVar2.h.d, aVar2.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                i1.f.d(session, "sslSocketSession");
                x1.i i = AbstractC0067d.i(session);
                J1.c cVar = aVar2.d;
                i1.f.b(cVar);
                if (cVar.verify(aVar2.h.d, session)) {
                    x1.d dVar = aVar2.f4470e;
                    i1.f.b(dVar);
                    this.f206e = new x1.i(i.f4523a, i.f4524b, i.f4525c, new l(dVar, i, aVar2));
                    i1.f.e(aVar2.h.d, "hostname");
                    Iterator it = dVar.f4489a.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    if (a2.f4511b) {
                        F1.n nVar2 = F1.n.f424a;
                        str = F1.n.f424a.f(sSLSocket2);
                    }
                    this.d = sSLSocket2;
                    this.h = new K1.p(F1.d.p0(sSLSocket2));
                    this.i = new K1.o(F1.d.o0(sSLSocket2));
                    if (str != null) {
                        qVar = AbstractC0104b.l(str);
                    }
                    this.f207f = qVar;
                    F1.n nVar3 = F1.n.f424a;
                    F1.n.f424a.a(sSLSocket2);
                    if (this.f207f == x1.q.HTTP_2) {
                        l();
                        return;
                    }
                    return;
                }
                List a3 = i.a();
                if (a3.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + aVar2.h.d + " not verified (no certificates)");
                }
                Object obj = a3.get(0);
                i1.f.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                X509Certificate x509Certificate = (X509Certificate) obj;
                StringBuilder sb = new StringBuilder("\n              |Hostname ");
                sb.append(aVar2.h.d);
                sb.append(" not verified:\n              |    certificate: ");
                x1.d dVar2 = x1.d.f4488c;
                sb.append(AbstractC0067d.p(x509Certificate));
                sb.append("\n              |    DN: ");
                sb.append(x509Certificate.getSubjectDN().getName());
                sb.append("\n              |    subjectAltNames: ");
                List a4 = J1.c.a(x509Certificate, 7);
                List a5 = J1.c.a(x509Certificate, 2);
                ArrayList arrayList = new ArrayList(a5.size() + a4.size());
                arrayList.addAll(a4);
                arrayList.addAll(a5);
                sb.append(arrayList);
                sb.append("\n              ");
                throw new SSLPeerUnverifiedException(p1.e.C(sb.toString()));
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    F1.n nVar4 = F1.n.f424a;
                    F1.n.f424a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    y1.b.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if (J1.c.c(r1, (java.security.cert.X509Certificate) r11) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(x1.a aVar, ArrayList arrayList) {
        x1.i iVar;
        byte[] bArr = y1.b.f4648a;
        if (this.f215p.size() < this.f214o && !this.f209j) {
            t tVar = this.f204b;
            if (!tVar.f4610a.a(aVar)) {
                return false;
            }
            x1.l lVar = aVar.h;
            String str = lVar.d;
            x1.a aVar2 = tVar.f4610a;
            if (i1.f.a(str, aVar2.h.d)) {
                return true;
            }
            if (this.f208g != null && arrayList != null && !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    t tVar2 = (t) it.next();
                    Proxy.Type type = tVar2.f4611b.type();
                    Proxy.Type type2 = Proxy.Type.DIRECT;
                    if (type == type2 && tVar.f4611b.type() == type2) {
                        if (i1.f.a(tVar.f4612c, tVar2.f4612c)) {
                            if (aVar.d != J1.c.f612a) {
                                return false;
                            }
                            byte[] bArr2 = y1.b.f4648a;
                            x1.l lVar2 = aVar2.h;
                            if (lVar.f4537e == lVar2.f4537e) {
                                String str2 = lVar2.d;
                                String str3 = lVar.d;
                                if (!i1.f.a(str3, str2)) {
                                    if (!this.f210k && (iVar = this.f206e) != null) {
                                        List a2 = iVar.a();
                                        if (!a2.isEmpty()) {
                                            Object obj = a2.get(0);
                                            i1.f.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                                        }
                                    }
                                }
                                try {
                                    x1.d dVar = aVar.f4470e;
                                    i1.f.b(dVar);
                                    x1.i iVar2 = this.f206e;
                                    i1.f.b(iVar2);
                                    List a3 = iVar2.a();
                                    i1.f.e(str3, "hostname");
                                    i1.f.e(a3, "peerCertificates");
                                    Iterator it2 = dVar.f4489a.iterator();
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
        byte[] bArr = y1.b.f4648a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f205c;
        i1.f.b(socket);
        Socket socket2 = this.d;
        i1.f.b(socket2);
        K1.p pVar = this.h;
        i1.f.b(pVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        E1.q qVar = this.f208g;
        if (qVar != null) {
            synchronized (qVar) {
                if (qVar.f342f) {
                    return false;
                }
                if (qVar.f348n < qVar.f347m) {
                    if (nanoTime >= qVar.f349o) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j2 = nanoTime - this.f216q;
        }
        if (j2 < 10000000000L || !z2) {
            return true;
        }
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                boolean z3 = !pVar.a();
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

    public final C1.e j(x1.p pVar, C1.g gVar) {
        Socket socket = this.d;
        i1.f.b(socket);
        K1.p pVar2 = this.h;
        i1.f.b(pVar2);
        K1.o oVar = this.i;
        i1.f.b(oVar);
        E1.q qVar = this.f208g;
        if (qVar != null) {
            return new E1.r(pVar, this, gVar, qVar);
        }
        int i = gVar.f258g;
        socket.setSoTimeout(i);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar2.f764a.b().g(i, timeUnit);
        oVar.f761a.b().g(gVar.h, timeUnit);
        return new q(pVar, this, pVar2, oVar);
    }

    public final synchronized void k() {
        this.f209j = true;
    }

    public final void l() {
        Socket socket = this.d;
        i1.f.b(socket);
        K1.p pVar = this.h;
        i1.f.b(pVar);
        K1.o oVar = this.i;
        i1.f.b(oVar);
        socket.setSoTimeout(0);
        A1.f fVar = A1.f.h;
        E1.h hVar = new E1.h(fVar);
        String str = this.f204b.f4610a.h.d;
        i1.f.e(str, "peerName");
        hVar.f315b = socket;
        String str2 = y1.b.f4653g + ' ' + str;
        i1.f.e(str2, "<set-?>");
        hVar.f316c = str2;
        hVar.d = pVar;
        hVar.f317e = oVar;
        hVar.f318f = this;
        E1.q qVar = new E1.q(hVar);
        this.f208g = qVar;
        D d = E1.q.f337z;
        int i = 4;
        this.f214o = (d.f288a & 16) != 0 ? d.f289b[4] : Integer.MAX_VALUE;
        z zVar = qVar.f357w;
        synchronized (zVar) {
            try {
                if (zVar.d) {
                    throw new IOException("closed");
                }
                Logger logger = z.f394f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(y1.b.g(">> CONNECTION " + E1.g.f311a.b(), new Object[0]));
                }
                K1.o oVar2 = zVar.f395a;
                K1.i iVar = E1.g.f311a;
                oVar2.getClass();
                i1.f.e(iVar, "byteString");
                if (oVar2.f763c) {
                    throw new IllegalStateException("closed");
                }
                oVar2.f762b.K(iVar);
                oVar2.a();
                zVar.f395a.flush();
            } finally {
            }
        }
        z zVar2 = qVar.f357w;
        D d2 = qVar.f350p;
        synchronized (zVar2) {
            try {
                i1.f.e(d2, "settings");
                if (zVar2.d) {
                    throw new IOException("closed");
                }
                zVar2.h(0, Integer.bitCount(d2.f288a) * 6, 4, 0);
                int i2 = 0;
                while (i2 < 10) {
                    boolean z2 = true;
                    if (((1 << i2) & d2.f288a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        int i3 = i2 != i ? i2 != 7 ? i2 : i : 3;
                        K1.o oVar3 = zVar2.f395a;
                        if (oVar3.f763c) {
                            throw new IllegalStateException("closed");
                        }
                        K1.f fVar2 = oVar3.f762b;
                        K1.q I2 = fVar2.I(2);
                        int i4 = I2.f769c;
                        byte[] bArr = I2.f767a;
                        bArr[i4] = (byte) ((i3 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i3 & 255);
                        I2.f769c = i4 + 2;
                        fVar2.f746b += 2;
                        oVar3.a();
                        zVar2.f395a.h(d2.f289b[i2]);
                    }
                    i2++;
                    i = 4;
                }
                zVar2.f395a.flush();
            } finally {
            }
        }
        if (qVar.f350p.a() != 65535) {
            qVar.f357w.F(0, r2 - 65535);
        }
        fVar.e().c(new A1.b(qVar.f340c, qVar.f358x, 0), 0L);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        t tVar = this.f204b;
        sb.append(tVar.f4610a.h.d);
        sb.append(':');
        sb.append(tVar.f4610a.h.f4537e);
        sb.append(", proxy=");
        sb.append(tVar.f4611b);
        sb.append(" hostAddress=");
        sb.append(tVar.f4612c);
        sb.append(" cipherSuite=");
        x1.i iVar = this.f206e;
        if (iVar == null || (obj = iVar.f4524b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f207f);
        sb.append('}');
        return sb.toString();
    }
}
