package l;

import K.C0019l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: l.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271q {

    /* renamed from: a, reason: collision with root package name */
    public final View f3482a;
    public U0 d;

    /* renamed from: e, reason: collision with root package name */
    public U0 f3485e;

    /* renamed from: f, reason: collision with root package name */
    public U0 f3486f;

    /* renamed from: c, reason: collision with root package name */
    public int f3484c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0279u f3483b = C0279u.a();

    public C0271q(View view) {
        this.f3482a = view;
    }

    public final void a() {
        View view = this.f3482a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3486f == null) {
                    this.f3486f = new U0();
                }
                U0 u02 = this.f3486f;
                u02.f3378c = null;
                u02.f3377b = false;
                u02.d = null;
                u02.f3376a = false;
                WeakHashMap weakHashMap = K.T.f633a;
                ColorStateList g2 = K.H.g(view);
                if (g2 != null) {
                    u02.f3377b = true;
                    u02.f3378c = g2;
                }
                PorterDuff.Mode h = K.H.h(view);
                if (h != null) {
                    u02.f3376a = true;
                    u02.d = h;
                }
                if (u02.f3377b || u02.f3376a) {
                    C0279u.e(background, u02, view.getDrawableState());
                    return;
                }
            }
            U0 u03 = this.f3485e;
            if (u03 != null) {
                C0279u.e(background, u03, view.getDrawableState());
                return;
            }
            U0 u04 = this.d;
            if (u04 != null) {
                C0279u.e(background, u04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        U0 u02 = this.f3485e;
        if (u02 != null) {
            return (ColorStateList) u02.f3378c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        U0 u02 = this.f3485e;
        if (u02 != null) {
            return (PorterDuff.Mode) u02.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3482a;
        Context context = view.getContext();
        int[] iArr = f.a.f2580y;
        C0019l i2 = C0019l.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f684b;
        View view2 = this.f3482a;
        K.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) i2.f684b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3484c = typedArray.getResourceId(0, -1);
                C0279u c0279u = this.f3483b;
                Context context2 = view.getContext();
                int i3 = this.f3484c;
                synchronized (c0279u) {
                    f2 = c0279u.f3510a.f(context2, i3);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.H.q(view, i2.b(1));
            }
            if (typedArray.hasValue(2)) {
                K.H.r(view, AbstractC0266n0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            i2.k();
        }
    }

    public final void e() {
        this.f3484c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3484c = i;
        C0279u c0279u = this.f3483b;
        if (c0279u != null) {
            Context context = this.f3482a.getContext();
            synchronized (c0279u) {
                colorStateList = c0279u.f3510a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new U0();
            }
            U0 u02 = this.d;
            u02.f3378c = colorStateList;
            u02.f3377b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3485e == null) {
            this.f3485e = new U0();
        }
        U0 u02 = this.f3485e;
        u02.f3378c = colorStateList;
        u02.f3377b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3485e == null) {
            this.f3485e = new U0();
        }
        U0 u02 = this.f3485e;
        u02.d = mode;
        u02.f3376a = true;
        a();
    }
}
