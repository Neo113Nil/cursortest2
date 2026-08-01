package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class z9 {
    public final float a;
    public final ks0 b;

    public z9(float f, ks0 ks0Var) {
        this.a = f;
        this.b = ks0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return jn.a(this.a, z9Var.a) && this.b.equals(z9Var.b);
    }

    public final int hashCode() {
        return ge.i(this.b.k) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) jn.b(this.a)) + ", brush=" + this.b + ')';
    }
}
