package l;

import K.C0011l;
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
public final class C0244q {

    /* renamed from: a, reason: collision with root package name */
    public final View f3047a;
    public i1.g d;

    /* renamed from: e, reason: collision with root package name */
    public i1.g f3050e;

    /* renamed from: f, reason: collision with root package name */
    public i1.g f3051f;

    /* renamed from: c, reason: collision with root package name */
    public int f3049c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final C0254v f3048b = C0254v.a();

    public C0244q(View view) {
        this.f3047a = view;
    }

    public final void a() {
        View view = this.f3047a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f3051f == null) {
                    this.f3051f = new i1.g();
                }
                i1.g gVar = this.f3051f;
                gVar.f2431c = null;
                gVar.f2430b = false;
                gVar.d = null;
                gVar.f2429a = false;
                WeakHashMap weakHashMap = K.S.f360a;
                ColorStateList g2 = K.G.g(view);
                if (g2 != null) {
                    gVar.f2430b = true;
                    gVar.f2431c = g2;
                }
                PorterDuff.Mode h = K.G.h(view);
                if (h != null) {
                    gVar.f2429a = true;
                    gVar.d = h;
                }
                if (gVar.f2430b || gVar.f2429a) {
                    C0254v.e(background, gVar, view.getDrawableState());
                    return;
                }
            }
            i1.g gVar2 = this.f3050e;
            if (gVar2 != null) {
                C0254v.e(background, gVar2, view.getDrawableState());
                return;
            }
            i1.g gVar3 = this.d;
            if (gVar3 != null) {
                C0254v.e(background, gVar3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        i1.g gVar = this.f3050e;
        if (gVar != null) {
            return (ColorStateList) gVar.f2431c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        i1.g gVar = this.f3050e;
        if (gVar != null) {
            return (PorterDuff.Mode) gVar.d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = this.f3047a;
        Context context = view.getContext();
        int[] iArr = f.a.f1949y;
        C0011l r2 = C0011l.r(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) r2.f414c;
        View view2 = this.f3047a;
        K.S.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) r2.f414c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3049c = typedArray.getResourceId(0, -1);
                C0254v c0254v = this.f3048b;
                Context context2 = view.getContext();
                int i2 = this.f3049c;
                synchronized (c0254v) {
                    f2 = c0254v.f3080a.f(context2, i2);
                }
                if (f2 != null) {
                    g(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                K.G.q(view, r2.g(1));
            }
            if (typedArray.hasValue(2)) {
                K.G.r(view, AbstractC0239n0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            r2.t();
        }
    }

    public final void e() {
        this.f3049c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.f3049c = i;
        C0254v c0254v = this.f3048b;
        if (c0254v != null) {
            Context context = this.f3047a.getContext();
            synchronized (c0254v) {
                colorStateList = c0254v.f3080a.f(context, i);
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
            gVar.f2431c = colorStateList;
            gVar.f2430b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f3050e == null) {
            this.f3050e = new i1.g();
        }
        i1.g gVar = this.f3050e;
        gVar.f2431c = colorStateList;
        gVar.f2430b = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f3050e == null) {
            this.f3050e = new i1.g();
        }
        i1.g gVar = this.f3050e;
        gVar.d = mode;
        gVar.f2429a = true;
        a();
    }
}
