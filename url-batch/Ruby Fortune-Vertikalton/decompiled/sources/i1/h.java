package i1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f2423e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f2424f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2426b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2427c;
    public final String[] d;

    static {
        f fVar = f.f2416r;
        f fVar2 = f.f2417s;
        f fVar3 = f.f2418t;
        f fVar4 = f.f2410l;
        f fVar5 = f.f2412n;
        f fVar6 = f.f2411m;
        f fVar7 = f.f2413o;
        f fVar8 = f.f2415q;
        f fVar9 = f.f2414p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f2408j, f.f2409k, f.h, f.i, f.f2406f, f.f2407g, f.f2405e};
        g gVar = new g();
        gVar.b((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        x xVar = x.TLS_1_3;
        x xVar2 = x.TLS_1_2;
        gVar.d(xVar, xVar2);
        if (!gVar.f2420a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar.f2421b = true;
        gVar.a();
        g gVar2 = new g();
        gVar2.b((f[]) Arrays.copyOf(fVarArr, 16));
        gVar2.d(xVar, xVar2);
        if (!gVar2.f2420a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar2.f2421b = true;
        f2423e = gVar2.a();
        g gVar3 = new g();
        gVar3.b((f[]) Arrays.copyOf(fVarArr, 16));
        gVar3.d(xVar, xVar2, x.TLS_1_1, x.TLS_1_0);
        if (!gVar3.f2420a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        gVar3.f2421b = true;
        gVar3.a();
        f2424f = new h(false, false, null, null);
    }

    public h(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f2425a = z2;
        this.f2426b = z3;
        this.f2427c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f2427c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f2403b.c(str));
        }
        return Q0.d.x0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f2425a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !j1.b.h(strArr, sSLSocket.getEnabledProtocols(), R0.a.f669b)) {
            return false;
        }
        String[] strArr2 = this.f2427c;
        return strArr2 == null || j1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f2404c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(q.e(str));
        }
        return Q0.d.x0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        h hVar = (h) obj;
        boolean z2 = hVar.f2425a;
        boolean z3 = this.f2425a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f2427c, hVar.f2427c) && Arrays.equals(this.d, hVar.d) && this.f2426b == hVar.f2426b);
    }

    public final int hashCode() {
        if (!this.f2425a) {
            return 17;
        }
        String[] strArr = this.f2427c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f2426b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f2425a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f2426b + ')';
    }
}
