package q1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f3533a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3534b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3533a = x509TrustManager;
        this.f3534b = method;
    }

    @Override // u1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f3534b.invoke(this.f3533a, x509Certificate);
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
        return X0.e.a(this.f3533a, bVar.f3533a) && X0.e.a(this.f3534b, bVar.f3534b);
    }

    public final int hashCode() {
        return this.f3534b.hashCode() + (this.f3533a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3533a + ", findByIssuerAndSignatureMethod=" + this.f3534b + ')';
    }
}
