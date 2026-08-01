package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class wx extends en {
    public final i00 b;
    public Socket c;
    public Socket d;
    public km e;
    public bx f;
    public mn g;
    public px h;
    public ox i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public wx(xx xxVar, i00 i00Var) {
        xxVar.getClass();
        i00Var.getClass();
        this.b = i00Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void d(fv fvVar, i00 i00Var, IOException iOException) {
        i00Var.getClass();
        iOException.getClass();
        if (i00Var.b.type() != Proxy.Type.DIRECT) {
            z1 z1Var = i00Var.a;
            z1Var.g.connectFailed(z1Var.h.g(), i00Var.b.address(), iOException);
        }
        uv uvVar = fvVar.D;
        synchronized (uvVar) {
            ((LinkedHashSet) uvVar.f).add(i00Var);
        }
    }

    @Override // defpackage.en
    public final synchronized void a(mn mnVar, k10 k10Var) {
        k10Var.getClass();
        this.o = (k10Var.a & 16) != 0 ? k10Var.b[4] : Integer.MAX_VALUE;
    }

    @Override // defpackage.en
    public final void b(tn tnVar) {
        tnVar.c(8, null);
    }

    public final void c(int i, int i2, int i3, boolean z, tx txVar) {
        i00 i00Var;
        if (this.f != null) {
            l8.u("already connected");
            return;
        }
        List list = this.b.a.j;
        xb xbVar = new xb(list);
        z1 z1Var = this.b.a;
        if (z1Var.c == null) {
            if (!list.contains(wb.f)) {
                throw new j00(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.b.a.h.d;
            jw jwVar = jw.a;
            if (!jw.a.h(str)) {
                throw new j00(new UnknownServiceException("CLEARTEXT communication to " + str + " not permitted by network security policy"));
            }
        } else if (z1Var.i.contains(bx.H2_PRIOR_KNOWLEDGE)) {
            throw new j00(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        j00 j00Var = null;
        do {
            try {
                i00 i00Var2 = this.b;
                if (i00Var2.a.c != null && i00Var2.b.type() == Proxy.Type.HTTP) {
                    f(i, i2, i3, txVar);
                    if (this.c == null) {
                        i00Var = this.b;
                        if (i00Var.a.c == null && i00Var.b.type() == Proxy.Type.HTTP && this.c == null) {
                            throw new j00(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        this.q = System.nanoTime();
                        return;
                    }
                } else {
                    e(i, i2, txVar);
                }
                g(xbVar, txVar);
                this.b.c.getClass();
                i00Var = this.b;
                if (i00Var.a.c == null) {
                }
                this.q = System.nanoTime();
                return;
            } catch (IOException e) {
                Socket socket = this.d;
                if (socket != null) {
                    z60.c(socket);
                }
                Socket socket2 = this.c;
                if (socket2 != null) {
                    z60.c(socket2);
                }
                this.d = null;
                this.c = null;
                this.h = null;
                this.i = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.o = 1;
                this.b.c.getClass();
                if (j00Var == null) {
                    j00Var = new j00(e);
                } else {
                    vv.b(j00Var.f, e);
                    j00Var.g = e;
                }
                if (!z) {
                    throw j00Var;
                }
                xbVar.d = true;
                if (!xbVar.c) {
                    throw j00Var;
                }
                if (e instanceof ProtocolException) {
                    throw j00Var;
                }
                if (e instanceof InterruptedIOException) {
                    throw j00Var;
                }
                if ((e instanceof SSLHandshakeException) && (e.getCause() instanceof CertificateException)) {
                    throw j00Var;
                }
                if (e instanceof SSLPeerUnverifiedException) {
                    throw j00Var;
                }
            }
        } while (e instanceof SSLException);
        throw j00Var;
    }

    public final void e(int i, int i2, tx txVar) {
        Socket createSocket;
        i00 i00Var = this.b;
        Proxy proxy = i00Var.b;
        z1 z1Var = i00Var.a;
        Proxy.Type type = proxy.type();
        int i3 = type == null ? -1 : ux.a[type.ordinal()];
        int i4 = 1;
        if (i3 == 1 || i3 == 2) {
            createSocket = z1Var.b.createSocket();
            createSocket.getClass();
        } else {
            createSocket = new Socket(proxy);
        }
        this.c = createSocket;
        this.b.c.getClass();
        createSocket.setSoTimeout(i2);
        try {
            jw jwVar = jw.a;
            jw.a.e(createSocket, this.b.c, i);
            try {
                Logger logger = gv.a;
                l20 l20Var = new l20(createSocket);
                InputStream inputStream = createSocket.getInputStream();
                inputStream.getClass();
                this.h = new px(new r6(l20Var, new r6(inputStream, l20Var, i4), 0));
                l20 l20Var2 = new l20(createSocket);
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.getClass();
                this.i = new ox(new q6(l20Var2, new q6(outputStream, l20Var2)));
            } catch (NullPointerException e) {
                if (oo.b(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.b.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void f(int i, int i2, int i3, tx txVar) {
        oe oeVar = new oe(6);
        i00 i00Var = this.b;
        xn xnVar = i00Var.a.h;
        xnVar.getClass();
        oeVar.f = xnVar;
        oeVar.t("CONNECT", null);
        z1 z1Var = i00Var.a;
        oeVar.p("Host", z60.t(z1Var.h, true));
        oeVar.p("Proxy-Connection", "Keep-Alive");
        oeVar.p("User-Agent", "okhttp/4.12.0");
        po d = oeVar.d();
        ArrayList arrayList = new ArrayList(20);
        vv.e("Proxy-Authenticate");
        vv.h("OkHttp-Preemptive", "Proxy-Authenticate");
        int i4 = 0;
        while (i4 < arrayList.size()) {
            if ("Proxy-Authenticate".equalsIgnoreCase((String) arrayList.get(i4))) {
                arrayList.remove(i4);
                arrayList.remove(i4);
                i4 -= 2;
            }
            i4 += 2;
        }
        arrayList.add("Proxy-Authenticate");
        arrayList.add(m30.x0("OkHttp-Preemptive").toString());
        z1Var.f.getClass();
        xn xnVar2 = (xn) d.b;
        e(i, i2, txVar);
        String str = "CONNECT " + z60.t(xnVar2, true) + " HTTP/1.1";
        px pxVar = this.h;
        pxVar.getClass();
        ox oxVar = this.i;
        oxVar.getClass();
        bn bnVar = new bn(null, this, pxVar, oxVar);
        pxVar.f.a().g(i2);
        oxVar.f.a().g(i3);
        bnVar.i((nm) d.d, str);
        bnVar.c();
        yz f = bnVar.f(false);
        f.getClass();
        f.a = d;
        zz a = f.a();
        int i5 = a.i;
        long h = z60.h(a);
        if (h != -1) {
            zm h2 = bnVar.h(h);
            z60.r(h2, Integer.MAX_VALUE);
            h2.close();
        }
        if (i5 == 200) {
            if (pxVar.g.n() && oxVar.g.n()) {
                return;
            }
            l8.y("TLS tunnel buffered too many bytes!");
            return;
        }
        if (i5 != 407) {
            l8.y(n20.e("Unexpected response code for CONNECT: ", i5));
        } else {
            z1Var.f.getClass();
            l8.y("Failed to authenticate with proxy");
        }
    }

    public final void g(xb xbVar, tx txVar) {
        bx bxVar = bx.HTTP_1_1;
        z1 z1Var = this.b.a;
        SSLSocketFactory sSLSocketFactory = z1Var.c;
        if (sSLSocketFactory == null) {
            List list = z1Var.i;
            bx bxVar2 = bx.H2_PRIOR_KNOWLEDGE;
            boolean contains = list.contains(bxVar2);
            Socket socket = this.c;
            if (!contains) {
                this.d = socket;
                this.f = bxVar;
                return;
            } else {
                this.d = socket;
                this.f = bxVar2;
                l();
                return;
            }
        }
        SSLSocket sSLSocket = null;
        String str = null;
        try {
            sSLSocketFactory.getClass();
            Socket socket2 = this.c;
            xn xnVar = z1Var.h;
            int i = 1;
            Socket createSocket = sSLSocketFactory.createSocket(socket2, xnVar.d, xnVar.e, true);
            createSocket.getClass();
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                wb a = xbVar.a(sSLSocket2);
                if (a.b) {
                    jw jwVar = jw.a;
                    jw.a.d(sSLSocket2, z1Var.h.d, z1Var.i);
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                session.getClass();
                km m = oo.m(session);
                HostnameVerifier hostnameVerifier = z1Var.d;
                hostnameVerifier.getClass();
                boolean verify = hostnameVerifier.verify(z1Var.h.d, session);
                int i2 = 0;
                if (!verify) {
                    List a2 = m.a();
                    if (a2.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + z1Var.h.d + " not verified (no certificates)");
                    }
                    Object obj = a2.get(0);
                    obj.getClass();
                    X509Certificate x509Certificate = (X509Certificate) obj;
                    StringBuilder sb = new StringBuilder("\n              |Hostname ");
                    sb.append(z1Var.h.d);
                    sb.append(" not verified:\n              |    certificate: ");
                    j9 j9Var = j9.c;
                    sb.append(vv.G(x509Certificate));
                    sb.append("\n              |    DN: ");
                    sb.append(x509Certificate.getSubjectDN().getName());
                    sb.append("\n              |    subjectAltNames: ");
                    List a3 = dv.a(x509Certificate, 7);
                    List a4 = dv.a(x509Certificate, 2);
                    ArrayList arrayList = new ArrayList(a4.size() + a3.size());
                    arrayList.addAll(a3);
                    arrayList.addAll(a4);
                    sb.append(arrayList);
                    sb.append("\n              ");
                    throw new SSLPeerUnverifiedException(n30.g0(sb.toString()));
                }
                j9 j9Var2 = z1Var.e;
                j9Var2.getClass();
                this.e = new km(m.a, m.b, m.c, new vx(j9Var2, m, z1Var));
                z1Var.h.d.getClass();
                Iterator it = j9Var2.a.iterator();
                if (it.hasNext()) {
                    n20.f(it.next());
                    throw null;
                }
                if (a.b) {
                    jw jwVar2 = jw.a;
                    str = jw.a.f(sSLSocket2);
                }
                this.d = sSLSocket2;
                Logger logger = gv.a;
                l20 l20Var = new l20(sSLSocket2);
                InputStream inputStream = sSLSocket2.getInputStream();
                inputStream.getClass();
                this.h = new px(new r6(l20Var, new r6(inputStream, l20Var, i), i2));
                l20 l20Var2 = new l20(sSLSocket2);
                OutputStream outputStream = sSLSocket2.getOutputStream();
                outputStream.getClass();
                this.i = new ox(new q6(l20Var2, new q6(outputStream, l20Var2)));
                if (str != null) {
                    bxVar = vv.q(str);
                }
                this.f = bxVar;
                jw jwVar3 = jw.a;
                jw.a.a(sSLSocket2);
                if (this.f == bx.HTTP_2) {
                    l();
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    jw jwVar4 = jw.a;
                    jw.a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    z60.c(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
    
        if (defpackage.dv.c(r5, (java.security.cert.X509Certificate) r10) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(z1 z1Var, List list) {
        km kmVar;
        xn xnVar = z1Var.h;
        byte[] bArr = z60.a;
        if (this.p.size() < this.o && !this.j) {
            i00 i00Var = this.b;
            z1 z1Var2 = i00Var.a;
            z1 z1Var3 = i00Var.a;
            if (z1Var2.a(z1Var)) {
                String str = xnVar.d;
                String str2 = xnVar.d;
                if (oo.b(str, z1Var3.h.d)) {
                    return true;
                }
                if (this.g != null && list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        i00 i00Var2 = (i00) it.next();
                        Proxy.Type type = i00Var2.b.type();
                        Proxy.Type type2 = Proxy.Type.DIRECT;
                        if (type == type2 && i00Var.b.type() == type2 && oo.b(i00Var.c, i00Var2.c)) {
                            if (z1Var.d == dv.a) {
                                byte[] bArr2 = z60.a;
                                xn xnVar2 = z1Var3.h;
                                if (xnVar.e == xnVar2.e) {
                                    if (!oo.b(str2, xnVar2.d)) {
                                        if (!this.k && (kmVar = this.e) != null) {
                                            List a = kmVar.a();
                                            if (!a.isEmpty()) {
                                                Object obj = a.get(0);
                                                obj.getClass();
                                            }
                                        }
                                    }
                                    try {
                                        j9 j9Var = z1Var.e;
                                        j9Var.getClass();
                                        km kmVar2 = this.e;
                                        kmVar2.getClass();
                                        List a2 = kmVar2.a();
                                        str2.getClass();
                                        a2.getClass();
                                        Iterator it2 = j9Var.a.iterator();
                                        if (!it2.hasNext()) {
                                            return true;
                                        }
                                        n20.f(it2.next());
                                        throw null;
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
        byte[] bArr = z60.a;
        long nanoTime = System.nanoTime();
        Socket socket = this.c;
        socket.getClass();
        Socket socket2 = this.d;
        socket2.getClass();
        this.h.getClass();
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        mn mnVar = this.g;
        if (mnVar != null) {
            synchronized (mnVar) {
                if (mnVar.k) {
                    return false;
                }
                if (mnVar.s < mnVar.r) {
                    if (nanoTime >= mnVar.t) {
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
                return !r4.m();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final fi j(fv fvVar, yx yxVar) {
        int i = yxVar.g;
        Socket socket = this.d;
        socket.getClass();
        px pxVar = this.h;
        pxVar.getClass();
        ox oxVar = this.i;
        oxVar.getClass();
        mn mnVar = this.g;
        if (mnVar != null) {
            return new nn(fvVar, this, yxVar, mnVar);
        }
        socket.setSoTimeout(i);
        pxVar.f.a().g(i);
        oxVar.f.a().g(yxVar.h);
        return new bn(fvVar, this, pxVar, oxVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() {
        Socket socket = this.d;
        socket.getClass();
        px pxVar = this.h;
        pxVar.getClass();
        ox oxVar = this.i;
        oxVar.getClass();
        socket.setSoTimeout(0);
        m40 m40Var = m40.h;
        e4 e4Var = new e4(m40Var);
        String str = this.b.a.h.d;
        str.getClass();
        e4Var.b = socket;
        e4Var.c = z60.g + ' ' + str;
        e4Var.d = pxVar;
        e4Var.e = oxVar;
        e4Var.f = this;
        mn mnVar = new mn(e4Var);
        this.g = mnVar;
        k10 k10Var = mn.E;
        this.o = (k10Var.a & 16) != 0 ? k10Var.b[4] : Integer.MAX_VALUE;
        un unVar = mnVar.B;
        synchronized (unVar) {
            try {
                if (unVar.i) {
                    throw new IOException("closed");
                }
                Logger logger = un.k;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(z60.f(">> CONNECTION " + cn.a.b(), new Object[0]));
                }
                unVar.f.j(cn.a);
                unVar.f.flush();
            } finally {
            }
        }
        un unVar2 = mnVar.B;
        k10 k10Var2 = mnVar.u;
        synchronized (unVar2) {
            try {
                k10Var2.getClass();
                if (unVar2.i) {
                    throw new IOException("closed");
                }
                unVar2.o(0, Integer.bitCount(k10Var2.a) * 6, 4, 0);
                int i = 0;
                while (i < 10) {
                    boolean z = true;
                    if (((1 << i) & k10Var2.a) == 0) {
                        z = false;
                    }
                    if (z) {
                        unVar2.f.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                        unVar2.f.writeInt(k10Var2.b[i]);
                    }
                    i++;
                }
                unVar2.f.flush();
            } finally {
            }
        }
        if (mnVar.u.a() != 65535) {
            mnVar.B.t(0, r9 - 65535);
        }
        m40Var.e().c(new kn(2, mnVar.C, mnVar.h), 0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        i00 i00Var = this.b;
        sb.append(i00Var.a.h.d);
        sb.append(':');
        sb.append(i00Var.a.h.e);
        sb.append(", proxy=");
        sb.append(i00Var.b);
        sb.append(" hostAddress=");
        sb.append(i00Var.c);
        sb.append(" cipherSuite=");
        km kmVar = this.e;
        sb.append(kmVar != null ? kmVar.b : "none");
        sb.append(" protocol=");
        sb.append(this.f);
        sb.append('}');
        return sb.toString();
    }
}
