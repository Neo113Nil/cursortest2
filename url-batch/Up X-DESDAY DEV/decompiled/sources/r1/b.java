package r1;

import android.net.http.X509TrustManagerExtensions;
import i1.p;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends p {

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f3556b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f3557c;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3556b = x509TrustManager;
        this.f3557c = x509TrustManagerExtensions;
    }

    @Override // i1.p
    public final List c(List list, String str) {
        X0.e.e(list, "chain");
        X0.e.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f3557c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            X0.e.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f3556b == this.f3556b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3556b);
    }
}
