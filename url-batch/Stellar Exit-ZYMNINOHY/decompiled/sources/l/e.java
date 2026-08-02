package l;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: b, reason: collision with root package name */
    public static Field f901b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f902c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Constructor f903d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f904e = false;

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets f905a = c();

    private static WindowInsets c() {
        if (!f902c) {
            try {
                f901b = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f902c = true;
        }
        Field field = f901b;
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
        if (!f904e) {
            try {
                f903d = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f904e = true;
        }
        Constructor constructor = f903d;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // l.h
    public q b() {
        a();
        q a2 = q.a(null, this.f905a);
        o oVar = a2.f924a;
        oVar.n(null);
        oVar.p(null);
        return a2;
    }
}
