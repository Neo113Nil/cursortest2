package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class j8 implements k20 {
    public static final i8 a = new i8();

    @Override // defpackage.k20
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.k20
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.k20
    public final boolean c() {
        boolean z = h8.d;
        return h8.d;
    }

    @Override // defpackage.k20
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            jw jwVar = jw.a;
            parameters.setApplicationProtocols((String[]) iw.d(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
