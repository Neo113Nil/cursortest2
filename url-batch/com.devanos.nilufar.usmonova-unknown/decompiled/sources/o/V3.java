package o;

/* loaded from: classes.dex */
public final class V3 {
    public float a;

    public V3(float f) {
        this.a = f;
    }

    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    public final int b() {
        return 1;
    }

    public final V3 c() {
        return new V3(0.0f);
    }

    public final void d(float f, int i) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof V3) && ((V3) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
