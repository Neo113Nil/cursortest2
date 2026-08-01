package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.ionia.reidopitaco.libya.R;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public abstract class m7 extends FrameLayout {
    public static final l7 q = new l7();
    public n7 f;
    public final o10 g;
    public int h;
    public final float i;
    public final float j;
    public final int k;
    public final int l;
    public ColorStateList m;
    public PorterDuff.Mode n;
    public Rect o;
    public boolean p;

    /* JADX WARN: Multi-variable type inference failed */
    public m7(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, jx.H);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.h = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.g = o10.g(context2, attributeSet, 0, 0).a();
        }
        this.i = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(oo.o(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(g90.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.j = obtainStyledAttributes.getFloat(1, 1.0f);
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.l = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(q);
        setFocusable(true);
        if (getBackground() == null) {
            int V = g8.V(g8.c0(getContext(), m60.W(this, R.attr.colorSurface)), g8.c0(getContext(), m60.W(this, R.attr.colorOnSurface)), getBackgroundOverlayColorAlpha());
            o10 o10Var = this.g;
            if (o10Var != null) {
                qi qiVar = n7.t;
                ls lsVar = new ls(o10Var);
                lsVar.r(ColorStateList.valueOf(V));
                gradientDrawable = lsVar;
            } else {
                Resources resources = getResources();
                qi qiVar2 = n7.t;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(V);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(n7 n7Var) {
        this.f = n7Var;
    }

    public float getActionTextColorAlpha() {
        return this.j;
    }

    public int getAnimationMode() {
        return this.h;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.i;
    }

    public int getMaxInlineActionWidth() {
        return this.l;
    }

    public int getMaxWidth() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        n7 n7Var = this.f;
        if (n7Var != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = n7Var.i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            n7Var.o = i;
            n7Var.e();
        }
        requestApplyInsets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r0 != null && r0.a.get() == r1) != false) goto L15;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i;
        boolean z;
        super.onDetachedFromWindow();
        n7 n7Var = this.f;
        if (n7Var != null) {
            oe o = oe.o();
            k7 k7Var = n7Var.s;
            synchronized (o.f) {
                i = 1;
                if (!o.q(k7Var)) {
                    i20 i20Var = (i20) o.i;
                    z = false;
                }
                z = true;
            }
            if (z) {
                n7.w.post(new h7(n7Var, i));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        n7 n7Var = this.f;
        if (n7Var == null || !n7Var.q) {
            return;
        }
        n7Var.d();
        n7Var.q = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.k;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.h = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.m != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.m);
            drawable.setTintMode(this.n);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.n);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.n = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.p || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.o = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        n7 n7Var = this.f;
        if (n7Var != null) {
            qi qiVar = n7.t;
            n7Var.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : q);
        super.setOnClickListener(onClickListener);
    }
}
