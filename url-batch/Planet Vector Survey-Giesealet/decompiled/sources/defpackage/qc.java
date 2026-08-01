package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qc {
    public final float a;

    public qc(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qc)) {
            return false;
        }
        return jn.a(0.0f, 0.0f) && jn.a(0.0f, 0.0f) && jn.a(0.0f, 0.0f) && jn.a(this.a, ((qc) obj).a) && jn.a(0.0f, 0.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + y6.t(this.a, y6.t(0.0f, y6.t(0.0f, Float.floatToIntBits(0.0f) * 31, 31), 31), 31);
    }
}
