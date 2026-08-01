package C1;

import B1.n;
import B1.o;
import B1.q;
import E1.C0000a;
import K1.k;
import K1.p;
import U.v;
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
import l.C0265n;
import x1.j;
import x1.l;
import x1.m;
import x1.r;
import x1.s;
import x1.t;

/* loaded from: classes.dex */
public final class a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f250b;

    public a(x1.b bVar) {
        i1.f.e(bVar, "cookieJar");
        this.f250b = bVar;
    }

    public static int d(s sVar, int i) {
        String a2 = s.a("Retry-After", sVar);
        if (a2 == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        i1.f.d(compile, "compile(...)");
        if (!compile.matcher(a2).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a2);
        i1.f.d(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x1.m
    public final s a(g gVar) {
        h hVar;
        W0.s sVar;
        int i;
        SSLSocketFactory sSLSocketFactory;
        J1.c cVar;
        x1.d dVar;
        switch (this.f249a) {
            case 0:
                H.e eVar = gVar.f256e;
                v g2 = eVar.g();
                boolean z2 = false;
                j jVar = (j) eVar.d;
                String a2 = jVar.a("Host");
                l lVar = (l) eVar.f547c;
                if (a2 == null) {
                    g2.l("Host", y1.b.u(lVar, false));
                }
                if (jVar.a("Connection") == null) {
                    g2.l("Connection", "Keep-Alive");
                }
                if (jVar.a("Accept-Encoding") == null && jVar.a("Range") == null) {
                    g2.l("Accept-Encoding", "gzip");
                    z2 = true;
                }
                x1.b bVar = (x1.b) this.f250b;
                bVar.getClass();
                i1.f.e(lVar, "url");
                if (jVar.a("User-Agent") == null) {
                    g2.l("User-Agent", "okhttp/4.12.0");
                }
                s b2 = gVar.b(g2.b());
                j jVar2 = b2.f4604f;
                f.b(bVar, lVar, jVar2);
                r f2 = b2.f();
                f2.f4590a = eVar;
                if (z2 && "gzip".equalsIgnoreCase(s.a("Content-Encoding", b2)) && f.a(b2) && (hVar = b2.f4605g) != null) {
                    k kVar = new k(hVar.f());
                    C0265n c2 = jVar2.c();
                    c2.j("Content-Encoding");
                    c2.j("Content-Length");
                    f2.f4594f = c2.i().c();
                    f2.f4595g = new h(s.a("Content-Type", b2), -1L, new p(kVar), 0);
                }
                return f2.a();
            default:
                H.e eVar2 = gVar.f256e;
                B1.j jVar3 = gVar.f253a;
                W0.s sVar2 = W0.s.f1284a;
                s sVar3 = null;
                int i2 = 0;
                H.e eVar3 = eVar2;
                while (true) {
                    boolean z3 = true;
                    while (true) {
                        jVar3.getClass();
                        if (jVar3.i != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (jVar3) {
                            try {
                                if (jVar3.f196k) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jVar3.f195j) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            n nVar = jVar3.f191c;
                            l lVar2 = (l) eVar3.f547c;
                            boolean z4 = lVar2.i;
                            x1.p pVar = jVar3.f189a;
                            if (z4) {
                                SSLSocketFactory sSLSocketFactory2 = pVar.f4573o;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                J1.c cVar2 = pVar.f4577s;
                                dVar = pVar.f4578t;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                dVar = null;
                            }
                            sVar = sVar2;
                            i = i2;
                            jVar3.f194g = new B1.f(nVar, new x1.a(lVar2.d, lVar2.f4537e, pVar.f4569k, pVar.f4572n, sSLSocketFactory, cVar, dVar, pVar.f4571m, pVar.f4576r, pVar.f4575q, pVar.f4570l), jVar3);
                        } else {
                            sVar = sVar2;
                            i = i2;
                        }
                        try {
                            if (jVar3.f198m) {
                                throw new IOException("Canceled");
                            }
                            try {
                                s b3 = gVar.b(eVar3);
                                if (sVar3 != null) {
                                    r f3 = b3.f();
                                    r f4 = sVar3.f();
                                    f4.f4595g = null;
                                    s a3 = f4.a();
                                    if (a3.f4605g != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    f3.f4596j = a3;
                                    b3 = f3.a();
                                }
                                sVar3 = b3;
                                eVar3 = b(sVar3, jVar3.i);
                                if (eVar3 == null) {
                                    jVar3.e(false);
                                    return sVar3;
                                }
                                h hVar2 = sVar3.f4605g;
                                if (hVar2 != null) {
                                    y1.b.b(hVar2);
                                }
                                i2 = i + 1;
                                if (i2 > 20) {
                                    throw new ProtocolException("Too many follow-up requests: " + i2);
                                }
                                jVar3.e(true);
                                sVar2 = sVar;
                            } catch (o e2) {
                                W0.s sVar4 = sVar;
                                if (!c(e2.f221b, jVar3, eVar3, false)) {
                                    IOException iOException = e2.f220a;
                                    i1.f.e(iOException, "<this>");
                                    Iterator it = sVar4.iterator();
                                    while (it.hasNext()) {
                                        F1.d.k(iOException, (Exception) it.next());
                                    }
                                    throw iOException;
                                }
                                IOException iOException2 = e2.f220a;
                                ArrayList arrayList = new ArrayList(sVar4.size() + 1);
                                arrayList.addAll(sVar4);
                                arrayList.add(iOException2);
                                jVar3.e(true);
                                sVar2 = arrayList;
                                z3 = false;
                                i2 = i;
                            } catch (IOException e3) {
                                if (!c(e3, jVar3, eVar3, !(e3 instanceof C0000a))) {
                                    Iterator it2 = sVar.iterator();
                                    while (it2.hasNext()) {
                                        F1.d.k(e3, (Exception) it2.next());
                                    }
                                    throw e3;
                                }
                                ArrayList arrayList2 = new ArrayList(sVar.size() + 1);
                                arrayList2.addAll(sVar);
                                arrayList2.add(e3);
                                jVar3.e(true);
                                sVar2 = arrayList2;
                                i2 = i;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            jVar3.e(true);
                            throw th2;
                        }
                    }
                }
        }
    }

    public H.e b(s sVar, B1.e eVar) {
        String a2;
        x1.k kVar;
        B1.m mVar;
        t tVar = (eVar == null || (mVar = eVar.f177e) == null) ? null : mVar.f204b;
        int i = sVar.d;
        String str = (String) sVar.f4600a.f546b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((x1.p) this.f250b).f4567g.getClass();
                return null;
            }
            if (i == 421) {
                if (eVar == null || i1.f.a(eVar.f175b.f179b.h.d, eVar.f177e.f204b.f4610a.h.d)) {
                    return null;
                }
                B1.m mVar2 = eVar.f177e;
                synchronized (mVar2) {
                    mVar2.f210k = true;
                }
                return sVar.f4600a;
            }
            if (i == 503) {
                s sVar2 = sVar.f4606j;
                if ((sVar2 == null || sVar2.d != 503) && d(sVar, Integer.MAX_VALUE) == 0) {
                    return sVar.f4600a;
                }
                return null;
            }
            if (i == 407) {
                i1.f.b(tVar);
                if (tVar.f4611b.type() != Proxy.Type.HTTP) {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                ((x1.p) this.f250b).f4571m.getClass();
                return null;
            }
            if (i == 408) {
                if (!((x1.p) this.f250b).f4566f) {
                    return null;
                }
                s sVar3 = sVar.f4606j;
                if ((sVar3 == null || sVar3.d != 408) && d(sVar, 0) <= 0) {
                    return sVar.f4600a;
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
        x1.p pVar = (x1.p) this.f250b;
        if (!pVar.h || (a2 = s.a("Location", sVar)) == null) {
            return null;
        }
        H.e eVar2 = sVar.f4600a;
        l lVar = (l) eVar2.f547c;
        lVar.getClass();
        try {
            kVar = new x1.k();
            kVar.c(lVar, a2);
        } catch (IllegalArgumentException unused) {
            kVar = null;
        }
        l a3 = kVar != null ? kVar.a() : null;
        if (a3 == null) {
            return null;
        }
        if (!i1.f.a(a3.f4534a, ((l) eVar2.f547c).f4534a) && !pVar.i) {
            return null;
        }
        v g2 = eVar2.g();
        if (F1.l.d0(str)) {
            boolean equals = str.equals("PROPFIND");
            int i2 = sVar.d;
            boolean z2 = equals || i2 == 308 || i2 == 307;
            if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                g2.o(str, null);
            } else {
                g2.o("GET", null);
            }
            if (!z2) {
                ((C0265n) g2.f1209c).j("Transfer-Encoding");
                ((C0265n) g2.f1209c).j("Content-Length");
                ((C0265n) g2.f1209c).j("Content-Type");
            }
        }
        if (!y1.b.a((l) eVar2.f547c, a3)) {
            ((C0265n) g2.f1209c).j("Authorization");
        }
        g2.f1207a = a3;
        return g2.b();
    }

    public boolean c(IOException iOException, B1.j jVar, H.e eVar, boolean z2) {
        q qVar;
        boolean i;
        B1.m mVar;
        if (!((x1.p) this.f250b).f4566f) {
            return false;
        }
        if ((z2 && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !(((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) : (iOException instanceof SocketTimeoutException) && !z2)) {
            return false;
        }
        B1.f fVar = jVar.f194g;
        i1.f.b(fVar);
        int i2 = fVar.f182f;
        if (i2 == 0 && fVar.f183g == 0 && fVar.h == 0) {
            i = false;
        } else {
            if (fVar.i == null) {
                t tVar = null;
                if (i2 <= 1 && fVar.f183g <= 1 && fVar.h <= 0 && (mVar = fVar.f180c.h) != null) {
                    synchronized (mVar) {
                        if (mVar.f211l == 0) {
                            if (y1.b.a(mVar.f204b.f4610a.h, fVar.f179b.h)) {
                                tVar = mVar.f204b;
                            }
                        }
                    }
                }
                if (tVar != null) {
                    fVar.i = tVar;
                } else {
                    B1.p pVar = fVar.d;
                    if ((pVar == null || !pVar.c()) && (qVar = fVar.f181e) != null) {
                        i = qVar.i();
                    }
                }
            }
            i = true;
        }
        return i;
    }

    public a(x1.p pVar) {
        this.f250b = pVar;
    }
}
