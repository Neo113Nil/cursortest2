package com.google.android.material.button;

import D0.n;
import J0.j;
import J0.k;
import J0.v;
import K.S;
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
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.C0238n;
import l.C0246r;
import p0.AbstractC0279a;
import q1.d;
import q1.l;
import v0.a;
import v0.b;
import v0.c;

/* loaded from: classes.dex */
public class MaterialButton extends C0246r implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f1601r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f1602s = {R.attr.state_checked};
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f1603e;

    /* renamed from: f, reason: collision with root package name */
    public a f1604f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f1605g;
    public ColorStateList h;
    public Drawable i;

    /* renamed from: j, reason: collision with root package name */
    public String f1606j;

    /* renamed from: k, reason: collision with root package name */
    public int f1607k;

    /* renamed from: l, reason: collision with root package name */
    public int f1608l;

    /* renamed from: m, reason: collision with root package name */
    public int f1609m;

    /* renamed from: n, reason: collision with root package name */
    public int f1610n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1611o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1612p;

    /* renamed from: q, reason: collision with root package name */
    public int f1613q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(O0.a.a(context, attributeSet, com.fortuneodd.shadegrid.R.attr.materialButtonStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Button), attributeSet, com.fortuneodd.shadegrid.R.attr.materialButtonStyle);
        this.f1603e = new LinkedHashSet();
        this.f1611o = false;
        this.f1612p = false;
        Context context2 = getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC0279a.f3385j, com.fortuneodd.shadegrid.R.attr.materialButtonStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f1610n = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f1605g = n.g(i, mode);
        this.h = d.r(getContext(), f2, 14);
        this.i = d.v(getContext(), f2, 10);
        this.f1613q = f2.getInteger(11, 1);
        this.f1607k = f2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.fortuneodd.shadegrid.R.attr.materialButtonStyle, com.fortuneodd.shadegrid.R.style.Widget_MaterialComponents_Button).a());
        this.d = cVar;
        cVar.f4018c = f2.getDimensionPixelOffset(1, 0);
        cVar.d = f2.getDimensionPixelOffset(2, 0);
        cVar.f4019e = f2.getDimensionPixelOffset(3, 0);
        cVar.f4020f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            cVar.f4021g = dimensionPixelSize;
            float f3 = dimensionPixelSize;
            j e2 = cVar.f4017b.e();
            e2.f303e = new J0.a(f3);
            e2.f304f = new J0.a(f3);
            e2.f305g = new J0.a(f3);
            e2.h = new J0.a(f3);
            cVar.c(e2.a());
            cVar.f4028p = true;
        }
        cVar.h = f2.getDimensionPixelSize(20, 0);
        cVar.i = n.g(f2.getInt(7, -1), mode);
        cVar.f4022j = d.r(getContext(), f2, 6);
        cVar.f4023k = d.r(getContext(), f2, 19);
        cVar.f4024l = d.r(getContext(), f2, 16);
        cVar.f4029q = f2.getBoolean(5, false);
        cVar.f4032t = f2.getDimensionPixelSize(9, 0);
        cVar.f4030r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = S.f360a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            cVar.f4027o = true;
            setSupportBackgroundTintList(cVar.f4022j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f4018c, paddingTop + cVar.f4019e, paddingEnd + cVar.d, paddingBottom + cVar.f4020f);
        f2.recycle();
        setCompoundDrawablePadding(this.f1610n);
        d(this.i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
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
        float f2 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    public final boolean a() {
        c cVar = this.d;
        return cVar != null && cVar.f4029q;
    }

    public final boolean b() {
        c cVar = this.d;
        return (cVar == null || cVar.f4027o) ? false : true;
    }

    public final void c() {
        int i = this.f1613q;
        boolean z2 = true;
        if (i != 1 && i != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void d(boolean z2) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            D.a.h(mutate, this.h);
            PorterDuff.Mode mode = this.f1605g;
            if (mode != null) {
                D.a.i(this.i, mode);
            }
            int i = this.f1607k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f1607k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f1608l;
            int i4 = this.f1609m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z2);
        }
        if (z2) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.f1613q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f1613q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f1608l = 0;
                if (i3 == 16) {
                    this.f1609m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f1607k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f1610n) - getPaddingBottom()) / 2);
                if (this.f1609m != max) {
                    this.f1609m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f1609m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f1613q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f1608l = 0;
            d(false);
            return;
        }
        int i6 = this.f1607k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = S.f360a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f1610n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f1613q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f1608l != paddingEnd) {
            this.f1608l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f1606j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f1606j;
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
        if (b()) {
            return this.d.f4021g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f1613q;
    }

    public int getIconPadding() {
        return this.f1610n;
    }

    public int getIconSize() {
        return this.f1607k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1605g;
    }

    public int getInsetBottom() {
        return this.d.f4020f;
    }

    public int getInsetTop() {
        return this.d.f4019e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.f4024l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.d.f4017b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.f4023k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.h;
        }
        return 0;
    }

    @Override // l.C0246r
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.d.f4022j : super.getSupportBackgroundTintList();
    }

    @Override // l.C0246r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1611o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            l.q0(this, this.d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f1601r);
        }
        if (this.f1611o) {
            View.mergeDrawableStates(onCreateDrawableState, f1602s);
        }
        return onCreateDrawableState;
    }

    @Override // l.C0246r, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f1611o);
    }

    @Override // l.C0246r, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f1611o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.C0246r, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f672a);
        setChecked(bVar.f4015c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4015c = this.f1611o;
        return bVar;
    }

    @Override // l.C0246r, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.d.f4030r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f1606j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // l.C0246r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.d;
        cVar.f4027o = true;
        ColorStateList colorStateList = cVar.f4022j;
        MaterialButton materialButton = cVar.f4016a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.C0246r, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? d.u(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (b()) {
            this.d.f4029q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f1611o != z2) {
            this.f1611o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f1611o;
                if (!materialButtonToggleGroup.f1619f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f1612p) {
                return;
            }
            this.f1612p = true;
            Iterator it = this.f1603e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f1612p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f4028p && cVar.f4021g == i) {
                return;
            }
            cVar.f4021g = i;
            cVar.f4028p = true;
            float f2 = i;
            j e2 = cVar.f4017b.e();
            e2.f303e = new J0.a(f2);
            e2.f304f = new J0.a(f2);
            e2.f305g = new J0.a(f2);
            e2.h = new J0.a(f2);
            cVar.c(e2.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (b()) {
            this.d.b(false).i(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f1613q != i) {
            this.f1613q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f1610n != i) {
            this.f1610n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? d.u(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f1607k != i) {
            this.f1607k = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f1605g != mode) {
            this.f1605g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(d.p(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.d;
        cVar.d(cVar.f4019e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.d;
        cVar.d(i, cVar.f4020f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f1604f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.f1604f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((C0238n) aVar).f3038a).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f4024l != colorStateList) {
                cVar.f4024l = colorStateList;
                MaterialButton materialButton = cVar.f4016a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(H0.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(d.p(getContext(), i));
        }
    }

    @Override // J0.v
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.d;
            cVar.f4026n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.d;
            if (cVar.f4023k != colorStateList) {
                cVar.f4023k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(d.p(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            c cVar = this.d;
            if (cVar.h != i) {
                cVar.h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // l.C0246r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.d;
        if (cVar.f4022j != colorStateList) {
            cVar.f4022j = colorStateList;
            if (cVar.b(false) != null) {
                D.a.h(cVar.b(false), cVar.f4022j);
            }
        }
    }

    @Override // l.C0246r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.d;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            D.a.i(cVar.b(false), cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.d.f4030r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f1611o);
    }
}
