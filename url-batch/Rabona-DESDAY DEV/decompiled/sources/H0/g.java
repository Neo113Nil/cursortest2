package H0;

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
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import z0.AbstractC0347a;
import z0.AbstractC0348b;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f255w;

    /* renamed from: a, reason: collision with root package name */
    public f f256a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f257b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f258c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f259e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f260f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f261g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f262j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f263k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f264l;

    /* renamed from: m, reason: collision with root package name */
    public k f265m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f266n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f267o;

    /* renamed from: p, reason: collision with root package name */
    public final G0.a f268p;

    /* renamed from: q, reason: collision with root package name */
    public final B0.d f269q;

    /* renamed from: r, reason: collision with root package name */
    public final m f270r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f271s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f272t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f273u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f274v;

    static {
        Paint paint = new Paint(1);
        f255w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f256a;
        this.f270r.a(fVar.f242a, fVar.i, rectF, this.f269q, path);
        if (this.f256a.h != 1.0f) {
            Matrix matrix = this.f260f;
            matrix.reset();
            float f2 = this.f256a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f273u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f256a;
        float f2 = fVar.f251m + 0.0f + fVar.f250l;
        A0.a aVar = fVar.f243b;
        if (aVar == null || !aVar.f1a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f4e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int n2 = i1.s.n(C.a.d(i, 255), aVar.f2b, min);
        if (min > 0.0f && (i2 = aVar.f3c) != 0) {
            n2 = C.a.b(C.a.d(i2, A0.a.f0f), n2);
        }
        return C.a.d(n2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f256a.f253o;
        Path path = this.f261g;
        G0.a aVar = this.f268p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f198a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f257b[i2];
            int i3 = this.f256a.f252n;
            Matrix matrix = t.f316b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f258c[i2].a(matrix, aVar, this.f256a.f252n, canvas);
        }
        if (this.f274v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f256a.f253o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f256a.f253o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f255w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f289f.a(rectF) * this.f256a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f266n;
        paint.setColorFilter(this.f271s);
        int alpha = paint.getAlpha();
        int i = this.f256a.f249k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f267o;
        paint2.setColorFilter(this.f272t);
        paint2.setStrokeWidth(this.f256a.f248j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f256a.f249k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f259e;
        Path path = this.f261g;
        if (z2) {
            float f2 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f256a.f242a;
            j e2 = kVar.e();
            c cVar = kVar.f288e;
            if (!(cVar instanceof h)) {
                cVar = new b(f2, cVar);
            }
            e2.f279e = cVar;
            c cVar2 = kVar.f289f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f2, cVar2);
            }
            e2.f280f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f2, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f290g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f2, cVar4);
            }
            e2.f281g = cVar4;
            k a2 = e2.a();
            this.f265m = a2;
            float f3 = this.f256a.i;
            RectF rectF = this.f262j;
            rectF.set(f());
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f270r.a(a2, f3, rectF, null, this.h);
            a(f(), path);
            this.f259e = false;
        }
        f fVar = this.f256a;
        fVar.getClass();
        if (fVar.f252n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f256a.f242a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f256a.f253o), (int) (Math.cos(Math.toRadians(d)) * this.f256a.f253o));
                if (this.f274v) {
                    RectF rectF2 = this.f273u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f256a.f252n * 2) + ((int) rectF2.width()) + width, (this.f256a.f252n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f256a.f252n) - width;
                    float f5 = (getBounds().top - this.f256a.f252n) - height;
                    canvas2.translate(-f4, -f5);
                    c(canvas2);
                    canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f256a;
        Paint.Style style = fVar2.f254p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f242a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f267o;
        Path path = this.h;
        k kVar = this.f265m;
        RectF rectF = this.f262j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f256a.f254p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f267o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f256a.f249k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f256a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f256a.getClass();
        if (this.f256a.f242a.d(f())) {
            outline.setRoundRect(getBounds(), this.f256a.f242a.f288e.a(f()) * this.f256a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f261g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0348b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC0347a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0347a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f256a.f247g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f263k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f261g;
        a(f2, path);
        Region region2 = this.f264l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f256a.f243b = new A0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f256a;
        if (fVar.f251m != f2) {
            fVar.f251m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f259e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f256a.f245e) == null || !colorStateList.isStateful())) {
            this.f256a.getClass();
            ColorStateList colorStateList3 = this.f256a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f256a.f244c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f256a;
        if (fVar.f244c != colorStateList) {
            fVar.f244c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f256a.f244c == null || color2 == (colorForState2 = this.f256a.f244c.getColorForState(iArr, (color2 = (paint2 = this.f266n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f256a.d == null || color == (colorForState = this.f256a.d.getColorForState(iArr, (color = (paint = this.f267o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f271s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f272t;
        f fVar = this.f256a;
        ColorStateList colorStateList = fVar.f245e;
        PorterDuff.Mode mode = fVar.f246f;
        Paint paint = this.f266n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f271s = porterDuffColorFilter;
        this.f256a.getClass();
        this.f272t = null;
        this.f256a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f271s) && Objects.equals(porterDuffColorFilter3, this.f272t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f256a;
        float f2 = fVar.f251m + 0.0f;
        fVar.f252n = (int) Math.ceil(0.75f * f2);
        this.f256a.f253o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f256a = new f(this.f256a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f259e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = k(iArr) || l();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f256a;
        if (fVar.f249k != i) {
            fVar.f249k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f256a.getClass();
        super.invalidateSelf();
    }

    @Override // H0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f256a.f242a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f256a.f245e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f256a;
        if (fVar.f246f != mode) {
            fVar.f246f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(k.b(context, attributeSet, i, i2).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f257b = new t[4];
        this.f258c = new t[4];
        this.d = new BitSet(8);
        this.f260f = new Matrix();
        this.f261g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f262j = new RectF();
        this.f263k = new Region();
        this.f264l = new Region();
        Paint paint = new Paint(1);
        this.f266n = paint;
        Paint paint2 = new Paint(1);
        this.f267o = paint2;
        this.f268p = new G0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f294a;
        } else {
            mVar = new m();
        }
        this.f270r = mVar;
        this.f273u = new RectF();
        this.f274v = true;
        this.f256a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f269q = new B0.d(2, this);
    }
}
