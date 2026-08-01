package i1;

import K.C0007g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0249n;

/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public static final List f2479A = j1.b.j(r.HTTP_2, r.HTTP_1_1);

    /* renamed from: B, reason: collision with root package name */
    public static final List f2480B = j1.b.j(h.f2429e, h.f2430f);

    /* renamed from: a, reason: collision with root package name */
    public final T.u f2481a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2482b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2483c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2484e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2485f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2486g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2487j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2488k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2489l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2490m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2491n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2492o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2493p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2494q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2495r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2496s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2497t;

    /* renamed from: u, reason: collision with root package name */
    public final q f2498u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2499v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2500w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2501x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2502y;

    /* renamed from: z, reason: collision with root package name */
    public final C0249n f2503z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f2481a = oVar.f2461a;
        this.f2482b = oVar.f2462b;
        this.f2483c = j1.b.u(oVar.f2463c);
        this.d = j1.b.u(oVar.d);
        this.f2484e = oVar.f2464e;
        this.f2485f = oVar.f2465f;
        this.f2486g = oVar.f2466g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f2487j = oVar.f2467j;
        this.f2488k = oVar.f2468k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2489l = proxySelector == null ? s1.a.f3760a : proxySelector;
        this.f2490m = oVar.f2469l;
        this.f2491n = oVar.f2470m;
        List list2 = oVar.f2471n;
        this.f2494q = list2;
        this.f2495r = oVar.f2472o;
        this.f2496s = oVar.f2473p;
        this.f2499v = oVar.f2475r;
        this.f2500w = oVar.f2476s;
        this.f2501x = oVar.f2477t;
        this.f2502y = oVar.f2478u;
        this.f2503z = new C0249n();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2431a) {
                    q1.n nVar = q1.n.f3574a;
                    X509TrustManager m2 = q1.n.f3574a.m();
                    this.f2493p = m2;
                    this.f2492o = q1.n.f3574a.l(m2);
                    q b2 = q1.n.f3574a.b(m2);
                    this.f2498u = b2;
                    d dVar = oVar.f2474q;
                    this.f2497t = X0.d.a(dVar.f2408b, b2) ? dVar : new d(dVar.f2407a, b2);
                    list = this.f2483c;
                    X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    X0.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2493p;
                    q qVar = this.f2498u;
                    SSLSocketFactory sSLSocketFactory = this.f2492o;
                    List list4 = this.f2494q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2431a) {
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
                    if (!X0.d.a(this.f2497t, d.f2406c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2492o = null;
        this.f2498u = null;
        this.f2493p = null;
        this.f2497t = d.f2406c;
        list = this.f2483c;
        X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
