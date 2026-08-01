package defpackage;

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
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ba extends ls implements Drawable.Callback, r40 {
    public static final int[] T0 = {R.attr.state_enabled};
    public static final ShapeDrawable U0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public boolean F0;
    public int G0;
    public int H0;
    public ColorFilter I0;
    public PorterDuffColorFilter J0;
    public ColorStateList K0;
    public ColorStateList L;
    public PorterDuff.Mode L0;
    public ColorStateList M;
    public int[] M0;
    public float N;
    public ColorStateList N0;
    public float O;
    public WeakReference O0;
    public ColorStateList P;
    public TextUtils.TruncateAt P0;
    public float Q;
    public boolean Q0;
    public ColorStateList R;
    public int R0;
    public CharSequence S;
    public boolean S0;
    public boolean T;
    public Drawable U;
    public ColorStateList V;
    public float W;
    public boolean X;
    public boolean Y;
    public Drawable Z;
    public RippleDrawable a0;
    public ColorStateList b0;
    public float c0;
    public SpannableStringBuilder d0;
    public boolean e0;
    public boolean f0;
    public Drawable g0;
    public ColorStateList h0;
    public tt i0;
    public tt j0;
    public float k0;
    public float l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public final Context s0;
    public final Paint t0;
    public final Paint.FontMetrics u0;
    public final RectF v0;
    public final PointF w0;
    public final Path x0;
    public final s40 y0;
    public int z0;

    public ba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action);
        this.O = -1.0f;
        this.t0 = new Paint(1);
        this.u0 = new Paint.FontMetrics();
        this.v0 = new RectF();
        this.w0 = new PointF();
        this.x0 = new Path();
        this.H0 = 255;
        this.L0 = PorterDuff.Mode.SRC_IN;
        this.O0 = new WeakReference(null);
        n(context);
        this.s0 = context;
        s40 s40Var = new s40(this);
        this.y0 = s40Var;
        this.S = "";
        s40Var.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = T0;
        setState(iArr);
        V(iArr);
        this.Q0 = true;
        U0.setTint(-1);
    }

    public static boolean C(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean D(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void e0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final float A() {
        if (d0()) {
            return this.p0 + this.c0 + this.q0;
        }
        return 0.0f;
    }

    public final float B() {
        if (!this.S0) {
            return this.O;
        }
        float[] fArr = this.G;
        return fArr != null ? fArr[3] : this.g.a.c().e.a(h());
    }

    public final void E() {
        Chip chip = (Chip) this.O0.get();
        if (chip != null) {
            chip.b(chip.u);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean F(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.L;
        int d = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.z0) : 0);
        boolean z3 = true;
        if (this.z0 != d) {
            this.z0 = d;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.M;
        int d2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.A0) : 0);
        if (this.A0 != d2) {
            this.A0 = d2;
            onStateChange = true;
        }
        int b = eb.b(d2, d);
        if ((this.B0 != b) | (this.g.c == null)) {
            this.B0 = b;
            r(ColorStateList.valueOf(b));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.P;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.C0) : 0;
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            onStateChange = true;
        }
        if (this.N0 != null) {
            int[] iArr3 = d00.a;
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z4 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                i = this.N0.getColorForState(iArr, this.D0);
                if (this.D0 != i) {
                    this.D0 = i;
                }
                p40 p40Var = this.y0.g;
                colorForState = (p40Var != null || (colorStateList = p40Var.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.E0);
                if (this.E0 != colorForState) {
                    this.E0 = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.e0) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.F0 != z || this.g0 == null) {
                    z2 = false;
                } else {
                    float z6 = z();
                    this.F0 = z;
                    if (z6 != z()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.K0;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.G0) : 0;
                if (this.G0 == colorForState2) {
                    this.G0 = colorForState2;
                    ColorStateList colorStateList6 = this.K0;
                    PorterDuff.Mode mode = this.L0;
                    this.J0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (D(this.U)) {
                    z3 |= this.U.setState(iArr);
                }
                if (D(this.g0)) {
                    z3 |= this.g0.setState(iArr);
                }
                if (D(this.Z)) {
                    int[] iArr4 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr4, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr4, iArr.length, iArr2.length);
                    z3 |= this.Z.setState(iArr4);
                }
                if (D(this.a0)) {
                    z3 |= this.a0.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    E();
                }
                return z3;
            }
        }
        i = 0;
        if (this.D0 != i) {
        }
        p40 p40Var2 = this.y0.g;
        if (p40Var2 != null) {
        }
        if (this.E0 != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.F0 != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.K0;
        if (colorStateList52 == null) {
        }
        if (this.G0 == colorForState2) {
        }
        if (D(this.U)) {
        }
        if (D(this.g0)) {
        }
        if (D(this.Z)) {
        }
        if (D(this.a0)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    public final void G(boolean z) {
        if (this.e0 != z) {
            this.e0 = z;
            float z2 = z();
            if (!z && this.F0) {
                this.F0 = false;
            }
            float z3 = z();
            invalidateSelf();
            if (z2 != z3) {
                E();
            }
        }
    }

    public final void H(Drawable drawable) {
        if (this.g0 != drawable) {
            float z = z();
            this.g0 = drawable;
            float z2 = z();
            e0(this.g0);
            x(this.g0);
            invalidateSelf();
            if (z != z2) {
                E();
            }
        }
    }

    public final void I(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.h0 != colorStateList) {
            this.h0 = colorStateList;
            if (this.f0 && (drawable = this.g0) != null && this.e0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void J(boolean z) {
        if (this.f0 != z) {
            boolean b0 = b0();
            this.f0 = z;
            boolean b02 = b0();
            if (b0 != b02) {
                Drawable drawable = this.g0;
                if (b02) {
                    x(drawable);
                } else {
                    e0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void K(float f) {
        if (this.O != f) {
            this.O = f;
            setShapeAppearanceModel(j().a(f));
        }
    }

    public final void L(Drawable drawable) {
        Drawable drawable2 = this.U;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float z = z();
            this.U = drawable != null ? drawable.mutate() : null;
            float z2 = z();
            e0(drawable2);
            if (c0()) {
                x(this.U);
            }
            invalidateSelf();
            if (z != z2) {
                E();
            }
        }
    }

    public final void M(float f) {
        if (this.W != f) {
            float z = z();
            this.W = f;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                E();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        this.X = true;
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (c0()) {
                this.U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z) {
        if (this.T != z) {
            boolean c0 = c0();
            this.T = z;
            boolean c02 = c0();
            if (c0 != c02) {
                Drawable drawable = this.U;
                if (c02) {
                    x(drawable);
                } else {
                    e0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            if (this.S0) {
                js jsVar = this.g;
                if (jsVar.d != colorStateList) {
                    jsVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void Q(float f) {
        if (this.Q != f) {
            this.Q = f;
            this.t0.setStrokeWidth(f);
            if (this.S0) {
                this.g.j = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void R(Drawable drawable) {
        Drawable drawable2 = this.Z;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float A = A();
            this.Z = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(d00.b(this.R), this.Z, U0);
            FocusRingDrawable.e(this.s0, rippleDrawable, null);
            this.a0 = rippleDrawable;
            float A2 = A();
            e0(drawable2);
            if (d0()) {
                x(this.Z);
            }
            invalidateSelf();
            if (A != A2) {
                E();
            }
        }
    }

    public final void S(float f) {
        if (this.q0 != f) {
            this.q0 = f;
            invalidateSelf();
            if (d0()) {
                E();
            }
        }
    }

    public final void T(float f) {
        if (this.c0 != f) {
            this.c0 = f;
            invalidateSelf();
            if (d0()) {
                E();
            }
        }
    }

    public final void U(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            invalidateSelf();
            if (d0()) {
                E();
            }
        }
    }

    public final boolean V(int[] iArr) {
        if (Arrays.equals(this.M0, iArr)) {
            return false;
        }
        this.M0 = iArr;
        if (d0()) {
            return F(getState(), iArr);
        }
        return false;
    }

    public final void W(ColorStateList colorStateList) {
        if (this.b0 != colorStateList) {
            this.b0 = colorStateList;
            if (d0()) {
                this.Z.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void X(boolean z) {
        if (this.Y != z) {
            boolean d0 = d0();
            this.Y = z;
            boolean d02 = d0();
            if (d0 != d02) {
                Drawable drawable = this.Z;
                if (d02) {
                    x(drawable);
                } else {
                    e0(drawable);
                }
                invalidateSelf();
                E();
            }
        }
    }

    public final void Y(float f) {
        if (this.m0 != f) {
            float z = z();
            this.m0 = f;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                E();
            }
        }
    }

    public final void Z(float f) {
        if (this.l0 != f) {
            float z = z();
            this.l0 = f;
            float z2 = z();
            invalidateSelf();
            if (z != z2) {
                E();
            }
        }
    }

    @Override // defpackage.r40
    public final void a() {
        E();
        invalidateSelf();
    }

    public final void a0(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            this.N0 = null;
            onStateChange(getState());
        }
    }

    public final boolean b0() {
        return this.f0 && this.g0 != null && this.F0;
    }

    public final boolean c0() {
        return this.T && this.U != null;
    }

    public final boolean d0() {
        return this.Y && this.Z != null;
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        float f2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.H0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.S0;
        Paint paint = this.t0;
        RectF rectF = this.v0;
        if (!z) {
            paint.setColor(this.z0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (!this.S0) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.I0;
            if (colorFilter == null) {
                colorFilter = this.J0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, B(), B(), paint);
        }
        if (this.S0) {
            super.draw(canvas);
        }
        if (this.Q > 0.0f && !this.S0) {
            paint.setColor(this.C0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.S0) {
                ColorFilter colorFilter2 = this.I0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.J0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f3 = bounds.left;
            float f4 = this.Q / 2.0f;
            rectF.set(f3 + f4, bounds.top + f4, bounds.right - f4, bounds.bottom - f4);
            float f5 = this.O - (this.Q / 2.0f);
            canvas2.drawRoundRect(rectF, f5, f5, paint);
        }
        paint.setColor(this.D0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.S0) {
            RectF rectF2 = new RectF(bounds);
            o10 c = this.g.a.c();
            float[] fArr = this.G;
            float f6 = this.g.i;
            is isVar = this.w;
            q10 q10Var = this.x;
            f = 2.0f;
            Path path = this.x0;
            q10Var.a(c, fArr, f6, rectF2, isVar, path);
            f(canvas2, paint, path, this.g.a.c(), this.G, h());
        } else {
            canvas2.drawRoundRect(rectF, B(), B(), paint);
            f = 2.0f;
        }
        if (c0()) {
            y(bounds, rectF);
            float f7 = rectF.left;
            float f8 = rectF.top;
            canvas2.translate(f7, f8);
            this.U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.U.draw(canvas2);
            canvas2.translate(-f7, -f8);
        }
        if (b0()) {
            y(bounds, rectF);
            float f9 = rectF.left;
            float f10 = rectF.top;
            canvas2.translate(f9, f10);
            this.g0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.g0.draw(canvas2);
            canvas2.translate(-f9, -f10);
        }
        if (this.Q0 && this.S != null) {
            PointF pointF = this.w0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.S;
            s40 s40Var = this.y0;
            if (charSequence != null) {
                float z2 = z() + this.k0 + this.n0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + z2;
                } else {
                    pointF.x = bounds.right - z2;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = s40Var.a;
                Paint.FontMetrics fontMetrics = this.u0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.S != null) {
                float z3 = z() + this.k0 + this.n0;
                float A = A() + this.r0 + this.o0;
                int layoutDirection = getLayoutDirection();
                int i4 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i4 + z3;
                    rectF.right = bounds.right - A;
                } else {
                    rectF.left = i4 + A;
                    rectF.right = bounds.right - z3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            p40 p40Var = s40Var.g;
            TextPaint textPaint2 = s40Var.a;
            if (p40Var != null) {
                textPaint2.drawableState = getState();
                s40Var.g.d(this.s0, textPaint2, s40Var.b);
            }
            textPaint2.setTextAlign(align);
            String charSequence2 = this.S.toString();
            if (s40Var.e) {
                s40Var.a(charSequence2);
                f2 = s40Var.c;
            } else {
                f2 = s40Var.c;
            }
            boolean z4 = Math.round(f2) > Math.round(rectF.width());
            if (z4) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence3 = this.S;
            if (z4 && this.P0 != null) {
                charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF.width(), this.P0);
            }
            canvas.drawText(charSequence3, 0, charSequence3.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z4) {
                canvas2.restoreToCount(i3);
            }
        }
        if (d0()) {
            rectF.setEmpty();
            if (d0()) {
                float f11 = this.r0 + this.q0;
                if (getLayoutDirection() == 0) {
                    float f12 = bounds.right - f11;
                    rectF.right = f12;
                    rectF.left = f12 - this.c0;
                } else {
                    float f13 = bounds.left + f11;
                    rectF.left = f13;
                    rectF.right = f13 + this.c0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f14 = this.c0;
                float f15 = exactCenterY - (f14 / f);
                rectF.top = f15;
                rectF.bottom = f15 + f14;
            }
            float f16 = rectF.left;
            float f17 = rectF.top;
            canvas2.translate(f16, f17);
            this.Z.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.a0.setBounds(this.Z.getBounds());
            this.a0.jumpToCurrentState();
            this.a0.draw(canvas2);
            canvas2.translate(-f16, -f17);
        }
        if (this.H0 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.H0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.I0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.N;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float z = z() + this.k0 + this.n0;
        String charSequence = this.S.toString();
        s40 s40Var = this.y0;
        if (s40Var.e) {
            s40Var.a(charSequence);
        }
        return Math.min(Math.round(A() + s40Var.c + z + this.o0 + this.r0), this.R0);
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.S0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.N, this.O);
        } else {
            outline.setRoundRect(bounds, this.O);
            outline2 = outline;
        }
        outline2.setAlpha(this.H0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (C(this.L) || C(this.M) || C(this.P)) {
            return true;
        }
        p40 p40Var = this.y0.g;
        if (p40Var == null || (colorStateList = p40Var.k) == null || !colorStateList.isStateful()) {
            return (this.f0 && this.g0 != null && this.e0) || D(this.U) || D(this.g0) || C(this.K0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (c0()) {
            onLayoutDirectionChanged |= this.U.setLayoutDirection(i);
        }
        if (b0()) {
            onLayoutDirectionChanged |= this.g0.setLayoutDirection(i);
        }
        if (d0()) {
            onLayoutDirectionChanged |= this.Z.setLayoutDirection(i);
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
        if (c0()) {
            onLevelChange |= this.U.setLevel(i);
        }
        if (b0()) {
            onLevelChange |= this.g0.setLevel(i);
        }
        if (d0()) {
            onLevelChange |= this.Z.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable, defpackage.r40
    public final boolean onStateChange(int[] iArr) {
        if (this.S0) {
            super.onStateChange(iArr);
        }
        return F(iArr, this.M0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.H0 != i) {
            this.H0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.I0 != colorFilter) {
            this.I0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.K0 != colorStateList) {
            this.K0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.ls, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.L0 != mode) {
            this.L0 = mode;
            ColorStateList colorStateList = this.K0;
            this.J0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (c0()) {
            visible |= this.U.setVisible(z, z2);
        }
        if (b0()) {
            visible |= this.g0.setVisible(z, z2);
        }
        if (d0()) {
            visible |= this.Z.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.Z) {
            drawable.setTintList(this.b0);
            if (drawable.isStateful()) {
                drawable.setState(this.M0);
                return;
            }
            return;
        }
        Drawable drawable2 = this.U;
        if (drawable == drawable2 && this.X) {
            drawable2.setTintList(this.V);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void y(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (c0() || b0()) {
            float f = this.k0 + this.l0;
            Drawable drawable = this.F0 ? this.g0 : this.U;
            float f2 = this.W;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.F0 ? this.g0 : this.U;
            float f5 = this.W;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.s0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float z() {
        if (!c0() && !b0()) {
            return 0.0f;
        }
        float f = this.l0;
        Drawable drawable = this.F0 ? this.g0 : this.U;
        float f2 = this.W;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.m0;
    }
}
