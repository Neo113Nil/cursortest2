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
public class w5 extends View {
    private final Rect a;
    private final Paint b;
    private final ColorFilter c;
    private final float d;
    private final int e;
    private Bitmap f;
    private int g;
    private int h;

    public w5(Context context) {
        super(context);
        Paint paint = new Paint();
        this.b = paint;
        paint.setFilterBitmap(true);
        this.d = qi.a();
        this.e = qi.a(10, context);
        this.a = new Rect();
        this.c = new LightingColorFilter(-3355444, 1);
    }

    public void a(Bitmap bitmap, boolean z) {
        this.f = bitmap;
        if (bitmap == null) {
            this.h = 0;
            this.g = 0;
        } else if (z) {
            float f = this.d > 1.0f ? 2.0f : 1.0f;
            this.h = (int) ((bitmap.getHeight() / f) * this.d);
            this.g = (int) ((this.f.getWidth() / f) * this.d);
        } else {
            this.g = bitmap.getWidth();
            this.h = this.f.getHeight();
        }
        int i = this.g;
        int i2 = this.e * 2;
        setMeasuredDimension(i + i2, this.h + i2);
        requestLayout();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    public int getPadding() {
        return this.e;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            Rect rect = this.a;
            int i = this.e;
            rect.left = i;
            rect.top = i;
            rect.right = this.g + i;
            rect.bottom = this.h + i;
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
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
}
