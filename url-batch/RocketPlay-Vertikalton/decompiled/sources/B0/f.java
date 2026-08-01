package B0;

import G0.j;
import G0.k;
import M0.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import t0.C0370b;

/* loaded from: classes.dex */
public final class f extends g implements Drawable.Callback, j {

    /* renamed from: F0, reason: collision with root package name */
    public static final int[] f101F0 = {R.attr.state_enabled};

    /* renamed from: G0, reason: collision with root package name */
    public static final ShapeDrawable f102G0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A, reason: collision with root package name */
    public float f103A;

    /* renamed from: A0, reason: collision with root package name */
    public WeakReference f104A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f105B;

    /* renamed from: B0, reason: collision with root package name */
    public TextUtils.TruncateAt f106B0;

    /* renamed from: C, reason: collision with root package name */
    public float f107C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f108D;

    /* renamed from: D0, reason: collision with root package name */
    public int f109D0;

    /* renamed from: E, reason: collision with root package name */
    public CharSequence f110E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f111E0;
    public boolean F;

    /* renamed from: G, reason: collision with root package name */
    public Drawable f112G;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f113H;

    /* renamed from: I, reason: collision with root package name */
    public float f114I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f115J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f116K;

    /* renamed from: L, reason: collision with root package name */
    public Drawable f117L;

    /* renamed from: M, reason: collision with root package name */
    public RippleDrawable f118M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f119N;

    /* renamed from: O, reason: collision with root package name */
    public float f120O;

    /* renamed from: P, reason: collision with root package name */
    public SpannableStringBuilder f121P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f122Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f123R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f124S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f125T;

    /* renamed from: U, reason: collision with root package name */
    public C0370b f126U;

    /* renamed from: V, reason: collision with root package name */
    public C0370b f127V;

    /* renamed from: W, reason: collision with root package name */
    public float f128W;

    /* renamed from: X, reason: collision with root package name */
    public float f129X;

    /* renamed from: Y, reason: collision with root package name */
    public float f130Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f131Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f132a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f133b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f134c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f135d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Context f136e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f137f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Paint.FontMetrics f138g0;

    /* renamed from: h0, reason: collision with root package name */
    public final RectF f139h0;

    /* renamed from: i0, reason: collision with root package name */
    public final PointF f140i0;

    /* renamed from: j0, reason: collision with root package name */
    public final Path f141j0;

    /* renamed from: k0, reason: collision with root package name */
    public final k f142k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f143l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f144m0;
    public int n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f145o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f146p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f147q0;
    public boolean r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f148s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f149t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorFilter f150u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuffColorFilter f151v0;

    /* renamed from: w0, reason: collision with root package name */
    public ColorStateList f152w0;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f153x;

    /* renamed from: x0, reason: collision with root package name */
    public PorterDuff.Mode f154x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f155y;

    /* renamed from: y0, reason: collision with root package name */
    public int[] f156y0;

    /* renamed from: z, reason: collision with root package name */
    public float f157z;

