package yads;

import java.util.List;

/* loaded from: classes3.dex */
public final class ey2 {
    public final List a;
    public final c83[] b;

    public ey2(List list) {
        this.a = list;
        this.b = new c83[list.size()];
    }

    public final void a(wp0 wp0Var, z93 z93Var) {
        for (int i = 0; i < this.b.length; i++) {
            z93Var.a();
            z93Var.b();
            c83 a = wp0Var.a(z93Var.d, 3);
            jw0 jw0Var = (jw0) this.a.get(i);
            String str = jw0Var.m;
            oh.a("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = jw0Var.b;
            if (str2 == null) {
                z93Var.b();
                str2 = z93Var.e;
            }
            iw0 iw0Var = new iw0();
            iw0Var.a = str2;
            iw0Var.k = str;
            iw0Var.d = jw0Var.e;
            iw0Var.c = jw0Var.d;
            iw0Var.C = jw0Var.E;
            iw0Var.m = jw0Var.o;
            a.a(new jw0(iw0Var));
            this.b[i] = a;
        }
    }
}
