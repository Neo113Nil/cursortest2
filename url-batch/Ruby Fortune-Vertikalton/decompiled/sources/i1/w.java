package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f2532a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2533b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2534c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.e.e(inetSocketAddress, "socketAddress");
        this.f2532a = aVar;
        this.f2533b = proxy;
        this.f2534c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (X0.e.a(wVar.f2532a, this.f2532a) && X0.e.a(wVar.f2533b, this.f2533b) && X0.e.a(wVar.f2534c, this.f2534c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2534c.hashCode() + ((this.f2533b.hashCode() + ((this.f2532a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2534c + '}';
    }
}