    /* renamed from: z0, reason: collision with root package name */
    public ColorStateList f158z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.luckycounter.drinkwater.R.attr.chipStyle, com.luckycounter.drinkwater.R.style.Widget_MaterialComponents_Chip_Action);
        this.f103A = -1.0f;
        this.f137f0 = new Paint(1);
        this.f138g0 = new Paint.FontMetrics();
        this.f139h0 = new RectF();
        this.f140i0 = new PointF();
        this.f141j0 = new Path();
        this.f149t0 = 255;
        this.f154x0 = PorterDuff.Mode.SRC_IN;
        this.f104A0 = new WeakReference(null);
        h(context);
        this.f136e0 = context;
        k kVar = new k(this);
        this.f142k0 = kVar;
        this.f110E = "";
        kVar.f507a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f101F0;
        setState(iArr);
        if (!Arrays.equals(this.f156y0, iArr)) {
            this.f156y0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.C0 = true;
        int[] iArr2 = K0.a.f730a;
        f102G0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean t(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(float f2) {
        if (this.f103A != f2) {
            this.f103A = f2;
            M0.j e2 = this.f828a.f814a.e();
            e2.f851e = new M0.a(f2);
            e2.f852f = new M0.a(f2);
            e2.f853g = new M0.a(f2);
            e2.h = new M0.a(f2);
            setShapeAppearanceModel(e2.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f112G;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof D.d;
            drawable2 = drawable3;
            if (z2) {
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p2 = p();
            this.f112G = drawable != null ? drawable.mutate() : null;
            float p3 = p();
            U(drawable2);
            if (S()) {
                n(this.f112G);
            }
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void C(float f2) {
        if (this.f114I != f2) {
            float p2 = p();
            this.f114I = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f115J = true;
        if (this.f113H != colorStateList) {
            this.f113H = colorStateList;
            if (S()) {
                D.a.h(this.f112G, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z2) {
        if (this.F != z2) {
            boolean S2 = S();
            this.F = z2;
            boolean S3 = S();
            if (S2 != S3) {
                if (S3) {
                    n(this.f112G);
                } else {
                    U(this.f112G);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f105B != colorStateList) {
            this.f105B = colorStateList;
            if (this.f111E0) {
                M0.f fVar = this.f828a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f2) {
        if (this.f107C != f2) {
            this.f107C = f2;
            this.f137f0.setStrokeWidth(f2);
            if (this.f111E0) {
                this.f828a.f820j = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f117L;
        if (drawable3 != 0) {
            boolean z2 = drawable3 instanceof D.d;
            drawable2 = drawable3;
            if (z2) {
            }
            if (drawable2 == drawable) {
                float q2 = q();
                this.f117L = drawable != null ? drawable.mutate() : null;
                int[] iArr = K0.a.f730a;
                this.f118M = new RippleDrawable(K0.a.a(this.f108D), this.f117L, f102G0);
                float q3 = q();
                U(drawable2);
                if (T()) {
                    n(this.f117L);
                }
                invalidateSelf();
                if (q2 != q3) {
                    u();
                    return;
                }
                return;
            }
            return;
        }
        drawable2 = null;
        if (drawable2 == drawable) {
        }
    }

    public final void I(float f2) {
        if (this.f134c0 != f2) {
            this.f134c0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f2) {
        if (this.f120O != f2) {
            this.f120O = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f2) {
        if (this.f133b0 != f2) {
            this.f133b0 = f2;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f119N != colorStateList) {
            this.f119N = colorStateList;
            if (T()) {
                D.a.h(this.f117L, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z2) {
        if (this.f116K != z2) {
            boolean T2 = T();
            this.f116K = z2;
            boolean T3 = T();
            if (T2 != T3) {
                if (T3) {
                    n(this.f117L);
                } else {
                    U(this.f117L);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f2) {
        if (this.f130Y != f2) {
            float p2 = p();
            this.f130Y = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void O(float f2) {
        if (this.f129X != f2) {
            float p2 = p();
            this.f129X = f2;
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f108D != colorStateList) {
            this.f108D = colorStateList;
            this.f158z0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(J0.d dVar) {
        k kVar = this.f142k0;
        if (kVar.f511f != dVar) {
            kVar.f511f = dVar;
            if (dVar != null) {
                TextPaint textPaint = kVar.f507a;
                Context context = this.f136e0;
                b bVar = kVar.f508b;
                dVar.f(context, textPaint, bVar);
                j jVar = (j) kVar.f510e.get();
                if (jVar != null) {
                    textPaint.drawableState = jVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                kVar.d = true;
            }
            j jVar2 = (j) kVar.f510e.get();
            if (jVar2 != null) {
                f fVar = (f) jVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(jVar2.getState());
            }
        }
    }

    public final boolean R() {
        return this.f123R && this.f124S != null && this.r0;
    }

    public final boolean S() {
        return this.F && this.f112G != null;
    }

    public final boolean T() {
        return this.f116K && this.f117L != null;
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int i5;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f149t0) == 0) {
            return;
        }
        int saveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z2 = this.f111E0;
        Paint paint = this.f137f0;
        RectF rectF3 = this.f139h0;
        if (!z2) {
            paint.setColor(this.f143l0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (!this.f111E0) {
            paint.setColor(this.f144m0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f150u0;
            if (colorFilter == null) {
                colorFilter = this.f151v0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (this.f111E0) {
            super.draw(canvas);
        }
        if (this.f107C > RecyclerView.f1949A0 && !this.f111E0) {
            paint.setColor(this.f145o0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f111E0) {
                ColorFilter colorFilter2 = this.f150u0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f151v0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f107C / 2.0f;
            rectF3.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f103A - (this.f107C / 2.0f);
            canvas.drawRoundRect(rectF3, f4, f4, paint);
        }
        paint.setColor(this.f146p0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.f111E0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f141j0;
            M0.f fVar = this.f828a;
            this.f842r.a(fVar.f814a, fVar.i, rectF4, this.f841q, path);
            d(canvas, paint, path, this.f828a.f814a, f());
        } else {
            canvas.drawRoundRect(rectF3, r(), r(), paint);
        }
        if (S()) {
            o(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.f112G.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f112G.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (R()) {
            o(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.f124S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.f124S.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.C0 || this.f110E == null) {
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.f140i0;
            pointF.set(RecyclerView.f1949A0, RecyclerView.f1949A0);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f110E;
            k kVar = this.f142k0;
            if (charSequence != null) {
                float p2 = p() + this.f128W + this.f131Z;
                if (D.b.a(this) == 0) {
                    pointF.x = bounds.left + p2;
                } else {
                    pointF.x = bounds.right - p2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = kVar.f507a;
                Paint.FontMetrics fontMetrics = this.f138g0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.f110E != null) {
                float p3 = p() + this.f128W + this.f131Z;
                float q2 = q() + this.f135d0 + this.f132a0;
                if (D.b.a(this) == 0) {
                    rectF3.left = bounds.left + p3;
                    rectF3.right = bounds.right - q2;
                } else {
                    rectF3.left = bounds.left + q2;
                    rectF3.right = bounds.right - p3;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            J0.d dVar = kVar.f511f;
            TextPaint textPaint2 = kVar.f507a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                kVar.f511f.e(this.f136e0, textPaint2, kVar.f508b);
            }
            textPaint2.setTextAlign(align);
            boolean z3 = Math.round(kVar.a(this.f110E.toString())) > Math.round(rectF3.width());
            if (z3) {
                i5 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i5 = 0;
            }
            CharSequence charSequence2 = this.f110E;
            if (z3 && this.f106B0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f106B0);
            }
            CharSequence charSequence3 = charSequence2;
            int length = charSequence3.length();
            float f9 = pointF.x;
            float f10 = pointF.y;
            rectF = rectF3;
            i2 = saveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence3, 0, length, f9, f10, textPaint2);
            if (z3) {
                canvas.restoreToCount(i5);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f11 = this.f135d0 + this.f134c0;
                if (D.b.a(this) == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.f120O;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.f120O;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.f120O;
                float f15 = exactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.f117L.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = K0.a.f730a;
            this.f118M.setBounds(this.f117L.getBounds());
            this.f118M.jumpToCurrentState();
            this.f118M.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.f149t0 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f149t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f150u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f157z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f142k0.a(this.f110E.toString()) + p() + this.f128W + this.f131Z + this.f132a0 + this.f135d0), this.f109D0);
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.f111E0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f157z, this.f103A);
        } else {
            outline.setRoundRect(bounds, this.f103A);
        }
        outline.setAlpha(this.f149t0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        J0.d dVar;
        ColorStateList colorStateList;
        return s(this.f153x) || s(this.f155y) || s(this.f105B) || !((dVar = this.f142k0.f511f) == null || (colorStateList = dVar.f605j) == null || !colorStateList.isStateful()) || ((this.f123R && this.f124S != null && this.f122Q) || t(this.f112G) || t(this.f124S) || s(this.f152w0));
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        D.b.b(drawable, D.b.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f117L) {
            if (drawable.isStateful()) {
                drawable.setState(this.f156y0);
            }
            D.a.h(drawable, this.f119N);
            return;
        }
        Drawable drawable2 = this.f112G;
        if (drawable == drawable2 && this.f115J) {
            D.a.h(drawable2, this.f113H);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f2 = this.f128W + this.f129X;
            Drawable drawable = this.r0 ? this.f124S : this.f112G;
            float f3 = this.f114I;
            if (f3 <= RecyclerView.f1949A0 && drawable != null) {
                f3 = drawable.getIntrinsicWidth();
            }
            if (D.b.a(this) == 0) {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + f3;
            } else {
                float f5 = rect.right - f2;
                rectF.right = f5;
                rectF.left = f5 - f3;
            }
            Drawable drawable2 = this.r0 ? this.f124S : this.f112G;
            float f6 = this.f114I;
            if (f6 <= RecyclerView.f1949A0 && drawable2 != null) {
                f6 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f136e0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f6) {
                    f6 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f6 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            onLayoutDirectionChanged |= D.b.b(this.f112G, i);
        }
        if (R()) {
            onLayoutDirectionChanged |= D.b.b(this.f124S, i);
        }
        if (T()) {
            onLayoutDirectionChanged |= D.b.b(this.f117L, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (S()) {
            onLevelChange |= this.f112G.setLevel(i);
        }
        if (R()) {
            onLevelChange |= this.f124S.setLevel(i);
        }
        if (T()) {
            onLevelChange |= this.f117L.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f111E0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f156y0);
    }

    public final float p() {
        if (!S() && !R()) {
            return RecyclerView.f1949A0;
        }
        float f2 = this.f129X;
        Drawable drawable = this.r0 ? this.f124S : this.f112G;
        float f3 = this.f114I;
        if (f3 <= RecyclerView.f1949A0 && drawable != null) {
            f3 = drawable.getIntrinsicWidth();
        }
        return f3 + f2 + this.f130Y;
    }

    public final float q() {
        return T() ? this.f133b0 + this.f120O + this.f134c0 : RecyclerView.f1949A0;
    }

    public final float r() {
        return this.f111E0 ? this.f828a.f814a.f860e.a(f()) : this.f103A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f149t0 != i) {
            this.f149t0 = i;
            invalidateSelf();
        }
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f150u0 != colorFilter) {
            this.f150u0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f152w0 != colorStateList) {
            this.f152w0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // M0.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f154x0 != mode) {
            this.f154x0 = mode;
            ColorStateList colorStateList = this.f152w0;
            this.f151v0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (S()) {
            visible |= this.f112G.setVisible(z2, z3);
        }
        if (R()) {
            visible |= this.f124S.setVisible(z2, z3);
        }
        if (T()) {
            visible |= this.f117L.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f104A0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f2231p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean z3;
        int colorForState;
        ColorStateList colorStateList;
        boolean z4 = true;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f153x;
        int b2 = b(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f143l0) : 0);
        if (this.f143l0 != b2) {
            this.f143l0 = b2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f155y;
        int b3 = b(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f144m0) : 0);
        if (this.f144m0 != b3) {
            this.f144m0 = b3;
            onStateChange = true;
        }
        int b4 = C.a.b(b3, b2);
        if ((this.n0 != b4) | (this.f828a.f816c == null)) {
            this.n0 = b4;
            j(ColorStateList.valueOf(b4));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.f105B;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f145o0) : 0;
        if (this.f145o0 != colorForState2) {
            this.f145o0 = colorForState2;
            onStateChange = true;
        }
        int colorForState3 = (this.f158z0 == null || !K0.a.b(iArr)) ? 0 : this.f158z0.getColorForState(iArr, this.f146p0);
        if (this.f146p0 != colorForState3) {
            this.f146p0 = colorForState3;
        }
        J0.d dVar = this.f142k0.f511f;
        int colorForState4 = (dVar == null || (colorStateList = dVar.f605j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f147q0);
        if (this.f147q0 != colorForState4) {
            this.f147q0 = colorForState4;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state[i] != 16842912) {
                    i++;
                } else if (this.f122Q) {
                    z2 = true;
                }
            }
        }
        z2 = false;
        if (this.r0 != z2 && this.f124S != null) {
            float p2 = p();
            this.r0 = z2;
            if (p2 != p()) {
                onStateChange = true;
                z3 = true;
                ColorStateList colorStateList5 = this.f152w0;
                colorForState = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.f148s0) : 0;
                if (this.f148s0 == colorForState) {
                    this.f148s0 = colorForState;
                    ColorStateList colorStateList6 = this.f152w0;
                    PorterDuff.Mode mode = this.f154x0;
                    this.f151v0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z4 = onStateChange;
                }
                if (t(this.f112G)) {
                    z4 |= this.f112G.setState(iArr);
                }
                if (t(this.f124S)) {
                    z4 |= this.f124S.setState(iArr);
                }
                if (t(this.f117L)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z4 |= this.f117L.setState(iArr3);
                }
                int[] iArr4 = K0.a.f730a;
                if (t(this.f118M)) {
                    z4 |= this.f118M.setState(iArr2);
                }
                if (z4) {
                    invalidateSelf();
                }
                if (z3) {
                    u();
                }
                return z4;
            }
            onStateChange = true;
        }
        z3 = false;
        ColorStateList colorStateList52 = this.f152w0;
        if (colorStateList52 == null) {
        }
        if (this.f148s0 == colorForState) {
        }
        if (t(this.f112G)) {
        }
        if (t(this.f124S)) {
        }
        if (t(this.f117L)) {
        }
        int[] iArr42 = K0.a.f730a;
        if (t(this.f118M)) {
        }
        if (z4) {
        }
        if (z3) {
        }
        return z4;
    }

    public final void w(boolean z2) {
        if (this.f122Q != z2) {
            this.f122Q = z2;
            float p2 = p();
            if (!z2 && this.r0) {
                this.r0 = false;
            }
            float p3 = p();
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f124S != drawable) {
            float p2 = p();
            this.f124S = drawable;
            float p3 = p();
            U(this.f124S);
            n(this.f124S);
            invalidateSelf();
            if (p2 != p3) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f125T != colorStateList) {
            this.f125T = colorStateList;
            if (this.f123R && (drawable = this.f124S) != null && this.f122Q) {
                D.a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z2) {
        if (this.f123R != z2) {
            boolean R2 = R();
            this.f123R = z2;
            boolean R3 = R();
            if (R2 != R3) {
                if (R3) {
                    n(this.f124S);
                } else {
                    U(this.f124S);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
