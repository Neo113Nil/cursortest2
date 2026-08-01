package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class o0 extends r0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f435e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f436f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f437g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f438c;
    public C.d d;

    public o0() {
        this.f438c = i();
    }

    private static WindowInsets i() {
        if (!f436f) {
            try {
                f435e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f436f = true;
        }
        Field field = f435e;
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
        if (!h) {
            try {
                f437g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = f437g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // K.r0
    public z0 b() {
        a();
        z0 g2 = z0.g(null, this.f438c);
        C.d[] dVarArr = this.f443b;
        x0 x0Var = g2.f465a;
        x0Var.o(dVarArr);
        x0Var.q(this.d);
        return g2;
    }

    @Override // K.r0
    public void e(C.d dVar) {
        this.d = dVar;
    }

    @Override // K.r0
    public void g(C.d dVar) {
        WindowInsets windowInsets = this.f438c;
        if (windowInsets != null) {
            this.f438c = windowInsets.replaceSystemWindowInsets(dVar.f94a, dVar.f95b, dVar.f96c, dVar.d);
        }
    }

    public o0(z0 z0Var) {
        super(z0Var);
        this.f438c = z0Var.f();
    }
}
