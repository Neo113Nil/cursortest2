package o;

/* renamed from: o.vm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2111vm {
    public static final float[] a;

    static {
        long[] jArr = UP.a;
        int f = UP.f(0);
        int max = f > 0 ? Math.max(7, UP.e(f)) : 0;
        if (max != 0) {
            jArr = new long[((max + 15) & (-8)) >> 3];
            P6.h0(jArr);
        }
        int i = max >> 3;
        long j = 255 << ((max & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        float[] fArr = new float[max];
        a = new float[0];
    }
}
