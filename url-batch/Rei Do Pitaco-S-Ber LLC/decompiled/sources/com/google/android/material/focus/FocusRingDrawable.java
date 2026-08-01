package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import defpackage.dj;
import defpackage.ej;
import defpackage.g;
import defpackage.h00;
import defpackage.jx;
import defpackage.ls;
import defpackage.m10;
import defpackage.m60;
import defpackage.o10;
import defpackage.q10;
import defpackage.tg;
import defpackage.w0;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable u = new ColorDrawable(0);
    public static final int[] v = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator w = new OvershootInterpolator(4.0f);
    public static final dj x = new dj("interpolation");
    public final Paint f;
    public final RectF g;
    public final Rect h;
    public final Path i;
    public final Path j;
    public final Matrix k;
    public final q10 l;
    public WeakReference m;
    public float n;
    public ObjectAnimator o;
    public float p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ej t;

    private FocusRingDrawable(ej ejVar, Resources resources) {
        super(null);
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = q10.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        ej ejVar2 = new ej(ejVar);
        this.t = ejVar2;
        Drawable.ConstantState constantState = ejVar2.a;
        if (constantState != null) {
            setDrawable(resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
        }
        paint.setStyle(Paint.Style.STROKE);
        if (Float.isNaN(this.t.j)) {
            return;
        }
        paint.setStrokeWidth(this.t.j);
    }

    public static int c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) != 2) {
            return Integer.MIN_VALUE;
        }
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue)) {
            return typedValue.data;
        }
        return Integer.MIN_VALUE;
    }

    public static FocusRingDrawable e(Context context, RippleDrawable rippleDrawable, ls lsVar) {
        if (!m60.S(context.getTheme(), com.ionia.reidopitaco.libya.R.attr.focusRingsEnabled, false)) {
            return null;
        }
        FocusRingDrawable focusRingDrawable = new FocusRingDrawable(context, u);
        if (lsVar != null) {
            focusRingDrawable.m = new WeakReference(lsVar);
        }
        rippleDrawable.addLayer(focusRingDrawable);
        focusRingDrawable.setCallback(rippleDrawable);
        return focusRingDrawable;
    }

    public static float f(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.t.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        WeakReference weakReference = this.m;
        if (weakReference != null && weakReference.get() != null) {
            rectF.set(((ls) this.m.get()).getBounds());
            return;
        }
        if (!(getDrawable() instanceof RippleDrawable)) {
            rectF.set(getBounds());
            return;
        }
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
        Rect rect2 = this.h;
        rippleDrawable.getHotspotBounds(rect2);
        int radius = rippleDrawable.getRadius();
        if (radius > 0) {
            rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
        }
        rectF.set(rect2);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        d(theme);
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.g;
        a(rectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / rectF.width());
        float height = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.k;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.i;
        path.transform(matrix, path2);
        float f4 = f2 * this.p;
        Paint paint = this.f;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    public final void d(Resources.Theme theme) {
        TypedValue R;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(jx.k);
        int i = this.t.d;
        if (i != Integer.MIN_VALUE && (R = m60.R(theme, i)) != null) {
            ej ejVar = this.t;
            ejVar.c = R.data != 0;
            ejVar.e = true;
        }
        ej ejVar2 = this.t;
        if (!ejVar2.e) {
            ejVar2.c = m60.S(theme, com.ionia.reidopitaco.libya.R.attr.focusRingsEnabled, ejVar2.c);
        }
        ej ejVar3 = this.t;
        if (ejVar3.c) {
            int i2 = ejVar3.f;
            int i3 = ejVar3.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, -16777216);
            }
            ejVar3.f = i2;
            ej ejVar4 = this.t;
            int i4 = ejVar4.h;
            int i5 = ejVar4.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            ejVar4.h = i4;
            ej ejVar5 = this.t;
            ejVar5.j = f(ejVar5.j, theme, ejVar5.k, obtainStyledAttributes, 6, com.ionia.reidopitaco.libya.R.dimen.mtrl_focus_ring_outer_stroke_width);
            ej ejVar6 = this.t;
            ejVar6.l = f(ejVar6.l, theme, ejVar6.m, obtainStyledAttributes, 3, com.ionia.reidopitaco.libya.R.dimen.mtrl_focus_ring_inner_stroke_width);
            ej ejVar7 = this.t;
            ejVar7.n = f(ejVar7.n, theme, ejVar7.o, obtainStyledAttributes, 7, 0);
            ej ejVar8 = this.t;
            ejVar8.p = f(ejVar8.p, theme, ejVar8.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.t.p)) {
                this.t.p = 0.0f;
            }
            ej ejVar9 = this.t;
            ejVar9.r = f(ejVar9.r, theme, ejVar9.s, obtainStyledAttributes, 2, com.ionia.reidopitaco.libya.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            ej ejVar10 = this.t;
            int i6 = ejVar10.u;
            int[] iArr = jx.F;
            if (i6 != Integer.MIN_VALUE) {
                ejVar10.t = o10.h(theme.obtainStyledAttributes(i6, iArr), new g(0.0f)).a();
            } else {
                int i7 = ejVar10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.ionia.reidopitaco.libya.R.attr.focusRingsShapeAppearance;
                }
                TypedValue R2 = m60.R(theme, i7);
                if (R2 != null) {
                    this.t.t = o10.h(theme.obtainStyledAttributes(R2.resourceId, iArr), new g(0.0f)).a();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.f;
        paint.setStyle(style);
        if (Float.isNaN(this.t.j)) {
            return;
        }
        paint.setStrokeWidth(this.t.j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0046, code lost:
    
        if (r1.isEmpty() == false) goto L9;
     */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        int radius;
        super.draw(canvas);
        ej ejVar = this.t;
        if (ejVar.c && this.r) {
            float f2 = ejVar.p;
            float f3 = ejVar.j / 2.0f;
            float f4 = this.p;
            float f5 = (f3 * f4) + f2;
            float f6 = ((ejVar.l / 2.0f) * f4) + f2 + ejVar.r;
            Path path = this.j;
            if (path.isEmpty()) {
                WeakReference weakReference = this.m;
                if (weakReference != null && weakReference.get() != null) {
                    path = ((ls) this.m.get()).n;
                }
                path = null;
            }
            Path path2 = path;
            ej ejVar2 = this.t;
            if (path2 != null) {
                b(canvas, path2, f6, ejVar2.l, ejVar2.h);
                ej ejVar3 = this.t;
                b(canvas, path2, f5, ejVar3.j, ejVar3.f);
                return;
            }
            if (Float.isNaN(ejVar2.n)) {
                f = this.n;
                if (f < 0.0f) {
                    WeakReference weakReference2 = this.m;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        ls lsVar = (ls) this.m.get();
                        float c = lsVar.c(lsVar.h(), lsVar.g.a.c(), lsVar.G);
                        if (c >= 0.0f) {
                            c *= lsVar.g.i;
                        }
                        if (c >= 0.0f) {
                            f = Math.max(0.0f, c - (this.t.j / 2.0f));
                        }
                    }
                    Drawable drawable = getDrawable();
                    f = (!(drawable instanceof RippleDrawable) || (radius = ((RippleDrawable) drawable).getRadius()) < 0) ? 0.0f : radius;
                }
            } else {
                f = this.t.n;
            }
            float max = Math.max(0.0f, f - (this.t.j / 2.0f));
            ej ejVar4 = this.t;
            float f7 = ejVar4.l;
            int i = ejVar4.h;
            RectF rectF = this.g;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.p;
            Paint paint = this.f;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            ej ejVar5 = this.t;
            float f9 = ejVar5.j;
            int i2 = ejVar5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.p);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void g(m10 m10Var) {
        RectF rectF = this.g;
        a(rectF);
        o10 b = m10Var.b(v);
        boolean j = b.j(rectF);
        Path path = this.j;
        if (!j) {
            this.l.a(b, null, 1.0f, rectF, null, path);
            this.n = -1.0f;
            return;
        }
        ej ejVar = this.t;
        float f = ((ejVar.j / 2.0f) * this.p) + ejVar.p;
        rectF.inset(f, f);
        this.n = b.e.a(rectF);
        path.reset();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        ej ejVar = this.t;
        if (ejVar.a == null) {
            return null;
        }
        ejVar.b = getChangingConfigurations();
        return this.t;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (super.hasFocusStateSpecified()) {
                return true;
            }
            return this.t.c;
        } catch (NoSuchMethodError unused) {
            return this.t.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = jx.k;
        TypedArray obtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, iArr, 0, 0) : resources.obtainAttributes(attributeSet, iArr);
        this.t.d = c(obtainStyledAttributes, 0);
        if (this.t.d == Integer.MIN_VALUE && obtainStyledAttributes.hasValue(0)) {
            ej ejVar = this.t;
            ejVar.c = obtainStyledAttributes.getBoolean(0, ejVar.c);
            this.t.e = true;
        }
        this.t.g = c(obtainStyledAttributes, 5);
        ej ejVar2 = this.t;
        if (ejVar2.g == Integer.MIN_VALUE) {
            ejVar2.f = obtainStyledAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.t.i = c(obtainStyledAttributes, 1);
        ej ejVar3 = this.t;
        if (ejVar3.i == Integer.MIN_VALUE) {
            ejVar3.h = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.t.k = c(obtainStyledAttributes, 6);
        ej ejVar4 = this.t;
        if (ejVar4.k == Integer.MIN_VALUE) {
            ejVar4.j = obtainStyledAttributes.getDimension(6, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        ej ejVar5 = this.t;
        if (ejVar5.m == Integer.MIN_VALUE) {
            ejVar5.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.m = c(obtainStyledAttributes, 3);
        ej ejVar6 = this.t;
        if (ejVar6.m == Integer.MIN_VALUE) {
            ejVar6.l = obtainStyledAttributes.getDimension(3, Float.NaN);
        }
        this.t.o = c(obtainStyledAttributes, 7);
        ej ejVar7 = this.t;
        if (ejVar7.o == Integer.MIN_VALUE) {
            ejVar7.n = obtainStyledAttributes.getDimension(7, Float.NaN);
        }
        this.t.q = c(obtainStyledAttributes, 4);
        ej ejVar8 = this.t;
        if (ejVar8.q == Integer.MIN_VALUE) {
            ejVar8.p = obtainStyledAttributes.getDimension(4, Float.NaN);
        }
        this.t.s = c(obtainStyledAttributes, 2);
        ej ejVar9 = this.t;
        if (ejVar9.s == Integer.MIN_VALUE) {
            ejVar9.r = obtainStyledAttributes.getDimension(2, Float.NaN);
        }
        this.t.v = c(obtainStyledAttributes, 8);
        this.t.u = obtainStyledAttributes.getType(8) == 1 ? obtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE) : Integer.MIN_VALUE;
        obtainStyledAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.t.a = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = u;
            setDrawable(colorDrawable);
            this.t.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        boolean isProjected;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return false;
        }
        isProjected = drawable.isProjected();
        return isProjected;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return super.isStateful() || this.t.c;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.o = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.s && super.mutate() == this) {
            this.t = new ej(this.t);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.t.a = drawable.getConstantState();
            }
            this.s = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018c  */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBoundsChange(Rect rect) {
        float[] fArr;
        float f;
        o10 o10Var;
        super.onBoundsChange(rect);
        ej ejVar = this.t;
        if (!ejVar.c) {
            return;
        }
        m10 m10Var = ejVar.t;
        if (m10Var != null) {
            g(m10Var);
            return;
        }
        Drawable drawable = getDrawable();
        int i = 0;
        o10 o10Var2 = null;
        if (drawable instanceof ShapeDrawable) {
            Outline outline = new Outline();
            ((ShapeDrawable) drawable).getOutline(outline);
            if (outline.getRadius() > 0.0f) {
                h00 h00Var = new h00();
                h00 h00Var2 = new h00();
                h00 h00Var3 = new h00();
                h00 h00Var4 = new h00();
                tg tgVar = new tg(i);
                tg tgVar2 = new tg(i);
                tg tgVar3 = new tg(i);
                tg tgVar4 = new tg(i);
                float radius = outline.getRadius();
                g gVar = new g(radius);
                g gVar2 = new g(radius);
                g gVar3 = new g(radius);
                g gVar4 = new g(radius);
                o10Var = new o10();
                o10Var.a = h00Var;
                o10Var.b = h00Var2;
                o10Var.c = h00Var3;
                o10Var.d = h00Var4;
                o10Var.e = gVar;
                o10Var.f = gVar2;
                o10Var.g = gVar3;
                o10Var.h = gVar4;
                o10Var.i = tgVar;
                o10Var.j = tgVar2;
                o10Var.k = tgVar3;
                o10Var.l = tgVar4;
                o10Var2 = o10Var;
            }
            if (o10Var2 == null) {
                g(o10Var2);
                return;
            } else {
                this.n = -1.0f;
                this.j.reset();
                return;
            }
        }
        if (drawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawable;
            try {
                fArr = gradientDrawable.getCornerRadii();
            } catch (NullPointerException unused) {
                fArr = null;
            }
            if (fArr != null) {
                h00 h00Var5 = new h00();
                h00 h00Var6 = new h00();
                h00 h00Var7 = new h00();
                h00 h00Var8 = new h00();
                tg tgVar5 = new tg(i);
                tg tgVar6 = new tg(i);
                tg tgVar7 = new tg(i);
                tg tgVar8 = new tg(i);
                g gVar5 = new g(Math.min(fArr[0], fArr[1]));
                g gVar6 = new g(Math.min(fArr[2], fArr[3]));
                g gVar7 = new g(Math.min(fArr[4], fArr[5]));
                g gVar8 = new g(Math.min(fArr[6], fArr[7]));
                o10Var = new o10();
                o10Var.a = h00Var5;
                o10Var.b = h00Var6;
                o10Var.c = h00Var7;
                o10Var.d = h00Var8;
                o10Var.e = gVar5;
                o10Var.f = gVar6;
                o10Var.g = gVar7;
                o10Var.h = gVar8;
                o10Var.i = tgVar5;
                o10Var.j = tgVar6;
                o10Var.k = tgVar7;
                o10Var.l = tgVar8;
                o10Var2 = o10Var;
            } else {
                try {
                    f = gradientDrawable.getCornerRadius();
                } catch (NullPointerException unused2) {
                    f = -1.0f;
                }
                if (f > 0.0f) {
                    h00 h00Var9 = new h00();
                    h00 h00Var10 = new h00();
                    h00 h00Var11 = new h00();
                    h00 h00Var12 = new h00();
                    tg tgVar9 = new tg(i);
                    tg tgVar10 = new tg(i);
                    tg tgVar11 = new tg(i);
                    tg tgVar12 = new tg(i);
                    g gVar9 = new g(f);
                    g gVar10 = new g(f);
                    g gVar11 = new g(f);
                    g gVar12 = new g(f);
                    o10 o10Var3 = new o10();
                    o10Var3.a = h00Var9;
                    o10Var3.b = h00Var10;
                    o10Var3.c = h00Var11;
                    o10Var3.d = h00Var12;
                    o10Var3.e = gVar9;
                    o10Var3.f = gVar10;
                    o10Var3.g = gVar11;
                    o10Var3.h = gVar12;
                    o10Var3.i = tgVar9;
                    o10Var3.j = tgVar10;
                    o10Var3.k = tgVar11;
                    o10Var3.l = tgVar12;
                    o10Var2 = o10Var3;
                }
            }
        }
        if (o10Var2 == null) {
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        ej ejVar = this.t;
        if (!ejVar.c) {
            this.r = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(ejVar.x, iArr);
        boolean z = this.r != stateSetMatches;
        this.r = stateSetMatches;
        if (z && iArr.length > 0 && !this.q) {
            ObjectAnimator objectAnimator = this.o;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.o = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, x, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(w);
                ofFloat.addListener(new w0(5, this));
                this.o = ofFloat;
                ofFloat.start();
            } else {
                this.p = 1.0f;
            }
        }
        this.q = iArr.length == 0;
        return super.onStateChange(iArr) || z;
    }

    public FocusRingDrawable() {
        super(null);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = q10.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        this.t = new ej(null);
    }

    public FocusRingDrawable(Context context, Drawable drawable) {
        super(drawable);
        this.f = new Paint(1);
        this.g = new RectF();
        this.h = new Rect();
        this.i = new Path();
        this.j = new Path();
        this.k = new Matrix();
        this.l = q10.b();
        this.n = -1.0f;
        this.p = 1.0f;
        this.r = false;
        this.s = false;
        ej ejVar = new ej(null);
        this.t = ejVar;
        if (drawable != null) {
            ejVar.a = drawable.getConstantState();
        }
        d(context.getTheme());
    }

    public /* synthetic */ FocusRingDrawable(ej ejVar, Resources resources, dj djVar) {
        this(ejVar, resources);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
