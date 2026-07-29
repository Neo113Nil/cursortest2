package o;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: o.Td, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0499Td implements InterfaceC0580Wg {
    @Override // o.InterfaceC0580Wg
    public final boolean c(SSLSocket sSLSocket) {
        return C0473Sd.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o.InterfaceC0580Wg
    public final ES g(SSLSocket sSLSocket) {
        return new C0525Ud();
    }
}
