package o;

/* loaded from: classes.dex */
public abstract class ZR {
    public static final float a(long j) {
        if (j != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float b(long j) {
        if (j != 9205357640488583168L) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }
}
