package o;

/* renamed from: o.rV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1830rV {
    public static final C1896sV[] b = {new C1896sV(0), new C1896sV(4294967296L), new C1896sV(8589934592L)};
    public static final long c = AbstractC2219xO.s(0, Float.NaN);
    public final long a;

    public /* synthetic */ C1830rV(long j) {
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

    public static String d(long j) {
        long b2 = b(j);
        if (C1896sV.a(b2, 0L)) {
            return "Unspecified";
        }
        if (C1896sV.a(b2, 4294967296L)) {
            return c(j) + ".sp";
        }
        if (!C1896sV.a(b2, 8589934592L)) {
            return "Invalid";
        }
        return c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1830rV) {
            return this.a == ((C1830rV) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return d(this.a);
    }
}
