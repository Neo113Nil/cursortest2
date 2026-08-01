package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class ln {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof ln) {
            return this.a == ((ln) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        long j = this.a;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) jn.b(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) jn.b(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
