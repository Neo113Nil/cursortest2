package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.ironsource.C4701ic;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.s;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.pubmatic.sdk.video.POBVastError;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import io.bidmachine.util.network.NetworkUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: RetryAndFollowUpInterceptor.java */
/* loaded from: classes14.dex */
public final class j implements t {
    private final v a;
    private final boolean b;
    private volatile com.mbridge.msdk.thrid.okhttp.internal.connection.g c;
    private Object d;
    private volatile boolean e;

    public j(v vVar, boolean z) {
        this.a = vVar;
        this.b = z;
    }

    public void a() {
        this.e = true;
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar = this.c;
        if (gVar != null) {
            gVar.a();
        }
    }

    public boolean b() {
        return this.e;
    }

    public void a(Object obj) {
        this.d = obj;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t
    public a0 a(t.a aVar) throws IOException {
        a0 a;
        y a2;
        y d = aVar.d();
        g gVar = (g) aVar;
        com.mbridge.msdk.thrid.okhttp.d e = gVar.e();
        o g = gVar.g();
        com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar2 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.a.f(), a(d.g()), e, g, this.d);
        this.c = gVar2;
        int i = 0;
        a0 a0Var = null;
        while (!this.e) {
            try {
                try {
                    a = gVar.a(d, gVar2, null, null);
                    if (a0Var != null) {
                        a = a.p().d(a0Var.p().a((b0) null).a()).a();
                    }
                    try {
                        a2 = a(a, gVar2.h());
                    } catch (IOException e2) {
                        gVar2.f();
                        throw e2;
                    }
                } catch (com.mbridge.msdk.thrid.okhttp.internal.connection.e e3) {
                    if (!a(e3.g(), gVar2, false, d)) {
                        throw e3.d();
                    }
                } catch (IOException e4) {
                    if (!a(e4, gVar2, !(e4 instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a), d)) {
                        throw e4;
                    }
                }
                if (a2 == null) {
                    gVar2.f();
                    return a;
                }
                com.mbridge.msdk.thrid.okhttp.internal.c.a(a.d());
                int i2 = i + 1;
                if (i2 <= 20) {
                    a2.a();
                    if (!a(a, a2.g())) {
                        gVar2.f();
                        gVar2 = new com.mbridge.msdk.thrid.okhttp.internal.connection.g(this.a.f(), a(a2.g()), e, g, this.d);
                        this.c = gVar2;
                    } else if (gVar2.b() != null) {
                        throw new IllegalStateException("Closing the body of " + a + " didn't close its backing stream. Bad interceptor?");
                    }
                    a0Var = a;
                    d = a2;
                    i = i2;
                } else {
                    gVar2.f();
                    throw new ProtocolException("Too many follow-up requests: " + i2);
                }
            } catch (Throwable th) {
                gVar2.a((IOException) null);
                gVar2.f();
                throw th;
            }
        }
        gVar2.f();
        throw new IOException("Canceled");
    }

    private com.mbridge.msdk.thrid.okhttp.a a(s sVar) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        com.mbridge.msdk.thrid.okhttp.f fVar;
        if (sVar.h()) {
            sSLSocketFactory = this.a.B();
            hostnameVerifier = this.a.o();
            fVar = this.a.c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            fVar = null;
        }
        return new com.mbridge.msdk.thrid.okhttp.a(sVar.g(), sVar.j(), this.a.k(), this.a.A(), sSLSocketFactory, hostnameVerifier, fVar, this.a.w(), this.a.v(), this.a.u(), this.a.g(), this.a.x());
    }

    private boolean a(IOException iOException, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, boolean z, y yVar) {
        gVar.a(iOException);
        if (this.a.z()) {
            return !(z && a(iOException, yVar)) && a(iOException, z) && gVar.d();
        }
        return false;
    }

    private boolean a(IOException iOException, y yVar) {
        yVar.a();
        return iOException instanceof FileNotFoundException;
    }

    private boolean a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private y a(a0 a0Var, c0 c0Var) throws IOException {
        String b;
        s e;
        if (a0Var != null) {
            int k = a0Var.k();
            String e2 = a0Var.s().e();
            if (k == 307 || k == 308) {
                if (!e2.equals(C4701ic.a) && !e2.equals("HEAD")) {
                    return null;
                }
            } else {
                if (k == 401) {
                    return this.a.a().a(c0Var, a0Var);
                }
                if (k == 503) {
                    if ((a0Var.q() == null || a0Var.q().k() != 503) && a(a0Var, Integer.MAX_VALUE) == 0) {
                        return a0Var.s();
                    }
                    return null;
                }
                if (k == 407) {
                    if (c0Var.b().type() == Proxy.Type.HTTP) {
                        return this.a.w().a(c0Var, a0Var);
                    }
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                if (k == 408) {
                    if (!this.a.z()) {
                        return null;
                    }
                    a0Var.s().a();
                    if ((a0Var.q() == null || a0Var.q().k() != 408) && a(a0Var, 0) <= 0) {
                        return a0Var.s();
                    }
                    return null;
                }
                switch (k) {
                    case 300:
                    case 301:
                    case 302:
                    case POBVastError.NO_VAST_RESPONSE /* 303 */:
                        break;
                    default:
                        return null;
                }
            }
            if (!this.a.m() || (b = a0Var.b(NetworkUtils.HEADER_LOCATION)) == null || (e = a0Var.s().g().e(b)) == null) {
                return null;
            }
            if (!e.m().equals(a0Var.s().g().m()) && !this.a.n()) {
                return null;
            }
            y.a f = a0Var.s().f();
            if (f.a(e2)) {
                boolean c = f.c(e2);
                if (f.b(e2)) {
                    f.a(C4701ic.a, (z) null);
                } else {
                    f.a(e2, c ? a0Var.s().a() : null);
                }
                if (!c) {
                    f.a("Transfer-Encoding");
                    f.a(NetworkUtils.HEADER_CONTENT_LENGTH);
                    f.a("Content-Type");
                }
            }
            if (!a(a0Var, e)) {
                f.a("Authorization");
            }
            return f.a(e).a();
        }
        throw new IllegalStateException();
    }

    private int a(a0 a0Var, int i) {
        String b = a0Var.b(CommonGatewayClient.HEADER_RETRY_AFTER);
        if (b == null) {
            return i;
        }
        if (b.matches("\\d+")) {
            return Integer.valueOf(b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    private boolean a(a0 a0Var, s sVar) {
        s g = a0Var.s().g();
        return g.g().equals(sVar.g()) && g.j() == sVar.j() && g.m().equals(sVar.m());
    }
}
