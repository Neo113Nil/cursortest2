package o;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: o.Ud, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525Ud implements ES {
    public static final C0499Td a = new C0499Td();

    @Override // o.ES
    public final String a(SSLSocket sSLSocket) {
        if (c(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o.ES
    public final boolean b() {
        boolean z = C0473Sd.d;
        return C0473Sd.d;
    }

    @Override // o.ES
    public final boolean c(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o.ES
    public final void d(SSLSocket sSLSocket, String str, List list) {
        AbstractC0048Bt.n(list, "protocols");
        if (c(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            C0897dI c0897dI = C0897dI.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C0140Fh.s(list).toArray(new String[0]));
        }
    }
}
