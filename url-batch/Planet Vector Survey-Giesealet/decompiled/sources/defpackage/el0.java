package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class el0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public el0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el0)) {
            return false;
        }
        el0 el0Var = (el0) obj;
        return this.a == el0Var.a && this.b == el0Var.b && this.c == el0Var.c && this.d == el0Var.d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + y6.t(this.c, y6.t(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.a);
        sb.append(", focusedAlpha=");
        sb.append(this.b);
        sb.append(", hoveredAlpha=");
        sb.append(this.c);
        sb.append(", pressedAlpha=");
        return y6.w(sb, this.d, ')');
    }
}
