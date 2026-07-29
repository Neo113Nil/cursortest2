package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: o.Jd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240Jd {
    public static final C0240Jd e;
    public static final C0240Jd f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        C0850cb c0850cb = C0850cb.r;
        C0850cb c0850cb2 = C0850cb.s;
        C0850cb c0850cb3 = C0850cb.t;
        C0850cb c0850cb4 = C0850cb.l;
        C0850cb c0850cb5 = C0850cb.n;
        C0850cb c0850cb6 = C0850cb.m;
        C0850cb c0850cb7 = C0850cb.f152o;
        C0850cb c0850cb8 = C0850cb.q;
        C0850cb c0850cb9 = C0850cb.p;
        C0850cb[] c0850cbArr = {c0850cb, c0850cb2, c0850cb3, c0850cb4, c0850cb5, c0850cb6, c0850cb7, c0850cb8, c0850cb9};
        C0850cb[] c0850cbArr2 = {c0850cb, c0850cb2, c0850cb3, c0850cb4, c0850cb5, c0850cb6, c0850cb7, c0850cb8, c0850cb9, C0850cb.j, C0850cb.k, C0850cb.h, C0850cb.i, C0850cb.f, C0850cb.g, C0850cb.e};
        C0214Id c0214Id = new C0214Id();
        c0214Id.c((C0850cb[]) Arrays.copyOf(c0850cbArr, 9));
        TV tv = TV.i;
        TV tv2 = TV.j;
        c0214Id.e(tv, tv2);
        if (!c0214Id.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0214Id.b = true;
        c0214Id.a();
        C0214Id c0214Id2 = new C0214Id();
        c0214Id2.c((C0850cb[]) Arrays.copyOf(c0850cbArr2, 16));
        c0214Id2.e(tv, tv2);
        if (!c0214Id2.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0214Id2.b = true;
        e = c0214Id2.a();
        C0214Id c0214Id3 = new C0214Id();
        c0214Id3.c((C0850cb[]) Arrays.copyOf(c0850cbArr2, 16));
        c0214Id3.e(tv, tv2, TV.k, TV.l);
        if (!c0214Id3.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        c0214Id3.b = true;
        c0214Id3.a();
        f = new C0240Jd(false, false, null, null);
    }

    public C0240Jd(boolean z, boolean z2, String[] strArr, String[] strArr2) {
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
            arrayList.add(C0850cb.b.i0(str));
        }
        return AbstractC0720ac.J0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !HY.h(strArr, sSLSocket.getEnabledProtocols(), C1090gE.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || HY.h(strArr2, sSLSocket.getEnabledCipherSuites(), C0850cb.c);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC1035fP.d(str));
        }
        return AbstractC0720ac.J0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0240Jd)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0240Jd c0240Jd = (C0240Jd) obj;
        boolean z = c0240Jd.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, c0240Jd.c) && Arrays.equals(this.d, c0240Jd.d) && this.b == c0240Jd.b;
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
