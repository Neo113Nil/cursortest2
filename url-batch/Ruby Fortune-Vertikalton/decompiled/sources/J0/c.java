package J0;

import B0.o;
import H0.g;
import H0.k;
import K.F;
import K.H;
import K.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.punchtowin.balls.R;
import i1.s;
import java.util.WeakHashMap;
import n0.AbstractC0278a;

/* loaded from: classes.dex */
public abstract class c extends FrameLayout {
    public static final b i = new b();

    /* renamed from: a, reason: collision with root package name */
    public final k f355a;

    /* renamed from: b, reason: collision with root package name */
    public int f356b;

    /* renamed from: c, reason: collision with root package name */
    public final float f357c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f358e;

    /* renamed from: f, reason: collision with root package name */
    public final int f359f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f360g;
    public PorterDuff.Mode h;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) {
        super(M0.a.a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0278a.f3299x);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = T.f381a;
            H.s(this, dimensionPixelSize);
        }
        this.f356b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f355a = k.b(context2, attributeSet, 0, 0).a();
        }
        this.f357c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(q1.d.A(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(o.g(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f358e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f359f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            int n2 = s.n(s.i(this, R.attr.colorSurface), s.i(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            k kVar = this.f355a;
            if (kVar != null) {
                int i2 = d.f361a;
                g gVar = new g(kVar);
                gVar.j(ColorStateList.valueOf(n2));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i3 = d.f361a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(n2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f360g;
            if (colorStateList != null) {
                D.a.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = T.f381a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(d dVar) {
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.f356b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f357c;
    }

    public int getMaxInlineActionWidth() {
        return this.f359f;
    }

    public int getMaxWidth() {
        return this.f358e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = T.f381a;
        F.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f358e;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    public void setAnimationMode(int i2) {
        this.f356b = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f360g != null) {
            drawable = drawable.mutate();
            D.a.h(drawable, this.f360g);
            D.a.i(drawable, this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f360g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            D.a.h(mutate, colorStateList);
            D.a.i(mutate, this.h);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            D.a.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : i);
        super.setOnClickListener(onClickListener);
    }
}
