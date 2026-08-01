package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264v {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3069b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0264v f3070c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f3071a;

    public static synchronized C0264v a() {
        C0264v c0264v;
        synchronized (C0264v.class) {
            try {
                if (f3070c == null) {
                    d();
                }
                c0264v = f3070c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0264v;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0264v.class) {
            e2 = N0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0264v.class) {
            if (f3070c == null) {
                C0264v c0264v = new C0264v();
                f3070c = c0264v;
                c0264v.f3071a = N0.b();
                N0 n02 = f3070c.f3071a;
                C0262u c0262u = new C0262u();
                synchronized (n02) {
                    n02.f2905e = c0262u;
                }
            }
        }
    }

    public static void e(Drawable drawable, i1.g gVar, int[] iArr) {
        PorterDuff.Mode mode = N0.f2900f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = gVar.f2421b;
        if (!z2 && !gVar.f2420a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) gVar.f2422c : null;
        PorterDuff.Mode mode2 = gVar.f2420a ? (PorterDuff.Mode) gVar.d : N0.f2900f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3071a.c(context, i);
    }
}
