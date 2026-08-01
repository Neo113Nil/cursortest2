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
    public static final Matrix f3148p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3149a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3150b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3151c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3152e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3153f;

    /* renamed from: g, reason: collision with root package name */
    public final j f3154g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3155j;

    /* renamed from: k, reason: collision with root package name */
    public float f3156k;

    /* renamed from: l, reason: collision with root package name */
    public int f3157l;

    /* renamed from: m, reason: collision with root package name */
    public String f3158m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3159n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3160o;

    public m() {
        this.f3151c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3155j = 0.0f;
        this.f3156k = 0.0f;
        this.f3157l = 255;
        this.f3158m = null;
        this.f3159n = null;
        this.f3160o = new o.b();
        this.f3154g = new j();
        this.f3149a = new Path();
        this.f3150b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3132j != 1.0f) goto L33;
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
        jVar.f3137a.set(matrix);
        Matrix matrix3 = jVar.f3137a;
        matrix3.preConcat(jVar.f3143j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = jVar.f3138b;
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
                float f3 = i / this.f3155j;
                float f4 = i2 / this.f3156k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3151c;
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
                    Path path = this.f3149a;
                    lVar.getClass();
                    path.reset();
                    C.f[] fVarArr = lVar.f3145a;
                    if (fVarArr != null) {
                        C.f.b(fVarArr, path);
                    }
                    Path path2 = this.f3150b;
                    path2.reset();
                    if (lVar instanceof h) {
                        path2.setFillType(lVar.f3147c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f6 = iVar.i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = iVar.f3133k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (iVar.f3132j + f8) % f7;
                        if (this.f3153f == null) {
                            this.f3153f = new PathMeasure();
                        }
                        this.f3153f.setPath(path, r11);
                        float length = this.f3153f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3153f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f3153f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f3153f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = iVar.f3130f;
                        if ((((Shader) dVar.f17c) == null && dVar.f16b == 0) ? r11 : true) {
                            if (this.f3152e == null) {
                                Paint paint = new Paint(1);
                                this.f3152e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3152e;
                            Shader shader = (Shader) dVar.f17c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f16b;
                                float f13 = iVar.h;
                                PorterDuff.Mode mode = p.f3171j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(iVar.f3147c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = iVar.d;
                        if (((Shader) dVar2.f17c) != null || dVar2.f16b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f3135m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f3134l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f3136n);
                            Shader shader2 = (Shader) dVar2.f17c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f3131g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f16b;
                                float f14 = iVar.f3131g;
                                PorterDuff.Mode mode2 = p.f3171j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f3129e * abs * min);
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
        return this.f3157l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3157l = i;
    }

    public m(m mVar) {
        this.f3151c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f3155j = 0.0f;
        this.f3156k = 0.0f;
        this.f3157l = 255;
        this.f3158m = null;
        this.f3159n = null;
        o.b bVar = new o.b();
        this.f3160o = bVar;
        this.f3154g = new j(mVar.f3154g, bVar);
        this.f3149a = new Path(mVar.f3149a);
        this.f3150b = new Path(mVar.f3150b);
        this.h = mVar.h;
        this.i = mVar.i;
        this.f3155j = mVar.f3155j;
        this.f3156k = mVar.f3156k;
        this.f3157l = mVar.f3157l;
        this.f3158m = mVar.f3158m;
        String str = mVar.f3158m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3159n = mVar.f3159n;
    }
}
