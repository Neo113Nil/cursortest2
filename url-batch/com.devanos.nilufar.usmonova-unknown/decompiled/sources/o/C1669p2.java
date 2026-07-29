package o;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: o.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1669p2 implements ES {
    @Override // o.ES
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o.ES
    public final boolean b() {
        C0897dI c0897dI = C0897dI.a;
        return C0140Fh.z() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // o.ES
    public final boolean c(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // o.ES
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            C0897dI c0897dI = C0897dI.a;
            sSLParameters.setApplicationProtocols((String[]) C0140Fh.s(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
