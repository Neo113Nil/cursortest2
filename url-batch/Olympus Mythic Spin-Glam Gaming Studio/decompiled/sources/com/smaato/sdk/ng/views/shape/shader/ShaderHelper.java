package com.smaato.sdk.ng.views.shape.shader;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.smaato.sdk.ng.R;

/* loaded from: classes14.dex */
public abstract class ShaderHelper {
    protected final Paint a;
    protected final Paint b;
    protected int d;
    protected int e;
    protected BitmapShader j;
    protected Drawable k;
    protected final Matrix c = new Matrix();
    protected int f = -16777216;
    protected int g = 0;
    protected float h = 1.0f;
    protected boolean i = false;

    public ShaderHelper() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setAntiAlias(true);
    }

    protected void a() {
        Bitmap calculateDrawableSizes = calculateDrawableSizes();
        if (calculateDrawableSizes == null || calculateDrawableSizes.getWidth() <= 0 || calculateDrawableSizes.getHeight() <= 0) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(calculateDrawableSizes, tileMode, tileMode);
        this.j = bitmapShader;
        this.b.setShader(bitmapShader);
    }

    protected Bitmap b() {
        Drawable drawable = this.k;
        if (drawable == null || !(drawable instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) drawable).getBitmap();
    }

    public abstract void calculate(int i, int i2, float f, float f2, float f3, float f4, float f5);

    public Bitmap calculateDrawableSizes() {
        float f;
        float round;
        Bitmap b = b();
        if (b != null) {
            int width = b.getWidth();
            int height = b.getHeight();
            if (width > 0 && height > 0) {
                float round2 = Math.round(this.d - (this.g * 2.0f));
                float round3 = Math.round(this.e - (this.g * 2.0f));
                float f2 = width;
                float f3 = height;
                float f4 = 0.0f;
                if (f2 * round3 > round2 * f3) {
                    f = round3 / f3;
                    round = 0.0f;
                    f4 = Math.round(((round2 / f) - f2) / 2.0f);
                } else {
                    float f5 = round2 / f2;
                    f = f5;
                    round = Math.round(((round3 / f5) - f3) / 2.0f);
                }
                this.c.setScale(f, f);
                this.c.preTranslate(f4, round);
                Matrix matrix = this.c;
                float f6 = this.g;
                matrix.postTranslate(f6, f6);
                calculate(width, height, round2, round3, f, f4, round);
                return b;
            }
        }
        reset();
        return null;
    }

    public abstract void draw(Canvas canvas, Paint paint, Paint paint2);

    public final float getBorderAlpha() {
        return this.h;
    }

    public final int getBorderColor() {
        return this.f;
    }

    public final int getBorderWidth() {
        return this.g;
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ShaderImageView, i, 0);
            this.f = obtainStyledAttributes.getColor(R.styleable.ShaderImageView_siBorderColor, this.f);
            this.g = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ShaderImageView_siBorderWidth, this.g);
            this.h = obtainStyledAttributes.getFloat(R.styleable.ShaderImageView_siBorderAlpha, this.h);
            this.i = obtainStyledAttributes.getBoolean(R.styleable.ShaderImageView_siSquare, this.i);
            obtainStyledAttributes.recycle();
        }
        this.a.setColor(this.f);
        this.a.setAlpha(Float.valueOf(this.h * 255.0f).intValue());
        this.a.setStrokeWidth(this.g);
    }

    public final boolean isSquare() {
        return this.i;
    }

    public boolean onDraw(Canvas canvas) {
        if (this.j == null) {
            a();
        }
        if (this.j == null || this.d <= 0 || this.e <= 0) {
            return false;
        }
        draw(canvas, this.b, this.a);
        return true;
    }

    public final void onImageDrawableReset(Drawable drawable) {
        this.k = drawable;
        this.j = null;
        this.b.setShader(null);
    }

    public void onSizeChanged(int i, int i2) {
        if (this.d == i && this.e == i2) {
            return;
        }
        this.d = i;
        this.e = i2;
        if (isSquare()) {
            int min = Math.min(i, i2);
            this.e = min;
            this.d = min;
        }
        if (this.j != null) {
            calculateDrawableSizes();
        }
    }

    public abstract void reset();

    public final void setBorderAlpha(float f) {
        this.h = f;
        Paint paint = this.a;
        if (paint != null) {
            paint.setAlpha(Float.valueOf(f * 255.0f).intValue());
        }
    }

    public final void setBorderColor(int i) {
        this.f = i;
        Paint paint = this.a;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public final void setBorderWidth(int i) {
        this.g = i;
        Paint paint = this.a;
        if (paint != null) {
            paint.setStrokeWidth(i);
        }
    }

    public final void setSquare(boolean z) {
        this.i = z;
    }
}
