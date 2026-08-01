package B0;

import K.T;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o0.AbstractC0281a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f60A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f61B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f62C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f64E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f65G;

    /* renamed from: H, reason: collision with root package name */
    public float f66H;

    /* renamed from: I, reason: collision with root package name */
    public float f67I;

    /* renamed from: J, reason: collision with root package name */
    public float f68J;

    /* renamed from: K, reason: collision with root package name */
    public int f69K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f70L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f71M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f72N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f73O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f74P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f75Q;

    /* renamed from: R, reason: collision with root package name */
    public float f76R;

    /* renamed from: S, reason: collision with root package name */
    public float f77S;

    /* renamed from: T, reason: collision with root package name */
    public float f78T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f79U;

    /* renamed from: V, reason: collision with root package name */
    public float f80V;

    /* renamed from: W, reason: collision with root package name */
    public float f81W;

    /* renamed from: X, reason: collision with root package name */
    public float f82X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f83Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f84Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f85a;

    /* renamed from: a0, reason: collision with root package name */
    public float f86a0;

    /* renamed from: b, reason: collision with root package name */
    public float f87b;

    /* renamed from: b0, reason: collision with root package name */
    public float f88b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f89c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f90c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f92e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f97j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f98k;

    /* renamed from: l, reason: collision with root package name */
    public float f99l;

    /* renamed from: m, reason: collision with root package name */
    public float f100m;

    /* renamed from: n, reason: collision with root package name */
    public float f101n;

    /* renamed from: o, reason: collision with root package name */
    public float f102o;

    /* renamed from: p, reason: collision with root package name */
    public float f103p;

    /* renamed from: q, reason: collision with root package name */
    public float f104q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f105r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f106s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f107t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f108u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f109v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f110w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f111x;

    /* renamed from: y, reason: collision with root package name */
    public E0.a f112y;

    /* renamed from: f, reason: collision with root package name */
    public int f94f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f96g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f113z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f63D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f91d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f93e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f95f0 = 1;

    public e(TextInputLayout textInputLayout) {
        this.f85a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f72N = textPaint;
        this.f73O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f89c = new Rect();
        this.f92e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f2) + (Color.alpha(i) * f3)), Math.round((Color.red(i2) * f2) + (Color.red(i) * f3)), Math.round((Color.green(i2) * f2) + (Color.green(i) * f3)), Math.round((Color.blue(i2) * f2) + (Color.blue(i) * f3)));
    }

    public static float f(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AbstractC0281a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f381a;
        boolean z2 = this.f85a.getLayoutDirection() == 1;
        if (this.f63D) {
            return (z2 ? I.h.d : I.h.f340c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f60A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f89c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f80V;
            this.F = 1.0f;
            typeface = this.f105r;
        } else {
            float f5 = this.h;
            float f6 = this.f81W;
            Typeface typeface2 = this.f108u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f75Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f72N;
        if (width > 0.0f) {
            boolean z4 = this.f65G != f3;
            boolean z5 = this.f82X != f4;
            boolean z6 = this.f111x != typeface;
            StaticLayout staticLayout = this.f83Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f71M;
            this.f65G = f3;
            this.f82X = f4;
            this.f111x = typeface;
            this.f71M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f61B == null || z3) {
            textPaint.setTextSize(this.f65G);
            textPaint.setTypeface(this.f111x);
            textPaint.setLetterSpacing(this.f82X);
            boolean b2 = b(this.f60A);
            this.f62C = b2;
            int i = this.f91d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f94f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f62C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f62C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            j jVar = new j(this.f60A, textPaint, (int) width);
            jVar.f129k = this.f113z;
            jVar.f128j = b2;
            jVar.f125e = alignment;
            jVar.i = false;
            jVar.f126f = i;
            jVar.f127g = this.f93e0;
            jVar.h = this.f95f0;
            StaticLayout a2 = jVar.a();
            a2.getClass();
            this.f83Y = a2;
            this.f61B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f73O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f105r);
        textPaint.setLetterSpacing(this.f80V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f70L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f107t;
            if (typeface != null) {
                this.f106s = q1.d.Z(configuration, typeface);
            }
            Typeface typeface2 = this.f110w;
            if (typeface2 != null) {
                this.f109v = q1.d.Z(configuration, typeface2);
            }
            Typeface typeface3 = this.f106s;
            if (typeface3 == null) {
                typeface3 = this.f107t;
            }
            this.f105r = typeface3;
            Typeface typeface4 = this.f109v;
            if (typeface4 == null) {
                typeface4 = this.f110w;
            }
            this.f108u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f85a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f61B;
        TextPaint textPaint = this.f72N;
        if (charSequence != null && (staticLayout = this.f83Y) != null) {
            this.f90c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f113z);
        }
        CharSequence charSequence2 = this.f90c0;
        if (charSequence2 != null) {
            this.f84Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f84Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f96g, this.f62C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f100m = rect.top;
        } else if (i != 80) {
            this.f100m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f100m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f102o = rect.centerX() - (this.f84Z / 2.0f);
        } else if (i2 != 5) {
            this.f102o = rect.left;
        } else {
            this.f102o = rect.right - this.f84Z;
        }
        c(0.0f, z2);
        float height = this.f83Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f83Y;
        if (staticLayout2 == null || this.f91d0 <= 1) {
            CharSequence charSequence3 = this.f61B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f83Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f94f, this.f62C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f89c;
        if (i3 == 48) {
            this.f99l = rect2.top;
        } else if (i3 != 80) {
            this.f99l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f99l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f101n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f101n = rect2.left;
        } else {
            this.f101n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f64E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f64E = null;
        }
        l(this.f87b);
        float f2 = this.f87b;
        float f3 = f(rect2.left, rect.left, f2, this.f74P);
        RectF rectF = this.f92e;
        rectF.left = f3;
        rectF.top = f(this.f99l, this.f100m, f2, this.f74P);
        rectF.right = f(rect2.right, rect.right, f2, this.f74P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f74P);
        this.f103p = f(this.f101n, this.f102o, f2, this.f74P);
        this.f104q = f(this.f99l, this.f100m, f2, this.f74P);
        l(f2);
        Z.a aVar = AbstractC0281a.f3358b;
        this.f86a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = T.f381a;
        textInputLayout.postInvalidateOnAnimation();
        this.f88b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f98k;
        ColorStateList colorStateList2 = this.f97j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f98k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f80V;
        float f5 = this.f81W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f66H = AbstractC0281a.a(0.0f, this.f76R, f2);
        this.f67I = AbstractC0281a.a(0.0f, this.f77S, f2);
        this.f68J = AbstractC0281a.a(0.0f, this.f78T, f2);
        int a2 = a(0, e(this.f79U), f2);
        this.f69K = a2;
        textPaint.setShadowLayer(this.f66H, this.f67I, this.f68J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f98k == colorStateList && this.f97j == colorStateList) {
            return;
        }
        this.f98k = colorStateList;
        this.f97j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        E0.a aVar = this.f112y;
        if (aVar != null) {
            aVar.f170c = true;
        }
        if (this.f107t == typeface) {
            return false;
        }
        this.f107t = typeface;
        Typeface Z2 = q1.d.Z(this.f85a.getContext().getResources().getConfiguration(), typeface);
        this.f106s = Z2;
        if (Z2 == null) {
            Z2 = this.f107t;
        }
        this.f105r = Z2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f87b) {
            this.f87b = f2;
            float f3 = this.f89c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f74P);
            RectF rectF = this.f92e;
            rectF.left = f4;
            rectF.top = f(this.f99l, this.f100m, f2, this.f74P);
            rectF.right = f(r1.right, rect.right, f2, this.f74P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f74P);
            this.f103p = f(this.f101n, this.f102o, f2, this.f74P);
            this.f104q = f(this.f99l, this.f100m, f2, this.f74P);
            l(f2);
            Z.a aVar = AbstractC0281a.f3358b;
            this.f86a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = T.f381a;
            TextInputLayout textInputLayout = this.f85a;
            textInputLayout.postInvalidateOnAnimation();
            this.f88b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f98k;
            ColorStateList colorStateList2 = this.f97j;
            TextPaint textPaint = this.f72N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f98k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f80V;
            float f6 = this.f81W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f66H = AbstractC0281a.a(0.0f, this.f76R, f2);
            this.f67I = AbstractC0281a.a(0.0f, this.f77S, f2);
            this.f68J = AbstractC0281a.a(0.0f, this.f78T, f2);
            int a2 = a(0, e(this.f79U), f2);
            this.f69K = a2;
            textPaint.setShadowLayer(this.f66H, this.f67I, this.f68J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = T.f381a;
        this.f85a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f110w != typeface) {
            this.f110w = typeface;
            Typeface Z2 = q1.d.Z(this.f85a.getContext().getResources().getConfiguration(), typeface);
            this.f109v = Z2;
            if (Z2 == null) {
                Z2 = this.f110w;
            }
            this.f108u = Z2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
