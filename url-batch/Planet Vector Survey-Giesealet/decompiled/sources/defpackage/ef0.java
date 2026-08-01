package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ef0 implements oj {
    public final float a;

    public ef0(float f) {
        this.a = f;
        if (f < 0.0f || f > 100.0f) {
            g8.r("The percent should be in the range of [0, 100]");
            throw null;
        }
    }

    @Override // defpackage.oj
    public final float a(long j, sl slVar) {
        return (this.a / 100.0f) * fr0.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef0) && Float.compare(this.a, ((ef0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
