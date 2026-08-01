package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ionia.reidopitaco.libya.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class z6 extends Drawable implements r40 {
    public final WeakReference f;
    public final ls g;
    public final s40 h;
    public final Rect i;
    public final b7 j;
    public float k;
    public float l;
    public final int m;
    public float n;
    public float o;
    public float p;
    public WeakReference q;
    public WeakReference r;

    public z6(Context context, a7 a7Var) {
        p40 p40Var;
        WeakReference weakReference = new WeakReference(context);
        this.f = weakReference;
        m60.l(context, m60.t, "Theme.MaterialComponents");
        this.i = new Rect();
        s40 s40Var = new s40(this);
        this.h = s40Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = s40Var.a;
        textPaint.setTextAlign(align);
        b7 b7Var = new b7(context, a7Var);
        this.j = b7Var;
        boolean f = f();
        a7 a7Var2 = b7Var.b;
        ls lsVar = new ls(o10.f(context, f ? a7Var2.l.intValue() : a7Var2.j.intValue(), f() ? a7Var2.m.intValue() : a7Var2.k.intValue()).a());
        this.g = lsVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && s40Var.g != (p40Var = new p40(context2, a7Var2.i.intValue()))) {
            s40Var.b(p40Var, context2);
            textPaint.setColor(a7Var2.h.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i = a7Var2.q;
        if (i != -2) {
            this.m = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.m = a7Var2.r;
        }
        s40Var.e = true;
        j();
        invalidateSelf();
        s40Var.e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(a7Var2.g.intValue());
        if (lsVar.g.c != valueOf) {
            lsVar.r(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(a7Var2.h.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.q;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.q.get();
            WeakReference weakReference3 = this.r;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(a7Var2.y.booleanValue(), false);
    }

    @Override // defpackage.r40
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float f;
        float f2;
        View view3;
        boolean z;
        FrameLayout d = d();
        if (d == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = d;
        }
        while (true) {
            z = view3 instanceof View;
            if (!z || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f += view4.getY();
            f2 += view4.getX();
            view3 = view3.getParent();
        }
        if (z) {
            float f3 = (this.l - this.p) + f;
            float f4 = (this.k - this.o) + f2;
            View view5 = view3;
            float height = ((this.l + this.p) - view5.getHeight()) + f;
            float width = ((this.k + this.o) - view5.getWidth()) + f2;
            if (f3 < 0.0f) {
                this.l = Math.abs(f3) + this.l;
            }
            if (f4 < 0.0f) {
                this.k = Math.abs(f4) + this.k;
            }
            if (height > 0.0f) {
                this.l -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.k -= Math.abs(width);
            }
        }
    }

    public final String c() {
        b7 b7Var = this.j;
        a7 a7Var = b7Var.b;
        a7 a7Var2 = b7Var.b;
        String str = a7Var.o;
        WeakReference weakReference = this.f;
        if (str == null) {
            if (!g()) {
                return null;
            }
            int i = this.m;
            if (i == -2 || e() <= i) {
                return NumberFormat.getInstance(a7Var2.s).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(a7Var2.s, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = a7Var.q;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.r;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String c;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.g.draw(canvas);
        if (!f() || (c = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        s40 s40Var = this.h;
        s40Var.a.getTextBounds(c, 0, c.length(), rect);
        float exactCenterY = this.l - rect.exactCenterY();
        canvas.drawText(c, this.k, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), s40Var.a);
    }

    public final int e() {
        int i = this.j.b.p;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean f() {
        return this.j.b.o != null || g();
    }

    public final boolean g() {
        a7 a7Var = this.j.b;
        return a7Var.o == null && a7Var.p != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j.b.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.f.get();
        if (context == null) {
            return;
        }
        boolean f = f();
        b7 b7Var = this.j;
        this.g.setShapeAppearanceModel(o10.f(context, f ? b7Var.b.l.intValue() : b7Var.b.j.intValue(), f() ? b7Var.b.m.intValue() : b7Var.b.k.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.q = new WeakReference(view);
        this.r = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        float f;
        int intValue;
        int intValue2;
        int intValue3;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        WeakReference weakReference = this.f;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.q;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.i;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.r;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean f10 = f();
        b7 b7Var = this.j;
        float f11 = f10 ? b7Var.d : b7Var.c;
        this.n = f11;
        if (f11 != -1.0f) {
            this.o = f11;
            this.p = f11;
        } else {
            this.o = Math.round((f() ? b7Var.g : b7Var.e) / 2.0f);
            this.p = Math.round((f() ? b7Var.h : b7Var.f) / 2.0f);
        }
        if (f()) {
            String c = c();
            float f12 = this.o;
            s40 s40Var = this.h;
            if (s40Var.e) {
                s40Var.a(c);
                f9 = s40Var.c;
            } else {
                f9 = s40Var.c;
            }
            this.o = Math.max(f12, (f9 / 2.0f) + b7Var.b.z.intValue());
            float f13 = this.p;
            if (s40Var.e) {
                s40Var.a(c);
            }
            float max = Math.max(f13, (s40Var.d / 2.0f) + b7Var.b.A.intValue());
            this.p = max;
            this.o = Math.max(this.o, max);
        }
        a7 a7Var = b7Var.b;
        a7 a7Var2 = b7Var.b;
        int i = b7Var.k;
        int intValue4 = a7Var.C.intValue();
        if (f()) {
            intValue4 = a7Var.E.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                f = -1.0f;
                intValue4 = y2.c(intValue4, intValue4 - a7Var.H.intValue(), y2.b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
                if (i == 0) {
                    intValue4 -= Math.round(this.p);
                }
                intValue = a7Var.G.intValue() + intValue4;
                intValue2 = a7Var2.x.intValue();
                if (intValue2 != 8388691 || intValue2 == 8388693) {
                    this.l = rect3.bottom - intValue;
                } else {
                    this.l = rect3.top + intValue;
                }
                int intValue5 = !f() ? a7Var.D.intValue() : a7Var2.B.intValue();
                if (i == 1) {
                    intValue5 += f() ? b7Var.j : b7Var.i;
                }
                int intValue6 = a7Var.F.intValue() + intValue5;
                intValue3 = a7Var2.x.intValue();
                if (intValue3 != 8388659 || intValue3 == 8388691) {
                    if (b7Var.l != 0) {
                        if (view.getLayoutDirection() == 0) {
                            f2 = rect3.left + this.o;
                            f3 = (this.p * 2.0f) - intValue6;
                            f4 = f2 - f3;
                            this.k = f4;
                        } else {
                            f4 = (rect3.right - this.o) + ((this.p * 2.0f) - intValue6);
                            this.k = f4;
                        }
                    } else if (view.getLayoutDirection() == 0) {
                        f4 = (rect3.left - this.o) + intValue6;
                        this.k = f4;
                    } else {
                        f2 = rect3.right + this.o;
                        f3 = intValue6;
                        f4 = f2 - f3;
                        this.k = f4;
                    }
                } else if (b7Var.l == 0) {
                    if (view.getLayoutDirection() == 0) {
                        f6 = rect3.right + this.o;
                        f7 = intValue6;
                        f8 = f6 - f7;
                        this.k = f8;
                    } else {
                        f8 = (rect3.left - this.o) + intValue6;
                        this.k = f8;
                    }
                } else if (view.getLayoutDirection() == 0) {
                    f8 = (rect3.right - this.o) + ((this.p * 2.0f) - intValue6);
                    this.k = f8;
                } else {
                    f6 = rect3.left + this.o;
                    f7 = (this.p * 2.0f) - intValue6;
                    f8 = f6 - f7;
                    this.k = f8;
                }
                if (a7Var.I.booleanValue()) {
                    b(view, null);
                } else {
                    ViewParent d = d();
                    if (d == null) {
                        d = view.getParent();
                    }
                    if ((d instanceof View) && (d.getParent() instanceof View)) {
                        b(view, (View) d.getParent());
                    }
                }
                float f14 = this.k;
                float f15 = this.l;
                float f16 = this.o;
                float f17 = this.p;
                rect2.set((int) (f14 - f16), (int) (f15 - f17), (int) (f14 + f16), (int) (f15 + f17));
                f5 = this.n;
                ls lsVar = this.g;
                if (f5 != f) {
                    lsVar.setShapeAppearanceModel(lsVar.g.a.a(f5));
                }
                if (rect.equals(rect2)) {
                    lsVar.setBounds(rect2);
                    return;
                }
                return;
            }
        }
        f = -1.0f;
        if (i == 0) {
        }
        intValue = a7Var.G.intValue() + intValue4;
        intValue2 = a7Var2.x.intValue();
        if (intValue2 != 8388691) {
        }
        this.l = rect3.bottom - intValue;
        if (!f()) {
        }
        if (i == 1) {
        }
        int intValue62 = a7Var.F.intValue() + intValue5;
        intValue3 = a7Var2.x.intValue();
        if (intValue3 != 8388659) {
        }
        if (b7Var.l != 0) {
        }
        if (a7Var.I.booleanValue()) {
        }
        float f142 = this.k;
        float f152 = this.l;
        float f162 = this.o;
        float f172 = this.p;
        rect2.set((int) (f142 - f162), (int) (f152 - f172), (int) (f142 + f162), (int) (f152 + f172));
        f5 = this.n;
        ls lsVar2 = this.g;
        if (f5 != f) {
        }
        if (rect.equals(rect2)) {
        }
    }

    @Override // android.graphics.drawable.Drawable, defpackage.r40
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        b7 b7Var = this.j;
        b7Var.a.n = i;
        b7Var.b.n = i;
        this.h.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
