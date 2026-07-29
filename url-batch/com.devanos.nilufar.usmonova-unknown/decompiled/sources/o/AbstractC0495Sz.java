package o;

/* renamed from: o.Sz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0495Sz {
    public static final float a;
    public static final float b;
    public static final float c;

    static {
        a(0.0f);
        a(0.5f);
        a = 0.5f;
        a(-1.0f);
        b = -1.0f;
        a(1.0f);
        c = 1.0f;
    }

    public static void a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }
}
