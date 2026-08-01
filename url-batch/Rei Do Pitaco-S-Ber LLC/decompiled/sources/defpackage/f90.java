package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class f90 {
    public static final n90 a;
    public static final m9 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new o90();
        } else {
            a = new n90();
        }
        b = new m9(Float.class, "translationAlpha", 5);
        new m9(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.l(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.m(view, i);
    }
}
