package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class U0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3376a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3377b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3378c;
    public Serializable d;

    public x1.g a() {
        return new x1.g(this.f3376a, this.f3377b, (String[]) this.f3378c, (String[]) this.d);
    }

    public void b(String... strArr) {
        i1.f.e(strArr, "cipherSuites");
        if (!this.f3376a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f3378c = (String[]) strArr.clone();
    }

    public void c(x1.f... fVarArr) {
        i1.f.e(fVarArr, "cipherSuites");
        if (!this.f3376a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (x1.f fVar : fVarArr) {
            arrayList.add(fVar.f4507a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void d(String... strArr) {
        i1.f.e(strArr, "tlsVersions");
        if (!this.f3376a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.d = (String[]) strArr.clone();
    }

    public void e(x1.u... uVarArr) {
        if (!this.f3376a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(uVarArr.length);
        for (x1.u uVar : uVarArr) {
            arrayList.add(uVar.f4618a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        d((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
