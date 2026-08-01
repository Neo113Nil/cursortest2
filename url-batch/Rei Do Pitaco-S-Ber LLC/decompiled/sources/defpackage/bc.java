package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class bc implements te {
    @Override // defpackage.te
    public final boolean b(SSLSocket sSLSocket) {
        return ac.d && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.te
    public final k20 d(SSLSocket sSLSocket) {
        return new cc();
    }
}
