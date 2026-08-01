package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class tb implements sb {
    public final int[] a;
    public final float[] b;

    public tb(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.sb
    public void a(View view, float[] fArr) {
        mz.R(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            mz.R(fArr2);
            mz.X(fArr2, -view.getScrollX(), -view.getScrollY());
            x40.K(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            mz.R(fArr2);
            mz.X(fArr2, left, top);
            x40.K(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            mz.R(fArr2);
            mz.X(fArr2, -view.getScrollX(), -view.getScrollY());
            x40.K(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            mz.R(fArr2);
            mz.X(fArr2, f, f2);
            x40.K(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        nz.e0(fArr2, matrix);
        x40.K(fArr, fArr2);
    }

    public tb(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public tb(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public tb(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
