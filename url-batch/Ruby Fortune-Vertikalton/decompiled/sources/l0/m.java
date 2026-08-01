package l0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3139p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3140a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3141b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3142c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3143e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3144f;

    /* renamed from: g, reason: collision with root package name */
    public final j f3145g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3146j;

    /* renamed from: k, reason: collision with root package name */
    public float f3147k;

    /* renamed from: l, reason: collision with root package name */
    public int f3148l;

    /* renamed from: m, reason: collision with root package name */
    public String f3149m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3150n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3151o;

    public m() {
        this.f3142c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3146j = 0.0f;
        this.f3147k = 0.0f;
        this.f3148l = 255;
        this.f3149m = null;
        this.f3150n = null;
        this.f3151o = new o.b();
        this.f3145g = new j();
        this.f3140a = new Path();
        this.f3141b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3123j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(j jVar, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        jVar.f3128a.set(matrix);
        Matrix matrix3 = jVar.f3128a;
        matrix3.preConcat(jVar.f3134j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = jVar.f3129b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            k kVar = (k) arrayList.get(i5);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f3 = i / this.f3146j;
                float f4 = i2 / this.f3147k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3142c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f3140a;
                    lVar.getClass();
                    path.reset();
                    C.g[] gVarArr = lVar.f3136a;
                    if (gVarArr != null) {
                        C.g.b(gVarArr, path);
                    }
                    Path path2 = this.f3141b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f3138c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f6 = iVar.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = iVar.f3124k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (iVar.f3123j + f8) % f7;
                        if (this.f3144f == null) {
                            this.f3144f = new PathMeasure();
                        }
                        this.f3144f.setPath(path, r11);
                        float length = this.f3144f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3144f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3144f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3144f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = iVar.f3121f;
                        if ((((Shader) dVar.f19c) == null && dVar.f18b == 0) ? r11 : true) {
                            if (this.f3143e == null) {
                                Paint paint = new Paint(1);
                                this.f3143e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3143e;
                            Shader shader = (Shader) dVar.f19c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f18b;
                                float f13 = iVar.h;
                                PorterDuff.Mode mode = p.f3162j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f3138c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = iVar.d;
                        if (((Shader) dVar2.f19c) != null || dVar2.f18b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f3126m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f3125l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f3127n);
                            Shader shader2 = (Shader) dVar2.f19c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f3122g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f18b;
                                float f14 = iVar.f3122g;
                                PorterDuff.Mode mode2 = p.f3162j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f3120e * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i3 = 1;
            } else {
                matrix2 = matrix3;
                i3 = i4;
            }
            i5 += i3;
            i4 = i3;
            matrix3 = matrix2;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f3148l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3148l = i;
    }

    public m(m mVar) {
        this.f3142c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3146j = 0.0f;
        this.f3147k = 0.0f;
        this.f3148l = 255;
        this.f3149m = null;
        this.f3150n = null;
        o.b bVar = new o.b();
        this.f3151o = bVar;
        this.f3145g = new j(mVar.f3145g, bVar);
        this.f3140a = new Path(mVar.f3140a);
        this.f3141b = new Path(mVar.f3141b);
        this.h = mVar.h;
        this.i = mVar.i;
        this.f3146j = mVar.f3146j;
        this.f3147k = mVar.f3147k;
        this.f3148l = mVar.f3148l;
        this.f3149m = mVar.f3149m;
        String str = mVar.f3149m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3150n = mVar.f3150n;
    }
}
