package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.ionia.reidopitaco.libya.R;
import defpackage.aj;
import defpackage.c;
import defpackage.d00;
import defpackage.e20;
import defpackage.f4;
import defpackage.f80;
import defpackage.g90;
import defpackage.gd;
import defpackage.hd;
import defpackage.ii;
import defpackage.j0;
import defpackage.jx;
import defpackage.k4;
import defpackage.kd;
import defpackage.ki;
import defpackage.l8;
import defpackage.m60;
import defpackage.mi;
import defpackage.o10;
import defpackage.oo;
import defpackage.tt;
import defpackage.u7;
import defpackage.u90;
import defpackage.vv;
import defpackage.w0;
import defpackage.z10;
import defpackage.zi;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class FloatingActionButton extends u90 implements ii, z10, gd {
    public ColorStateList g;
    public PorterDuff.Mode h;
    public ColorStateList i;
    public PorterDuff.Mode j;
    public ColorStateList k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public final Rect q;
    public final Rect r;
    public final k4 s;
    public final c t;
    public aj u;

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        ColorStateList colorStateList;
        FloatingActionButton floatingActionButton;
        Drawable drawable;
        Drawable drawable2;
        this.f = getVisibility();
        this.q = new Rect();
        this.r = new Rect();
        Context context2 = getContext();
        TypedArray J = m60.J(context2, attributeSet, jx.i, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.g = oo.o(context2, J, 1);
        this.h = g90.b(J.getInt(2, -1), null);
        this.k = oo.o(context2, J, 12);
        this.l = J.getInt(7, -1);
        this.m = J.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = J.getDimensionPixelSize(3, 0);
        float dimension = J.getDimension(4, 0.0f);
        float dimension2 = J.getDimension(9, 0.0f);
        float dimension3 = J.getDimension(11, 0.0f);
        this.p = J.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(J.getDimensionPixelSize(10, 0));
        tt a = tt.a(context2, J, 15);
        tt a2 = tt.a(context2, J, 8);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, jx.w, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        o10 a3 = o10.h(contextThemeWrapper.obtainStyledAttributes(jx.F), o10.m).a();
        boolean z = J.getBoolean(5, false);
        setEnabled(J.getBoolean(0, true));
        J.recycle();
        k4 k4Var = new k4(this);
        this.s = k4Var;
        k4Var.d(attributeSet, R.attr.floatingActionButtonStyle);
        this.t = new c(this);
        getImpl().g(a3);
        aj impl = getImpl();
        ColorStateList colorStateList2 = this.g;
        PorterDuff.Mode mode = this.h;
        ColorStateList colorStateList3 = this.k;
        FloatingActionButton floatingActionButton2 = impl.s;
        o10 o10Var = impl.a;
        o10Var.getClass();
        zi ziVar = new zi(o10Var);
        impl.b = ziVar;
        ziVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.b.setTintMode(mode);
        }
        impl.b.n(floatingActionButton2.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton2.getContext();
            o10 o10Var2 = impl.a;
            o10Var2.getClass();
            u7 u7Var = new u7(o10Var2);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            colorStateList = colorStateList3;
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            floatingActionButton = floatingActionButton2;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            u7Var.i = color;
            u7Var.j = color2;
            u7Var.k = color3;
            u7Var.l = color4;
            float f = dimensionPixelSize;
            if (u7Var.h != f) {
                u7Var.h = f;
                u7Var.b.setStrokeWidth(f * 1.3333f);
                u7Var.n = true;
                u7Var.invalidateSelf();
            }
            if (colorStateList2 != null) {
                u7Var.m = colorStateList2.getColorForState(u7Var.getState(), u7Var.m);
            }
            u7Var.p = colorStateList2;
            u7Var.n = true;
            u7Var.invalidateSelf();
            impl.d = u7Var;
            u7 u7Var2 = impl.d;
            u7Var2.getClass();
            zi ziVar2 = impl.b;
            ziVar2.getClass();
            drawable2 = new LayerDrawable(new Drawable[]{u7Var2, ziVar2});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            floatingActionButton = floatingActionButton2;
            drawable = null;
            impl.d = null;
            drawable2 = impl.b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(d00.b(colorStateList), drawable2, drawable);
        impl.c = rippleDrawable;
        FocusRingDrawable.e(floatingActionButton.getContext(), rippleDrawable, impl.b);
        impl.e = rippleDrawable;
        getImpl().k = dimensionPixelSize2;
        aj impl2 = getImpl();
        if (impl2.h != dimension) {
            impl2.h = dimension;
            impl2.e(dimension, impl2.i, impl2.j);
        }
        aj impl3 = getImpl();
        if (impl3.i != dimension2) {
            impl3.i = dimension2;
            impl3.e(impl3.h, dimension2, impl3.j);
        }
        aj impl4 = getImpl();
        if (impl4.j != dimension3) {
            impl4.j = dimension3;
            impl4.e(impl4.h, impl4.i, dimension3);
        }
        getImpl().n = a;
        getImpl().o = a2;
        getImpl().f = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private aj getImpl() {
        if (this.u == null) {
            this.u = new aj(this, new j0(19, this));
        }
        return this.u;
    }

    public final int c(int i) {
        int i2 = this.m;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        aj impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.s;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        tt ttVar = impl.o;
        AnimatorSet b = ttVar != null ? impl.b(ttVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, aj.B, aj.C);
        b.addListener(new mi(impl));
        b.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.i;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.j;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(f4.c(colorForState, mode));
    }

    public final void f() {
        aj impl = getImpl();
        FloatingActionButton floatingActionButton = impl.s;
        Matrix matrix = impl.x;
        FloatingActionButton floatingActionButton2 = impl.s;
        int visibility = floatingActionButton.getVisibility();
        int i = impl.r;
        if (visibility != 0) {
            if (i == 2) {
                return;
            }
        } else if (i != 1) {
            return;
        }
        Animator animator = impl.m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z = impl.n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z ? 0.4f : 0.0f);
            float f = z ? 0.4f : 0.0f;
            impl.p = f;
            impl.a(f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        tt ttVar = impl.n;
        AnimatorSet b = ttVar != null ? impl.b(ttVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, aj.z, aj.A);
        b.addListener(new w0(4, impl));
        b.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.g;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.h;
    }

    @Override // defpackage.gd
    public hd getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().s.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.m;
    }

    public int getExpandedComponentIdHint() {
        return this.t.b;
    }

    public tt getHideMotionSpec() {
        return getImpl().o;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.k;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.k;
    }

    public o10 getShapeAppearanceModel() {
        o10 o10Var = getImpl().a;
        o10Var.getClass();
        return o10Var;
    }

    public tt getShowMotionSpec() {
        return getImpl().n;
    }

    public int getSize() {
        return this.l;
    }

    public int getSizeDimension() {
        return c(this.l);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.i;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.j;
    }

    public boolean getUseCompatPadding() {
        return this.p;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        aj impl = getImpl();
        zi ziVar = impl.b;
        if (ziVar != null) {
            vv.S(impl.s, ziVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().s.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.n = (sizeDimension - this.o) / 2;
        getImpl().h();
        int min = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i2));
        Rect rect = this.q;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ki)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ki kiVar = (ki) parcelable;
        super.onRestoreInstanceState(kiVar.f);
        Bundle bundle = (Bundle) kiVar.h.get("expandableWidgetHelper");
        bundle.getClass();
        c cVar = this.t;
        cVar.getClass();
        cVar.a = bundle.getBoolean("expanded", false);
        cVar.b = bundle.getInt("expandedComponentIdHint", 0);
        if (cVar.a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) cVar.c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                List list = (List) ((e20) coordinatorLayout.g.g).get(floatingActionButton);
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    View view = (View) list.get(i);
                    hd hdVar = ((kd) view.getLayoutParams()).a;
                    if (hdVar != null) {
                        hdVar.d(coordinatorLayout, view, floatingActionButton);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        ki kiVar = new ki(onSaveInstanceState);
        c cVar = this.t;
        cVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", cVar.a);
        bundle.putInt("expandedComponentIdHint", cVar.b);
        kiVar.h.put("expandableWidgetHelper", bundle);
        return kiVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.r;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.q;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            aj ajVar = this.u;
            int i2 = -(ajVar.f ? Math.max((ajVar.k - ajVar.s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i2, i2);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.g != colorStateList) {
            this.g = colorStateList;
            aj impl = getImpl();
            zi ziVar = impl.b;
            if (ziVar != null) {
                ziVar.setTintList(colorStateList);
            }
            u7 u7Var = impl.d;
            if (u7Var != null) {
                if (colorStateList != null) {
                    u7Var.m = colorStateList.getColorForState(u7Var.getState(), u7Var.m);
                }
                u7Var.p = colorStateList;
                u7Var.n = true;
                u7Var.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.h != mode) {
            this.h = mode;
            zi ziVar = getImpl().b;
            if (ziVar != null) {
                ziVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCompatElevation(float f) {
        aj impl = getImpl();
        if (impl.h != f) {
            impl.h = f;
            impl.e(f, impl.i, impl.j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        aj impl = getImpl();
        if (impl.i != f) {
            impl.i = f;
            impl.e(impl.h, f, impl.j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        aj impl = getImpl();
        if (impl.j != f) {
            impl.j = f;
            impl.e(impl.h, impl.i, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            l8.l("Custom size must be non-negative");
        } else if (i != this.m) {
            this.m = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        zi ziVar = getImpl().b;
        if (ziVar != null) {
            ziVar.q(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().f) {
            getImpl().f = z;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.t.b = i;
    }

    public void setHideMotionSpec(tt ttVar) {
        getImpl().o = ttVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(tt.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            aj impl = getImpl();
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
            if (this.i != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.s.e(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.o = i;
        aj impl = getImpl();
        if (impl.q != i) {
            impl.q = i;
            float f = impl.p;
            impl.p = f;
            Matrix matrix = impl.x;
            impl.a(f, matrix);
            impl.s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            aj impl = getImpl();
            ColorStateList colorStateList2 = this.k;
            RippleDrawable rippleDrawable = impl.c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(d00.b(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(d00.b(colorStateList2));
            }
        }
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z) {
        aj impl = getImpl();
        impl.g = z;
        impl.h();
    }

    @Override // defpackage.z10
    public void setShapeAppearanceModel(o10 o10Var) {
        getImpl().g(o10Var);
    }

    public void setShowMotionSpec(tt ttVar) {
        getImpl().n = ttVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(tt.b(getContext(), i));
    }

    public void setSize(int i) {
        this.m = 0;
        if (i != this.l) {
            this.l = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.p != z) {
            this.p = z;
            getImpl().h();
        }
    }

    @Override // defpackage.u90, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
    public static class BaseBehavior<T extends FloatingActionButton> extends hd {
        public final boolean a;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jx.j);
            this.a = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // defpackage.hd
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.q;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // defpackage.hd
        public final void c(kd kdVar) {
            if (kdVar.h == 0) {
                kdVar.h = 80;
            }
        }

        @Override // defpackage.hd
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof kd ? ((kd) layoutParams).a instanceof BottomSheetBehavior : false) {
                r(view2, floatingActionButton);
            }
            return false;
        }

        @Override // defpackage.hd
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList j = coordinatorLayout.j(floatingActionButton);
            int size = j.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) j.get(i3);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof kd ? ((kd) layoutParams).a instanceof BottomSheetBehavior : false) && r(view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            Rect rect = floatingActionButton.q;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                kd kdVar = (kd) floatingActionButton.getLayoutParams();
                int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) kdVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) kdVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) kdVar).bottomMargin) {
                    i2 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) kdVar).topMargin) {
                    i2 = -rect.top;
                }
                if (i2 != 0) {
                    WeakHashMap weakHashMap = f80.a;
                    floatingActionButton.offsetTopAndBottom(i2);
                }
                if (i4 != 0) {
                    WeakHashMap weakHashMap2 = f80.a;
                    floatingActionButton.offsetLeftAndRight(i4);
                }
            }
            return true;
        }

        public final boolean r(View view, FloatingActionButton floatingActionButton) {
            kd kdVar = (kd) floatingActionButton.getLayoutParams();
            if (!this.a || kdVar.f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((kd) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior() {
            this.a = true;
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }
}
