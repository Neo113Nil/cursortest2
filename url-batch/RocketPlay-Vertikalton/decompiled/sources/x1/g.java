package x1;

import c1.AbstractC0104b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import l.U0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final g f4508e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f4509f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4510a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4511b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f4512c;
    public final String[] d;

    static {
        f fVar = f.f4504r;
        f fVar2 = f.f4505s;
        f fVar3 = f.f4506t;
        f fVar4 = f.f4498l;
        f fVar5 = f.f4500n;
        f fVar6 = f.f4499m;
        f fVar7 = f.f4501o;
        f fVar8 = f.f4503q;
        f fVar9 = f.f4502p;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.f4496j, f.f4497k, f.h, f.i, f.f4494f, f.f4495g, f.f4493e};
        U0 u02 = new U0();
        u02.c((f[]) Arrays.copyOf(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9}, 9));
        u uVar = u.TLS_1_3;
        u uVar2 = u.TLS_1_2;
        u02.e(uVar, uVar2);
        if (!u02.f3376a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u02.f3377b = true;
        u02.a();
        U0 u03 = new U0();
        u03.c((f[]) Arrays.copyOf(fVarArr, 16));
        u03.e(uVar, uVar2);
        if (!u03.f3376a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u03.f3377b = true;
        f4508e = u03.a();
        U0 u04 = new U0();
        u04.c((f[]) Arrays.copyOf(fVarArr, 16));
        u04.e(uVar, uVar2, u.TLS_1_1, u.TLS_1_0);
        if (!u04.f3376a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        u04.f3377b = true;
        u04.a();
        f4509f = new g(false, false, null, null);
    }

    public g(boolean z2, boolean z3, String[] strArr, String[] strArr2) {
        this.f4510a = z2;
        this.f4511b = z3;
        this.f4512c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.f4512c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f4491b.c(str));
        }
        return W0.j.z0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.f4510a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !y1.b.h(strArr, sSLSocket.getEnabledProtocols(), Y0.a.f1543b)) {
            return false;
        }
        String[] strArr2 = this.f4512c;
        return strArr2 == null || y1.b.h(strArr2, sSLSocket.getEnabledCipherSuites(), f.f4492c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC0104b.k(str));
        }
        return W0.j.z0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        g gVar = (g) obj;
        boolean z2 = gVar.f4510a;
        boolean z3 = this.f4510a;
        if (z3 != z2) {
            return false;
        }
        return !z3 || (Arrays.equals(this.f4512c, gVar.f4512c) && Arrays.equals(this.d, gVar.d) && this.f4511b == gVar.f4511b);
    }

    public final int hashCode() {
        if (!this.f4510a) {
            return 17;
        }
        String[] strArr = this.f4512c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f4511b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f4510a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f4511b + ')';
    }
}
