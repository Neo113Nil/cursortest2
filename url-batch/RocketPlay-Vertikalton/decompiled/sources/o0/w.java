package o0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0299B f3701a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0304b f3702b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f3701a = new C0300C();
        } else {
            f3701a = new C0299B();
        }
        f3702b = new C0304b(Float.class, "translationAlpha", 5);
        new C0304b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f3701a.C(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f3701a.y(view, i);
    }
}
