package n1;

import C.g;
import Q0.q;
import i1.l;
import i1.m;
import i1.n;
import i1.o;
import i1.t;
import i1.u;
import i1.v;
import i1.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import m1.j;
import p1.C0280a;
import v1.k;
import v1.p;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3290a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3291b;

    public a(i1.b bVar) {
        X0.d.e(bVar, "cookieJar");
        this.f3291b = bVar;
    }

    public static int d(u uVar, int i) {
        String e2 = u.e(uVar, "Retry-After");
        if (e2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        X0.d.d(compile, "compile(...)");
        if (!compile.matcher(e2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(e2);
        X0.d.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i1.o
    public final u a(f fVar) {
        v vVar;
        q qVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        u1.c cVar;
        i1.d dVar;
        switch (this.f3290a) {
            case 0:
                H.e eVar = fVar.f3296e;
                T.u g2 = eVar.g();
                boolean z2 = false;
                l lVar = (l) eVar.d;
                String a2 = lVar.a("Host");
                n nVar = (n) eVar.f206c;
                if (a2 == null) {
                    g2.l("Host", j1.b.t(nVar, false));
                }
                if (lVar.a("Connection") == null) {
                    g2.l("Connection", "Keep-Alive");
                }
                if (lVar.a("Accept-Encoding") == null && lVar.a("Range") == null) {
                    g2.l("Accept-Encoding", "gzip");
                    z2 = true;
                }
                i1.b bVar = (i1.b) this.f3291b;
                bVar.getClass();
                X0.d.e(nVar, "url");
                if (lVar.a("User-Agent") == null) {
                    g2.l("User-Agent", "okhttp/4.12.0");
                }
                u b2 = fVar.b(g2.b());
                l lVar2 = b2.f2532f;
                e.b(bVar, nVar, lVar2);
                t f2 = b2.f();
                f2.f2518a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(u.e(b2, "Content-Encoding")) && e.a(b2) && (vVar = b2.f2533g) != null) {
                    k kVar = new k(vVar.f());
                    g c2 = lVar2.c();
                    c2.A("Content-Encoding");
                    c2.A("Content-Length");
                    f2.f2522f = c2.t().c();
                    u.e(b2, "Content-Type");
                    f2.f2523g = new v(-1L, new p(kVar), 1);
                }
                return f2.a();
            default:
                H.e eVar2 = fVar.f3296e;
                j jVar = fVar.f3293a;
                q qVar2 = q.f668a;
                u uVar = null;
                int i2 = 0;
                H.e eVar3 = eVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar.getClass();
                        if (jVar.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar) {
                            try {
                                if (jVar.f3241k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar.f3240j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            m1.n nVar2 = jVar.f3236c;
                            n nVar3 = (n) eVar3.f206c;
                            boolean z4 = nVar3.i;
                            i1.q qVar3 = jVar.f3234a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = qVar3.f2499o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                u1.c cVar2 = qVar3.f2503s;
                                dVar = qVar3.f2504t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            qVar = qVar2;
                            i = i2;
                            jVar.f3239g = new m1.f(nVar2, new i1.a(nVar3.d, nVar3.f2465e, qVar3.f2495k, qVar3.f2498n, sSLSocketFactory, cVar, dVar, qVar3.f2497m, qVar3.f2502r, qVar3.f2501q, qVar3.f2496l), jVar);
                        } else {
                            qVar = qVar2;
                            i = i2;
                        }
                        try {
                            if (jVar.f3243m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                u b3 = fVar.b(eVar3);
                                if (uVar != null) {
                                    t f3 = b3.f();
                                    t f4 = uVar.f();
                                    f4.f2523g = null;
                                    u a3 = f4.a();
                                    if (a3.f2533g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    f3.f2524j = a3;
                                    b3 = f3.a();
                                }
                                uVar = b3;
                                eVar3 = b(uVar, jVar.i);
                                if (eVar3 == null) {
                                    jVar.e(false);
                                    return uVar;
                                }
                                v vVar2 = uVar.f2533g;
                                if (vVar2 != null) {
                                    j1.b.b(vVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar.e(true);
                                qVar2 = qVar;
                            } catch (IOException e2) {
                                if (!c(e2, jVar, eVar3, !(e2 instanceof C0280a))) {
                                    Iterator it = qVar.iterator();
                                    while (it.hasNext()) {
                                        q1.d.a(e2, (Exception) it.next());
                                    }
                                    throw e2;
                                }
                                ArrayList arrayList = new ArrayList(qVar.size() + 1);
                                arrayList.addAll(qVar);
                                arrayList.add(e2);
                                jVar.e(true);
                                qVar2 = arrayList;
                                i2 = i;
                                z3 = false;
                            } catch (m1.o e3) {
                                q qVar4 = qVar;
                                if (!c(e3.f3266b, jVar, eVar3, false)) {
                                    IOException iOException = e3.f3265a;
                                    X0.d.e(iOException, "<this>");
                                    Iterator it2 = qVar4.iterator();
                                    while (it2.hasNext()) {
                                        q1.d.a(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e3.f3265a;
                                ArrayList arrayList2 = new ArrayList(qVar4.size() + 1);
                                arrayList2.addAll(qVar4);
                                arrayList2.add(iOException2);
                                jVar.e(true);
                                qVar2 = arrayList2;
                                z3 = false;
                                i2 = i;
                            }
                        } catch (Throwable th2) {
                            jVar.e(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public H.e b(u uVar, m1.e eVar) {
        String e2;
        m mVar;
        m1.m mVar2;
        w wVar = (eVar == null || (mVar2 = eVar.f3222e) == null) ? null : mVar2.f3249b;
        int i = uVar.d;
        String str = (String) uVar.f2528a.f205b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((i1.q) this.f3291b).f2493g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || X0.d.a(eVar.f3220b.f3224b.h.d, eVar.f3222e.f3249b.f2541a.h.d)) {
                    return null;
                }
                m1.m mVar3 = eVar.f3222e;
                synchronized (mVar3) {
                    mVar3.f3255k = true;
                }
                return uVar.f2528a;
            }
            if (i == 503) {
                u uVar2 = uVar.f2534j;
                if ((uVar2 == null || uVar2.d != 503) && d(uVar, Integer.MAX_VALUE) == 0) {
                    return uVar.f2528a;
                }
                return null;
            }
            if (i == 407) {
                X0.d.b(wVar);
                if (wVar.f2542b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((i1.q) this.f3291b).f2497m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((i1.q) this.f3291b).f2492f) {
                    return null;
                }
                u uVar3 = uVar.f2534j;
                if ((uVar3 == null || uVar3.d != 408) && d(uVar, 0) <= 0) {
                    return uVar.f2528a;
                }
                return null;
            }
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        i1.q qVar = (i1.q) this.f3291b;
        if (!qVar.h || (e2 = u.e(uVar, "Location")) == null) {
            return null;
        }
        H.e eVar2 = uVar.f2528a;
        n nVar = (n) eVar2.f206c;
        nVar.getClass();
        try {
            mVar = new m();
            mVar.c(nVar, e2);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        n a2 = mVar != null ? mVar.a() : null;
        if (a2 == null) {
            return null;
        }
        if (!X0.d.a(a2.f2462a, ((n) eVar2.f206c).f2462a) && !qVar.i) {
            return null;
        }
        T.u g2 = eVar2.g();
        if (i1.k.r(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = uVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g2.o(str, null);
            } else {
                g2.o("GET", null);
            }
            if (!z2) {
                ((g) g2.f752c).A("Transfer-Encoding");
                ((g) g2.f752c).A("Content-Length");
                ((g) g2.f752c).A("Content-Type");
            }
        }
        if (!j1.b.a((n) eVar2.f206c, a2)) {
            ((g) g2.f752c).A("Authorization");
        }
        g2.f750a = a2;
        return g2.b();
    }

    public boolean c(IOException iOException, j jVar, H.e eVar, boolean z2) {
        m1.p pVar;
        boolean i;
        m1.m mVar;
        if (!((i1.q) this.f3291b).f2492f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        m1.f fVar = jVar.f3239g;
        X0.d.b(fVar);
        int i2 = fVar.f3227f;
        if (i2 == 0 && fVar.f3228g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                w wVar = null;
                if (i2 <= 1 && fVar.f3228g <= 1 && fVar.h <= 0 && (mVar = fVar.f3225c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f3256l == 0) {
                            if (j1.b.a(mVar.f3249b.f2541a.h, fVar.f3224b.h)) {
                                wVar = mVar.f3249b;
                            }
                        }
                    }
                }
                if (wVar != null) {
                    fVar.i = wVar;
                } else {
                    H.j jVar2 = fVar.d;
                    if ((jVar2 == null || !jVar2.d()) && (pVar = fVar.f3226e) != null) {
                        i = pVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(i1.q qVar) {
        this.f3291b = qVar;
    }
}
