package yads;

import java.util.List;

/* loaded from: classes6.dex */
public final class qb3 {
    public final List a;
    public final c83[] b;

    public qb3(List list) {
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
            iw0 iw0Var = new iw0();
            z93Var.b();
            iw0Var.a = z93Var.e;
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
