package o;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class RO {
    public final C0683a2 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public RO(C0683a2 c0683a2, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC0048Bt.n(inetSocketAddress, "socketAddress");
        this.a = c0683a2;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RO)) {
            return false;
        }
        RO ro = (RO) obj;
        return AbstractC0048Bt.h(ro.a, this.a) && AbstractC0048Bt.h(ro.b, this.b) && AbstractC0048Bt.h(ro.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
