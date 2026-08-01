package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class rd0 {
    public final a5 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public rd0(a5 a5Var, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = a5Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final int a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return rg0.g(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rd0) {
            rd0 rd0Var = (rd0) obj;
            if (this.a == rd0Var.a && this.b == rd0Var.b && this.c == rd0Var.c && this.d == rd0Var.d && this.e == rd0Var.e && Float.compare(this.f, rd0Var.f) == 0 && Float.compare(this.g, rd0Var.g) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.g) + y6.t(this.f, ((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return y6.w(sb, this.g, ')');
    }
}
