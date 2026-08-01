package x1;

import androidx.lifecycle.K;
import h1.InterfaceC0173a;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final u f4523a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4524b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4525c;
    public final V0.g d;

    public i(u uVar, f fVar, List list, InterfaceC0173a interfaceC0173a) {
        this.f4523a = uVar;
        this.f4524b = fVar;
        this.f4525c = list;
        this.d = new V0.g(new K(interfaceC0173a));
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f4523a == this.f4523a && i1.f.a(iVar.f4524b, this.f4524b) && i1.f.a(iVar.a(), a()) && i1.f.a(iVar.f4525c, this.f4525c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4525c.hashCode() + ((a().hashCode() + ((this.f4524b.hashCode() + ((this.f4523a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a2 = a();
        ArrayList arrayList = new ArrayList(W0.l.t0(a2));
        for (Certificate certificate : a2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                i1.f.d(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f4523a);
        sb.append(" cipherSuite=");
        sb.append(this.f4524b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f4525c;
        ArrayList arrayList2 = new ArrayList(W0.l.t0(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                i1.f.d(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
