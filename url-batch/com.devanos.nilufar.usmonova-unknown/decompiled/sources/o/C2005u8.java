package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* renamed from: o.u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2005u8 implements ES {
    public static final C1939t8 a = new C1939t8();

    @Override // o.ES
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.ES
    public final boolean b() {
        boolean z = C1873s8.d;
        return C1873s8.d;
    }

    @Override // o.ES
    public final boolean c(SSLSocket sSLSocket) {
        return false;
    }

    @Override // o.ES
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
        if (c(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            C0897dI c0897dI = C0897dI.a;
            parameters.setApplicationProtocols((String[]) C0140Fh.s(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
