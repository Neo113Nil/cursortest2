package O0;

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
import androidx.recyclerview.widget.RecyclerView;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class g extends Drawable implements v {

    /* renamed from: w, reason: collision with root package name */
    public static final Paint f531w;

    /* renamed from: a, reason: collision with root package name */
    public f f532a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f533b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f534c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f535e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f536f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f537g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f538j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f539k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f540l;

    /* renamed from: m, reason: collision with root package name */
    public k f541m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f542n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f543o;

    /* renamed from: p, reason: collision with root package name */
    public final N0.a f544p;

    /* renamed from: q, reason: collision with root package name */
    public final A0.h f545q;

    /* renamed from: r, reason: collision with root package name */
    public final m f546r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f547s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f548t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f549u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f550v;

    static {
        Paint paint = new Paint(1);
        f531w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f532a;
        this.f546r.a(fVar.f518a, fVar.i, rectF, this.f545q, path);
        if (this.f532a.h != 1.0f) {
            Matrix matrix = this.f536f;
            matrix.reset();
            float f2 = this.f532a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f549u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f532a;
        float f2 = fVar.f527m + RecyclerView.f1570A0 + fVar.f526l;
        H0.a aVar = fVar.f519b;
        if (aVar == null || !aVar.f246a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f249e <= RecyclerView.f1570A0 || f2 <= RecyclerView.f1570A0) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int e02 = A.c.e0(C.a.d(i, 255), aVar.f247b, min);
        if (min > RecyclerView.f1570A0 && (i2 = aVar.f248c) != 0) {
            e02 = C.a.b(C.a.d(i2, H0.a.f245f), e02);
        }
        return C.a.d(e02, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f532a.f529o;
        Path path = this.f537g;
        N0.a aVar = this.f544p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f507a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f533b[i2];
            int i3 = this.f532a.f528n;
            Matrix matrix = t.f592b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f534c[i2].a(matrix, aVar, this.f532a.f528n, canvas);
        }
        if (this.f550v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f532a.f529o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f532a.f529o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f531w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f565f.a(rectF) * this.f532a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f542n;
        paint.setColorFilter(this.f547s);
        int alpha = paint.getAlpha();
        int i = this.f532a.f525k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f543o;
        paint2.setColorFilter(this.f548t);
        paint2.setStrokeWidth(this.f532a.f524j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f532a.f525k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f535e;
        Path path = this.f537g;
        if (z2) {
            boolean g2 = g();
            float f2 = RecyclerView.f1570A0;
            float f3 = -(g2 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f532a.f518a;
            j e2 = kVar.e();
            c cVar = kVar.f564e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e2.f555e = cVar;
            c cVar2 = kVar.f565f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e2.f556f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f566g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e2.f557g = cVar4;
            k a2 = e2.a();
            this.f541m = a2;
            float f4 = this.f532a.i;
            RectF rectF = this.f538j;
            rectF.set(f());
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.f546r.a(a2, f4, rectF, null, this.h);
            a(f(), path);
            this.f535e = false;
        }
        f fVar = this.f532a;
        fVar.getClass();
        if (fVar.f528n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f532a.f518a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f532a.f529o), (int) (Math.cos(Math.toRadians(d)) * this.f532a.f529o));
                if (this.f550v) {
                    RectF rectF2 = this.f549u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f532a.f528n * 2) + ((int) rectF2.width()) + width, (this.f532a.f528n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f5 = (getBounds().left - this.f532a.f528n) - width;
                    float f6 = (getBounds().top - this.f532a.f528n) - height;
                    canvas2.translate(-f5, -f6);
                    c(canvas2);
                    canvas.drawBitmap(createBitmap, f5, f6, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f532a;
        Paint.Style style = fVar2.f530p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f518a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f543o;
        Path path = this.h;
        k kVar = this.f541m;
        RectF rectF = this.f538j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : RecyclerView.f1570A0;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f532a.f530p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f543o.getStrokeWidth() > RecyclerView.f1570A0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f532a.f525k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f532a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f532a.getClass();
        if (this.f532a.f518a.d(f())) {
            outline.setRoundRect(getBounds(), this.f532a.f518a.f564e.a(f()) * this.f532a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f537g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            G0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                G0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            G0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f532a.f523g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f539k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f537g;
        a(f2, path);
        Region region2 = this.f540l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f532a.f519b = new H0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f532a;
        if (fVar.f527m != f2) {
            fVar.f527m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f535e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f532a.f521e) == null || !colorStateList.isStateful())) {
            this.f532a.getClass();
            ColorStateList colorStateList3 = this.f532a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f532a.f520c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f532a;
        if (fVar.f520c != colorStateList) {
            fVar.f520c = colorStateList;
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
        if (this.f532a.f520c == null || color2 == (colorForState2 = this.f532a.f520c.getColorForState(iArr, (color2 = (paint2 = this.f542n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f532a.d == null || color == (colorForState = this.f532a.d.getColorForState(iArr, (color = (paint = this.f543o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f547s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f548t;
        f fVar = this.f532a;
        ColorStateList colorStateList = fVar.f521e;
        PorterDuff.Mode mode = fVar.f522f;
        Paint paint = this.f542n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f547s = porterDuffColorFilter;
        this.f532a.getClass();
        this.f548t = null;
        this.f532a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f547s) && Objects.equals(porterDuffColorFilter3, this.f548t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f532a;
        float f2 = fVar.f527m + RecyclerView.f1570A0;
        fVar.f528n = (int) Math.ceil(0.75f * f2);
        this.f532a.f529o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f532a = new f(this.f532a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f535e = true;
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
        f fVar = this.f532a;
        if (fVar.f525k != i) {
            fVar.f525k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f532a.getClass();
        super.invalidateSelf();
    }

    @Override // O0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f532a.f518a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f532a.f521e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f532a;
        if (fVar.f522f != mode) {
            fVar.f522f = mode;
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
        this.f533b = new t[4];
        this.f534c = new t[4];
        this.d = new BitSet(8);
        this.f536f = new Matrix();
        this.f537g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f538j = new RectF();
        this.f539k = new Region();
        this.f540l = new Region();
        Paint paint = new Paint(1);
        this.f542n = paint;
        Paint paint2 = new Paint(1);
        this.f543o = paint2;
        this.f544p = new N0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f570a;
        } else {
            mVar = new m();
        }
        this.f546r = mVar;
        this.f549u = new RectF();
        this.f550v = true;
        this.f532a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f545q = new A0.h(6, this);
    }
}
