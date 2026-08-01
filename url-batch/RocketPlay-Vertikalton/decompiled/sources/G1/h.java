package G1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final g f531a = new g();

    @Override // G1.n
    public final boolean a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // G1.n
    public final String b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : i1.f.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // G1.n
    public final boolean c() {
        boolean z2 = F1.e.d;
        return F1.e.d;
    }

    @Override // G1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i1.f.e(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            F1.n nVar = F1.n.f424a;
            parameters.setApplicationProtocols((String[]) M0.e.c(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
