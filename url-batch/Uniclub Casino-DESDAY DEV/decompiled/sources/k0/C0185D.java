package k0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: k0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185D extends C0184C {
    @Override // k0.C0184C
    public final void A(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // i1.k
    public final float l(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // i1.k
    public final void u(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // k0.C0184C, i1.k
    public final void v(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // k0.C0184C
    public final void y(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // k0.C0184C
    public final void z(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
