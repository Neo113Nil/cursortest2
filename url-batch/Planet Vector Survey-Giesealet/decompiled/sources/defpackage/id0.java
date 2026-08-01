package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class id0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public id0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f < 0.0f) {
            g8.r("Start padding must be non-negative");
            throw null;
        }
        if (f2 < 0.0f) {
            g8.r("Top padding must be non-negative");
            throw null;
        }
        if (f3 < 0.0f) {
            g8.r("End padding must be non-negative");
            throw null;
        }
        if (f4 >= 0.0f) {
            return;
        }
        g8.r("Bottom padding must be non-negative");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof id0)) {
            return false;
        }
        id0 id0Var = (id0) obj;
        return jn.a(this.a, id0Var.a) && jn.a(this.b, id0Var.b) && jn.a(this.c, id0Var.c) && jn.a(this.d, id0Var.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) + y6.t(this.c, y6.t(this.b, Float.floatToIntBits(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) jn.b(this.a)) + ", top=" + ((Object) jn.b(this.b)) + ", end=" + ((Object) jn.b(this.c)) + ", bottom=" + ((Object) jn.b(this.d)) + ')';
    }
}
