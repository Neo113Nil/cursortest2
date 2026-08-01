package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class o90 extends n90 {
    @Override // defpackage.j90
    public final float c(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.j90
    public final void j(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.n90
    public final void l(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.n90
    public final void m(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.n90
    public final void n(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.n90
    public final void o(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }
}
