package B1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import l.U0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f160a;

    /* renamed from: b, reason: collision with root package name */
    public int f161b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f162c;
    public boolean d;

    public b(List list) {
        i1.f.e(list, "connectionSpecs");
        this.f160a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final x1.g a(SSLSocket sSLSocket) {
        x1.g gVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f161b;
        List list = this.f160a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = (x1.g) list.get(i2);
            if (gVar.b(sSLSocket)) {
                this.f161b = i2 + 1;
                break;
            }
            i2++;
        }
        if (gVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            i1.f.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            i1.f.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f161b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((x1.g) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f162c = z2;
        boolean z3 = this.d;
        String[] strArr = gVar.f4512c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            i1.f.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = y1.b.n(enabledCipherSuites2, strArr, x1.f.f4492c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = gVar.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            i1.f.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = y1.b.n(enabledProtocols3, r6, Y0.a.f1543b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        i1.f.d(supportedCipherSuites, "supportedCipherSuites");
        x1.e eVar = x1.f.f4492c;
        byte[] bArr = y1.b.f4648a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (eVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z3 && i != -1) {
            i1.f.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            i1.f.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            i1.f.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        U0 u02 = new U0();
        u02.f3376a = gVar.f4510a;
        u02.f3378c = strArr;
        u02.d = r6;
        u02.f3377b = gVar.f4511b;
        i1.f.d(enabledCipherSuites, "cipherSuitesIntersection");
        u02.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        i1.f.d(enabledProtocols, "tlsVersionsIntersection");
        u02.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        x1.g a2 = u02.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f4512c);
        }
        return gVar;
    }
}
