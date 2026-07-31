package yads;

import android.graphics.Matrix;
import android.view.TextureView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;

/* loaded from: classes6.dex */
public final class dj3 implements we2 {
    public final pi1 a = new pi1();
    public j03 b;
    public j03 c;
    public TextureView d;
    public gj3 e;

    @Override // yads.we2
    public final void a(mj3 mj3Var) {
        int i = mj3Var.b;
        float f = mj3Var.e;
        if (f > 0.0f) {
            i = MathKt.roundToInt(i * f);
        }
        this.b = new j03(i, mj3Var.c);
        a();
    }

    public final void b() {
        TextureView textureView = this.d;
        if (this.e == null || textureView == null) {
            return;
        }
        this.a.getClass();
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    @Override // yads.we2
    public final void onSurfaceSizeChanged(int i, int i2) {
        this.c = new j03(i, i2);
        a();
    }

    public final void a() {
        Matrix matrix;
        j03 j03Var = this.c;
        gj3 gj3Var = this.e;
        j03 j03Var2 = this.b;
        TextureView textureView = this.d;
        if (j03Var2 == null || j03Var == null || gj3Var == null || textureView == null) {
            return;
        }
        fj3 fj3Var = new fj3(j03Var, j03Var2);
        if (j03Var2.b <= 0 || j03Var2.c <= 0 || j03Var.b <= 0 || j03Var.c <= 0) {
            matrix = null;
        } else {
            int ordinal = gj3Var.ordinal();
            if (ordinal == 0) {
                matrix = fj3Var.a(1.0f, 1.0f, ej3.b);
            } else if (ordinal == 1) {
                float f = j03Var.b / j03Var2.b;
                float f2 = j03Var.c / j03Var2.c;
                float min = Math.min(f, f2);
                matrix = fj3Var.a(min / f, min / f2, ej3.c);
            } else if (ordinal == 2) {
                float f3 = j03Var.b / j03Var2.b;
                float f4 = j03Var.c / j03Var2.c;
                float max = Math.max(f3, f4);
                matrix = fj3Var.a(max / f3, max / f4, ej3.c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (matrix != null) {
            textureView.setTransform(matrix);
        }
    }
}
