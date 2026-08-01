package i1;

import K.C0007g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0242k;

/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public static final List f2473A = j1.b.j(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: B, reason: collision with root package name */
    public static final List f2474B = j1.b.j(h.f2423e, h.f2424f);

    /* renamed from: a, reason: collision with root package name */
    public final T.t f2475a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2476b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2477c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2478e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2479f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2480g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2481j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2482k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2483l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2484m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2485n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2486o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2487p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2488q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2489r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2490s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2491t;

    /* renamed from: u, reason: collision with root package name */
    public final q f2492u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2493v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2494w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2495x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2496y;

    /* renamed from: z, reason: collision with root package name */
    public final C0242k f2497z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f2475a = oVar.f2455a;
        this.f2476b = oVar.f2456b;
        this.f2477c = j1.b.u(oVar.f2457c);
        this.d = j1.b.u(oVar.d);
        this.f2478e = oVar.f2458e;
        this.f2479f = oVar.f2459f;
        this.f2480g = oVar.f2460g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f2481j = oVar.f2461j;
        this.f2482k = oVar.f2462k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2483l = proxySelector == null ? s1.a.f3754a : proxySelector;
        this.f2484m = oVar.f2463l;
        this.f2485n = oVar.f2464m;
        List list2 = oVar.f2465n;
        this.f2488q = list2;
        this.f2489r = oVar.f2466o;
        this.f2490s = oVar.f2467p;
        this.f2493v = oVar.f2469r;
        this.f2494w = oVar.f2470s;
        this.f2495x = oVar.f2471t;
        this.f2496y = oVar.f2472u;
        this.f2497z = new C0242k();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2425a) {
                    q1.n nVar = q1.n.f3568a;
                    X509TrustManager m2 = q1.n.f3568a.m();
                    this.f2487p = m2;
                    this.f2486o = q1.n.f3568a.l(m2);
                    q b2 = q1.n.f3568a.b(m2);
                    this.f2492u = b2;
                    d dVar = oVar.f2468q;
                    this.f2491t = X0.e.a(dVar.f2402b, b2) ? dVar : new d(dVar.f2401a, b2);
                    list = this.f2477c;
                    X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    X0.e.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2487p;
                    q qVar = this.f2492u;
                    SSLSocketFactory sSLSocketFactory = this.f2486o;
                    List list4 = this.f2488q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2425a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (qVar == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (qVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!X0.e.a(this.f2491t, d.f2400c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2486o = null;
        this.f2492u = null;
        this.f2487p = null;
        this.f2491t = d.f2400c;
        list = this.f2477c;
        X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
