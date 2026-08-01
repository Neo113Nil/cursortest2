package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0236t {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3077b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0236t f3078c;

    /* renamed from: a, reason: collision with root package name */
    public L0 f3079a;

    public static synchronized C0236t a() {
        C0236t c0236t;
        synchronized (C0236t.class) {
            try {
                if (f3078c == null) {
                    d();
                }
                c0236t = f3078c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0236t;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0236t.class) {
            e2 = L0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0236t.class) {
            if (f3078c == null) {
                C0236t c0236t = new C0236t();
                f3078c = c0236t;
                c0236t.f3079a = L0.b();
                L0 l02 = f3078c.f3079a;
                C0234s c0234s = new C0234s();
                synchronized (l02) {
                    l02.f2915e = c0234s;
                }
            }
        }
    }

    public static void e(Drawable drawable, S0 s02, int[] iArr) {
        PorterDuff.Mode mode = L0.f2910f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = s02.d;
        if (!z2 && !s02.f2944c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? s02.f2942a : null;
        PorterDuff.Mode mode2 = s02.f2944c ? s02.f2943b : L0.f2910f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = L0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3079a.c(context, i);
    }
}
