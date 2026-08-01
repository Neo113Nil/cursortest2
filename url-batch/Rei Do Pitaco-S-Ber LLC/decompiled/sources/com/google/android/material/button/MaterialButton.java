package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.d00;
import defpackage.d3;
import defpackage.g90;
import defpackage.h;
import defpackage.h30;
import defpackage.i30;
import defpackage.j0;
import defpackage.j30;
import defpackage.jx;
import defpackage.kr;
import defpackage.l3;
import defpackage.l8;
import defpackage.lr;
import defpackage.ls;
import defpackage.m10;
import defpackage.m60;
import defpackage.mr;
import defpackage.nr;
import defpackage.o10;
import defpackage.oo;
import defpackage.or;
import defpackage.p1;
import defpackage.pr;
import defpackage.sr;
import defpackage.tr;
import defpackage.v20;
import defpackage.vv;
import defpackage.w20;
import defpackage.z10;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class MaterialButton extends d3 implements Checkable, z10 {
    public static final int[] S = {R.attr.state_checkable};
    public static final int[] T = {R.attr.state_checked};
    public static final mr U = new mr();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public int F;
    public int G;
    public LinearLayout.LayoutParams H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public j30 M;
    public int N;
    public pr O;
    public float P;
    public float Q;
    public v20 R;
    public final tr i;
    public final LinkedHashSet j;
    public nr k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public Drawable n;
    public PorterDuff.Mode o;
    public ColorStateList p;
    public Drawable q;
    public boolean r;
    public String s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(oo.Q(com.ionia.reidopitaco.libya.R.attr.materialButtonStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.ionia.reidopitaco.libya.R.attr.materialSizeOverlay}), attributeSet, com.ionia.reidopitaco.libya.R.attr.materialButtonStyle);
        this.j = new LinkedHashSet();
        this.z = false;
        this.A = false;
        this.D = Integer.MIN_VALUE;
        this.E = -2.1474836E9f;
        this.F = Integer.MIN_VALUE;
        this.G = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.O = pr.i;
        Context context2 = getContext();
        TypedArray J = m60.J(context2, attributeSet, jx.n, com.ionia.reidopitaco.libya.R.attr.materialButtonStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.w = J.getDimensionPixelSize(13, 0);
        int i = J.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.l = g90.b(i, mode);
        this.m = oo.o(getContext(), J, 15);
        this.n = oo.p(getContext(), J, 11);
        this.B = J.getInteger(12, 1);
        this.t = J.getDimensionPixelSize(14, 0);
        this.o = g90.b(J.getInt(22, -1), mode);
        this.p = J.hasValue(21) ? oo.o(getContext(), J, 21) : this.m;
        this.C = J.getInteger(20, 3);
        Drawable p = oo.p(getContext(), J, 19);
        this.q = p;
        this.r = p == null;
        m10 g = h30.g(context2, J, 23);
        g = g == null ? o10.g(context2, attributeSet, com.ionia.reidopitaco.libya.R.attr.materialButtonStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_Button).a() : g;
        boolean z = J.getBoolean(17, false);
        tr trVar = new tr(this, g);
        this.i = trVar;
        trVar.e = J.getDimensionPixelOffset(2, 0);
        trVar.f = J.getDimensionPixelOffset(3, 0);
        trVar.g = J.getDimensionPixelOffset(4, 0);
        trVar.h = J.getDimensionPixelOffset(5, 0);
        if (J.hasValue(9)) {
            int dimensionPixelSize = J.getDimensionPixelSize(9, -1);
            trVar.i = dimensionPixelSize;
            trVar.b = trVar.b.a(dimensionPixelSize);
            trVar.d();
            trVar.r = true;
        }
        trVar.j = J.getDimensionPixelSize(26, 0);
        trVar.k = g90.b(J.getInt(8, -1), mode);
        trVar.l = oo.o(getContext(), J, 7);
        trVar.m = oo.o(getContext(), J, 25);
        trVar.n = oo.o(getContext(), J, 18);
        trVar.s = J.getBoolean(6, false);
        trVar.v = J.getDimensionPixelSize(10, 0);
        trVar.t = J.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (J.hasValue(0)) {
            trVar.q = true;
            setSupportBackgroundTintList(trVar.l);
            setSupportBackgroundTintMode(trVar.k);
        } else {
            trVar.c();
        }
        setPaddingRelative(paddingStart + trVar.e, paddingTop + trVar.g, paddingEnd + trVar.f, paddingBottom + trVar.h);
        setCheckedInternal(J.getBoolean(1, false));
        if (g instanceof h30) {
            trVar.c = f();
            if (trVar.b instanceof h30) {
                trVar.d();
            }
        }
        setOpticalCenterEnabled(z);
        J.recycle();
        setCompoundDrawablePadding(this.w);
        u(this.n != null);
        x(this.q != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.J = materialButton.getOpticalCenterShift();
        materialButton.w();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.P;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        ls a;
        if (this.I && this.K && (a = this.i.a(false)) != null) {
            return (int) (a.i() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        if (!k() || this.z == z) {
            return;
        }
        this.z = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.z;
            if (!materialButtonToggleGroup.s) {
                materialButtonToggleGroup.l(getId(), z2);
            }
        }
        if (this.A) {
            return;
        }
        this.A = true;
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            this.A = false;
        } else {
            it.next().getClass();
            l8.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.P != f) {
            this.P = f;
            w();
            invalidate();
            if (getParent() instanceof sr) {
                sr srVar = (sr) getParent();
                int i = (int) this.P;
                int indexOfChild = srVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                MaterialButton h = srVar.h(indexOfChild);
                MaterialButton g = srVar.g(indexOfChild);
                if (h == null && g == null) {
                    return;
                }
                if (h == null) {
                    g.setDisplayedWidthDecrease(i);
                }
                if (g == null) {
                    h.setDisplayedWidthDecrease(i);
                }
                if (h == null || g == null) {
                    return;
                }
                h.setDisplayedWidthDecrease(i / 2);
                g.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final boolean d() {
        if (m() && p()) {
            return true;
        }
        if (l() && o()) {
            return true;
        }
        return n() && q();
    }

    public final boolean e(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final w20 f() {
        Context context = getContext();
        TypedValue R = m60.R(context.getTheme(), com.ionia.reidopitaco.libya.R.attr.motionSpringFastSpatial);
        int[] iArr = jx.x;
        TypedArray obtainStyledAttributes = R == null ? context.obtainStyledAttributes(null, iArr, 0, com.ionia.reidopitaco.libya.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(R.resourceId, iArr);
        w20 w20Var = new w20();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            w20Var.a = Math.sqrt(f);
            w20Var.c = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            w20Var.b = f2;
            w20Var.c = false;
            obtainStyledAttributes.recycle();
            return w20Var;
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int g(int i, int i2) {
        int i3;
        int i4;
        Drawable drawable = this.n;
        if (drawable != null) {
            i3 = this.t;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
        } else {
            i3 = 0;
        }
        Drawable drawable2 = this.q;
        if (drawable2 != null) {
            i4 = this.t;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
        } else {
            i4 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - i3) - i4) - this.w) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.s)) {
            return (k() ? CompoundButton.class : Button.class).getName();
        }
        return this.s;
    }

    public int getAllowedWidthDecrease() {
        return this.L;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (r()) {
            return this.i.i;
        }
        return 0;
    }

    public w20 getCornerSpringForce() {
        return this.i.c;
    }

    public Drawable getIcon() {
        return this.n;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.w;
    }

    public int getIconSize() {
        return this.t;
    }

    public ColorStateList getIconTint() {
        return this.m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.l;
    }

    public int getInsetBottom() {
        return this.i.h;
    }

    public int getInsetLeft() {
        return this.i.e;
    }

    public int getInsetRight() {
        return this.i.f;
    }

    public int getInsetTop() {
        return this.i.g;
    }

    public ColorStateList getRippleColor() {
        if (r()) {
            return this.i.n;
        }
        return null;
    }

    public Drawable getSecondaryIcon() {
        return this.q;
    }

    public int getSecondaryIconGravity() {
        return this.C;
    }

    public ColorStateList getSecondaryIconTint() {
        return this.p;
    }

    public PorterDuff.Mode getSecondaryIconTintMode() {
        return this.o;
    }

    public m10 getShapeAppearance() {
        if (r()) {
            return this.i.b;
        }
        l8.u("Attempted to get ShapeAppearance from a MaterialButton which has an overwritten background.");
        return null;
    }

    public o10 getShapeAppearanceModel() {
        if (r()) {
            return this.i.b.c();
        }
        l8.u("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (r()) {
            return this.i.m;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (r()) {
            return this.i.j;
        }
        return 0;
    }

    @Override // defpackage.d3
    public ColorStateList getSupportBackgroundTintList() {
        return r() ? this.i.l : super.getSupportBackgroundTintList();
    }

    @Override // defpackage.d3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return r() ? this.i.k : super.getSupportBackgroundTintMode();
    }

    public final int h(int i, int i2) {
        return Math.max(0, (((((i - getTextHeight()) - getPaddingTop()) - i2) - this.w) - getPaddingBottom()) / 2);
    }

    public final Drawable i(int i) {
        if (i == 0) {
            if (this.q == null || !p()) {
                return null;
            }
            return this.q;
        }
        if (i == 1) {
            if (this.q == null || !q()) {
                return null;
            }
            return this.q;
        }
        if (i == 2 && this.q != null && o()) {
            return this.q;
        }
        return null;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.z;
    }

    public final Drawable j(int i) {
        if (i == 0) {
            if (this.n == null || !m()) {
                return null;
            }
            return this.n;
        }
        if (i == 1) {
            if (this.n == null || !l()) {
                return null;
            }
            return this.n;
        }
        if (i == 2 && this.n != null && l()) {
            return this.n;
        }
        return null;
    }

    public final boolean k() {
        tr trVar = this.i;
        return trVar != null && trVar.s;
    }

    public final boolean l() {
        int i = this.B;
        return i == 3 || i == 4;
    }

    public final boolean m() {
        int i = this.B;
        return i == 1 || i == 2;
    }

    public final boolean n() {
        int i = this.B;
        return i == 16 || i == 32;
    }

    public final boolean o() {
        int i = this.C;
        return i == 3 || i == 4;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            vv.S(this, this.i.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (k()) {
            View.mergeDrawableStates(onCreateDrawableState, S);
        }
        if (this.z) {
            View.mergeDrawableStates(onCreateDrawableState, T);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.d3, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.z);
    }

    @Override // defpackage.d3, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setChecked(this.z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // defpackage.d3, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.D != i6) {
            this.D = i6;
            this.E = -2.1474836E9f;
        }
        if (this.E == -2.1474836E9f) {
            this.E = getMeasuredWidth();
            if (this.H == null && (getParent() instanceof sr) && ((sr) getParent()).getButtonSizeChange() != null) {
                this.H = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.H);
                layoutParams.width = (int) this.E;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.L == Integer.MIN_VALUE) {
            if (this.n == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.t;
                if (i7 == 0) {
                    i7 = this.n.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.L = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.F == Integer.MIN_VALUE) {
            this.F = getPaddingStart();
        }
        if (this.G == Integer.MIN_VALUE) {
            this.G = getPaddingEnd();
        }
        if ((getParent() instanceof sr) && ((sr) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.K = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof or)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        or orVar = (or) parcelable;
        super.onRestoreInstanceState(orVar.f);
        setChecked(orVar.h);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        or orVar = new or(super.onSaveInstanceState());
        orVar.h = this.z;
        return orVar;
    }

    @Override // defpackage.d3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean p() {
        int i = this.C;
        return i == 1 || i == 2;
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.i.t) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean performClick = super.performClick();
        if (z && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    public final boolean q() {
        int i = this.C;
        return i == 16 || i == 32;
    }

    public final boolean r() {
        tr trVar = this.i;
        return (trVar == null || trVar.q) ? false : true;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.n != null) {
            if (this.n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0084, code lost:
    
        if (r4 == 2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z) {
        int i;
        if (this.M == null) {
            return;
        }
        if (this.R == null) {
            v20 v20Var = new v20(this, U);
            this.R = v20Var;
            v20Var.j = f();
        }
        if (this.K) {
            int ordinal = this.O.ordinal();
            int i2 = 0;
            int i3 = (ordinal == 1 || ordinal == 2) ? this.N / 2 : ordinal != 3 ? 0 : this.N;
            j30 j30Var = this.M;
            int[] drawableState = getDrawableState();
            int[][] iArr = j30Var.c;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= j30Var.a) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = j30Var.c;
                int i5 = 0;
                while (true) {
                    if (i5 >= j30Var.a) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                i4 = i;
            }
            i30 i30Var = (i30) (i4 < 0 ? j30Var.b : j30Var.d[i4]).f;
            int width = getWidth();
            float f = i30Var.b;
            int i6 = i30Var.a;
            if (i6 == 1) {
                f *= width;
            }
            i2 = (int) f;
            this.R.a(Math.min(i3, i2));
            if (z) {
                this.R.d();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.s = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!r()) {
            super.setBackgroundColor(i);
            return;
        }
        tr trVar = this.i;
        if (trVar.a(false) != null) {
            trVar.a(false).setTint(i);
        }
    }

    @Override // defpackage.d3, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!r()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        tr trVar = this.i;
        trVar.q = true;
        MaterialButton materialButton = trVar.a;
        materialButton.setSupportBackgroundTintList(trVar.l);
        materialButton.setSupportBackgroundTintMode(trVar.k);
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.d3, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? vv.t(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (r()) {
            this.i.s = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.E = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (r()) {
            tr trVar = this.i;
            if (trVar.r && trVar.i == i) {
                return;
            }
            trVar.i = i;
            trVar.r = true;
            trVar.b = trVar.b.a(i);
            trVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (r()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(w20 w20Var) {
        tr trVar = this.i;
        trVar.c = w20Var;
        if (trVar.b instanceof h30) {
            trVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.Q = Math.min(i, this.L);
        w();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (r()) {
            this.i.a(false).q(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.n == drawable || t(new kr(this, drawable, 1))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.n = drawable;
        u(true);
        v(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.B != i) {
            if (this.n != null && this.q != null && d()) {
                l8.l("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.B = i;
                v(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.w != i) {
            this.w = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? vv.t(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            l8.l("iconSize cannot be less than 0");
            return;
        }
        if (this.t == i || t(new lr(i, 0, this))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.t = i;
        u(true);
        x(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            u(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.l != mode) {
            this.l = mode;
            u(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(vv.r(getContext(), i));
    }

    public void setInsetBottom(int i) {
        tr trVar = this.i;
        trVar.b(trVar.e, trVar.g, trVar.f, i);
    }

    public void setInsetLeft(int i) {
        tr trVar = this.i;
        trVar.b(i, trVar.g, trVar.f, trVar.h);
    }

    public void setInsetRight(int i) {
        tr trVar = this.i;
        trVar.b(trVar.e, trVar.g, i, trVar.h);
    }

    public void setInsetTop(int i) {
        tr trVar = this.i;
        trVar.b(trVar.e, i, trVar.f, trVar.h);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(nr nrVar) {
        this.k = nrVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.I != z) {
            this.I = z;
            tr trVar = this.i;
            if (z) {
                h hVar = new h(3, this);
                trVar.d = hVar;
                ls a = trVar.a(false);
                if (a != null) {
                    a.I = hVar;
                }
            } else {
                trVar.d = null;
                ls a2 = trVar.a(false);
                if (a2 != null) {
                    a2.I = null;
                }
            }
            post(new p1(10, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        nr nrVar = this.k;
        if (nrVar != null) {
            ((MaterialButtonToggleGroup) ((j0) nrVar).g).invalidate();
        }
        super.setPressed(z);
        s(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (r()) {
            tr trVar = this.i;
            MaterialButton materialButton = trVar.a;
            if (trVar.n != colorStateList) {
                trVar.n = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(d00.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (r()) {
            setRippleColor(vv.r(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.q == drawable || t(new kr(this, drawable, 0))) {
            return;
        }
        this.E = -2.1474836E9f;
        this.q = drawable;
        this.r = false;
        x(true);
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.C != i) {
            if (this.q != null && this.n != null && d()) {
                l8.l("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.C = i;
                y(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? vv.t(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.p != colorStateList) {
            this.p = colorStateList;
            x(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.o != mode) {
            this.o = mode;
            x(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(vv.r(getContext(), i));
    }

    public void setShapeAppearance(m10 m10Var) {
        if (!r()) {
            l8.u("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        tr trVar = this.i;
        if (trVar.c == null && m10Var.e()) {
            trVar.c = f();
            if (trVar.b instanceof h30) {
                trVar.d();
            }
        }
        trVar.b = m10Var;
        trVar.d();
    }

    @Override // defpackage.z10
    public void setShapeAppearanceModel(o10 o10Var) {
        if (!r()) {
            l8.u("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        tr trVar = this.i;
        trVar.b = o10Var;
        trVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (r()) {
            tr trVar = this.i;
            trVar.p = z;
            trVar.e();
        }
    }

    public void setSizeChange(j30 j30Var) {
        if (this.M != j30Var) {
            this.M = j30Var;
            s(true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (r()) {
            tr trVar = this.i;
            if (trVar.m != colorStateList) {
                trVar.m = colorStateList;
                trVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (r()) {
            setStrokeColor(vv.r(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (r()) {
            tr trVar = this.i;
            if (trVar.j != i) {
                trVar.j = i;
                trVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (r()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // defpackage.d3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!r()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        tr trVar = this.i;
        if (trVar.l != colorStateList) {
            trVar.l = colorStateList;
            if (trVar.a(false) != null) {
                trVar.a(false).setTintList(trVar.l);
            }
        }
    }

    @Override // defpackage.d3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!r()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        tr trVar = this.i;
        if (trVar.k != mode) {
            trVar.k = mode;
            if (trVar.a(false) == null || trVar.k == null) {
                return;
            }
            trVar.a(false).setTintMode(trVar.k);
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.E = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        v(getMeasuredWidth(), getMeasuredHeight());
        y(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // defpackage.d3, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        this.E = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // defpackage.d3, android.widget.TextView
    public final void setTextSize(int i, float f) {
        this.E = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.i.t = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.E = -2.1474836E9f;
        super.setWidth(i);
    }

    public void setWidthChangeDirection(pr prVar) {
        if (this.O != prVar) {
            this.O = prVar;
            s(true);
        }
    }

    public void setWidthChangeMax(int i) {
        if (this.N != i) {
            this.N = i;
            s(true);
        }
    }

    public final boolean t(Runnable runnable) {
        v20 v20Var = this.R;
        if (v20Var == null || !v20Var.e) {
            return false;
        }
        post(new l3(this, runnable, 2));
        return true;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.z);
    }

    public final void u(boolean z) {
        Drawable drawable = this.n;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.n = mutate;
            mutate.setTintList(this.m);
            PorterDuff.Mode mode = this.l;
            if (mode != null) {
                this.n.setTintMode(mode);
            }
            int i = this.t;
            if (i == 0) {
                i = this.n.getIntrinsicWidth();
            }
            int i2 = this.t;
            if (i2 == 0) {
                i2 = this.n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.n;
            int i3 = this.u;
            int i4 = this.v;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.n.setVisible(true, z);
        }
        if (this.n != null && this.q != null && d()) {
            l8.l("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.n == null && this.q != null && d()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (m() && compoundDrawablesRelative[0] != this.n) || (l() && compoundDrawablesRelative[2] != this.n) || (n() && compoundDrawablesRelative[1] != this.n);
        if (z || z2) {
            if (m()) {
                setCompoundDrawablesRelative(this.n, i(1), i(2), null);
            } else if (l()) {
                setCompoundDrawablesRelative(i(0), i(1), this.n, null);
            } else if (n()) {
                setCompoundDrawablesRelative(i(0), this.n, i(2), null);
            }
        }
    }

    public final void v(int i, int i2) {
        if (this.n == null || getLayout() == null) {
            return;
        }
        if (m() || l()) {
            this.v = 0;
            if (e(this.B)) {
                this.u = 0;
                u(false);
                return;
            }
            int g = g(i, this.B);
            if (this.u != g) {
                this.u = g;
                u(false);
                return;
            }
            return;
        }
        if (n()) {
            this.u = 0;
            if (this.B == 16) {
                this.v = 0;
                u(false);
                return;
            }
            int i3 = this.t;
            if (i3 == 0) {
                i3 = this.n.getIntrinsicHeight();
            }
            int h = h(i2, i3);
            if (this.v != h) {
                this.v = h;
                u(false);
            }
        }
    }

    public final void w() {
        int i = (int) (this.P - this.Q);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.J;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.E + i);
        }
        setPaddingRelative(this.F + i3, getPaddingTop(), (this.G + i) - i3, getPaddingBottom());
    }

    public final void x(boolean z) {
        Drawable drawable = this.q;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.q = mutate;
            mutate.setTintList(this.p);
            PorterDuff.Mode mode = this.o;
            if (mode != null) {
                this.q.setTintMode(mode);
            }
            int i = this.t;
            if (i == 0) {
                i = this.q.getIntrinsicWidth();
            }
            int i2 = this.t;
            if (i2 == 0) {
                i2 = this.q.getIntrinsicHeight();
            }
            Drawable drawable2 = this.q;
            int i3 = this.x;
            int i4 = this.y;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.q.setVisible(true, z);
        }
        if (this.q != null && this.n != null && d()) {
            l8.l("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.q == null) {
            if (this.r) {
                return;
            }
            if (this.n != null && d()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (p() && compoundDrawablesRelative[0] != this.q) || (o() && compoundDrawablesRelative[2] != this.q) || (q() && compoundDrawablesRelative[1] != this.q);
        if (z || z2) {
            if (p()) {
                setCompoundDrawablesRelative(this.q, j(1), j(2), null);
            } else if (o()) {
                setCompoundDrawablesRelative(j(0), j(1), this.q, null);
            } else if (q()) {
                setCompoundDrawablesRelative(j(0), this.q, j(2), null);
            }
        }
    }

    public final void y(int i, int i2) {
        if (this.q == null || getLayout() == null) {
            return;
        }
        if (p() || o()) {
            this.y = 0;
            if (e(this.C)) {
                this.x = 0;
                x(false);
                return;
            }
            int g = g(i, this.C);
            if (this.x != g) {
                this.x = g;
                x(false);
                return;
            }
            return;
        }
        if (q()) {
            this.x = 0;
            if (this.C == 16) {
                this.y = 0;
                x(false);
                return;
            }
            int i3 = this.t;
            if (i3 == 0) {
                i3 = this.q.getIntrinsicHeight();
            }
            int h = h(i2, i3);
            if (this.y != h) {
                this.y = h;
                x(false);
            }
        }
    }
}
