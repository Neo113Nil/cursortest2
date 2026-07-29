package o;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: o.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683a2 {
    public final HO a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final C2099va e;
    public final HO f;
    public final ProxySelector g;
    public final C0932ds h;
    public final List i;
    public final List j;

    public C0683a2(String str, int i, HO ho, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C2099va c2099va, HO ho2, List list, List list2, ProxySelector proxySelector) {
        AbstractC0048Bt.n(str, "uriHost");
        AbstractC0048Bt.n(ho, "dns");
        AbstractC0048Bt.n(socketFactory, "socketFactory");
        AbstractC0048Bt.n(ho2, "proxyAuthenticator");
        AbstractC0048Bt.n(list, "protocols");
        AbstractC0048Bt.n(list2, "connectionSpecs");
        AbstractC0048Bt.n(proxySelector, "proxySelector");
        this.a = ho;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = c2099va;
        this.f = ho2;
        this.g = proxySelector;
        C0867cs c0867cs = new C0867cs();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c0867cs.a = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c0867cs.a = "https";
        }
        String K = AbstractC1305jX.K(C0140Fh.B(0, 0, 7, str));
        if (K == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c0867cs.d = K;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i, "unexpected port: ").toString());
        }
        c0867cs.e = i;
        this.h = c0867cs.a();
        this.i = HY.v(list);
        this.j = HY.v(list2);
    }

    public final boolean a(C0683a2 c0683a2) {
        AbstractC0048Bt.n(c0683a2, "that");
        return AbstractC0048Bt.h(this.a, c0683a2.a) && AbstractC0048Bt.h(this.f, c0683a2.f) && AbstractC0048Bt.h(this.i, c0683a2.i) && AbstractC0048Bt.h(this.j, c0683a2.j) && AbstractC0048Bt.h(this.g, c0683a2.g) && AbstractC0048Bt.h(this.c, c0683a2.c) && AbstractC0048Bt.h(this.d, c0683a2.d) && AbstractC0048Bt.h(this.e, c0683a2.e) && this.h.e == c0683a2.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0683a2)) {
            return false;
        }
        C0683a2 c0683a2 = (C0683a2) obj;
        return AbstractC0048Bt.h(this.h, c0683a2.h) && a(c0683a2);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + ((this.h.i.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C0932ds c0932ds = this.h;
        sb.append(c0932ds.d);
        sb.append(':');
        sb.append(c0932ds.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
