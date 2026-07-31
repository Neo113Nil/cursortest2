package yads;

import android.graphics.Matrix;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes14.dex */
public final class fj3 {
    public final j03 a;

    public fj3(j03 j03Var, j03 j03Var2) {
        this.a = j03Var;
    }

    public final Matrix a(float f, float f2, ej3 ej3Var) {
        int ordinal = ej3Var.ordinal();
        if (ordinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f, f2, 0.0f, 0.0f);
            return matrix;
        }
        if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        j03 j03Var = this.a;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f, f2, j03Var.b / 2.0f, j03Var.c / 2.0f);
        return matrix2;
    }
}
