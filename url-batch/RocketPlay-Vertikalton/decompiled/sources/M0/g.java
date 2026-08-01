package M0;

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
    public static final Paint f827w;

    /* renamed from: a, reason: collision with root package name */
    public f f828a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f829b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f830c;
    public final BitSet d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f831e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f832f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f833g;
    public final Path h;
    public final RectF i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f834j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f835k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f836l;

    /* renamed from: m, reason: collision with root package name */
    public k f837m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f838n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f839o;

    /* renamed from: p, reason: collision with root package name */
    public final L0.a f840p;

    /* renamed from: q, reason: collision with root package name */
    public final A1.d f841q;

    /* renamed from: r, reason: collision with root package name */
    public final m f842r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f843s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f844t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f845u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f846v;

    static {
        Paint paint = new Paint(1);
        f827w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f828a;
        this.f842r.a(fVar.f814a, fVar.i, rectF, this.f841q, path);
        if (this.f828a.h != 1.0f) {
            Matrix matrix = this.f832f;
            matrix.reset();
            float f2 = this.f828a.h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f845u, true);
    }

    public final int b(int i) {
        int i2;
        f fVar = this.f828a;
        float f2 = fVar.f823m + RecyclerView.f1949A0 + fVar.f822l;
        F0.a aVar = fVar.f815b;
        if (aVar == null || !aVar.f400a || C.a.d(i, 255) != aVar.d) {
            return i;
        }
        float min = (aVar.f403e <= RecyclerView.f1949A0 || f2 <= RecyclerView.f1949A0) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int P2 = F1.d.P(C.a.d(i, 255), aVar.f401b, min);
        if (min > RecyclerView.f1949A0 && (i2 = aVar.f402c) != 0) {
            P2 = C.a.b(C.a.d(i2, F0.a.f399f), P2);
        }
        return C.a.d(P2, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f828a.f825o;
        Path path = this.f833g;
        L0.a aVar = this.f840p;
        if (i != 0) {
            canvas.drawPath(path, aVar.f801a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            t tVar = this.f829b[i2];
            int i3 = this.f828a.f824n;
            Matrix matrix = t.f888b;
            tVar.a(matrix, aVar, i3, canvas);
            this.f830c[i2].a(matrix, aVar, this.f828a.f824n, canvas);
        }
        if (this.f846v) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f828a.f825o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f828a.f825o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f827w);
            canvas.translate(sin, cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a2 = kVar.f861f.a(rectF) * this.f828a.i;
            canvas.drawRoundRect(rectF, a2, a2, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f838n;
        paint.setColorFilter(this.f843s);
        int alpha = paint.getAlpha();
        int i = this.f828a.f821k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f839o;
        paint2.setColorFilter(this.f844t);
        paint2.setStrokeWidth(this.f828a.f820j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f828a.f821k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f831e;
        Path path = this.f833g;
        if (z2) {
            boolean g2 = g();
            float f2 = RecyclerView.f1949A0;
            float f3 = -(g2 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f828a.f814a;
            j e2 = kVar.e();
            c cVar = kVar.f860e;
            if (!(cVar instanceof h)) {
                cVar = new b(f3, cVar);
            }
            e2.f851e = cVar;
            c cVar2 = kVar.f861f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f3, cVar2);
            }
            e2.f852f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f3, cVar3);
            }
            e2.h = cVar3;
            c cVar4 = kVar.f862g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f3, cVar4);
            }
            e2.f853g = cVar4;
            k a2 = e2.a();
            this.f837m = a2;
            float f4 = this.f828a.i;
            RectF rectF = this.f834j;
            rectF.set(f());
            if (g()) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f2, f2);
            this.f842r.a(a2, f4, rectF, null, this.h);
            a(f(), path);
            this.f831e = false;
        }
        f fVar = this.f828a;
        fVar.getClass();
        if (fVar.f824n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f828a.f814a.d(f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f828a.f825o), (int) (Math.cos(Math.toRadians(d)) * this.f828a.f825o));
                if (this.f846v) {
                    RectF rectF2 = this.f845u;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f828a.f824n * 2) + ((int) rectF2.width()) + width, (this.f828a.f824n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f5 = (getBounds().left - this.f828a.f824n) - width;
                    float f6 = (getBounds().top - this.f828a.f824n) - height;
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
        f fVar2 = this.f828a;
        Paint.Style style = fVar2.f826p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f814a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        Paint paint = this.f839o;
        Path path = this.h;
        k kVar = this.f837m;
        RectF rectF = this.f834j;
        rectF.set(f());
        float strokeWidth = g() ? paint.getStrokeWidth() / 2.0f : RecyclerView.f1949A0;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.i;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f828a.f826p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f839o.getStrokeWidth() > RecyclerView.f1949A0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f828a.f821k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f828a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f828a.getClass();
        if (this.f828a.f814a.d(f())) {
            outline.setRoundRect(getBounds(), this.f828a.f814a.f860e.a(f()) * this.f828a.i);
            return;
        }
        RectF f2 = f();
        Path path = this.f833g;
        a(f2, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            E0.c.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                E0.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            E0.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f828a.f819g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f835k;
        region.set(bounds);
        RectF f2 = f();
        Path path = this.f833g;
        a(f2, path);
        Region region2 = this.f836l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f828a.f815b = new F0.a(context);
        m();
    }

    public final void i(float f2) {
        f fVar = this.f828a;
        if (fVar.f823m != f2) {
            fVar.f823m = f2;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f831e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f828a.f817e) == null || !colorStateList.isStateful())) {
            this.f828a.getClass();
            ColorStateList colorStateList3 = this.f828a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f828a.f816c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f828a;
        if (fVar.f816c != colorStateList) {
            fVar.f816c = colorStateList;
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
        if (this.f828a.f816c == null || color2 == (colorForState2 = this.f828a.f816c.getColorForState(iArr, (color2 = (paint2 = this.f838n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f828a.d == null || color == (colorForState = this.f828a.d.getColorForState(iArr, (color = (paint = this.f839o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f843s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f844t;
        f fVar = this.f828a;
        ColorStateList colorStateList = fVar.f817e;
        PorterDuff.Mode mode = fVar.f818f;
        Paint paint = this.f838n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b2 = b(color);
            porterDuffColorFilter = b2 != color ? new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f843s = porterDuffColorFilter;
        this.f828a.getClass();
        this.f844t = null;
        this.f828a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f843s) && Objects.equals(porterDuffColorFilter3, this.f844t)) ? false : true;
    }

    public final void m() {
        f fVar = this.f828a;
        float f2 = fVar.f823m + RecyclerView.f1949A0;
        fVar.f824n = (int) Math.ceil(0.75f * f2);
        this.f828a.f825o = (int) Math.ceil(f2 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f828a = new f(this.f828a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f831e = true;
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
        f fVar = this.f828a;
        if (fVar.f821k != i) {
            fVar.f821k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f828a.getClass();
        super.invalidateSelf();
    }

    @Override // M0.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f828a.f814a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f828a.f817e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f828a;
        if (fVar.f818f != mode) {
            fVar.f818f = mode;
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
        this.f829b = new t[4];
        this.f830c = new t[4];
        this.d = new BitSet(8);
        this.f832f = new Matrix();
        this.f833g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.f834j = new RectF();
        this.f835k = new Region();
        this.f836l = new Region();
        Paint paint = new Paint(1);
        this.f838n = paint;
        Paint paint2 = new Paint(1);
        this.f839o = paint2;
        this.f840p = new L0.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f866a;
        } else {
            mVar = new m();
        }
        this.f842r = mVar;
        this.f845u = new RectF();
        this.f846v = true;
        this.f828a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f841q = new A1.d(9, this);
    }
}
