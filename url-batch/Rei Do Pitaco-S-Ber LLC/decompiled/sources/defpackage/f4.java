package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class f4 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static f4 c;
    public tz a;

    public static synchronized f4 a() {
        f4 f4Var;
        synchronized (f4.class) {
            try {
                if (c == null) {
                    d();
                }
                f4Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4Var;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e;
        synchronized (f4.class) {
            e = tz.e(i, mode);
        }
        return e;
    }

    public static synchronized void d() {
        synchronized (f4.class) {
            if (c == null) {
                f4 f4Var = new f4();
                c = f4Var;
                f4Var.a = tz.b();
                tz tzVar = c.a;
                e4 e4Var = new e4();
                synchronized (tzVar) {
                    tzVar.e = e4Var;
                }
            }
        }
    }

    public static void e(Drawable drawable, vb vbVar, int[] iArr) {
        PorterDuff.Mode mode = tz.f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = vbVar.b;
        if (!z && !vbVar.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z ? (ColorStateList) vbVar.c : null;
        PorterDuff.Mode mode2 = vbVar.a ? (PorterDuff.Mode) vbVar.d : tz.f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = tz.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.c(context, i);
    }
}
