package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class n90 extends j90 {
    public static boolean d = true;
    public static boolean e = true;
    public static boolean f = true;
    public static boolean g = true;

    public void l(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                l90.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }

    public void m(View view, int i) {
        if (Build.VERSION.SDK_INT != 28) {
            if (g) {
                try {
                    m90.a(view, i);
                    return;
                } catch (NoSuchMethodError unused) {
                    g = false;
                    return;
                }
            }
            return;
        }
        if (!j90.c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                j90.b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            j90.c = true;
        }
        Field field = j90.b;
        if (field != null) {
            try {
                j90.b.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (IllegalAccessException unused3) {
            }
        }
    }

    public void n(View view, Matrix matrix) {
        if (d) {
            try {
                k90.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    public void o(ViewGroup viewGroup, Matrix matrix) {
        if (e) {
            try {
                k90.c(viewGroup, matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
