package t0;

import a0.C0062a;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0369a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f4162a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C0062a f4163b = new C0062a(C0062a.d);

    /* renamed from: c, reason: collision with root package name */
    public static final C0062a f4164c = new C0062a();
    public static final C0062a d = new C0062a(C0062a.f1627e);

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
