package r1;

import android.net.http.X509TrustManagerExtensions;
import i1.r;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends r {

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManager f3583b;

    /* renamed from: c, reason: collision with root package name */
    public final X509TrustManagerExtensions f3584c;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f3583b = x509TrustManager;
        this.f3584c = x509TrustManagerExtensions;
    }

    @Override // i1.r
    public final List c(List list, String str) {
        X0.d.e(list, "chain");
        X0.d.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f3584c.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            X0.d.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f3583b == this.f3583b;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f3583b);
    }
}
