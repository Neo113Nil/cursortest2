package i1;

import K.C0006g;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0238n;

/* loaded from: classes.dex */
public final class q implements Cloneable {

    /* renamed from: A, reason: collision with root package name */
    public static final List f2486A = j1.b.j(s.HTTP_2, s.HTTP_1_1);

    /* renamed from: B, reason: collision with root package name */
    public static final List f2487B = j1.b.j(h.f2432e, h.f2433f);

    /* renamed from: a, reason: collision with root package name */
    public final T.u f2488a;

    /* renamed from: b, reason: collision with root package name */
    public final C.g f2489b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2490c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0006g f2491e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2492f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2493g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2494j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2495k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2496l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2497m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2498n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2499o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2500p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2501q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2502r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2503s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2504t;

    /* renamed from: u, reason: collision with root package name */
    public final r f2505u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2506v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2507w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2508x;

    /* renamed from: y, reason: collision with root package name */
    public final int f2509y;

    /* renamed from: z, reason: collision with root package name */
    public final C0238n f2510z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(p pVar) {
        List list;
        this.f2488a = pVar.f2468a;
        this.f2489b = pVar.f2469b;
        this.f2490c = j1.b.u(pVar.f2470c);
        this.d = j1.b.u(pVar.d);
        this.f2491e = pVar.f2471e;
        this.f2492f = pVar.f2472f;
        this.f2493g = pVar.f2473g;
        this.h = pVar.h;
        this.i = pVar.i;
        this.f2494j = pVar.f2474j;
        this.f2495k = pVar.f2475k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2496l = proxySelector == null ? s1.a.f3764a : proxySelector;
        this.f2497m = pVar.f2476l;
        this.f2498n = pVar.f2477m;
        List list2 = pVar.f2478n;
        this.f2501q = list2;
        this.f2502r = pVar.f2479o;
        this.f2503s = pVar.f2480p;
        this.f2506v = pVar.f2482r;
        this.f2507w = pVar.f2483s;
        this.f2508x = pVar.f2484t;
        this.f2509y = pVar.f2485u;
        this.f2510z = new C0238n();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2434a) {
                    q1.n nVar = q1.n.f3579a;
                    X509TrustManager m2 = q1.n.f3579a.m();
                    this.f2500p = m2;
                    this.f2499o = q1.n.f3579a.l(m2);
                    r b2 = q1.n.f3579a.b(m2);
                    this.f2505u = b2;
                    d dVar = pVar.f2481q;
                    this.f2504t = X0.d.a(dVar.f2411b, b2) ? dVar : new d(dVar.f2410a, b2);
                    list = this.f2490c;
                    X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    X0.d.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2500p;
                    r rVar = this.f2505u;
                    SSLSocketFactory sSLSocketFactory = this.f2499o;
                    List list4 = this.f2501q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2434a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (rVar == null) {
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
                    if (rVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!X0.d.a(this.f2504t, d.f2409c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2499o = null;
        this.f2505u = null;
        this.f2500p = null;
        this.f2504t = d.f2409c;
        list = this.f2490c;
        X0.d.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
