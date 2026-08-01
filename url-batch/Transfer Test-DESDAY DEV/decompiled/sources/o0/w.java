package o0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0257C f3274a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0263b f3275b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3274a = new C0258D();
        } else {
            f3274a = new C0257C();
        }
        f3275b = new C0263b(Float.class, "translationAlpha", 5);
        new C0263b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3274a.s(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3274a.o(view, i);
    }
}
