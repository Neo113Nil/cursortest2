package defpackage;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class fw0 {
    public static final gw0[] b = {new gw0(0), new gw0(4294967296L), new gw0(8589934592L)};
    public static final long c = ze0.p(0, Float.NaN);
    public final long a;

    public /* synthetic */ fw0(long j) {
        this.a = j;
    }

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final long b(long j) {
        return b[(int) ((j & 1095216660480L) >>> 32)].a;
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static int d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String e(long j) {
        long b2 = b(j);
        if (gw0.a(b2, 0L)) {
            return "Unspecified";
        }
        if (gw0.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!gw0.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fw0) {
            return this.a == ((fw0) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
