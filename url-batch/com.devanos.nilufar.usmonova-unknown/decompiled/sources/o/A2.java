package o;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class A2 extends AbstractC1305jX {
    public final X509TrustManager r;
    public final X509TrustManagerExtensions s;

    public A2(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.r = x509TrustManager;
        this.s = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof A2) && ((A2) obj).r == this.r;
    }

    public final int hashCode() {
        return System.identityHashCode(this.r);
    }

    @Override // o.AbstractC1305jX
    public final List k(String str, List list) {
        AbstractC0048Bt.n(list, "chain");
        AbstractC0048Bt.n(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.s.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            AbstractC0048Bt.m(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
