package o;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class W00 extends Z00 {
    public static Field c = null;
    public static boolean d = false;
    public static Constructor e = null;
    public static boolean f = false;
    public WindowInsets a;
    public C0644Ys b;

    public W00() {
        this.a = e();
    }

    private static WindowInsets e() {
        if (!d) {
            try {
                c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f) {
            try {
                e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f = true;
        }
        Constructor constructor = e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // o.Z00
    public C1142h10 b() {
        a();
        C1142h10 c2 = C1142h10.c(this.a, null);
        C1010f10 c1010f10 = c2.a;
        c1010f10.o(null);
        c1010f10.q(this.b);
        return c2;
    }

    @Override // o.Z00
    public void c(C0644Ys c0644Ys) {
        this.b = c0644Ys;
    }

    @Override // o.Z00
    public void d(C0644Ys c0644Ys) {
        WindowInsets windowInsets = this.a;
        if (windowInsets != null) {
            this.a = windowInsets.replaceSystemWindowInsets(c0644Ys.a, c0644Ys.b, c0644Ys.c, c0644Ys.d);
        }
    }

    public W00(C1142h10 c1142h10) {
        super(c1142h10);
        this.a = c1142h10.b();
    }
}
