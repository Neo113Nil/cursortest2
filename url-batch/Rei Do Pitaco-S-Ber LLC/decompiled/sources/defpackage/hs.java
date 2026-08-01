package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class hs extends p4 {
    public static final int[][] l = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList j;
    public boolean k;

    public hs(Context context, AttributeSet attributeSet) {
        super(oo.R(context, attributeSet, com.ionia.reidopitaco.libya.R.attr.radioButtonStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray J = m60.J(context2, attributeSet, jx.v, com.ionia.reidopitaco.libya.R.attr.radioButtonStyle, com.ionia.reidopitaco.libya.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (J.hasValue(0)) {
            setButtonTintList(oo.o(context2, J, 0));
        }
        if (J.hasValue(1)) {
            setRippleColor(oo.o(context2, J, 1));
        }
        this.k = J.getBoolean(2, false);
        J.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.j == null) {
            int c0 = g8.c0(getContext(), m60.W(this, com.ionia.reidopitaco.libya.R.attr.colorControlActivated));
            int c02 = g8.c0(getContext(), m60.W(this, com.ionia.reidopitaco.libya.R.attr.colorOnSurface));
            int c03 = g8.c0(getContext(), m60.W(this, com.ionia.reidopitaco.libya.R.attr.colorSurface));
            this.j = new ColorStateList(l, new int[]{g8.V(c03, c0, 1.0f), g8.V(c03, c02, 0.54f), g8.V(c03, c02, 0.38f), g8.V(c03, c02, 0.38f)});
        }
        return this.j;
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.k && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.k = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
