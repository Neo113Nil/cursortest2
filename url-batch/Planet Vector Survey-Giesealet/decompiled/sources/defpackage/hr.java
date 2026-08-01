package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class hr {
    public final float a;
    public final float b;
    public final long c;

    public hr(float f, float f2, long j) {
        this.a = f;
        this.b = f2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        return Float.compare(this.a, hrVar.a) == 0 && Float.compare(this.b, hrVar.b) == 0 && this.c == hrVar.c;
    }

    public final int hashCode() {
        int t = y6.t(this.b, Float.floatToIntBits(this.a) * 31, 31);
        long j = this.c;
        return t + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.a + ", distance=" + this.b + ", duration=" + this.c + ')';
    }
}
