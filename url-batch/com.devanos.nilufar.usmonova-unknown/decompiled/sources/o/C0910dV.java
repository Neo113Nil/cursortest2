package o;

/* renamed from: o.dV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910dV {
    public final float a;
    public final float b;

    public C0910dV(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0910dV)) {
            return false;
        }
        C0910dV c0910dV = (C0910dV) obj;
        return this.a == c0910dV.a && this.b == c0910dV.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=" + this.a + ", skewX=" + this.b + ')';
    }
}
