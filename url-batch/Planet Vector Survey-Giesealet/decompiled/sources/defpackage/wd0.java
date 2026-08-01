package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class wd0 implements j7 {
    public final int a;
    public final int b;
    public final long c;
    public final mv0 d;
    public final lg0 e;
    public final z20 f;
    public final int g;
    public final int h;
    public final wv0 i;

    public wd0(int i, int i2, long j, mv0 mv0Var, lg0 lg0Var, z20 z20Var, int i3, int i4, wv0 wv0Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = mv0Var;
        this.e = lg0Var;
        this.f = z20Var;
        this.g = i3;
        this.h = i4;
        this.i = wv0Var;
        if (fw0.a(j, fw0.c) || fw0.c(j) >= 0.0f) {
            return;
        }
        dy.b("lineHeight can't be negative (" + fw0.c(j) + ')');
    }

    public final wd0 a(wd0 wd0Var) {
        return wd0Var == null ? this : xd0.a(this, wd0Var.a, wd0Var.b, wd0Var.c, wd0Var.d, wd0Var.e, wd0Var.f, wd0Var.g, wd0Var.h, wd0Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0)) {
            return false;
        }
        wd0 wd0Var = (wd0) obj;
        return this.a == wd0Var.a && this.b == wd0Var.b && fw0.a(this.c, wd0Var.c) && nz.l(this.d, wd0Var.d) && nz.l(this.e, wd0Var.e) && nz.l(this.f, wd0Var.f) && this.g == wd0Var.g && this.h == wd0Var.h && nz.l(this.i, wd0Var.i);
    }

    public final int hashCode() {
        int d = (fw0.d(this.c) + (((this.a * 31) + this.b) * 31)) * 31;
        mv0 mv0Var = this.d;
        int hashCode = (d + (mv0Var != null ? mv0Var.hashCode() : 0)) * 31;
        lg0 lg0Var = this.e;
        int hashCode2 = (hashCode + (lg0Var != null ? lg0Var.hashCode() : 0)) * 31;
        z20 z20Var = this.f;
        int hashCode3 = (((((hashCode2 + (z20Var != null ? z20Var.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        wv0 wv0Var = this.i;
        return hashCode3 + (wv0Var != null ? wv0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) dv0.a(this.a)) + ", textDirection=" + ((Object) iv0.a(this.b)) + ", lineHeight=" + ((Object) fw0.e(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) u20.a(this.g)) + ", hyphens=" + ((Object) qw.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
