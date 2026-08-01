package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class g70 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final d70 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final l6 o;

    public g70(g70 g70Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        l6 l6Var = new l6(0);
        this.o = l6Var;
        this.g = new d70(g70Var.g, l6Var);
        this.a = new Path(g70Var.a);
        this.b = new Path(g70Var.b);
        this.h = g70Var.h;
        this.i = g70Var.i;
        this.j = g70Var.j;
        this.k = g70Var.k;
        this.l = g70Var.l;
        this.m = g70Var.m;
        String str = g70Var.m;
        if (str != null) {
            l6Var.put(str, this);
        }
        this.n = g70Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(d70 d70Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = d70Var.a;
        ArrayList arrayList = d70Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = d70Var.a;
        matrix3.preConcat(d70Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            e70 e70Var = (e70) arrayList.get(i5);
            if (e70Var instanceof d70) {
                a((d70) e70Var, matrix3, canvas, i, i2);
            } else if (e70Var instanceof f70) {
                f70 f70Var = (f70) e70Var;
                float f3 = i / this.j;
                float f4 = i2 / this.k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    ew[] ewVarArr = f70Var.a;
                    if (ewVarArr != null) {
                        ew.b(ewVarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (f70Var instanceof b70) {
                        path2.setFillType(f70Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        c70 c70Var = (c70) f70Var;
                        float f6 = c70Var.i;
                        if (f6 != 0.0f || c70Var.j != 1.0f) {
                            float f7 = c70Var.k;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (c70Var.j + f7) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z);
                            float length = this.f.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.f;
                            if (f10 > f11) {
                                pathMeasure.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        k4 k4Var = c70Var.f;
                        if (((Shader) k4Var.c) == null && k4Var.b == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) k4Var.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c70Var.h * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = k4Var.b;
                                float f12 = c70Var.h;
                                PorterDuff.Mode mode = j70.o;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c70Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        k4 k4Var2 = c70Var.d;
                        if (((Shader) k4Var2.c) != null || k4Var2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c70Var.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c70Var.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c70Var.n);
                            Shader shader2 = (Shader) k4Var2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c70Var.g * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = k4Var2.b;
                                float f13 = c70Var.g;
                                PorterDuff.Mode mode2 = j70.o;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c70Var.e * min * abs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public g70() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new l6(0);
        this.g = new d70();
        this.a = new Path();
        this.b = new Path();
    }
}
