package o;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: o.a8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690a8 extends AbstractC1305jX {
    public final GW r;

    public C0690a8(GW gw) {
        AbstractC0048Bt.n(gw, "trustRootIndex");
        this.r = gw;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0690a8) && AbstractC0048Bt.h(((C0690a8) obj).r, this.r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    @Override // o.AbstractC1305jX
    public final List k(String str, List list) {
        AbstractC0048Bt.n(list, "chain");
        AbstractC0048Bt.n(str, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        AbstractC0048Bt.m(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            AbstractC0048Bt.l(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a = this.r.a(x509Certificate);
            if (a == null) {
                Iterator it = arrayDeque.iterator();
                AbstractC0048Bt.m(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC0048Bt.l(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (AbstractC0048Bt.h(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a)) {
                arrayList.add(a);
            }
            if (AbstractC0048Bt.h(a.getIssuerDN(), a.getSubjectDN())) {
                try {
                    a.verify(a.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
