package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Region;

/* renamed from: o.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2262y2 implements InterfaceC0980ea {
    public Canvas a = AbstractC2328z2.a;

    @Override // o.InterfaceC0980ea
    public final void a(float f, float f2, float f3, float f4, float f5, float f6, C1143h2 c1143h2) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) c1143h2.i);
    }

    @Override // o.InterfaceC0980ea
    public final void b(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // o.InterfaceC0980ea
    public final void c(float f, float f2, float f3, float f4, float f5, float f6, C1143h2 c1143h2) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) c1143h2.i);
    }

    @Override // o.InterfaceC0980ea
    public final void d() {
        this.a.restore();
    }

    @Override // o.InterfaceC0980ea
    public final void e(DH dh) {
        Canvas canvas = this.a;
        if (!(dh instanceof E3)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((E3) dh).a, Region.Op.INTERSECT);
    }

    @Override // o.InterfaceC0980ea
    public final void f() {
        this.a.save();
    }

    @Override // o.InterfaceC0980ea
    public final void g() {
        AbstractC0868ct.s(this.a, false);
    }

    @Override // o.InterfaceC0980ea
    public final void h(float f, float f2, float f3, float f4, C1143h2 c1143h2) {
        this.a.drawRect(f, f2, f3, f4, (Paint) c1143h2.i);
    }

    @Override // o.InterfaceC0980ea
    public final void i(float f, float f2, float f3, float f4) {
        this.a.clipRect(f, f2, f3, f4, Region.Op.INTERSECT);
    }

    @Override // o.InterfaceC0980ea
    public final void j(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if (fArr[(i * 4) + i2] != (i == i2 ? 1.0f : 0.0f)) {
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
                    return;
                }
                i2++;
            }
            i++;
        }
    }

    @Override // o.InterfaceC0980ea
    public final void k() {
        AbstractC0868ct.s(this.a, true);
    }

    @Override // o.InterfaceC0980ea
    public final void l(DH dh, C1143h2 c1143h2) {
        Canvas canvas = this.a;
        if (!(dh instanceof E3)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((E3) dh).a, (Paint) c1143h2.i);
    }
}
