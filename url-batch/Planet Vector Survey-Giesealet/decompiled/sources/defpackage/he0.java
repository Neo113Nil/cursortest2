package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class he0 extends ye0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;

    public he0(float f, float f2, float f3, float f4, float f5, float f6) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he0)) {
            return false;
        }
        he0 he0Var = (he0) obj;
        return Float.compare(this.c, he0Var.c) == 0 && Float.compare(this.d, he0Var.d) == 0 && Float.compare(this.e, he0Var.e) == 0 && Float.compare(this.f, he0Var.f) == 0 && Float.compare(this.g, he0Var.g) == 0 && Float.compare(this.h, he0Var.h) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.h) + y6.t(this.g, y6.t(this.f, y6.t(this.e, y6.t(this.d, Float.floatToIntBits(this.c) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return y6.w(sb, this.h, ')');
    }
}
