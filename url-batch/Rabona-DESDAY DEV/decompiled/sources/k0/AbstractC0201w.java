package k0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* renamed from: k0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0201w {

    /* renamed from: a, reason: collision with root package name */
    public static final C0174C f2841a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0180b f2842b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f2841a = new C0175D();
        } else {
            f2841a = new C0174C();
        }
        f2842b = new C0180b(Float.class, "translationAlpha", 5);
        new C0180b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        f2841a.v(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        f2841a.s(view, i);
    }
}
