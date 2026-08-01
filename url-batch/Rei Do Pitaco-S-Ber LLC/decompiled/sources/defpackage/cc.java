package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class cc implements k20 {
    public static final bc a = new bc();

    @Override // defpackage.k20
    public final String a(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.k20
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.k20
    public final boolean c() {
        boolean z = ac.d;
        return ac.d;
    }

    @Override // defpackage.k20
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            jw jwVar = jw.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) iw.d(list).toArray(new String[0]));
        }
    }
}
