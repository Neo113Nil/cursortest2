package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f2538a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2539b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2540c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.d.e(inetSocketAddress, "socketAddress");
        this.f2538a = aVar;
        this.f2539b = proxy;
        this.f2540c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (X0.d.a(wVar.f2538a, this.f2538a) && X0.d.a(wVar.f2539b, this.f2539b) && X0.d.a(wVar.f2540c, this.f2540c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2540c.hashCode() + ((this.f2539b.hashCode() + ((this.f2538a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2540c + '}';
    }
}
