package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class ls extends Drawable implements z10 {
    public static final Paint J;
    public static final ks[] K;
    public final RectF A;
    public final boolean B;
    public boolean C;
    public o10 D;
    public w20 E;
    public final v20[] F;
    public float[] G;
    public float[] H;
    public h I;
    public final is f;
    public js g;
    public final x10[] h;
    public final x10[] i;
    public final BitSet j;
    public boolean k;
    public boolean l;
    public final Matrix m;
    public final Path n;
    public final Path o;
    public final RectF p;
    public final RectF q;
    public final Region r;
    public final Region s;
    public final Paint t;
    public final Paint u;
    public final l10 v;
    public final is w;
    public final q10 x;
    public PorterDuffColorFilter y;
    public PorterDuffColorFilter z;

    static {
        Paint paint = new Paint(1);
        J = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        K = new ks[4];
        int i = 0;
        while (true) {
            ks[] ksVarArr = K;
            if (i >= ksVarArr.length) {
                return;
            }
            ksVarArr[i] = new ks(i);
            i++;
        }
    }

    public ls(js jsVar) {
        this.f = new is(this);
        this.h = new x10[4];
        this.i = new x10[4];
        this.j = new BitSet(8);
        this.m = new Matrix();
        this.n = new Path();
        this.o = new Path();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new Region();
        this.s = new Region();
        Paint paint = new Paint(1);
        this.t = paint;
        Paint paint2 = new Paint(1);
        this.u = paint2;
        this.v = new l10();
        this.x = q10.b();
        this.A = new RectF();
        this.B = true;
        this.C = true;
        this.F = new v20[4];
        this.g = jsVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        v();
        t(getState());
        this.w = new is(this);
    }

    public final void b(RectF rectF, Path path) {
        this.x.a(this.g.a.c(), this.G, this.g.i, rectF, this.w, path);
        if (this.g.h != 1.0f) {
            Matrix matrix = this.m;
            matrix.reset();
            float f = this.g.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.A, true);
    }

    public final float c(RectF rectF, o10 o10Var, float[] fArr) {
        if (fArr == null) {
            if (o10Var.j(rectF)) {
                return o10Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.C) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int d(int i) {
        int i2;
        js jsVar = this.g;
        float f = jsVar.m + 0.0f + jsVar.l;
        ug ugVar = jsVar.b;
        if (ugVar == null || !ugVar.a || eb.d(i, 255) != ugVar.d) {
            return i;
        }
        float min = (ugVar.e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int V = g8.V(eb.d(i, 255), ugVar.b, min);
        if (min > 0.0f && (i2 = ugVar.c) != 0) {
            V = eb.b(eb.d(i2, ug.f), V);
        }
        return eb.d(V, alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.y;
        Paint paint2 = this.t;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.g.k;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.z;
        Paint paint3 = this.u;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.g.j);
        int alpha2 = paint3.getAlpha();
        int i2 = this.g.k;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = l() || !o();
        Paint.Style style = this.g.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.k;
            paint = paint2;
            Path path = this.n;
            if (z2) {
                if (z) {
                    b(h(), path);
                }
                this.k = false;
            }
            if (l()) {
                canvas.save();
                canvas.translate((int) (this.g.o * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * this.g.o));
                if (this.B) {
                    Rect bounds = getBounds();
                    RectF rectF = this.A;
                    int width = (int) (rectF.width() - bounds.width());
                    int height = (int) (rectF.height() - bounds.height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: " + width + " extra height: " + height + " path bounds: " + rectF);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.g.n * 2) + ((int) rectF.width()) + width, (this.g.n * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    int i3 = bounds.left;
                    int i4 = this.g.n;
                    float f = (i3 - i4) - width;
                    float f2 = (bounds.top - i4) - height;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.g.a.c(), this.G, h());
        } else {
            paint = paint2;
        }
        if (m()) {
            if (this.l) {
                o10 j = j();
                n10 k = j.k();
                nd ndVar = j.e;
                is isVar = this.f;
                k.e = isVar.a(ndVar);
                k.f = isVar.a(j.f);
                k.h = isVar.a(j.h);
                k.g = isVar.a(j.g);
                this.D = k.a();
                float[] fArr = this.G;
                if (fArr != null) {
                    if (this.H == null) {
                        this.H = new float[fArr.length];
                    }
                    float k2 = k();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.G;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.H[i5] = Math.max(0.0f, fArr2[i5] - k2);
                        i5++;
                    }
                } else {
                    this.H = null;
                }
                if (z) {
                    o10 o10Var = this.D;
                    float[] fArr3 = this.H;
                    float f3 = this.g.i;
                    RectF h = h();
                    RectF rectF2 = this.q;
                    rectF2.set(h);
                    float k3 = k();
                    rectF2.inset(k3, k3);
                    this.x.a(o10Var, fArr3, f3, rectF2, null, this.o);
                }
                this.l = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.j.cardinality() > 0) {
            Log.w("ls", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.g.o;
        Path path = this.n;
        l10 l10Var = this.v;
        if (i != 0) {
            canvas.drawPath(path, l10Var.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            x10 x10Var = this.h[i2];
            int i3 = this.g.n;
            Matrix matrix = x10.b;
            x10Var.a(matrix, l10Var, i3, canvas);
            this.i[i2].a(matrix, l10Var, this.g.n, canvas);
        }
        if (this.B) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.g.o);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.g.o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, J);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, o10 o10Var, float[] fArr, RectF rectF) {
        float c = c(rectF, o10Var, fArr);
        if (c < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = c * this.g.i;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void g(Canvas canvas) {
        o10 o10Var = this.D;
        float[] fArr = this.H;
        RectF h = h();
        RectF rectF = this.q;
        rectF.set(h);
        float k = k();
        rectF.inset(k, k);
        f(canvas, this.u, this.o, o10Var, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.g.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.g.getClass();
        RectF h = h();
        if (h.isEmpty()) {
            return;
        }
        float c = c(h, this.g.a.c(), this.G);
        if (c >= 0.0f) {
            outline.setRoundRect(getBounds(), c * this.g.i);
            return;
        }
        boolean z = this.k;
        Path path = this.n;
        if (z) {
            b(h, path);
            this.k = false;
        }
        vv.R(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.g.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.r;
        region.set(bounds);
        RectF h = h();
        Path path = this.n;
        b(h, path);
        Region region2 = this.s;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.p;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.G;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF h = h();
        o10 j = j();
        q10 q10Var = this.x;
        q10Var.getClass();
        float a = j.e.a(h);
        o10 j2 = j();
        q10Var.getClass();
        float a2 = j2.h.a(h) + a;
        o10 j3 = j();
        q10Var.getClass();
        float a3 = a2 - j3.g.a(h);
        o10 j4 = j();
        q10Var.getClass();
        return (a3 - j4.f.a(h)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.k = true;
        this.l = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.g.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.g.getClass();
        ColorStateList colorStateList2 = this.g.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.g.c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.g.a.e();
    }

    public final o10 j() {
        return this.g.a.c();
    }

    public final float k() {
        if (m()) {
            return this.u.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean l() {
        js jsVar = this.g;
        jsVar.getClass();
        return jsVar.n > 0 && !o() && !this.n.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public final boolean m() {
        Paint.Style style = this.g.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.u.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.g = new js(this.g);
        return this;
    }

    public final void n(Context context) {
        this.g.b = new ug(context);
        w();
    }

    public final boolean o() {
        if (this.g.a.b(getState()).j(h())) {
            return this.G == null || this.C;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.k = true;
        this.l = true;
        super.onBoundsChange(rect);
        if (!this.g.a.e() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        v20[] v20VarArr = this.F;
        int length = v20VarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                v20 v20Var = v20VarArr[i];
                if (v20Var != null && v20Var.e) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        u(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.r40
    public boolean onStateChange(int[] iArr) {
        if (this.g.a.e()) {
            u(iArr, false);
        }
        boolean z = t(iArr) || v();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(w20 w20Var) {
        if (this.E == w20Var) {
            return;
        }
        this.E = w20Var;
        int i = 0;
        while (true) {
            v20[] v20VarArr = this.F;
            if (i >= v20VarArr.length) {
                u(getState(), true);
                invalidateSelf();
                return;
            }
            if (v20VarArr[i] == null) {
                v20VarArr[i] = new v20(this, K[i]);
            }
            v20 v20Var = v20VarArr[i];
            w20 w20Var2 = new w20();
            float f = (float) w20Var.b;
            if (f < 0.0f) {
                l8.l("Damping ratio must be non-negative");
                return;
            }
            w20Var2.b = f;
            w20Var2.c = false;
            double d = w20Var.a;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                l8.l("Spring stiffness constant must be positive.");
                return;
            }
            w20Var2.a = Math.sqrt(f2);
            w20Var2.c = false;
            v20Var.j = w20Var2;
            i++;
        }
    }

    public final void q(float f) {
        js jsVar = this.g;
        if (jsVar.m != f) {
            jsVar.m = f;
            w();
        }
    }

    public final void r(ColorStateList colorStateList) {
        js jsVar = this.g;
        if (jsVar.c != colorStateList) {
            jsVar.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(m10 m10Var) {
        if (m10Var instanceof o10) {
            setShapeAppearanceModel((o10) m10Var);
            return;
        }
        h30 h30Var = (h30) m10Var;
        js jsVar = this.g;
        if (jsVar.a != h30Var) {
            jsVar.a = h30Var;
            u(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        js jsVar = this.g;
        if (jsVar.k != i) {
            jsVar.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.g.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.z10
    public final void setShapeAppearanceModel(o10 o10Var) {
        this.g.a = o10Var;
        this.G = null;
        this.H = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.g.e = colorStateList;
        v();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        js jsVar = this.g;
        if (jsVar.f != mode) {
            jsVar.f = mode;
            v();
            super.invalidateSelf();
        }
    }

    public final boolean t(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.g.c == null || color2 == (colorForState2 = this.g.c.getColorForState(iArr, (color2 = (paint2 = this.t).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.g.d == null || color == (colorForState = this.g.d.getColorForState(iArr, (color = (paint = this.u).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int[] iArr, boolean z) {
        boolean z2;
        RectF h = h();
        if (!this.g.a.e() || h.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.E == null);
        if (this.G == null) {
            this.G = new float[4];
        }
        o10 b = this.g.a.b(iArr);
        float[] fArr = this.G;
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i2 = 1; i2 < fArr.length; i2++) {
                if (fArr[i2] != f) {
                    break;
                }
            }
        }
        if (b.j(h())) {
            z2 = true;
            this.C = z2;
            if (!z2) {
                this.k = true;
                this.l = true;
            }
            while (i < 4) {
                this.x.getClass();
                float a = (i != 1 ? i != 2 ? i != 3 ? b.f : b.e : b.h : b.g).a(h);
                if (z3) {
                    this.G[i] = a;
                }
                v20[] v20VarArr = this.F;
                v20 v20Var = v20VarArr[i];
                if (v20Var != null) {
                    v20Var.a(a);
                    if (z3) {
                        v20VarArr[i].d();
                    }
                }
                i++;
            }
            if (z3) {
                return;
            }
            invalidateSelf();
            return;
        }
        z2 = false;
        this.C = z2;
        if (!z2) {
        }
        while (i < 4) {
        }
        if (z3) {
        }
    }

    public final boolean v() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.y;
        PorterDuffColorFilter porterDuffColorFilter3 = this.z;
        js jsVar = this.g;
        ColorStateList colorStateList = jsVar.e;
        PorterDuff.Mode mode = jsVar.f;
        if (colorStateList == null || mode == null) {
            int color = this.t.getColor();
            int d = d(color);
            porterDuffColorFilter = d != color ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(d(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.y = porterDuffColorFilter;
        this.g.getClass();
        this.z = null;
        this.g.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.y) && Objects.equals(porterDuffColorFilter3, this.z)) ? false : true;
    }

    public final void w() {
        js jsVar = this.g;
        float f = jsVar.m + 0.0f;
        jsVar.n = (int) Math.ceil(0.75f * f);
        this.g.o = (int) Math.ceil(f * 0.25f);
        v();
        if (l() || !o()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public ls(Context context, AttributeSet attributeSet, int i, int i2) {
        this(o10.g(context, attributeSet, i, i2).a());
    }

    public ls(o10 o10Var) {
        this(new js(o10Var));
    }

    public ls(m10 m10Var) {
        this(new js(m10Var));
    }

    public ls() {
        this(new o10());
    }
}
