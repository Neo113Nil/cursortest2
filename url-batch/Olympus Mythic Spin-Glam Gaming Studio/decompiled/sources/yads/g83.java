package yads;

import android.os.Bundle;

/* loaded from: classes9.dex */
public class g83 implements nq {
    public static final g83 B = new g83(new f83());
    public final q41 A;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final um2 m;
    public final int n;
    public final um2 o;
    public final int p;
    public final int q;
    public final int r;
    public final um2 s;
    public final um2 t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final o41 z;

    static {
        new mq() { // from class: yads.g83$$ExternalSyntheticLambda0
            @Override // yads.mq
            public final nq a(Bundle bundle) {
                return g83.a(bundle);
            }
        };
    }

    public g83(f83 f83Var) {
        this.b = f83Var.a;
        this.c = f83Var.b;
        this.d = f83Var.c;
        this.e = f83Var.d;
        this.f = f83Var.e;
        this.g = f83Var.f;
        this.h = f83Var.g;
        this.i = f83Var.h;
        this.j = f83Var.i;
        this.k = f83Var.j;
        this.l = f83Var.k;
        this.m = f83Var.l;
        this.n = f83Var.m;
        this.o = f83Var.n;
        this.p = f83Var.o;
        this.q = f83Var.p;
        this.r = f83Var.q;
        this.s = f83Var.r;
        this.t = f83Var.s;
        this.u = f83Var.t;
        this.v = f83Var.u;
        this.w = f83Var.v;
        this.x = f83Var.w;
        this.y = f83Var.x;
        this.z = o41.a(f83Var.y);
        this.A = q41.a(f83Var.z);
    }

    public static g83 a(Bundle bundle) {
        return new g83(new f83(bundle));
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g83 g83Var = (g83) obj;
        if (this.b == g83Var.b && this.c == g83Var.c && this.d == g83Var.d && this.e == g83Var.e && this.f == g83Var.f && this.g == g83Var.g && this.h == g83Var.h && this.i == g83Var.i && this.l == g83Var.l && this.j == g83Var.j && this.k == g83Var.k && this.m.equals(g83Var.m) && this.n == g83Var.n && this.o.equals(g83Var.o) && this.p == g83Var.p && this.q == g83Var.q && this.r == g83Var.r && this.s.equals(g83Var.s) && this.t.equals(g83Var.t) && this.u == g83Var.u && this.v == g83Var.v && this.w == g83Var.w && this.x == g83Var.x && this.y == g83Var.y) {
            o41 o41Var = this.z;
            o41 o41Var2 = g83Var.z;
            o41Var.getClass();
            if (o41Var == o41Var2) {
                z = true;
            } else if (o41Var2 != null) {
                z = ((q41) o41Var.entrySet()).equals(o41Var2.entrySet());
            } else {
                z = false;
            }
            if (z && this.A.equals(g83Var.A)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.A.hashCode() + ((((((((((((((this.t.hashCode() + ((this.s.hashCode() + ((((((((this.o.hashCode() + ((((this.m.hashCode() + ((((((((((((((((((((((this.b + 31) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.l ? 1 : 0)) * 31) + this.j) * 31) + this.k) * 31)) * 31) + this.n) * 31)) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31)) * 31)) * 31) + this.u) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + az2.a(this.z.entrySet())) * 31);
    }
}
