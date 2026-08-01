package i1;

import X.V;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f2382a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2383b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2384c;
    public final HostnameVerifier d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2385e;

    /* renamed from: f, reason: collision with root package name */
    public final b f2386f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2387g;
    public final m h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2388j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        X0.e.e(str, "uriHost");
        X0.e.e(bVar, "dns");
        X0.e.e(socketFactory, "socketFactory");
        X0.e.e(bVar2, "proxyAuthenticator");
        X0.e.e(list, "protocols");
        X0.e.e(list2, "connectionSpecs");
        X0.e.e(proxySelector, "proxySelector");
        this.f2382a = bVar;
        this.f2383b = socketFactory;
        this.f2384c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.f2385e = dVar;
        this.f2386f = bVar2;
        this.f2387g = proxySelector;
        l lVar = new l();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            lVar.f2445a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            lVar.f2445a = "https";
        }
        String k2 = p.k(b.e(str, 0, 0, false, 7));
        if (k2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        lVar.d = k2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.d("unexpected port: ", i).toString());
        }
        lVar.f2448e = i;
        this.h = lVar.a();
        this.i = j1.b.u(list);
        this.f2388j = j1.b.u(list2);
    }

    public final boolean a(a aVar) {
        X0.e.e(aVar, "that");
        return X0.e.a(this.f2382a, aVar.f2382a) && X0.e.a(this.f2386f, aVar.f2386f) && X0.e.a(this.i, aVar.i) && X0.e.a(this.f2388j, aVar.f2388j) && X0.e.a(this.f2387g, aVar.f2387g) && X0.e.a(null, null) && X0.e.a(this.f2384c, aVar.f2384c) && X0.e.a(this.d, aVar.d) && X0.e.a(this.f2385e, aVar.f2385e) && this.h.f2455e == aVar.h.f2455e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (X0.e.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2385e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f2384c) + ((this.f2387g.hashCode() + ((this.f2388j.hashCode() + ((this.i.hashCode() + ((this.f2386f.hashCode() + ((this.f2382a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        m mVar = this.h;
        sb.append(mVar.d);
        sb.append(':');
        sb.append(mVar.f2455e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2387g);
        sb.append('}');
        return sb.toString();
    }
}
