package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class o2 implements kc {
    public Canvas a = p2.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.kc
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.kc
    public final void b(float f, long j, y4 y4Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, y4Var.a);
    }

    @Override // defpackage.kc
    public final void c(x4 x4Var, long j, long j2, long j3, y4 y4Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        if (!(x4Var instanceof x4)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = x4Var.a;
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmap, rect, rect2, y4Var.a);
    }

    @Override // defpackage.kc
    public final void d(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.kc
    public final void e(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.kc
    public final void f(e5 e5Var, y4 y4Var) {
        Canvas canvas = this.a;
        if (!(e5Var instanceof e5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(e5Var.a, y4Var.a);
    }

    @Override // defpackage.kc
    public final void g() {
        this.a.restore();
    }

    @Override // defpackage.kc
    public final void h(float f, float f2, float f3, float f4, float f5, float f6, y4 y4Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, y4Var.a);
    }

    @Override // defpackage.kc
    public final void i() {
        this.a.save();
    }

    @Override // defpackage.kc
    public final void j(long j, long j2, y4 y4Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), y4Var.a);
    }

    @Override // defpackage.kc
    public final void k() {
        a50.q(this.a, false);
    }

    @Override // defpackage.kc
    public final void l(zi0 zi0Var) {
        d(zi0Var.a, zi0Var.b, zi0Var.c, zi0Var.d, 1);
    }

    @Override // defpackage.kc
    public final void m(zi0 zi0Var, y4 y4Var) {
        this.a.saveLayer(zi0Var.a, zi0Var.b, zi0Var.c, zi0Var.d, y4Var.a, 31);
    }

    @Override // defpackage.kc
    public final void n(float f, float f2, float f3, float f4, y4 y4Var) {
        this.a.drawRect(f, f2, f3, f4, y4Var.a);
    }

    @Override // defpackage.kc
    public final void o(float[] fArr) {
        if (nz.J(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.a.concat(matrix);
    }

    @Override // defpackage.kc
    public final void p() {
        a50.q(this.a, true);
    }

    @Override // defpackage.kc
    public final void q(e5 e5Var) {
        Canvas canvas = this.a;
        if (!(e5Var instanceof e5)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(e5Var.a, Region.Op.INTERSECT);
    }
}
