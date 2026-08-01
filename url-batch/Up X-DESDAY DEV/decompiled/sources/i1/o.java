package i1;

import K.C0007g;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0249n;

/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final T.u f2460a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.d f2461b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2462c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0007g f2463e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2464f;

    /* renamed from: g, reason: collision with root package name */
    public final b f2465g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f2466j;

    /* renamed from: k, reason: collision with root package name */
    public final b f2467k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f2468l;

    /* renamed from: m, reason: collision with root package name */
    public final b f2469m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f2470n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f2471o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f2472p;

    /* renamed from: q, reason: collision with root package name */
    public final List f2473q;

    /* renamed from: r, reason: collision with root package name */
    public final List f2474r;

    /* renamed from: s, reason: collision with root package name */
    public final u1.c f2475s;

    /* renamed from: t, reason: collision with root package name */
    public final d f2476t;

    /* renamed from: u, reason: collision with root package name */
    public final p f2477u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2478v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2479w;

    /* renamed from: x, reason: collision with root package name */
    public final int f2480x;

    /* renamed from: y, reason: collision with root package name */
    public final C0249n f2481y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f2459z = j1.b.j(q.HTTP_2, q.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f2458A = j1.b.j(h.f2426e, h.f2427f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o() {
        List list;
        T.u uVar = new T.u(3);
        B0.d dVar = new B0.d(25);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C0007g c0007g = new C0007g(3);
        b bVar = b.f2389a;
        b bVar2 = b.f2390b;
        b bVar3 = b.f2391c;
        SocketFactory socketFactory = SocketFactory.getDefault();
        X0.e.d(socketFactory, "getDefault()");
        List list2 = f2458A;
        List list3 = f2459z;
        u1.c cVar = u1.c.f3816a;
        d dVar2 = d.f2403c;
        this.f2460a = uVar;
        this.f2461b = dVar;
        this.f2462c = j1.b.u(arrayList);
        this.d = j1.b.u(arrayList2);
        this.f2463e = c0007g;
        this.f2464f = true;
        this.f2465g = bVar;
        this.h = true;
        this.i = true;
        this.f2466j = bVar2;
        this.f2467k = bVar3;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f2468l = proxySelector == null ? s1.a.f3738a : proxySelector;
        this.f2469m = bVar;
        this.f2470n = socketFactory;
        this.f2473q = list2;
        this.f2474r = list3;
        this.f2475s = cVar;
        this.f2478v = 10000;
        this.f2479w = 10000;
        this.f2480x = 10000;
        this.f2481y = new C0249n();
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).f2428a) {
                    q1.n nVar = q1.n.f3552a;
                    X509TrustManager m2 = q1.n.f3552a.m();
                    this.f2472p = m2;
                    this.f2471o = q1.n.f3552a.l(m2);
                    p b2 = q1.n.f3552a.b(m2);
                    this.f2477u = b2;
                    this.f2476t = X0.e.a(dVar2.f2405b, b2) ? dVar2 : new d(dVar2.f2404a, b2);
                    list = this.f2462c;
                    X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list4 = this.d;
                    X0.e.c(list4, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list4.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list4).toString());
                    }
                    X509TrustManager x509TrustManager = this.f2472p;
                    p pVar = this.f2477u;
                    SSLSocketFactory sSLSocketFactory = this.f2471o;
                    List list5 = this.f2473q;
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((h) it2.next()).f2428a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (pVar == null) {
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
                    if (pVar != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!X0.e.a(this.f2476t, d.f2403c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f2471o = null;
        this.f2477u = null;
        this.f2472p = null;
        this.f2476t = d.f2403c;
        list = this.f2462c;
        X0.e.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
