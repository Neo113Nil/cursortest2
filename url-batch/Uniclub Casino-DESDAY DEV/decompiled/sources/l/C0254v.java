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
public final class C0254v {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f3078b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0254v f3079c;

    /* renamed from: a, reason: collision with root package name */
    public N0 f3080a;

    public static synchronized C0254v a() {
        C0254v c0254v;
        synchronized (C0254v.class) {
            try {
                if (f3079c == null) {
                    d();
                }
                c0254v = f3079c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0254v;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter e2;
        synchronized (C0254v.class) {
            e2 = N0.e(i, mode);
        }
        return e2;
    }

    public static synchronized void d() {
        synchronized (C0254v.class) {
            if (f3079c == null) {
                C0254v c0254v = new C0254v();
                f3079c = c0254v;
                c0254v.f3080a = N0.b();
                N0 n02 = f3079c.f3080a;
                C0252u c0252u = new C0252u();
                synchronized (n02) {
                    n02.f2914e = c0252u;
                }
            }
        }
    }

    public static void e(Drawable drawable, i1.g gVar, int[] iArr) {
        PorterDuff.Mode mode = N0.f2909f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = gVar.f2430b;
        if (!z2 && !gVar.f2429a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) gVar.f2431c : null;
        PorterDuff.Mode mode2 = gVar.f2429a ? (PorterDuff.Mode) gVar.d : N0.f2909f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = N0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.f3080a.c(context, i);
    }
}
