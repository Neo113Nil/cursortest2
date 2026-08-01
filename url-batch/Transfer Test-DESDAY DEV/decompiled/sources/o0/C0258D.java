package o0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: o0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258D extends C0257C {
    @Override // h0.f
    public final float e(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // h0.f
    public final void n(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // o0.C0257C, h0.f
    public final void o(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // o0.C0257C
    public final void s(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // o0.C0257C
    public final void t(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // o0.C0257C
    public final void u(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
