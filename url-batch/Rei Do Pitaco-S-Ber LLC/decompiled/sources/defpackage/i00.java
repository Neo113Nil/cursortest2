package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class i00 {
    public final z1 a;
    public final Proxy b;
    public final InetSocketAddress c;

    public i00(z1 z1Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        inetSocketAddress.getClass();
        this.a = z1Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i00)) {
            return false;
        }
        i00 i00Var = (i00) obj;
        return i00Var.a.equals(this.a) && i00Var.b.equals(this.b) && oo.b(i00Var.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.c + '}';
    }
}
