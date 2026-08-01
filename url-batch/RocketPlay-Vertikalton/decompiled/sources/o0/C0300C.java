package o0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: o0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300C extends C0299B {
    @Override // o0.C0299B
    public final void C(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o0.C0299B
    public final void D(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o0.C0299B
    public final void E(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // c1.AbstractC0104b
    public final float q(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // c1.AbstractC0104b
    public final void x(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // o0.C0299B, c1.AbstractC0104b
    public final void y(View view, int i) {
        view.setTransitionVisibility(i);
    }
}
