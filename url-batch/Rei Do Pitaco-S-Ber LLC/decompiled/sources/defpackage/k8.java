package defpackage;

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

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class k8 implements no {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public k8(tg tgVar) {
        tgVar.getClass();
        this.b = tgVar;
    }

    public static int d(zz zzVar, int i) {
        String m = zz.m(zzVar, "Retry-After");
        if (m == null) {
            return i;
        }
        Pattern compile = Pattern.compile("\\d+");
        compile.getClass();
        if (!compile.matcher(m).matches()) {
            return Integer.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(m);
        valueOf.getClass();
        return valueOf.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.util.ArrayList] */
    @Override // defpackage.no
    public final zz a(yx yxVar) {
        boolean z;
        boolean z2;
        b00 b00Var;
        ?? arrayList;
        SSLSocketFactory sSLSocketFactory;
        dv dvVar;
        j9 j9Var;
        switch (this.a) {
            case 0:
                tg tgVar = (tg) this.b;
                po poVar = yxVar.e;
                oe a = poVar.a();
                xn xnVar = (xn) poVar.b;
                nm nmVar = (nm) poVar.d;
                if (nmVar.a("Host") == null) {
                    z = false;
                    a.p("Host", z60.t(xnVar, false));
                } else {
                    z = false;
                }
                if (nmVar.a("Connection") == null) {
                    a.p("Connection", "Keep-Alive");
                }
                if (nmVar.a("Accept-Encoding") == null && nmVar.a("Range") == null) {
                    a.p("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = z;
                }
                tgVar.getClass();
                xnVar.getClass();
                if (nmVar.a("User-Agent") == null) {
                    a.p("User-Agent", "okhttp/4.12.0");
                }
                zz b = yxVar.b(a.d());
                nm nmVar2 = b.k;
                vn.b(tgVar, xnVar, nmVar2);
                yz n = b.n();
                n.a = poVar;
                if (z2 && "gzip".equalsIgnoreCase(zz.m(b, "Content-Encoding")) && vn.a(b) && (b00Var = b.l) != null) {
                    im imVar = new im(b00Var.o());
                    j0 c = nmVar2.c();
                    c.G("Content-Encoding");
                    c.G("Content-Length");
                    n.f = c.y().c();
                    n.g = new zx(zz.m(b, "Content-Type"), -1L, new px(imVar));
                }
                return n.a();
            default:
                po poVar2 = yxVar.e;
                tx txVar = yxVar.a;
                uh uhVar = uh.f;
                zz zzVar = null;
                int i = 0;
                po poVar3 = poVar2;
                while (true) {
                    boolean z3 = true;
                    while (txVar.n == null) {
                        synchronized (txVar) {
                            try {
                                if (txVar.p) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (txVar.o) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            xx xxVar = txVar.h;
                            xn xnVar2 = (xn) poVar3.b;
                            fv fvVar = txVar.f;
                            if (xnVar2.i) {
                                SSLSocketFactory sSLSocketFactory2 = fvVar.t;
                                if (sSLSocketFactory2 == null) {
                                    l8.u("CLEARTEXT-only client");
                                    return null;
                                }
                                dv dvVar2 = fvVar.x;
                                j9Var = fvVar.y;
                                sSLSocketFactory = sSLSocketFactory2;
                                dvVar = dvVar2;
                            } else {
                                sSLSocketFactory = null;
                                dvVar = null;
                                j9Var = null;
                            }
                            txVar.l = new gi(xxVar, new z1(xnVar2.d, xnVar2.e, fvVar.p, fvVar.s, sSLSocketFactory, dvVar, j9Var, fvVar.r, fvVar.w, fvVar.v, fvVar.q), txVar);
                        }
                        try {
                            if (txVar.r) {
                                throw new IOException("Canceled");
                            }
                            try {
                                try {
                                    zz b2 = yxVar.b(poVar3);
                                    if (zzVar != null) {
                                        yz n2 = b2.n();
                                        yz n3 = zzVar.n();
                                        n3.g = null;
                                        zz a2 = n3.a();
                                        if (a2.l != null) {
                                            throw new IllegalArgumentException("priorResponse.body != null");
                                        }
                                        n2.j = a2;
                                        b2 = n2.a();
                                    }
                                    zzVar = b2;
                                    poVar3 = b(zzVar, txVar.n);
                                    if (poVar3 == null) {
                                        txVar.e(false);
                                        return zzVar;
                                    }
                                    b00 b00Var2 = zzVar.l;
                                    if (b00Var2 != null) {
                                        z60.b(b00Var2);
                                    }
                                    i++;
                                    if (i > 20) {
                                        throw new ProtocolException("Too many follow-up requests: " + i);
                                    }
                                    txVar.e(true);
                                } catch (IOException e) {
                                    if (!c(e, txVar, poVar3, !(e instanceof ub))) {
                                        Iterator it = uhVar.iterator();
                                        while (it.hasNext()) {
                                            vv.b(e, (Exception) it.next());
                                        }
                                        throw e;
                                    }
                                    arrayList = new ArrayList(uhVar.size() + 1);
                                    arrayList.addAll(uhVar);
                                    arrayList.add(e);
                                    txVar.e(true);
                                    uhVar = arrayList;
                                    z3 = false;
                                }
                            } catch (j00 e2) {
                                boolean c2 = c(e2.g, txVar, poVar3, false);
                                IOException iOException = e2.f;
                                if (!c2) {
                                    iOException.getClass();
                                    Iterator it2 = uhVar.iterator();
                                    while (it2.hasNext()) {
                                        vv.b(iOException, (Exception) it2.next());
                                    }
                                    throw iOException;
                                }
                                arrayList = new ArrayList(uhVar.size() + 1);
                                arrayList.addAll(uhVar);
                                arrayList.add(iOException);
                                txVar.e(true);
                                uhVar = arrayList;
                                z3 = false;
                            }
                        } catch (Throwable th2) {
                            txVar.e(true);
                            throw th2;
                        }
                    }
                    l8.u("Check failed.");
                    return null;
                }
        }
    }

    public po b(zz zzVar, ei eiVar) {
        wn wnVar;
        zz zzVar2;
        wx wxVar;
        i00 i00Var = (eiVar == null || (wxVar = eiVar.e) == null) ? null : wxVar.b;
        int i = zzVar.i;
        String str = (String) zzVar.f.c;
        if (i != 307 && i != 308) {
            if (i == 401) {
                ((fv) this.b).l.getClass();
                return null;
            }
            if (i != 421) {
                if (i == 503) {
                    zz zzVar3 = zzVar.o;
                    if ((zzVar3 == null || zzVar3.i != 503) && d(zzVar, Integer.MAX_VALUE) == 0) {
                        return zzVar.f;
                    }
                } else {
                    if (i == 407) {
                        i00Var.getClass();
                        if (i00Var.b.type() != Proxy.Type.HTTP) {
                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                        }
                        ((fv) this.b).r.getClass();
                        return null;
                    }
                    if (i != 408) {
                        switch (i) {
                        }
                    } else if (((fv) this.b).k && (((zzVar2 = zzVar.o) == null || zzVar2.i != 408) && d(zzVar, 0) <= 0)) {
                        return zzVar.f;
                    }
                }
            } else if (eiVar != null && !oo.b(eiVar.b.b.h.d, eiVar.e.b.a.h.d)) {
                wx wxVar2 = eiVar.e;
                synchronized (wxVar2) {
                    wxVar2.k = true;
                }
                return zzVar.f;
            }
            return null;
        }
        fv fvVar = (fv) this.b;
        if (fvVar.m) {
            String m = zz.m(zzVar, "Location");
            po poVar = zzVar.f;
            if (m != null) {
                xn xnVar = (xn) poVar.b;
                xnVar.getClass();
                try {
                    wnVar = new wn(0);
                    wnVar.f(xnVar, m);
                } catch (IllegalArgumentException unused) {
                    wnVar = null;
                }
                xn b = wnVar != null ? wnVar.b() : null;
                if (b != null && (oo.b(b.a, ((xn) poVar.b).a) || fvVar.n)) {
                    oe a = poVar.a();
                    if (vv.E(str)) {
                        int i2 = zzVar.i;
                        boolean z = str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                        if (str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                            a.t(str, null);
                        } else {
                            a.t("GET", null);
                        }
                        if (!z) {
                            ((j0) a.h).G("Transfer-Encoding");
                            ((j0) a.h).G("Content-Length");
                            ((j0) a.h).G("Content-Type");
                        }
                    }
                    if (!z60.a((xn) poVar.b, b)) {
                        ((j0) a.h).G("Authorization");
                    }
                    a.f = b;
                    return a.d();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
    
        if (r6 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(IOException iOException, tx txVar, po poVar, boolean z) {
        boolean z2;
        y1 y1Var;
        wx wxVar;
        if (!((fv) this.b).k || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        gi giVar = txVar.l;
        giVar.getClass();
        int i = giVar.f;
        if (i == 0 && giVar.g == 0 && giVar.h == 0) {
            z2 = false;
        } else {
            if (giVar.i == null) {
                i00 i00Var = null;
                if (i <= 1 && giVar.g <= 1 && giVar.h <= 0 && (wxVar = giVar.c.m) != null) {
                    synchronized (wxVar) {
                        if (wxVar.l == 0) {
                            if (z60.a(wxVar.b.a.h, giVar.b.h)) {
                                i00Var = wxVar.b;
                            }
                        }
                    }
                }
                if (i00Var != null) {
                    giVar.i = i00Var;
                } else {
                    g2 g2Var = giVar.d;
                    if ((g2Var == null || !g2Var.c()) && (y1Var = giVar.e) != null) {
                        z2 = y1Var.j();
                    }
                }
            }
            z2 = true;
        }
        return z2;
    }

    public k8(fv fvVar) {
        this.b = fvVar;
    }
}
