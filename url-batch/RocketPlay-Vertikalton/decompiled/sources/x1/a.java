package x1;

import E1.AbstractC0001b;
import a1.AbstractC0067d;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f4467a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f4468b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f4469c;
    public final J1.c d;

    /* renamed from: e, reason: collision with root package name */
    public final d f4470e;

    /* renamed from: f, reason: collision with root package name */
    public final b f4471f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f4472g;
    public final l h;
    public final List i;

    /* renamed from: j, reason: collision with root package name */
    public final List f4473j;

    public a(String str, int i, b bVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, J1.c cVar, d dVar, b bVar2, List list, List list2, ProxySelector proxySelector) {
        i1.f.e(str, "uriHost");
        i1.f.e(bVar, "dns");
        i1.f.e(socketFactory, "socketFactory");
        i1.f.e(bVar2, "proxyAuthenticator");
        i1.f.e(list, "protocols");
        i1.f.e(list2, "connectionSpecs");
        i1.f.e(proxySelector, "proxySelector");
        this.f4467a = bVar;
        this.f4468b = socketFactory;
        this.f4469c = sSLSocketFactory;
        this.d = cVar;
        this.f4470e = dVar;
        this.f4471f = bVar2;
        this.f4472g = proxySelector;
        k kVar = new k();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            kVar.f4527a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            kVar.f4527a = "https";
        }
        String v2 = AbstractC0067d.v(b.e(str, 0, 0, false, 7));
        if (v2 == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        kVar.d = v2;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC0001b.f("unexpected port: ", i).toString());
        }
        kVar.f4530e = i;
        this.h = kVar.a();
        this.i = y1.b.v(list);
        this.f4473j = y1.b.v(list2);
    }

    public final boolean a(a aVar) {
        i1.f.e(aVar, "that");
        return i1.f.a(this.f4467a, aVar.f4467a) && i1.f.a(this.f4471f, aVar.f4471f) && i1.f.a(this.i, aVar.i) && i1.f.a(this.f4473j, aVar.f4473j) && i1.f.a(this.f4472g, aVar.f4472g) && i1.f.a(null, null) && i1.f.a(this.f4469c, aVar.f4469c) && i1.f.a(this.d, aVar.d) && i1.f.a(this.f4470e, aVar.f4470e) && this.h.f4537e == aVar.h.f4537e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (i1.f.a(this.h, aVar.h) && a(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f4470e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.f4469c) + ((this.f4472g.hashCode() + ((this.f4473j.hashCode() + ((this.i.hashCode() + ((this.f4471f.hashCode() + ((this.f4467a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        l lVar = this.h;
        sb.append(lVar.d);
        sb.append(':');
        sb.append(lVar.f4537e);
        sb.append(", ");
        sb.append("proxySelector=" + this.f4472g);
        sb.append('}');
        return sb.toString();
    }
}
