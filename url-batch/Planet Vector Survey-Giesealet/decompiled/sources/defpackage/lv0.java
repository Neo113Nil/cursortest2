package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class lv0 {
    public static final lv0 c = new lv0(1.0f, 0.0f);
    public final float a;
    public final float b;

    public lv0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv0)) {
            return false;
        }
        lv0 lv0Var = (lv0) obj;
        return this.a == lv0Var.a && this.b == lv0Var.b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return y6.w(sb, this.b, ')');
    }
}
