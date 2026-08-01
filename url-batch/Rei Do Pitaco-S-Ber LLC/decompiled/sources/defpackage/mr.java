package defpackage;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class mr extends m60 {
    @Override // defpackage.m60
    public final float B(z10 z10Var) {
        float displayedWidthIncrease;
        displayedWidthIncrease = ((MaterialButton) z10Var).getDisplayedWidthIncrease();
        return displayedWidthIncrease;
    }

    @Override // defpackage.m60
    public final void Y(z10 z10Var, float f) {
        ((MaterialButton) z10Var).setDisplayedWidthIncrease(f);
    }
}
