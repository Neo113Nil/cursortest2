package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class wb {
    public static final wb e;
    public static final wb f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        da daVar = da.r;
        da daVar2 = da.s;
        da daVar3 = da.t;
        da daVar4 = da.l;
        da daVar5 = da.n;
        da daVar6 = da.m;
        da daVar7 = da.o;
        da daVar8 = da.q;
        da daVar9 = da.p;
        da[] daVarArr = {daVar, daVar2, daVar3, daVar4, daVar5, daVar6, daVar7, daVar8, daVar9};
        da[] daVarArr2 = {daVar, daVar2, daVar3, daVar4, daVar5, daVar6, daVar7, daVar8, daVar9, da.j, da.k, da.h, da.i, da.f, da.g, da.e};
        vb vbVar = new vb();
        vbVar.b((da[]) Arrays.copyOf(daVarArr, 9));
        i50 i50Var = i50.TLS_1_3;
        i50 i50Var2 = i50.TLS_1_2;
        vbVar.d(i50Var, i50Var2);
        vbVar.b = true;
        vbVar.a();
        vb vbVar2 = new vb();
        vbVar2.b((da[]) Arrays.copyOf(daVarArr2, 16));
        vbVar2.d(i50Var, i50Var2);
        vbVar2.b = true;
        e = vbVar2.a();
        vb vbVar3 = new vb();
        vbVar3.b((da[]) Arrays.copyOf(daVarArr2, 16));
        vbVar3.d(i50Var, i50Var2, i50.TLS_1_1, i50.TLS_1_0);
        vbVar3.b = true;
        vbVar3.a();
        f = new wb(false, false, null, null);
    }

    public wb(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(da.b.m(str));
        }
        return ua.c0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !z60.g(strArr, sSLSocket.getEnabledProtocols(), xt.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || z60.g(strArr2, sSLSocket.getEnabledCipherSuites(), da.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m60.v(str));
        }
        return ua.c0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        wb wbVar = (wb) obj;
        boolean z = wbVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, wbVar.c) && Arrays.equals(this.d, wbVar.d) && this.b == wbVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
