package x1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final a f4610a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f4611b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f4612c;

    public t(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        i1.f.e(inetSocketAddress, "socketAddress");
        this.f4610a = aVar;
        this.f4611b = proxy;
        this.f4612c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (i1.f.a(tVar.f4610a, this.f4610a) && i1.f.a(tVar.f4611b, this.f4611b) && i1.f.a(tVar.f4612c, this.f4612c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4612c.hashCode() + ((this.f4611b.hashCode() + ((this.f4610a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f4612c + '}';
    }
}
