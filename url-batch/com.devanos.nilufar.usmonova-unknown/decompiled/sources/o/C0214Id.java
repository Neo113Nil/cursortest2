package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: o.Id, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214Id {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public C0240Jd a() {
        return new C0240Jd(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(String... strArr) {
        AbstractC0048Bt.n(strArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.c = (String[]) strArr.clone();
    }

    public void c(C0850cb... c0850cbArr) {
        AbstractC0048Bt.n(c0850cbArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(c0850cbArr.length);
        for (C0850cb c0850cb : c0850cbArr) {
            arrayList.add(c0850cb.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        AbstractC0048Bt.n(strArr, "tlsVersions");
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(TV... tvArr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(tvArr.length);
        for (TV tv : tvArr) {
            arrayList.add(tv.h);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
