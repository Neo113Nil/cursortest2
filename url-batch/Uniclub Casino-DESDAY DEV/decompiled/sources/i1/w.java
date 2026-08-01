package i1;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f2541a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f2542b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f2543c;

    public w(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        X0.d.e(inetSocketAddress, "socketAddress");
        this.f2541a = aVar;
        this.f2542b = proxy;
        this.f2543c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (X0.d.a(wVar.f2541a, this.f2541a) && X0.d.a(wVar.f2542b, this.f2542b) && X0.d.a(wVar.f2543c, this.f2543c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2543c.hashCode() + ((this.f2542b.hashCode() + ((this.f2541a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f2543c + '}';
    }
}
