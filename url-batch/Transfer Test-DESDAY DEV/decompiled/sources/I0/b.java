package I0;

import K.T;
import a0.C0058a;
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
import v0.AbstractC0341a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f268A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f269B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f270C;

    /* renamed from: E, reason: collision with root package name */
    public Bitmap f272E;
    public float F;

    /* renamed from: G, reason: collision with root package name */
    public float f273G;

    /* renamed from: H, reason: collision with root package name */
    public float f274H;

    /* renamed from: I, reason: collision with root package name */
    public float f275I;

    /* renamed from: J, reason: collision with root package name */
    public float f276J;

    /* renamed from: K, reason: collision with root package name */
    public int f277K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f278L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f279M;

    /* renamed from: N, reason: collision with root package name */
    public final TextPaint f280N;

    /* renamed from: O, reason: collision with root package name */
    public final TextPaint f281O;

    /* renamed from: P, reason: collision with root package name */
    public LinearInterpolator f282P;

    /* renamed from: Q, reason: collision with root package name */
    public LinearInterpolator f283Q;

    /* renamed from: R, reason: collision with root package name */
    public float f284R;

    /* renamed from: S, reason: collision with root package name */
    public float f285S;

    /* renamed from: T, reason: collision with root package name */
    public float f286T;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f287U;

    /* renamed from: V, reason: collision with root package name */
    public float f288V;

    /* renamed from: W, reason: collision with root package name */
    public float f289W;

    /* renamed from: X, reason: collision with root package name */
    public float f290X;

    /* renamed from: Y, reason: collision with root package name */
    public StaticLayout f291Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f292Z;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f293a;

    /* renamed from: a0, reason: collision with root package name */
    public float f294a0;

    /* renamed from: b, reason: collision with root package name */
    public float f295b;

    /* renamed from: b0, reason: collision with root package name */
    public float f296b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f297c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f298c0;
    public final Rect d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f300e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f305j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f306k;

    /* renamed from: l, reason: collision with root package name */
    public float f307l;

    /* renamed from: m, reason: collision with root package name */
    public float f308m;

    /* renamed from: n, reason: collision with root package name */
    public float f309n;

    /* renamed from: o, reason: collision with root package name */
    public float f310o;

    /* renamed from: p, reason: collision with root package name */
    public float f311p;

    /* renamed from: q, reason: collision with root package name */
    public float f312q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f313r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f314s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f315t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f316u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f317v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f318w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f319x;

    /* renamed from: y, reason: collision with root package name */
    public L0.a f320y;

    /* renamed from: f, reason: collision with root package name */
    public int f302f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f304g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f321z = TextUtils.TruncateAt.END;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f271D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f299d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f301e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f303f0 = 1;

    public b(TextInputLayout textInputLayout) {
        this.f293a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f280N = textPaint;
        this.f281O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f297c = new Rect();
        this.f300e = new RectF();
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
        return AbstractC0341a.a(f2, f3, f4);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = T.f372a;
        boolean z2 = this.f293a.getLayoutDirection() == 1;
        if (this.f271D) {
            return (z2 ? I.i.d : I.i.f266c).b(charSequence, charSequence.length());
        }
        return z2;
    }

    public final void c(float f2, boolean z2) {
        float f3;
        float f4;
        Typeface typeface;
        boolean z3;
        Layout.Alignment alignment;
        if (this.f268A == null) {
            return;
        }
        float width = this.d.width();
        float width2 = this.f297c.width();
        if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
            f3 = this.i;
            f4 = this.f288V;
            this.F = 1.0f;
            typeface = this.f313r;
        } else {
            float f5 = this.h;
            float f6 = this.f289W;
            Typeface typeface2 = this.f316u;
            if (Math.abs(f2 - RecyclerView.f1570A0) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f2, this.f283Q) / this.h;
            }
            float f7 = this.i / this.h;
            width = (z2 || width2 * f7 <= width) ? width2 : Math.min(width / f7, width2);
            f3 = f5;
            f4 = f6;
            typeface = typeface2;
        }
        TextPaint textPaint = this.f280N;
        if (width > RecyclerView.f1570A0) {
            boolean z4 = this.f273G != f3;
            boolean z5 = this.f290X != f4;
            boolean z6 = this.f319x != typeface;
            StaticLayout staticLayout = this.f291Y;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f279M;
            this.f273G = f3;
            this.f290X = f4;
            this.f319x = typeface;
            this.f279M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z3 = z7;
        } else {
            z3 = false;
        }
        if (this.f269B == null || z3) {
            textPaint.setTextSize(this.f273G);
            textPaint.setTypeface(this.f319x);
            textPaint.setLetterSpacing(this.f290X);
            boolean b2 = b(this.f268A);
            this.f270C = b2;
            int i = this.f299d0;
            if (i <= 1 || b2) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f302f, b2 ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.f270C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f270C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            g gVar = new g(this.f268A, textPaint, (int) width);
            gVar.f337k = this.f321z;
            gVar.f336j = b2;
            gVar.f333e = alignment;
            gVar.i = false;
            gVar.f334f = i;
            gVar.f335g = this.f301e0;
            gVar.h = this.f303f0;
            StaticLayout a2 = gVar.a();
            a2.getClass();
            this.f291Y = a2;
            this.f269B = a2.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.f281O;
        textPaint.setTextSize(this.i);
        textPaint.setTypeface(this.f313r);
        textPaint.setLetterSpacing(this.f288V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f278L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f315t;
            if (typeface != null) {
                this.f314s = A.c.g0(configuration, typeface);
            }
            Typeface typeface2 = this.f318w;
            if (typeface2 != null) {
                this.f317v = A.c.g0(configuration, typeface2);
            }
            Typeface typeface3 = this.f314s;
            if (typeface3 == null) {
                typeface3 = this.f315t;
            }
            this.f313r = typeface3;
            Typeface typeface4 = this.f317v;
            if (typeface4 == null) {
                typeface4 = this.f318w;
            }
            this.f316u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z2) {
        float measureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f293a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z2) {
            return;
        }
        c(1.0f, z2);
        CharSequence charSequence = this.f269B;
        TextPaint textPaint = this.f280N;
        if (charSequence != null && (staticLayout = this.f291Y) != null) {
            this.f298c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f321z);
        }
        CharSequence charSequence2 = this.f298c0;
        if (charSequence2 != null) {
            this.f292Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f292Z = RecyclerView.f1570A0;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f304g, this.f270C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.d;
        if (i == 48) {
            this.f308m = rect.top;
        } else if (i != 80) {
            this.f308m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f308m = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.f310o = rect.centerX() - (this.f292Z / 2.0f);
        } else if (i2 != 5) {
            this.f310o = rect.left;
        } else {
            this.f310o = rect.right - this.f292Z;
        }
        c(RecyclerView.f1570A0, z2);
        float height = this.f291Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f291Y;
        if (staticLayout2 == null || this.f299d0 <= 1) {
            CharSequence charSequence3 = this.f269B;
            measureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            measureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f291Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f302f, this.f270C ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.f297c;
        if (i3 == 48) {
            this.f307l = rect2.top;
        } else if (i3 != 80) {
            this.f307l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f307l = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.f309n = rect2.centerX() - (measureText / 2.0f);
        } else if (i4 != 5) {
            this.f309n = rect2.left;
        } else {
            this.f309n = rect2.right - measureText;
        }
        Bitmap bitmap = this.f272E;
        if (bitmap != null) {
            bitmap.recycle();
            this.f272E = null;
        }
        l(this.f295b);
        float f2 = this.f295b;
        float f3 = f(rect2.left, rect.left, f2, this.f282P);
        RectF rectF = this.f300e;
        rectF.left = f3;
        rectF.top = f(this.f307l, this.f308m, f2, this.f282P);
        rectF.right = f(rect2.right, rect.right, f2, this.f282P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f2, this.f282P);
        this.f311p = f(this.f309n, this.f310o, f2, this.f282P);
        this.f312q = f(this.f307l, this.f308m, f2, this.f282P);
        l(f2);
        C0058a c0058a = AbstractC0341a.f4038b;
        this.f294a0 = 1.0f - f(RecyclerView.f1570A0, 1.0f, 1.0f - f2, c0058a);
        WeakHashMap weakHashMap = T.f372a;
        textInputLayout.postInvalidateOnAnimation();
        this.f296b0 = f(1.0f, RecyclerView.f1570A0, f2, c0058a);
        textInputLayout.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f306k;
        ColorStateList colorStateList2 = this.f305j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(e(colorStateList2), e(this.f306k), f2));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f4 = this.f288V;
        float f5 = this.f289W;
        if (f4 != f5) {
            textPaint.setLetterSpacing(f(f5, f4, f2, c0058a));
        } else {
            textPaint.setLetterSpacing(f4);
        }
        this.f274H = AbstractC0341a.a(RecyclerView.f1570A0, this.f284R, f2);
        this.f275I = AbstractC0341a.a(RecyclerView.f1570A0, this.f285S, f2);
        this.f276J = AbstractC0341a.a(RecyclerView.f1570A0, this.f286T, f2);
        int a2 = a(0, e(this.f287U), f2);
        this.f277K = a2;
        textPaint.setShadowLayer(this.f274H, this.f275I, this.f276J, a2);
        textInputLayout.postInvalidateOnAnimation();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f306k == colorStateList && this.f305j == colorStateList) {
            return;
        }
        this.f306k = colorStateList;
        this.f305j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        L0.a aVar = this.f320y;
        if (aVar != null) {
            aVar.f487g = true;
        }
        if (this.f315t == typeface) {
            return false;
        }
        this.f315t = typeface;
        Typeface g02 = A.c.g0(this.f293a.getContext().getResources().getConfiguration(), typeface);
        this.f314s = g02;
        if (g02 == null) {
            g02 = this.f315t;
        }
        this.f313r = g02;
        return true;
    }

    public final void k(float f2) {
        if (f2 < RecyclerView.f1570A0) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f295b) {
            this.f295b = f2;
            float f3 = this.f297c.left;
            Rect rect = this.d;
            float f4 = f(f3, rect.left, f2, this.f282P);
            RectF rectF = this.f300e;
            rectF.left = f4;
            rectF.top = f(this.f307l, this.f308m, f2, this.f282P);
            rectF.right = f(r1.right, rect.right, f2, this.f282P);
            rectF.bottom = f(r1.bottom, rect.bottom, f2, this.f282P);
            this.f311p = f(this.f309n, this.f310o, f2, this.f282P);
            this.f312q = f(this.f307l, this.f308m, f2, this.f282P);
            l(f2);
            C0058a c0058a = AbstractC0341a.f4038b;
            this.f294a0 = 1.0f - f(RecyclerView.f1570A0, 1.0f, 1.0f - f2, c0058a);
            WeakHashMap weakHashMap = T.f372a;
            TextInputLayout textInputLayout = this.f293a;
            textInputLayout.postInvalidateOnAnimation();
            this.f296b0 = f(1.0f, RecyclerView.f1570A0, f2, c0058a);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f306k;
            ColorStateList colorStateList2 = this.f305j;
            TextPaint textPaint = this.f280N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f306k), f2));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f5 = this.f288V;
            float f6 = this.f289W;
            if (f5 != f6) {
                textPaint.setLetterSpacing(f(f6, f5, f2, c0058a));
            } else {
                textPaint.setLetterSpacing(f5);
            }
            this.f274H = AbstractC0341a.a(RecyclerView.f1570A0, this.f284R, f2);
            this.f275I = AbstractC0341a.a(RecyclerView.f1570A0, this.f285S, f2);
            this.f276J = AbstractC0341a.a(RecyclerView.f1570A0, this.f286T, f2);
            int a2 = a(0, e(this.f287U), f2);
            this.f277K = a2;
            textPaint.setShadowLayer(this.f274H, this.f275I, this.f276J, a2);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f2) {
        c(f2, false);
        WeakHashMap weakHashMap = T.f372a;
        this.f293a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z2;
        boolean j2 = j(typeface);
        if (this.f318w != typeface) {
            this.f318w = typeface;
            Typeface g02 = A.c.g0(this.f293a.getContext().getResources().getConfiguration(), typeface);
            this.f317v = g02;
            if (g02 == null) {
                g02 = this.f318w;
            }
            this.f316u = g02;
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 || z2) {
            h(false);
        }
    }
}
