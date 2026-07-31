package com.my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class jj extends View {
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private final qi d;
    private RectF e;
    private long f;
    private float g;
    private float h;
    private float i;
    private boolean j;
    private int k;

    public jj(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.e = new RectF();
        this.f = 0L;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 230.0f;
        this.j = false;
        this.d = qi.g(context);
    }

    private void a() {
        this.a.setColor(-1);
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeWidth(this.d.b(1));
        this.b.setColor(-2013265920);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setStrokeWidth(this.d.b(4));
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.r, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.e, this.b);
        if (this.g != this.h) {
            this.g = Math.min(this.g + (((SystemClock.uptimeMillis() - this.f) / 1000.0f) * this.i), this.h);
            this.f = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        float f = this.g;
        if (isInEditMode()) {
            f = 360.0f;
        }
        canvas.drawArc(this.e, -90.0f, f, false, this.a);
        this.c.setColor(-1);
        this.c.setTextSize(this.d.b(12));
        this.c.setTextAlign(Paint.Align.CENTER);
        this.c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.k), (int) this.e.centerX(), (int) (this.e.centerY() - ((this.c.descent() + this.c.ascent()) / 2.0f)), this.c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int b = this.d.b(28) + getPaddingLeft() + getPaddingRight();
        int b2 = this.d.b(28) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            b = size;
        } else if (mode == Integer.MIN_VALUE) {
            b = Math.min(b, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            b2 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            b2 = Math.min(b2, size2);
        }
        setMeasuredDimension(b, b2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
        a();
        invalidate();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.k = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.i = 360.0f / f;
        }
    }

    public void setProgress(float f) {
        if (this.j) {
            this.g = 0.0f;
            this.j = false;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.h;
        if (f == f2) {
            return;
        }
        if (this.g == f2) {
            this.f = SystemClock.uptimeMillis();
        }
        this.h = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    private void a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.e = new RectF(getPaddingLeft() + this.d.b(1), paddingTop + this.d.b(1), (i - getPaddingRight()) - this.d.b(1), (i2 - paddingBottom) - this.d.b(1));
    }
}
