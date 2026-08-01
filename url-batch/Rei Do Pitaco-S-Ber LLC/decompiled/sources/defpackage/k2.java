package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class k2 extends oo {
    public final X509TrustManager o;
    public final X509TrustManagerExtensions p;

    public k2(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.o = x509TrustManager;
        this.p = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k2) && ((k2) obj).o == this.o;
    }

    @Override // defpackage.oo
    public final List g(List list, String str) {
        list.getClass();
        str.getClass();
        try {
            List<X509Certificate> checkServerTrusted = this.p.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            checkServerTrusted.getClass();
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.o);
    }
}
