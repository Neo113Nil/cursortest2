package o;

/* renamed from: o.pW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1700pW {
    public static final long a = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
    public static final /* synthetic */ int b = 0;

    public static final float a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }
}
