package q1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f3549a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3550b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3549a = x509TrustManager;
        this.f3550b = method;
    }

    @Override // u1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f3550b.invoke(this.f3549a, x509Certificate);
            X0.e.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e2) {
            throw new AssertionError("unable to get issues and signature", e2);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return X0.e.a(this.f3549a, bVar.f3549a) && X0.e.a(this.f3550b, bVar.f3550b);
    }

    public final int hashCode() {
        return this.f3550b.hashCode() + (this.f3549a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3549a + ", findByIssuerAndSignatureMethod=" + this.f3550b + ')';
    }
}
