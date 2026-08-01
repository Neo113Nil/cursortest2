package k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0184C f2844a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0188b f2845b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2844a = new C0185D();
        } else {
            f2844a = new C0184C();
        }
        f2845b = new C0188b(Float.class, "translationAlpha", 5);
        new C0188b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2844a.y(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2844a.v(view, i);
    }
}
