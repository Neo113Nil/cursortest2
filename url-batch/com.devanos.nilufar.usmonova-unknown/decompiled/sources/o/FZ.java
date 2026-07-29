package o;

/* loaded from: classes.dex */
public interface FZ {
    default long a() {
        float f = 48;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
    }
}
