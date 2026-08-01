package defpackage;

import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rv0 {
    public final l7 a;
    public final dw0 b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final sl g;
    public final c10 h;
    public final ct i;
    public final long j;

    public rv0(l7 l7Var, dw0 dw0Var, List list, int i, boolean z, int i2, sl slVar, c10 c10Var, ct ctVar, long j) {
        this.a = l7Var;
        this.b = dw0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = slVar;
        this.h = c10Var;
        this.i = ctVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv0)) {
            return false;
        }
        rv0 rv0Var = (rv0) obj;
        return nz.l(this.a, rv0Var.a) && nz.l(this.b, rv0Var.b) && this.c.equals(rv0Var.c) && this.d == rv0Var.d && this.e == rv0Var.e && this.f == rv0Var.f && nz.l(this.g, rv0Var.g) && this.h == rv0Var.h && nz.l(this.i, rv0Var.i) && ui.b(this.j, rv0Var.j);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) + this.d) * 31) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31)) * 31)) * 31)) * 31;
        long j = this.j;
        return ((int) (j ^ (j >>> 32))) + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (i == 1 ? "Clip" : i == 2 ? "Ellipsis" : i == 5 ? "MiddleEllipsis" : i == 3 ? "Visible" : i == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) ui.k(this.j));
        sb.append(')');
        return sb.toString();
    }
}
