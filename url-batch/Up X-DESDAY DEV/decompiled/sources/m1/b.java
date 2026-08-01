package m1;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f3180a;

    /* renamed from: b, reason: collision with root package name */
    public int f3181b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3182c;
    public boolean d;

    public b(List list) {
        X0.e.e(list, "connectionSpecs");
        this.f3180a = list;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.io.Serializable, java.lang.String[]] */
    public final i1.h a(SSLSocket sSLSocket) {
        i1.h hVar;
        int i;
        boolean z2;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.f3181b;
        List list = this.f3180a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                hVar = null;
                break;
            }
            hVar = (i1.h) list.get(i2);
            if (hVar.b(sSLSocket)) {
                this.f3181b = i2 + 1;
                break;
            }
            i2++;
        }
        if (hVar == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            X0.e.b(enabledProtocols2);
            String arrays = Arrays.toString(enabledProtocols2);
            X0.e.d(arrays, "toString(this)");
            sb.append(arrays);
            throw new UnknownServiceException(sb.toString());
        }
        int i3 = this.f3181b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i3 >= size2) {
                z2 = false;
                break;
            }
            if (((i1.h) list.get(i3)).b(sSLSocket)) {
                z2 = true;
                break;
            }
            i3++;
        }
        this.f3182c = z2;
        boolean z3 = this.d;
        String[] strArr = hVar.f2430c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            X0.e.d(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = j1.b.n(enabledCipherSuites2, strArr, i1.f.f2407c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        ?? r6 = hVar.d;
        if (r6 != 0) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            X0.e.d(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = j1.b.n(enabledProtocols3, r6, R0.a.f669b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        X0.e.d(supportedCipherSuites, "supportedCipherSuites");
        i1.e eVar = i1.f.f2407c;
        byte[] bArr = j1.b.f2584a;
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
            X0.e.d(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            X0.e.d(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            X0.e.d(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        i1.g gVar = new i1.g();
        gVar.f2423a = hVar.f2428a;
        gVar.f2425c = strArr;
        gVar.d = r6;
        gVar.f2424b = hVar.f2429b;
        X0.e.d(enabledCipherSuites, "cipherSuitesIntersection");
        gVar.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        X0.e.d(enabledProtocols, "tlsVersionsIntersection");
        gVar.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i1.h a2 = gVar.a();
        if (a2.c() != null) {
            sSLSocket.setEnabledProtocols(a2.d);
        }
        if (a2.a() != null) {
            sSLSocket.setEnabledCipherSuites(a2.f2430c);
        }
        return hVar;
    }
}
