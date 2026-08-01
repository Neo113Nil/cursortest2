package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class t10 extends x10 {
    public final v10 c;
    public final float d;
    public final float e;

    public t10(v10 v10Var, float f, float f2) {
        this.c = v10Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.x10
    public final void a(Matrix matrix, l10 l10Var, int i, Canvas canvas) {
        v10 v10Var = this.c;
        float f = v10Var.c;
        float f2 = this.e;
        float f3 = v10Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        l10Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = l10Var.f;
        int[] iArr = l10.i;
        iArr[0] = i2;
        iArr[1] = l10Var.e;
        iArr[2] = l10Var.d;
        Paint paint = l10Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, l10.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        v10 v10Var = this.c;
        return (float) Math.toDegrees(Math.atan((v10Var.c - this.e) / (v10Var.b - this.d)));
    }
}
