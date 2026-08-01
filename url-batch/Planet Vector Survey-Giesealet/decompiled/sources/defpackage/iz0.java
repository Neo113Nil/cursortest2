package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class iz0 extends gz0 {
    public final String d;
    public final List e;
    public final int f;
    public final px0 g;
    public final float h;
    public final px0 i;
    public final float j;
    public final float k;
    public final int l;
    public final int m;
    public final float n;
    public final float o;
    public final float p;
    public final float q;

    public iz0(String str, List list, int i, px0 px0Var, float f, px0 px0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.d = str;
        this.e = list;
        this.f = i;
        this.g = px0Var;
        this.h = f;
        this.i = px0Var2;
        this.j = f2;
        this.k = f3;
        this.l = i2;
        this.m = i3;
        this.n = f4;
        this.o = f5;
        this.p = f6;
        this.q = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz0.class != obj.getClass()) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        return this.d.equals(iz0Var.d) && nz.l(this.g, iz0Var.g) && this.h == iz0Var.h && nz.l(this.i, iz0Var.i) && this.j == iz0Var.j && this.k == iz0Var.k && this.l == iz0Var.l && this.m == iz0Var.m && this.n == iz0Var.n && this.o == iz0Var.o && this.p == iz0Var.p && this.q == iz0Var.q && this.f == iz0Var.f && nz.l(this.e, iz0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        px0 px0Var = this.g;
        int t = y6.t(this.h, (hashCode + (px0Var != null ? px0Var.hashCode() : 0)) * 31, 31);
        px0 px0Var2 = this.i;
        return y6.t(this.q, y6.t(this.p, y6.t(this.o, y6.t(this.n, (((y6.t(this.k, y6.t(this.j, (t + (px0Var2 != null ? px0Var2.hashCode() : 0)) * 31, 31), 31) + this.l) * 31) + this.m) * 31, 31), 31), 31), 31) + this.f;
    }
}
