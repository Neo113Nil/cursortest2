package o;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class EF implements Cloneable, InterfaceC1940t9 {
    public static final List G = HY.j(EnumC1359kL.l, EnumC1359kL.j);
    public static final List H = HY.j(C0240Jd.e, C0240Jd.f);
    public final C2099va A;
    public final AbstractC1305jX B;
    public final int C;
    public final int D;
    public final int E;
    public final C1818rJ F;
    public final C1334k h;
    public final Y1 i;
    public final List j;
    public final List k;
    public final C1574nc l;
    public final boolean m;
    public final HO n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f37o;
    public final boolean p;
    public final HO q;
    public final HO r;
    public final ProxySelector s;
    public final HO t;
    public final SocketFactory u;
    public final SSLSocketFactory v;
    public final X509TrustManager w;
    public final List x;
    public final List y;
    public final CF z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EF(DF df) {
        List list;
        this.h = df.a;
        this.i = df.b;
        this.j = HY.v(df.c);
        this.k = HY.v(df.d);
        this.l = df.e;
        this.m = df.f;
        this.n = df.g;
        this.f37o = df.h;
        this.p = df.i;
        this.q = df.j;
        this.r = df.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.s = proxySelector == null ? C1814rF.a : proxySelector;
        this.t = df.l;
        this.u = df.m;
        List list2 = df.n;
        this.x = list2;
        this.y = df.f28o;
        this.z = df.p;
        this.C = df.r;
        this.D = df.s;
        this.E = df.t;
        this.F = new C1818rJ(6);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((C0240Jd) it.next()).a) {
                    C0897dI c0897dI = C0897dI.a;
                    X509TrustManager n = C0897dI.a.n();
                    this.w = n;
                    this.v = C0897dI.a.m(n);
                    AbstractC1305jX b = C0897dI.a.b(n);
                    this.B = b;
                    C2099va c2099va = df.q;
                    this.A = AbstractC0048Bt.h(c2099va.b, b) ? c2099va : new C2099va(c2099va.a, b);
                    X509TrustManager x509TrustManager = this.w;
                    AbstractC1305jX abstractC1305jX = this.B;
                    SSLSocketFactory sSLSocketFactory = this.v;
                    List list3 = this.k;
                    list = this.j;
                    AbstractC0048Bt.l(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (!list.contains(null)) {
                        throw new IllegalStateException(("Null interceptor: " + list).toString());
                    }
                    AbstractC0048Bt.l(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                    if (list3.contains(null)) {
                        throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                    }
                    List list4 = this.x;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((C0240Jd) it2.next()).a) {
                                if (sSLSocketFactory == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (abstractC1305jX == null) {
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
                    if (abstractC1305jX != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!AbstractC0048Bt.h(this.A, C2099va.c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.v = null;
        this.B = null;
        this.w = null;
        this.A = C2099va.c;
        X509TrustManager x509TrustManager2 = this.w;
        AbstractC1305jX abstractC1305jX2 = this.B;
        SSLSocketFactory sSLSocketFactory2 = this.v;
        List list32 = this.k;
        list = this.j;
        AbstractC0048Bt.l(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
