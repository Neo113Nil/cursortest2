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
public class ij extends View {
    private final Paint a;
    private final Paint b;
    private final Paint c;
    private final qi d;
    private RectF e;
    private long f;
    private float g;
    private float h;
    private float i;
    private int j;
    private int k;
    private int l;

    public ij(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new Paint();
        this.c = new Paint();
        this.e = new RectF();
        this.f = 0L;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 230.0f;
        this.l = -2013265920;
        qi g = qi.g(context);
        this.d = g;
        this.k = g.b(28);
    }

    private void b() {
        this.a.setColor(-1);
        this.a.setAntiAlias(true);
        this.a.setStyle(Paint.Style.STROKE);
        this.a.setStrokeWidth(this.d.b(1));
        this.b.setColor(this.l);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setStrokeWidth(this.d.b(4));
    }

    public void a() {
        this.g = 0.0f;
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
        canvas.drawText(String.valueOf(this.j), (int) this.e.centerX(), (int) (this.e.centerY() - ((this.c.descent() + this.c.ascent()) / 2.0f)), this.c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int paddingLeft = this.k + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.k + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(paddingLeft, size);
        } else if (mode == 1073741824) {
            paddingLeft = size;
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingTop = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingTop = Math.min(paddingTop, size2);
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a(i, i2);
        b();
        invalidate();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f = SystemClock.uptimeMillis();
        }
    }

    public void setCircleColor(int i) {
        this.l = i;
    }

    public void setDigit(int i) {
        this.j = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.i = 360.0f / f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000b, code lost:
    
        if (r3 < 0.0f) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(float f) {
        float f2 = f <= 1.0f ? 0.0f : 1.0f;
        f = f2;
        float f3 = this.h;
        if (f == f3) {
            return;
        }
        if (this.g == f3) {
            this.f = SystemClock.uptimeMillis();
        }
        this.h = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    public void setSize(int i) {
        this.k = i;
    }

    private void a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.e = new RectF(getPaddingLeft() + this.d.b(1), paddingTop + this.d.b(1), (i - getPaddingRight()) - this.d.b(1), (i2 - paddingBottom) - this.d.b(1));
    }
}
