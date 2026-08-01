package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: l.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3508b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0279u f3509c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f3510a;

    public static synchronized C0279u a() {
        C0279u c0279u;
        synchronized (C0279u.class) {
            try {
                if (f3509c == null) {
                    d();
                }
                c0279u = f3509c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0279u;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0279u.class) {
            e2 = N0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0279u.class) {
            if (f3509c == null) {
                C0279u c0279u = new C0279u();
                f3509c = c0279u;
                c0279u.f3510a = N0.b();
                N0 n0 = f3509c.f3510a;
                E1.h hVar = new E1.h();
                synchronized (n0) {
                    n0.f3350e = hVar;
                }
            }
        }
    }

    public static void e(Drawable drawable, U0 u02, int[] iArr) {
        PorterDuff.Mode mode = N0.f3345f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = u02.f3377b;
        if (!z2 && !u02.f3376a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) u02.f3378c : null;
        PorterDuff.Mode mode2 = u02.f3376a ? (PorterDuff.Mode) u02.d : N0.f3345f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3510a.c(context, i);
    }
}
