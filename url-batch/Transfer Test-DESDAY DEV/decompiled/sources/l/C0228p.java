package l;

import K.C0014m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: l.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0228p {

    /* renamed from: a, reason: collision with root package name */
    public final View f3049a;
    public S0 d;

    /* renamed from: e, reason: collision with root package name */
    public S0 f3052e;

    /* renamed from: f, reason: collision with root package name */
    public S0 f3053f;

    /* renamed from: c, reason: collision with root package name */
    public int f3051c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0236t f3050b = C0236t.a();

    public C0228p(View view) {
        this.f3049a = view;
    }

    public final void a() {
        View view = this.f3049a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3053f == null) {
                    this.f3053f = new S0();
                }
                S0 s02 = this.f3053f;
                s02.f2942a = null;
                s02.d = false;
                s02.f2943b = null;
                s02.f2944c = false;
                WeakHashMap weakHashMap = K.T.f372a;
                ColorStateList g2 = K.H.g(view);
                if (g2 != null) {
                    s02.d = true;
                    s02.f2942a = g2;
                }
                PorterDuff.Mode h = K.H.h(view);
                if (h != null) {
                    s02.f2944c = true;
                    s02.f2943b = h;
                }
                if (s02.d || s02.f2944c) {
                    C0236t.e(background, s02, view.getDrawableState());
                    return;
                }
            }
            S0 s03 = this.f3052e;
            if (s03 != null) {
                C0236t.e(background, s03, view.getDrawableState());
                return;
            }
            S0 s04 = this.d;
            if (s04 != null) {
                C0236t.e(background, s04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        S0 s02 = this.f3052e;
        if (s02 != null) {
            return s02.f2942a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        S0 s02 = this.f3052e;
        if (s02 != null) {
            return s02.f2943b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3049a;
        Context context = view.getContext();
        int[] iArr = f.a.f2158y;
        C0014m i2 = C0014m.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f425b;
        View view2 = this.f3049a;
        K.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) i2.f425b, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3051c = typedArray.getResourceId(0, -1);
                C0236t c0236t = this.f3050b;
                Context context2 = view.getContext();
                int i3 = this.f3051c;
                synchronized (c0236t) {
                    f2 = c0236t.f3079a.f(context2, i3);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.H.q(view, i2.b(1));
            }
            if (typedArray.hasValue(2)) {
                K.H.r(view, AbstractC0221l0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            i2.k();
        }
    }

    public final void e() {
        this.f3051c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3051c = i;
        C0236t c0236t = this.f3050b;
        if (c0236t != null) {
            Context context = this.f3049a.getContext();
            synchronized (c0236t) {
                colorStateList = c0236t.f3079a.f(context, i);
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
                this.d = new S0();
            }
            S0 s02 = this.d;
            s02.f2942a = colorStateList;
            s02.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3052e == null) {
            this.f3052e = new S0();
        }
        S0 s02 = this.f3052e;
        s02.f2942a = colorStateList;
        s02.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3052e == null) {
            this.f3052e = new S0();
        }
        S0 s02 = this.f3052e;
        s02.f2943b = mode;
        s02.f2944c = true;
        a();
    }
}
