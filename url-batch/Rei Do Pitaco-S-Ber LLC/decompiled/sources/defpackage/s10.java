package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class s10 extends x10 {
    public final u10 c;

    public s10(u10 u10Var) {
        this.c = u10Var;
    }

    @Override // defpackage.x10
    public final void a(Matrix matrix, l10 l10Var, int i, Canvas canvas) {
        u10 u10Var = this.c;
        float f = u10Var.f;
        float f2 = u10Var.g;
        RectF rectF = new RectF(u10Var.b, u10Var.c, u10Var.d, u10Var.e);
        Paint paint = l10Var.b;
        boolean z = f2 < 0.0f;
        Path path = l10Var.g;
        int[] iArr = l10.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = l10Var.f;
            iArr[2] = l10Var.e;
            iArr[3] = l10Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = l10Var.d;
            iArr[2] = l10Var.e;
            iArr[3] = l10Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = l10.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, l10Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
