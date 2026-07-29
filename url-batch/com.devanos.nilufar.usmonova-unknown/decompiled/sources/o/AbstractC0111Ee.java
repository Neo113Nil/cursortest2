package o;

/* renamed from: o.Ee, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0111Ee {
    public static final long a = AbstractC1305jX.b(0.0f);
    public static final /* synthetic */ int b = 0;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String d(long j) {
        if (b(j) == c(j)) {
            return "CornerRadius.circular(" + AbstractC1052fg.X(b(j)) + ')';
        }
        return "CornerRadius.elliptical(" + AbstractC1052fg.X(b(j)) + ", " + AbstractC1052fg.X(c(j)) + ')';
    }
}
