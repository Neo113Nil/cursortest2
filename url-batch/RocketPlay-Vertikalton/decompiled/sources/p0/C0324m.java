package p0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: p0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f3773p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f3774a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f3775b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f3776c;
    public Paint d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f3777e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f3778f;

    /* renamed from: g, reason: collision with root package name */
    public final C0321j f3779g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3780j;

    /* renamed from: k, reason: collision with root package name */
    public float f3781k;

    /* renamed from: l, reason: collision with root package name */
    public int f3782l;

    /* renamed from: m, reason: collision with root package name */
    public String f3783m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f3784n;

    /* renamed from: o, reason: collision with root package name */
    public final o.b f3785o;

    public C0324m() {
        this.f3776c = new Matrix();
        this.h = RecyclerView.f1949A0;
        this.i = RecyclerView.f1949A0;
        this.f3780j = RecyclerView.f1949A0;
        this.f3781k = RecyclerView.f1949A0;
        this.f3782l = 255;
        this.f3783m = null;
        this.f3784n = null;
        this.f3785o = new o.b();
        this.f3779g = new C0321j();
        this.f3774a = new Path();
        this.f3775b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f3757j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C0321j c0321j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c0321j.f3762a.set(matrix);
        Matrix matrix3 = c0321j.f3762a;
        matrix3.preConcat(c0321j.f3768j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c0321j.f3763b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC0322k abstractC0322k = (AbstractC0322k) arrayList.get(i5);
            if (abstractC0322k instanceof C0321j) {
                a((C0321j) abstractC0322k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC0322k instanceof AbstractC0323l) {
                AbstractC0323l abstractC0323l = (AbstractC0323l) abstractC0322k;
                float f3 = i / this.f3780j;
                float f4 = i2 / this.f3781k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f3776c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {RecyclerView.f1949A0, 1.0f, 1.0f, RecyclerView.f1949A0};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > RecyclerView.f1949A0 ? Math.abs(f5) / max : 0.0f;
                if (abs != RecyclerView.f1949A0) {
                    Path path = this.f3774a;
                    abstractC0323l.getClass();
                    path.reset();
                    C.g[] gVarArr = abstractC0323l.f3770a;
                    if (gVarArr != null) {
                        C.g.b(gVarArr, path);
                    }
                    Path path2 = this.f3775b;
                    path2.reset();
                    if (abstractC0323l instanceof C0319h) {
                        path2.setFillType(abstractC0323l.f3772c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C0320i c0320i = (C0320i) abstractC0323l;
                        float f6 = c0320i.i;
                        float f7 = f6 == RecyclerView.f1949A0 ? 1.0f : 1.0f;
                        float f8 = c0320i.f3758k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c0320i.f3757j + f8) % f7;
                        if (this.f3778f == null) {
                            this.f3778f = new PathMeasure();
                        }
                        this.f3778f.setPath(path, r11);
                        float length = this.f3778f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f3778f.getSegment(f11, length, path, true);
                            PathMeasure pathMeasure = this.f3778f;
                            f2 = RecyclerView.f1949A0;
                            pathMeasure.getSegment(RecyclerView.f1949A0, f12, path, true);
                        } else {
                            f2 = RecyclerView.f1949A0;
                            this.f3778f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        B.d dVar = c0320i.f3755f;
                        if ((((Shader) dVar.f61c) == null && dVar.f60b == 0) ? r11 : true) {
                            if (this.f3777e == null) {
                                Paint paint = new Paint(1);
                                this.f3777e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f3777e;
                            Shader shader = (Shader) dVar.f61c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c0320i.h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = dVar.f60b;
                                float f13 = c0320i.h;
                                PorterDuff.Mode mode = C0327p.f3796j;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c0320i.f3772c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        B.d dVar2 = c0320i.d;
                        if (((Shader) dVar2.f61c) != null || dVar2.f60b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = c0320i.f3760m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c0320i.f3759l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c0320i.f3761n);
                            Shader shader2 = (Shader) dVar2.f61c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c0320i.f3756g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = dVar2.f60b;
                                float f14 = c0320i.f3756g;
                                PorterDuff.Mode mode2 = C0327p.f3796j;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c0320i.f3754e * abs * min);
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
        return this.f3782l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f3782l = i;
    }

    public C0324m(C0324m c0324m) {
        this.f3776c = new Matrix();
        this.h = RecyclerView.f1949A0;
        this.i = RecyclerView.f1949A0;
        this.f3780j = RecyclerView.f1949A0;
        this.f3781k = RecyclerView.f1949A0;
        this.f3782l = 255;
        this.f3783m = null;
        this.f3784n = null;
        o.b bVar = new o.b();
        this.f3785o = bVar;
        this.f3779g = new C0321j(c0324m.f3779g, bVar);
        this.f3774a = new Path(c0324m.f3774a);
        this.f3775b = new Path(c0324m.f3775b);
        this.h = c0324m.h;
        this.i = c0324m.i;
        this.f3780j = c0324m.f3780j;
        this.f3781k = c0324m.f3781k;
        this.f3782l = c0324m.f3782l;
        this.f3783m = c0324m.f3783m;
        String str = c0324m.f3783m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f3784n = c0324m.f3784n;
    }
}
