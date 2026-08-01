package G1;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b extends F1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f521a;

    /* renamed from: b, reason: collision with root package name */
    public final X509TrustManagerExtensions f522b;

    public b(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f521a = x509TrustManager;
        this.f522b = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && ((b) obj).f521a == this.f521a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f521a);
    }

    @Override // F1.d
    public final List q(List list, String str) {
        i1.f.e(list, "chain");
        i1.f.e(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f522b.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            i1.f.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e2) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
            sSLPeerUnverifiedException.initCause(e2);
            throw sSLPeerUnverifiedException;
        }
    }
}
