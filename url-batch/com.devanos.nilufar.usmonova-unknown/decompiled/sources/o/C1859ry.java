package o;

import android.graphics.Matrix;

/* renamed from: o.ry, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859ry {
    public final AbstractC1596ny a;
    public Matrix b;
    public Matrix c;
    public float[] d;
    public float[] e;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1859ry(InterfaceC2312yp interfaceC2312yp) {
        this.a = (AbstractC1596ny) interfaceC2312yp;
    }

    public final float[] a(Object obj) {
        float[] fArr = this.e;
        if (fArr == null) {
            fArr = AbstractC1473m3.r();
            this.e = fArr;
        }
        if (this.g) {
            this.h = AbstractC1807r8.K(b(obj), fArr);
            this.g = false;
        }
        if (this.h) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o.ny, o.yp] */
    public final float[] b(Object obj) {
        float[] fArr = this.d;
        if (fArr == null) {
            fArr = AbstractC1473m3.r();
            this.d = fArr;
        }
        if (!this.f) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.invoke(obj, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            PX.L0(fArr, matrix);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        return fArr;
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }
}
