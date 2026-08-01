package G1;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class j implements l {
    @Override // G1.l
    public final boolean a(SSLSocket sSLSocket) {
        boolean z2 = F1.h.d;
        return F1.f.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // G1.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
