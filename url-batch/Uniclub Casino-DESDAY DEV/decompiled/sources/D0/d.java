package D0;

import K.S;
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
import q0.AbstractC0288a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f83A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f84B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f85C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f87E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f88G;

    /* renamed from: H, reason: collision with root package name */
    public float f89H;

    /* renamed from: I, reason: collision with root package name */
    public float f90I;

    /* renamed from: J, reason: collision with root package name */
    public float f91J;

    /* renamed from: K, reason: collision with root package name */
    public int f92K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f93L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f94M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f95N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f96O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f97P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f98Q;

    /* renamed from: R, reason: collision with root package name */
    public float f99R;

    /* renamed from: S, reason: collision with root package name */
    public float f100S;

    /* renamed from: T, reason: collision with root package name */
    public float f101T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f102U;

    /* renamed from: V, reason: collision with root package name */
    public float f103V;

    /* renamed from: W, reason: collision with root package name */
    public float f104W;

    /* renamed from: X, reason: collision with root package name */
    public float f105X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f106Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f107Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f108a;

    /* renamed from: a0, reason: collision with root package name */
    public float f109a0;

    /* renamed from: b, reason: collision with root package name */
    public float f110b;

    /* renamed from: b0, reason: collision with root package name */
    public float f111b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f112c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f113c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f115e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f120j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f121k;

    /* renamed from: l, reason: collision with root package name */
    public float f122l;

    /* renamed from: m, reason: collision with root package name */
    public float f123m;

    /* renamed from: n, reason: collision with root package name */
    public float f124n;

    /* renamed from: o, reason: collision with root package name */
    public float f125o;

    /* renamed from: p, reason: collision with root package name */
    public float f126p;

    /* renamed from: q, reason: collision with root package name */
    public float f127q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f128r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f129s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f130t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f131u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f132v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f133w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f134x;

    /* renamed from: y, reason: collision with root package name */
    public G0.a f135y;

    /* renamed from: f, reason: collision with root package name */
    public int f117f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f119g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f136z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f86D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f114d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f116e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f118f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f108a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f95N = textPaint;
        this.f96O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f112c = new Rect();
        this.f115e = new RectF();
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
        return AbstractC0288a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = S.f360a;
        boolean z2 = this.f108a.getLayoutDirection() == 1;
        if (this.f86D) {
            return (z2 ? I.h.d : I.h.f248c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f83A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f112c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f103V;
            this.F = 1.0f;
            typeface = this.f128r;
        } else {
            float f5 = this.h;
            float f6 = this.f104W;
            Typeface typeface2 = this.f131u;
            if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f98Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f95N;
        if (width > 0.0f) {
            boolean z4 = this.f88G != f3;
            boolean z5 = this.f105X != f4;
            boolean z6 = this.f134x != typeface;
            StaticLayout staticLayout = this.f106Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f94M;
            this.f88G = f3;
            this.f105X = f4;
            this.f134x = typeface;
            this.f94M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f84B == null || z3) {
            textPaint.setTextSize(this.f88G);
            textPaint.setTypeface(this.f134x);
            textPaint.setLetterSpacing(this.f105X);
            boolean b2 = b(this.f83A);
            this.f85C = b2;
            int i = this.f114d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f117f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f85C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f85C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f83A, textPaint, (int) width);
            iVar.f152k = this.f136z;
            iVar.f151j = b2;
            iVar.f148e = alignment;
            iVar.i = false;
            iVar.f149f = i;
            iVar.f150g = this.f116e0;
            iVar.h = this.f118f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f106Y = a2;
            this.f84B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f96O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f128r);
        textPaint.setLetterSpacing(this.f103V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f93L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f130t;
            if (typeface != null) {
                this.f129s = q1.d.E(configuration, typeface);
            }
            Typeface typeface2 = this.f133w;
            if (typeface2 != null) {
                this.f132v = q1.d.E(configuration, typeface2);
            }
            Typeface typeface3 = this.f129s;
            if (typeface3 == null) {
                typeface3 = this.f130t;
            }
            this.f128r = typeface3;
            Typeface typeface4 = this.f132v;
            if (typeface4 == null) {
                typeface4 = this.f133w;
            }
            this.f131u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f108a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f84B;
        TextPaint textPaint = this.f95N;
        if (charSequence != null && (staticLayout = this.f106Y) != null) {
            this.f113c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f136z);
        }
        CharSequence charSequence2 = this.f113c0;
        if (charSequence2 != null) {
            this.f107Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f107Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f119g, this.f85C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f123m = rect.top;
        } else if (i != 80) {
            this.f123m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f123m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f125o = rect.centerX() - (this.f107Z / 2.0f);
        } else if (i2 != 5) {
            this.f125o = rect.left;
        } else {
            this.f125o = rect.right - this.f107Z;
        }
        c(0.0f, z2);
        float height = this.f106Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f106Y;
        if (staticLayout2 == null || this.f114d0 <= 1) {
            CharSequence charSequence3 = this.f84B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f106Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f117f, this.f85C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f112c;
        if (i3 == 48) {
            this.f122l = rect2.top;
        } else if (i3 != 80) {
            this.f122l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f122l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f124n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f124n = rect2.left;
        } else {
            this.f124n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f87E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f87E = null;
        }
        l(this.f110b);
        float f2 = this.f110b;
        float f3 = f(rect2.left, rect.left, f2, this.f97P);
        RectF rectF = this.f115e;
        rectF.left = f3;
        rectF.top = f(this.f122l, this.f123m, f2, this.f97P);
        rectF.right = f(rect2.right, rect.right, f2, this.f97P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f97P);
        this.f126p = f(this.f124n, this.f125o, f2, this.f97P);
        this.f127q = f(this.f122l, this.f123m, f2, this.f97P);
        l(f2);
        Z.a aVar = AbstractC0288a.f3551b;
        this.f109a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
        WeakHashMap weakHashMap = S.f360a;
        textInputLayout.postInvalidateOnAnimation();
        this.f111b0 = f(1.0f, 0.0f, f2, aVar);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f121k;
        ColorStateList colorStateList2 = this.f120j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f121k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f103V;
        float f5 = this.f104W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, aVar));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f89H = AbstractC0288a.a(0.0f, this.f99R, f2);
        this.f90I = AbstractC0288a.a(0.0f, this.f100S, f2);
        this.f91J = AbstractC0288a.a(0.0f, this.f101T, f2);
        int a2 = a(0, e(this.f102U), f2);
        this.f92K = a2;
        textPaint.setShadowLayer(this.f89H, this.f90I, this.f91J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f121k == colorStateList && this.f120j == colorStateList) {
            return;
        }
        this.f121k = colorStateList;
        this.f120j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        G0.a aVar = this.f135y;
        if (aVar != null) {
            aVar.f182c = true;
        }
        if (this.f130t == typeface) {
            return false;
        }
        this.f130t = typeface;
        Typeface E2 = q1.d.E(this.f108a.getContext().getResources().getConfiguration(), typeface);
        this.f129s = E2;
        if (E2 == null) {
            E2 = this.f130t;
        }
        this.f128r = E2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f110b) {
            this.f110b = f2;
            float f3 = this.f112c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f97P);
            RectF rectF = this.f115e;
            rectF.left = f4;
            rectF.top = f(this.f122l, this.f123m, f2, this.f97P);
            rectF.right = f(r1.right, rect.right, f2, this.f97P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f97P);
            this.f126p = f(this.f124n, this.f125o, f2, this.f97P);
            this.f127q = f(this.f122l, this.f123m, f2, this.f97P);
            l(f2);
            Z.a aVar = AbstractC0288a.f3551b;
            this.f109a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f2, aVar);
            WeakHashMap weakHashMap = S.f360a;
            TextInputLayout textInputLayout = this.f108a;
            textInputLayout.postInvalidateOnAnimation();
            this.f111b0 = f(1.0f, 0.0f, f2, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f121k;
            ColorStateList colorStateList2 = this.f120j;
            TextPaint textPaint = this.f95N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f121k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f103V;
            float f6 = this.f104W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, aVar));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f89H = AbstractC0288a.a(0.0f, this.f99R, f2);
            this.f90I = AbstractC0288a.a(0.0f, this.f100S, f2);
            this.f91J = AbstractC0288a.a(0.0f, this.f101T, f2);
            int a2 = a(0, e(this.f102U), f2);
            this.f92K = a2;
            textPaint.setShadowLayer(this.f89H, this.f90I, this.f91J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = S.f360a;
        this.f108a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f133w != typeface) {
            this.f133w = typeface;
            Typeface E2 = q1.d.E(this.f108a.getContext().getResources().getConfiguration(), typeface);
            this.f132v = E2;
            if (E2 == null) {
                E2 = this.f133w;
            }
            this.f131u = E2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
