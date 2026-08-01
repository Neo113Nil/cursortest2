package q1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements u1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f3555a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f3556b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f3555a = x509TrustManager;
        this.f3556b = method;
    }

    @Override // u1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f3556b.invoke(this.f3555a, x509Certificate);
            X0.d.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return X0.d.a(this.f3555a, bVar.f3555a) && X0.d.a(this.f3556b, bVar.f3556b);
    }

    public final int hashCode() {
        return this.f3556b.hashCode() + (this.f3555a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f3555a + ", findByIssuerAndSignatureMethod=" + this.f3556b + ')';
    }
}
