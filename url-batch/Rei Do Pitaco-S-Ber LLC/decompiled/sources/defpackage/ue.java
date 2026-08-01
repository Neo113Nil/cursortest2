package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ue implements k20 {
    public final te a;
    public k20 b;

    public ue(te teVar) {
        this.a = teVar;
    }

    @Override // defpackage.k20
    public final String a(SSLSocket sSLSocket) {
        k20 e = e(sSLSocket);
        if (e != null) {
            return e.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.k20
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // defpackage.k20
    public final boolean c() {
        return true;
    }

    @Override // defpackage.k20
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        k20 e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized k20 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.d(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
