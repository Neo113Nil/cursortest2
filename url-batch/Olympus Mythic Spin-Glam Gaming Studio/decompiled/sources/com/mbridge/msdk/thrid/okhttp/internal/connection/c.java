package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.g;
import com.mbridge.msdk.thrid.okhttp.j;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.q;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.thrid.okio.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: RealConnection.java */
/* loaded from: classes4.dex */
public final class c extends g.j implements h {
    private final i b;
    private final c0 c;
    private Socket d;
    private Socket e;
    private q f;
    private w g;
    private com.mbridge.msdk.thrid.okhttp.internal.http2.g h;
    private com.mbridge.msdk.thrid.okio.e i;
    private com.mbridge.msdk.thrid.okio.d j;
    public boolean k;
    public int l;
    public int m = 1;
    public final List<Reference<g>> n = new ArrayList();
    public long o = Long.MAX_VALUE;

    public c(i iVar, c0 c0Var) {
        this.b = iVar;
        this.c = c0Var;
    }

    private y e() throws IOException {
        y a = new y.a().a(this.c.a().k()).a("CONNECT", (z) null).b("Host", com.mbridge.msdk.thrid.okhttp.internal.c.a(this.c.a().k(), true)).b("Proxy-Connection", "Keep-Alive").b("User-Agent", com.mbridge.msdk.thrid.okhttp.internal.d.a()).a();
        y a2 = this.c.a().g().a(this.c, new a0.a().a(a).a(w.HTTP_1_1).a(407).a("Preemptive Authenticate").a(com.mbridge.msdk.thrid.okhttp.internal.c.c).b(-1L).a(-1L).b("Proxy-Authenticate", "OkHttp-Preemptive").a());
        return a2 != null ? a2 : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i, int i2, int i3, int i4, boolean z, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) {
        if (this.g != null) {
            throw new IllegalStateException("already connected");
        }
        List<j> b = this.c.a().b();
        b bVar = new b(b);
        if (this.c.a().j() == null) {
            if (!b.contains(j.j)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String g = this.c.a().k().g();
            if (!com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(g)) {
                throw new e(new UnknownServiceException("CLEARTEXT communication to " + g + " not permitted by network security policy"));
            }
        } else if (this.c.a().e().contains(w.H2_PRIOR_KNOWLEDGE)) {
            throw new e(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        e eVar = null;
        do {
            try {
                try {
                    if (this.c.c()) {
                        a(i, i2, i3, dVar, oVar);
                        if (this.d == null) {
                            if (!this.c.c() && this.d == null) {
                                throw new e(new ProtocolException("Too many tunnel connections attempted: 21"));
                            }
                            if (this.h == null) {
                                synchronized (this.b) {
                                    this.m = this.h.k();
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        try {
                            a(i, i2, dVar, oVar);
                        } catch (IOException e) {
                            e = e;
                            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.e);
                            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.d);
                            this.e = null;
                            this.d = null;
                            this.i = null;
                            this.j = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            oVar.connectFailed(dVar, this.c.d(), this.c.b(), null, e);
                            if (eVar != null) {
                                eVar = new e(e);
                            } else {
                                eVar.a(e);
                            }
                            if (z) {
                                throw eVar;
                            }
                        }
                    }
                    a(bVar, i4, dVar, oVar);
                    oVar.connectEnd(dVar, this.c.d(), this.c.b(), this.g);
                    if (!this.c.c()) {
                    }
                    if (this.h == null) {
                    }
                } catch (IOException e2) {
                    e = e2;
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.e);
                    com.mbridge.msdk.thrid.okhttp.internal.c.a(this.d);
                    this.e = null;
                    this.d = null;
                    this.i = null;
                    this.j = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    oVar.connectFailed(dVar, this.c.d(), this.c.b(), null, e);
                    if (eVar != null) {
                    }
                    if (z) {
                    }
                }
            } catch (IOException e3) {
                e = e3;
            }
        } while (bVar.a(e));
        throw eVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public q b() {
        return this.f;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public c0 c() {
        return this.c;
    }

    public void d() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(this.d);
    }

    public boolean f() {
        return this.h != null;
    }

    public Socket g() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.c.a().k().g());
        sb.append(":");
        sb.append(this.c.a().k().j());
        sb.append(", proxy=");
        sb.append(this.c.b());
        sb.append(" hostAddress=");
        sb.append(this.c.d());
        sb.append(" cipherSuite=");
        q qVar = this.f;
        sb.append(qVar != null ? qVar.a() : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    private void a(int i, int i2, int i3, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        y e = e();
        s g = e.g();
        for (int i4 = 0; i4 < 21; i4++) {
            a(i, i2, dVar, oVar);
            e = a(i2, i3, e, g);
            if (e == null) {
                return;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(this.d);
            this.d = null;
            this.j = null;
            this.i = null;
            oVar.connectEnd(dVar, this.c.d(), this.c.b(), null);
        }
    }

    private void a(int i, int i2, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        Proxy b = this.c.b();
        this.d = (b.type() == Proxy.Type.DIRECT || b.type() == Proxy.Type.HTTP) ? this.c.a().i().createSocket() : new Socket(b);
        oVar.connectStart(dVar, this.c.d(), b);
        this.d.setSoTimeout(i2);
        try {
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(this.d, this.c.d(), i);
            try {
                this.i = l.a(l.b(this.d));
                this.j = l.a(l.a(this.d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.c.d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    private void a(b bVar, int i, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar) throws IOException {
        if (this.c.a().j() == null) {
            List<w> e = this.c.a().e();
            w wVar = w.H2_PRIOR_KNOWLEDGE;
            if (e.contains(wVar)) {
                this.e = this.d;
                this.g = wVar;
                a(i);
                return;
            } else {
                this.e = this.d;
                this.g = w.HTTP_1_1;
                return;
            }
        }
        oVar.secureConnectStart(dVar);
        a(bVar);
        oVar.secureConnectEnd(dVar, this.f);
        if (this.g == w.HTTP_2) {
            a(i);
        }
    }

    private void a(int i) throws IOException {
        this.e.setSoTimeout(0);
        com.mbridge.msdk.thrid.okhttp.internal.http2.g a = new g.h(true).a(this.e, this.c.a().k().g(), this.i, this.j).a(this).a(i).a();
        this.h = a;
        a.m();
    }

    private void a(b bVar) throws IOException {
        SSLSocket sSLSocket;
        com.mbridge.msdk.thrid.okhttp.a a = this.c.a();
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) a.j().createSocket(this.d, a.k().g(), a.k().j(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            j a2 = bVar.a(sSLSocket);
            if (a2.c()) {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket, a.k().g(), a.e());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            q a3 = q.a(session);
            if (!a.d().verify(a.k().g(), session)) {
                List<Certificate> b = a3.b();
                if (!b.isEmpty()) {
                    X509Certificate x509Certificate = (X509Certificate) b.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + a.k().g() + " not verified:\n    certificate: " + com.mbridge.msdk.thrid.okhttp.f.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.mbridge.msdk.thrid.okhttp.internal.tls.d.a(x509Certificate));
                }
                throw new SSLPeerUnverifiedException("Hostname " + a.k().g() + " not verified (no certificates)");
            }
            a.a().a(a.k().g(), a3.b());
            String b2 = a2.c() ? com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().b(sSLSocket) : null;
            this.e = sSLSocket;
            this.i = l.a(l.b(sSLSocket));
            this.j = l.a(l.a(this.e));
            this.f = a3;
            this.g = b2 != null ? w.a(b2) : w.HTTP_1_1;
            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket);
        } catch (AssertionError e2) {
            e = e2;
            if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(sSLSocket2);
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a((Socket) sSLSocket2);
            throw th;
        }
    }

    private y a(int i, int i2, y yVar, s sVar) throws IOException {
        String str = "CONNECT " + com.mbridge.msdk.thrid.okhttp.internal.c.a(sVar, true) + " HTTP/1.1";
        while (true) {
            com.mbridge.msdk.thrid.okhttp.internal.http1.a aVar = new com.mbridge.msdk.thrid.okhttp.internal.http1.a(null, null, this.i, this.j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.i.b().a(i, timeUnit);
            this.j.b().a(i2, timeUnit);
            aVar.a(yVar.c(), str);
            aVar.a();
            a0 a = aVar.a(false).a(yVar).a();
            long a2 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(a);
            if (a2 == -1) {
                a2 = 0;
            }
            com.mbridge.msdk.thrid.okio.s b = aVar.b(a2);
            com.mbridge.msdk.thrid.okhttp.internal.c.b(b, Integer.MAX_VALUE, timeUnit);
            b.close();
            int k = a.k();
            if (k == 200) {
                if (this.i.a().f() && this.j.a().f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (k == 407) {
                y a3 = this.c.a().g().a(this.c, a);
                if (a3 != null) {
                    if ("close".equalsIgnoreCase(a.b("Connection"))) {
                        return a3;
                    }
                    yVar = a3;
                } else {
                    throw new IOException("Failed to authenticate with proxy");
                }
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a.k());
            }
        }
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, c0 c0Var) {
        if (this.n.size() >= this.m || this.k || !com.mbridge.msdk.thrid.okhttp.internal.a.a.a(this.c.a(), aVar)) {
            return false;
        }
        if (aVar.k().g().equals(c().a().k().g())) {
            return true;
        }
        if (this.h == null || c0Var == null) {
            return false;
        }
        Proxy.Type type = c0Var.b().type();
        Proxy.Type type2 = Proxy.Type.DIRECT;
        if (type != type2 || this.c.b().type() != type2 || !this.c.d().equals(c0Var.d()) || c0Var.a().d() != com.mbridge.msdk.thrid.okhttp.internal.tls.d.a || !a(aVar.k())) {
            return false;
        }
        try {
            aVar.a().a(aVar.k().g(), b().b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public boolean a(s sVar) {
        if (sVar.j() != this.c.a().k().j()) {
            return false;
        }
        if (sVar.g().equals(this.c.a().k().g())) {
            return true;
        }
        return this.f != null && com.mbridge.msdk.thrid.okhttp.internal.tls.d.a.a(sVar.g(), (X509Certificate) this.f.b().get(0));
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(v vVar, t.a aVar, g gVar) throws SocketException {
        if (this.h != null) {
            return new com.mbridge.msdk.thrid.okhttp.internal.http2.f(vVar, aVar, gVar, this.h);
        }
        this.e.setSoTimeout(aVar.b());
        com.mbridge.msdk.thrid.okio.t b = this.i.b();
        long b2 = aVar.b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b.a(b2, timeUnit);
        this.j.b().a(aVar.c(), timeUnit);
        return new com.mbridge.msdk.thrid.okhttp.internal.http1.a(vVar, gVar, this.i, this.j);
    }

    public boolean a(boolean z) {
        if (this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar = this.h;
        if (gVar != null) {
            return gVar.f(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.e.getSoTimeout();
                try {
                    this.e.setSoTimeout(1);
                    return !this.i.f();
                } finally {
                    this.e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.i iVar) throws IOException {
        iVar.a(com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.g.j
    public void a(com.mbridge.msdk.thrid.okhttp.internal.http2.g gVar) {
        synchronized (this.b) {
            this.m = gVar.k();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.h
    public w a() {
        return this.g;
    }
}
