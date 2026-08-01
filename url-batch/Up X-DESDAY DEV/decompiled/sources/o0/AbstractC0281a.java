package o0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0281a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f3335a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final Z.a f3336b = new Z.a(Z.a.d);

    /* renamed from: c, reason: collision with root package name */
    public static final Z.a f3337c = new Z.a();
    public static final Z.a d = new Z.a(Z.a.f1026e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : a(f2, f3, (f6 - f4) / (f5 - f4));
    }

    public static int c(int i, int i2, float f2) {
        return Math.round(f2 * (i2 - i)) + i;
    }
}
