package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class q10 {
    public final y10[] a = new y10[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final y10 g = new y10();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public q10() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new y10();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public static q10 b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? p10.a : new q10();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void a(o10 o10Var, float[] fArr, float f, RectF rectF, is isVar, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        y10[] y10VarArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.c;
            fArr2 = this.h;
            y10VarArr = this.a;
            matrixArr2 = this.b;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            nd eaVar = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? o10Var.f : o10Var.e : o10Var.h : o10Var.g : new ea(fArr[i3]);
            m60 m60Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? o10Var.b : o10Var.a : o10Var.d : o10Var.c;
            y10 y10Var = y10VarArr[i3];
            m60Var.getClass();
            m60Var.w(y10Var, f, eaVar.a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.d;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            y10 y10Var2 = y10VarArr[i2];
            fArr2[0] = y10Var2.b;
            fArr2[1] = y10Var2.c;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            y10 y10Var3 = y10VarArr[i5];
            y10Var3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = y10Var3.a;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            y10VarArr[i5].b(matrixArr2[i5], path);
            if (isVar != null) {
                y10 y10Var4 = y10VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                ls lsVar = isVar.a;
                f2 = 0.0f;
                BitSet bitSet = lsVar.j;
                y10Var4.getClass();
                bitSet.set(i5, z);
                x10[] x10VarArr = lsVar.h;
                y10Var4.a(y10Var4.e);
                x10VarArr[i5] = new r10(new ArrayList(y10Var4.g), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            y10 y10Var5 = y10VarArr[i5];
            fArr2[0] = y10Var5.b;
            fArr2[1] = y10Var5.c;
            matrixArr2[i5].mapPoints(fArr2);
            y10 y10Var6 = y10VarArr[i7];
            y10Var6.getClass();
            float[] fArr3 = this.i;
            fArr3[0] = f2;
            fArr3[1] = y10Var6.a;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            y10[] y10VarArr2 = y10VarArr;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            y10 y10Var7 = y10VarArr2[i5];
            fArr2[0] = y10Var7.b;
            fArr2[1] = y10Var7.c;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            y10 y10Var8 = this.g;
            y10Var8.d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? o10Var.j : o10Var.i : o10Var.l : o10Var.k).getClass();
            y10Var8.c(max, 0.0f);
            Path path4 = this.j;
            path4.reset();
            y10Var8.b(matrixArr3[i5], path4);
            if (this.l && (c(path4, i5) || c(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = y10Var8.a;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                y10Var8.b(matrixArr3[i5], path2);
            } else {
                y10Var8.b(matrixArr3[i5], path);
            }
            if (isVar != null) {
                Matrix matrix2 = matrixArr3[i5];
                ls lsVar2 = isVar.a;
                z2 = false;
                lsVar2.j.set(i5 + 4, false);
                x10[] x10VarArr2 = lsVar2.i;
                y10Var8.a(y10Var8.e);
                x10VarArr2[i5] = new r10(new ArrayList(y10Var8.g), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            y10VarArr = y10VarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean c(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].b(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
