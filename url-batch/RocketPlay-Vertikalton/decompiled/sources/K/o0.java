package K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class o0 extends r0 {

    /* renamed from: e, reason: collision with root package name */
    public static Field f697e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f698f = false;

    /* renamed from: g, reason: collision with root package name */
    public static Constructor f699g = null;
    public static boolean h = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f700c;
    public C.d d;

    public o0() {
        this.f700c = i();
    }

    private static WindowInsets i() {
        if (!f698f) {
            try {
                f697e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f698f = true;
        }
        Field field = f697e;
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
                f699g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            h = true;
        }
        Constructor constructor = f699g;
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
        z0 g2 = z0.g(null, this.f700c);
        C.d[] dVarArr = this.f705b;
        x0 x0Var = g2.f729a;
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
        WindowInsets windowInsets = this.f700c;
        if (windowInsets != null) {
            this.f700c = windowInsets.replaceSystemWindowInsets(dVar.f232a, dVar.f233b, dVar.f234c, dVar.d);
        }
    }

    public o0(z0 z0Var) {
        super(z0Var);
        this.f700c = z0Var.f();
    }
}
