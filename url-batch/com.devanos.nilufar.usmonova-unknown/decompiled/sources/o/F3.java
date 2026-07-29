package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class F3 implements GW {
    public final X509TrustManager a;
    public final Method b;

    public F3(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.b = method;
    }

    @Override // o.GW
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.b.invoke(this.a, x509Certificate);
            AbstractC0048Bt.l(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F3)) {
            return false;
        }
        F3 f3 = (F3) obj;
        return AbstractC0048Bt.h(this.a, f3.a) && AbstractC0048Bt.h(this.b, f3.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ')';
    }
}
