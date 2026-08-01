package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.dx;
import defpackage.e00;
import defpackage.g8;
import defpackage.o4;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] k = {R.attr.colorBackground};
    public boolean f;
    public boolean g;
    public final Rect h;
    public final Rect i;
    public final o4 j;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.cardViewStyle);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.h = rect;
        this.i = new Rect();
        o4 o4Var = new o4(9, this);
        this.j = o4Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dx.a, com.ionia.reidopitaco.libya.R.attr.cardViewStyle, com.ionia.reidopitaco.libya.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(k);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.ionia.reidopitaco.libya.R.color.cardview_light_background) : getResources().getColor(com.ionia.reidopitaco.libya.R.color.cardview_dark_background));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f = obtainStyledAttributes.getBoolean(7, false);
        this.g = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        e00 e00Var = new e00(valueOf, dimension);
        o4Var.g = e00Var;
        setBackgroundDrawable(e00Var);
        setClipToOutline(true);
        setElevation(dimension2);
        g8.f0(o4Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((e00) this.j.g).h;
    }

    public float getCardElevation() {
        return ((CardView) this.j.h).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.h.left;
    }

    public int getContentPaddingRight() {
        return this.h.right;
    }

    public int getContentPaddingTop() {
        return this.h.top;
    }

    public float getMaxCardElevation() {
        return ((e00) this.j.g).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.g;
    }

    public float getRadius() {
        return ((e00) this.j.g).a;
    }

    public boolean getUseCompatPadding() {
        return this.f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        e00 e00Var = (e00) this.j.g;
        if (valueOf == null) {
            e00Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        e00Var.h = valueOf;
        e00Var.b.setColor(valueOf.getColorForState(e00Var.getState(), e00Var.h.getDefaultColor()));
        e00Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.j.h).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        g8.f0(this.j, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.g) {
            this.g = z;
            o4 o4Var = this.j;
            g8.f0(o4Var, ((e00) o4Var.g).e);
        }
    }

    public void setRadius(float f) {
        e00 e00Var = (e00) this.j.g;
        if (f == e00Var.a) {
            return;
        }
        e00Var.a = f;
        e00Var.b(null);
        e00Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f != z) {
            this.f = z;
            o4 o4Var = this.j;
            g8.f0(o4Var, ((e00) o4Var.g).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        e00 e00Var = (e00) this.j.g;
        if (colorStateList == null) {
            e00Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        e00Var.h = colorStateList;
        e00Var.b.setColor(colorStateList.getColorForState(e00Var.getState(), e00Var.h.getDefaultColor()));
        e00Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
