package x1;

import K.C0014g;
import U.v;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import l.C0265n;

/* loaded from: classes.dex */
public final class p implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final v f4562a;

    /* renamed from: b, reason: collision with root package name */
    public final C0265n f4563b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4564c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final C0014g f4565e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4566f;

    /* renamed from: g, reason: collision with root package name */
    public final b f4567g;
    public final boolean h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f4568j;

    /* renamed from: k, reason: collision with root package name */
    public final b f4569k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f4570l;

    /* renamed from: m, reason: collision with root package name */
    public final b f4571m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f4572n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f4573o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f4574p;

    /* renamed from: q, reason: collision with root package name */
    public final List f4575q;

    /* renamed from: r, reason: collision with root package name */
    public final List f4576r;

    /* renamed from: s, reason: collision with root package name */
    public final J1.c f4577s;

    /* renamed from: t, reason: collision with root package name */
    public final d f4578t;

    /* renamed from: u, reason: collision with root package name */
    public final F1.d f4579u;

    /* renamed from: v, reason: collision with root package name */
    public final int f4580v;

    /* renamed from: w, reason: collision with root package name */
    public final int f4581w;

    /* renamed from: x, reason: collision with root package name */
    public final int f4582x;

    /* renamed from: y, reason: collision with root package name */
    public final A1.d f4583y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f4561z = y1.b.j(q.HTTP_2, q.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f4560A = y1.b.j(g.f4508e, g.f4509f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(o oVar) {
        List list;
        this.f4562a = oVar.f4543a;
        this.f4563b = oVar.f4544b;
        this.f4564c = y1.b.v(oVar.f4545c);
        this.d = y1.b.v(oVar.d);
        this.f4565e = oVar.f4546e;
        this.f4566f = oVar.f4547f;
        this.f4567g = oVar.f4548g;
        this.h = oVar.h;
        this.i = oVar.i;
        this.f4568j = oVar.f4549j;
        this.f4569k = oVar.f4550k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f4570l = proxySelector == null ? H1.a.f569a : proxySelector;
        this.f4571m = oVar.f4551l;
        this.f4572n = oVar.f4552m;
        List list2 = oVar.f4553n;
        this.f4575q = list2;
        this.f4576r = oVar.f4554o;
        this.f4577s = oVar.f4555p;
        this.f4580v = oVar.f4557r;
        this.f4581w = oVar.f4558s;
        this.f4582x = oVar.f4559t;
        this.f4583y = new A1.d(1);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((g) it.next()).f4510a) {
                    F1.n nVar = F1.n.f424a;
                    X509TrustManager m2 = F1.n.f424a.m();
                    this.f4574p = m2;
                    this.f4573o = F1.n.f424a.l(m2);
                    F1.d b2 = F1.n.f424a.b(m2);
                    this.f4579u = b2;
                    d dVar = oVar.f4556q;
                    this.f4578t = i1.f.a(dVar.f4490b, b2) ? dVar : new d(dVar.f4489a, b2);
                    list = this.f4564c;
                    i1.f.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    List list3 = this.d;
                    i1.f.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    X509TrustManager x509TrustManager = this.f4574p;
                    F1.d dVar2 = this.f4579u;
                    SSLSocketFactory sSLSocketFactory = this.f4573o;
                    List list4 = this.f4575q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((g) it2.next()).f4510a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (dVar2 == null) {
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
                    if (dVar2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!i1.f.a(this.f4578t, d.f4488c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f4573o = null;
        this.f4579u = null;
        this.f4574p = null;
        this.f4578t = d.f4488c;
        list = this.f4564c;
        i1.f.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
