package o;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.lr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1457lr {
    public final TV a;
    public final C0850cb b;
    public final List c;
    public final BU d;

    public C1457lr(TV tv, C0850cb c0850cb, List list, InterfaceC1455lp interfaceC1455lp) {
        this.a = tv;
        this.b = c0850cb;
        this.c = list;
        this.d = EB.D(new C0988ei(interfaceC1455lp, 1));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1457lr)) {
            return false;
        }
        C1457lr c1457lr = (C1457lr) obj;
        return c1457lr.a == this.a && AbstractC0048Bt.h(c1457lr.b, this.b) && AbstractC0048Bt.h(c1457lr.a(), a()) && AbstractC0048Bt.h(c1457lr.c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a = a();
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(a));
        for (Certificate certificate : a) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC0048Bt.m(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(AbstractC0786bc.d0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC0048Bt.m(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
