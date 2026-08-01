package F1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class b implements J1.d {

    /* renamed from: a, reason: collision with root package name */
    public final X509TrustManager f405a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f406b;

    public b(X509TrustManager x509TrustManager, Method method) {
        this.f405a = x509TrustManager;
        this.f406b = method;
    }

    @Override // J1.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f406b.invoke(this.f405a, x509Certificate);
            i1.f.c(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
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
        return i1.f.a(this.f405a, bVar.f405a) && i1.f.a(this.f406b, bVar.f406b);
    }

    public final int hashCode() {
        return this.f406b.hashCode() + (this.f405a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f405a + ", findByIssuerAndSignatureMethod=" + this.f406b + ')';
    }
}
