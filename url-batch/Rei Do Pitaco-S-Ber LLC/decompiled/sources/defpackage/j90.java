package defpackage;

import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class j90 {
    public static boolean a = true;
    public static Field b;
    public static boolean c;

    public abstract int a(View view, int i);

    public abstract int b(View view, int i);

    public float c(View view) {
        if (a) {
            try {
                return i90.a(view);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public int d(View view) {
        return 0;
    }

    public int e() {
        return 0;
    }

    public abstract void g(int i);

    public abstract void h(View view, int i, int i2);

    public abstract void i(View view, float f, float f2);

    public void j(View view, float f) {
        if (a) {
            try {
                i90.b(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public abstract boolean k(View view, int i);

    public void f(View view, int i) {
    }
}
