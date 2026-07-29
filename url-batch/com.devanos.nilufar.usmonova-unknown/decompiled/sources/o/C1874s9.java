package o;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: o.s9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1874s9 implements InterfaceC1808r9 {
    public final Matrix h = new Matrix();
    public final int[] i = new int[2];

    @Override // o.InterfaceC1808r9
    public void h(View view, float[] fArr) {
        Matrix matrix = this.h;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.i;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i2);
        PX.L0(fArr, matrix);
    }
}
