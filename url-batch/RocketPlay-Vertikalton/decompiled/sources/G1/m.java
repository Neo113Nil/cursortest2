package G1;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f536a;

    /* renamed from: b, reason: collision with root package name */
    public n f537b;

    public m(l lVar) {
        this.f536a = lVar;
    }

    @Override // G1.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f536a.a(sSLSocket);
    }

    @Override // G1.n
    public final String b(SSLSocket sSLSocket) {
        n e2 = e(sSLSocket);
        if (e2 != null) {
            return e2.b(sSLSocket);
        }
        return null;
    }

    @Override // G1.n
    public final boolean c() {
        return true;
    }

    @Override // G1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i1.f.e(list, "protocols");
        n e2 = e(sSLSocket);
        if (e2 != null) {
            e2.d(sSLSocket, str, list);
        }
    }

    public final synchronized n e(SSLSocket sSLSocket) {
        try {
            if (this.f537b == null && this.f536a.a(sSLSocket)) {
                this.f537b = this.f536a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f537b;
    }
}
