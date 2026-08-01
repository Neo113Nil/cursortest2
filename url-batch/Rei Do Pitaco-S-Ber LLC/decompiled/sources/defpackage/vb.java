package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class vb {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public wb a() {
        return new wb(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(da... daVarArr) {
        if (!this.a) {
            l8.l("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(daVarArr.length);
        for (da daVar : daVarArr) {
            arrayList.add(daVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... strArr) {
        if (!this.a) {
            l8.l("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            l8.l("At least one cipher suite is required");
        }
    }

    public void d(i50... i50VarArr) {
        if (!this.a) {
            l8.l("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(i50VarArr.length);
        for (i50 i50Var : i50VarArr) {
            arrayList.add(i50Var.f);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        if (!this.a) {
            l8.l("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.d = (String[]) strArr.clone();
        } else {
            l8.l("At least one TLS version is required");
        }
    }
}
