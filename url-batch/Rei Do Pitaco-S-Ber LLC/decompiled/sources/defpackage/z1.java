package defpackage;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class z1 {
    public final tg a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final j9 e;
    public final tg f;
    public final ProxySelector g;
    public final xn h;
    public final List i;
    public final List j;

    public z1(String str, int i, tg tgVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, j9 j9Var, tg tgVar2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        tgVar.getClass();
        socketFactory.getClass();
        tgVar2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = tgVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = j9Var;
        this.f = tgVar2;
        this.g = proxySelector;
        wn wnVar = new wn(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            wnVar.c = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                l8.l("unexpected scheme: ".concat(str2));
                throw null;
            }
            wnVar.c = "https";
        }
        String j0 = g8.j0(tg.r(str, 0, 0, 7));
        if (j0 == null) {
            l8.l("unexpected host: ".concat(str));
            throw null;
        }
        wnVar.f = j0;
        if (1 > i || i >= 65536) {
            l8.e(n20.e("unexpected port: ", i));
            throw null;
        }
        wnVar.b = i;
        this.h = wnVar.b();
        this.i = z60.u(list);
        this.j = z60.u(list2);
    }

    public final boolean a(z1 z1Var) {
        z1Var.getClass();
        return oo.b(this.a, z1Var.a) && oo.b(this.f, z1Var.f) && oo.b(this.i, z1Var.i) && oo.b(this.j, z1Var.j) && oo.b(this.g, z1Var.g) && oo.b(this.c, z1Var.c) && oo.b(this.d, z1Var.d) && oo.b(this.e, z1Var.e) && this.h.e == z1Var.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return oo.b(this.h, z1Var.h) && a(z1Var);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.f.hashCode() + ((this.a.hashCode() + ((this.h.h.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        xn xnVar = this.h;
        sb.append(xnVar.d);
        sb.append(':');
        sb.append(xnVar.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
