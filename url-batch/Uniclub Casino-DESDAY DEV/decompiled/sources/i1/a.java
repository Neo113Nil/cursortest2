package i1;

import X.V;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f2388a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f2389b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f2390c;
    public final u1.c d;

    /* renamed from: e, reason: collision with root package name */
    public final d f2391e;

    /* renamed from: f, reason: collision with root package name */
    public final b f2392f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f2393g;
    public final n h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f2394j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, u1.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        X0.d.e(str, "uriHost");
        X0.d.e(bVar, "dns");
        X0.d.e(socketFactory, "socketFactory");
        X0.d.e(bVar2, "proxyAuthenticator");
        X0.d.e(list, "protocols");
        X0.d.e(list2, "connectionSpecs");
        X0.d.e(proxySelector, "proxySelector");
        this.f2388a = bVar;
        this.f2389b = socketFactory;
        this.f2390c = sSLSocketFactory;
        this.d = cVar;
        this.f2391e = dVar;
        this.f2392f = bVar2;
        this.f2393g = proxySelector;
        m mVar = new m();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            mVar.f2455a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            mVar.f2455a = "https";
        }
        String j2 = r.j(b.e(str, 0, 0, false, 7));
        if (j2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        mVar.d = j2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(V.d("unexpected port: ", i).toString());
        }
        mVar.f2458e = i;
        this.h = mVar.a();
        this.i = j1.b.u(list);
        this.f2394j = j1.b.u(list2);
    }

    public final boolean a(a aVar) {
        X0.d.e(aVar, "that");
        return X0.d.a(this.f2388a, aVar.f2388a) && X0.d.a(this.f2392f, aVar.f2392f) && X0.d.a(this.i, aVar.i) && X0.d.a(this.f2394j, aVar.f2394j) && X0.d.a(this.f2393g, aVar.f2393g) && X0.d.a(null, null) && X0.d.a(this.f2390c, aVar.f2390c) && X0.d.a(this.d, aVar.d) && X0.d.a(this.f2391e, aVar.f2391e) && this.h.f2465e == aVar.h.f2465e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (X0.d.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f2391e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f2390c) + ((this.f2393g.hashCode() + ((this.f2394j.hashCode() + ((this.i.hashCode() + ((this.f2392f.hashCode() + ((this.f2388a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        n nVar = this.h;
        sb.append(nVar.d);
        sb.append(':');
        sb.append(nVar.f2465e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f2393g);
        sb.append('}');
        return sb.toString();
    }
}
