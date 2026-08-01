package l;

import K.C0012l;
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
public final class C0255q {

    /* renamed from: a, reason: collision with root package name */
    public final View f3044a;
    public i1.g d;

    /* renamed from: e, reason: collision with root package name */
    public i1.g f3047e;

    /* renamed from: f, reason: collision with root package name */
    public i1.g f3048f;

    /* renamed from: c, reason: collision with root package name */
    public int f3046c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0265v f3045b = C0265v.a();

    public C0255q(View view) {
        this.f3044a = view;
    }

    public final void a() {
        View view = this.f3044a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3048f == null) {
                    this.f3048f = new i1.g();
                }
                i1.g gVar = this.f3048f;
                gVar.f2428c = null;
                gVar.f2427b = false;
                gVar.d = null;
                gVar.f2426a = false;
                WeakHashMap weakHashMap = K.T.f381a;
                ColorStateList g2 = K.H.g(view);
                if (g2 != null) {
                    gVar.f2427b = true;
                    gVar.f2428c = g2;
                }
                PorterDuff.Mode h = K.H.h(view);
                if (h != null) {
                    gVar.f2426a = true;
                    gVar.d = h;
                }
                if (gVar.f2427b || gVar.f2426a) {
                    C0265v.e(background, gVar, view.getDrawableState());
                    return;
                }
            }
            i1.g gVar2 = this.f3047e;
            if (gVar2 != null) {
                C0265v.e(background, gVar2, view.getDrawableState());
                return;
            }
            i1.g gVar3 = this.d;
            if (gVar3 != null) {
                C0265v.e(background, gVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        i1.g gVar = this.f3047e;
        if (gVar != null) {
            return (ColorStateList) gVar.f2428c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        i1.g gVar = this.f3047e;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3044a;
        Context context = view.getContext();
        int[] iArr = f.a.f1947y;
        C0012l r2 = C0012l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f432c;
        View view2 = this.f3044a;
        K.T.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f432c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3046c = typedArray.getResourceId(0, -1);
                C0265v c0265v = this.f3045b;
                Context context2 = view.getContext();
                int i2 = this.f3046c;
                synchronized (c0265v) {
                    f2 = c0265v.f3077a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.H.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.H.r(view, AbstractC0250n0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3046c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3046c = i;
        C0265v c0265v = this.f3045b;
        if (c0265v != null) {
            Context context = this.f3044a.getContext();
            synchronized (c0265v) {
                colorStateList = c0265v.f3077a.f(context, i);
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
                this.d = new i1.g();
            }
            i1.g gVar = this.d;
            gVar.f2428c = colorStateList;
            gVar.f2427b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3047e == null) {
            this.f3047e = new i1.g();
        }
        i1.g gVar = this.f3047e;
        gVar.f2428c = colorStateList;
        gVar.f2427b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3047e == null) {
            this.f3047e = new i1.g();
        }
        i1.g gVar = this.f3047e;
        gVar.d = mode;
        gVar.f2426a = true;
        a();
    }
}
