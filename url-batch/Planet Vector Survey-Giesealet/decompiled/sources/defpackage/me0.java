package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class me0 extends ye0 {
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public me0(float f, float f2, float f3, float f4) {
        super(2);
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me0)) {
            return false;
        }
        me0 me0Var = (me0) obj;
        return Float.compare(this.c, me0Var.c) == 0 && Float.compare(this.d, me0Var.d) == 0 && Float.compare(this.e, me0Var.e) == 0 && Float.compare(this.f, me0Var.f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f) + y6.t(this.e, y6.t(this.d, Float.floatToIntBits(this.c) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.c);
        sb.append(", y1=");
        sb.append(this.d);
        sb.append(", x2=");
        sb.append(this.e);
        sb.append(", y2=");
        return y6.w(sb, this.f, ')');
    }
}
