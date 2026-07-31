package com.my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class v5 extends View {
    private final Rect a;
    private final Paint b;
    private final ColorFilter c;
    private final float d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Bitmap i;
    private int j;
    private int k;

    public v5(Context context) {
        super(context);
        Paint paint = new Paint();
        this.b = paint;
        paint.setFilterBitmap(true);
        this.d = qi.a();
        this.e = qi.a(10, context);
        this.f = qi.a(10, context);
        this.g = qi.a(10, context);
        this.h = qi.a(10, context);
        this.a = new Rect();
        this.c = new LightingColorFilter(-3355444, 1);
    }

    public void a(int i, int i2) {
        this.e = i;
        this.h = i;
        this.f = i2;
        this.g = i2;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i != null) {
            Rect rect = this.a;
            rect.left = this.f;
            rect.top = this.e;
            rect.right = getMeasuredWidth() - this.g;
            this.a.bottom = getMeasuredHeight() - this.h;
            canvas.drawBitmap(this.i, (Rect) null, this.a, this.b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = size - (this.f + this.g);
        int i6 = size2 - (this.e + this.h);
        if (this.i == null || (i3 = this.j) <= 0 || (i4 = this.k) <= 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        float f = i3;
        float f2 = i4;
        float f3 = f / f2;
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode == 0 && mode2 == 0) {
            i5 = i3;
            i6 = i4;
        } else if (mode == 0) {
            i5 = (int) (i6 * f3);
        } else {
            float f4 = i5;
            if (mode2 != 0) {
                float f5 = f4 / f;
                float f6 = i6;
                if (Math.min(f5, f6 / f2) != f5 || f3 <= 0.0f) {
                    i5 = (int) (f6 * f3);
                }
            }
            i6 = (int) (f4 / f3);
        }
        setMeasuredDimension(i5 + this.f + this.g, i6 + this.e + this.h);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.b.setColorFilter(this.c);
            invalidate();
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
        } else if (motionEvent.getX() >= 0.0f && motionEvent.getX() <= getMeasuredWidth() && motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
            performClick();
        }
        this.b.setColorFilter(null);
        invalidate();
        return true;
    }

    public void setPadding(int i) {
        this.e = i;
        this.h = i;
        this.f = i;
        this.g = i;
    }

    public void a(Bitmap bitmap, boolean z) {
        this.i = bitmap;
        if (bitmap == null) {
            this.k = 0;
            this.j = 0;
        } else if (z) {
            float f = this.d > 1.0f ? 2.0f : 1.0f;
            this.k = (int) ((bitmap.getHeight() / f) * this.d);
            this.j = (int) ((this.i.getWidth() / f) * this.d);
        } else {
            this.j = bitmap.getWidth();
            this.k = this.i.getHeight();
        }
        requestLayout();
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.e = i2;
        this.h = i4;
        this.f = i;
        this.g = i3;
    }
}
