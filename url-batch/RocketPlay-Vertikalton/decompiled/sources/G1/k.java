package G1;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class k implements n {

    /* renamed from: a, reason: collision with root package name */
    public static final j f535a = new j();

    @Override // G1.n
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // G1.n
    public final String b(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // G1.n
    public final boolean c() {
        boolean z2 = F1.h.d;
        return F1.h.d;
    }

    @Override // G1.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i1.f.e(list, "protocols");
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            F1.n nVar = F1.n.f424a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) M0.e.c(list).toArray(new String[0]));
        }
    }
}
