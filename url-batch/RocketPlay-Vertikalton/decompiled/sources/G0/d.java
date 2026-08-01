package G0;

import K.T;
import a0.C0062a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import t0.AbstractC0369a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f437A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f438B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f439C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f441E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f442G;

    /* renamed from: H, reason: collision with root package name */
    public float f443H;

    /* renamed from: I, reason: collision with root package name */
    public float f444I;

    /* renamed from: J, reason: collision with root package name */
    public float f445J;

    /* renamed from: K, reason: collision with root package name */
    public int f446K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f447L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f448M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f449N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f450O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f451P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f452Q;

    /* renamed from: R, reason: collision with root package name */
    public float f453R;

    /* renamed from: S, reason: collision with root package name */
    public float f454S;

    /* renamed from: T, reason: collision with root package name */
    public float f455T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f456U;

    /* renamed from: V, reason: collision with root package name */
    public float f457V;

    /* renamed from: W, reason: collision with root package name */
    public float f458W;

    /* renamed from: X, reason: collision with root package name */
    public float f459X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f460Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f461Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f462a;

    /* renamed from: a0, reason: collision with root package name */
    public float f463a0;

    /* renamed from: b, reason: collision with root package name */
    public float f464b;

    /* renamed from: b0, reason: collision with root package name */
    public float f465b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f466c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f467c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f469e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f474j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f475k;

    /* renamed from: l, reason: collision with root package name */
    public float f476l;

    /* renamed from: m, reason: collision with root package name */
    public float f477m;

    /* renamed from: n, reason: collision with root package name */
    public float f478n;

    /* renamed from: o, reason: collision with root package name */
    public float f479o;

    /* renamed from: p, reason: collision with root package name */
    public float f480p;

    /* renamed from: q, reason: collision with root package name */
    public float f481q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f482r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f483s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f484t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f485u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f486v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f487w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f488x;

    /* renamed from: y, reason: collision with root package name */
    public J0.a f489y;

    /* renamed from: f, reason: collision with root package name */
    public int f471f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f473g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f490z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f440D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f468d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f470e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f472f0 = 1;

    public d(TextInputLayout textInputLayout) {
        this.f462a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f449N = textPaint;
        this.f450O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f466c = new Rect();
        this.f469e = new RectF();
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
        return AbstractC0369a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f633a;
        boolean z2 = this.f462a.getLayoutDirection() == 1;
        if (this.f440D) {
            return (z2 ? I.i.d : I.i.f586c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f437A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f466c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f457V;
            this.F = 1.0f;
            typeface = this.f482r;
        } else {
            float f5 = this.h;
            float f6 = this.f458W;
            Typeface typeface2 = this.f485u;
            if (Math.abs(f2 - RecyclerView.f1949A0) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f452Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f449N;
        if (width > RecyclerView.f1949A0) {
            boolean z4 = this.f442G != f3;
            boolean z5 = this.f459X != f4;
            boolean z6 = this.f488x != typeface;
            StaticLayout staticLayout = this.f460Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f448M;
            this.f442G = f3;
            this.f459X = f4;
            this.f488x = typeface;
            this.f448M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f438B == null || z3) {
            textPaint.setTextSize(this.f442G);
            textPaint.setTypeface(this.f488x);
            textPaint.setLetterSpacing(this.f459X);
            boolean b2 = b(this.f437A);
            this.f439C = b2;
            int i = this.f468d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f471f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f439C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f439C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i iVar = new i(this.f437A, textPaint, (int) width);
            iVar.f506k = this.f490z;
            iVar.f505j = b2;
            iVar.f502e = alignment;
            iVar.i = false;
            iVar.f503f = i;
            iVar.f504g = this.f470e0;
            iVar.h = this.f472f0;
            StaticLayout a2 = iVar.a();
            a2.getClass();
            this.f460Y = a2;
            this.f438B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f450O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f482r);
        textPaint.setLetterSpacing(this.f457V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f447L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f484t;
            if (typeface != null) {
                this.f483s = F1.l.U(configuration, typeface);
            }
            Typeface typeface2 = this.f487w;
            if (typeface2 != null) {
                this.f486v = F1.l.U(configuration, typeface2);
            }
            Typeface typeface3 = this.f483s;
            if (typeface3 == null) {
                typeface3 = this.f484t;
            }
            this.f482r = typeface3;
            Typeface typeface4 = this.f486v;
            if (typeface4 == null) {
                typeface4 = this.f487w;
            }
            this.f485u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f462a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f438B;
        TextPaint textPaint = this.f449N;
        if (charSequence != null && (staticLayout = this.f460Y) != null) {
            this.f467c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f490z);
        }
        CharSequence charSequence2 = this.f467c0;
        if (charSequence2 != null) {
            this.f461Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f461Z = RecyclerView.f1949A0;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f473g, this.f439C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f477m = rect.top;
        } else if (i != 80) {
            this.f477m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f477m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f479o = rect.centerX() - (this.f461Z / 2.0f);
        } else if (i2 != 5) {
            this.f479o = rect.left;
        } else {
            this.f479o = rect.right - this.f461Z;
        }
        c(RecyclerView.f1949A0, z2);
        float height = this.f460Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f460Y;
        if (staticLayout2 == null || this.f468d0 <= 1) {
            CharSequence charSequence3 = this.f438B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f460Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f471f, this.f439C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f466c;
        if (i3 == 48) {
            this.f476l = rect2.top;
        } else if (i3 != 80) {
            this.f476l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f476l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f478n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f478n = rect2.left;
        } else {
            this.f478n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f441E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f441E = null;
        }
        l(this.f464b);
        float f2 = this.f464b;
        float f3 = f(rect2.left, rect.left, f2, this.f451P);
        RectF rectF = this.f469e;
        rectF.left = f3;
        rectF.top = f(this.f476l, this.f477m, f2, this.f451P);
        rectF.right = f(rect2.right, rect.right, f2, this.f451P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f451P);
        this.f480p = f(this.f478n, this.f479o, f2, this.f451P);
        this.f481q = f(this.f476l, this.f477m, f2, this.f451P);
        l(f2);
        C0062a c0062a = AbstractC0369a.f4163b;
        this.f463a0 = 1.0f - f(RecyclerView.f1949A0, 1.0f, 1.0f - f2, c0062a);
        WeakHashMap weakHashMap = T.f633a;
        textInputLayout.postInvalidateOnAnimation();
        this.f465b0 = f(1.0f, RecyclerView.f1949A0, f2, c0062a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f475k;
        ColorStateList colorStateList2 = this.f474j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f475k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f457V;
        float f5 = this.f458W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0062a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f443H = AbstractC0369a.a(RecyclerView.f1949A0, this.f453R, f2);
        this.f444I = AbstractC0369a.a(RecyclerView.f1949A0, this.f454S, f2);
        this.f445J = AbstractC0369a.a(RecyclerView.f1949A0, this.f455T, f2);
        int a2 = a(0, e(this.f456U), f2);
        this.f446K = a2;
        textPaint.setShadowLayer(this.f443H, this.f444I, this.f445J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f475k == colorStateList && this.f474j == colorStateList) {
            return;
        }
        this.f475k = colorStateList;
        this.f474j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        J0.a aVar = this.f489y;
        if (aVar != null) {
            aVar.f595c = true;
        }
        if (this.f484t == typeface) {
            return false;
        }
        this.f484t = typeface;
        Typeface U2 = F1.l.U(this.f462a.getContext().getResources().getConfiguration(), typeface);
        this.f483s = U2;
        if (U2 == null) {
            U2 = this.f484t;
        }
        this.f482r = U2;
        return true;
    }

    public final void k(float f2) {
        if (f2 < RecyclerView.f1949A0) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f464b) {
            this.f464b = f2;
            float f3 = this.f466c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f451P);
            RectF rectF = this.f469e;
            rectF.left = f4;
            rectF.top = f(this.f476l, this.f477m, f2, this.f451P);
            rectF.right = f(r1.right, rect.right, f2, this.f451P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f451P);
            this.f480p = f(this.f478n, this.f479o, f2, this.f451P);
            this.f481q = f(this.f476l, this.f477m, f2, this.f451P);
            l(f2);
            C0062a c0062a = AbstractC0369a.f4163b;
            this.f463a0 = 1.0f - f(RecyclerView.f1949A0, 1.0f, 1.0f - f2, c0062a);
            WeakHashMap weakHashMap = T.f633a;
            TextInputLayout textInputLayout = this.f462a;
            textInputLayout.postInvalidateOnAnimation();
            this.f465b0 = f(1.0f, RecyclerView.f1949A0, f2, c0062a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f475k;
            ColorStateList colorStateList2 = this.f474j;
            TextPaint textPaint = this.f449N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f475k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f457V;
            float f6 = this.f458W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0062a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f443H = AbstractC0369a.a(RecyclerView.f1949A0, this.f453R, f2);
            this.f444I = AbstractC0369a.a(RecyclerView.f1949A0, this.f454S, f2);
            this.f445J = AbstractC0369a.a(RecyclerView.f1949A0, this.f455T, f2);
            int a2 = a(0, e(this.f456U), f2);
            this.f446K = a2;
            textPaint.setShadowLayer(this.f443H, this.f444I, this.f445J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = T.f633a;
        this.f462a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f487w != typeface) {
            this.f487w = typeface;
            Typeface U2 = F1.l.U(this.f462a.getContext().getResources().getConfiguration(), typeface);
            this.f486v = U2;
            if (U2 == null) {
                U2 = this.f487w;
            }
            this.f485u = U2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
