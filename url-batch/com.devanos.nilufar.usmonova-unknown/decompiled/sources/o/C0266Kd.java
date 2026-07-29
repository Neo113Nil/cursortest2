package o;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: o.Kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266Kd {
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public C0266Kd(List list) {
        AbstractC0048Bt.n(list, "connectionSpecs");
        this.a = list;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Serializable, java.lang.String[]] */
    public final C0240Jd a(SSLSocket sSLSocket) {
        C0240Jd c0240Jd;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                c0240Jd = null;
                break;
            }
            c0240Jd = (C0240Jd) list.get(i2);
            if (c0240Jd.b(sSLSocket)) {
                this.b = i2 + 1;
                break;
            }
            i2++;
        }
        if (c0240Jd == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC0048Bt.k(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            AbstractC0048Bt.m(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z = false;
                break;
            }
            if (((C0240Jd) list.get(i3)).b(sSLSocket)) {
                z = true;
                break;
            }
            i3++;
        }
        this.c = z;
        boolean z2 = this.d;
        ?? r1 = c0240Jd.d;
        String[] strArr = c0240Jd.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC0048Bt.m(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = HY.n(enabledCipherSuites2, strArr, C0850cb.c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (r1 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            AbstractC0048Bt.m(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = HY.n(enabledProtocols3, r1, C1090gE.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC0048Bt.m(supportedCipherSuites, "supportedCipherSuites");
        C0685a3 c0685a3 = C0850cb.c;
        byte[] bArr = HY.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c0685a3.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            AbstractC0048Bt.m(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            AbstractC0048Bt.m(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC0048Bt.m(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C0214Id c0214Id = new C0214Id();
        c0214Id.a = c0240Jd.a;
        c0214Id.c = strArr;
        c0214Id.d = r1;
        c0214Id.b = c0240Jd.b;
        AbstractC0048Bt.m(enabledCipherSuites, "cipherSuitesIntersection");
        c0214Id.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC0048Bt.m(enabledProtocols, "tlsVersionsIntersection");
        c0214Id.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C0240Jd a = c0214Id.a();
        if (a.c() != null) {
            sSLSocket.setEnabledProtocols(a.d);
        }
        if (a.a() != null) {
            sSLSocket.setEnabledCipherSuites(a.c);
        }
        return c0240Jd;
    }
}
