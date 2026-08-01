package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import defpackage.aa;
import defpackage.ba;
import defpackage.c8;
import defpackage.d00;
import defpackage.es;
import defpackage.f3;
import defpackage.f80;
import defpackage.jx;
import defpackage.l8;
import defpackage.m60;
import defpackage.o10;
import defpackage.oo;
import defpackage.p40;
import defpackage.q40;
import defpackage.s40;
import defpackage.t7;
import defpackage.tt;
import defpackage.vv;
import defpackage.y9;
import defpackage.z10;
import defpackage.z9;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class Chip extends f3 implements z10, Checkable {
    public static final Rect B = new Rect();
    public static final int[] C = {R.attr.state_selected};
    public static final int[] D = {R.attr.state_checkable};
    public final y9 A;
    public ba j;
    public InsetDrawable k;
    public RippleDrawable l;
    public View.OnClickListener m;
    public CompoundButton.OnCheckedChangeListener n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public CharSequence v;
    public final aa w;
    public boolean x;
    public final Rect y;
    public final RectF z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.ionia.reidopitaco.libya.R.attr.chipStyle);
        int resourceId;
        this.y = new Rect();
        this.z = new RectF();
        this.A = new y9(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                l8.x("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                l8.x("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                l8.x("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                l8.x("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                l8.x("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        ba baVar = new ba(context2, attributeSet);
        Context context3 = baVar.s0;
        int[] iArr = jx.e;
        TypedArray J = m60.J(context3, attributeSet, iArr, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        baVar.S0 = J.hasValue(39);
        Context context4 = baVar.s0;
        ColorStateList o = oo.o(context4, J, 25);
        if (baVar.L != o) {
            baVar.L = o;
            baVar.onStateChange(baVar.getState());
        }
        ColorStateList o2 = oo.o(context4, J, 12);
        if (baVar.M != o2) {
            baVar.M = o2;
            baVar.onStateChange(baVar.getState());
        }
        float dimension = J.getDimension(20, 0.0f);
        if (baVar.N != dimension) {
            baVar.N = dimension;
            baVar.invalidateSelf();
            baVar.E();
        }
        if (J.hasValue(13)) {
            baVar.K(J.getDimension(13, 0.0f));
        }
        baVar.P(oo.o(context4, J, 23));
        baVar.Q(J.getDimension(24, 0.0f));
        baVar.a0(oo.o(context4, J, 38));
        String text = J.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(baVar.S, text);
        s40 s40Var = baVar.y0;
        if (!equals) {
            baVar.S = text;
            s40Var.e = true;
            baVar.invalidateSelf();
            baVar.E();
        }
        p40 p40Var = (!J.hasValue(0) || (resourceId = J.getResourceId(0, 0)) == 0) ? null : new p40(context4, resourceId);
        p40Var.l = J.getDimension(1, p40Var.l);
        int i = J.hasValue(34) ? 34 : 7;
        if (J.hasValue(i)) {
            p40Var.c = J.getString(i);
        }
        s40Var.b(p40Var, context4);
        int i2 = J.getInt(3, 0);
        if (i2 == 1) {
            baVar.P0 = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            baVar.P0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            baVar.P0 = TextUtils.TruncateAt.END;
        }
        baVar.O(J.getBoolean(19, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            baVar.O(J.getBoolean(16, false));
        }
        baVar.L(oo.p(context4, J, 15));
        if (J.hasValue(18)) {
            baVar.N(oo.o(context4, J, 18));
        }
        baVar.M(J.getDimension(17, -1.0f));
        baVar.X(J.getBoolean(32, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            baVar.X(J.getBoolean(27, false));
        }
        baVar.R(oo.p(context4, J, 26));
        baVar.W(oo.o(context4, J, 31));
        baVar.T(J.getDimension(29, 0.0f));
        baVar.G(J.getBoolean(6, false));
        baVar.J(J.getBoolean(11, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            baVar.J(J.getBoolean(9, false));
        }
        baVar.H(oo.p(context4, J, 8));
        if (J.hasValue(10)) {
            baVar.I(oo.o(context4, J, 10));
        }
        baVar.i0 = tt.a(context4, J, 41);
        baVar.j0 = tt.a(context4, J, 35);
        float dimension2 = J.getDimension(22, 0.0f);
        if (baVar.k0 != dimension2) {
            baVar.k0 = dimension2;
            baVar.invalidateSelf();
            baVar.E();
        }
        baVar.Z(J.getDimension(37, 0.0f));
        baVar.Y(J.getDimension(36, 0.0f));
        float dimension3 = J.getDimension(43, 0.0f);
        if (baVar.n0 != dimension3) {
            baVar.n0 = dimension3;
            baVar.invalidateSelf();
            baVar.E();
        }
        float dimension4 = J.getDimension(42, 0.0f);
        if (baVar.o0 != dimension4) {
            baVar.o0 = dimension4;
            baVar.invalidateSelf();
            baVar.E();
        }
        baVar.U(J.getDimension(30, 0.0f));
        baVar.S(J.getDimension(28, 0.0f));
        float dimension5 = J.getDimension(14, 0.0f);
        if (baVar.r0 != dimension5) {
            baVar.r0 = dimension5;
            baVar.invalidateSelf();
            baVar.E();
        }
        baVar.R0 = J.getDimensionPixelSize(4, Integer.MAX_VALUE);
        J.recycle();
        m60.i(context2, attributeSet, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action);
        m60.k(context2, attributeSet, iArr, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action);
        this.s = obtainStyledAttributes.getBoolean(33, false);
        Resources.Theme theme = context2.getTheme();
        TypedValue R = m60.R(theme, com.ionia.reidopitaco.libya.R.attr.minTouchTargetSize);
        this.u = (int) Math.ceil(obtainStyledAttributes.getDimension(21, (int) (Float.isNaN((R == null || R.type != 5) ? Float.NaN : R.getDimension(theme.getResources().getDisplayMetrics())) ? context2.getResources().getDimension(com.ionia.reidopitaco.libya.R.dimen.mtrl_min_touch_target_size) : r6)));
        obtainStyledAttributes.recycle();
        setChipDrawable(baVar);
        baVar.q(getElevation());
        m60.i(context2, attributeSet, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action);
        m60.k(context2, attributeSet, iArr, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.ionia.reidopitaco.libya.R.attr.chipStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(39);
        obtainStyledAttributes2.recycle();
        this.w = new aa(this, this);
        d();
        if (!hasValue) {
            setOutlineProvider(new z9(this));
        }
        setChecked(this.o);
        setText(baVar.S);
        setEllipsize(baVar.P0);
        g();
        if (!this.j.Q0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.s) {
            setMinHeight(this.u);
        }
        this.t = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x9
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = Chip.this.n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.z;
        rectF.setEmpty();
        if (c() && this.m != null) {
            ba baVar = this.j;
            Rect bounds = baVar.getBounds();
            rectF.setEmpty();
            if (baVar.d0()) {
                float f = baVar.r0 + baVar.q0 + baVar.c0 + baVar.p0 + baVar.o0;
                if (baVar.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.y;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private p40 getTextAppearance() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.y0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.q != z) {
            this.q = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.p != z) {
            this.p = z;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.u = i;
        if (!this.s) {
            InsetDrawable insetDrawable = this.k;
            if (insetDrawable == null) {
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.j.N));
        int max2 = Math.max(0, i - this.j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.k;
            if (insetDrawable2 == null) {
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.k != null) {
            Rect rect = new Rect();
            this.k.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.k = new InsetDrawable((Drawable) this.j, i2, i3, i2, i3);
        e();
    }

    public final boolean c() {
        ba baVar = this.j;
        if (baVar == null) {
            return false;
        }
        Drawable drawable = baVar.Z;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    public final void d() {
        ba baVar;
        if (!c() || (baVar = this.j) == null || !baVar.Y || this.m == null) {
            f80.m(this, null);
            this.x = false;
        } else {
            f80.m(this, this.w);
            this.x = true;
        }
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        aa aaVar = this.w;
        AccessibilityManager accessibilityManager = aaVar.h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = aaVar.n;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = aaVar.m;
                if (i3 != i2) {
                    aaVar.m = i2;
                    aaVar.q(i2, 128);
                    aaVar.q(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = aaVar.m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    aaVar.m = Integer.MIN_VALUE;
                    aaVar.q(Integer.MIN_VALUE, 128);
                    aaVar.q(i, 256);
                    return true;
                }
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        aa aaVar = this.w;
        aaVar.getClass();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && aaVar.m(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = aaVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = aaVar.n;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.x) {
                                chip.w.q(1, 1);
                            }
                        }
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = aaVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = aaVar.m(1, null);
            }
        }
        if (!z || aaVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.f3, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ba baVar = this.j;
        boolean z = false;
        int i = 0;
        z = false;
        if (baVar != null && ba.D(baVar.Z)) {
            ba baVar2 = this.j;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.r) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.q) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.p) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.r) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.q) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.p) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = baVar2.V(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        RippleDrawable rippleDrawable = new RippleDrawable(d00.b(this.j.R), getBackgroundDrawable(), null);
        FocusRingDrawable.e(getContext(), rippleDrawable, this.j);
        this.l = rippleDrawable;
        this.j.getClass();
        setBackground(this.l);
        f();
    }

    public final void f() {
        ba baVar;
        if (TextUtils.isEmpty(getText()) || (baVar = this.j) == null) {
            return;
        }
        int A = (int) (baVar.A() + baVar.r0 + baVar.o0);
        ba baVar2 = this.j;
        int z = (int) (baVar2.z() + baVar2.k0 + baVar2.n0);
        if (this.k != null) {
            Rect rect = new Rect();
            this.k.getPadding(rect);
            z += rect.left;
            A += rect.right;
        }
        setPaddingRelative(z, getPaddingTop(), A, getPaddingBottom());
    }

    public final void g() {
        TextPaint paint = getPaint();
        ba baVar = this.j;
        if (baVar != null) {
            paint.drawableState = baVar.getState();
        }
        p40 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.A);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.v)) {
            return this.v;
        }
        ba baVar = this.j;
        if (baVar == null || !baVar.e0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.k;
        return insetDrawable == null ? this.j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.g0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.h0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.M;
        }
        return null;
    }

    public float getChipCornerRadius() {
        ba baVar = this.j;
        if (baVar != null) {
            return Math.max(0.0f, baVar.B());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.j;
    }

    public float getChipEndPadding() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.r0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        ba baVar = this.j;
        if (baVar == null || (drawable = baVar.U) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.W;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.V;
        }
        return null;
    }

    public float getChipMinHeight() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.N;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.k0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.P;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.Q;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        ba baVar = this.j;
        if (baVar == null || (drawable = baVar.Z) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.d0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.q0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.c0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.p0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.b0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.P0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.x) {
            aa aaVar = this.w;
            if (aaVar.l == 1 || aaVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.widget.TextView
    public String getFontVariationSettings() {
        ba baVar = this.j;
        if (baVar == null) {
            return super.getFontVariationSettings();
        }
        p40 p40Var = baVar.y0.g;
        if (p40Var != null) {
            return p40Var.c;
        }
        return null;
    }

    public tt getHideMotionSpec() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.j0;
        }
        return null;
    }

    public float getIconEndPadding() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.m0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.l0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.R;
        }
        return null;
    }

    public o10 getShapeAppearanceModel() {
        return this.j.j();
    }

    public tt getShowMotionSpec() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.i0;
        }
        return null;
    }

    public float getTextEndPadding() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.o0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        ba baVar = this.j;
        if (baVar != null) {
            return baVar.n0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vv.S(this, this.j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, C);
        }
        ba baVar = this.j;
        if (baVar != null && baVar.e0) {
            View.mergeDrawableStates(onCreateDrawableState, D);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.x) {
            aa aaVar = this.w;
            int i2 = aaVar.l;
            if (i2 != Integer.MIN_VALUE) {
                aaVar.j(i2);
            }
            if (z) {
                aaVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        ba baVar = this.j;
        accessibilityNodeInfo.setCheckable(baVar != null && baVar.e0);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.t != i) {
            this.t = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.p) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.p) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.m;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.x) {
                    this.w.q(1, 1);
                }
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.f3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.f3, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.G(z);
        }
    }

    public void setCheckableResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.G(baVar.s0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        ba baVar = this.j;
        if (baVar == null) {
            this.o = z;
        } else if (baVar.e0) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.H(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.H(vv.t(baVar.s0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.I(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.I(vv.r(baVar.s0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.J(baVar.s0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        ba baVar = this.j;
        if (baVar == null || baVar.M == colorStateList) {
            return;
        }
        baVar.M = colorStateList;
        baVar.onStateChange(baVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList r;
        ba baVar = this.j;
        if (baVar == null || baVar.M == (r = vv.r(baVar.s0, i))) {
            return;
        }
        baVar.M = r;
        baVar.onStateChange(baVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.K(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.K(baVar.s0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(ba baVar) {
        ba baVar2 = this.j;
        if (baVar2 != baVar) {
            if (baVar2 != null) {
                baVar2.O0 = new WeakReference(null);
            }
            this.j = baVar;
            baVar.Q0 = false;
            baVar.O0 = new WeakReference(this);
            b(this.u);
        }
    }

    public void setChipEndPadding(float f) {
        ba baVar = this.j;
        if (baVar == null || baVar.r0 == f) {
            return;
        }
        baVar.r0 = f;
        baVar.invalidateSelf();
        baVar.E();
    }

    public void setChipEndPaddingResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            float dimension = baVar.s0.getResources().getDimension(i);
            if (baVar.r0 != dimension) {
                baVar.r0 = dimension;
                baVar.invalidateSelf();
                baVar.E();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.L(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.L(vv.t(baVar.s0, i));
        }
    }

    public void setChipIconSize(float f) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.M(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.M(baVar.s0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.N(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.N(vv.r(baVar.s0, i));
        }
    }

    public void setChipIconVisible(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.O(baVar.s0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        ba baVar = this.j;
        if (baVar == null || baVar.N == f) {
            return;
        }
        baVar.N = f;
        baVar.invalidateSelf();
        baVar.E();
    }

    public void setChipMinHeightResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            float dimension = baVar.s0.getResources().getDimension(i);
            if (baVar.N != dimension) {
                baVar.N = dimension;
                baVar.invalidateSelf();
                baVar.E();
            }
        }
    }

    public void setChipStartPadding(float f) {
        ba baVar = this.j;
        if (baVar == null || baVar.k0 == f) {
            return;
        }
        baVar.k0 = f;
        baVar.invalidateSelf();
        baVar.E();
    }

    public void setChipStartPaddingResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            float dimension = baVar.s0.getResources().getDimension(i);
            if (baVar.k0 != dimension) {
                baVar.k0 = dimension;
                baVar.invalidateSelf();
                baVar.E();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.P(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.P(vv.r(baVar.s0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.Q(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.Q(baVar.s0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.R(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        ba baVar = this.j;
        if (baVar == null || baVar.d0 == charSequence) {
            return;
        }
        String str = t7.b;
        t7 t7Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? t7.e : t7.d;
        t7Var.getClass();
        c8 c8Var = q40.a;
        baVar.d0 = t7Var.c(charSequence);
        baVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.S(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.S(baVar.s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.R(vv.t(baVar.s0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.T(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.T(baVar.s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.U(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.U(baVar.s0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.W(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.W(vv.r(baVar.s0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.f3, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            l8.x("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            l8.x("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.f3, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            l8.x("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            l8.x("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            l8.x("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            l8.x("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            l8.x("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            l8.x("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ba baVar = this.j;
        if (baVar != null) {
            baVar.q(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            l8.x("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        ba baVar = this.j;
        if (baVar != null) {
            baVar.P0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.s = z;
        b(this.u);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        super.setFontVariationSettings(str);
        ba baVar = this.j;
        if (baVar == null) {
            return false;
        }
        p40 p40Var = baVar.y0.g;
        if (p40Var != null) {
            p40Var.c = str;
        }
        g();
        return true;
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(tt ttVar) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.j0 = ttVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.j0 = tt.b(baVar.s0, i);
        }
    }

    public void setIconEndPadding(float f) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.Y(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.Y(baVar.s0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.Z(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.Z(baVar.s0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.j == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            l8.x("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            l8.x("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ba baVar = this.j;
        if (baVar != null) {
            baVar.R0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            l8.x("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.m = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.a0(colorStateList);
        }
        this.j.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.a0(vv.r(baVar.s0, i));
            this.j.getClass();
            e();
        }
    }

    @Override // defpackage.z10
    public void setShapeAppearanceModel(o10 o10Var) {
        this.j.setShapeAppearanceModel(o10Var);
    }

    public void setShowMotionSpec(tt ttVar) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.i0 = ttVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.i0 = tt.b(baVar.s0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            l8.x("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        ba baVar = this.j;
        if (baVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(baVar.Q0 ? null : charSequence, bufferType);
        ba baVar2 = this.j;
        if (baVar2 == null || TextUtils.equals(baVar2.S, charSequence)) {
            return;
        }
        baVar2.S = charSequence;
        baVar2.y0.e = true;
        baVar2.invalidateSelf();
        baVar2.E();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ba baVar = this.j;
        if (baVar != null) {
            Context context2 = baVar.s0;
            baVar.y0.b(new p40(context2, i), context2);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        ba baVar = this.j;
        if (baVar == null || baVar.o0 == f) {
            return;
        }
        baVar.o0 = f;
        baVar.invalidateSelf();
        baVar.E();
    }

    public void setTextEndPaddingResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            float dimension = baVar.s0.getResources().getDimension(i);
            if (baVar.o0 != dimension) {
                baVar.o0 = dimension;
                baVar.invalidateSelf();
                baVar.E();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ba baVar = this.j;
        if (baVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            s40 s40Var = baVar.y0;
            p40 p40Var = s40Var.g;
            if (p40Var != null) {
                p40Var.l = applyDimension;
                s40Var.a.setTextSize(applyDimension);
                baVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        ba baVar = this.j;
        if (baVar == null || baVar.n0 == f) {
            return;
        }
        baVar.n0 = f;
        baVar.invalidateSelf();
        baVar.E();
    }

    public void setTextStartPaddingResource(int i) {
        ba baVar = this.j;
        if (baVar != null) {
            float dimension = baVar.s0.getResources().getDimension(i);
            if (baVar.n0 != dimension) {
                baVar.n0 = dimension;
                baVar.invalidateSelf();
                baVar.E();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.X(z);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.J(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.O(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            l8.x("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            l8.x("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            l8.x("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            l8.x("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(p40 p40Var) {
        ba baVar = this.j;
        if (baVar != null) {
            baVar.y0.b(p40Var, baVar.s0);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ba baVar = this.j;
        if (baVar != null) {
            Context context = baVar.s0;
            baVar.y0.b(new p40(context, i), context);
        }
        g();
    }

    public void setInternalOnCheckedChangeListener(es esVar) {
    }
}
