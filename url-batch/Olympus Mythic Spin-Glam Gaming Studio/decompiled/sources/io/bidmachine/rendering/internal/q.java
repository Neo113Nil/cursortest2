package io.bidmachine.rendering.internal;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.HashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends Drawable {
    public static final a u = new a(null);
    private static final ImageView.ScaleType v = ImageView.ScaleType.FIT_CENTER;
    private final Bitmap a;
    private final RectF b;
    private final RectF c;
    private final int d;
    private final int e;
    private final RectF f;
    private final Paint g;
    private final RectF h;
    private final Paint i;
    private final Matrix j;
    private final RectF k;
    private Shader.TileMode l;
    private Shader.TileMode m;
    private boolean n;
    private float o;
    private final boolean[] p;
    private boolean q;
    private float r;
    private ColorStateList s;
    private ImageView.ScaleType t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.a = bitmap;
        this.b = new RectF();
        this.c = new RectF();
        int width = bitmap.getWidth();
        this.d = width;
        int height = bitmap.getHeight();
        this.e = height;
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, width, height);
        this.f = rectF;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.g = paint;
        this.h = new RectF();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.i = paint2;
        this.j = new Matrix();
        this.k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.l = tileMode;
        this.m = tileMode;
        this.n = true;
        this.p = new boolean[]{true, true, true, true};
        ColorStateList valueOf = ColorStateList.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(DEFAULT_BORDER_COLOR)");
        this.s = valueOf;
        this.t = v;
        paint2.setColor(valueOf.getColorForState(getState(), 0));
        paint2.setStrokeWidth(this.r);
    }

    private final void a() {
        float width;
        float f;
        switch (b.$EnumSwitchMapping$0[this.t.ordinal()]) {
            case 1:
                this.h.set(this.b);
                RectF rectF = this.h;
                float f2 = this.r / 2;
                rectF.inset(f2, f2);
                this.j.reset();
                this.j.setTranslate(((this.h.width() - this.d) * 0.5f) + 0.5f, ((this.h.height() - this.e) * 0.5f) + 0.5f);
                break;
            case 2:
                this.h.set(this.b);
                RectF rectF2 = this.h;
                float f3 = 2;
                float f4 = this.r / f3;
                rectF2.inset(f4, f4);
                this.j.reset();
                float f5 = 0.0f;
                if (this.d * this.h.height() > this.h.width() * this.e) {
                    width = this.h.height() / this.e;
                    f = (this.h.width() - (this.d * width)) * 0.5f;
                } else {
                    width = this.h.width() / this.d;
                    f = 0.0f;
                    f5 = (this.h.height() - (this.e * width)) * 0.5f;
                }
                this.j.setScale(width, width);
                Matrix matrix = this.j;
                float f6 = this.r / f3;
                matrix.postTranslate(((int) (f + 0.5f)) + f6, ((int) (f5 + 0.5f)) + f6);
                break;
            case 3:
                this.j.reset();
                float min = (((float) this.d) > this.b.width() || ((float) this.e) > this.b.height()) ? Math.min(this.b.width() / this.d, this.b.height() / this.e) : 1.0f;
                float width2 = ((this.b.width() - (this.d * min)) * 0.5f) + 0.5f;
                float height = ((this.b.height() - (this.e * min)) * 0.5f) + 0.5f;
                this.j.setScale(min, min);
                this.j.postTranslate(width2, height);
                this.h.set(this.f);
                this.j.mapRect(this.h);
                RectF rectF3 = this.h;
                float f7 = this.r / 2;
                rectF3.inset(f7, f7);
                this.j.setRectToRect(this.f, this.h, Matrix.ScaleToFit.FILL);
                break;
            case 4:
                this.h.set(this.f);
                this.j.setRectToRect(this.f, this.b, Matrix.ScaleToFit.CENTER);
                this.j.mapRect(this.h);
                RectF rectF4 = this.h;
                float f8 = this.r / 2;
                rectF4.inset(f8, f8);
                this.j.setRectToRect(this.f, this.h, Matrix.ScaleToFit.FILL);
                break;
            case 5:
                this.h.set(this.f);
                this.j.setRectToRect(this.f, this.b, Matrix.ScaleToFit.END);
                this.j.mapRect(this.h);
                RectF rectF5 = this.h;
                float f9 = this.r / 2;
                rectF5.inset(f9, f9);
                this.j.setRectToRect(this.f, this.h, Matrix.ScaleToFit.FILL);
                break;
            case 6:
                this.h.set(this.f);
                this.j.setRectToRect(this.f, this.b, Matrix.ScaleToFit.START);
                this.j.mapRect(this.h);
                RectF rectF6 = this.h;
                float f10 = this.r / 2;
                rectF6.inset(f10, f10);
                this.j.setRectToRect(this.f, this.h, Matrix.ScaleToFit.FILL);
                break;
            case 7:
                this.h.set(this.b);
                RectF rectF7 = this.h;
                float f11 = this.r / 2;
                rectF7.inset(f11, f11);
                this.j.reset();
                this.j.setRectToRect(this.f, this.h, Matrix.ScaleToFit.FILL);
                break;
            default:
                this.h.set(this.f);
                this.j.setRectToRect(this.f, this.b, Matrix.ScaleToFit.CENTER);
                this.j.mapRect(this.h);
                RectF rectF8 = this.h;
                float f12 = this.r / 2;
                rectF8.inset(f12, f12);
                this.j.setRectToRect(this.f, this.h, Matrix.ScaleToFit.FILL);
                break;
        }
        this.c.set(this.h);
        this.n = true;
    }

    private final void b(Canvas canvas) {
        float f;
        if (a(this.p) || this.o == 0.0f) {
            return;
        }
        RectF rectF = this.c;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float width = rectF.width() + f2;
        float height = f3 + this.c.height();
        float f4 = this.o;
        float f5 = this.r / 2;
        if (!this.p[0]) {
            canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.i);
            canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.i);
        }
        if (!this.p[1]) {
            canvas.drawLine((width - f4) - f5, f3, width, f3, this.i);
            canvas.drawLine(width, f3 - f5, width, f3 + f4, this.i);
        }
        if (this.p[2]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine((width - f4) - f5, height, width + f5, height, this.i);
            canvas.drawLine(width, height - f, width, height, this.i);
        }
        if (this.p[3]) {
            return;
        }
        canvas.drawLine(f2 - f5, height, f2 + f, height, this.i);
        canvas.drawLine(f2, height - f, f2, height, this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.n) {
            BitmapShader bitmapShader = new BitmapShader(this.a, this.l, this.m);
            Shader.TileMode tileMode = this.l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.m == tileMode2) {
                bitmapShader.setLocalMatrix(this.j);
            }
            this.g.setShader(bitmapShader);
            this.n = false;
        }
        if (this.q) {
            if (this.r <= 0.0f) {
                canvas.drawOval(this.c, this.g);
                return;
            } else {
                canvas.drawOval(this.c, this.g);
                canvas.drawOval(this.h, this.i);
                return;
            }
        }
        if (!b(this.p)) {
            canvas.drawRect(this.c, this.g);
            if (this.r > 0.0f) {
                canvas.drawRect(this.h, this.i);
                return;
            }
            return;
        }
        float f = this.o;
        if (this.r <= 0.0f) {
            canvas.drawRoundRect(this.c, f, f, this.g);
            a(canvas);
        } else {
            canvas.drawRoundRect(this.c, f, f, this.g);
            canvas.drawRoundRect(this.h, f, f, this.i);
            a(canvas);
            b(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.s.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.b.set(bounds);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int colorForState = this.s.getColorForState(state, 0);
        if (this.i.getColor() == colorForState) {
            return super.onStateChange(state);
        }
        this.i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.g.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.g.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.g.setFilterBitmap(z);
        invalidateSelf();
    }

    public final q b(float f) {
        a(f, f, f, f);
        return this;
    }

    private final boolean b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final void a(Canvas canvas) {
        if (a(this.p) || this.o == 0.0f) {
            return;
        }
        RectF rectF = this.c;
        float f = rectF.left;
        float f2 = rectF.top;
        float width = rectF.width() + f;
        float height = this.c.height() + f2;
        float f3 = this.o;
        if (!this.p[0]) {
            this.k.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.k, this.g);
        }
        if (!this.p[1]) {
            this.k.set(width - f3, f2, width, f3);
            canvas.drawRect(this.k, this.g);
        }
        if (!this.p[2]) {
            this.k.set(width - f3, height - f3, width, height);
            canvas.drawRect(this.k, this.g);
        }
        if (this.p[3]) {
            return;
        }
        this.k.set(f, height - f3, f3 + f, height);
        canvas.drawRect(this.k, this.g);
    }

    public final q a(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Number) hashSet.iterator().next()).floatValue();
                if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue) && floatValue >= 0.0f) {
                    this.o = floatValue;
                }
            } else {
                this.o = 0.0f;
            }
            boolean[] zArr = this.p;
            zArr[0] = f > 0.0f;
            zArr[1] = f2 > 0.0f;
            zArr[2] = f3 > 0.0f;
            zArr[3] = f4 > 0.0f;
        }
        return this;
    }

    public final q a(float f) {
        this.r = f;
        this.i.setStrokeWidth(f);
        return this;
    }

    public final q a(int i) {
        return a(ColorStateList.valueOf(i));
    }

    public final q a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateList, "valueOf(0)");
        }
        this.s = colorStateList;
        this.i.setColor(colorStateList.getColorForState(getState(), 0));
        return this;
    }

    public final q a(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = v;
        }
        if (this.t != scaleType) {
            this.t = scaleType;
            a();
        }
        return this;
    }

    private final boolean a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}
