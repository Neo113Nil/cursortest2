package o;

/* loaded from: classes.dex */
public final class H00 {
    public final float a;
    public final float b;

    public H00(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float[] a() {
        float f = this.a;
        float f2 = this.b;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H00)) {
            return false;
        }
        H00 h00 = (H00) obj;
        return Float.compare(this.a, h00.a) == 0 && Float.compare(this.b, h00.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.a + ", y=" + this.b + ')';
    }
}
