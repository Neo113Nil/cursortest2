package o;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: o.Xg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0606Xg implements ES {
    public final InterfaceC0580Wg a;
    public ES b;

    public C0606Xg(InterfaceC0580Wg interfaceC0580Wg) {
        this.a = interfaceC0580Wg;
    }

    @Override // o.ES
    public final String a(SSLSocket sSLSocket) {
        ES e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // o.ES
    public final boolean b() {
        return true;
    }

    @Override // o.ES
    public final boolean c(SSLSocket sSLSocket) {
        return this.a.c(sSLSocket);
    }

    @Override // o.ES
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
        ES e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized ES e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.c(sSLSocket)) {
                this.b = this.a.g(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
