package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class jn implements Comparable {
    public final float d;

    public static final boolean a(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.d, ((jn) obj).d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jn) {
            return Float.compare(this.d, ((jn) obj).d) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return b(this.d);
    }
}
