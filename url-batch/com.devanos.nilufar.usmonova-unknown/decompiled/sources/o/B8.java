package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class B8 implements InterfaceC1789qt {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public B8(HO ho) {
        AbstractC0048Bt.n(ho, "cookieJar");
        this.b = ho;
    }

    public static int d(C0968eO c0968eO, int i) {
        String b = C0968eO.b("Retry-After", c0968eO);
        if (b == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        AbstractC0048Bt.m(compile, "compile(...)");
        if (!compile.matcher(b).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(b);
        AbstractC0048Bt.m(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        r3.d(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
    
        return r9;
     */
    @Override // o.InterfaceC1789qt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0968eO a(RL rl) {
        AbstractC1166hO abstractC1166hO;
        boolean z;
        SSLSocketFactory sSLSocketFactory;
        CF cf;
        C2099va c2099va;
        switch (this.a) {
            case 0:
                HO ho = (HO) this.b;
                FN fn = rl.e;
                C1852rr c1852rr = fn.c;
                EN a = fn.a();
                C0932ds c0932ds = fn.a;
                JN jn = fn.d;
                long j = -1;
                if (jn != null) {
                    NB contentType = jn.contentType();
                    if (contentType != null) {
                        a.b("Content-Type", contentType.a);
                    }
                    long contentLength = jn.contentLength();
                    if (contentLength != -1) {
                        a.b("Content-Length", String.valueOf(contentLength));
                        a.c.e("Transfer-Encoding");
                    } else {
                        a.b("Transfer-Encoding", "chunked");
                        a.c.e("Content-Length");
                    }
                }
                boolean z2 = false;
                if (c1852rr.j("Host") == null) {
                    a.b("Host", HY.u(c0932ds, false));
                }
                if (c1852rr.j("Connection") == null) {
                    a.b("Connection", "Keep-Alive");
                }
                if (c1852rr.j("Accept-Encoding") == null && c1852rr.j("Range") == null) {
                    a.b("Accept-Encoding", "gzip");
                    z2 = true;
                }
                ho.getClass();
                AbstractC0048Bt.n(c0932ds, "url");
                if (c1852rr.j("User-Agent") == null) {
                    a.b("User-Agent", "okhttp/4.12.0");
                }
                C0968eO b = rl.b(a.a());
                C1852rr c1852rr2 = b.m;
                AbstractC0736as.b(ho, c0932ds, c1852rr2);
                C0903dO c = b.c();
                c.a = fn;
                if (z2 && "gzip".equalsIgnoreCase(C0968eO.b("Content-Encoding", b)) && AbstractC0736as.a(b) && (abstractC1166hO = b.n) != null) {
                    C1063fr c1063fr = new C1063fr(abstractC1166hO.source());
                    C1787qr l = c1852rr2.l();
                    l.e("Content-Encoding");
                    l.e("Content-Length");
                    c.f = l.d().l();
                    c.g = new SL(C0968eO.b("Content-Type", b), j, AbstractC0946e20.h(c1063fr), 0);
                }
                return c.a();
            default:
                FN fn2 = rl.e;
                NL nl = rl.a;
                List list = C1318jk.h;
                C0968eO c0968eO = null;
                int i = 0;
                FN fn3 = fn2;
                while (true) {
                    boolean z3 = true;
                    while (nl.q == null) {
                        synchronized (nl) {
                            try {
                                if (nl.s) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (nl.r) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            QL ql = nl.j;
                            C0932ds c0932ds2 = fn3.a;
                            EF ef = nl.h;
                            if (c0932ds2.j) {
                                SSLSocketFactory sSLSocketFactory2 = ef.v;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                CF cf2 = ef.z;
                                c2099va = ef.A;
                                sSLSocketFactory = sSLSocketFactory2;
                                cf = cf2;
                            } else {
                                sSLSocketFactory = null;
                                cf = null;
                                c2099va = null;
                            }
                            nl.n = new C0636Yk(ql, new C0683a2(c0932ds2.d, c0932ds2.e, ef.r, ef.u, sSLSocketFactory, cf, c2099va, ef.t, ef.y, ef.x, ef.s), nl);
                        }
                        try {
                            if (nl.u) {
                                throw new IOException("Canceled");
                            }
                            try {
                                C0968eO b2 = rl.b(fn3);
                                if (c0968eO != null) {
                                    C0903dO c2 = b2.c();
                                    C0903dO c3 = c0968eO.c();
                                    c3.g = null;
                                    C0968eO a2 = c3.a();
                                    if (a2.n != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    c2.j = a2;
                                    b2 = c2.a();
                                }
                                c0968eO = b2;
                                C0584Wk c0584Wk = nl.q;
                                fn3 = b(c0968eO, c0584Wk);
                                if (fn3 != null) {
                                    z = false;
                                    JN jn2 = fn3.d;
                                    if (jn2 != null && jn2.isOneShot()) {
                                        break;
                                    } else {
                                        AbstractC1166hO abstractC1166hO2 = c0968eO.n;
                                        if (abstractC1166hO2 != null) {
                                            HY.c(abstractC1166hO2);
                                        }
                                        i++;
                                        if (i > 20) {
                                            throw new ProtocolException("Too many follow-up requests: " + i);
                                        }
                                        nl.d(true);
                                    }
                                } else {
                                    if (c0584Wk != null && c0584Wk.a) {
                                        if (nl.p) {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                        nl.p = true;
                                        nl.k.i();
                                    }
                                    z = false;
                                    break;
                                }
                            } catch (IOException e) {
                                if (!c(e, nl, fn3, !(e instanceof C0188Hd))) {
                                    Iterator it = list.iterator();
                                    while (it.hasNext()) {
                                        AbstractC0946e20.e(e, (Exception) it.next());
                                    }
                                    throw e;
                                }
                                list = AbstractC0720ac.B0(list, e);
                                nl.d(true);
                                z3 = false;
                            } catch (SO e2) {
                                if (!c(e2.i, nl, fn3, false)) {
                                    IOException iOException = e2.h;
                                    AbstractC0048Bt.n(iOException, "<this>");
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        AbstractC0946e20.e(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                list = AbstractC0720ac.B0(list, e2.h);
                                nl.d(true);
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            nl.d(true);
                            throw th2;
                        }
                    }
                    throw new IllegalStateException("Check failed.");
                }
        }
    }

    public FN b(C0968eO c0968eO, C0584Wk c0584Wk) {
        JN jn;
        C0968eO c0968eO2;
        PL pl;
        RO ro = (c0584Wk == null || (pl = (PL) c0584Wk.f) == null) ? null : pl.b;
        int i = c0968eO.k;
        FN fn = c0968eO.h;
        String str = fn.b;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((EF) this.b).n.getClass();
                return null;
            }
            if (i == 421) {
                JN jn2 = fn.d;
                if ((jn2 == null || !jn2.isOneShot()) && c0584Wk != null && !AbstractC0048Bt.h(((C0636Yk) c0584Wk.d).b.h.d, ((PL) c0584Wk.f).b.a.h.d)) {
                    PL pl2 = (PL) c0584Wk.f;
                    synchronized (pl2) {
                        pl2.k = true;
                    }
                    return c0968eO.h;
                }
            } else if (i == 503) {
                C0968eO c0968eO3 = c0968eO.q;
                if ((c0968eO3 == null || c0968eO3.k != 503) && d(c0968eO, Integer.MAX_VALUE) == 0) {
                    return c0968eO.h;
                }
            } else {
                if (i == 407) {
                    AbstractC0048Bt.k(ro);
                    if (ro.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((EF) this.b).t.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                    }
                } else if (((EF) this.b).m && (((jn = fn.d) == null || !jn.isOneShot()) && (((c0968eO2 = c0968eO.q) == null || c0968eO2.k != 408) && d(c0968eO, 0) <= 0))) {
                    return c0968eO.h;
                }
            }
            return null;
        }
        EF ef = (EF) this.b;
        if (ef.f37o) {
            String b = C0968eO.b("Location", c0968eO);
            FN fn2 = c0968eO.h;
            if (b != null) {
                C0932ds c0932ds = fn2.a;
                c0932ds.getClass();
                C0867cs f = c0932ds.f(b);
                C0932ds a = f != null ? f.a() : null;
                if (a != null && (AbstractC0048Bt.h(a.a, fn2.a.a) || ef.p)) {
                    EN a2 = fn2.a();
                    if (AbstractC0946e20.D(str)) {
                        int i2 = c0968eO.k;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            a2.c(str, z ? fn2.d : null);
                        } else {
                            a2.c("GET", null);
                        }
                        if (!z) {
                            a2.c.e("Transfer-Encoding");
                            a2.c.e("Content-Length");
                            a2.c.e("Content-Type");
                        }
                    }
                    if (!HY.a(fn2.a, a)) {
                        a2.c.e("Authorization");
                    }
                    a2.a = a;
                    return a2.a();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r7 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(IOException iOException, NL nl, FN fn, boolean z) {
        boolean z2;
        L4 l4;
        PL pl;
        JN jn;
        if (!((EF) this.b).m || ((z && (((jn = fn.d) != null && jn.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        C0636Yk c0636Yk = nl.n;
        AbstractC0048Bt.k(c0636Yk);
        int i = c0636Yk.f;
        if (i == 0 && c0636Yk.g == 0 && c0636Yk.h == 0) {
            z2 = false;
        } else {
            if (c0636Yk.i == null) {
                RO ro = null;
                if (i <= 1 && c0636Yk.g <= 1 && c0636Yk.h <= 0 && (pl = c0636Yk.c.f72o) != null) {
                    synchronized (pl) {
                        if (pl.l == 0) {
                            if (HY.a(pl.b.a.h, c0636Yk.b.h)) {
                                ro = pl.b;
                            }
                        }
                    }
                }
                if (ro != null) {
                    c0636Yk.i = ro;
                } else {
                    EI ei = c0636Yk.d;
                    if ((ei == null || !ei.a()) && (l4 = c0636Yk.e) != null) {
                        z2 = l4.d();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public B8(EF ef) {
        AbstractC0048Bt.n(ef, "client");
        this.b = ef;
    }
}
