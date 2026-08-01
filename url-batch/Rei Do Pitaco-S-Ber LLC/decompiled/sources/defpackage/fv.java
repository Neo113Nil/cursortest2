package defpackage;

import java.net.ProxySelector;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class fv implements Cloneable {
    public static final List E = z60.i(bx.HTTP_2, bx.HTTP_1_1);
    public static final List F = z60.i(wb.e, wb.f);
    public final int A;
    public final int B;
    public final int C;
    public final uv D;
    public final oe f;
    public final j0 g;
    public final List h;
    public final List i;
    public final x50 j;
    public final boolean k;
    public final tg l;
    public final boolean m;
    public final boolean n;
    public final tg o;
    public final tg p;
    public final ProxySelector q;
    public final tg r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final List v;
    public final List w;
    public final dv x;
    public final j9 y;
    public final oo z;

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fv(ev evVar) {
        List list;
        this.f = evVar.a;
        this.g = evVar.b;
        this.h = z60.u(evVar.c);
        this.i = z60.u(evVar.d);
        this.j = evVar.e;
        this.k = evVar.f;
        this.l = evVar.g;
        this.m = evVar.h;
        this.n = evVar.i;
        this.o = evVar.j;
        this.p = evVar.k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.q = proxySelector == null ? bv.a : proxySelector;
        this.r = evVar.l;
        this.s = evVar.m;
        List list2 = evVar.n;
        this.v = list2;
        this.w = evVar.o;
        this.x = evVar.p;
        this.A = evVar.r;
        this.B = evVar.s;
        this.C = evVar.t;
        uv uvVar = new uv();
        uvVar.f = new LinkedHashSet();
        this.D = uvVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((wb) it.next()).a) {
                    jw jwVar = jw.a;
                    X509TrustManager m = jw.a.m();
                    this.u = m;
                    this.t = jw.a.l(m);
                    oo b = jw.a.b(m);
                    this.z = b;
                    j9 j9Var = evVar.q;
                    this.y = oo.b(j9Var.b, b) ? j9Var : new j9(j9Var.a, b);
                    X509TrustManager x509TrustManager = this.u;
                    oo ooVar = this.z;
                    SSLSocketFactory sSLSocketFactory = this.t;
                    List list3 = this.i;
                    list = this.h;
                    list.getClass();
                    if (!list.contains(null)) {
                        l8.t(list, "Null interceptor: ");
                        throw null;
                    }
                    list3.getClass();
                    if (list3.contains(null)) {
                        l8.t(list3, "Null network interceptor: ");
                        throw null;
                    }
                    List list4 = this.v;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((wb) it2.next()).a) {
                                if (sSLSocketFactory == null) {
                                    l8.u("sslSocketFactory == null");
                                    throw null;
                                }
                                if (ooVar == null) {
                                    l8.u("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager != null) {
                                    return;
                                }
                                l8.u("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory != null) {
                        l8.u("Check failed.");
                        throw null;
                    }
                    if (ooVar != null) {
                        l8.u("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        l8.u("Check failed.");
                        throw null;
                    }
                    if (oo.b(this.y, j9.c)) {
                        return;
                    }
                    l8.u("Check failed.");
                    throw null;
                }
            }
        }
        this.t = null;
        this.z = null;
        this.u = null;
        this.y = j9.c;
        X509TrustManager x509TrustManager2 = this.u;
        oo ooVar2 = this.z;
        SSLSocketFactory sSLSocketFactory2 = this.t;
        List list32 = this.i;
        list = this.h;
        list.getClass();
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
