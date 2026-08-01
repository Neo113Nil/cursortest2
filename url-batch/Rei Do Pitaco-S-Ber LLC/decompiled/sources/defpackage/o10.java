package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class o10 implements m10 {
    public static final jz m = new jz(0.5f);
    public m60 a = new h00();
    public m60 b = new h00();
    public m60 c = new h00();
    public m60 d = new h00();
    public nd e = new g(0.0f);
    public nd f = new g(0.0f);
    public nd g = new g(0.0f);
    public nd h = new g(0.0f);
    public tg i;
    public tg j;
    public tg k;
    public tg l;

    public o10() {
        int i = 0;
        this.i = new tg(i);
        this.j = new tg(i);
        this.k = new tg(i);
        this.l = new tg(i);
    }

    public static n10 f(Context context, int i, int i2) {
        g gVar = new g(0.0f);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(jx.F), gVar);
    }

    public static n10 g(Context context, AttributeSet attributeSet, int i, int i2) {
        g gVar = new g(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.w, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return h(contextThemeWrapper.obtainStyledAttributes(jx.F), gVar);
    }

    public static n10 h(TypedArray typedArray, nd ndVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            nd i6 = i(typedArray, 5, ndVar);
            nd i7 = i(typedArray, 8, i6);
            nd i8 = i(typedArray, 9, i6);
            nd i9 = i(typedArray, 7, i6);
            nd i10 = i(typedArray, 6, i6);
            n10 n10Var = new n10();
            n10Var.a = vv.j(i2);
            n10Var.e = i7;
            n10Var.b = vv.j(i3);
            n10Var.f = i8;
            n10Var.c = vv.j(i4);
            n10Var.g = i9;
            n10Var.d = vv.j(i5);
            n10Var.h = i10;
            return n10Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static nd i(TypedArray typedArray, int i, nd ndVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new g(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new jz(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ndVar;
    }

    @Override // defpackage.m10
    public final o10 a(float f) {
        n10 k = k();
        k.e = new g(f);
        k.f = new g(f);
        k.g = new g(f);
        k.h = new g(f);
        return k.a();
    }

    @Override // defpackage.m10
    public final o10 d(jz jzVar) {
        n10 k = k();
        k.e = jzVar;
        k.f = jzVar;
        k.g = jzVar;
        k.h = jzVar;
        return k.a();
    }

    @Override // defpackage.m10
    public final boolean e() {
        return false;
    }

    public final boolean j(RectF rectF) {
        boolean z = this.l.getClass().equals(tg.class) && this.j.getClass().equals(tg.class) && this.i.getClass().equals(tg.class) && this.k.getClass().equals(tg.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && (this.b instanceof h00) && (this.a instanceof h00) && (this.c instanceof h00) && (this.d instanceof h00);
    }

    public final n10 k() {
        n10 n10Var = new n10();
        n10Var.a = this.a;
        n10Var.b = this.b;
        n10Var.c = this.c;
        n10Var.d = this.d;
        n10Var.e = this.e;
        n10Var.f = this.f;
        n10Var.g = this.g;
        n10Var.h = this.h;
        n10Var.i = this.i;
        n10Var.j = this.j;
        n10Var.k = this.k;
        n10Var.l = this.l;
        return n10Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }

    @Override // defpackage.m10
    public final o10 b(int[] iArr) {
        return this;
    }

    @Override // defpackage.m10
    public final o10 c() {
        return this;
    }
}
